package carisma.check.euaiactriskclassification.check;

import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Component;

import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassifier;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassificationResult;
import carisma.check.euaiactriskclassification.common.AbstractEUAIActRiskClassificationCheck;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.core.checks.CarismaCheckWithID;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * Classifies the AI systems of a UML model into the risk classes defined by the
 * EU AI Act.
 * 
 * @author Marc Neumann
 * 
 */
public class EUAIActRiskClassificationCheck extends AbstractEUAIActRiskClassificationCheck
		implements CarismaCheckWithID {

	public static final String CHECK_ID = "carisma.check.euaiactriskclassification";
	public static final String CHECK_NAME = "EU AI Act Risk Classification Check";

	@Override
	public boolean runCheck() {
		Set<Component> aiSystems = EUAIActComplianceUtil.getStereotypedElements(model, Component.class,
				EUAIActCompliance.AISystem);

		if (aiSystems.isEmpty()) {
			addError("Your model does not contain any AI systems.");
			return false;
		}

		addInfo("Your model contains " + aiSystems.size() + " AI systems.");
		addInfo("");

		boolean noUnacceptableRisk = true;
		for (Component aiSystem : aiSystems) {
			EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(aiSystem);
			EUAIActRiskClassificationResult result = classifier.classify();

			EUAIActRiskClass riskClass = result.riskClass();
			List<String> reasons = result.reasons();
			List<String> obligations = result.obligations();
			List<String> additionalObligations = result.additionalObligations();
			List<String> notes = result.notes();

			addInfo("#".repeat(50));
			addInfo("The AI System '" + aiSystem.getName() + "' is classified as: " + riskClass);
			addInfo("#".repeat(50));

			addInfo("");

			addInfo("Reasons:");
			addInfo("=======");
			for (String reason : reasons) {
				addInfo(reason);
			}

			addInfo("");

			if (riskClass == EUAIActRiskClass.Unacceptable) {
				addWarning("No Obligations. The AI System '" + aiSystem.getName()
						+ "' must not be placed on the market, put into service or used (Article 5).");
				noUnacceptableRisk = false;
				continue;
			} else if (riskClass == EUAIActRiskClass.Undetermined) {
				addWarning("No Obligations. The risk class of the AI system '" + aiSystem.getName()
						+ "' could not be determined.");
				continue;
			} else {
				addInfo("Risk Class Obligations:");
				addInfo("=================");
				if (obligations.isEmpty()) {
					addInfo("None");
				} else {
					for (String obligation : obligations) {
						addInfo(obligation);
					}
				}

				if (riskClass == EUAIActRiskClass.High && !result.annexISectionB()) {
					addWarning(
							"Run the EU AI Act Documentation Check to generate the technical documentation (Article 11).");
				}

				addInfo("");

				addInfo("Additional Obligations:");
				addInfo("=================");
				if (additionalObligations.isEmpty()) {
					addInfo("None");
				} else {
					for (String additionalObligation : additionalObligations) {
						addInfo(additionalObligation);
					}
				}

				addInfo("");

				addInfo("Notes:");
				addInfo("=====");
				if (notes.isEmpty()) {
					addInfo("None");
				} else {
					for (String note : notes) {
						addInfo(note);
					}
				}
				addInfo("");
			}

		}

		return noUnacceptableRisk;
	}

	@Override
	public String getCheckID() {
		return CHECK_ID;
	}

	@Override
	public String getName() {
		return CHECK_NAME;
	}
}