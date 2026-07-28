/**
 */
package euaiactcompliance.util;

import euaiactcompliance.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage
 * @generated
 */
public class EuaiactcomplianceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EuaiactcompliancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuaiactcomplianceSwitch() {
		if (modelPackage == null) {
			modelPackage = EuaiactcompliancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EuaiactcompliancePackage.PROFILING: {
				Profiling profiling = (Profiling)theEObject;
				T result = caseProfiling(profiling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING: {
				ProductEmbedding productEmbedding = (ProductEmbedding)theEObject;
				T result = caseProductEmbedding(productEmbedding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.HUMAN_INTERACTION: {
				HumanInteraction humanInteraction = (HumanInteraction)theEObject;
				T result = caseHumanInteraction(humanInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.SYNTHETIC_CONTENT: {
				SyntheticContent syntheticContent = (SyntheticContent)theEObject;
				T result = caseSyntheticContent(syntheticContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DEEPFAKE: {
				Deepfake deepfake = (Deepfake)theEObject;
				T result = caseDeepfake(deepfake);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT: {
				PublicInterestText publicInterestText = (PublicInterestText)theEObject;
				T result = casePublicInterestText(publicInterestText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR: {
				ManipulativeBehaviour manipulativeBehaviour = (ManipulativeBehaviour)theEObject;
				T result = caseManipulativeBehaviour(manipulativeBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.EXPLOITING_HUMAN_VULNERABILITY: {
				ExploitingHumanVulnerability exploitingHumanVulnerability = (ExploitingHumanVulnerability)theEObject;
				T result = caseExploitingHumanVulnerability(exploitingHumanVulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.SOCIAL_SCORING: {
				SocialScoring socialScoring = (SocialScoring)theEObject;
				T result = caseSocialScoring(socialScoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.FACIAL_IMAGE_SCRAPING: {
				FacialImageScraping facialImageScraping = (FacialImageScraping)theEObject;
				T result = caseFacialImageScraping(facialImageScraping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.AI_SYSTEM: {
				AISystem aiSystem = (AISystem)theEObject;
				T result = caseAISystem(aiSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.LIST_HARMONISED_STANDARDS: {
				ListHarmonisedStandards listHarmonisedStandards = (ListHarmonisedStandards)theEObject;
				T result = caseListHarmonisedStandards(listHarmonisedStandards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PROVIDES: {
				Provides provides = (Provides)theEObject;
				T result = caseProvides(provides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE: {
				CriticalInfrastructure criticalInfrastructure = (CriticalInfrastructure)theEObject;
				T result = caseCriticalInfrastructure(criticalInfrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.ML_MODEL: {
				MLModel mlModel = (MLModel)theEObject;
				T result = caseMLModel(mlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.EDUCATION: {
				Education education = (Education)theEObject;
				T result = caseEducation(education);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT: {
				HumanEmployment humanEmployment = (HumanEmployment)theEObject;
				T result = caseHumanEmployment(humanEmployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.TRAINING_DATA: {
				TrainingData trainingData = (TrainingData)theEObject;
				T result = caseTrainingData(trainingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.THIRD_PARTY_COMPONENT: {
				ThirdPartyComponent thirdPartyComponent = (ThirdPartyComponent)theEObject;
				T result = caseThirdPartyComponent(thirdPartyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE: {
				EssentialService essentialService = (EssentialService)theEObject;
				T result = caseEssentialService(essentialService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.LAW_ENFORCEMENT: {
				LawEnforcement lawEnforcement = (LawEnforcement)theEObject;
				T result = caseLawEnforcement(lawEnforcement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.MIGRATION_BORDER: {
				MigrationBorder migrationBorder = (MigrationBorder)theEObject;
				T result = caseMigrationBorder(migrationBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE: {
				JusticeDemocracyUseCase justiceDemocracyUseCase = (JusticeDemocracyUseCase)theEObject;
				T result = caseJusticeDemocracyUseCase(justiceDemocracyUseCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION: {
				BiometricIdentification biometricIdentification = (BiometricIdentification)theEObject;
				T result = caseBiometricIdentification(biometricIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION: {
				BiometricCategorisation biometricCategorisation = (BiometricCategorisation)theEObject;
				T result = caseBiometricCategorisation(biometricCategorisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.EMOTION_RECOGNITION: {
				EmotionRecognition emotionRecognition = (EmotionRecognition)theEObject;
				T result = caseEmotionRecognition(emotionRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profiling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profiling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfiling(Profiling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Embedding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Embedding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductEmbedding(ProductEmbedding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanInteraction(HumanInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthetic Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthetic Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntheticContent(SyntheticContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deepfake</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deepfake</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeepfake(Deepfake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Interest Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Interest Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicInterestText(PublicInterestText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manipulative Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manipulative Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManipulativeBehaviour(ManipulativeBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exploiting Human Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploiting Human Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExploitingHumanVulnerability(ExploitingHumanVulnerability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Scoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Scoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialScoring(SocialScoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facial Image Scraping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facial Image Scraping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacialImageScraping(FacialImageScraping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AI System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AI System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAISystem(AISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Harmonised Standards</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Harmonised Standards</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListHarmonisedStandards(ListHarmonisedStandards object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvides(Provides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critical Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critical Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalInfrastructure(CriticalInfrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLModel(MLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Education</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Education</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEducation(Education object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Employment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Employment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanEmployment(HumanEmployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainingData(TrainingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Third Party Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Third Party Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdPartyComponent(ThirdPartyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Essential Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Essential Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEssentialService(EssentialService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Law Enforcement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Law Enforcement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLawEnforcement(LawEnforcement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrationBorder(MigrationBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justice Democracy Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justice Democracy Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJusticeDemocracyUseCase(JusticeDemocracyUseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biometric Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biometric Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiometricIdentification(BiometricIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biometric Categorisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biometric Categorisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiometricCategorisation(BiometricCategorisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotion Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotion Recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotionRecognition(EmotionRecognition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EuaiactcomplianceSwitch
