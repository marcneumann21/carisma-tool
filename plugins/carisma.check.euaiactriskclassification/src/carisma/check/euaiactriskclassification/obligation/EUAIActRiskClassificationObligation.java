package carisma.check.euaiactriskclassification.obligation;

import java.util.ArrayList;
import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

// TODO JavaDoc
public class EUAIActRiskClassificationObligation {

	private EUAIActRiskClassificationObligation() {
	}

	public static List<String> getObligations(EUAIActRiskClass riskClass) {
		List<String> obligations = new ArrayList<>();
		switch (riskClass) {
		case Unacceptable:
			obligations.add("No Obligations. The system must not be placed on the market, put into service or used according to Article 5.");
			break;
		case High:
			obligations.add("Establishment of a continuous risk management system according to Article 9.");
			obligations.add("Data and data governance according to Article 10.");
			obligations.add(
					"Technical documentation according to Article 11 and Annex IV. => run EU AI Act Documentation Check");
			obligations.add("Record keeping according to Article 12.");
			obligations.add("Transparency and provision of information to deployers according to Article 13.");
			obligations.add("Human oversight according to Article 14.");
			obligations.add("Accuracy, robustness and cybersecurity according to Article 15.");
			obligations.add("Quality management system of the provider according to Article 17.");
			obligations.add("Conformity assessment before placing on the market according to Article 43.");
			obligations.add("EU declaration of conformity according to Article 47.");
			obligations.add("CE marking according to Article 48.");
			obligations.add("Registration in the EU database before placing on the market according to Article 49.");
			obligations.add("Post-market monitoring system and plan according to Article 72.");
			break;
		case Limited:
			// Empty on purpose: the Article 50 obligations are collected per use case in
		    // EUAIActRiskClassifier.checkLimitedRisk(), so only the triggered ones appear.
			break;
		case Minimal:
			obligations.add("No mandatory obligation. Voluntary codes of conduct possible according to Article 95.");
			break;
		default:
			obligations.add("Classification not possible.");
			break;
		}
		return obligations;
	}
}