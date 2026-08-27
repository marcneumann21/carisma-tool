package carisma.check.euaiactriskclassification.classification;

import java.util.List;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;

// TODO JavaDoc 
public record EUAIActRiskClassificationResult(EUAIActRiskClass riskClass, List<String> reasons,
		List<String> obligations, List<String> additionalObligations, List<String> notes, boolean annexISectionB) {
};
