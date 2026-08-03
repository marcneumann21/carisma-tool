/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case EuaiactcompliancePackage.PROFILING: return createProfiling();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING: return createProductEmbedding();
			case EuaiactcompliancePackage.HUMAN_INTERACTION: return createHumanInteraction();
			case EuaiactcompliancePackage.SYNTHETIC_CONTENT: return createSyntheticContent();
			case EuaiactcompliancePackage.DEEPFAKE: return createDeepfake();
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT: return createPublicInterestText();
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR: return createManipulativeBehaviour();
			case EuaiactcompliancePackage.EXPLOITING_HUMAN_VULNERABILITY: return createExploitingHumanVulnerability();
			case EuaiactcompliancePackage.SOCIAL_SCORING: return createSocialScoring();
			case EuaiactcompliancePackage.FACIAL_IMAGE_SCRAPING: return createFacialImageScraping();
			case EuaiactcompliancePackage.AI_SYSTEM: return createAISystem();
			case EuaiactcompliancePackage.PROVIDER: return createProvider();
			case EuaiactcompliancePackage.PROVIDES: return createProvides();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE: return createCriticalInfrastructure();
			case EuaiactcompliancePackage.ML_MODEL: return createMLModel();
			case EuaiactcompliancePackage.EDUCATION: return createEducation();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT: return createHumanEmployment();
			case EuaiactcompliancePackage.TRAINING_DATA: return createTrainingData();
			case EuaiactcompliancePackage.THIRD_PARTY_COMPONENT: return createThirdPartyComponent();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE: return createEssentialService();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT: return createLawEnforcement();
			case EuaiactcompliancePackage.MIGRATION_BORDER: return createMigrationBorder();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE: return createJusticeDemocracyUseCase();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION: return createBiometricIdentification();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION: return createBiometricCategorisation();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION: return createEmotionRecognition();
			case EuaiactcompliancePackage.RISK_MANAGEMENT: return createRiskManagement();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EuaiactcompliancePackage.CATEGORY:
				return createCategoryFromString(eDataType, initialValue);
			case EuaiactcompliancePackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EuaiactcompliancePackage.CATEGORY:
				return convertCategoryToString(eDataType, instanceValue);
			case EuaiactcompliancePackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public ProductEmbedding createProductEmbedding() {
		ProductEmbeddingImpl productEmbedding = new ProductEmbeddingImpl();
		return productEmbedding;
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
	public ExploitingHumanVulnerability createExploitingHumanVulnerability() {
		ExploitingHumanVulnerabilityImpl exploitingHumanVulnerability = new ExploitingHumanVulnerabilityImpl();
		return exploitingHumanVulnerability;
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
	public FacialImageScraping createFacialImageScraping() {
		FacialImageScrapingImpl facialImageScraping = new FacialImageScrapingImpl();
		return facialImageScraping;
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
	public Provides createProvides() {
		ProvidesImpl provides = new ProvidesImpl();
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriticalInfrastructure createCriticalInfrastructure() {
		CriticalInfrastructureImpl criticalInfrastructure = new CriticalInfrastructureImpl();
		return criticalInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLModel createMLModel() {
		MLModelImpl mlModel = new MLModelImpl();
		return mlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Education createEducation() {
		EducationImpl education = new EducationImpl();
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanEmployment createHumanEmployment() {
		HumanEmploymentImpl humanEmployment = new HumanEmploymentImpl();
		return humanEmployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingData createTrainingData() {
		TrainingDataImpl trainingData = new TrainingDataImpl();
		return trainingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThirdPartyComponent createThirdPartyComponent() {
		ThirdPartyComponentImpl thirdPartyComponent = new ThirdPartyComponentImpl();
		return thirdPartyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EssentialService createEssentialService() {
		EssentialServiceImpl essentialService = new EssentialServiceImpl();
		return essentialService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LawEnforcement createLawEnforcement() {
		LawEnforcementImpl lawEnforcement = new LawEnforcementImpl();
		return lawEnforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrationBorder createMigrationBorder() {
		MigrationBorderImpl migrationBorder = new MigrationBorderImpl();
		return migrationBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JusticeDemocracyUseCase createJusticeDemocracyUseCase() {
		JusticeDemocracyUseCaseImpl justiceDemocracyUseCase = new JusticeDemocracyUseCaseImpl();
		return justiceDemocracyUseCase;
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
	public RiskManagement createRiskManagement() {
		RiskManagementImpl riskManagement = new RiskManagementImpl();
		return riskManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue) {
		Category result = Category.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
