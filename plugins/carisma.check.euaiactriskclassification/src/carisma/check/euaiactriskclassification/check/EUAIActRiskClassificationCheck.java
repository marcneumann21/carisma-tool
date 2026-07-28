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
			addInfo("Your model does not contain any AI systems.");
			return false;
		}
		addInfo("Your model contains " + aiSystems.size() + " AI system(s).");

		for (Component aiSystem : aiSystems) {
			EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(aiSystem);
			EUAIActRiskClassificationResult result = classifier.classify();

			EUAIActRiskClass riskClass = result.riskClass();
			List<String> reasons = result.reasons();
			List<String> obligations = result.obligations();

			addInfo("AI System '" + aiSystem.getName() + "' is classified as: " + riskClass);
			addInfo("Reason(s):");
			addInfo("=======");
			for (String reason : reasons) {
				addInfo(reason);
			}
			addInfo("\n");

			if (riskClass == EUAIActRiskClass.Unacceptable) {
				addInfo("No Obligations. The system must not be placed on the market, put into service or used according to Article 5.");
				continue;
			} else {
				addInfo("Resulting Obligation(s):");
				addInfo("================");
				for (String obligation : obligations) {
					addInfo(obligation);
				}
			}
		}
		return true;

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