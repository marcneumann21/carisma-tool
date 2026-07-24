package carisma.check.euaiactdocumentation.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Component;

import carisma.check.euaiactdocumentation.common.AbstractEUAIActDocumentationCheck;
import carisma.check.euaiactdocumentation.verification.EUAIActDocumentationVerifier;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassifier;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.core.checks.CarismaCheckWithID;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

/**
 * Documents the AI systems of a UML model corresponding the EU AI Act.
 * 
 * @author Marc Neumann
 *
 */
public class EUAIActDocumentationCheck extends AbstractEUAIActDocumentationCheck implements CarismaCheckWithID {

	public static final String CHECK_ID = "carisma.check.euaiactdocumentation";
	public static final String CHECK_NAME = "EU AI Act Documentation Check";

	@Override
	public boolean runCheck() {
		Set<Component> aiSystems = EUAIActComplianceUtil.getStereotypedElements(model, Component.class,
				EUAIActCompliance.AISystem);

		if (aiSystems.isEmpty()) {
			addInfo("Your model does not contain any AI system.");
			return false;
		}
		addInfo("Your model contains " + aiSystems.size() + " AI system(s).");

		EUAIActRiskClassifier classifier = new EUAIActRiskClassifier();
		boolean completeDocumentation = true;

		for (Component aiSystem : aiSystems) {
			List<String> reasons = new ArrayList<>();
			EUAIActRiskClass riskClass = classifier.classify(aiSystem, reasons);
			EUAIActDocumentationVerifier verifier = new EUAIActDocumentationVerifier(riskClass);

			addInfo("AI System '" + aiSystem.getName() + "' is classified as: "
					+ EUAIActRiskClassifier.getDisplayName(riskClass));

			if (riskClass == EUAIActRiskClass.UNACCEPTABLE) {
				addInfo("No required documentations, because the system must not be placed on the market, put into service or used (Art. 5: Prohibited AI Practices).");
				return false;
			}

			List<String> requiredDocumentation = new ArrayList<>();
			List<String> foundDocumentation = new ArrayList<>();
			List<String> missingDocumentation = new ArrayList<>();

			boolean completeAISystemDocumentation = verifier.verify(aiSystem, requiredDocumentation, foundDocumentation,
					missingDocumentation);

			if (requiredDocumentation.isEmpty()) {
				addInfo("No documentation is required for this risk class.");
				continue;
			}

			addInfo("Required Documentation(s):");
			addInfo("================");
			for (String documentation : requiredDocumentation) {
				addInfo(documentation);
			}
			addInfo("\n");
			addInfo("Found Documentation(s):");
			addInfo("================");
			for (String documentation : foundDocumentation) {
				addInfo(documentation);
			}
			addInfo("\n");
			addInfo("Missing Documentation(s):");
			addInfo("================");
			for (String documentation : missingDocumentation) {
				addInfo(documentation);
			}

			if (!completeAISystemDocumentation) {
				completeDocumentation = false;
			}
		}

		return completeDocumentation;
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