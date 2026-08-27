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

	public EUAIActRiskClassifier(Component aiSystem) {
		this.aiSystem = aiSystem;
	}

	// TODO JavaDoc
	public EUAIActRiskClassificationResult classify() {
		final List<String> reasons = new ArrayList<>();
		final List<String> additionalObligations = new ArrayList<>();
		final List<String> notes = new ArrayList<>();

		boolean unacceptableRisk = false;
		boolean highRisk = false;
		boolean limitedRisk = false;
		boolean annexISectionB = false;

		// Annex I safety component according to Article 6(1)
		if (EUAIActComplianceUtil.hasStereotype(this.aiSystem, EUAIActCompliance.ProductEmbedding)
				&& checkSafetyComponent(reasons, additionalObligations, notes)) {
			highRisk = true;

			// Annex I Section B check according to Article 2(2)
			List<String> productCategories = EUAIActComplianceUtil.getEnumValues(this.aiSystem,
					EUAIActCompliance.ProductEmbedding, "ProductCategory");
			List<String> annexISectionBList = Arrays.asList("CivilAviation", "TwoThreeWheelVehicle", "Agriculture",
					"MarineEquipment", "RailSystem", "MotorVehicle", "MotorVehicleSafety", "UnmannedAircraft");
			if (!productCategories.isEmpty()) {
				if (annexISectionBList.containsAll(productCategories)) {
					annexISectionB = true;
					addToReasons(reasons, this.aiSystem.getName(),
							"All product categories fall under Section B of Annex I, therefore only Article 6(1), Articles 102 to 109 and Article 112 of this Regulation apply.",
							"Article 2(2)");
				} else {
					addToAdditionalObligations(additionalObligations, this.aiSystem.getName(),
							"Undergo a third party conformity assessment before placing the AI system on the market.",
							"Article 6(1)");
				}
			}
		}

		if (this.aiSystem.getUseCases().isEmpty() && !highRisk) {
			addToReasons(reasons, this.aiSystem.getName(),
					"No use case is assigned to the AI system. Since the risk class depends on the intended purpose, a classification is not possible.",
					"Article 3(12)");
			addToNotes(notes, this.aiSystem.getName(), "Assign at least one use case to the AI system.",
					"Article 3(12)");
			return buildClassificationResult(EUAIActRiskClass.Undetermined, reasons, additionalObligations, notes,
					annexISectionB);
		}

		for (UseCase uc : this.aiSystem.getUseCases()) {
			// Prohibited AI practices according to Article 5
			if (checkUnacceptableRisk(uc, reasons, additionalObligations, notes)) {
				unacceptableRisk = true;
				continue;
			}

			// Annex III usecases and exceptions according to Article 6(2) & Article 6(3)
			if (checkHighRisk(uc, reasons, additionalObligations, notes)) {
				highRisk = true;
			}

			// Transparency obligations according to Article 50
			if (checkLimitedRisk(uc, reasons, additionalObligations, notes)) {
				limitedRisk = true;
			}
		}

		if (unacceptableRisk) {
			return buildClassificationResult(EUAIActRiskClass.Unacceptable, reasons, additionalObligations, notes,
					false);
		}

		if (highRisk) {
			return buildClassificationResult(EUAIActRiskClass.High, reasons, additionalObligations, notes,
					annexISectionB);
		}

		if (limitedRisk) {
			return buildClassificationResult(EUAIActRiskClass.Limited, reasons, additionalObligations, notes, false);
		}

		addToReasons(reasons, this.aiSystem.getName(), "No signs of a higher risk class was found.",
				"Article 5, Article 6, Article 50");
		return buildClassificationResult(EUAIActRiskClass.Minimal, reasons, additionalObligations, notes, false);

	}

	// TODO JavaDoc
	// true if safetyComponent or not provided, so high risk
	// false if not safetyComponent, so not high risk
	private boolean checkSafetyComponent(List<String> reasons, List<String> additionalObligations, List<String> notes) {
		String name = this.aiSystem.getName();
		String role = EUAIActComplianceUtil.getEnumValue(this.aiSystem, EUAIActCompliance.ProductEmbedding, "Role");

		if (role == null) {
			addToReasons(reasons, name,
					"It is not specified whether the AI system is a component of a product or the product itself, therefore it is assumed to be high risk.",
					"Article 6(1)");
			addToNotes(notes, name, "Set 'Role' under 'ProductEmbedding' to 'Component' or 'ProductItself'.",
					"Article 6(1)");
			return true;
		}

		boolean productItself = false;
		boolean component = false;
		if (role.equalsIgnoreCase("ProductItself")) {
			productItself = true;
		} else if (role.equalsIgnoreCase("Component")) {
			component = true;
		}

		List<String> productCategories = EUAIActComplianceUtil.getEnumValues(this.aiSystem,
				EUAIActCompliance.ProductEmbedding, "ProductCategory");
		if (productCategories.isEmpty()) {
			addToReasons(reasons, name,
					"It is not specified which category of Annex I the product falls under, therefore it is assumed to be high risk.",
					"Article 6(1)");
			addToNotes(notes, name,
					"Set 'ProductCategory' under 'ProductEmbedding' to the Annex I categories the product falls under.",
					"Article 6(1)");
			return true;
		}

		if (component) {
			Boolean failureEndangerSafety = EUAIActComplianceUtil.getBooleanValue(this.aiSystem,
					EUAIActCompliance.ProductEmbedding, "FailureEndangerSafety");
			if (failureEndangerSafety == null) {
				addToReasons(reasons, name,
						"It is not specified if a failure of the AI system endangers the health and safety of persons or property, therefore it is assumed to be high risk.",
						"Article 6(1)");
				addToNotes(notes, name,
						"Set 'FailureEndangerSafety' under 'ProductEmbedding' to true if a failure of the AI system endangers the health and safety of persons or property, otherwise to false.",
						"Article 3(14)");
				return true;
			}
			if (failureEndangerSafety.equals(Boolean.FALSE)) {
				addToReasons(reasons, name,
						"The AI system is a component of a product, but a failure of it does not endanger the health and safety of persons or property, therefore it is not a safety component.",
						"Article 3(14)");
				return false;
			}
		}

		Boolean thirdPartyAssessment = EUAIActComplianceUtil.getBooleanValue(this.aiSystem,
				EUAIActCompliance.ProductEmbedding, "ThirdPartyConformityAssessment");
		if (thirdPartyAssessment == null) {
			addToReasons(reasons, name,
					"It is not specified whether the product has to undergo a third party conformity assessment, therefore it is assumed to be high risk.",
					"Article 6(1)");
			addToNotes(notes, name,
					"Set 'ThirdPartyConformityAssessment' under 'ProductEmbedding' to true if the product has to undergo a third party conformity assessment under the Annex I legislation, otherwise to false.",
					"Article 6(1)(b)");
			return true;
		}
		if (thirdPartyAssessment.equals(Boolean.FALSE)) {
			addToReasons(reasons, name,
					"The product does not have to undergo a third party conformity assessment, therefore the AI system is not high risk.",
					"Article 6(1)(b)");
			return false;
		}

		if (productItself) {
			addToReasons(reasons, name, "The AI system is itself a product of the category "
					+ String.join(", ", productCategories) + " of Annex I.", "Article 6(1)");
		} else if (component) {
			addToReasons(reasons, name, "The AI system is a safety component of a product of the category "
					+ String.join(", ", productCategories) + " of Annex I.", "Article 6(1)");
		}

		return true;
	}

	// TODO JavaDoc
	private boolean checkUnacceptableRisk(UseCase uc, List<String> reasons, List<String> additionalObligations,
			List<String> notes) {
		boolean ucUnacceptableRisk = false;
		String name = uc.getName();

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ManipulativeBehaviour)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.ManipulativeBehaviour,
					new String[] { "SubliminalTechniques", "DeceptiveTechniques" });
			if (trueAttributes.isEmpty()) {
				addToReasons(reasons, name,
						"The use of a manipulative or deceptive technique is not specified. A precise justification is not possible without this specification.",
						"Article 5(1)(a)");
			} else {
				addToReasons(reasons, name,
						"Detected " + String.join(", ", trueAttributes) + ", therefore unacceptable risk.",
						"Article 5(1)(a)");
			}
			ucUnacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.ExploitingHumanVulnerability)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.ExploitingHumanVulnerability,
					new String[] { "Age", "Disability", "Social", "Economic" });
			if (trueAttributes.isEmpty()) {
				addToReasons(reasons, name,
						"The exploited vulnerability of a person or a group of persons is not specified. A precise justification is not possible without this specification.",
						"Article 5(1)(b)");
			} else {
				addToReasons(reasons, name,
						"Exploits the vulnerability " + String.join(", ", trueAttributes)
								+ " of a person or a group of persons, therefore unacceptable risk.",
						"Article 5(1)(b)");
			}
			ucUnacceptableRisk = true;
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SocialScoring)) {
			addToReasons(reasons, name,
					"Evaluates natural persons based on their social behaviour, therefore unacceptable risk.",
					"Article 5(1)(c)");
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
				addToReasons(reasons, name,
						"Assesses the risk of a natural person committing a criminal offence solely based on profiling or on personality traits, therefore unacceptable risk.",
						"Article 5(1)(d)");
				ucUnacceptableRisk = true;
			} else {
				addToReasons(reasons, name,
						"Assesses the risk of a natural person committing a criminal offence, but supports the human assessment, therefore not unacceptable risk.",
						"Article 5(1)(d)");
			}
		}

		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.FacialImageScraping)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.FacialImageScraping,
					new String[] { "Internet", "CCTV" });
			if (trueAttributes.isEmpty()) {
				addToReasons(reasons, name,
						"The source of the scraping of facial images is not specified. A precise justification is not possible without this specification.",
						"Article 5(1)(e)");
			} else {
				addToReasons(reasons, name, "Untargeted scraping of facial images from "
						+ String.join(", ", trueAttributes) + ", therefore unacceptable risk.", "Article 5(1)(e)");
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
				addToReasons(
						reasons, name, "Recognizes the emotions of natural persons in the context "
								+ String.join(", ", trueAttributes) + ", therefore unacceptable risk.",
						"Article 5(1)(f)");
				ucUnacceptableRisk = true;
			} else {
				addToReasons(reasons, name, "Recognizes the emotions of natural persons in the context "
						+ String.join(", ", trueAttributes)
						+ ", but is put into service for medical or safety reasons, therefore it is not unacceptable risk.",
						"Article 5(1)(f)");
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
				addToReasons(reasons, name, "Categorises natural persons to derive " + String.join(", ", trueAttributes)
						+ ", therefore unacceptable risk.", "Article 5(1)(g)");
				ucUnacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricCategorisation,
						new String[] { "LawfulDatasetLabeling", "LawEnforcementCategorisation" });
				addToReasons(reasons, name,
						"Categorises natural persons to derive " + String.join(", ", trueAttributes)
								+ ", but is covered by the exception " + String.join(", ", exceptions)
								+ ", therefore it is not unacceptable risk.",
						"Article 5(1)(g)");
			}
		}

		// Article 5(1)(h) real-time remote biometric identification for law enforcement
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
				addToReasons(reasons, name,
						"Uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, therefore unacceptable risk.",
						"Article 5(1)(h)");
				ucUnacceptableRisk = true;
			} else {
				List<String> exceptions = EUAIActComplianceUtil.getTrueTags(uc,
						EUAIActCompliance.BiometricIdentification,
						new String[] { "VictimSearch", "ImminentThreatPrevention", "SeriousCrimeSuspectSearch" });
				addToReasons(reasons, name,
						"Uses 'real-time' remote biometric identification in publicly accessible spaces for the purpose of law enforcement, but is covered by the exception "
								+ String.join(", ", exceptions)
								+ ", therefore it is not unacceptable risk, but is subject to the conditions of Article 5(2), Article 5(3), Article 5(4).",
						"Article 5(1)(h)");
				addToNotes(notes, name,
						"Each individual use has to be authorised in advance by a judicial authority or an independent administrative authority.",
						"Article 5(3)");
				addToNotes(notes, name,
						"Each individual use has to be notified to the relevant market surveillance authority and the national data protection authority.",
						"Article 5(4)");
			}
		}
		return ucUnacceptableRisk;
	}

	// TODO JavaDoc
	private boolean checkHighRisk(UseCase uc, List<String> reasons, List<String> additionalObligations,
			List<String> notes) {
		boolean ucHighRisk = false;
		boolean profiling = EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Profiling);
		String name = uc.getName();

		// Annex III(1)(a) biometric remote identification
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricIdentification)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricIdentification,
					"VerificationOnly")) {
				addToReasons(reasons, name,
						"The purpose is to verify the identity of a natural person, therefore not high risk.",
						"Annex III(1)(a)");
			} else {
				// No area tag exists here, therefore the stereotype itself is the area.
				// Passing it as a constant also lets checkAnnexIIIException reach the Article
				// 6(3) check instead of returning early
				List<String> applicationArea = Arrays.asList("remote biometric identification");
				if (!checkAnnexIIIException(uc, EUAIActCompliance.BiometricIdentification, applicationArea,
						"Annex III(1)(a)", profiling, false, reasons, additionalObligations, notes)) {
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
					"Annex III(1)(b)", profiling, false, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(1)(c) emotion recognition
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)) {
			// same as in Annex III(1)(a)
			List<String> applicationArea = Arrays.asList("emotion recognition");
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EmotionRecognition, applicationArea, "Annex III(1)(c)",
					profiling, false, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(2) critical infrastructure
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.CriticalInfrastructure)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.CriticalInfrastructure, new String[] { "DigitalInfrastructure", "RoadTraffic",
							"WaterSupply", "GasSupply", "HeatSupply", "ElectricitySupply" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.CriticalInfrastructure, trueAttributes, "Annex III(2)",
					profiling, false, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(3) education
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Education)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.Education,
					new String[] { "AccessAdmission", "LearningOutcomeEvaluation", "EducationLevelAssessment",
							"ExamMonitoring" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.Education, trueAttributes, "Annex III(3)", profiling,
					false, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(4) employment
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanEmployment)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.HumanEmployment,
					new String[] { "Recruitment", "WorkConditionsDecisions", "Promotion", "Termination" });
			if (!checkAnnexIIIException(uc, EUAIActCompliance.HumanEmployment, trueAttributes, "Annex III(4)",
					profiling, false, reasons, additionalObligations, notes)) {
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
					addToReasons(reasons, name,
							"'Creditworthiness' has no effect, because the AI system is used to detect financial fraud, therefore not high risk.",
							"Annex III(5)(b)");
				} else {
					addToNotes(notes, name,
							"'FraudDetectionOnly' has no effect, because 'Creditworthiness' is not set.",
							"Annex III(5)(b)");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.EssentialService, trueAttributes, "Annex III(5)",
					profiling, attributeRemoved, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
				if (trueAttributes.contains("Creditworthiness") || trueAttributes.contains("InsuranceRiskPricing")) {
					addToAdditionalObligations(additionalObligations, name,
							"Inform the deployer in the instructions for use that a fundamental rights impact assessment has to be performed before putting the AI system into use.",
							"Article 13(3)(b), Article 27(1)");
				}
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
					false, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(7) migration, asylum and border control management
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.MigrationBorder)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc, EUAIActCompliance.MigrationBorder,
					new String[] { "LieDetection", "EntryRiskAssessment", "AsylumVisaOrResidence",
							"PersonIdentification" });
			boolean attributeRemoved = false;
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.MigrationBorder,
					"TravelDocumentVerificationOnly")) {
				attributeRemoved = trueAttributes.remove("PersonIdentification");
				if (attributeRemoved) {
					addToReasons(reasons, name,
							"'PersonIdentification' has no effect, because the AI system is used to verify travel documents, therefore not high risk.",
							"Annex III(7)(d)");
				} else {
					addToNotes(notes, name,
							"'TravelDocumentVerificationOnly' has no effect, because 'PersonIdentification' is not set. Set 'PersonIdentification' or remove 'TravelDocumentVerificationOnly'.",
							"Annex III(7)(d)");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.MigrationBorder, trueAttributes, "Annex III(7)",
					profiling, attributeRemoved, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		// Annex III(8) administration of justice and democratic processes
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.AdministrationJusticeDemocracy)) {
			List<String> trueAttributes = EUAIActComplianceUtil.getTrueTags(uc,
					EUAIActCompliance.AdministrationJusticeDemocracy,
					new String[] { "JudicialSupport", "ElectionInfluence" });
			boolean attributeRemoved = false;
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.AdministrationJusticeDemocracy,
					"NoDirectExposure")) {
				attributeRemoved = trueAttributes.remove("ElectionInfluence");
				if (attributeRemoved) {
					addToReasons(reasons, name,
							"'ElectionInfluence' has no effect, because natural persons are not directly exposed to the output of the AI system, therefore not high risk.",
							"Annex III(8)(b)");
				} else {
					addToNotes(notes, name,
							"'NoDirectExposure' has no effect, because 'ElectionInfluence' is not set. Set 'ElectionInfluence' or remove 'NoDirectExposure'.",
							"Annex III(8)(b)");
				}
			}
			if (!checkAnnexIIIException(uc, EUAIActCompliance.AdministrationJusticeDemocracy, trueAttributes,
					"Annex III(8)", profiling, attributeRemoved, reasons, additionalObligations, notes)) {
				ucHighRisk = true;
			}
		}

		return ucHighRisk;
	}

	// TODO JavaDoc
	// true if exception hit, so not high risk
	// false if exception not hit, so high risk
	private boolean checkAnnexIIIException(UseCase uc, EUAIActCompliance stereotype, List<String> trueAttributes,
			String reference, boolean profiling, boolean attributeRemoved, List<String> reasons,
			List<String> additionalObligations, List<String> notes) {
		String name = uc.getName();

		if (trueAttributes.isEmpty()) {
			if (attributeRemoved) {
				return true;
			} else {
				addToReasons(reasons, name, "The area of application under '" + stereotype.toString()
						+ "' is not specified, therefore the intended purpose cannot be assessed and the AI system is assumed to be high risk.",
						reference);
				addToNotes(notes, name, "Set at least one area of application under '" + stereotype.toString() + "'.",
						reference);
				addToAdditionalObligations(additionalObligations, this.aiSystem.getName(),
						"Register this AI system and the provider in the EU database before placing it on the market.",
						"Article 49(1)");
				return false;
			}
		}

		if (profiling) {
			addToReasons(reasons, name, "The intended purpose falls under the area of application "
					+ String.join(", ", trueAttributes)
					+ " and the AI system performs profiling of natural persons, therefore the exception of Article 6(3) does not apply and the AI system is classified as high risk.",
					"Article 6(2), Article 6(3), " + reference);
			addToAdditionalObligations(additionalObligations, this.aiSystem.getName(),
					"Register this AI system and the provider in the EU database before placing it on the market.",
					"Article 49(1)");
			return false;
		}

		List<String> exceptions = EUAIActComplianceUtil.getEnumValues(uc, stereotype, "Exception");
		if (!exceptions.isEmpty()) {
			addToReasons(reasons, name, "The intended purpose falls under the area of application "
					+ String.join(", ", trueAttributes) + ", but is covered by the exception "
					+ String.join(", ", exceptions)
					+ ", therefore the AI system does not pose a significant risk of harm and is not classified as high risk.",
					"Article 6(3), " + reference);
			addToAdditionalObligations(additionalObligations, name,
					"Document the justification assessment before the AI system is placed on the market and register the AI system.",
					"Article 6(4), Article 49(2)");
			String justification = EUAIActComplianceUtil.getStringValue(uc, stereotype, "ExceptionJustification");
			if (justification == null || justification.isBlank()) {
				addToNotes(notes, name, "Document the assessment of the exception in 'ExceptionJustification'.",
						"Article 6(4)");
			}

			return true;
		}

		addToReasons(reasons, name,
				"The intended purpose falls under the area of application " + String.join(", ", trueAttributes)
						+ " and no exception applies, therefore the AI system is classified as high risk.",
				"Article 6(2), " + reference);
		addToAdditionalObligations(additionalObligations, this.aiSystem.getName(),
				"Register this AI system and the provider in the EU database before placing it on the market.",
				"Article 49(1)");
		return false;
	}

	// TODO JavaDoc
	private boolean checkLimitedRisk(UseCase uc, List<String> reasons, List<String> additionalObligations,
			List<String> notes) {
		boolean ucLimitedRisk = false;
		String name = uc.getName();

		// Article 50(1)
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.HumanInteraction)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.HumanInteraction,
					"LawEnforcementAuthorised")
					&& !EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.HumanInteraction,
							"PublicCriminalOffenceReport")) {
				addToReasons(reasons, name,
						"Interacts directly with natural persons, but is authorised by law to detect, prevent, investigate or prosecute criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(1)");
			} else if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.HumanInteraction,
					"ObviousAIInteraction")) {
				addToReasons(reasons, name,
						"Interacts directly with natural persons, but it is obvious from the circumstances and the context of use, therefore not subject to the transparency obligation.",
						"Article 50(1)");
			} else {
				if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.HumanInteraction,
						"LawEnforcementAuthorised")) {
					addToReasons(reasons, name,
							"Is authorised by law to detect, prevent, investigate or prosecute criminal offences, but is available to the public to report a criminal offence, therefore the law enforcement exception does not apply.",
							"Article 50(1)");
				}
				addToReasons(reasons, name,
						"Interacts directly with natural persons, therefore subject to the transparency obligation.",
						"Article 50(1)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform natural persons that they are interacting with an AI system.", "Article 50(1)");
				ucLimitedRisk = true;
			}
		}

		// Article 50(2)
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.SyntheticContent)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.SyntheticContent,
					"StandardEditingOnly")) {
				addToReasons(reasons, name,
						"Generates synthetic content, but performs an assistive function for standard editing and does not substantially alter the input data or its semantics, therefore not subject to the transparency obligation.",
						"Article 50(2)");
			} else if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.SyntheticContent,
					"LawEnforcementAuthorised")) {
				addToReasons(reasons, name,
						"Generates synthetic content, but is authorised by law to detect, prevent, investigate or prosecute criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(2)");
			} else {
				addToReasons(reasons, name,
						"Generates synthetic audio, image, video or text content, therefore subject to the transparency obligation.",
						"Article 50(2)");
				addToAdditionalObligations(additionalObligations, name, "Mark the output in a machine-readable format.",
						"Article 50(2)");
				ucLimitedRisk = true;
			}
		}

		// Article 50(3) emotion recognition
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.EmotionRecognition)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.EmotionRecognition,
					"LawEnforcementAuthorised")) {
				addToReasons(reasons, name,
						"Exposes natural persons to emotion recognition, but is permitted by law to detect, prevent or investigate criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(3)");
				addToNotes(notes, name,
						"Document the appropriate safeguards for the rights and freedoms of third parties.",
						"Article 50(3)");
			} else {
				addToReasons(reasons, name,
						"Exposes natural persons to emotion recognition, therefore subject to the transparency obligation.",
						"Article 50(3)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform the deployer in the instructions for use to inform natural persons about the exposition to emotion recognition or biometric categorisation.",
						"Article 13(3)(b), Article 50(3)");
				ucLimitedRisk = true;
			}
		}

		// Article 50(3) biometric categorisation
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.BiometricCategorisation)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.BiometricCategorisation,
					"LawEnforcementAuthorised")) {
				addToReasons(reasons, name,
						"Exposes natural persons to biometric categorisation, but is permitted by law to detect, prevent or investigate criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(3)");
				addToNotes(notes, name,
						"Document the appropriate safeguards for the rights and freedoms of third parties.",
						"Article 50(3)");
			} else {
				addToReasons(reasons, name,
						"Exposes natural persons to biometric categorisation, therefore subject to the transparency obligation.",
						"Article 50(3)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform the deployer in the instructions for use to inform natural persons about the exposition to emotion recognition or biometric categorisation.",
						"Article 13(3)(b), Article 50(3)");
				ucLimitedRisk = true;
			}
		}

		// Article 50(4)
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.Deepfake)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.Deepfake, "LawEnforcementAuthorised")) {
				addToReasons(reasons, name,
						"Generates or manipulates deep fake content, but the use is authorised by law to detect, prevent, investigate or prosecute criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(4)");
			} else if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.Deepfake, "CreativeWork")) {
				addToReasons(reasons, name,
						"Generates or manipulates deep fake content as part of an artistic, creative, satirical or fictional work, therefore the disclosure is limited.",
						"Article 50(4)");
				addToAdditionalObligations(additionalObligations, name, "Mark the output in a machine-readable format.",
						"Article 50(2)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform the deployer in the instructions for use that the artificial generation or manipulation has to be disclosed in a clear and distinguishable manner.",
						"Article 13(3)(b), Article 50(4)");
				ucLimitedRisk = true;
			} else {
				addToReasons(reasons, name,
						"Generates or manipulates deep fake content, therefore subject to the transparency obligation.",
						"Article 50(4)");
				addToAdditionalObligations(additionalObligations, name, "Mark the output in a machine-readable format.",
						"Article 50(2)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform the deployer in the instructions for use to disclose in a clear and distinguishable manner that the content has been artificially generated or manipulated.",
						"Article 13(3)(b), Article 50(4), Article 50(5)");
				ucLimitedRisk = true;
			}
		}

		// Article 50(4) subparagraph 2
		if (EUAIActComplianceUtil.hasStereotype(uc, EUAIActCompliance.PublicInterestText)) {
			if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.PublicInterestText,
					"LawEnforcementAuthorised")) {
				addToReasons(reasons, name,
						"Generates text which is published to inform the public on matters of public interest, but the use is authorised by law to detect, prevent, investigate or prosecute criminal offences, therefore not subject to the transparency obligation.",
						"Article 50(4)");
			} else if (EUAIActComplianceUtil.isTaggedValueTrue(uc, EUAIActCompliance.PublicInterestText,
					"HumanReview")) {
				addToReasons(reasons, name,
						"Generates text which is published to inform the public on matters of public interest, but the text has undergone a human review and a natural or legal person holds editorial responsibility, therefore not subject to the transparency obligation.",
						"Article 50(4)");
			} else {
				addToReasons(reasons, name,
						"Generates text which is published to inform the public on matters of public interest, therefore subject to the transparency obligation.",
						"Article 50(4)");
				addToAdditionalObligations(additionalObligations, name,
						"Inform the deployer in the instructions for use to disclose AI-generated public interest text.",
						"Article 13(3)(b), Article 50(4)");
				ucLimitedRisk = true;
			}
		}

		return ucLimitedRisk;
	}

	// TODO JavaDoc
	private EUAIActRiskClassificationResult buildClassificationResult(EUAIActRiskClass riskClass, List<String> reasons,
			List<String> additionalObligations, List<String> notes, boolean annexISectionB) {
		List<String> distinctAdditionalObligations = new ArrayList<>();
		for (String ob : additionalObligations) {
			if (!distinctAdditionalObligations.contains(ob)) {
				distinctAdditionalObligations.add(ob);
			}
		}
		return new EUAIActRiskClassificationResult(riskClass, reasons,
				EUAIActRiskClassificationObligation.getObligations(riskClass, annexISectionB),
				distinctAdditionalObligations, notes, annexISectionB);
	}

	// TODO JavaDoc
	private void addToReasons(List<String> reasons, String elementName, String value, String reference) {
		reasons.add("'" + elementName + "' (" + reference + "): " + value);

	}

	// TODO JavaDoc
	private void addToAdditionalObligations(List<String> additionalObligations, String elementName, String value,
			String reference) {
		additionalObligations.add("'" + elementName + "' (" + reference + "): " + value);

	}

	// TODO JavaDoc
	private void addToNotes(List<String> notes, String elementName, String value, String reference) {
		notes.add("'" + elementName + "' (" + reference + "): " + value);

	}
}