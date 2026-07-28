package carisma.check.euaiactriskclassification.classification;

import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

// TODO JavaDoc
/**
 * Data container for the riskclass and the reasoning of this entscheidhng.
 *
 */
public record EUAIActRiskClassificationResult(EUAIActRiskClass riskClass, List<String> reasons,
		List<String> obligations) {
};
