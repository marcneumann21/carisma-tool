package carisma.check.euaiactdocumentation.requirement;

import java.util.HashMap;
import java.util.Map;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;

// TODO JavaDoc
public final class EUAIActDocumentationRequirement {

	private EUAIActDocumentationRequirement() {
	}

	// TODO JavaDoc
	public static Map<EUAIActCompliance, String> getRequirements(EUAIActRiskClass riskClass) {
		Map<EUAIActCompliance, String> requirements = new HashMap<>();
		switch (riskClass) {
		case HIGH:
			requirements.put(EUAIActCompliance.GeneralDescriptionAISystem,
					"General description of the AI system (Annex IV No. 1)");
			requirements.put(EUAIActCompliance.DetailedInformationAISystem,
					"Detailed description of the elements and development process (Annex IV No. 2)");
			requirements.put(EUAIActCompliance.DetailedDescriptionAISystem,
					"Capabilities, limitations and human oversight (Annex IV No. 3)");
			requirements.put(EUAIActCompliance.DescriptionPerformanceMetrics,
					"Appropriateness of the performance metrics (Annex IV No. 4)");
			requirements.put(EUAIActCompliance.DescriptionRiskManagement,
					"Risk management system in accordance with Art. 9 (Annex IV No. 5)");
			requirements.put(EUAIActCompliance.DescriptionProviderRelevantChanges,
					"Relevant changes over the system lifecycle (Annex IV No. 6)");
			requirements.put(EUAIActCompliance.ListHarmonisedStandards,
					"List of applied harmonised standards (Annex IV No. 7)");
			requirements.put(EUAIActCompliance.CopyEUConformityDeclaration,
					"Copy of the EU declaration of conformity (Annex IV No. 8)");
			requirements.put(EUAIActCompliance.DescriptionAISystemPostMarketPhase,
					"Post-market monitoring plan in accordance with Art. 72 (Annex IV No. 9)");
			break;
		case LIMITED:
			requirements.put(EUAIActCompliance.TransparencyObligation, "Transparency Obligations for Providers and Deployers (Art. 50)");
			break;
		default:
			break;
		}
		return requirements;
	}
}
