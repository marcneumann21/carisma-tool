package carisma.check.euaiactdocumentation.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.NamedElement;

import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSection;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSectionResult;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActDocumentationGenerator {

	private final Component aiSystem;
	private final boolean highRisk;

	public EUAIActDocumentationGenerator(Component aiSystem, boolean highRisk) {
		this.aiSystem = aiSystem;
		this.highRisk = highRisk;
	}

	// TODO JavaDoc
	public List<EUAIActDocumentationSectionResult> generateDocumentation() {
		final List<EUAIActDocumentationSectionResult> sections = new ArrayList<>();
		sections.add(generateGeneralDescriptionAISystem());
		sections.add(generateDetailedDescriptionAISystem());
		sections.add(generateDetailedInformationAISystem());
		sections.add(generateDescriptionPerformanceMetrics());
		sections.add(generateDescriptionRiskManagement());
		sections.add(generateDescriptionProviderRelevantChanges());
		sections.add(generateListHarmonisedStandards());
		sections.add(generateCopyEUConformityDeclaration());
		sections.add(generateDescriptionAISystemPostMarketPhase());
		return sections;
	}

	// TODO JavaDoc
	private EUAIActDocumentationSectionResult generateGeneralDescriptionAISystem() {
		String aiSystemName = this.aiSystem.getName();
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		// Annex IV(1)(a) purpose
		List<String> purposes = EUAIActComplianceUtil.getUseCasePurposes(this.aiSystem);
		if (EUAIActComplianceUtil.hasStereotype(this.aiSystem, EUAIActCompliance.ProductEmbedding)) {
			String role = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding, "Role");
			List<String> productCategories = EUAIActComplianceUtil.getEnumValues(this.aiSystem,
					EUAIActCompliance.ProductEmbedding, "ProductCategory");
			if (productCategories.isEmpty()) {
				if (this.highRisk) {
					addToMissingDocumentation(missingDocumentation, aiSystemName, "Purpose",
							"No product category is specified for the AI system. Set 'ProductCategory' under 'ProductEmbedding'.",
							"Annex IV(1)(a), Article 6(1)");
				} else {
					addToNotes(notes, aiSystemName, "Purpose",
							"No product category is specified for the AI system. Set 'ProductCategory' under 'ProductEmbedding'.",
							"Annex IV(1)(a), Article 6(1)");
				}
			} else {
				if ("ProductItself".equalsIgnoreCase(role)) {
					purposes.add("The AI system is itself a product of the category "
							+ String.join(", ", productCategories) + " of Annex I.");
				} else if ("Component".equalsIgnoreCase(role)) {
					purposes.add("The AI system is a component of a product of the category "
							+ String.join(", ", productCategories) + " of Annex I.");
				} else {
					addToNotes(notes, aiSystemName, "Purpose",
							"It is not specified whether the AI system is a component of a product or the product itself. Set 'Role' under 'ProductEmbedding'.",
							"Annex IV(1)(a)");
				}
			}
		}
		if (purposes.isEmpty()) {
			addToNotes(notes, aiSystemName, "Purpose",
					"No use case is assigned to the AI system. Assign at least one use case to the AI system.",
					"Annex IV(1)(a), Article 3(12)");
		} else {
			addToFoundDocumentation(foundDocumentation, aiSystemName, "Purpose", String.join(", ", purposes),
					"Annex IV(1)(a)");
		}

		/*
		 * // Annex IV(1)(a) provider String provider =
		 * EUAIActComplianceUtil.getAssociationActorEnd(this.aiSystem,
		 * EUAIActCompliance.Provides, EUAIActCompliance.Provider); if (provider == null
		 * || provider.isBlank()) { if (this.highRisk) {
		 * addToMissingDocumentation(missingDocumentation, "Provider",
		 * "Not specified. Add a provider and connect it to the AI system.",
		 * "Article 3(3), Annex IV(1)(a)"); } else { addToNotes(notes, "Provider",
		 * "Not specified. Add a provider and connect it to the AI system.",
		 * "Article 3(3), Annex IV(1)(a)"); } } else {
		 * addToFoundDocumentation(foundDocumentation, "Provider", provider,
		 * "Article 3(3), Annex IV(1)(a)"); }
		 */

		// Annex IV(1)(a) provider name
		String providerName = EUAIActComplianceUtil.getStringValue(this.aiSystem, EUAIActCompliance.AISystem,
				"ProviderName");
		if (providerName == null || providerName.isBlank()) {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, aiSystemName, "Provider name",
						"Not specified. Add a provider name to the AI system.", "Article 3(3), Annex IV(1)(a)");
			} else {
				addToNotes(notes, aiSystemName, "Provider name", "Not specified. Add a provider name to the AI system.",
						"Article 3(3), Annex IV(1)(a)");
			}
		} else {
			addToFoundDocumentation(foundDocumentation, aiSystemName, "Provider name", providerName,
					"Article 3(3), Annex IV(1)(a)");
		}

		// Annex IV(1)(a) provider contact
		String providerContact = EUAIActComplianceUtil.getStringValue(this.aiSystem, EUAIActCompliance.AISystem,
				"ProviderContact");
		if (providerContact == null || providerContact.isBlank()) {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, aiSystemName, "Provider contact",
						"Not specified. Add a provider contact to the AI system.", "Article 3(3), Annex IV(1)(a)");
			} else {
				addToNotes(notes, aiSystemName, "Provider contact",
						"Not specified. Add a provider contact to the AI system.", "Article 3(3), Annex IV(1)(a)");
			}
		} else {
			addToFoundDocumentation(foundDocumentation, aiSystemName, "Provider contact", providerContact,
					"Article 3(3), Annex IV(1)(a)");
		}

		// Annex IV(1)(a) version
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Version", "Version", "Annex IV(1)(a)");

		// Annex IV(1)(b) external interaction
		documentConditionalString(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"ExternalInteraction", "Interaction with external systems", "Annex IV(1)(b)");

		// Annex IV(1)(c) update requirements
		documentConditionalString(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"UpdateRequirements", "Update requirements", "Annex IV(1)(c)");

		// Annex IV(1)(d) market placement form
		// EmbeddedInHardware, Download, API
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"MarketPlacementForm", "Form of placing on the market", "Annex IV(1)(d)");

		// Annex IV(1)(e) hardware
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"HardwareDescription", "Description of the hardware", "Annex IV(1)(e)");

		// Annex IV(1)(f) visual documentation
		if (EUAIActComplianceUtil.hasStereotype(this.aiSystem, EUAIActCompliance.ProductEmbedding)) {
			documentMandatoryBoolean(foundDocumentation, missingDocumentation, this.aiSystem,
					EUAIActCompliance.AISystem, "VisualDocumentation",
					"Photographs or illustrations (visual documentation)", "Annex IV(1)(f)");
		}
		// TODO Annex I product
		else if (this.highRisk) {
			addToNotes(notes, aiSystemName, "Photographs or illustrations (visual documentation)",
					"Not applicable, because the AI system is not embedded in a product covered by Annex I.",
					"Annex IV(1)(f)");
		}

		// Annex IV(1)(g) ui
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"UserInterfaceDescription", "Basic description of the user-interface", "Annex IV(1)(g)");

		// Annex IV(1)(h) instructions for use
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"InstructionsForUse", "Instructions for use for the deployer", "Annex IV(1)(h)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.GeneralDescriptionAISystem,
				foundDocumentation, missingDocumentation, notes);

	}

	// TODO JavaDoc
	private EUAIActDocumentationSectionResult generateDetailedDescriptionAISystem() {
		String aiSystemName = this.aiSystem.getName();
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		// Annex IV(2)(a) developement process
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DevelopmentSteps", "The methods and steps performed for the development", "Annex IV(2)(a)");

		// Annex IV(2)(a) third party tools
		Set<Component> thirdPartyComponents = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.ThirdPartyComponent);
		if (thirdPartyComponents.isEmpty()) {
			addToNotes(notes, aiSystemName, "Third party components",
					"Neither contained in nor connected to the AI system. If the AI system integrates third party tools, add them to the UML model.",
					"Annex IV(2)(a)");
		}
		for (Component thirdParty : thirdPartyComponents) {
			documentMandatoryString(foundDocumentation, missingDocumentation, thirdParty,
					EUAIActCompliance.ThirdPartyComponent, "Origin", "Origin", "Annex IV(2)(a)");
			documentMandatoryString(foundDocumentation, missingDocumentation, thirdParty,
					EUAIActCompliance.ThirdPartyComponent, "IntegrationDescription", "Integration", "Annex IV(2)(a)");
		}

		// Annex IV(2)(b) design specification, key design choices, design trade-offs
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignSpecification", "Design specification", "Annex IV(2)(b)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"KeyDesignDecision", "Key design decisions", "Annex IV(2)(b)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"AffectedPersons",
				"Persons or groups of persons on whom the AI system is intended to be used or who are affected by it",
				"Annex IV(2)(b)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignTradeOffs", "Design trade-offs", "Annex IV(2)(b)");

		// Annex IV(2)(b) ml models
		Set<Component> selfDevelopedModels = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.SelfDevelopedModel);
		if (selfDevelopedModels.isEmpty()) {
			addToNotes(notes, aiSystemName, "ML model",
					"Neither contained in nor connected to the AI system. If the AI system is based on machine learning, add it to the UML model.",
					"Annex IV(2)(b)");
		}
		for (Component mlModel : selfDevelopedModels) {
			String mlModelName = mlModel.getName();
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "Objective", "Objective", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "ExpectedOutput", "Expected output", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "Parameter", "Parameters", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "TrainingMethods", "Training methods", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "ValidationProcess", "Validation", "Annex IV(2)(g)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "TestingProcess", "Testing", "Annex IV(2)(g)");
			documentMandatoryBoolean(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "TestReports", "Test reports", "Annex IV(2)(g)");

			Set<Artifact> modelTrainingData = EUAIActComplianceUtil.getConnectedElements(mlModel, Artifact.class,
					EUAIActCompliance.TrainingData);
			if (modelTrainingData.isEmpty()) {
				addToNotes(notes, mlModelName, "Training data",
						"No training data is connected to the model. If the model is trained with data, connect the training data to the model, e.g. via a <<use>> dependency.",
						"Annex IV(2)(d)");
			} else {
				List<String> dataNames = new ArrayList<>();
				for (Artifact data : modelTrainingData) {
					dataNames.add("'" + data.getName() + "'");
				}
				addToFoundDocumentation(foundDocumentation, mlModelName, "Training data",
						"Trained with " + String.join(", ", dataNames) + ".", "Annex IV(2)(d)");
			}
		}

		// Annex IV(2)(c) system architecture
		Set<Component> nestedComponents = EUAIActComplianceUtil.getNestedComponents(this.aiSystem);
		Set<Component> dependencyComponents = EUAIActComplianceUtil.getDependencyComponents(this.aiSystem);
		if (nestedComponents.isEmpty() && dependencyComponents.isEmpty()) {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, aiSystemName, "System architecture",
						"The AI system has neither parts, nor dependencies in the model. Model the software components and their interactions.",
						"Annex IV(2)(c)");
			} else {
				addToNotes(notes, aiSystemName, "System architecture",
						"The AI system has neither parts, nor dependencies in the model. Model the software components and their interactions.",
						"Annex IV(2)(c)");
			}
		} else {
			List<String> relations = new ArrayList<>();
			for (Component component : nestedComponents) {
				relations.add("'" + aiSystemName + "' contains '" + component.getName() + "'");
			}
			for (Component component : dependencyComponents) {
				relations.add("'" + aiSystemName + "' uses '" + component.getName() + "'");
			}
			addToFoundDocumentation(foundDocumentation, aiSystemName, "System architecture",
					String.join("; ", relations), "Annex IV(2)(c)");
		}

		// Annex IV(2)(c) resources
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DevelopementResources", "Computational resources used to develop, train, test and validate", "Annex IV(2)(c)");

		// Annex IV(2)(d) training data sets
		Set<Artifact> trainingData = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Artifact.class,
				EUAIActCompliance.TrainingData);
		if (trainingData.isEmpty()) {
			addToNotes(notes, aiSystemName, "Training data",
					"No training data set is contained in the AI system or connected to it. If the AI system is trained with data, add it to the UML model.",
					"Annex IV(2)(d)");
		}
		for (Artifact data : trainingData) {
			String dataName = data.getName();
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Description", "Description", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Origin", "Provenance", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Scope", "Scope", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Selection", "Selection", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Labeling", "Labeling", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Cleaning", "Cleaning", "Annex IV(2)(d)");

			boolean assigned = false;
			for (Component mlModel : selfDevelopedModels) {
				if (EUAIActComplianceUtil.getConnectedElements(mlModel, Artifact.class, EUAIActCompliance.TrainingData)
						.contains(data)) {
					assigned = true;
					break;
				}
			}
			if (!assigned) {
				addToNotes(notes, dataName, "Assignment to a model",
						"The training data set is not assigned to any model. Connect the training data set to the model that is trained with it, e.g. via a <<use>> dependency.",
						"Annex IV(2)(d)");
			}
		}

		// Annex IV(2)(e)
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"HumanOversightPreAssessment", "Assessment of the human oversight measures", "Annex IV(2)(e)");

		// Annex IV(2)(f)
		documentConditionalString(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"PredeterminedChanges",
				"Detailed description of pre-determined changes to the AI system and its performance",
				"Annex IV(2)(f)");

		// Annex IV(2)(h)
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"CybersecurityMeasures", "Cybersecurity measures", "Annex IV(2)(h)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DetailedDescriptionAISystem,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(3) detailed information about monitoring, functioning and control
	private EUAIActDocumentationSectionResult generateDetailedInformationAISystem() {
		String aiSystemName = this.aiSystem.getName();
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		Set<Component> mlModels = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.SelfDevelopedModel);
		if (mlModels.isEmpty()) {
			addToNotes(notes, aiSystemName, "Capabilities, accuracy and input data",
					"No ML model is contained in the AI system, therefore they cannot be derived from the model. If the AI system is based on machine learning, add the models to the UML model.",
					"Annex IV(3)");
		}
		for (Component mlModel : mlModels) {
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "Capabilities", "Capabilities", "Annex IV(3)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "Accuracy", "Accuracy", "Annex IV(3)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel,
					EUAIActCompliance.SelfDevelopedModel, "InputData", "Specification on input data", "Annex IV(3)");
		}

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"ForseeableRisks",
				"Foreseeable unintended outcomes and sources of risks to health and safety, fundamental rights and discrimination in view of the intended purpose of the AI system",
				"Annex IV(3)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"HumanOversightMeasures", "Human oversight measures in place, including technical measures for output interpretation", "Annex IV(3)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DetailedInformationAISystem,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(4) appropriateness of the performance metrics
	private EUAIActDocumentationSectionResult generateDescriptionPerformanceMetrics() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"PerformanceMetricsAppropriateness", "Appropriateness of the performance metrics", "Annex IV(4)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionPerformanceMetrics,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(5) risk management system according to Article 9
	private EUAIActDocumentationSectionResult generateDescriptionRiskManagement() {
		String aiSystemName = this.aiSystem.getName();
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		Set<Artifact> riskManagementSystems = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Artifact.class,
				EUAIActCompliance.RiskManagementSystem);

		if (riskManagementSystems.isEmpty()) {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, aiSystemName, "Risk management system",
						"No risk management system is contained in the AI system or connected to it by a dependency, add it to the UML model.",
						"Annex IV(5), Article 9(1)");
			} else {
				addToNotes(notes, aiSystemName, "Risk management system",
						"No risk management system is contained in the AI system or connected to it by a dependency.",
						"Annex IV(5), Article 9(1)");
			}
			return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionRiskManagement,
					foundDocumentation, missingDocumentation, notes);
		}
		if (riskManagementSystems.size() > 1) {
			addToNotes(notes, aiSystemName, "Risk management system",
					"More than one risk management system is connected to the AI system. One risk management system per high risk AI system is required.",
					"Article 9(1)");
		}

		for (Artifact riskManagement : riskManagementSystems) {
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagementSystem, "RiskIdentification", "Risk identification",
					"Annex IV(5), Article 9(2)(a)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagementSystem, "RiskEstimation", "Risk estimation and evaluation",
					"Annex IV(5), Article 9(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagementSystem, "RiskMitigation", "Risk management measures",
					"Annex IV(5), Article 9(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagementSystem, "ResidualRisk", "Residual risk",
					"Annex IV(5), Article 9(5)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagementSystem, "VulnerableGroupsAssessment",
					"Assessment of vulnerable groups", "Annex IV(5), Article 9(9)");
		}

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionRiskManagement,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(6) relevant changes made by the provider through the lifecycle
	private EUAIActDocumentationSectionResult generateDescriptionProviderRelevantChanges() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		documentConditionalString(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"RelevantChanges", "Relevant changes through the lifecycle", "Annex IV(6)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionProviderRelevantChanges,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(7) list of the applied harmonised standards
	private EUAIActDocumentationSectionResult generateListHarmonisedStandards() {
		String aiSystemName = this.aiSystem.getName();
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		String standards = EUAIActComplianceUtil.getStringValue(this.aiSystem, EUAIActCompliance.AISystem,
				"HarmonisedStandards");
		if (standards == null || standards.isBlank()) {
			if (this.highRisk) {
				addToNotes(notes, aiSystemName, "Applied harmonised standards",
						"None is specified. If no harmonised standard was applied, describe in this tag the solutions adopted to meet the requirements of Chapter III Section 2, including any other standards or technical specifications applied.",
						"Annex IV(7)");
			}
		} else {
			addToFoundDocumentation(foundDocumentation, aiSystemName, "Applied harmonised standards", standards,
					"Annex IV(7)");
		}

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.ListHarmonisedStandards,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(8) copy of the EU declaration of conformity according to Article 47
	private EUAIActDocumentationSectionResult generateCopyEUConformityDeclaration() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		documentMandatoryBoolean(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"CopyEUConformityDeclaration", "EU declaration of conformity", "Annex IV(8), Article 47");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.CopyEUConformityDeclaration,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	// Annex IV(9) system to evaluate the performance in the post-market phase
	private EUAIActDocumentationSectionResult generateDescriptionAISystemPostMarketPhase() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"PostMarketMonitoring", "Post-market monitoring system", "Annex IV(9), Article 72");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionAISystemPostMarketPhase,
				foundDocumentation, missingDocumentation, notes);
	}

	// TODO JavaDoc
	private void documentMandatoryString(List<String> foundDocumentation, List<String> missingDocumentation,
			NamedElement element, EUAIActCompliance stereotype, String tag, String label, String reference) {
		String value = EUAIActComplianceUtil.getStringValue(element, stereotype, tag);
		if (value != null && !value.isBlank()) {
			addToFoundDocumentation(foundDocumentation, element.getName(), label, value, reference);
		} else {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, element.getName(), label,
						"Not specified in the UML model.", reference);
			}
		}
	}

	// TODO JavaDoc
	private void documentMandatoryBoolean(List<String> foundDocumentation, List<String> missingDocumentation,
			NamedElement element, EUAIActCompliance stereotype, String tag, String label, String reference) {
		boolean value = EUAIActComplianceUtil.isTaggedValueTrue(element, stereotype, tag);
		if (value) {
			addToFoundDocumentation(foundDocumentation, element.getName(), label,
					"Confirmed to be part of the documentation.", reference);
		} else {
			if (this.highRisk) {
				addToMissingDocumentation(missingDocumentation, element.getName(), label,
						"Not confirmed. Set the tag in the UML model.", reference);
			}
		}
	}

	// TODO JavaDoc
	private void documentConditionalString(List<String> foundDocumentation, List<String> notes, NamedElement element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		String value = EUAIActComplianceUtil.getStringValue(element, stereotype, tag);
		if (value != null && !value.isBlank()) {
			addToFoundDocumentation(foundDocumentation, element.getName(), label, value, reference);
		} else {
			if (this.highRisk) {
				addToNotes(notes, element.getName(), label,
						"Not specified in the UML model. Specify this information, or dismiss this note if it does not apply to the AI system.",
						reference);
			}
		}
	}

	// TODO JavaDoc
	private void addToFoundDocumentation(List<String> foundDocumentation, String elementName, String label,
			String value, String reference) {
		foundDocumentation.add("'" + elementName + "' (" + reference + "): " + label + ": " + value);
	}

	// TODO JavaDoc
	private void addToMissingDocumentation(List<String> missingDocumentation, String elementName, String label,
			String value, String reference) {
		missingDocumentation.add("'" + elementName + "' (" + reference + "): " + label + ": " + value);
	}

	// TODO JavaDoc
	private void addToNotes(List<String> notes, String elementName, String label, String value, String reference) {
		notes.add("'" + elementName + "' (" + reference + "): " + label + ": " + value);
	}
}