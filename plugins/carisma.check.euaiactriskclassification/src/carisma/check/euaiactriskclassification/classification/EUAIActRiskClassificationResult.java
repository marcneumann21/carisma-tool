package carisma.check.euaiactriskclassification.classification;

import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

/**
 * Data container for the result of the risk classification.
 *
 * @param riskClass             the determined risk class
 * @param reasons               list of the reasons for the classification
 * @param obligations           list of the obligations of the risk class
 * @param additionalObligations list of the additional obligations
 * @param notes                 list of the notes
 * @param annexISectionB        true if only Section B of Annex I applies
 */
public record EUAIActRiskClassificationResult(EUAIActRiskClass riskClass, List<String> reasons,
		List<String> obligations, List<String> additionalObligations, List<String> notes, boolean annexISectionB) {
};
