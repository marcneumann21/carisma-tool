package carisma.check.euaiactdocumentation.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;
import org.junit.Test;

import carisma.check.euaiactdocumentation.check.EUAIActDocumentationCheck;
import carisma.check.euaiactdocumentation.generation.EUAIActDocumentationGenerator;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSection;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSectionResult;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * JUnit tests for the EU AI Act Documentation Check.
 *
 * @author Marc Neumann
 */
@SuppressWarnings("java:S5960")
public class EUAIActDocumentationTest {

	private String filepath = "resources/models/";
	private ResourceSet rs = new ResourceSetImpl();
	private Resource modelres = null;
	private Model model = null;

	/**
	 * loads the given UML test model
	 */
	public final void loadModel(final String testmodelname) throws IOException {
		File testmodelfile = new File(this.filepath + File.separator + testmodelname);
		assertTrue(testmodelfile.exists());
		this.modelres = this.rs.createResource(URI.createFileURI(testmodelfile.getAbsolutePath()));
		this.modelres.load(Collections.EMPTY_MAP);
		this.model = (Model) this.modelres.getContents().get(0);
	}

	/**
	 * returns the AI system of the model
	 */
	private Component getAISystem() {
		Set<Component> aiSystems = EUAIActComplianceUtil.getStereotypedElements(model, Component.class,
				EUAIActCompliance.AISystem);
		return aiSystems.iterator().next();
	}

	/**
	 * generates the documentation of the AI system of the model
	 *
	 */
	private List<EUAIActDocumentationSectionResult> generate(boolean highRisk) {
		EUAIActDocumentationGenerator generator = new EUAIActDocumentationGenerator(getAISystem(), highRisk);
		return generator.generateDocumentation();
	}

	/*
	 * gets the section with the given section name.
	 */
	private EUAIActDocumentationSectionResult getSection(List<EUAIActDocumentationSectionResult> sections,
			EUAIActDocumentationSection sectionName) {
		for (EUAIActDocumentationSectionResult section : sections) {
			if (section.sectionName() == sectionName) {
				return section;
			}
		}
		return null;
	}

	/*
	 * checks if any message contains the given legal reference
	 */
	private boolean containsReference(List<String> messages, String reference) {
		for (String message : messages) {
			if (message.contains(reference)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * test if all sections of high risk AI system documentation are generated
	 */
	@Test
	public void testHighRiskAllSections() throws IOException {
		loadModel("highrisk_complete.uml");
		List<EUAIActDocumentationSectionResult> sections = generate(true);
		EUAIActDocumentationSection[] expectedSections = EUAIActDocumentationSection.values();
		assertEquals(expectedSections.length, sections.size());
		for (int i = 0; i < sections.size(); i++) {
			assertEquals(expectedSections[i], sections.get(i).sectionName());
		}
		this.modelres.unload();
	}

	/*
	 * test for complete high risk AI system documentation
	 */
	@Test
	public void testHighRiskComplete() throws IOException {
		loadModel("highrisk_complete.uml");
		List<EUAIActDocumentationSectionResult> sections = generate(true);
		for (EUAIActDocumentationSectionResult section : sections) {
			assertTrue(section.sectionName() + ": " + section.missingDocumentation(),
					section.missingDocumentation().isEmpty());
		}
		EUAIActDocumentationCheck check = new EUAIActDocumentationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for high risk AI system documentation without attributes
	 */
	@Test
	public void testHighRiskIncomplete() throws IOException {
		loadModel("highrisk_incomplete.uml");
		List<EUAIActDocumentationSectionResult> sections = generate(true);
		EUAIActDocumentationSectionResult general = getSection(sections,
				EUAIActDocumentationSection.GeneralDescriptionAISystem);
		EUAIActDocumentationSectionResult riskManagement = getSection(sections,
				EUAIActDocumentationSection.DescriptionRiskManagement);
		assertTrue(containsReference(general.missingDocumentation(), "Annex IV(1)(g)"));
		assertTrue(containsReference(riskManagement.missingDocumentation(), "Article 9(2)"));
		EUAIActDocumentationCheck check = new EUAIActDocumentationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertFalse(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for limited risk AI system documentation
	 */
	@Test
	public void testLimited() throws IOException {
		loadModel("limitedrisk.uml");
		List<EUAIActDocumentationSectionResult> sections = generate(false);
		for (EUAIActDocumentationSectionResult section : sections) {
			assertTrue(section.missingDocumentation().isEmpty());
		}
		EUAIActDocumentationCheck check = new EUAIActDocumentationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for unacceptable risk AI system documentation
	 */
	@Test
	public void testUnacceptable() throws IOException {
		loadModel("unacceptablerisk.uml");
		EUAIActDocumentationCheck check = new EUAIActDocumentationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for minimal risk AI system documentation
	 */
	@Test
	public void testMinimal() throws IOException {
		loadModel("minimalrisk.uml");
		EUAIActDocumentationCheck check = new EUAIActDocumentationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

}