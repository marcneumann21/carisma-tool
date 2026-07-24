/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuaiactcomplianceFactoryImpl extends EFactoryImpl implements EuaiactcomplianceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EuaiactcomplianceFactory init() {
		try {
			EuaiactcomplianceFactory theEuaiactcomplianceFactory = (EuaiactcomplianceFactory)EPackage.Registry.INSTANCE.getEFactory(EuaiactcompliancePackage.eNS_URI);
			if (theEuaiactcomplianceFactory != null) {
				return theEuaiactcomplianceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EuaiactcomplianceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuaiactcomplianceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE: return createAnnexIIIUseCase();
			case EuaiactcompliancePackage.PROFILING: return createProfiling();
			case EuaiactcompliancePackage.SAFETY_COMPONENT: return createSafetyComponent();
			case EuaiactcompliancePackage.HUMAN_INTERACTION: return createHumanInteraction();
			case EuaiactcompliancePackage.SYNTHETIC_CONTENT: return createSyntheticContent();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION_NOTIFICATION: return createEmotionRecognitionNotification();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORIZATION_NOTIFICATION: return createBiometricCategorizationNotification();
			case EuaiactcompliancePackage.DEEPFAKE: return createDeepfake();
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT: return createPublicInterestText();
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR: return createManipulativeBehaviour();
			case EuaiactcompliancePackage.EXPLOITING_VULNERABILITY: return createExploitingVulnerability();
			case EuaiactcompliancePackage.SOCIAL_SCORING: return createSocialScoring();
			case EuaiactcompliancePackage.PREDICTIVE_POLICING: return createPredictivePolicing();
			case EuaiactcompliancePackage.FACIAL_RECOGNITION: return createFacialRecognition();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION: return createEmotionRecognition();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION: return createBiometricCategorisation();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION: return createBiometricIdentification();
			case EuaiactcompliancePackage.AI_SYSTEM: return createAISystem();
			case EuaiactcompliancePackage.PROVIDER: return createProvider();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM: return createGeneralDescriptionAISystem();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM: return createDetailedDescriptionAISystem();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM: return createDetailedInformationAISystem();
			case EuaiactcompliancePackage.DESCRIPTION_PERFORMANCE_METRICS: return createDescriptionPerformanceMetrics();
			case EuaiactcompliancePackage.DESCRIPTION_RISK_MANAGEMENT: return createDescriptionRiskManagement();
			case EuaiactcompliancePackage.DESCRIPTION_PROVIDER_RELEVANT_CHANGES: return createDescriptionProviderRelevantChanges();
			case EuaiactcompliancePackage.LIST_HARMONISED_STANDARDS: return createListHarmonisedStandards();
			case EuaiactcompliancePackage.COPY_EU_CONFORMITY_DECLARATION: return createCopyEUConformityDeclaration();
			case EuaiactcompliancePackage.DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE: return createDescriptionAISystemPostMarketPhase();
			case EuaiactcompliancePackage.DOCUMENTS: return createDocuments();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION: return createTransparencyObligation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexIIIUseCase createAnnexIIIUseCase() {
		AnnexIIIUseCaseImpl annexIIIUseCase = new AnnexIIIUseCaseImpl();
		return annexIIIUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profiling createProfiling() {
		ProfilingImpl profiling = new ProfilingImpl();
		return profiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyComponent createSafetyComponent() {
		SafetyComponentImpl safetyComponent = new SafetyComponentImpl();
		return safetyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanInteraction createHumanInteraction() {
		HumanInteractionImpl humanInteraction = new HumanInteractionImpl();
		return humanInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyntheticContent createSyntheticContent() {
		SyntheticContentImpl syntheticContent = new SyntheticContentImpl();
		return syntheticContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmotionRecognitionNotification createEmotionRecognitionNotification() {
		EmotionRecognitionNotificationImpl emotionRecognitionNotification = new EmotionRecognitionNotificationImpl();
		return emotionRecognitionNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiometricCategorizationNotification createBiometricCategorizationNotification() {
		BiometricCategorizationNotificationImpl biometricCategorizationNotification = new BiometricCategorizationNotificationImpl();
		return biometricCategorizationNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deepfake createDeepfake() {
		DeepfakeImpl deepfake = new DeepfakeImpl();
		return deepfake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicInterestText createPublicInterestText() {
		PublicInterestTextImpl publicInterestText = new PublicInterestTextImpl();
		return publicInterestText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManipulativeBehaviour createManipulativeBehaviour() {
		ManipulativeBehaviourImpl manipulativeBehaviour = new ManipulativeBehaviourImpl();
		return manipulativeBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExploitingVulnerability createExploitingVulnerability() {
		ExploitingVulnerabilityImpl exploitingVulnerability = new ExploitingVulnerabilityImpl();
		return exploitingVulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialScoring createSocialScoring() {
		SocialScoringImpl socialScoring = new SocialScoringImpl();
		return socialScoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredictivePolicing createPredictivePolicing() {
		PredictivePolicingImpl predictivePolicing = new PredictivePolicingImpl();
		return predictivePolicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacialRecognition createFacialRecognition() {
		FacialRecognitionImpl facialRecognition = new FacialRecognitionImpl();
		return facialRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmotionRecognition createEmotionRecognition() {
		EmotionRecognitionImpl emotionRecognition = new EmotionRecognitionImpl();
		return emotionRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiometricCategorisation createBiometricCategorisation() {
		BiometricCategorisationImpl biometricCategorisation = new BiometricCategorisationImpl();
		return biometricCategorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BiometricIdentification createBiometricIdentification() {
		BiometricIdentificationImpl biometricIdentification = new BiometricIdentificationImpl();
		return biometricIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AISystem createAISystem() {
		AISystemImpl aiSystem = new AISystemImpl();
		return aiSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralDescriptionAISystem createGeneralDescriptionAISystem() {
		GeneralDescriptionAISystemImpl generalDescriptionAISystem = new GeneralDescriptionAISystemImpl();
		return generalDescriptionAISystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailedDescriptionAISystem createDetailedDescriptionAISystem() {
		DetailedDescriptionAISystemImpl detailedDescriptionAISystem = new DetailedDescriptionAISystemImpl();
		return detailedDescriptionAISystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailedInformationAISystem createDetailedInformationAISystem() {
		DetailedInformationAISystemImpl detailedInformationAISystem = new DetailedInformationAISystemImpl();
		return detailedInformationAISystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionPerformanceMetrics createDescriptionPerformanceMetrics() {
		DescriptionPerformanceMetricsImpl descriptionPerformanceMetrics = new DescriptionPerformanceMetricsImpl();
		return descriptionPerformanceMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionRiskManagement createDescriptionRiskManagement() {
		DescriptionRiskManagementImpl descriptionRiskManagement = new DescriptionRiskManagementImpl();
		return descriptionRiskManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionProviderRelevantChanges createDescriptionProviderRelevantChanges() {
		DescriptionProviderRelevantChangesImpl descriptionProviderRelevantChanges = new DescriptionProviderRelevantChangesImpl();
		return descriptionProviderRelevantChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListHarmonisedStandards createListHarmonisedStandards() {
		ListHarmonisedStandardsImpl listHarmonisedStandards = new ListHarmonisedStandardsImpl();
		return listHarmonisedStandards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyEUConformityDeclaration createCopyEUConformityDeclaration() {
		CopyEUConformityDeclarationImpl copyEUConformityDeclaration = new CopyEUConformityDeclarationImpl();
		return copyEUConformityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionAISystemPostMarketPhase createDescriptionAISystemPostMarketPhase() {
		DescriptionAISystemPostMarketPhaseImpl descriptionAISystemPostMarketPhase = new DescriptionAISystemPostMarketPhaseImpl();
		return descriptionAISystemPostMarketPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documents createDocuments() {
		DocumentsImpl documents = new DocumentsImpl();
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransparencyObligation createTransparencyObligation() {
		TransparencyObligationImpl transparencyObligation = new TransparencyObligationImpl();
		return transparencyObligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EuaiactcompliancePackage getEuaiactcompliancePackage() {
		return (EuaiactcompliancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EuaiactcompliancePackage getPackage() {
		return EuaiactcompliancePackage.eINSTANCE;
	}

} //EuaiactcomplianceFactoryImpl
