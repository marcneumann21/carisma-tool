package carisma.check.euaiactriskclassification.tests;

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

import carisma.check.euaiactriskclassification.check.EUAIActRiskClassificationCheck;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassificationResult;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassifier;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * JUnit tests for the EU AI Act risk classification.
 *
 * @author Marc Neumann
 */
@SuppressWarnings("java:S5960")
public class EUAIActRiskClassificationTest {

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
	 * test for unacceptable risk AI system with all prohibited practices of Art.
	 * 5(1)(a) to 5(1)(f)
	 */
	@Test
	public void testUnacceptableRisk() throws IOException {
		loadModel("unacceptablerisk.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.Unacceptable, result.riskClass());
		assertTrue(containsReference(result.reasons(), "Article 5(1)(a)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(b)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(c)"));
		assertTrue(containsReference(result.reasons(), "not specified"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(d)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(e)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(f)"));
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertFalse(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for high risk AI system with only safety component and test if all high
	 * risk obligations are generated
	 */
	@Test
	public void testHighRisk() throws IOException {
		loadModel("highrisk.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.High, result.riskClass());
		assertFalse(result.annexISectionB());
		assertTrue(containsReference(result.reasons(), "Article 6(1)"));
		assertTrue(containsReference(result.obligations(), "Article 4"));
		assertTrue(containsReference(result.obligations(), "Article 9"));
		assertTrue(containsReference(result.obligations(), "Article 10"));
		assertTrue(containsReference(result.obligations(), "Article 11"));
		assertTrue(containsReference(result.obligations(), "Article 12"));
		assertTrue(containsReference(result.obligations(), "Article 13"));
		assertTrue(containsReference(result.obligations(), "Article 14"));
		assertTrue(containsReference(result.obligations(), "Article 15"));
		assertTrue(containsReference(result.obligations(), "Article 17"));
		assertTrue(containsReference(result.obligations(), "Article 18"));
		assertTrue(containsReference(result.obligations(), "Article 19"));
		System.out.print(result.reasons());
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for high risk AI system with all Annex III areas
	 */
	@Test
	public void testHighAnnexIII() throws IOException {
		loadModel("highrisk_annexiii.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.High, result.riskClass());
		assertTrue(containsReference(result.reasons(), "Article 5(1)(d)"));
		assertTrue(containsReference(result.reasons(), "Annex III(6)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(f)"));
		assertTrue(containsReference(result.reasons(), "Annex III(1)(c)"));
		assertTrue(containsReference(result.reasons(), "Annex III(2)"));
		assertTrue(containsReference(result.notes(), "Set at least one area of application under 'Education'"));
		assertTrue(containsReference(result.reasons(), "Article 6(2), Article 6(3)"));
		assertTrue(containsReference(result.notes(), "because 'Profiling' is applied"));
		assertTrue(containsReference(result.additionalObligations(), "Article 49(5)"));
		assertTrue(containsReference(result.additionalObligations(), "Article 49(1)"));
		assertFalse(containsReference(result.additionalObligations(), "Article 49(2)"));
		assertTrue(containsReference(result.reasons(), "Article 5(1)(g)"));
		assertTrue(containsReference(result.reasons(), "Annex III(1)(b)"));
		assertTrue(containsReference(result.reasons(), "Annex III(5)"));
		assertTrue(containsReference(result.notes(), "'FraudDetectionOnly' has no effect"));
		assertTrue(containsReference(result.reasons(), "Annex III(7)"));
		assertTrue(containsReference(result.notes(), "'TravelDocumentVerificationOnly' has no effect"));
		assertTrue(containsReference(result.reasons(), "Annex III(8)"));
		assertTrue(containsReference(result.notes(), "'NoDirectExposure' has no effect"));
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for limited risk AI system with transparency obligations of Art. 50(1)
	 * and 50(2) and their exceptions (obvious AI interaction, standard editing
	 * only)
	 */
	@Test
	public void testLimitedRisk() throws IOException {
		loadModel("limitedrisk.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.Limited, result.riskClass());
		assertTrue(containsReference(result.additionalObligations(), "Article 50(1)"));
		assertTrue(containsReference(result.additionalObligations(), "Article 50(2)"));
		assertTrue(containsReference(result.reasons(), "it is obvious from the circumstances"));
		assertTrue(containsReference(result.reasons(), "assistive function for standard editing"));
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for minimal risk AI system
	 */
	@Test
	public void testMinimalRisk() throws IOException {
		loadModel("minimalrisk.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.Minimal, result.riskClass());
		assertTrue(result.additionalObligations().isEmpty());
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * test for undetermined risk AI system
	 */
	@Test
	public void testUndetermined() throws IOException {
		loadModel("undetermined.uml");
		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(getAISystem());
		EUAIActRiskClassificationResult result = classifier.classify();
		assertEquals(EUAIActRiskClass.Undetermined, result.riskClass());
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertTrue(check.perform(null, analysisHost));
		this.modelres.unload();
	}

	/*
	 * tests for model without any AI system
	 */
	@Test
	public void testNoAISystem() throws IOException {
		loadModel("noaisystem.uml");
		Set<Component> aiSystems = EUAIActComplianceUtil.getStereotypedElements(model, Component.class,
				EUAIActCompliance.AISystem);
		assertEquals(0, aiSystems.size());
		EUAIActRiskClassificationCheck check = new EUAIActRiskClassificationCheck();
		TestHost analysisHost = new TestHost(this.modelres);
		assertFalse(check.perform(null, analysisHost));
		this.modelres.unload();
	}
}