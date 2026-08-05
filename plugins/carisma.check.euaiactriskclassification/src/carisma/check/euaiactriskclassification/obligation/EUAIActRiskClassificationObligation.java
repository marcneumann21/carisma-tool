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
			obligations.add(
					"No obligations. The system must not be placed on the market, put into service or used according to Article 5.");
			break;
		case High:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system according to Article 4.");
			obligations.add("Establish of a continuous risk management system according to Article 9.");
			obligations.add("Apply data and data governance practices according to Article 10.");
			obligations.add(
					"Create a technical documentation according to Article 11. => run EU AI Act Documentation Check");
			obligations.add("Enable automatic record keeping according to Article 12.");
			obligations.add("Provide transparent information to deployers according to Article 13.");
			obligations.add("Enable human oversight according to Article 14.");
			obligations.add("Ensure accuracy, robustness and cybersecurity according to Article 15.");
			obligations.add("Set up a quality management system of the provider according to Article 17.");
			obligations.add(
					"Keep the technical documentation, the quality management system documentation and the EU declaration of conformity at the disposal of the national competent authorities for 10 years after placing the AI system on the market according to Article 18.");
			obligations
					.add("Keep the automatically generated logs for at least 6 months according to Article 19.");
			obligations.add("Undergo the conformity assessment before placing the AI system on the market according to Article 43.");
			obligations.add("Draw up the EU declaration of conformity according to Article 47.");
			obligations.add("Affix the CE marking according to Article 48.");
			obligations.add("Establish a post-market monitoring system and plan according to Article 72.");
			obligations.add(
					"Report serious incidents to the market surveillance authorities according to Article 73.");
			break;
		case Limited:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system according to Article 4.");
			// the Article 50 obligations are collected per use case in
			// EUAIActRiskClassifier.checkLimitedRisk(), so only the triggered ones will be
			// documented.
			break;
		case Minimal:
			obligations.add(
					"Ensure a sufficient level of AI literacy of the staff and other persons dealing with the operation and use of this AI system according to Article 4.");
			obligations.add("No further obligations. Voluntary codes of conduct possible according to Article 95.");
			break;
		default:
			obligations.add("Classification not possible.");
			break;
		}
		return obligations;
	}
}