package carisma.check.euaiactdocumentation.verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;

import carisma.check.euaiactdocumentation.requirement.EUAIActDocumentationRequirement;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActDocumentationVerifier {

	private final Map<EUAIActCompliance, String> requirements;

	public EUAIActDocumentationVerifier(EUAIActRiskClass riskClass) {
		this.requirements = EUAIActDocumentationRequirement.getRequirements(riskClass);
	}

	// TODO JavaDoc
	public boolean verify(Component aiSystem, List<String> requiredDocumentation, List<String> foundDocumentation,
			List<String> missingDocumentation) {

		for (Map.Entry<EUAIActCompliance, String> entry : requirements.entrySet()) {
			EUAIActCompliance documentation = entry.getKey();
			String description = entry.getValue();

			requiredDocumentation.add(description);

			NamedElement documentationArtifact = getDocumentationArtifact(aiSystem, documentation);

			if (documentationArtifact == null) {
				missingDocumentation.add(description);
				continue;
			}

			List<String> falseAttributes = new ArrayList<>();

			if (documentation == EUAIActCompliance.GeneralDescriptionAISystem) {
				falseAttributes = EUAIActComplianceUtil.getFalseTags(documentationArtifact, documentation,
						new String[] { "Purpose", "Provider", "Version", "Interaction", "Deployment", "Hardware",
								"VisualDocumentation", "Interface", "Instructions" });
			}
			if (documentation == EUAIActCompliance.DetailedInformationAISystem) {
				falseAttributes = EUAIActComplianceUtil.getFalseTags(documentationArtifact, documentation,
						new String[] { "Developement", "ThirdPartyElements", "DesignSpecification", "DesignDecision",
								"Objective", "ExpectedOutput", "Compromise", "Architecture", "Resources",
								"TrainingMethods", "TrainingDataDescription", "TrainingDataSelection",
								"TrainingDataLabeling", "TrainingDataCleaning", "HumanOversightPreassessment",
								"PlannedModification", "ValidationProcess", "TestingProcess", "Parameter",
								"Cybersecurity" });
			}
			if (documentation == EUAIActCompliance.DetailedDescriptionAISystem) {
				falseAttributes = EUAIActComplianceUtil.getFalseTags(documentationArtifact, documentation,
						new String[] { "Capabilities", "Accuracy", "PredictableRisks", "HumanOversightPostAssessment",
								"InputSpecification" });
			}
			// TODO Not real mandatory
			if (documentation == EUAIActCompliance.TransparencyObligation) {
				falseAttributes = EUAIActComplianceUtil.getFalseTags(documentationArtifact, documentation,
						new String[] { "HumanInteraction", "SyntheticContent", "EmotionRecognitionNotification",
								"BiometricCategorizationNotification", "Deepfake", "PublicInterestText" });
			}
			if (falseAttributes.isEmpty()) {
				foundDocumentation.add(description);
			} else {
				missingDocumentation.add(description + ", missing Attributes: " + falseAttributes.toString());
			}

		}
		return missingDocumentation.isEmpty();
	}

	// TODO JavaDoc
	private NamedElement getDocumentationArtifact(Component aiSystem, EUAIActCompliance documentationArtifact) {
		for (Dependency dp : aiSystem.getClientDependencies()) {
			if (EUAIActComplianceUtil.hasStereotype(dp, EUAIActCompliance.Documents)) {

				for (NamedElement el : dp.getSuppliers()) {
					if (el instanceof Artifact && EUAIActComplianceUtil.hasStereotype(el, documentationArtifact)) {
						return el;
					}
				}
				if (documentationArtifact != null) {
					break;
				}
			}
		}
		return null;
	}
}
