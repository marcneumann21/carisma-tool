package carisma.check.euaiactriskclassification.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Component;

import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassifier;
import carisma.check.euaiactriskclassification.common.AbstractEUAIActRiskClassificationCheck;
import carisma.check.euaiactriskclassification.obligation.EUAIActRiskClassificationObligation;
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
			addInfo("Your model does not contain any AI system. Therefore, it cannot be classified into one of the EU AI Act risk classes.");
			return false;
		}
		addInfo("Your model contains " + aiSystems.size() + " AI system(s).");

		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier();

		for (Component aiSystem : aiSystems) {
			List<String> reasons = new ArrayList<>();
			EUAIActRiskClass riskClass = classifier.classify(aiSystem, reasons);
			List<String> obligations = EUAIActRiskClassificationObligation.getObligations(riskClass);

			addInfo("AI System '" + aiSystem.getName() + "' is classified as: "
					+ EUAIActRiskClassifier.getDisplayName(riskClass));
			addInfo("Reason(s):");
			addInfo("=======");
			for (String reason : reasons) {
				addInfo(reason);
			}
			addInfo("\n");
			if (riskClass == EUAIActRiskClass.UNACCEPTABLE) {
				addInfo("No requirements, because the system must not be placed on the market, put into service or used (Art. 5: Prohibited AI Practices).");
				return false;
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