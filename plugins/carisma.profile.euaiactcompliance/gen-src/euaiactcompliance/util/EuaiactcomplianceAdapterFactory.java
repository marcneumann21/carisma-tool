/**
 */
package euaiactcompliance.util;

import euaiactcompliance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage
 * @generated
 */
public class EuaiactcomplianceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EuaiactcompliancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuaiactcomplianceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EuaiactcompliancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EuaiactcomplianceSwitch<Adapter> modelSwitch =
		new EuaiactcomplianceSwitch<Adapter>() {
			@Override
			public Adapter caseAnnexIIIUseCase(AnnexIIIUseCase object) {
				return createAnnexIIIUseCaseAdapter();
			}
			@Override
			public Adapter caseProfiling(Profiling object) {
				return createProfilingAdapter();
			}
			@Override
			public Adapter caseSafetyComponent(SafetyComponent object) {
				return createSafetyComponentAdapter();
			}
			@Override
			public Adapter caseHumanInteraction(HumanInteraction object) {
				return createHumanInteractionAdapter();
			}
			@Override
			public Adapter caseSyntheticContent(SyntheticContent object) {
				return createSyntheticContentAdapter();
			}
			@Override
			public Adapter caseEmotionRecognitionNotification(EmotionRecognitionNotification object) {
				return createEmotionRecognitionNotificationAdapter();
			}
			@Override
			public Adapter caseBiometricCategorizationNotification(BiometricCategorizationNotification object) {
				return createBiometricCategorizationNotificationAdapter();
			}
			@Override
			public Adapter caseDeepfake(Deepfake object) {
				return createDeepfakeAdapter();
			}
			@Override
			public Adapter casePublicInterestText(PublicInterestText object) {
				return createPublicInterestTextAdapter();
			}
			@Override
			public Adapter caseManipulativeBehaviour(ManipulativeBehaviour object) {
				return createManipulativeBehaviourAdapter();
			}
			@Override
			public Adapter caseExploitingVulnerability(ExploitingVulnerability object) {
				return createExploitingVulnerabilityAdapter();
			}
			@Override
			public Adapter caseSocialScoring(SocialScoring object) {
				return createSocialScoringAdapter();
			}
			@Override
			public Adapter casePredictivePolicing(PredictivePolicing object) {
				return createPredictivePolicingAdapter();
			}
			@Override
			public Adapter caseFacialRecognition(FacialRecognition object) {
				return createFacialRecognitionAdapter();
			}
			@Override
			public Adapter caseEmotionRecognition(EmotionRecognition object) {
				return createEmotionRecognitionAdapter();
			}
			@Override
			public Adapter caseBiometricCategorisation(BiometricCategorisation object) {
				return createBiometricCategorisationAdapter();
			}
			@Override
			public Adapter caseBiometricIdentification(BiometricIdentification object) {
				return createBiometricIdentificationAdapter();
			}
			@Override
			public Adapter caseAISystem(AISystem object) {
				return createAISystemAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseGeneralDescriptionAISystem(GeneralDescriptionAISystem object) {
				return createGeneralDescriptionAISystemAdapter();
			}
			@Override
			public Adapter caseDetailedDescriptionAISystem(DetailedDescriptionAISystem object) {
				return createDetailedDescriptionAISystemAdapter();
			}
			@Override
			public Adapter caseDetailedInformationAISystem(DetailedInformationAISystem object) {
				return createDetailedInformationAISystemAdapter();
			}
			@Override
			public Adapter caseDescriptionPerformanceMetrics(DescriptionPerformanceMetrics object) {
				return createDescriptionPerformanceMetricsAdapter();
			}
			@Override
			public Adapter caseDescriptionRiskManagement(DescriptionRiskManagement object) {
				return createDescriptionRiskManagementAdapter();
			}
			@Override
			public Adapter caseDescriptionProviderRelevantChanges(DescriptionProviderRelevantChanges object) {
				return createDescriptionProviderRelevantChangesAdapter();
			}
			@Override
			public Adapter caseListHarmonisedStandards(ListHarmonisedStandards object) {
				return createListHarmonisedStandardsAdapter();
			}
			@Override
			public Adapter caseCopyEUConformityDeclaration(CopyEUConformityDeclaration object) {
				return createCopyEUConformityDeclarationAdapter();
			}
			@Override
			public Adapter caseDescriptionAISystemPostMarketPhase(DescriptionAISystemPostMarketPhase object) {
				return createDescriptionAISystemPostMarketPhaseAdapter();
			}
			@Override
			public Adapter caseDocuments(Documents object) {
				return createDocumentsAdapter();
			}
			@Override
			public Adapter caseTransparencyObligation(TransparencyObligation object) {
				return createTransparencyObligationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.AnnexIIIUseCase <em>Annex III Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.AnnexIIIUseCase
	 * @generated
	 */
	public Adapter createAnnexIIIUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Profiling <em>Profiling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Profiling
	 * @generated
	 */
	public Adapter createProfilingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SafetyComponent <em>Safety Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SafetyComponent
	 * @generated
	 */
	public Adapter createSafetyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.HumanInteraction <em>Human Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.HumanInteraction
	 * @generated
	 */
	public Adapter createHumanInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SyntheticContent <em>Synthetic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SyntheticContent
	 * @generated
	 */
	public Adapter createSyntheticContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.EmotionRecognitionNotification <em>Emotion Recognition Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.EmotionRecognitionNotification
	 * @generated
	 */
	public Adapter createEmotionRecognitionNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.BiometricCategorizationNotification <em>Biometric Categorization Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.BiometricCategorizationNotification
	 * @generated
	 */
	public Adapter createBiometricCategorizationNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Deepfake <em>Deepfake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Deepfake
	 * @generated
	 */
	public Adapter createDeepfakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.PublicInterestText <em>Public Interest Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.PublicInterestText
	 * @generated
	 */
	public Adapter createPublicInterestTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ManipulativeBehaviour <em>Manipulative Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ManipulativeBehaviour
	 * @generated
	 */
	public Adapter createManipulativeBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ExploitingVulnerability <em>Exploiting Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ExploitingVulnerability
	 * @generated
	 */
	public Adapter createExploitingVulnerabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.SocialScoring <em>Social Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.SocialScoring
	 * @generated
	 */
	public Adapter createSocialScoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.PredictivePolicing <em>Predictive Policing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.PredictivePolicing
	 * @generated
	 */
	public Adapter createPredictivePolicingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.FacialRecognition <em>Facial Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.FacialRecognition
	 * @generated
	 */
	public Adapter createFacialRecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.EmotionRecognition <em>Emotion Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.EmotionRecognition
	 * @generated
	 */
	public Adapter createEmotionRecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.BiometricCategorisation <em>Biometric Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.BiometricCategorisation
	 * @generated
	 */
	public Adapter createBiometricCategorisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.BiometricIdentification <em>Biometric Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.BiometricIdentification
	 * @generated
	 */
	public Adapter createBiometricIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.AISystem <em>AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.AISystem
	 * @generated
	 */
	public Adapter createAISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.GeneralDescriptionAISystem <em>General Description AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.GeneralDescriptionAISystem
	 * @generated
	 */
	public Adapter createGeneralDescriptionAISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DetailedDescriptionAISystem <em>Detailed Description AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DetailedDescriptionAISystem
	 * @generated
	 */
	public Adapter createDetailedDescriptionAISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DetailedInformationAISystem <em>Detailed Information AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DetailedInformationAISystem
	 * @generated
	 */
	public Adapter createDetailedInformationAISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DescriptionPerformanceMetrics <em>Description Performance Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DescriptionPerformanceMetrics
	 * @generated
	 */
	public Adapter createDescriptionPerformanceMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DescriptionRiskManagement <em>Description Risk Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DescriptionRiskManagement
	 * @generated
	 */
	public Adapter createDescriptionRiskManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DescriptionProviderRelevantChanges <em>Description Provider Relevant Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DescriptionProviderRelevantChanges
	 * @generated
	 */
	public Adapter createDescriptionProviderRelevantChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.ListHarmonisedStandards <em>List Harmonised Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.ListHarmonisedStandards
	 * @generated
	 */
	public Adapter createListHarmonisedStandardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.CopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.CopyEUConformityDeclaration
	 * @generated
	 */
	public Adapter createCopyEUConformityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.DescriptionAISystemPostMarketPhase <em>Description AI System Post Market Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.DescriptionAISystemPostMarketPhase
	 * @generated
	 */
	public Adapter createDescriptionAISystemPostMarketPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.Documents <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.Documents
	 * @generated
	 */
	public Adapter createDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link euaiactcompliance.TransparencyObligation <em>Transparency Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see euaiactcompliance.TransparencyObligation
	 * @generated
	 */
	public Adapter createTransparencyObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EuaiactcomplianceAdapterFactory
