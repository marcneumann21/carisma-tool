package carisma.check.mltop10checks.modelskewing;

import java.util.Set;

import org.eclipse.uml2.uml.Artifact;

import carisma.check.mltop10checks.common.AbstractMLTop10Check;
import carisma.core.checks.CarismaCheckWithID;
import carisma.profile.umlsec.mltop10.MLTop10;
import carisma.profile.umlsec.mltop10.MLTop10Util;

/**
 * analyzes an deployment diagram with respect to model skewing rules.
 * 
 * @author Alexander Peikert
 * @author Julian Flake
 *
 */

public class ModelSkewingCheck extends AbstractMLTop10Check implements CarismaCheckWithID {

	public static final String CHECK_ID = "carisma.check.mltop10checks.modelskewing";
	public static final String CHECK_NAME = "MLTop10 Model Skewing Attack Check";
	public static final String THREAT_COMMENT_ATTRIBUTE = "ModelSkewing";
	public static final String THREAT_NAME = "MLTop10 Model Skewing Attack";

	@Override
	public boolean runCheck() {

		// ---------------------------------------------------------
		// populate collections
		Set<Artifact> mlmodels = MLTop10Util.getStereotypedElements(modelEl, Artifact.class, MLTop10.MLModel);
		Set<Artifact> feedbackdatas = MLTop10Util.getStereotypedElements(modelEl, Artifact.class, MLTop10.FeedbackData);

		// ---------------------------------------------------------
		// Check numbers of elements relevant for this check
		this.addInfo("Your model contains " + mlmodels.size() + " ML Model(s) and " + feedbackdatas.size()
				+ " Feedback Data(s).");
		if (feedbackdatas.isEmpty()) {
			this.addInfo(
					"Pre Check. Your model does not contain any Feedback Data. Therefore, Model Skewing is not possible.");
			return true;
		}
		if (mlmodels.isEmpty()) {
			this.addInfo(
					"Your model does not contain any information on the ML Model. Therefore, it cannot be ensured that your scenario contains mitigations against 'Model Skewing Attack'.");
		}

		// ---------------------------------------------------------
		// Check the specific prevention mechanisms
		// ---------------------------------------------------------

		// ---------------------------------------------------------
		// 1. Implement robust access controls
		for (Artifact el : mlmodels) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.MLModel, "AccessControl")) {
				this.addWarning("1. ML Model '" + el.getName() + "' does not have access control implemented.");
			} else {
				this.addInfo("1. ML Model '" + el.getName() + "' has access control implemented.");
			}
		}
		for (Artifact el : feedbackdatas) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.FeedbackData, "AccessControl")) {
				this.addWarning("1. There is no access control for Feedback Data '" + el.getName() + "'.");
			} else {
				this.addInfo("1. There is access control for Feedback Data '" + el.getName() + "'.");
			}
		}

		// ---------------------------------------------------------
		// 2. Verify the authenticity of feedback data
		for (Artifact el : feedbackdatas) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.FeedbackData, "AuthenticityVerified")) {
				this.addWarning("2. Feedback Data '" + el.getName() + "'s' authenticity is not verified.");
			} else {
				this.addInfo("2. Feedback Data '" + el.getName() + "'s' authenticity is verified.");
			}
		}

		// ---------------------------------------------------------
		// 3. Verify the authenticity of feedback data
		for (Artifact el : feedbackdatas) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.FeedbackData, "Validation")) {
				this.addWarning("3. Feedback Data '" + el.getName() + "' is not validated.");
			} else {
				this.addInfo("3. Feedback Data '" + el.getName() + "' is validated.");
			}
		}
		for (Artifact el : feedbackdatas) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.FeedbackData, "Cleaning")) {
				this.addWarning("3. Feedback Data '" + el.getName() + "' is not cleaned.");
			} else {
				this.addInfo("3. Feedback Data '" + el.getName() + "' is cleaned.");
			}
		}

		// ---------------------------------------------------------
		// 4. Implement anomaly detection
		for (Artifact el : feedbackdatas) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.FeedbackData, "AnomalyDetection")) {
				this.addWarning("4. There is no anomaly detection for Feedback Data '" + el.getName() + "'.");
			} else {
				this.addInfo("4. There is anomaly detection for Feedback Data '" + el.getName() + "'.");
			}
		}

		// ---------------------------------------------------------
		// 5. Regularly monitor the model’s performance
		for (Artifact el : mlmodels) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.MLModel, "RegularPerformanceMonitoring")) {
				this.addWarning("5. There is no regular performance monitoring for ML Model '" + el.getName() + "'.");
			} else {
				this.addInfo("5. There is regular performance monitoring for ML Model '" + el.getName() + "'.");
			}
		}

		// ---------------------------------------------------------
		// 6. Continuously train the model
		for (Artifact el : mlmodels) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.MLModel, "RegularRetraining")) {
				this.addWarning("6. ML Model '" + el.getName() + "' is not regularly retrained.");
			} else {
				this.addInfo("6. ML Model '" + el.getName() + "' is regularly retrained.");
			}
		}

		// ---------------------------------------------------------
		// Overall result

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

	@Override
	public String getThreatCommentAttribute() {
		return THREAT_COMMENT_ATTRIBUTE;
	}
	
	@Override
	public String getThreatName() {
		return THREAT_NAME;
	}

}
