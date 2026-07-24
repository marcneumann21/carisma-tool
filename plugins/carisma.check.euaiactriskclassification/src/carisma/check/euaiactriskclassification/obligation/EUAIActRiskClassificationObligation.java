package carisma.check.euaiactriskclassification.obligation;

import java.util.ArrayList;
import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

// TODO JavaDoc
public final class EUAIActRiskClassificationObligation {

	private EUAIActRiskClassificationObligation() {
	}

	public static List<String> getObligations(EUAIActRiskClass riskClass) {
		List<String> requirements = new ArrayList<>();
		switch (riskClass) {
		case HIGH:
			requirements.add("Establishment of a continuous risk management system (Art. 9)");
			requirements.add("Data and data governance (Art. 10)");
			requirements.add(
					"Technical documentation in accordance with Annex IV (Art. 11) => run EU AI Act Documentation Check");
			requirements.add("Record keeping (Art. 12)");
			requirements.add("Transparency and provision of information to deployers (Art. 13)");
			requirements.add("Human oversight (Art. 14)");
			requirements.add("Accuracy, robustness and cybersecurity (Art. 15)");
			requirements.add("Quality management system of the provider (Art. 17)");
			requirements.add("Conformity assessment before placing on the market (Art. 43)");
			break;
		case LIMITED:
			requirements.add("Inform natural persons that they are interacting with an AI system (Art. 50 Par. 1)");
			requirements.add("Mark AI-generated content in a machine-readable format (Art. 50 Par. 2)");
			requirements
					.add("Inform persons exposed to emotion recognition or biometric categorisation (Art. 50 Par. 3)");
			requirements.add("Disclose deep fakes (Art. 50 Par. 4)");
			break;
		case MINIMAL:
			requirements.add("No mandatory obligation. Voluntary codes of conduct possible. (Art. 95)");
			break;
		default:
			requirements.add("Classification not possible - requirements cannot be determined.");
			break;
		}
		return requirements;
	}
}