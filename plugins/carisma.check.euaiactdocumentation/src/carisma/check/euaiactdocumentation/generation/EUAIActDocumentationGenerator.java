package carisma.check.euaiactdocumentation.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UseCase;

import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSection;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSectionResult;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActDocumentationGenerator {

	private final Component aiSystem;
	private final List<EUAIActDocumentationSectionResult> sections = new ArrayList<>();

	public EUAIActDocumentationGenerator(Component aiSystem) {
		this.aiSystem = aiSystem;
	}

	// TODO JavaDoc
	public List<EUAIActDocumentationSectionResult> generate() {
		this.sections.add(generateGeneralDescriptionAISystem());
		this.sections.add(generateDetailedDescriptionAISystem());
		this.sections.add(generateDetailedInformationAISystem());
		this.sections.add(generateDescriptionPerformanceMetrics());
		this.sections.add(generateDescriptionRiskManagement());
		this.sections.add(generateDescriptionProviderRelevantChanges());
		this.sections.add(generateListHarmonisedStandards());
		this.sections.add(generateCopyEUConformityDeclaration());
		this.sections.add(generateDescriptionAISystemPostMarketPhase());
		return this.sections;
	}

	// TODO JavaDoc
	private EUAIActDocumentationSectionResult generateGeneralDescriptionAISystem() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();

		// Annex IV(1)(a) purpose
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem, "Purpose",
				"Purpose", "Annex IV(1)(a)");
		// Annex IV(1)(a) provider
		String provider = EUAIActComplianceUtil.getAssociationActorEnd(this.aiSystem, EUAIActCompliance.Provides,
				EUAIActCompliance.Provider);
		if (provider == null || provider.isBlank()) {
			missingDocumentation
					.add("'Provider': no provider is linked to the AI system (Article 3(3), Annex IV(1)(a)).");
		} else {
			foundDocumentation.add("'Provider': " + provider);
		}
		// Annex IV(1)(a) version
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem, "Version",
				"Version", "Annex IV(1)(a)");
		// Annex IV(1)(b) external interaction
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"ExternalInteraction", "Interaction with external systems", "Annex IV(1)(b)"); // Annex IV(1)(b)
																								// external interaction
		// Annex IV(1)(c) update requirements
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"UpdateRequirements", "Update requirements", "Annex IV(1)(c)");
		// Annex IV(1)(d) market placement form
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"MarketPlacementform", "Form of placing on the market", "Annex IV(1)(d)");
		// Annex IV(1)(e) hardware
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem, "Hardware",
				"Hardware", "Annex IV(1)(e)");
		// Annex IV(1)(f) visual documentation
		documentBoolean(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"VisualDocumentation", "Photographs or illustrations", "Annex IV(1)(f)");
		// Annex IV(1)(g) ui
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"UserInterface", "User interface", "Annex IV(1)(g)");
		// Annex IV(1)(h) instructions for use
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Instructions", "Instructions for use", "Annex IV(1)(h)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.GeneralDescriptionAISystem,
				foundDocumentation, missingDocumentation);

		// Annex IV(1)(a) intended purpose
//		if (this.aiSystem.getUseCases().isEmpty()) {
//			missingDocumentation
//					.add("'Purpose: no use case is assigned to this AI system, please add one AnnexIV(1)(a).'");
//		} else {
//			List<String> purposes = new ArrayList<>();
//			for (UseCase uc : this.aiSystem.getUseCases()) {
//				purposes.add(uc.getName());
//			}
//			foundDocumentation.add("'Purpose': " + String.join(", ", purposes));
//		}
	}

	private EUAIActDocumentationSectionResult generateDetailedDescriptionAISystem() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();

		// Annex IV(2)(a) developement process
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DevelopmentProcess", "Development process", "Annex IV(2)(a)");

		// Annex IV(2)(a) third party tools
		Set<Component> thirdPartyComponents = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.ThirdPartyComponent);
		if (thirdPartyComponents.isEmpty()) {
			foundDocumentation.add(
					"'Third party components': None is modelled. If the AI system integrates any third party tools, components or data, model them accordingly and connect them to the AI system (Annex IV(2)(a)).");
		}
		for (Component thirdParty : thirdPartyComponents) {
			documentString(foundDocumentation, missingDocumentation, thirdParty, EUAIActCompliance.ThirdPartyComponent,
					"Origin", "Origin of '" + thirdParty.getName() + "'", "Annex IV(2)(a)");
			documentString(foundDocumentation, missingDocumentation, thirdParty, EUAIActCompliance.ThirdPartyComponent,
					"IntegrationDescription", "Integration of '" + thirdParty.getName() + "'", "Annex IV(2)(a)");
		}
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignSpecification", "Design specification", "Annex IV(2)(b)");
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignDecisions", "Key design decisions", "Annex IV(2)(b)");
		documentString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignTradeOffs", "Design trade-offs", "Annex IV(2)(b)");
		// Annex IV(2)(b) ml models
		Set<Component> mlModels = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.MLModel);
		if (mlModels.isEmpty()) {
			missingDocumentation.add(
					"'ML Model': no ML Model is contained in the AI system or connected to it by a dependency (Annex IV(2)(b)).");
		}
		for (Component mlModel : mlModels) {
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Objective", "Objective of '" + mlModel.getName() + "'", "Annex IV(2)(b)");
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"ExpectedOutput", "Expected output of '" + mlModel.getName() + "'",
					"Annex IV(2)(b)");
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Parameter", "Parameters of '" + mlModel.getName() + "'", "Annex IV(2)(b)");
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TrainingMethods", "Training methods of '" + mlModel.getName() + "'",
					"Annex IV(2)(c)");
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"ValidationProcess", "Validation of '" + mlModel.getName() + "'",
					"Annex IV(2)(g)");
			documentString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TestingProcess", "Testing of '" + mlModel.getName() + "'", "Annex IV(2)(g)");
			documentBoolean(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TestReports", "Test reports of '" + mlModel.getName() + "'",
					"Annex IV(2)(g)");
		}
		
		
		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DetailedDescriptionAISystem,
				foundDocumentation, missingDocumentation); 
	}
	// ... uncha }

	private EUAIActDocumentationSectionResult generateDetailedInformationAISystem() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateDescriptionPerformanceMetrics() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateDescriptionRiskManagement() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateDescriptionProviderRelevantChanges() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateListHarmonisedStandards() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateCopyEUConformityDeclaration() {
		// TODO Auto-generated method stub
		return null;
	}

	private EUAIActDocumentationSectionResult generateDescriptionAISystemPostMarketPhase() {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO JavaDoc
	private void documentString(List<String> found, List<String> missing, Element element, EUAIActCompliance stereotype,
			String tag, String label, String reference) {
		String value = EUAIActComplianceUtil.getStringValue(element, stereotype, tag);
		if (value == null || value.isBlank()) {
			missing.add("'" + label + "': not specified in the model (" + reference + ").");
		} else {
			found.add("'" + label + "': " + value);
		}
	}

	// TODO JavaDoc
	private void documentBoolean(List<String> found, List<String> missing, Element element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		if (EUAIActComplianceUtil.isTaggedValueTrue(element, stereotype, tag)) {
			found.add("'" + label + "': confirmed to be part of the technical documentation.");
		} else {
			missing.add("'" + label + "': not confirmed in the model (" + reference + ").");
		}
	}

}
