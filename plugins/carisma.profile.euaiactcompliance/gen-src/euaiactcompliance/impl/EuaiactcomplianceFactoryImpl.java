/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.AISystem;
import euaiactcompliance.AdministrationJusticeDemocracy;
import euaiactcompliance.BiometricCategorisation;
import euaiactcompliance.BiometricIdentification;
import euaiactcompliance.CriticalInfrastructure;
import euaiactcompliance.Deepfake;
import euaiactcompliance.Education;
import euaiactcompliance.EmotionRecognition;
import euaiactcompliance.EssentialService;
import euaiactcompliance.EuaiactcomplianceFactory;
import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.ExploitingHumanVulnerability;
import euaiactcompliance.FacialImageScraping;
import euaiactcompliance.HumanEmployment;
import euaiactcompliance.HumanInteraction;
import euaiactcompliance.LawEnforcement;
import euaiactcompliance.ManipulativeBehaviour;
import euaiactcompliance.MigrationBorder;
import euaiactcompliance.ProductCategory;
import euaiactcompliance.ProductEmbedding;
import euaiactcompliance.Profiling;
import euaiactcompliance.PublicInterestText;
import euaiactcompliance.RiskManagementSystem;
import euaiactcompliance.Role;
import euaiactcompliance.SelfDevelopedModel;
import euaiactcompliance.SocialScoring;
import euaiactcompliance.SyntheticContent;
import euaiactcompliance.ThirdPartyComponent;
import euaiactcompliance.TrainingData;

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
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE: return createCriticalInfrastructure();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL: return createSelfDevelopedModel();
			case EuaiactcompliancePackage.EDUCATION: return createEducation();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT: return createHumanEmployment();
			case EuaiactcompliancePackage.TRAINING_DATA: return createTrainingData();
			case EuaiactcompliancePackage.THIRD_PARTY_COMPONENT: return createThirdPartyComponent();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE: return createEssentialService();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT: return createLawEnforcement();
			case EuaiactcompliancePackage.MIGRATION_BORDER: return createMigrationBorder();
			case EuaiactcompliancePackage.ADMINISTRATION_JUSTICE_DEMOCRACY: return createAdministrationJusticeDemocracy();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION: return createBiometricIdentification();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION: return createBiometricCategorisation();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION: return createEmotionRecognition();
			case EuaiactcompliancePackage.RISK_MANAGEMENT_SYSTEM: return createRiskManagementSystem();
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
			case EuaiactcompliancePackage.PRODUCT_CATEGORY:
				return createProductCategoryFromString(eDataType, initialValue);
			case EuaiactcompliancePackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case EuaiactcompliancePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
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
			case EuaiactcompliancePackage.PRODUCT_CATEGORY:
				return convertProductCategoryToString(eDataType, instanceValue);
			case EuaiactcompliancePackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case EuaiactcompliancePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
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
	public SelfDevelopedModel createSelfDevelopedModel() {
		SelfDevelopedModelImpl selfDevelopedModel = new SelfDevelopedModelImpl();
		return selfDevelopedModel;
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
	public AdministrationJusticeDemocracy createAdministrationJusticeDemocracy() {
		AdministrationJusticeDemocracyImpl administrationJusticeDemocracy = new AdministrationJusticeDemocracyImpl();
		return administrationJusticeDemocracy;
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
	public RiskManagementSystem createRiskManagementSystem() {
		RiskManagementSystemImpl riskManagementSystem = new RiskManagementSystemImpl();
		return riskManagementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory createProductCategoryFromString(EDataType eDataType, String initialValue) {
		ProductCategory result = ProductCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductCategoryToString(EDataType eDataType, Object instanceValue) {
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
	public euaiactcompliance.Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		euaiactcompliance.Exception result = euaiactcompliance.Exception.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
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
