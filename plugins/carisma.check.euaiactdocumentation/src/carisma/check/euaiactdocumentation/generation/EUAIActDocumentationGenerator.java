package carisma.check.euaiactdocumentation.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;

import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSection;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSectionResult;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActDocumentationGenerator {

	private final Component aiSystem;
	private final boolean highRisk;

	private final List<EUAIActDocumentationSectionResult> sections = new ArrayList<>();

	public EUAIActDocumentationGenerator(Component aiSystem, boolean highRisk) {
		this.aiSystem = aiSystem;
		this.highRisk = highRisk;
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
		this.sections.add(generateTransparencyObligations());
		return this.sections;
	}

	// TODO JavaDoc
	private EUAIActDocumentationSectionResult generateGeneralDescriptionAISystem() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		// Annex IV(1)(a) purpose
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Purpose", "Purpose", "Annex IV(1)(a)");

		// Annex IV(1)(a) provider
		String provider = EUAIActComplianceUtil.getAssociationActorEnd(this.aiSystem, EUAIActCompliance.Provides,
				EUAIActCompliance.Provider);
		if (provider == null || provider.isBlank()) {
			documentGap(missingDocumentation, "'Provider': not specified in the model. Add in the model according to Article 3(3), Annex IV(1)(a).");
		} else {
			foundDocumentation.add("'Provider': " + provider);
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
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"MarketPlacementForm", "Form of placing on the market", "Annex IV(1)(d)");

		// Annex IV(1)(e) hardware
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Hardware", "Description of the hardware", "Annex IV(1)(e)");

		// Annex IV(1)(f) visual documentation
		documentConditionalBoolean(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"VisualDocumentation", "Photographs or illustrations", "Annex IV(1)(f)");

		// Annex IV(1)(g) ui
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"UserInterface", "Basic description of the user-interface", "Annex IV(1)(g)");

		// Annex IV(1)(h) instructions for use
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Instructions", "Instructions for use for the deployer ", "Annex IV(1)(h)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.GeneralDescriptionAISystem,
				foundDocumentation, missingDocumentation, notes);

	}

	private EUAIActDocumentationSectionResult generateDetailedDescriptionAISystem() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		// Annex IV(2)(a) developement process
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DevelopmentProcess", "The methods and steps performed for the development", "Annex IV(2)(a)");

		// Annex IV(2)(a) third party tools
		Set<Component> thirdPartyComponents = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.ThirdPartyComponent);
		if (thirdPartyComponents.isEmpty()) {
			notes.add(
					"'Third party components': none is modelled. If the AI system integrates any third party tools, model them accordingly and connect them to the AI system, according to Annex IV(2)(a).");
		}
		for (Component thirdParty : thirdPartyComponents) {
			documentMandatoryString(foundDocumentation, missingDocumentation, thirdParty,
					EUAIActCompliance.ThirdPartyComponent, "Origin", "Origin of '" + thirdParty.getName() + "'",
					"Annex IV(2)(a)");
			documentMandatoryString(foundDocumentation, missingDocumentation, thirdParty,
					EUAIActCompliance.ThirdPartyComponent, "IntegrationDescription",
					"Integration of '" + thirdParty.getName() + "'", "Annex IV(2)(a)");
		}

		// Annex IV(2)(b) design specification, key design choices, design trade-offs
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignSpecification", "Design specification", "Annex IV(2)(b)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignDecision", "Key design decisions", "Annex IV(2)(b)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"DesignTradeOffs", "Design trade-offs", "Annex IV(2)(b)");

		// Annex IV(2)(b) ml models
		Set<Component> mlModels = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.MLModel);
		if (mlModels.isEmpty()) {
			missingDocumentation.add(
					"'ML Model': no ML Model is contained in the AI system or connected to it by a dependency, according to Annex IV(2)(b).");
		}
		for (Component mlModel : mlModels) {
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Objective", "Objective of '" + mlModel.getName() + "'", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"ExpectedOutput", "Expected output of '" + mlModel.getName() + "'", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Parameter", "Parameters of '" + mlModel.getName() + "'", "Annex IV(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TrainingMethods", "Training methods of '" + mlModel.getName() + "'", "Annex IV(2)(c)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"ValidationProcess", "Validation of '" + mlModel.getName() + "'", "Annex IV(2)(g)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TestingProcess", "Testing of '" + mlModel.getName() + "'", "Annex IV(2)(g)");
			documentMandatoryBoolean(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"TestReports", "Test reports of '" + mlModel.getName() + "'", "Annex IV(2)(g)");
		}

		// Annex IV(2)(c) system architecture
		List<String> architecture = EUAIActComplianceUtil.getAllConnectedElements(this.aiSystem);
		if (architecture.isEmpty()) {
			missingDocumentation.add(
					"'System architecture': the AI system has neither parts, nor connectors, nor dependencies, nor a deployment in the model. Model the software components and their interaction in a component or deployment diagram (Annex IV(2)(c)).");
		} else {
			foundDocumentation.add("'System architecture': " + String.join("; ", architecture));
		}
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Resources", "Computational resources used to develop, train, test and validate", "Annex IV(2)(c)");

		// Annex IV(2)(d) training data sets
		Set<Artifact> trainingData = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Artifact.class,
				EUAIActCompliance.TrainingData);
		if (trainingData.isEmpty()) {
			missingDocumentation
					.add("'Training data': no training data is documented for the AI system (Annex IV(2)(d)).");
		}
		for (Artifact data : trainingData) {
			String name = data.getName();
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Description", "Description of '" + name + "'", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Origin", "Provenance of '" + name + "'", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Scope", "Scope of '" + name + "'", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Selection", "Selection of '" + name + "'", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Labeling", "Labeling of '" + name + "'", "Annex IV(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, data, EUAIActCompliance.TrainingData,
					"Cleaning", "Cleaning of '" + name + "'", "Annex IV(2)(d)");
		}

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"HumanOversightPreAssessment", "Assessment of the human oversight measures", "Annex IV(2)(e)");
		documentConditionalString(foundDocumentation, notes, this.aiSystem, EUAIActCompliance.AISystem,
				"PlannedModification", "Predetermined changes", "Annex IV(2)(f)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"Cybersecurity", "Cybersecurity measures", "Annex IV(2)(h)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DetailedDescriptionAISystem,
				foundDocumentation, missingDocumentation, notes);
	}

	// Annex IV(3) detailed information about monitoring, functioning and control
	private EUAIActDocumentationSectionResult generateDetailedInformationAISystem() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		for (Component mlModel : EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Component.class,
				EUAIActCompliance.MLModel)) {
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Capabilities", "Capabilities of '" + mlModel.getName() + "'", "Annex IV(3)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"Accuracy", "Accuracy of '" + mlModel.getName() + "'", "Annex IV(3)");
			documentMandatoryString(foundDocumentation, missingDocumentation, mlModel, EUAIActCompliance.MLModel,
					"InputSpecification", "Input data of '" + mlModel.getName() + "'", "Annex IV(3)");
		}

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"PredictableRisks", "Foreseeable unintended outcomes and risks", "Annex IV(3)");
		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"HumanOversightPostAssessment", "Human oversight measures", "Annex IV(3)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DetailedInformationAISystem,
				foundDocumentation, missingDocumentation, notes);
	}

	// Annex IV(4) appropriateness of the performance metrics
	private EUAIActDocumentationSectionResult generateDescriptionPerformanceMetrics() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		documentMandatoryString(foundDocumentation, missingDocumentation, this.aiSystem, EUAIActCompliance.AISystem,
				"PerformanceMetricsSuitability", "Appropriateness of the performance metrics", "Annex IV(4)");

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionPerformanceMetrics,
				foundDocumentation, missingDocumentation, notes);
	}

	// Annex IV(5) risk management system according to Article 9
	private EUAIActDocumentationSectionResult generateDescriptionRiskManagement() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		Set<Artifact> riskManagementSystems = EUAIActComplianceUtil.getConnectedElements(this.aiSystem, Artifact.class,
				EUAIActCompliance.RiskManagement);

		if (riskManagementSystems.isEmpty()) {
			missingDocumentation.add(
					"'Risk management system': no risk management system is contained in the AI system or connected to it by a dependency (Annex IV(5), Article 9(1)).");
			return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionRiskManagement,
					foundDocumentation, missingDocumentation, notes);
		}
		if (riskManagementSystems.size() > 1) {
			notes.add(
					"'Risk management system': more than one risk management system is connected to the AI system. Article 9(1) requires one risk management system per high risk AI system.");
		}

		for (Artifact riskManagement : riskManagementSystems) {
			String name = riskManagement.getName();
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "RiskIdentification", "Risk identification of '" + name + "'",
					"Annex IV(5), Article 9(2)(a)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "RiskEstimation",
					"Risk estimation and evaluation of '" + name + "'", "Annex IV(5), Article 9(2)(b)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "PostMarketRiskEvaluation",
					"Evaluation of post-market risks of '" + name + "'", "Annex IV(5), Article 9(2)(c)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "RiskMitigation", "Risk management measures of '" + name + "'",
					"Annex IV(5), Article 9(2)(d)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "ResidualRisk", "Residual risk of '" + name + "'",
					"Annex IV(5), Article 9(5)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "TestingProcedure", "Testing procedure of '" + name + "'",
					"Annex IV(5), Article 9(6), Article 9(7)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "TestingMetrics",
					"Testing metrics and thresholds of '" + name + "'", "Annex IV(5), Article 9(7)");
			documentMandatoryString(foundDocumentation, missingDocumentation, riskManagement,
					EUAIActCompliance.RiskManagement, "VulnerableGroupsAssessment",
					"Assessment of vulnerable groups of '" + name + "'", "Annex IV(5), Article 9(8)");
		}

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.DescriptionRiskManagement,
				foundDocumentation, missingDocumentation, notes);
	}

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

	// Annex IV(7) list of the applied harmonised standards
	private EUAIActDocumentationSectionResult generateListHarmonisedStandards() {
		List<String> foundDocumentation = new ArrayList<>();
		List<String> missingDocumentation = new ArrayList<>();
		List<String> notes = new ArrayList<>();

		String standards = EUAIActComplianceUtil.getStringValue(this.aiSystem, EUAIActCompliance.AISystem,
				"HarmonisedStandards");
		if (standards == null || standards.isBlank()) {
			notes.add(
					"'Applied harmonised standards': none is specified. If no harmonised standard was applied, describe in this tag the solutions adopted to meet the requirements of Chapter III Section 2, including any other standards or technical specifications applied (Annex IV(7)).");
		} else {
			foundDocumentation.add("'Applied harmonised standards': " + standards);
		}

		return new EUAIActDocumentationSectionResult(EUAIActDocumentationSection.ListHarmonisedStandards,
				foundDocumentation, missingDocumentation, notes);
	}

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
	private EUAIActDocumentationSectionResult generateTransparencyObligations() {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO JavaDoc
	private void documentMandatoryString(List<String> found, List<String> missing, Element element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		String value = EUAIActComplianceUtil.getStringValue(element, stereotype, tag);
		if (value == null || value.isBlank()) {
			missing.add("'" + label + "': not specified in the model, specify according to " + reference + ".");
		} else {
			found.add("'" + label + "': " + value + ", according to " + reference + ".");
		}
	}

	// TODO JavaDoc
	private void documentMandatoryBoolean(List<String> found, List<String> missing, Element element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		if (EUAIActComplianceUtil.isTaggedValueTrue(element, stereotype, tag)) {
			found.add("'" + label + "': confirmed to be part of the documentation, according to " + reference + ".");
		} else {
			missing.add("'" + label + "': not confirmed to be part of the documentation. Add in the model according to "
					+ reference + ".");
		}
	}

	// TODO JavaDoc
	private void documentConditionalString(List<String> found, List<String> notes, Element element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		String value = EUAIActComplianceUtil.getStringValue(element, stereotype, tag);
		if (value == null || value.isBlank()) {
			notes.add("'" + label
					+ "': not specified in the model. If this does not apply to the AI system, dismiss this note else specify according to "
					+ reference + ".");
		} else {
			found.add("'" + label + "': " + value + ", according to " + reference + ".");
		}
	}

	// TODO JavaDoc
	private void documentConditionalBoolean(List<String> found, List<String> notes, Element element,
			EUAIActCompliance stereotype, String tag, String label, String reference) {
		if (EUAIActComplianceUtil.isTaggedValueTrue(element, stereotype, tag)) {
			found.add("'" + label + "': confirmed to be part of the documentation, according to " + reference + ".");
		} else {
			notes.add("'" + label
					+ "': not confirmed to be part of the documentation. If this does not apply to the AI system, dismiss this note else specify according to "
					+ reference + ".");
		}
	}
	
	private void documentGap(List<String> missingDocumentation, String string) {
		// TODO Auto-generated method stub
		
	}
}
