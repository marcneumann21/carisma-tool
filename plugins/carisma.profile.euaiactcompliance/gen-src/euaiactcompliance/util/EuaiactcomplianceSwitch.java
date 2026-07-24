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
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE: {
				AnnexIIIUseCase annexIIIUseCase = (AnnexIIIUseCase)theEObject;
				T result = caseAnnexIIIUseCase(annexIIIUseCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PROFILING: {
				Profiling profiling = (Profiling)theEObject;
				T result = caseProfiling(profiling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.SAFETY_COMPONENT: {
				SafetyComponent safetyComponent = (SafetyComponent)theEObject;
				T result = caseSafetyComponent(safetyComponent);
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION_NOTIFICATION: {
				EmotionRecognitionNotification emotionRecognitionNotification = (EmotionRecognitionNotification)theEObject;
				T result = caseEmotionRecognitionNotification(emotionRecognitionNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORIZATION_NOTIFICATION: {
				BiometricCategorizationNotification biometricCategorizationNotification = (BiometricCategorizationNotification)theEObject;
				T result = caseBiometricCategorizationNotification(biometricCategorizationNotification);
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
			case EuaiactcompliancePackage.EXPLOITING_VULNERABILITY: {
				ExploitingVulnerability exploitingVulnerability = (ExploitingVulnerability)theEObject;
				T result = caseExploitingVulnerability(exploitingVulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.SOCIAL_SCORING: {
				SocialScoring socialScoring = (SocialScoring)theEObject;
				T result = caseSocialScoring(socialScoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.PREDICTIVE_POLICING: {
				PredictivePolicing predictivePolicing = (PredictivePolicing)theEObject;
				T result = casePredictivePolicing(predictivePolicing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.FACIAL_RECOGNITION: {
				FacialRecognition facialRecognition = (FacialRecognition)theEObject;
				T result = caseFacialRecognition(facialRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.EMOTION_RECOGNITION: {
				EmotionRecognition emotionRecognition = (EmotionRecognition)theEObject;
				T result = caseEmotionRecognition(emotionRecognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION: {
				BiometricCategorisation biometricCategorisation = (BiometricCategorisation)theEObject;
				T result = caseBiometricCategorisation(biometricCategorisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION: {
				BiometricIdentification biometricIdentification = (BiometricIdentification)theEObject;
				T result = caseBiometricIdentification(biometricIdentification);
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
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM: {
				GeneralDescriptionAISystem generalDescriptionAISystem = (GeneralDescriptionAISystem)theEObject;
				T result = caseGeneralDescriptionAISystem(generalDescriptionAISystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM: {
				DetailedDescriptionAISystem detailedDescriptionAISystem = (DetailedDescriptionAISystem)theEObject;
				T result = caseDetailedDescriptionAISystem(detailedDescriptionAISystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM: {
				DetailedInformationAISystem detailedInformationAISystem = (DetailedInformationAISystem)theEObject;
				T result = caseDetailedInformationAISystem(detailedInformationAISystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DESCRIPTION_PERFORMANCE_METRICS: {
				DescriptionPerformanceMetrics descriptionPerformanceMetrics = (DescriptionPerformanceMetrics)theEObject;
				T result = caseDescriptionPerformanceMetrics(descriptionPerformanceMetrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DESCRIPTION_RISK_MANAGEMENT: {
				DescriptionRiskManagement descriptionRiskManagement = (DescriptionRiskManagement)theEObject;
				T result = caseDescriptionRiskManagement(descriptionRiskManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DESCRIPTION_PROVIDER_RELEVANT_CHANGES: {
				DescriptionProviderRelevantChanges descriptionProviderRelevantChanges = (DescriptionProviderRelevantChanges)theEObject;
				T result = caseDescriptionProviderRelevantChanges(descriptionProviderRelevantChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.LIST_HARMONISED_STANDARDS: {
				ListHarmonisedStandards listHarmonisedStandards = (ListHarmonisedStandards)theEObject;
				T result = caseListHarmonisedStandards(listHarmonisedStandards);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.COPY_EU_CONFORMITY_DECLARATION: {
				CopyEUConformityDeclaration copyEUConformityDeclaration = (CopyEUConformityDeclaration)theEObject;
				T result = caseCopyEUConformityDeclaration(copyEUConformityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE: {
				DescriptionAISystemPostMarketPhase descriptionAISystemPostMarketPhase = (DescriptionAISystemPostMarketPhase)theEObject;
				T result = caseDescriptionAISystemPostMarketPhase(descriptionAISystemPostMarketPhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.DOCUMENTS: {
				Documents documents = (Documents)theEObject;
				T result = caseDocuments(documents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION: {
				TransparencyObligation transparencyObligation = (TransparencyObligation)theEObject;
				T result = caseTransparencyObligation(transparencyObligation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex III Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex III Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnexIIIUseCase(AnnexIIIUseCase object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Safety Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyComponent(SafetyComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Emotion Recognition Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotion Recognition Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotionRecognitionNotification(EmotionRecognitionNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biometric Categorization Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biometric Categorization Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiometricCategorizationNotification(BiometricCategorizationNotification object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Exploiting Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploiting Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExploitingVulnerability(ExploitingVulnerability object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Predictive Policing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predictive Policing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictivePolicing(PredictivePolicing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facial Recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facial Recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacialRecognition(FacialRecognition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>General Description AI System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Description AI System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralDescriptionAISystem(GeneralDescriptionAISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detailed Description AI System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detailed Description AI System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailedDescriptionAISystem(DetailedDescriptionAISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detailed Information AI System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detailed Information AI System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailedInformationAISystem(DetailedInformationAISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Performance Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Performance Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionPerformanceMetrics(DescriptionPerformanceMetrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Risk Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Risk Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionRiskManagement(DescriptionRiskManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Provider Relevant Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Provider Relevant Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionProviderRelevantChanges(DescriptionProviderRelevantChanges object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Copy EU Conformity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy EU Conformity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyEUConformityDeclaration(CopyEUConformityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description AI System Post Market Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description AI System Post Market Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionAISystemPostMarketPhase(DescriptionAISystemPostMarketPhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocuments(Documents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transparency Obligation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transparency Obligation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransparencyObligation(TransparencyObligation object) {
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
