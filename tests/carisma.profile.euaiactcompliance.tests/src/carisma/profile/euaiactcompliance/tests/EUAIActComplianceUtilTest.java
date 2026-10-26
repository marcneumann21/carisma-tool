package carisma.profile.euaiactcompliance.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.junit.Test;

import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * JUnit tests for the EU AI Act Compliance Util Class.
 *
 * @author Marc Neumann
 */
@SuppressWarnings("java:S5960")
public class EUAIActComplianceUtilTest {

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
	 * returns the element with the given name, type and stereotype from the loaded
	 * model
	 */
	private <T extends NamedElement> T getElement(final String name, final Class<T> type,
			final EUAIActCompliance stereo) {
		for (T element : EUAIActComplianceUtil.getStereotypedElements(this.model, type, stereo)) {
			if (name.equals(element.getName())) {
				return element;
			}
		}
		return null;
	}

	/*
	 * test for hasStereotype function with a specific stereotype and an element
	 * without stereotype
	 */
	@Test
	public void testHasStereotype() throws IOException {
		loadModel("taggedvalues.uml");
		Component full = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component plain = (Component) this.model.getPackagedElement("NoSystem");

		assertTrue(EUAIActComplianceUtil.hasStereotype(full, EUAIActCompliance.AISystem));
		assertFalse(EUAIActComplianceUtil.hasStereotype(full, EUAIActCompliance.SelfDevelopedModel));
		assertFalse(EUAIActComplianceUtil.hasStereotype(plain, EUAIActCompliance.AISystem));
		assertTrue(EUAIActComplianceUtil.hasStereotype(full, null));
		assertFalse(EUAIActComplianceUtil.hasStereotype(plain, null));
	}

	/*
	 * test for getStereotypedElements function on the whole model and with the AI
	 * system itself as start element
	 */
	@Test
	public void testGetStereotypedElements() throws IOException {
		loadModel("taggedvalues.uml");
		Set<Component> systems = EUAIActComplianceUtil.getStereotypedElements(this.model, Component.class,
				EUAIActCompliance.AISystem);
		assertEquals(2, systems.size());

		Component full = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		assertTrue(EUAIActComplianceUtil.getStereotypedElements(full, Component.class, EUAIActCompliance.AISystem)
				.contains(full));
	}

	/*
	 * test for isTaggedValueTrue function with true, false, unset and unknown
	 * attribute
	 */
	@Test
	public void testBooleanTags() throws IOException {
		loadModel("taggedvalues.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);

		assertTrue(EUAIActComplianceUtil.isTaggedValueTrue(fullSystem, EUAIActCompliance.AISystem,
				"CopyEUConformityDeclaration"));
		assertFalse(
				EUAIActComplianceUtil.isTaggedValueTrue(fullSystem, EUAIActCompliance.AISystem, "VisualDocumentation"));
		assertFalse(EUAIActComplianceUtil.isTaggedValueTrue(null, EUAIActCompliance.AISystem,
				"CopyEUConformityDeclaration"));
		assertFalse(EUAIActComplianceUtil.isTaggedValueTrue(fullSystem, EUAIActCompliance.AISystem, ""));

		String[] tags = new String[] { "CopyEUConformityDeclaration", "VisualDocumentation" };
		assertTrue(EUAIActComplianceUtil.isAnyTaggedValueTrue(fullSystem, EUAIActCompliance.AISystem, tags));
		assertFalse(EUAIActComplianceUtil.isAnyTaggedValueTrue(emptySystem, EUAIActCompliance.AISystem, tags));

		assertEquals(1, EUAIActComplianceUtil.getTrueTags(fullSystem, EUAIActCompliance.AISystem, tags).size());
		assertTrue(EUAIActComplianceUtil.getTrueTags(fullSystem, EUAIActCompliance.AISystem, tags)
				.contains("CopyEUConformityDeclaration"));
		assertTrue(EUAIActComplianceUtil.getTrueTags(emptySystem, EUAIActCompliance.AISystem, tags).isEmpty());
	}

	/*
	 * test for getEnumValue and getEnumValues functions with a single and a
	 * multi-valued enumeration attribute, set and unset
	 */
	@Test
	public void testEnumTags() throws IOException {
		loadModel("taggedvalues.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);

		assertEquals("Toy",
				EUAIActComplianceUtil.getEnumValue(fullSystem, EUAIActCompliance.ProductEmbedding, "ProductCategory"));
		assertTrue(EUAIActComplianceUtil.getEnumValue(emptySystem, EUAIActCompliance.ProductEmbedding,
				"ProductCategory") == null);

		assertEquals(2, EUAIActComplianceUtil
				.getEnumValues(fullSystem, EUAIActCompliance.ProductEmbedding, "ProductCategory").size());
		assertTrue(EUAIActComplianceUtil.getEnumValues(emptySystem, EUAIActCompliance.AISystem, "ProductCategory")
				.isEmpty());
	}

	/*
	 * test for getStringValue function with a set and an unset string attribute and
	 * an element without stereotype
	 */
	@Test
	public void testStringTags() throws IOException {
		loadModel("taggedvalues.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);
		Component noSystem = (Component) this.model.getPackagedElement("NoSystem");

		assertEquals("test",
				EUAIActComplianceUtil.getStringValue(fullSystem, EUAIActCompliance.AISystem, "ProviderName"));
		assertTrue(
				EUAIActComplianceUtil.getStringValue(emptySystem, EUAIActCompliance.AISystem, "ProviderName") == null);
		assertTrue(EUAIActComplianceUtil.getStringValue(noSystem, EUAIActCompliance.AISystem, "ProviderName") == null);
	}

	/*
	 * test for getConnectedElements function with connected elements via
	 * containment, dependency and manifestation and an AI system without any
	 * connections
	 */
	@Test
	public void testGetConnectedElements() throws IOException {
		loadModel("structure.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);

		Set<Component> models = EUAIActComplianceUtil.getConnectedElements(fullSystem, Component.class,
				EUAIActCompliance.SelfDevelopedModel);
		assertEquals(1, models.size());
		assertTrue(models.contains(getElement("Model", Component.class, EUAIActCompliance.SelfDevelopedModel)));

		Set<Component> thirdPartyComponents = EUAIActComplianceUtil.getConnectedElements(fullSystem, Component.class,
				EUAIActCompliance.ThirdPartyComponent);
		assertEquals(1, thirdPartyComponents.size());

		Set<Artifact> trainingData = EUAIActComplianceUtil.getConnectedElements(fullSystem, Artifact.class,
				EUAIActCompliance.TrainingData);
		assertEquals(1, trainingData.size());

		assertTrue(EUAIActComplianceUtil
				.getConnectedElements(emptySystem, Component.class, EUAIActCompliance.SelfDevelopedModel).isEmpty());
		assertTrue(EUAIActComplianceUtil
				.getConnectedElements(emptySystem, Component.class, EUAIActCompliance.ThirdPartyComponent).isEmpty());
		assertTrue(EUAIActComplianceUtil
				.getConnectedElements(emptySystem, Artifact.class, EUAIActCompliance.TrainingData).isEmpty());
	}

	/*
	 * test for getNestedComponents and getDependencyComponents functions with an AI
	 * system with and without nested and dependent components
	 */
	@Test
	public void testGetNestedAndDependencyComponents() throws IOException {
		loadModel("structure.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);

		assertEquals(2, EUAIActComplianceUtil.getNestedComponents(fullSystem).size());
		assertTrue(EUAIActComplianceUtil.getNestedComponents(emptySystem).isEmpty());

		Set<Component> dependencies = EUAIActComplianceUtil.getDependencyComponents(fullSystem);
		assertEquals(1, dependencies.size());
		assertTrue(dependencies
				.contains(getElement("ThirdPartyComponent", Component.class, EUAIActCompliance.ThirdPartyComponent)));
		assertTrue(EUAIActComplianceUtil.getDependencyComponents(emptySystem).isEmpty());
	}

	/*
	 * test for getUseCasePurposes function with use cases with and without EU AI
	 * Act stereotype and an AI system without use cases
	 */
	@Test
	public void testGetUseCasePurposes() throws IOException {
		loadModel("UseCases.uml");
		Component fullSystem = getElement("FullSystem", Component.class, EUAIActCompliance.AISystem);
		Component emptySystem = getElement("EmptySystem", Component.class, EUAIActCompliance.AISystem);

		List<String> purposes = EUAIActComplianceUtil.getUseCasePurposes(fullSystem);
		assertEquals(2, purposes.size());
		System.out.println(Arrays.toString(purposes.toArray()));

		assertTrue(purposes.contains("'EssentialServiceUseCase' (EssentialService)"));
		assertTrue(purposes.contains("'Plain'"));
		assertTrue(EUAIActComplianceUtil.getUseCasePurposes(emptySystem).isEmpty());
	}
}