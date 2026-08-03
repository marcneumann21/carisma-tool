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

		// annex I safety component according to Article 6(1)
		if (EUAIActComplianceUtil.hasStereotype(this.aiSystem, EUAIActCompliance.ProductEmbedding)
				&& checkSafetyComponent()) {
			highRisk = true;
		}

		if (this.aiSystem.getUseCases().isEmpty() && !highRisk) {
			this.reasons.add("No use case is assigned to this AI system, therefore a classification is not possible.");
			return buildClassificationResult(EUAIActRiskClass.Undetermined);
		}

		for (UseCase uc : this.aiSystem.getUseCases()) {

			// prohibited AI practices according to Article 5
			// if this AI system is unacceptable risk, skip it
			if (checkUnacceptableRisk(uc)) {
				unacceptableRisk = true;
				continue;
			}

			// annex III usecases and exceptions according to Article 6(2) & Article 6(3)
			if (checkHighRisk(uc)) {
				highRisk = true;
			}

			// transparency obligations according to Article 50
			if (checkLimitedRisk(uc)) {
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
	// true if safetyComponent or not provided, so high risk
	// false if not safetyComponent, so not high risk
	private boolean checkSafetyComponent() {
		String role = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding, "Role");
		if (role == null) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': it is not specified whether the AI system is a safety component of the product or the product itself. Therefore it is assumed to be high risk according to Article 6(1) until the specification is provided.");
			return true;
		}

		boolean productItself;
		if (role.equalsIgnoreCase("ProductItself")) {
			productItself = true;
		} else if (role.equalsIgnoreCase("SafetyComponent")) {
			productItself = false;
		} else {
			this.reasons.add("Safety component '" + this.aiSystem.getName() + "': the role '" + role
					+ "' is not a valid value. Therefore it is assumed to be high risk according to Article 6(1) until the specification is provided.");
			return true;
		}

		String productCategory = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding,
				"ProductCategory");
		if (productCategory == null) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "':  it is not specified which category the AI system is a safety component of. Therefore it is assumed to be high risk according to Article 6(1) until the specification is provided.");
			return true;
		}

		// TODO Test if it can be null
		if (!productItself) {
			Boolean failureEndangerSafety = EUAIActComplianceUtil.getBooleanValue(this.aiSystem,
					EUAIActCompliance.ProductEmbedding, "FailureEndangerSafety");
			if (failureEndangerSafety == null) {
				this.reasons.add("Safety component '" + this.aiSystem.getName()
						+ "': it is not specified whether a failure of the AI system endangers the health and safety of persons or property.  Therefore it is assumed to be high risk according to Article 6(1) until the specification is provided.");
				return true;
			}
			if (!failureEndangerSafety.booleanValue()) {
				this.reasons.add("Safety component '" + this.aiSystem.getName()
						+ "': the AI system is a component of a product, but a failure of it does not endanger the health and safety of persons or property, therefore it is not a safety component according to Article 3(14).");
				return false;
			}
		}

		Boolean thirdPartyAssessment = EUAIActComplianceUtil.getBooleanValue(this.aiSystem,
				EUAIActCompliance.ProductEmbedding, "ThirdPartyConformityAssessment");
		if (thirdPartyAssessment == null) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': it is not specified whether the product has to undergo a third party conformity assessment. Therefore it is assumed to be high risk according to Article 6(1) until the specification is provided.");
			return true;
		}
		if (!thirdPartyAssessment.booleanValue()) {
			this.reasons.add("Safety component '" + this.aiSystem.getName()
					+ "': the product does not have to undergo a third party conformity assessment, therefore the AI system is not high risk according to Article 6(1)(b).");
			return false;
		}

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
	// Maybe to UNDERTERMINED when justification is not possible
	private boolean checkUnacceptableRisk(UseCase uc) {
		boolean ucUnacceptableRisk = false;
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ManipulativeBehaviour)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.ManipulativeBehaviour,
					new String[] { "SubliminalTechniques", "DeceptiveTechniques" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': the use of a manipulative or deceptive technique is not specified. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': detected " + String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(a).");
			}
			ucUnacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ExploitingHumanVulnerability)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.ExploitingHumanVulnerability,
					new String[] { "Age", "Disability", "Social", "Economic" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': the exploited vulnerability of a person or a group of persons is not specified. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': exploits the vulnerability "
						+ String.join(", ", trueAttributes)
						+ " of a person or a group of persons, therefore unacceptable risk according to Article 5(1)(b).");
			}
			ucUnacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SocialScoring)) {
			this.reasons.add("'" + uc.getName()
					+ "': evaluates natural persons based on their social behaviour, therefore unacceptable risk according to Article 5(1)(c).");
			ucUnacceptableRisk = true;
		}

		// Article 5(1)(d) predicting criminal offences solely based on profiling of a
		// natural person
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.LawEnforcement)
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
						"OffendingRiskAssessment")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
						"SolelyProfilingBased")) {
			if (!EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.LawEnforcement,
					"SupportsHumanAssessment")) {
				this.reasons.add("'" + uc.getName()
						+ "': assesses the risk of a natural person committing a criminal offence solely based on profiling or on personality traits, therefore unacceptable risk according to Article 5(1)(d).");
				ucUnacceptableRisk = true;
			} else {
				this.reasons.add("'" + uc.getName()
						+ "': assesses the risk of a natural person committing a criminal offence, but supports the human assessment, therefore not unacceptable risk according to Article 5(1)(d).");
			}
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.FacialImageScraping)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.FacialImageScraping,
					new String[] { "Internet", "CCTV" });
			if (trueAttributes.isEmpty()) {
				this.reasons.add("'" + uc.getName()
						+ "': the source of the untargeted scraping of facial images is not specified. A precise justification is not possible without this specification.");
			} else {
				this.reasons.add("'" + uc.getName() + "': untargeted scraping of facial images from "
						+ String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(e).");
			}
			ucUnacceptableRisk = true;
		}

		// Article 5(1)(f) emotion recognition at the workplace and in education
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
				&& EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
						new String[] { "Workplace", "Education" })) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.EmotionRecognition,
					new String[] { "Workplace", "Education" });
			if (!EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
					"MedicalOrSafetyReason")) {
				this.reasons.add("'" + uc.getName() + "': recognizes the emotions of natural persons in the context "
						+ String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk according to Article 5(1)(f).");
				ucUnacceptableRisk = true;
			} else {
				this.reasons.add("'" + uc.getName() + "': recognizes the emotions of natural persons in the context "
						+ String.join(", ", trueAttributes)
						+ ", but is put into service for medical or safety reasons, therefore it is not unacceptable risk according to Article 5(1)(f).");
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
				ucUnacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricCategorisation,
						new String[] { "LawfulDatasetLabeling", "LawEnforcementCategorisation" });
				this.reasons.add("'" + uc.getName() + "': categorises natural persons to derive "
						+ String.join(", ", trueAttributes) + ", but is covered by the exception "
						+ String.join(", ", exceptions)
						+ ", therefore it is not unacceptable risk according to Article 5(1)(g).");
			}
		}

		// Article 5(1)(h) real-time remote biometric identification for law enforcement
		// TODO add Annex II?
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)
				&& !EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"VerificationOnly")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification, "RealTime")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"PubliclyAccessibleSpace")
				&& EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
						"LawEnforcementPurpose")) {
			if (!EUAIActComplianceUtil.isAnyTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
					new String[] { "VictimSearch", "ImminentThreatPrevention", "SeriousCrimeSuspectSearch" })) {
				this.reasons.add("'" + uc.getName()
						+ "': uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, therefore unacceptable risk according to Article 5(1)(h).");
				ucUnacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricIdentification,
						new String[] { "VictimSearch", "ImminentThreatPrevention", "SeriousCrimeSuspectSearch" });
				this.reasons.add("'" + uc.getName()
						+ "': uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, but is covered by the exception "
						+ String.join(", ", exceptions)
						+ ", therefore it is not unacceptable risk, but requires a prior authorisation and a registration according to Article 5(1)(h)(iii), Article 5(2), Article 5(3).");
				this.additionalObligations.add(
						"The deployer has to complete a fundamental rights impact assessment and has to register the AI system in the EU database before each use according to Article 5(2), Article 27, Article 49.");
			}
		}
		return ucUnacceptableRisk;
	}

	// TODO JavaDoc
	private boolean checkHighRisk(UseCase uc) {
		boolean ucHighRisk = false;
		boolean profiling = EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Profiling);

		// Annex III(1)(a) biometric remote identification
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
					"VerificationOnly")) {
				this.reasons.add("'" + uc.getName()
						+ "': the purpose is to verify the identity of a natural person, therefore not high risk according to Annex III(1)(a).");
			} else {
				// No area tag exists here, therefore the stereotype itself is the area.
				// Passing it as a constant also lets checkAnnexIIIException reach the Article
				// 6(3) check instead of returning early
				List<String> applicationArea = Arrays.asList("remote biometric identification");
				if (!checkAnnexIIIException(uc, EUAIActCompliance.BiometricIdentification, applicationArea,
						"Annex III(1)(a)", profiling, false)) {
					ucHighRisk = true;
				}
			}
		}

		// Annex III(1)(b) biometric categorisation
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.BiometricCategorisation, new String[] { "DeduceRace", "DeducePoliticalOpinion",
							"DeduceUnionMembership", "DeduceReligiousBelief", "DeduceSexuality" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.BiometricCategorisation, trueAttributes,
					"Annex III(1)(b)", profiling, false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(1)(c) emotion recognition
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)) {
			// same as in Annex III(1)(a)
			List<String> applicationArea = Arrays.asList("emotion recognition");
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EmotionRecognition, applicationArea, "Annex III(1)(c)",
					profiling, false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(2) critical infrastructure
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.CriticalInfrastructure)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.CriticalInfrastructure, new String[] { "DigitalInfrastructure", "RoadTraffic",
							"WaterSupply", "GasSupply", "HeatSupply", "ElectricitySupply" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.CriticalInfrastructure, trueAttributes, "Annex III(2)",
					profiling, false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(3) education
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Education)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.Education,
					new String[] { "AccessAdmission", "LearningOutcomeEvaluation", "EducationLevelAssessment",
							"ExamMonitoring" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.Education, trueAttributes, "Annex III(3)", profiling,
					false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(4) employment
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanEmployment)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.HumanEmployment,
					new String[] { "Recruitment", "WorkConditionsDecisions" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.HumanEmployment, trueAttributes, "Annex III(4)",
					profiling, false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(5) essential services
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EssentialService)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.EssentialService,
					new String[] { "PublicBenefitsEligibility", "Creditworthiness", "InsuranceRiskPricing",
							"Emergency" });
			boolean attributeRemoved = false;
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.EssentialService, "FraudDetectionOnly")) {
				attributeRemoved = trueAttributes.remove("Creditworthiness");
				if (attributeRemoved) {
					this.reasons.add("'" + uc.getName()
							+ "': 'Creditworthiness' is not taken into account, because the AI system is used to detect financial fraud, therefore not high risk according to Annex III(5)(b).");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EssentialService, trueAttributes, "Annex III(5)",
					profiling, attributeRemoved)) {
				ucHighRisk = true;
			}
		}

		// Annex III(6) law enforcement
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.LawEnforcement)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.LawEnforcement,
					new String[] { "VictimRiskAssessment", "LieDetection", "EvidenceReliability",
							"OffendingRiskAssessment" });
			if (profiling) {
				trueAttributes.add("Profiling");
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.LawEnforcement, trueAttributes, "Annex III(6)", profiling,
					false)) {
				ucHighRisk = true;
			}
		}

		// Annex III(7) migration, asylum and border control management
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.MigrationBorder)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.MigrationBorder,
					new String[] { "LieDetection", "EntryRiskAssessment", "AsylumVisaResidencePermitsApplication",
							"PersonIdentification" });
			boolean attributeRemoved = false;
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.MigrationBorder,
					"TravelDocumentVerificationOnly")) {
				attributeRemoved = trueAttributes.remove("PersonIdentification");
				if (attributeRemoved) {
					this.reasons.add("'" + uc.getName()
							+ "': 'PersonIdentification' is not taken into account, because the AI system is used to verify travel documents, therefore not high risk according to Annex III(7)(d).");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.MigrationBorder, trueAttributes, "Annex III(7)",
					profiling, attributeRemoved)) {
				ucHighRisk = true;
			}
		}

		// Annex III(8) administration of justice and democratic processes
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.JusticeDemocracyUseCase)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.JusticeDemocracyUseCase, new String[] { "JudicialSupport", "ElectionInfluence" });
			boolean attributeRemoved = false;
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.JusticeDemocracyUseCase,
					"NoDirectExposure")) {
				attributeRemoved = trueAttributes.remove("ElectionInfluence");
				if (attributeRemoved) {
					this.reasons.add("'" + uc.getName()
							+ "': 'ElectionInfluence' is not taken into account, because natural persons are not directly exposed to the output of the AI system, therefore not high risk according to Annex III(8)(b).");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.JusticeDemocracyUseCase, trueAttributes, "Annex III(8)",
					profiling, attributeRemoved)) {
				ucHighRisk = true;
			}
		}

		return ucHighRisk;
	}

	// TODO JavaDoc
	// true if exception hit, so not high risk
	// false if exception not hit, so high risk
	private boolean checkAnnexIIIException(UseCase uc, EUAIActCompliance stereotype, List<String> trueAttributes,
			String reference, boolean profiling, boolean attributeRemoved) {

		if (trueAttributes.isEmpty()) {
			if (attributeRemoved) {
				return true;
			} else {
				this.reasons.add("'" + uc.getName() + "': the area of application of '" + stereotype.toString()
						+ "' is not specified. A precise justification is not possible without this specification.");
				return false;
			}
		}

		if (profiling) {
			this.reasons.add("'" + uc.getName()
					+ "': performs profiling of natural persons, therefore high risk according to Article 6(3), "
					+ reference + ".");
			return false;
		}

		List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc, stereotype, new String[] {
				"NarrowProceduralTask", "ImprovesHumanActivity", "DecisionPatternDetection", "PreparatoryTask" });
		if (!exceptions.isEmpty()) {
			this.reasons.add("'" + uc.getName() + "': area of application " + String.join(", ", trueAttributes)
					+ ", but covered by the exception " + String.join(", ", exceptions)
					+ ", therefore it is not high risk according to Article 6(3).");
			String justification = EUAIActComplianceUtil.getStringValue(uc, stereotype, "ExceptionJustification");
			this.additionalObligations.add(
					"The provider has to document the justification assessment before the AI system is placed on the market and has to register the AI system according to Article 6(4), Article 49(2).");
			if (justification == null || justification.isBlank()) {
				this.reasons.add("'" + uc.getName()
						+ "': Document the assessment of the exception in 'ExceptionJustification'.");
			}

			return true;
		}

		this.reasons.add("'" + uc.getName() + "': area of application " + String.join(", ", trueAttributes)
				+ ", therefore high risk according to Article 6(2), " + reference + ".");
		return false;
	}

	// TODO JavaDoc
	private boolean checkLimitedRisk(UseCase uc) {
		boolean limitedRisk = false;
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanInteraction)) {
			this.reasons.add("'" + uc.getName()
					+ "': interacts directly with natural persons, therefore subject to the transparency obligation according to Article 50(1).");
			this.additionalObligations.add(
					"Inform natural persons that they are interacting with an AI system according to Article 50(1).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SyntheticContent)) {
			this.reasons.add("'" + uc.getName()
					+ "': generates synthetic audio, image, video or text content, therefore subject to the transparency obligation according to Article 50(2).");
			this.additionalObligations
					.add("Mark AI-generated content in a machine-readable format according to Article 50(2).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)
				|| EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)) {
			this.reasons.add("'" + uc.getName()
					+ "': exposes natural persons to emotion recognition or biometric categorisation, therefore subject to the transparency obligation according to Article 50(3).");
			this.additionalObligations.add(
					"Inform persons exposed to emotion recognition or biometric categorisation according to Article 50(3).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Deepfake)) {
			this.reasons.add("'" + uc.getName()
					+ "': generates or manipulates deep fake content, therefore subject to the transparency obligation according to Article 50(4).");
			this.additionalObligations.add("Disclose deep fakes according to Article 50(4).");
			limitedRisk = true;
		}
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.PublicInterestText)) {
			this.reasons.add("'" + uc.getName()
					+ "': generates text which is published to inform the public on matters of public interest, therefore subject to the transparency obligation according to Article 50(4).");
			this.additionalObligations.add(
					"Disclose AI-generated text published to inform the public on matters of public interest according to Article 50(4).");
			limitedRisk = true;
		}
		return limitedRisk;
	}

	private EUAIActRiskClassificationResult buildClassificationResult(EUAIActRiskClass riskClass) {
		List<String> obligations = new ArrayList<>(EUAIActRiskClassificationObligation.getObligations(riskClass));
		for (String ob : this.additionalObligations) {
			if (!obligations.contains(ob)) {
				obligations.add(ob);
			}
		}
		return new EUAIActRiskClassificationResult(riskClass, this.reasons, obligations);
	}
}