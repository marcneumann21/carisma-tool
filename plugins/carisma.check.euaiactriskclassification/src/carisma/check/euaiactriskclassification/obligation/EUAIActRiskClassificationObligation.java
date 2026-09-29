package carisma.check.euaiactriskclassification.obligation;

import java.util.ArrayList;
import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

// TODO JavaDoc
public class EUAIActRiskClassificationObligation {

	private EUAIActRiskClassificationObligation() {
	}

	public static List<String> getObligations(EUAIActRiskClass riskClass, boolean annexISectionB) {
		List<String> obligations = new ArrayList<>();

		// Annex I Section B
		if (annexISectionB) {
			obligations.add("Only Article 6(1), Articles 102 to 109 and Article 112 apply (Article 2(2)).");
			return obligations;
		}

		switch (riskClass) {
		case Unacceptable:
			obligations.add(
					"No obligations. The system must not be placed on the market, put into service or used (Article 5).");
			break;
		case High:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system (Article 4).");
			obligations.add("Establish of a continuous risk management system (Article 9).");
			obligations.add(
					"Apply data governance and management practices to the training, validation and testing data sets (Article 10).");
			obligations.add("Create a technical documentation (Article 11). => run EU AI Act Documentation Check");
			obligations.add("Enable automatic record keeping (Article 12).");
			obligations.add("Provide transparent information to deployers (Article 13).");
			obligations.add("Enable human oversight (Article 14).");
			obligations.add("Ensure accuracy, robustness and cybersecurity (Article 15).");
			obligations.add("Set up a quality management system (Article 17).");
			obligations.add(
					"Keep the technical documentation at the disposal of the national competent authorities for 10 years after placing the AI system on the market (Article 18).");
			obligations.add(
					"Keep the quality management system documentation at the disposal of the national competent authorities for 10 years after placing the AI system on the market (Article 18).");

			obligations.add(
					"Keep the EU declaration of conformity at the disposal of the national competent authorities for 10 years after placing the AI system on the market (Article 18).");
			obligations.add("Keep the automatically generated logs for at least 6 months (Article 19).");
			obligations
					.add("Undergo the conformity assessment before placing the AI system on the market (Article 43).");
			obligations.add("Draw up the EU declaration of conformity (Article 47).");
			obligations.add(
					"Ensure the CE marking is affixed visibly, legibly and indelibly to the AI system, its packaging or its accompanying documentation (Article 48).");
			obligations.add("Establish a post-market monitoring system and plan (Article 72).");
			obligations.add("Report serious incidents to the market surveillance authorities (Article 73).");
			break;
		case Limited:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system (Article 4).");
			// the Article 50(1) and Article50(2) obligations are collected per use case in
			// EUAIActRiskClassifier.checkLimitedRisk()
			break;
		case Minimal:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system (Article 4).");
			obligations.add("Voluntary codes of conduct possible (Article 95).");
			break;
		default:
			obligations.add("Classification not possible.");
			break;
		}
		return obligations;
	}
}