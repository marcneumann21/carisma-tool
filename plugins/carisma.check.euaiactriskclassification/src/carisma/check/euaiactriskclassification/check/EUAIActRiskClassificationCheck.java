package carisma.check.euaiactriskclassification.check;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;

import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassifier;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassificationResult;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.core.analysis.AnalysisHost;
import carisma.core.analysis.DummyHost;
import carisma.core.analysis.result.AnalysisResultMessage;
import carisma.core.analysis.result.StatusType;
import carisma.core.checks.CarismaCheckWithID;
import carisma.core.checks.CheckParameter;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * Classifies the AI systems of a UML model into the risk classes defined by the
 * EU AI Act.
 * 
 * @author Marc Neumann
 * 
 */
public class EUAIActRiskClassificationCheck implements CarismaCheckWithID {

	public static final String CHECK_ID = "carisma.check.euaiactriskclassification";
	public static final String CHECK_NAME = "EU AI Act Risk Classification Check";

	/**
	 * the model to check.
	 */
	private Model model = null;
	
	/**
	 * AnalysisHost for report.
	 */
	private AnalysisHost analysisHost;

	@Override
	public boolean perform(final Map<String, CheckParameter> parameters, final AnalysisHost newHost) {
		if (newHost != null) {
			this.analysisHost = newHost;
		} else {
			this.analysisHost = new DummyHost(true);
		}

		Resource currentModel = this.analysisHost.getAnalyzedModel();
		if (currentModel.getContents().isEmpty()) {
			addError("Empty model");
			this.analysisHost.appendLineToReport("Empty model");
			return false;
		}
		if (!(currentModel.getContents().get(0) instanceof Model)) {
			addError("Content is not a model!");
			this.analysisHost.appendLineToReport("Content is not a model!");
			return false;
		}

		this.model = (Model) currentModel.getContents().get(0);
		return runCheck();
	}

	public boolean runCheck() {
		Set<Component> aiSystems = EUAIActComplianceUtil.getStereotypedElements(model, Component.class,
				EUAIActCompliance.AISystem);

		if (aiSystems.isEmpty()) {
			addError("Your model does not contain any AI systems.");
			return false;
		}

		addInfo("Your model contains " + aiSystems.size() + (aiSystems.size() > 1 ? " AI Systems" : " AI System"));
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

			addInfo("");

			addInfo("#".repeat(57));
			if (riskClass == EUAIActRiskClass.Undetermined) {
				addInfo("The AI System '" + aiSystem.getName() + "' could not be classified: " + riskClass);
			} else {
				addInfo("The AI System '" + aiSystem.getName() + "' is classified as: " + riskClass);
			}
			addInfo("#".repeat(57));

			addInfo("");

			addInfo("=".repeat(50));
			addInfo("REASONS");
			addInfo("=".repeat(50));

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
				addInfo("=".repeat(50));
				addInfo("RISK CLASS OBLIGATIONS");
				addInfo("=".repeat(50));
				if (obligations.isEmpty()) {
					addInfo("None");
				} else {
					for (String obligation : obligations) {
						addInfo(obligation);
					}
				}

				addInfo("");

				addInfo("=".repeat(50));
				addInfo("ADDITIONAL OBLIGATIONS");
				addInfo("=".repeat(50));
				if (additionalObligations.isEmpty()) {
					addInfo("None");
				} else {
					for (String additionalObligation : additionalObligations) {
						addInfo(additionalObligation);
					}
				}

				addInfo("");

				addInfo("=".repeat(50));
				addInfo("NOTES");
				addInfo("=".repeat(50));
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
	
	private void addInfo(String message) {
		this.analysisHost.addResultMessage(new AnalysisResultMessage(StatusType.INFO, message));
	}

	private void addWarning(String message) {
		this.analysisHost.addResultMessage(new AnalysisResultMessage(StatusType.WARNING, message));
	}

	private void addError(String message) {
		this.analysisHost.addResultMessage(new AnalysisResultMessage(StatusType.ERROR, message));
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