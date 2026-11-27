package carisma.check.mltop10checks.aisupplychain;

import java.util.Set;

import org.eclipse.uml2.uml.NamedElement;

import carisma.check.mltop10checks.common.AbstractMLTop10Check;
import carisma.core.checks.CarismaCheckWithID;
import carisma.profile.umlsec.mltop10.MLTop10;
import carisma.profile.umlsec.mltop10.MLTop10Util;

/**
 * analyzes an deployment diagram with respect to ai supply chain rules.
 * 
 * @author Alexander Peikert
 * @author Julian Flake
 *
 */

public class AISupplyChainCheck extends AbstractMLTop10Check implements CarismaCheckWithID {

	public static final String CHECK_ID = "carisma.check.mltop10checks.aisupplychain";
	public static final String CHECK_NAME = "MLTop10 AI Supply Chain Attack Check";
	public static final String THREAT_COMMENT_ATTRIBUTE = "AISupplyChain";
	public static final String THREAT_NAME = "MLTop10 AI Supply Chain Attack";

	@Override
	public boolean runCheck() {

		// ---------------------------------------------------------
		// populate collections
		Set<NamedElement> aiscenarios = MLTop10Util.getStereotypedElements(modelEl, NamedElement.class,
				MLTop10.SecureAIService);

		// ---------------------------------------------------------
		// Check numbers of elements relevant for this check
		this.addInfo("Your model contains " + aiscenarios.size() + " Secure AI Service(s).");

		if (aiscenarios.isEmpty()) {
			this.addInfo(
					"Your model does not contain any information on the Secure AI Service. Therefore, it cannot be ensured that your scenario contains mitigations against 'AI Supply Chain Attack'.");
		}
		if (aiscenarios.size() > 1) {
			this.addInfo(
					"Your model contains more than one Secure AI Service Elements. Check, whether this is intended.");
		}

		// ---------------------------------------------------------
		// Check the specific prevention mechanisms
		// ---------------------------------------------------------

		// ---------------------------------------------------------
		// 1. Verify packages integrity
		for (NamedElement el : aiscenarios) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.SecureAIService, "PackageIntegrityVerified")) {
				this.addWarning("1. Secure AI Service '" + el.getName() + "' does not verify the package integrity.");
			} else {
				this.addInfo("1. Secure AI Service '" + el.getName() + "' verifies the package integrity.");
			}
		}

		// ---------------------------------------------------------
		// 2. Keep packages versions up-to-date
		for (NamedElement el : aiscenarios) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.SecureAIService, "RegularPackageUpdates")) {
				this.addWarning("2. Secure AI Service '" + el.getName() + "' does not keep the packages up-to-date.");
			} else {
				this.addInfo("2. Secure AI Service '" + el.getName() + "' keeps the packages up-to-date.");
			}
		}

		// ---------------------------------------------------------
		// 3. Install packages from secure sources
		for (NamedElement el : aiscenarios) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.SecureAIService, "PackagesFromSecureSources")) {
				this.addWarning(
						"3. Secure AI Service '" + el.getName() + "' does not use packages from secure sources.");
			} else {
				this.addInfo("3. Secure AI Service '" + el.getName() + "' uses packages from secure sources.");
			}
		}

		// ---------------------------------------------------------
		// 4. Deploy ML infrastructure securely
		for (NamedElement el : aiscenarios) {
			if (!MLTop10Util.isTaggedValueTrue(el, MLTop10.SecureAIService, "SecureDeployment")) {
				this.addWarning("4. Secure AI Service '" + el.getName() + "' does not perform a secure deployment.");
			} else {
				this.addInfo("4. Secure AI Service '" + el.getName() + "' performs a secure deployment.");
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
