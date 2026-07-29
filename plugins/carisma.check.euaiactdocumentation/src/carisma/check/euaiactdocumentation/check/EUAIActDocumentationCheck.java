package carisma.check.euaiactdocumentation.check;

import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Component;

import carisma.check.euaiactdocumentation.common.AbstractEUAIActDocumentationCheck;
import carisma.check.euaiactdocumentation.generation.EUAIActDocumentationGenerator;
import carisma.check.euaiactdocumentation.section.EUAIActDocumentationSectionResult;
import carisma.check.euaiactriskclassification.classification.EUAIActRiskClassificationResult;
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
			addInfo("Your model does not contain any AI systems.");
			return false;
		}
		addInfo("Your model contains " + aiSystems.size() + " AI system(s).");

		for (Component aiSystem : aiSystems) {
			EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(aiSystem);
			EUAIActRiskClassificationResult result = classifier.classify();
			EUAIActRiskClass riskClass = result.riskClass();

			EUAIActDocumentationGenerator generator = new EUAIActDocumentationGenerator(aiSystem);

			if (riskClass == EUAIActRiskClass.Unacceptable) {
				addInfo("No required Documentation. The system must not be placed on the market, put into service or used according to Article 5.");
				continue;
			}

			addInfo("Documentation for AI System '" + aiSystem.getName() + "' (" + riskClass + ")");

			List<EUAIActDocumentationSectionResult> sections = generator.generate();
			for (EUAIActDocumentationSectionResult section : sections) {
				addInfo(section.sectionName().toString());
				addInfo("================");
				addInfo("Found Documentation(s):");
				for (String documentation : section.foundDocumentation()) {
					addInfo(documentation);
				}
				addInfo("Missing Documentation(s):");
				for (String documentation : section.missingDocumentation()) {
					addInfo(documentation);
				}
				addInfo("\n");
				if (!section.missingDocumentation().isEmpty()) {
					return false;
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