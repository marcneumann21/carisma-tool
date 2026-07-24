package carisma.check.euaiactriskclassification.classification;

import java.util.List;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UseCase;

import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActRiskClassifier {

	/**
	 * Classifies the given AI system and records why it was classified that way.
	 *
	 * @param aiSystem the AI system component which is stereotyped as one
	 * @param reasons  collects the reasoning for the classification
	 * @return the highest applicable risk class
	 */
	public EUAIActRiskClass classify(Component aiSystem, List<String> reasons) {

		if (aiSystem.getUseCases().isEmpty()) {
			reasons.add("No use case is assigned to the AI system, therefore is a classification not possible.");
			return EUAIActRiskClass.UNDETERMINED;
		}

		boolean unacceptable = false;
		boolean high = false;
		boolean limited = false;

		for (UseCase uc : aiSystem.getUseCases()) {

			// Art. 5 - Prohibited AI Practices
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ManipulativeBehaviour)) {
				reasons.add("'" + uc.getName() + "': manipulative techniques (Art. 5 Par. 1 lit. a)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ExploitingVulnerability)) {
				reasons.add("'" + uc.getName() + "': exploitation of vulnerabilities (Art. 5 Par. 1 lit. b)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SocialScoring)) {
				reasons.add("'" + uc.getName() + "': social scoring (Art. 5 Par. 1 lit. c)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.PredictivePolicing)) {
				reasons.add("'" + uc.getName() + "': predictive policing (Art. 5 Par. 1 lit. d)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Profiling)) {
				reasons.add("'" + uc.getName() + "': profiling of a natural person (Art. 5 Par. 1 lit. d)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.FacialRecognition)
					&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.FacialRecognition,
							new String[] { "Internet", "CCTV" })) {
				List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.FacialRecognition,
						new String[] { "Internet", "CCTV" });
				reasons.add("'" + uc.getName() + "': untargeted scraping of facial images from the "
						+ trueAttributes.toString() + " footage (Art. 5 Par. 1 lit. e)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.FacialRecognition)
					&& !EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.FacialRecognition,
							new String[] { "Internet", "CCTV" })) {
				reasons.add("'" + uc.getName()
						+ "': facial recognition is declared, but no untargeted scraping applies, therefore high risk (Annex III No. 1 lit. a).");
				high = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
					&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
							new String[] { "Workplace", "Education" })) {
				List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.EmotionRecognition, new String[] { "Workplace", "Education" });
				reasons.add("'" + uc.getName() + "': emotion recognition in the " + trueAttributes.toString()
						+ " (Art. 5 Par. 1 lit. f)");
				unacceptable = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
					&& !EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
							new String[] { "Workplace", "Education" })) {
				reasons.add("'" + uc.getName()
						+ "': emotion recognition is declared, but no prohibited context applies, therefore high risk (Annex III No. 1 lit. c)");
				high = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)
					&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricCategorisation,
							new String[] { "Race", "Politics", "UnionMembership", "Religion", "Sexuality" })) {
				boolean exception = EUAIActComplianceUtil.isAnyTaggedValueTrue(uc,
						EUAIActCompliance.BiometricCategorisation,
						new String[] { "LawfullyAcquiredDatasets", "LawEnforcement" });
				if (!exception) {
					reasons.add("'" + uc.getName() + "': biometric categorisation (Art. 5 Par. 1 lit. g)");
					unacceptable = true;
				} else {
					List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
							EUAIActCompliance.BiometricCategorisation,
							new String[] { "LawfullyAcquiredDatasets", "LawEnforcement" });
					reasons.add("'" + uc.getName() + "': biometric categorisation covered by the exception(s) "
							+ trueAttributes.toString() + ", therefore high risk (Art. 5 Par. 1 lit. g)");
					high = true;
				}
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)
					&& !EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricCategorisation,
							new String[] { "Race", "Politics", "UnionMembership", "Religion", "Sexuality" })) {
				reasons.add("'" + uc.getName()
						+ "': biometric categorisation is declared, but no protected attribute applies, therefore high risk (Annex III No. 1 lit. b)");
				high = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)
					&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
							"PublicSpace")) {
				boolean exception = EUAIActComplianceUtil.isAnyTaggedValueTrue(uc,
						EUAIActCompliance.BiometricIdentification,
						new String[] { "VictimSearch", "ThreatPrevention", "CriminalSuspectSearch" });
				if (!exception) {
					reasons.add("'" + uc.getName()
							+ "': 'real-time' remote biometric identification in publicly accessible spaces (Art. 5 Par. 1 lit. h)");
					unacceptable = true;
				} else {
					List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
							EUAIActCompliance.BiometricIdentification,
							new String[] { "VictimSearch", "ThreatPrevention", "CriminalSuspectSearch" });
					reasons.add("'" + uc.getName()
							+ "': 'real-time' biometric identification covered by the exception(s) "
							+ trueAttributes.toString() + ", therefore high risk (Art. 5 Par. 1 lit. h)");
					high = true;
				}
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)
					&& !EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
							"PublicSpace")) {
				reasons.add("'" + uc.getName()
						+ "': 'real-time' biometric identification is declared, but not in publicly accessible spaces, therefore high risk (Annex III No. 1 lit. a)");
				high = true;
			}

			// Annex III - High-Risk AI Systems Referred to in Article 6(2)
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.AnnexIIIUseCase)) {
				boolean annexIIIArea = EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.AnnexIIIUseCase,
						new String[] { "BiometricIdentification", "BiometricCategorisation", "CriticalInfrastructure",
								"Education", "HumanEmployment", "EssentialServices", "Law", "Migration", "Justice" });
				boolean art6Exception = EUAIActComplianceUtil.isAnyTaggedValueTrue(uc,
						EUAIActCompliance.AnnexIIIUseCase,
						new String[] { "NarrowProceduralTask", "ImprovesHumanActivity", "PreparatoryTask" });
				if (annexIIIArea && !art6Exception) {
					List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
							EUAIActCompliance.AnnexIIIUseCase,
							new String[] { "BiometricIdentification", "BiometricCategorisation",
									"CriticalInfrastructure", "Education", "HumanEmployment", "EssentialServices",
									"Law", "Migration", "Justice" });
					reasons.add("'" + uc.getName() + "': Annex III area of application: " + trueAttributes.toString()
							+ ", therefore high risk (Art. 6 Par. 2)");
					high = true;
				} else if (annexIIIArea) {
					List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
							EUAIActCompliance.AnnexIIIUseCase,
							new String[] { "NarrowProceduralTask", "ImprovesHumanActivity", "PreparatoryTask" });
					reasons.add("'" + uc.getName() + "': Annex III area but covered by the exception(s) "
							+ trueAttributes.toString() + ", therefore not high risk (Art. 6 Par. 3)");
					// TODO then Limited risk?
				}
			}

			// Art. 50 - Transparency Obligations for Providor and Deployer
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanInteraction)) {
				reasons.add("'" + uc.getName() + "': interaction with natural persons (Art. 50 Par. 1)");
				limited = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SyntheticContent)) {
				reasons.add("'" + uc.getName() + "': synthetic content (Art. 50 Par. 2)");
				limited = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognitionNotification)
					|| EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorizationNotification)) {
				reasons.add("'" + uc.getName() + "': emotion recognition or biometric categorisation (Art. 50 Par. 3)");
				limited = true;
			}
			if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Deepfake)) {
				if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.PublicInterestText)) {
					reasons.add("'" + uc.getName()
							+ "': deep fake, but covered by text of public interest exception, therefore not limited risk (Art. 50 Par. 4)");
				} else {
					reasons.add("'" + uc.getName() + "': generates or manipulates deep fake content (Art. 50 Par. 4)");
					limited = true;
				}
			}
		}

		// Annex I - List of Union Harmonisation Legislation
		if (EUAIActComplianceUtil.isAnyTaggedValueTrue(aiSystem, EUAIActCompliance.SafetyComponent,
				new String[] { "Toy", "Machinery", "Elevator", "Medical", "InVitroDiagnostics", "PersonalProtective",
						"CivilAviation", "RailSystem", "Agricultural" })) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(aiSystem, EUAIActCompliance.AnnexIIIUseCase,
					new String[] { "Toy", "Machinery", "Elevator", "Medical", "InVitroDiagnostics",
							"PersonalProtective", "CivilAviation", "RailSystem", "Agricultural" });
			reasons.add(
					"Component '" + aiSystem.getName() + "': safety component under Union harmonisation legislation: "
							+ trueAttributes.toString() + " (Art. 6 Par. 1, Annex I)");
			high = true;
		}

		if (unacceptable)

		{
			return EUAIActRiskClass.UNACCEPTABLE;
		}
		if (high) {
			return EUAIActRiskClass.HIGH;
		}
		if (limited) {
			return EUAIActRiskClass.LIMITED;
		}
		reasons.add("No characteristics of a higher risk class were found.");
		return EUAIActRiskClass.MINIMAL;
	}

	/**
	 * Returns the display name of the given risk class for the check result output.
	 *
	 * @param riskClass the classified risk class
	 * @return a human readable name including the articles it is based on.
	 */
	public static String getDisplayName(EUAIActRiskClass riskClass) {
		switch (riskClass) {
		case UNACCEPTABLE:
			return "Unnacceptable Risk (Art. 5)";
		case HIGH:
			return "High Risk (Art. 6, Annex I/III)";
		case LIMITED:
			return "Limited Risk (Art. 50)";
		case MINIMAL:
			return "Minimal Risk";
		default:
			return "No Risk Class appliciable";
		}
	}
}