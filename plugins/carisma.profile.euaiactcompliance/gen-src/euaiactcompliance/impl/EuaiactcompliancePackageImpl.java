/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.AISystem;
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
import euaiactcompliance.JusticeDemocracyUseCase;
import euaiactcompliance.LawEnforcement;
import euaiactcompliance.ManipulativeBehaviour;
import euaiactcompliance.MigrationBorder;
import euaiactcompliance.ProductCategory;
import euaiactcompliance.ProductEmbedding;
import euaiactcompliance.Profiling;
import euaiactcompliance.Provider;
import euaiactcompliance.Provides;
import euaiactcompliance.PublicInterestText;
import euaiactcompliance.RiskManagementSystem;
import euaiactcompliance.Role;
import euaiactcompliance.SelfDevelopedModel;
import euaiactcompliance.SocialScoring;
import euaiactcompliance.SyntheticContent;
import euaiactcompliance.ThirdPartyComponent;
import euaiactcompliance.TrainingData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuaiactcompliancePackageImpl extends EPackageImpl implements EuaiactcompliancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profilingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEmbeddingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntheticContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deepfakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicInterestTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manipulativeBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exploitingHumanVulnerabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialScoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facialImageScrapingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfDevelopedModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEmploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdPartyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass essentialServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lawEnforcementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationBorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justiceDemocracyUseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biometricIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biometricCategorisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionRecognitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskManagementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exceptionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see euaiactcompliance.EuaiactcompliancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EuaiactcompliancePackageImpl() {
		super(eNS_URI, EuaiactcomplianceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EuaiactcompliancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EuaiactcompliancePackage init() {
		if (isInited) return (EuaiactcompliancePackage)EPackage.Registry.INSTANCE.getEPackage(EuaiactcompliancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEuaiactcompliancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EuaiactcompliancePackageImpl theEuaiactcompliancePackage = registeredEuaiactcompliancePackage instanceof EuaiactcompliancePackageImpl ? (EuaiactcompliancePackageImpl)registeredEuaiactcompliancePackage : new EuaiactcompliancePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEuaiactcompliancePackage.createPackageContents();

		// Initialize created meta-data
		theEuaiactcompliancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEuaiactcompliancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EuaiactcompliancePackage.eNS_URI, theEuaiactcompliancePackage);
		return theEuaiactcompliancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfiling() {
		return profilingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfiling_Base_UseCase() {
		return (EReference)profilingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductEmbedding() {
		return productEmbeddingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductEmbedding_Base_Component() {
		return (EReference)productEmbeddingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductEmbedding_FailureEndangerSafety() {
		return (EAttribute)productEmbeddingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductEmbedding_ThirdPartyConformityAssessment() {
		return (EAttribute)productEmbeddingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductEmbedding_ProductCategory() {
		return (EAttribute)productEmbeddingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductEmbedding_Role() {
		return (EAttribute)productEmbeddingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanInteraction() {
		return humanInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanInteraction_Base_UseCase() {
		return (EReference)humanInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanInteraction_LawEnforcementAuthorised() {
		return (EAttribute)humanInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanInteraction_ObviousAIInteraction() {
		return (EAttribute)humanInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanInteraction_PuplicCriminalOffenceReport() {
		return (EAttribute)humanInteractionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSyntheticContent() {
		return syntheticContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSyntheticContent_Base_UseCase() {
		return (EReference)syntheticContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyntheticContent_LawEnforcementAuthorised() {
		return (EAttribute)syntheticContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSyntheticContent_StandardEditingOnly() {
		return (EAttribute)syntheticContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeepfake() {
		return deepfakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeepfake_Base_UseCase() {
		return (EReference)deepfakeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeepfake_CreativeWork() {
		return (EAttribute)deepfakeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeepfake_LawEnforcementAuthorised() {
		return (EAttribute)deepfakeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicInterestText() {
		return publicInterestTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicInterestText_Base_UseCase() {
		return (EReference)publicInterestTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicInterestText_HumanReview() {
		return (EAttribute)publicInterestTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicInterestText_LawEnforcementAuthorised() {
		return (EAttribute)publicInterestTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManipulativeBehaviour() {
		return manipulativeBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManipulativeBehaviour_SubliminalTechniques() {
		return (EAttribute)manipulativeBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManipulativeBehaviour_DeceptiveTechniques() {
		return (EAttribute)manipulativeBehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManipulativeBehaviour_Base_UseCase() {
		return (EReference)manipulativeBehaviourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExploitingHumanVulnerability() {
		return exploitingHumanVulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingHumanVulnerability_Age() {
		return (EAttribute)exploitingHumanVulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingHumanVulnerability_Disability() {
		return (EAttribute)exploitingHumanVulnerabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingHumanVulnerability_Social() {
		return (EAttribute)exploitingHumanVulnerabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingHumanVulnerability_Economic() {
		return (EAttribute)exploitingHumanVulnerabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExploitingHumanVulnerability_Base_UseCase() {
		return (EReference)exploitingHumanVulnerabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialScoring() {
		return socialScoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSocialScoring_Base_UseCase() {
		return (EReference)socialScoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacialImageScraping() {
		return facialImageScrapingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacialImageScraping_Internet() {
		return (EAttribute)facialImageScrapingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacialImageScraping_CCTV() {
		return (EAttribute)facialImageScrapingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacialImageScraping_Base_UseCase() {
		return (EReference)facialImageScrapingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAISystem() {
		return aiSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAISystem_Base_Component() {
		return (EReference)aiSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Purpose() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Version() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_ExternalInteraction() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_MarketPlacementForm() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Hardware() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_VisualDocumentation() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_UserInterface() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Instructions() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_DevelopmentProcess() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_DesignSpecification() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_DesignDecision() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_DesignTradeOffs() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Resources() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_HumanOversightPreAssessment() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_PlannedModification() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_Cybersecurity() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_HumanOversightPostAssessment() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_UpdateRequirements() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_PredictableRisks() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_PerformanceMetricsSuitability() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_RelevantChanges() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_HarmonisedStandards() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_CopyEUConformityDeclaration() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAISystem_PostMarketMonitoring() {
		return (EAttribute)aiSystemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvider_Base_Actor() {
		return (EReference)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvides() {
		return providesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvides_Base_Association() {
		return (EReference)providesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriticalInfrastructure() {
		return criticalInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_DigitalInfrastructure() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_RoadTraffic() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_WaterSupply() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_GasSupply() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_HeatSupply() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_ElectricitySupply() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriticalInfrastructure_Base_UseCase() {
		return (EReference)criticalInfrastructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_ExceptionJustification() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCriticalInfrastructure_Exception() {
		return (EAttribute)criticalInfrastructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfDevelopedModel() {
		return selfDevelopedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_Parameter() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_TrainingMethods() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_Objective() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_ValidationProcess() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_ExpectedOutput() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_TestingProcess() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_Accuracy() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_Capabilities() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_TestReports() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelfDevelopedModel_Base_Component() {
		return (EReference)selfDevelopedModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfDevelopedModel_InputSpecification() {
		return (EAttribute)selfDevelopedModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEducation() {
		return educationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_AccessAdmission() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_LearningOutcomeEvaluation() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_EducationLevelAssessment() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_ExamMonitoring() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEducation_Base_UseCase() {
		return (EReference)educationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_ExceptionJustification() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Exception() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanEmployment() {
		return humanEmploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanEmployment_Recruitment() {
		return (EAttribute)humanEmploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanEmployment_WorkConditionsDecisions() {
		return (EAttribute)humanEmploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanEmployment_Base_UseCase() {
		return (EReference)humanEmploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanEmployment_Exception() {
		return (EAttribute)humanEmploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHumanEmployment_ExceptionJustification() {
		return (EAttribute)humanEmploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrainingData() {
		return trainingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Cleaning() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Labeling() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Selection() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Description() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Origin() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrainingData_Scope() {
		return (EAttribute)trainingDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrainingData_Base_Artifact() {
		return (EReference)trainingDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThirdPartyComponent() {
		return thirdPartyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThirdPartyComponent_Origin() {
		return (EAttribute)thirdPartyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThirdPartyComponent_IntegrationDescription() {
		return (EAttribute)thirdPartyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThirdPartyComponent_Base_Component() {
		return (EReference)thirdPartyComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEssentialService() {
		return essentialServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_Creditworthiness() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_PublicBenefitsEligibility() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_FraudDetectionOnly() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_InsuranceRiskPricing() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEssentialService_Base_UseCase() {
		return (EReference)essentialServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_Emergency() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_ExceptionJustification() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEssentialService_Exception() {
		return (EAttribute)essentialServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLawEnforcement() {
		return lawEnforcementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_VictimRiskAssessment() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_LieDetection() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_EvidenceReliability() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_OffendingRiskAssessment() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_SolelyProfilingBased() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLawEnforcement_Base_UseCase() {
		return (EReference)lawEnforcementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_SupportsHumanAssessment() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_ExceptionJustification() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawEnforcement_Exception() {
		return (EAttribute)lawEnforcementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrationBorder() {
		return migrationBorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_LieDetection() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_EntryRiskAssessment() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_AsylumVisaResidencePermitsApplication() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_TravelDocumentVerificationOnly() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_PersonIdentification() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMigrationBorder_Base_UseCase() {
		return (EReference)migrationBorderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_Exception() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigrationBorder_ExceptionJustification() {
		return (EAttribute)migrationBorderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJusticeDemocracyUseCase() {
		return justiceDemocracyUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJusticeDemocracyUseCase_JudicialSupport() {
		return (EAttribute)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJusticeDemocracyUseCase_ElectionInfluence() {
		return (EAttribute)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJusticeDemocracyUseCase_NoDirectExposure() {
		return (EAttribute)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJusticeDemocracyUseCase_Base_UseCase() {
		return (EReference)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJusticeDemocracyUseCase_Exception() {
		return (EAttribute)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJusticeDemocracyUseCase_ExceptionJustification() {
		return (EAttribute)justiceDemocracyUseCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBiometricIdentification() {
		return biometricIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_VerificationOnly() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_RealTime() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_PubliclyAccessibleSpace() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_LawEnforcementPurpose() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_VictimSearch() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_ImminentThreatPrevention() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_SeriousCrimeSuspectSearch() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBiometricIdentification_Base_UseCase() {
		return (EReference)biometricIdentificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_Exception() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_ExceptionJustification() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBiometricCategorisation() {
		return biometricCategorisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_DeduceRace() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_DeducePoliticalOpinion() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_DeduceReligiousBelief() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_DeduceUnionMembership() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_DeduceSexuality() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_LawfulDatasetLabeling() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_LawEnforcementCategorisation() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBiometricCategorisation_Base_UseCase() {
		return (EReference)biometricCategorisationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_Exception() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_ExceptionJustification() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotionRecognition() {
		return emotionRecognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Education() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Workplace() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_MedicalOrSafetyReason() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotionRecognition_Base_UseCase() {
		return (EReference)emotionRecognitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_ExceptionJustificatio() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Exception() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskManagementSystem() {
		return riskManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_RiskIdentification() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_RiskEstimation() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_PostMarketRiskEvaluation() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_RiskMitigation() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_ResidualRisk() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_TestingProcedure() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_TestingMetrics() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskManagementSystem_VulnerableGroupsAssessment() {
		return (EAttribute)riskManagementSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskManagementSystem_Base_Artifact() {
		return (EReference)riskManagementSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProductCategory() {
		return productCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getException() {
		return exceptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EuaiactcomplianceFactory getEuaiactcomplianceFactory() {
		return (EuaiactcomplianceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		profilingEClass = createEClass(PROFILING);
		createEReference(profilingEClass, PROFILING__BASE_USE_CASE);

		productEmbeddingEClass = createEClass(PRODUCT_EMBEDDING);
		createEReference(productEmbeddingEClass, PRODUCT_EMBEDDING__BASE_COMPONENT);
		createEAttribute(productEmbeddingEClass, PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY);
		createEAttribute(productEmbeddingEClass, PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT);
		createEAttribute(productEmbeddingEClass, PRODUCT_EMBEDDING__PRODUCT_CATEGORY);
		createEAttribute(productEmbeddingEClass, PRODUCT_EMBEDDING__ROLE);

		humanInteractionEClass = createEClass(HUMAN_INTERACTION);
		createEReference(humanInteractionEClass, HUMAN_INTERACTION__BASE_USE_CASE);
		createEAttribute(humanInteractionEClass, HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED);
		createEAttribute(humanInteractionEClass, HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION);
		createEAttribute(humanInteractionEClass, HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT);

		syntheticContentEClass = createEClass(SYNTHETIC_CONTENT);
		createEReference(syntheticContentEClass, SYNTHETIC_CONTENT__BASE_USE_CASE);
		createEAttribute(syntheticContentEClass, SYNTHETIC_CONTENT__LAW_ENFORCEMENT_AUTHORISED);
		createEAttribute(syntheticContentEClass, SYNTHETIC_CONTENT__STANDARD_EDITING_ONLY);

		deepfakeEClass = createEClass(DEEPFAKE);
		createEReference(deepfakeEClass, DEEPFAKE__BASE_USE_CASE);
		createEAttribute(deepfakeEClass, DEEPFAKE__CREATIVE_WORK);
		createEAttribute(deepfakeEClass, DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED);

		publicInterestTextEClass = createEClass(PUBLIC_INTEREST_TEXT);
		createEReference(publicInterestTextEClass, PUBLIC_INTEREST_TEXT__BASE_USE_CASE);
		createEAttribute(publicInterestTextEClass, PUBLIC_INTEREST_TEXT__HUMAN_REVIEW);
		createEAttribute(publicInterestTextEClass, PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED);

		manipulativeBehaviourEClass = createEClass(MANIPULATIVE_BEHAVIOUR);
		createEAttribute(manipulativeBehaviourEClass, MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES);
		createEAttribute(manipulativeBehaviourEClass, MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES);
		createEReference(manipulativeBehaviourEClass, MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE);

		exploitingHumanVulnerabilityEClass = createEClass(EXPLOITING_HUMAN_VULNERABILITY);
		createEAttribute(exploitingHumanVulnerabilityEClass, EXPLOITING_HUMAN_VULNERABILITY__AGE);
		createEAttribute(exploitingHumanVulnerabilityEClass, EXPLOITING_HUMAN_VULNERABILITY__DISABILITY);
		createEAttribute(exploitingHumanVulnerabilityEClass, EXPLOITING_HUMAN_VULNERABILITY__SOCIAL);
		createEAttribute(exploitingHumanVulnerabilityEClass, EXPLOITING_HUMAN_VULNERABILITY__ECONOMIC);
		createEReference(exploitingHumanVulnerabilityEClass, EXPLOITING_HUMAN_VULNERABILITY__BASE_USE_CASE);

		socialScoringEClass = createEClass(SOCIAL_SCORING);
		createEReference(socialScoringEClass, SOCIAL_SCORING__BASE_USE_CASE);

		facialImageScrapingEClass = createEClass(FACIAL_IMAGE_SCRAPING);
		createEAttribute(facialImageScrapingEClass, FACIAL_IMAGE_SCRAPING__INTERNET);
		createEAttribute(facialImageScrapingEClass, FACIAL_IMAGE_SCRAPING__CCTV);
		createEReference(facialImageScrapingEClass, FACIAL_IMAGE_SCRAPING__BASE_USE_CASE);

		aiSystemEClass = createEClass(AI_SYSTEM);
		createEReference(aiSystemEClass, AI_SYSTEM__BASE_COMPONENT);
		createEAttribute(aiSystemEClass, AI_SYSTEM__PURPOSE);
		createEAttribute(aiSystemEClass, AI_SYSTEM__VERSION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__EXTERNAL_INTERACTION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__MARKET_PLACEMENT_FORM);
		createEAttribute(aiSystemEClass, AI_SYSTEM__HARDWARE);
		createEAttribute(aiSystemEClass, AI_SYSTEM__VISUAL_DOCUMENTATION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__USER_INTERFACE);
		createEAttribute(aiSystemEClass, AI_SYSTEM__INSTRUCTIONS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__DEVELOPMENT_PROCESS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__DESIGN_SPECIFICATION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__DESIGN_DECISION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__DESIGN_TRADE_OFFS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__RESOURCES);
		createEAttribute(aiSystemEClass, AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT);
		createEAttribute(aiSystemEClass, AI_SYSTEM__PLANNED_MODIFICATION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__CYBERSECURITY);
		createEAttribute(aiSystemEClass, AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT);
		createEAttribute(aiSystemEClass, AI_SYSTEM__UPDATE_REQUIREMENTS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__PREDICTABLE_RISKS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY);
		createEAttribute(aiSystemEClass, AI_SYSTEM__RELEVANT_CHANGES);
		createEAttribute(aiSystemEClass, AI_SYSTEM__HARMONISED_STANDARDS);
		createEAttribute(aiSystemEClass, AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION);
		createEAttribute(aiSystemEClass, AI_SYSTEM__POST_MARKET_MONITORING);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__BASE_ACTOR);

		providesEClass = createEClass(PROVIDES);
		createEReference(providesEClass, PROVIDES__BASE_ASSOCIATION);

		criticalInfrastructureEClass = createEClass(CRITICAL_INFRASTRUCTURE);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__WATER_SUPPLY);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__GAS_SUPPLY);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY);
		createEReference(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__BASE_USE_CASE);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION);
		createEAttribute(criticalInfrastructureEClass, CRITICAL_INFRASTRUCTURE__EXCEPTION);

		selfDevelopedModelEClass = createEClass(SELF_DEVELOPED_MODEL);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__PARAMETER);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__TRAINING_METHODS);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__OBJECTIVE);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__VALIDATION_PROCESS);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__TESTING_PROCESS);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__ACCURACY);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__CAPABILITIES);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__TEST_REPORTS);
		createEReference(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__BASE_COMPONENT);
		createEAttribute(selfDevelopedModelEClass, SELF_DEVELOPED_MODEL__INPUT_SPECIFICATION);

		educationEClass = createEClass(EDUCATION);
		createEAttribute(educationEClass, EDUCATION__ACCESS_ADMISSION);
		createEAttribute(educationEClass, EDUCATION__LEARNING_OUTCOME_EVALUATION);
		createEAttribute(educationEClass, EDUCATION__EDUCATION_LEVEL_ASSESSMENT);
		createEAttribute(educationEClass, EDUCATION__EXAM_MONITORING);
		createEReference(educationEClass, EDUCATION__BASE_USE_CASE);
		createEAttribute(educationEClass, EDUCATION__EXCEPTION_JUSTIFICATION);
		createEAttribute(educationEClass, EDUCATION__EXCEPTION);

		humanEmploymentEClass = createEClass(HUMAN_EMPLOYMENT);
		createEAttribute(humanEmploymentEClass, HUMAN_EMPLOYMENT__RECRUITMENT);
		createEAttribute(humanEmploymentEClass, HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS);
		createEReference(humanEmploymentEClass, HUMAN_EMPLOYMENT__BASE_USE_CASE);
		createEAttribute(humanEmploymentEClass, HUMAN_EMPLOYMENT__EXCEPTION);
		createEAttribute(humanEmploymentEClass, HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION);

		trainingDataEClass = createEClass(TRAINING_DATA);
		createEAttribute(trainingDataEClass, TRAINING_DATA__CLEANING);
		createEAttribute(trainingDataEClass, TRAINING_DATA__LABELING);
		createEAttribute(trainingDataEClass, TRAINING_DATA__SELECTION);
		createEAttribute(trainingDataEClass, TRAINING_DATA__DESCRIPTION);
		createEAttribute(trainingDataEClass, TRAINING_DATA__ORIGIN);
		createEAttribute(trainingDataEClass, TRAINING_DATA__SCOPE);
		createEReference(trainingDataEClass, TRAINING_DATA__BASE_ARTIFACT);

		thirdPartyComponentEClass = createEClass(THIRD_PARTY_COMPONENT);
		createEAttribute(thirdPartyComponentEClass, THIRD_PARTY_COMPONENT__ORIGIN);
		createEAttribute(thirdPartyComponentEClass, THIRD_PARTY_COMPONENT__INTEGRATION_DESCRIPTION);
		createEReference(thirdPartyComponentEClass, THIRD_PARTY_COMPONENT__BASE_COMPONENT);

		essentialServiceEClass = createEClass(ESSENTIAL_SERVICE);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__CREDITWORTHINESS);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING);
		createEReference(essentialServiceEClass, ESSENTIAL_SERVICE__BASE_USE_CASE);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__EMERGENCY);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION);
		createEAttribute(essentialServiceEClass, ESSENTIAL_SERVICE__EXCEPTION);

		lawEnforcementEClass = createEClass(LAW_ENFORCEMENT);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__LIE_DETECTION);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__EVIDENCE_RELIABILITY);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__SOLELY_PROFILING_BASED);
		createEReference(lawEnforcementEClass, LAW_ENFORCEMENT__BASE_USE_CASE);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__SUPPORTS_HUMAN_ASSESSMENT);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION);
		createEAttribute(lawEnforcementEClass, LAW_ENFORCEMENT__EXCEPTION);

		migrationBorderEClass = createEClass(MIGRATION_BORDER);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__LIE_DETECTION);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__PERSON_IDENTIFICATION);
		createEReference(migrationBorderEClass, MIGRATION_BORDER__BASE_USE_CASE);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__EXCEPTION);
		createEAttribute(migrationBorderEClass, MIGRATION_BORDER__EXCEPTION_JUSTIFICATION);

		justiceDemocracyUseCaseEClass = createEClass(JUSTICE_DEMOCRACY_USE_CASE);
		createEAttribute(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT);
		createEAttribute(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE);
		createEAttribute(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE);
		createEReference(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE);
		createEAttribute(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION);
		createEAttribute(justiceDemocracyUseCaseEClass, JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION);

		biometricIdentificationEClass = createEClass(BIOMETRIC_IDENTIFICATION);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__REAL_TIME);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH);
		createEReference(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__BASE_USE_CASE);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__EXCEPTION);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION);

		biometricCategorisationEClass = createEClass(BIOMETRIC_CATEGORISATION);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__DEDUCE_RACE);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION);
		createEReference(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__BASE_USE_CASE);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__EXCEPTION);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION);

		emotionRecognitionEClass = createEClass(EMOTION_RECOGNITION);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__EDUCATION);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__WORKPLACE);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON);
		createEReference(emotionRecognitionEClass, EMOTION_RECOGNITION__BASE_USE_CASE);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__EXCEPTION);

		riskManagementSystemEClass = createEClass(RISK_MANAGEMENT_SYSTEM);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__RISK_IDENTIFICATION);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__RISK_ESTIMATION);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__POST_MARKET_RISK_EVALUATION);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__RISK_MITIGATION);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__RESIDUAL_RISK);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__TESTING_PROCEDURE);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__TESTING_METRICS);
		createEAttribute(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__VULNERABLE_GROUPS_ASSESSMENT);
		createEReference(riskManagementSystemEClass, RISK_MANAGEMENT_SYSTEM__BASE_ARTIFACT);

		// Create enums
		productCategoryEEnum = createEEnum(PRODUCT_CATEGORY);
		roleEEnum = createEEnum(ROLE);
		exceptionEEnum = createEEnum(EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(profilingEClass, Profiling.class, "Profiling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfiling_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Profiling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(productEmbeddingEClass, ProductEmbedding.class, "ProductEmbedding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductEmbedding_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, ProductEmbedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProductEmbedding_FailureEndangerSafety(), theTypesPackage.getBoolean(), "FailureEndangerSafety", null, 1, 1, ProductEmbedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProductEmbedding_ThirdPartyConformityAssessment(), theTypesPackage.getBoolean(), "ThirdPartyConformityAssessment", null, 1, 1, ProductEmbedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProductEmbedding_ProductCategory(), this.getProductCategory(), "ProductCategory", null, 0, -1, ProductEmbedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProductEmbedding_Role(), this.getRole(), "Role", null, 1, 1, ProductEmbedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(humanInteractionEClass, HumanInteraction.class, "HumanInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanInteraction_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, HumanInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanInteraction_LawEnforcementAuthorised(), theTypesPackage.getBoolean(), "LawEnforcementAuthorised", null, 1, 1, HumanInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanInteraction_ObviousAIInteraction(), theTypesPackage.getBoolean(), "ObviousAIInteraction", null, 1, 1, HumanInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanInteraction_PuplicCriminalOffenceReport(), theTypesPackage.getBoolean(), "PuplicCriminalOffenceReport", null, 1, 1, HumanInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(syntheticContentEClass, SyntheticContent.class, "SyntheticContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSyntheticContent_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, SyntheticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSyntheticContent_LawEnforcementAuthorised(), theTypesPackage.getBoolean(), "LawEnforcementAuthorised", null, 1, 1, SyntheticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSyntheticContent_StandardEditingOnly(), theTypesPackage.getBoolean(), "StandardEditingOnly", null, 1, 1, SyntheticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deepfakeEClass, Deepfake.class, "Deepfake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeepfake_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Deepfake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeepfake_CreativeWork(), theTypesPackage.getBoolean(), "CreativeWork", null, 1, 1, Deepfake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeepfake_LawEnforcementAuthorised(), theTypesPackage.getBoolean(), "LawEnforcementAuthorised", null, 1, 1, Deepfake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publicInterestTextEClass, PublicInterestText.class, "PublicInterestText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicInterestText_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, PublicInterestText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicInterestText_HumanReview(), theTypesPackage.getBoolean(), "HumanReview", null, 1, 1, PublicInterestText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicInterestText_LawEnforcementAuthorised(), theTypesPackage.getBoolean(), "LawEnforcementAuthorised", null, 1, 1, PublicInterestText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manipulativeBehaviourEClass, ManipulativeBehaviour.class, "ManipulativeBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManipulativeBehaviour_SubliminalTechniques(), theTypesPackage.getBoolean(), "SubliminalTechniques", null, 1, 1, ManipulativeBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManipulativeBehaviour_DeceptiveTechniques(), theTypesPackage.getBoolean(), "DeceptiveTechniques", null, 1, 1, ManipulativeBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getManipulativeBehaviour_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, ManipulativeBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exploitingHumanVulnerabilityEClass, ExploitingHumanVulnerability.class, "ExploitingHumanVulnerability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExploitingHumanVulnerability_Age(), theTypesPackage.getBoolean(), "Age", null, 1, 1, ExploitingHumanVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingHumanVulnerability_Disability(), theTypesPackage.getBoolean(), "Disability", null, 1, 1, ExploitingHumanVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingHumanVulnerability_Social(), theTypesPackage.getBoolean(), "Social", null, 1, 1, ExploitingHumanVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingHumanVulnerability_Economic(), theTypesPackage.getBoolean(), "Economic", null, 1, 1, ExploitingHumanVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExploitingHumanVulnerability_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, ExploitingHumanVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(socialScoringEClass, SocialScoring.class, "SocialScoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocialScoring_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, SocialScoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facialImageScrapingEClass, FacialImageScraping.class, "FacialImageScraping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacialImageScraping_Internet(), theTypesPackage.getBoolean(), "Internet", null, 1, 1, FacialImageScraping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFacialImageScraping_CCTV(), theTypesPackage.getBoolean(), "CCTV", null, 1, 1, FacialImageScraping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacialImageScraping_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, FacialImageScraping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aiSystemEClass, AISystem.class, "AISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAISystem_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Purpose(), theTypesPackage.getString(), "Purpose", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Version(), theTypesPackage.getString(), "Version", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_ExternalInteraction(), theTypesPackage.getString(), "ExternalInteraction", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_MarketPlacementForm(), theTypesPackage.getString(), "MarketPlacementForm", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Hardware(), theTypesPackage.getString(), "Hardware", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_VisualDocumentation(), theTypesPackage.getBoolean(), "VisualDocumentation", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_UserInterface(), theTypesPackage.getString(), "UserInterface", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Instructions(), theTypesPackage.getString(), "Instructions", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_DevelopmentProcess(), theTypesPackage.getString(), "DevelopmentProcess", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_DesignSpecification(), theTypesPackage.getString(), "DesignSpecification", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_DesignDecision(), theTypesPackage.getString(), "DesignDecision", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_DesignTradeOffs(), theTypesPackage.getString(), "DesignTradeOffs", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Resources(), theTypesPackage.getString(), "Resources", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_HumanOversightPreAssessment(), theTypesPackage.getString(), "HumanOversightPreAssessment", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_PlannedModification(), theTypesPackage.getString(), "PlannedModification", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_Cybersecurity(), theTypesPackage.getString(), "Cybersecurity", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_HumanOversightPostAssessment(), theTypesPackage.getString(), "HumanOversightPostAssessment", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_UpdateRequirements(), theTypesPackage.getString(), "UpdateRequirements", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_PredictableRisks(), theTypesPackage.getString(), "PredictableRisks", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_PerformanceMetricsSuitability(), theTypesPackage.getString(), "PerformanceMetricsSuitability", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_RelevantChanges(), theTypesPackage.getString(), "RelevantChanges", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_HarmonisedStandards(), theTypesPackage.getString(), "HarmonisedStandards", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_CopyEUConformityDeclaration(), theTypesPackage.getBoolean(), "CopyEUConformityDeclaration", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAISystem_PostMarketMonitoring(), theTypesPackage.getString(), "PostMarketMonitoring", null, 1, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providesEClass, Provides.class, "Provides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvides_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(criticalInfrastructureEClass, CriticalInfrastructure.class, "CriticalInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriticalInfrastructure_DigitalInfrastructure(), theTypesPackage.getBoolean(), "DigitalInfrastructure", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_RoadTraffic(), theTypesPackage.getBoolean(), "RoadTraffic", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_WaterSupply(), theTypesPackage.getBoolean(), "WaterSupply", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_GasSupply(), theTypesPackage.getBoolean(), "GasSupply", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_HeatSupply(), theTypesPackage.getBoolean(), "HeatSupply", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_ElectricitySupply(), theTypesPackage.getBoolean(), "ElectricitySupply", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCriticalInfrastructure_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCriticalInfrastructure_Exception(), this.getException(), "Exception", null, 0, -1, CriticalInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selfDevelopedModelEClass, SelfDevelopedModel.class, "SelfDevelopedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelfDevelopedModel_Parameter(), theTypesPackage.getString(), "Parameter", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_TrainingMethods(), theTypesPackage.getString(), "TrainingMethods", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_Objective(), theTypesPackage.getString(), "Objective", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_ValidationProcess(), theTypesPackage.getString(), "ValidationProcess", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_ExpectedOutput(), theTypesPackage.getString(), "ExpectedOutput", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_TestingProcess(), theTypesPackage.getString(), "TestingProcess", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_Accuracy(), theTypesPackage.getString(), "Accuracy", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_Capabilities(), theTypesPackage.getString(), "Capabilities", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_TestReports(), theTypesPackage.getBoolean(), "TestReports", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelfDevelopedModel_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelfDevelopedModel_InputSpecification(), theTypesPackage.getString(), "InputSpecification", null, 1, 1, SelfDevelopedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(educationEClass, Education.class, "Education", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEducation_AccessAdmission(), theTypesPackage.getBoolean(), "AccessAdmission", null, 1, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEducation_LearningOutcomeEvaluation(), theTypesPackage.getBoolean(), "LearningOutcomeEvaluation", null, 1, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEducation_EducationLevelAssessment(), theTypesPackage.getBoolean(), "EducationLevelAssessment", null, 1, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEducation_ExamMonitoring(), theTypesPackage.getBoolean(), "ExamMonitoring", null, 1, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEducation_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEducation_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEducation_Exception(), this.getException(), "Exception", null, 0, -1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(humanEmploymentEClass, HumanEmployment.class, "HumanEmployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanEmployment_Recruitment(), theTypesPackage.getBoolean(), "Recruitment", null, 1, 1, HumanEmployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanEmployment_WorkConditionsDecisions(), theTypesPackage.getBoolean(), "WorkConditionsDecisions", null, 1, 1, HumanEmployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHumanEmployment_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, HumanEmployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanEmployment_Exception(), this.getException(), "Exception", null, 0, -1, HumanEmployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHumanEmployment_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, HumanEmployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trainingDataEClass, TrainingData.class, "TrainingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainingData_Cleaning(), theTypesPackage.getString(), "Cleaning", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrainingData_Labeling(), theTypesPackage.getString(), "Labeling", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrainingData_Selection(), theTypesPackage.getString(), "Selection", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrainingData_Description(), theTypesPackage.getString(), "Description", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrainingData_Origin(), theTypesPackage.getString(), "Origin", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTrainingData_Scope(), theTypesPackage.getString(), "Scope", null, 1, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrainingData_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, TrainingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(thirdPartyComponentEClass, ThirdPartyComponent.class, "ThirdPartyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThirdPartyComponent_Origin(), theTypesPackage.getString(), "Origin", null, 1, 1, ThirdPartyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getThirdPartyComponent_IntegrationDescription(), theTypesPackage.getString(), "IntegrationDescription", null, 1, 1, ThirdPartyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThirdPartyComponent_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, ThirdPartyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(essentialServiceEClass, EssentialService.class, "EssentialService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEssentialService_Creditworthiness(), theTypesPackage.getBoolean(), "Creditworthiness", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_PublicBenefitsEligibility(), theTypesPackage.getBoolean(), "PublicBenefitsEligibility", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_FraudDetectionOnly(), theTypesPackage.getBoolean(), "FraudDetectionOnly", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_InsuranceRiskPricing(), theTypesPackage.getBoolean(), "InsuranceRiskPricing", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEssentialService_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_Emergency(), theTypesPackage.getBoolean(), "Emergency", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEssentialService_Exception(), this.getException(), "Exception", null, 0, -1, EssentialService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lawEnforcementEClass, LawEnforcement.class, "LawEnforcement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLawEnforcement_VictimRiskAssessment(), theTypesPackage.getBoolean(), "VictimRiskAssessment", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_LieDetection(), theTypesPackage.getBoolean(), "LieDetection", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_EvidenceReliability(), theTypesPackage.getBoolean(), "EvidenceReliability", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_OffendingRiskAssessment(), theTypesPackage.getBoolean(), "OffendingRiskAssessment", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_SolelyProfilingBased(), theTypesPackage.getBoolean(), "SolelyProfilingBased", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLawEnforcement_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_SupportsHumanAssessment(), theTypesPackage.getBoolean(), "SupportsHumanAssessment", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLawEnforcement_Exception(), this.getException(), "Exception", null, 0, -1, LawEnforcement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(migrationBorderEClass, MigrationBorder.class, "MigrationBorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigrationBorder_LieDetection(), theTypesPackage.getBoolean(), "LieDetection", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_EntryRiskAssessment(), theTypesPackage.getBoolean(), "EntryRiskAssessment", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_AsylumVisaResidencePermitsApplication(), theTypesPackage.getBoolean(), "AsylumVisaResidencePermitsApplication", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_TravelDocumentVerificationOnly(), theTypesPackage.getBoolean(), "TravelDocumentVerificationOnly", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_PersonIdentification(), theTypesPackage.getBoolean(), "PersonIdentification", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMigrationBorder_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_Exception(), this.getException(), "Exception", null, 0, -1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMigrationBorder_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, MigrationBorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(justiceDemocracyUseCaseEClass, JusticeDemocracyUseCase.class, "JusticeDemocracyUseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJusticeDemocracyUseCase_JudicialSupport(), theTypesPackage.getBoolean(), "JudicialSupport", null, 1, 1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJusticeDemocracyUseCase_ElectionInfluence(), theTypesPackage.getBoolean(), "ElectionInfluence", null, 1, 1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJusticeDemocracyUseCase_NoDirectExposure(), theTypesPackage.getBoolean(), "NoDirectExposure", null, 1, 1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJusticeDemocracyUseCase_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJusticeDemocracyUseCase_Exception(), this.getException(), "Exception", null, 0, -1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJusticeDemocracyUseCase_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, JusticeDemocracyUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(biometricIdentificationEClass, BiometricIdentification.class, "BiometricIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiometricIdentification_VerificationOnly(), theTypesPackage.getBoolean(), "VerificationOnly", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_RealTime(), theTypesPackage.getBoolean(), "RealTime", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_PubliclyAccessibleSpace(), theTypesPackage.getBoolean(), "PubliclyAccessibleSpace", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_LawEnforcementPurpose(), theTypesPackage.getBoolean(), "LawEnforcementPurpose", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_VictimSearch(), theTypesPackage.getBoolean(), "VictimSearch", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_ImminentThreatPrevention(), theTypesPackage.getBoolean(), "ImminentThreatPrevention", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_SeriousCrimeSuspectSearch(), theTypesPackage.getBoolean(), "SeriousCrimeSuspectSearch", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiometricIdentification_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_Exception(), this.getException(), "Exception", null, 0, -1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(biometricCategorisationEClass, BiometricCategorisation.class, "BiometricCategorisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiometricCategorisation_DeduceRace(), theTypesPackage.getBoolean(), "DeduceRace", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_DeducePoliticalOpinion(), theTypesPackage.getBoolean(), "DeducePoliticalOpinion", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_DeduceReligiousBelief(), theTypesPackage.getBoolean(), "DeduceReligiousBelief", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_DeduceUnionMembership(), theTypesPackage.getBoolean(), "DeduceUnionMembership", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_DeduceSexuality(), theTypesPackage.getBoolean(), "DeduceSexuality", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_LawfulDatasetLabeling(), theTypesPackage.getBoolean(), "LawfulDatasetLabeling", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_LawEnforcementCategorisation(), theTypesPackage.getBoolean(), "LawEnforcementCategorisation", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiometricCategorisation_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_Exception(), this.getException(), "Exception", null, 0, -1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_ExceptionJustification(), theTypesPackage.getString(), "ExceptionJustification", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emotionRecognitionEClass, EmotionRecognition.class, "EmotionRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotionRecognition_Education(), theTypesPackage.getBoolean(), "Education", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_Workplace(), theTypesPackage.getBoolean(), "Workplace", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_MedicalOrSafetyReason(), theTypesPackage.getBoolean(), "MedicalOrSafetyReason", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmotionRecognition_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_ExceptionJustificatio(), theTypesPackage.getString(), "ExceptionJustificatio", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_Exception(), this.getException(), "Exception", null, 0, -1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(riskManagementSystemEClass, RiskManagementSystem.class, "RiskManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskManagementSystem_RiskIdentification(), theTypesPackage.getString(), "RiskIdentification", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_RiskEstimation(), theTypesPackage.getString(), "RiskEstimation", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_PostMarketRiskEvaluation(), theTypesPackage.getString(), "PostMarketRiskEvaluation", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_RiskMitigation(), theTypesPackage.getString(), "RiskMitigation", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_ResidualRisk(), theTypesPackage.getString(), "ResidualRisk", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_TestingProcedure(), theTypesPackage.getString(), "TestingProcedure", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_TestingMetrics(), theTypesPackage.getString(), "TestingMetrics", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRiskManagementSystem_VulnerableGroupsAssessment(), theTypesPackage.getString(), "VulnerableGroupsAssessment", null, 1, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRiskManagementSystem_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, RiskManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(productCategoryEEnum, ProductCategory.class, "ProductCategory");
		addEEnumLiteral(productCategoryEEnum, ProductCategory.MACHINERY);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.TOY);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.ELEVATOR);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.MEDICAL);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.IN_VITRO_DIAGNOSTICS);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.PERSONAL_PROTECTION);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.CIVIL_AVIATION);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.RAIL_SYSTEM);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.AGRICULTURAL);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.TWO_THREE_WHEEL_VEHICLE);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.MARINE);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.UNMANNED_AIRCRAFT);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.MOTOR_VEHICLE);
		addEEnumLiteral(productCategoryEEnum, ProductCategory.MOTOR_VEHICLE_SAFETY);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.COMPONENT);
		addEEnumLiteral(roleEEnum, Role.PRODUCT_ITSELF);

		initEEnum(exceptionEEnum, euaiactcompliance.Exception.class, "Exception");
		addEEnumLiteral(exceptionEEnum, euaiactcompliance.Exception.NARROW_PROCEDURAL_TASK);
		addEEnumLiteral(exceptionEEnum, euaiactcompliance.Exception.DECISION_PATTERN_DETECTION);
		addEEnumLiteral(exceptionEEnum, euaiactcompliance.Exception.PREPATORY_TASK);
		addEEnumLiteral(exceptionEEnum, euaiactcompliance.Exception.IMPROVES_HUMAN_ACTIVITY);

		// Create resource
		createResource(eNS_URI);
	}

} //EuaiactcompliancePackageImpl
