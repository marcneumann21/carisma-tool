package carisma.check.euaiactdocumentation.check;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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

		addInfo("Your model contains " + aiSystems.size() + (aiSystems.size() > 1 ? " AI Systems" : " AI System"));
		addInfo("");

		boolean completeDocumentation = true;
		for (Component aiSystem : aiSystems) {
			EUAIActRiskClassifier classifier = new EUAIActRiskClassifier(aiSystem);
			EUAIActRiskClassificationResult result = classifier.classify();
			EUAIActRiskClass riskClass = result.riskClass();

			boolean highRisk = false;

			addInfo("");

			addInfo("#".repeat(57));
			addInfo("Generated documentation of the AI system '" + aiSystem.getName() + "':");

			// the AI system and its ML model are separate elements, otherwise the model
			// tags cannot be assigned to the model
			if (EUAIActComplianceUtil.hasStereotype(aiSystem, EUAIActCompliance.SelfDevelopedModel)) {
				addError("The component '" + aiSystem.getName()
						+ "' has both 'AISystem' and 'SelfDevelopedModel' applied. Model the ML model as a separate component and connect it to the AI system.");
				completeDocumentation = false;
				addInfo("#".repeat(57));
				continue;
			}

			if (riskClass == EUAIActRiskClass.Unacceptable) {
				addWarning("No technical documentation is generated, because the AI system '" + aiSystem.getName()
						+ "' must not be placed on the market, put into service or used (Article 5).");
				addInfo("#".repeat(57));
				continue;
			} else if (riskClass == EUAIActRiskClass.High) {
				if (result.annexISectionB()) {
					addWarning("No technical documentation is generated, because the AI system '" + aiSystem.getName()
							+ "' falls under Section B of Annex I. Article 11 and Annex IV do not apply (Article 2(2)).");
					addInfo("#".repeat(57));
					continue;
				}
				addInfo("The technical documentation is mandatory for the AI system '" + aiSystem.getName()
						+ "' (Article 11 and Annex IV).");
				highRisk = true;
				addInfo("#".repeat(57));
			} else if (riskClass == EUAIActRiskClass.Limited) {
				addInfo("The technical documentation is not mandatory for the AI system '" + aiSystem.getName()
						+ "' (Article 11). The following information is for transparency purposes.");
				addInfo("#".repeat(57));
			} else if (riskClass == EUAIActRiskClass.Minimal) {
				addInfo("No technical documentation is required, because the AI system '" + aiSystem.getName()
						+ "' is classified as minimal risk.");
				addInfo("#".repeat(57));
				continue;
			} else {
				addWarning("No technical documentation is generated, because the risk class of the AI system '"
						+ aiSystem.getName() + "' could not be determined.");
				addInfo("#".repeat(57));
				continue;
			}

			addInfo("");

			EUAIActDocumentationGenerator generator = new EUAIActDocumentationGenerator(aiSystem, highRisk);
			List<EUAIActDocumentationSectionResult> sections = generator.generateDocumentation();

			addInfo("=".repeat(50));
			addInfo("DOCUMENTED");
			addInfo("=".repeat(50));
			addInfo("");

			for (EUAIActDocumentationSectionResult section : sections) {

				// for not high risk systems only sections with content are printed,
				// because Annex IV is not mandatory for them
				if (riskClass != EUAIActRiskClass.High && section.foundDocumentation().isEmpty()) {
					continue;
				}

				addInfo("-".repeat(70));
				addInfo(section.sectionName().toString());
				addInfo("-".repeat(70));
				if (section.foundDocumentation().isEmpty()) {
					addInfo("None");
				} else {
					for (String documentation : section.foundDocumentation()) {
						addInfo(documentation);
					}
				}
				addInfo("");

			}

			addInfo("=".repeat(50));
			if (riskClass == EUAIActRiskClass.High) {
				addInfo("MISSING & NOTES");
			} else {
				addInfo("NOTES");
			}
			addInfo("=".repeat(50));
			addInfo("");

			// group missing documentation and notes by model element
			Map<String, List<String>> missingPerElement = new LinkedHashMap<>();
			Map<String, List<String>> notesPerElement = new LinkedHashMap<>();
			Set<String> elementNames = new LinkedHashSet<>();
			for (EUAIActDocumentationSectionResult section : sections) {

				for (String line : section.missingDocumentation()) {
					int end = line.indexOf("' (") + 1;
					String elementName = line.substring(0, end);
					String text = line.substring(end + 1);
					elementNames.add(elementName);
					if (!missingPerElement.containsKey(elementName)) {
						missingPerElement.put(elementName, new ArrayList<>());
					}
					missingPerElement.get(elementName).add(text);
				}

				for (String line : section.notes()) {
					int end = line.indexOf("' (") + 1;
					String elementName = line.substring(0, end);
					String text = line.substring(end + 1);
					elementNames.add(elementName);
					if (!notesPerElement.containsKey(elementName)) {
						notesPerElement.put(elementName, new ArrayList<>());
					}
					notesPerElement.get(elementName).add(text);
				}

			}

			// if no section has missing documentation or notes, print "None"
			if (elementNames.isEmpty()) {
				addInfo("None");
				addInfo("");
			}

			for (String elementName : elementNames) {
				List<String> missing = missingPerElement.get(elementName);
				List<String> notes = notesPerElement.get(elementName);

				addInfo("-".repeat(70));
				addInfo(elementName);
				addInfo("-".repeat(70));

				if (riskClass == EUAIActRiskClass.High && missing != null) {
					addInfo("Missing:");
					for (String documentation : missing) {
						addInfo(documentation);
					}
					completeDocumentation = false;
					addInfo("");
				}

				if (notes != null) {
					addInfo("Notes:");
					for (String note : notes) {
						addInfo(note);
					}
					addInfo("");

				}
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