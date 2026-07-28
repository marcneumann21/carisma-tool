package carisma.check.euaiactriskclassification.classification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UseCase;

import carisma.check.euaiactriskclassification.obligation.EUAIActRiskClassificationObligation;
import carisma.check.euaiactriskclassification.riskclass.EUAIActRiskClass;
import carisma.profile.euaiactcompliance.EUAIActCompliance;
import carisma.profile.euaiactcompliance.EUAIActComplianceUtil;

public class EUAIActRiskClassifier {

	private final Component aiSystem;
	private final List<String> reasons = new ArrayList<>();
	private final List<String> additionalObligations = new ArrayList<>();

	public EUAIActRiskClassifier(Component aiSystem) {
		this.aiSystem = aiSystem;
	}

	// TODO JavaDoc
	public EUAIActRiskClassificationResult classify() {
		boolean unacceptableRisk = false;
		boolean highRisk = false;
		boolean limitedRisk = false;

		if (this.aiSystem.getUseCases().isEmpty()) {
			this.reasons.add("No use case is assigned to the AI system, therefore is a classification not possible.");
			return buildClassificationResult(EUAIActRiskClass.Undetermined);
		}

		// Annex I safety component according to Article 6(1)
		boolean safetyComponent = false;
		if (EUAIActComplianceUtil.hasStereotype(this.aiSystem, EUAIActCompliance.ProductEmbedding)
				&& checkSafetyComponent()) {
			highRisk = true;
			safetyComponent = true;
		}

		for (UseCase uc : aiSystem.getUseCases()) {

			// Prohibited AI practices according to Article 5
			if (checkUnacceptableRisk(uc)) {
				unacceptableRisk = true;
				continue;
			}

			// Annex III usecases and exceptions of those according to Article 6(2) &
			// Article 6(3)
			boolean ucHighRisk = checkHighRisk(uc);
			if (ucHighRisk) {
				highRisk = true;
			}

			// Transparency obligations according to Article 50
			boolean ucLimitedRisk;
			if (ucHighRisk || safetyComponent) {
				ucLimitedRisk = checkLimitedRisk(uc, false);
			} else {
				ucLimitedRisk = checkLimitedRisk(uc, true);
			}
			if (!ucHighRisk && !safetyComponent && ucLimitedRisk) {
				limitedRisk = true;
			}
		}

		if (unacceptableRisk) {
			return buildClassificationResult(EUAIActRiskClass.Unacceptable);
		}

		if (highRisk) {
			return buildClassificationResult(EUAIActRiskClass.High);
		}

		if (limitedRisk) {
			return buildClassificationResult(EUAIActRiskClass.Limited);
		}

		this.reasons.add("No characteristics of a higher risk class were found.");
		return buildClassificationResult(EUAIActRiskClass.Minimal);

	}

	// TODO JavaDoc
	private boolean checkSafetyComponent() {
		String role = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding, "Role");
		if (role == null) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': specify whether the AI system is a safety component of the product or the product itself. A precise justification is not possible without this specification.");
			return false;
		}
		boolean productItself = role.equalsIgnoreCase("ProductItself");

		String productCategory = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding,
				"ProductCategory");
		if (productCategory == null) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': specify which category the AI system is a safety component of. A precise justification is not possible without this specification.");
			return false;
		}

		boolean endangersSafety = EUAIActComplianceUtil.isTaggedValueTrue(this.aiSystem,
				EUAIActCompliance.ProductEmbedding, "FailureEndangerSafety");
		boolean thirdPartyAssessment = EUAIActComplianceUtil.isTaggedValueTrue(this.aiSystem,
				EUAIActCompliance.ProductEmbedding, "ThirdPartyConformityAssessment");

		if (!productItself && !endangersSafety) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': the AI system is a component of the product, but a failure of it does not endanger the health and safety of persons or property, therefore it is not a safety component according to Article 3(14).");
			return false;
		}
		if (!thirdPartyAssessment) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': the product does not have to undergo a third party conformity assessment, therefore the AI system is not high risk according to Article 6(1)(b).");
			return false;
		}
		// TODO add in Obligations
		if (productItself) {

			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': the AI system is itself a product of the category " + productCategory + " of Annex I.");
		} else {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': the AI system is a safety component of a product of the category " + productCategory
					+ " of Annex I.");
		}
		this.additionalObligations
				.add("The AI system has to undergo a third party conformity assessment according to Article 6(1).");
		return true;
	}

	// TODO JavaDoc
	private boolean checkUnacceptableRisk(UseCase uc) {
		boolean unacceptableRisk = false;
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ManipulativeBehaviour)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.ManipulativeBehaviour,
					new String[] { "SubliminalTechniques", "DeceptiveTechniques" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': Specify whether a manipulative or deceptive technique is used. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': detected " + String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(a).");
			}
			unacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ExploitingHumanVulnerability)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.ExploitingHumanVulnerability,
					new String[] { "Age", "Disability", "Social", "Economic" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': Specify which vulnerability of a person or group of persons is exploited. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': exploits the vulnerability "
						+ String.join(", ", trueAttributes)
						+ " of a person or a group of persons, therefore unacceptable risk according to Article 5(1)(b).");
			}
			unacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SocialScoring)) {
			this.reasons.add("'" + uc.getName()
					+ "': evaluates natural persons based on their social behaviour, therefore unacceptable risk according to Article 5(1)(c).");
			unacceptableRisk = true;
		}

		// Article 5(1)(d) predicting criminal offences solely based on profiling
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.LawEnforcement)
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
						"OffendingRiskAssessment")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
						"SolelyProfilingBased")) {
			if (!EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
					"ImprovesHumanActivity")) {
				this.reasons.add("'" + uc.getName()
						+ "': assesses the risk of a natural person committing a criminal offence solely based on profiling or on the assessment of personality traits, therefore unacceptable risk according to Article 5(1)(d).");
				unacceptableRisk = true;
			} else {
				this.reasons.add("'" + uc.getName()
						+ "': assesses the risk of a natural person committing a criminal offence, but supports a human activity, therefore it is not prohibited according to Article 5(1)(d).");
			}
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.FacialImageScraping)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.FacialImageScraping,
					new String[] { "Internet", "CCTV" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': Specify the source of the untargeted scraping of facial images. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': untargeted scraping of facial images from "
						+ String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(e).");
			}
			unacceptableRisk = true;
		}

		// Article 5(1)(f) emotion recognition at the workplace and in education
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
				&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
						new String[] { "Workplace", "Education" })) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.EmotionRecognition,
					new String[] { "Workplace", "Education" });
			if (!EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
					"MedicalOrSafetyReason")) {
				this.reasons.add("'" + uc.getName() + "': infers the emotions of natural persons in the context "
						+ String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(f).");
				unacceptableRisk = true;
			} else {
				this.reasons.add("'" + uc.getName() + "': infers the emotions of natural persons in the context "
						+ String.join(", ", trueAttributes)
						+ ", but is put into service for medical or safety reasons, therefore it is not prohibited according to Article 5(1)(f).");
			}
		}

		// Article 5(1)(g) biometric categorisation
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)
				&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricCategorisation,
						new String[] { "DeduceRace", "DeducePoliticalOpinion", "DeduceUnionMembership",
								"DeduceReligiousBelief", "DeduceSexuality" })) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.BiometricCategorisation, new String[] { "DeduceRace", "DeducePoliticalOpinion",
							"DeduceUnionMembership", "DeduceReligiousBelief", "DeduceSexuality" });
			if (!EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricCategorisation,
					new String[] { "LawfulDatasetLabeling", "LawEnforcementCategorisation" })) {
				this.reasons.add("'" + uc.getName() + "': categorises natural persons to derive "
						+ String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(g).");
				unacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricCategorisation,
						new String[] { "LawfulDatasetLabeling", "LawEnforcementCategorisation" });
				this.reasons.add("'" + uc.getName() + "': categorises natural persons to derive "
						+ String.join(", ", trueAttributes) + ", but is covered by the exception "
						+ String.join(", ", exceptions)
						+ ", therefore it is not prohibited according to Article 5(1)(g).");
			}
		}

		// Article 5(1)(h) real-time remote biometric identification for law enforcement
		// TODO add Annex II?
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"RemoteIdentification")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification, "RealTime")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"PubliclyAccessibleSpace")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"LawEnforcementPurpose")) {
			if (!EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
					new String[] { "VictimSearch", "ImminentThreatPrevention", "SeriousCrimeSuspectSearch" })) {
				this.reasons.add("'" + uc.getName()
						+ "': uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, therefore unacceptable risk according to Article 5(1)(h).");
				unacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricIdentification,
						new String[] { "VictimSearch", "ImminentThreatPrevention", "SeriousCrimeSuspectSearch" });
				this.reasons.add("'" + uc.getName()
						+ "': uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, but is covered by the exception "
						+ String.join(", ", exceptions)
						+ ", therefore it is not prohibited, but requires a prior authorisation and a registration according to Article 5(1)(h)(iii), Article 5(2), Article 5(3).");
			}
		}
		return unacceptableRisk;
	}

	// TODO JavaDoc
	private boolean checkHighRisk(UseCase uc) {
		boolean highRisk = false;

		// Annex III(1)(a) biometric identification
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.BiometricIdentification, new String[] { "RemoteIdentification" });
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
					"VerificationOnly")) {
				this.reasons.add("'" + uc.getName()
						+ "': the purpose is to verify the identity of a natural person, therefore not high risk according to Annex III(1)(a).");
			} else if (!checkAnnexIIIException(uc, EUAIActCompliance.BiometricIdentification, trueAttributes,
					"Annex III(1)(a)")) {
				highRisk = true;
			}
		}

		// Annex III(1)(b) biometric categorisation
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)) {
			// No area tag exists here, therefore the stereotype itself is the area. Passing it as a constant
			// also lets checkAnnexIIIException reach the Article 6(3) check instead of returning early
			List<String> applicationArea = Arrays.asList("biometric categorisation");
			if (!checkAnnexIIIException(uc, EUAIActCompliance.BiometricCategorisation, applicationArea,
					"Annex III(1)(b)")) {
				highRisk = true;
			}
		}

		// Annex III(1)(c) emotion recognition
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)) {
			// same as in Annex III(1)(b)
			List<String> applicationArea = Arrays.asList("emotion recognition");
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EmotionRecognition, applicationArea, "Annex III(1)(c)")) {
				highRisk = true;
			}
		}

		// Annex III(2) critical infrastructure
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.CriticalInfrastructure)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.CriticalInfrastructure, new String[] { "DigitalInfrastructure", "RoadTraffic",
							"WaterSupply", "GasSupply", "HeatSupply", "ElectricitySupply" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.CriticalInfrastructure, trueAttributes, "Annex III(2)")) {
				highRisk = true;
			}
		}

		// Annex III(3) education
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Education)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.Education,
					new String[] { "AccessAdmission", "LearningOutcomeEvaluation", "EducationLevelAssessment",
							"ExamMonitoring" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.Education, trueAttributes, "Annex III(3)")) {
				highRisk = true;
			}
		}

		// Annex III(4) employment
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanEmployment)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.HumanEmployment,
					new String[] { "Recruitment", "WorkConditionsDecisions" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.HumanEmployment, trueAttributes, "Annex III(4)")) {
				highRisk = true;
			}
		}

		// Annex III(5) essential services
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EssentialService)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.EssentialService,
					new String[] { "PublicBenefitsEligibility", "Creditworthiness", "InsuranceRiskPricing",
							"EmergencyDispatch" });
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.EssentialService, "FraudDetectionOnly")
					&& trueAttributes.remove("Creditworthiness")) {
				this.reasons.add("'" + uc.getName()
						+ "': 'Creditworthiness' is not taken into account, because the AI system is used to detect financial fraud, therefore not high risk according to Annex III(5)(b).");
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EssentialService, trueAttributes, "Annex III(5)")) {
				highRisk = true;
			}
		}

		// Annex III(6) law enforcement
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.LawEnforcement)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.LawEnforcement,
					new String[] { "VictimRiskAssessment", "LieDetection", "EvidenceReliability",
							"OffendingRiskAssessment", "CriminalProfiling" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.LawEnforcement, trueAttributes, "Annex III(6)")) {
				highRisk = true;
			}
		}

		// Annex III(7) migration, asylum and border control management
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.MigrationBorder)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.MigrationBorder,
					new String[] { "LieDetection", "EntryRiskAssessment", "AsylumVisaResidencePermitsApplication",
							"PersonIdentification" });
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.MigrationBorder,
					"TravelDocumentVerificationOnly") && trueAttributes.remove("PersonIdentification")) {
				this.reasons.add("'" + uc.getName()
						+ "': 'PersonIdentification' is not taken into account, because the AI system is used to verify travel documents, therefore not high risk according to Annex III(7)(d).");
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.MigrationBorder, trueAttributes, "Annex III(7)")) {
				highRisk = true;
			}
		}

		// Annex III(8) administration of justice and democratic processes
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.JusticeDemocracyUseCase)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.JusticeDemocracyUseCase, new String[] { "JudicialSupport", "ElectionInfluence" });
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.JusticeDemocracyUseCase,
					"NoDirectExposure") && trueAttributes.remove("ElectionInfluence")) {
				this.reasons.add("'" + uc.getName()
						+ "': 'ElectionInfluence' is not taken into account, because natural persons are not directly exposed to the output of the AI system, therefore not high risk according to Annex III(8)(b).");
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.JusticeDemocracyUseCase, trueAttributes,
					"Annex III(8)")) {
				highRisk = true;
			}
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Profiling)) {
			this.reasons.add("'" + uc.getName()
					+ "': performs profiling of natural persons, therefore high risk according to Article 6(3).");
			highRisk = true;
		}
		return highRisk;
	}

	// TODO JavaDoc
	// true if exception hit, so not high risk
	// false if exception not hit, so high risk
	private boolean checkAnnexIIIException(UseCase uc, EUAIActCompliance stereotype, List<String> trueAttributes,
			String annexReference) {

		if (trueAttributes.isEmpty()) {
			this.reasons.add("'" + uc.getName() + "': Specify the area of application of '" + stereotype.toString()
					+ "'. A precise justification is not possible without this specification.");
			return false;
		}

		List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc, stereotype, new String[] {
				"NarrowProceduralTask", "ImprovesHumanActivity", "DecisionPatternDetection", "PreparatoryTask" });
		if (!exceptions.isEmpty()) {
			this.reasons.add("'" + uc.getName() + "': area of application " + String.join(", ", trueAttributes)
					+ ", but covered by the exception " + String.join(", ", exceptions)
					+ ", therefore it is not high risk according to Article 6(3).");
			String justification = EUAIActComplianceUtil.getStringValue(uc, stereotype, "ExceptionJustification");
			if (justification == null) {
				this.reasons.add("'" + uc.getName()
						+ "': Document the assessment of the exception in 'ExceptionJustification'.");
				this.additionalObligations.add(
						"The provider has to document the justification assessment before the AI system is placed on the market and has to register the AI system according to Article 6(4) and Article 49(2).");
			}

			return true;
		}

		this.reasons.add("'" + uc.getName() + "': area of application " + String.join(", ", trueAttributes)
				+ ", therefore high risk according to Article 6(2) and " + annexReference);
		return false;
	}

	// TODO JavaDoc
	private boolean checkLimitedRisk(UseCase uc, boolean addReasons) {
		boolean limitedRisk = false;
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanInteraction)) {
			if (addReasons) {
				this.reasons.add("'" + uc.getName()
						+ "': interacts directly with natural persons, therefore limited risk according to Article 50(1).");
			}
			this.additionalObligations.add(
					"Inform natural persons that they are interacting with an AI system according to Article 50(1).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SyntheticContent)) {
			if (addReasons) {
				this.reasons.add("'" + uc.getName()
						+ "': generates synthetic audio, image, video or text content, therefore limited risk according to Article 50(2).");
			}
			this.additionalObligations
					.add("Mark AI-generated content in a machine-readable format according to Article 50(2).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
				|| EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)) {
			if (addReasons) {
				this.reasons.add("'" + uc.getName()
						+ "': exposes natural persons to emotion recognition or biometric categorisation, therefore limited risk according to Article 50(3).");
			}
			this.additionalObligations.add(
					"Inform persons exposed to emotion recognition or biometric categorisation according to Article 50(3).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Deepfake)) {
			if (addReasons) {
				this.reasons.add("'" + uc.getName()
						+ "': generates or manipulates deep fake content, therefore limited risk according to Article 50(4).");
			}
			this.additionalObligations.add("Disclose deep fakes according to Article 50(4).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.PublicInterestText)) {
			if (addReasons) {
				this.reasons.add("'" + uc.getName()
						+ "': generates text which is published to inform the public on matters of public interest, therefore limited risk according to Article 50(4).");
			}
			this.additionalObligations.add(
					"Disclose AI-generated text published to inform the public on matters of public interest according to Article 50(4).");
			limitedRisk = true;
		}
		return limitedRisk;
	}

	private EUAIActRiskClassificationResult buildClassificationResult(EUAIActRiskClass riskClass) {
		List<String> obligations = EUAIActRiskClassificationObligation.getObligations(riskClass);
		for (String ob : this.additionalObligations) {
			obligations.add(ob);
		}
		return new EUAIActRiskClassificationResult(riskClass, this.reasons, obligations);
	}
}