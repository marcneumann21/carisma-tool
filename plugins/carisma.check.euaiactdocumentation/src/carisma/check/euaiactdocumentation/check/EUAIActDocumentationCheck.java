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
			addError("Your model does not contain any AI systems.");
			return false;
		}

		addInfo("Your model contains " + aiSystems.size() + " AI systems.");
		addInfo("");

		boolean completeDocumentation = true;
		for (Component aiSystem : aiSystems) {
			EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(aiSystem);
			EUAIActRiskClassificationResult result = classifier.classify();
			EUAIActRiskClass riskClass = result.riskClass();

			boolean highRisk = false;

			addInfo("");

			addInfo("#".repeat(50));
			addInfo("Generated documentation of the AI system '" + aiSystem.getName() + "':");

			if (riskClass == EUAIActRiskClass.Unacceptable) {
				addWarning("No technical documentation is generated, because the AI system '" + aiSystem.getName()
						+ "' must not be placed on the market, put into service or used (Article 5).");
				addInfo("#".repeat(50));
				continue;
			} else if (riskClass == EUAIActRiskClass.High) {
				if (result.annexISectionB()) {
					addWarning("No technical documentation is generated, because the AI system '" + aiSystem.getName()
							+ "' falls under Section B of Annex I. Article 11 and Annex IV do not apply (Article 2(2)).");
					addInfo("#".repeat(50));
					continue;
				}
				addInfo("The Technical documentation is mandatory for the AI system '" + aiSystem.getName()
						+ "' (Article 11 and Annex IV).");
				highRisk = true;
				addInfo("#".repeat(50));
			} else if (riskClass == EUAIActRiskClass.Limited) {
				addInfo("The technical documentation is not mandatory for the AI system '" + aiSystem.getName()
						+ "' (Article 11). The following information is for transparency purposes.");
				addInfo("#".repeat(50));
			} else if (riskClass == EUAIActRiskClass.Minimal) {
				addInfo("No technical documentation is required, because the AI system '" + aiSystem.getName()
						+ "' is classified as minimal risk.");
				addInfo("#".repeat(50));
				continue;
			} else {
				addWarning("No technical documentation is generated, because the risk class of the AI system '"
						+ aiSystem.getName() + "' could not be determined.");
				addInfo("#".repeat(50));
				continue;
			}

			addInfo("");

			EUAIActDocumentationGenerator generator = new EUAIActDocumentationGenerator(aiSystem, highRisk);
			List<EUAIActDocumentationSectionResult> sections = generator.generate();
			for (EUAIActDocumentationSectionResult section : sections) {

				// for not high risk systems only sections with content are printed,
				// because Annex IV is not mandatory for them
				if (riskClass != EUAIActRiskClass.High && section.foundDocumentation().isEmpty()
						&& section.notes().isEmpty()) {
					continue;
				}

				addInfo("=".repeat(50));
				addInfo(section.sectionName().toString());
				addInfo("=".repeat(50));

				addInfo("Documented:");
				addInfo("----------------");
				if (section.foundDocumentation().isEmpty()) {
					addInfo("None");
				} else {
					for (String documentation : section.foundDocumentation()) {
						addInfo(documentation);
					}
				}

				addInfo("");

				if (riskClass == EUAIActRiskClass.High) {
					addInfo("Missing:");
					addInfo("----------");
					if (section.missingDocumentation().isEmpty()) {
						addInfo("None");
					} else {
						for (String documentation : section.missingDocumentation()) {
							addInfo(documentation);
						}
						completeDocumentation = false;
					}

					addInfo("");
				}

				addInfo("Notes:");
				addInfo("--------");
				if (section.notes().isEmpty()) {
					addInfo("None");
				} else {
					for (String note : section.notes()) {
						addInfo(note);
					}
				}

				addInfo("");
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