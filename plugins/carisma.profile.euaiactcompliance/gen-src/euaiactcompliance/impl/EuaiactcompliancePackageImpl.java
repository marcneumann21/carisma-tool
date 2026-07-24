/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.AISystem;
import euaiactcompliance.AnnexIIIUseCase;
import euaiactcompliance.BiometricCategorisation;
import euaiactcompliance.BiometricCategorizationNotification;
import euaiactcompliance.BiometricIdentification;
import euaiactcompliance.CopyEUConformityDeclaration;
import euaiactcompliance.Deepfake;
import euaiactcompliance.DescriptionAISystemPostMarketPhase;
import euaiactcompliance.DescriptionPerformanceMetrics;
import euaiactcompliance.DescriptionProviderRelevantChanges;
import euaiactcompliance.DescriptionRiskManagement;
import euaiactcompliance.DetailedDescriptionAISystem;
import euaiactcompliance.DetailedInformationAISystem;
import euaiactcompliance.Documents;
import euaiactcompliance.EmotionRecognition;
import euaiactcompliance.EmotionRecognitionNotification;
import euaiactcompliance.EuaiactcomplianceFactory;
import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.ExploitingVulnerability;
import euaiactcompliance.FacialRecognition;
import euaiactcompliance.GeneralDescriptionAISystem;
import euaiactcompliance.HumanInteraction;
import euaiactcompliance.ListHarmonisedStandards;
import euaiactcompliance.ManipulativeBehaviour;
import euaiactcompliance.PredictivePolicing;
import euaiactcompliance.Profiling;
import euaiactcompliance.Provider;
import euaiactcompliance.PublicInterestText;
import euaiactcompliance.SafetyComponent;
import euaiactcompliance.SocialScoring;
import euaiactcompliance.SyntheticContent;
import euaiactcompliance.TransparencyObligation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass annexIIIUseCaseEClass = null;

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
	private EClass safetyComponentEClass = null;

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
	private EClass emotionRecognitionNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biometricCategorizationNotificationEClass = null;

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
	private EClass exploitingVulnerabilityEClass = null;

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
	private EClass predictivePolicingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facialRecognitionEClass = null;

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
	private EClass biometricCategorisationEClass = null;

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
	private EClass generalDescriptionAISystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedDescriptionAISystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedInformationAISystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionPerformanceMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionRiskManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionProviderRelevantChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listHarmonisedStandardsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEUConformityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionAISystemPostMarketPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transparencyObligationEClass = null;

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
	public EClass getAnnexIIIUseCase() {
		return annexIIIUseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_BiometricIdentification() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_BiometricCategorisation() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_CriticalInfrastructure() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_Education() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_HumanEmployment() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_EssentialServices() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_Law() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_Migration() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_Justice() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_NarrowProceduralTask() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_ImprovesHumanActivity() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnexIIIUseCase_PreparatoryTask() {
		return (EAttribute)annexIIIUseCaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnexIIIUseCase_Base_UseCase() {
		return (EReference)annexIIIUseCaseEClass.getEStructuralFeatures().get(12);
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
	public EClass getSafetyComponent() {
		return safetyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_Machinery() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_Toy() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_Elevator() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_Medical() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_InVitroDiagnostics() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_PersonalProtective() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_CivilAviation() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_RailSystem() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyComponent_Agricultural() {
		return (EAttribute)safetyComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyComponent_Base_Component() {
		return (EReference)safetyComponentEClass.getEStructuralFeatures().get(9);
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
	public EClass getEmotionRecognitionNotification() {
		return emotionRecognitionNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotionRecognitionNotification_Base_UseCase() {
		return (EReference)emotionRecognitionNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBiometricCategorizationNotification() {
		return biometricCategorizationNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBiometricCategorizationNotification_Base_UseCase() {
		return (EReference)biometricCategorizationNotificationEClass.getEStructuralFeatures().get(0);
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
	public EClass getManipulativeBehaviour() {
		return manipulativeBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManipulativeBehaviour_Base_UseCase() {
		return (EReference)manipulativeBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExploitingVulnerability() {
		return exploitingVulnerabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingVulnerability_Age() {
		return (EAttribute)exploitingVulnerabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingVulnerability_Disability() {
		return (EAttribute)exploitingVulnerabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingVulnerability_Social() {
		return (EAttribute)exploitingVulnerabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExploitingVulnerability_Economic() {
		return (EAttribute)exploitingVulnerabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExploitingVulnerability_Base_UseCase() {
		return (EReference)exploitingVulnerabilityEClass.getEStructuralFeatures().get(4);
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
	public EClass getPredictivePolicing() {
		return predictivePolicingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredictivePolicing_Base_UseCase() {
		return (EReference)predictivePolicingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacialRecognition() {
		return facialRecognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacialRecognition_Internet() {
		return (EAttribute)facialRecognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacialRecognition_CCTV() {
		return (EAttribute)facialRecognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFacialRecognition_Base_UseCase() {
		return (EReference)facialRecognitionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEmotionRecognition_Race() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Politics() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_UnionMembership() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Religion() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionRecognition_Sexuality() {
		return (EAttribute)emotionRecognitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotionRecognition_Base_UseCase() {
		return (EReference)emotionRecognitionEClass.getEStructuralFeatures().get(5);
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
	public EReference getBiometricCategorisation_Base_UseCase() {
		return (EReference)biometricCategorisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_LawfullyAcquiredDatasets() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricCategorisation_LawEnforcement() {
		return (EAttribute)biometricCategorisationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getBiometricIdentification_PublicSpace() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_VictimSearch() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_ThreatPrevention() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBiometricIdentification_CriminalSuspectSearch() {
		return (EAttribute)biometricIdentificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBiometricIdentification_Base_UseCase() {
		return (EReference)biometricIdentificationEClass.getEStructuralFeatures().get(4);
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
	public EClass getGeneralDescriptionAISystem() {
		return generalDescriptionAISystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Purpose() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Provider() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Version() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Interaction() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Deployment() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Hardware() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_VisualDocumentation() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Interface() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeneralDescriptionAISystem_Instructions() {
		return (EAttribute)generalDescriptionAISystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralDescriptionAISystem_Base_Artifact() {
		return (EReference)generalDescriptionAISystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailedDescriptionAISystem() {
		return detailedDescriptionAISystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedDescriptionAISystem_Capabilities() {
		return (EAttribute)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedDescriptionAISystem_Accuracy() {
		return (EAttribute)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedDescriptionAISystem_PredictableRisks() {
		return (EAttribute)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedDescriptionAISystem_HumanOversightPostAssessment() {
		return (EAttribute)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedDescriptionAISystem_InputSpecification() {
		return (EAttribute)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailedDescriptionAISystem_Base_Artifact() {
		return (EReference)detailedDescriptionAISystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailedInformationAISystem() {
		return detailedInformationAISystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Developement() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_ThirdPartyElements() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_DesignSpecification() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_DesignDecision() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Objective() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_ExpectedOutput() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Compromise() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Architecture() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Resources() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TrainingMethods() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TrainingDataDescription() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TrainingDataSelection() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TrainingDataLabeling() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TrainingDataCleaning() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_HumanOversightPreassessment() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_PlannedModification() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_ValidationProcess() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_TestingProcess() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Parameter() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetailedInformationAISystem_Cybersecurity() {
		return (EAttribute)detailedInformationAISystemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailedInformationAISystem_Base_Artifact() {
		return (EReference)detailedInformationAISystemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionPerformanceMetrics() {
		return descriptionPerformanceMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionPerformanceMetrics_Base_Artifact() {
		return (EReference)descriptionPerformanceMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionRiskManagement() {
		return descriptionRiskManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionRiskManagement_Base_Artifact() {
		return (EReference)descriptionRiskManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionProviderRelevantChanges() {
		return descriptionProviderRelevantChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionProviderRelevantChanges_Base_Artifact() {
		return (EReference)descriptionProviderRelevantChangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListHarmonisedStandards() {
		return listHarmonisedStandardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListHarmonisedStandards_Base_Artifact() {
		return (EReference)listHarmonisedStandardsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCopyEUConformityDeclaration() {
		return copyEUConformityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCopyEUConformityDeclaration_Base_Artifact() {
		return (EReference)copyEUConformityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionAISystemPostMarketPhase() {
		return descriptionAISystemPostMarketPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionAISystemPostMarketPhase_Base_Artifact() {
		return (EReference)descriptionAISystemPostMarketPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocuments() {
		return documentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocuments_Base_Dependency() {
		return (EReference)documentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransparencyObligation() {
		return transparencyObligationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransparencyObligation_Base_Artifact() {
		return (EReference)transparencyObligationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_HumanInteraction() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_SyntheticContent() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_EmotionRecognitionNotification() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_BiometricCategorizationNotification() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_Deepfake() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransparencyObligation_PublicInterestText() {
		return (EAttribute)transparencyObligationEClass.getEStructuralFeatures().get(6);
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
		annexIIIUseCaseEClass = createEClass(ANNEX_III_USE_CASE);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__EDUCATION);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__ESSENTIAL_SERVICES);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__LAW);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__MIGRATION);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__JUSTICE);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY);
		createEAttribute(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__PREPARATORY_TASK);
		createEReference(annexIIIUseCaseEClass, ANNEX_III_USE_CASE__BASE_USE_CASE);

		profilingEClass = createEClass(PROFILING);
		createEReference(profilingEClass, PROFILING__BASE_USE_CASE);

		safetyComponentEClass = createEClass(SAFETY_COMPONENT);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__MACHINERY);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__TOY);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__ELEVATOR);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__MEDICAL);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__PERSONAL_PROTECTIVE);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__CIVIL_AVIATION);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__RAIL_SYSTEM);
		createEAttribute(safetyComponentEClass, SAFETY_COMPONENT__AGRICULTURAL);
		createEReference(safetyComponentEClass, SAFETY_COMPONENT__BASE_COMPONENT);

		humanInteractionEClass = createEClass(HUMAN_INTERACTION);
		createEReference(humanInteractionEClass, HUMAN_INTERACTION__BASE_USE_CASE);

		syntheticContentEClass = createEClass(SYNTHETIC_CONTENT);
		createEReference(syntheticContentEClass, SYNTHETIC_CONTENT__BASE_USE_CASE);

		emotionRecognitionNotificationEClass = createEClass(EMOTION_RECOGNITION_NOTIFICATION);
		createEReference(emotionRecognitionNotificationEClass, EMOTION_RECOGNITION_NOTIFICATION__BASE_USE_CASE);

		biometricCategorizationNotificationEClass = createEClass(BIOMETRIC_CATEGORIZATION_NOTIFICATION);
		createEReference(biometricCategorizationNotificationEClass, BIOMETRIC_CATEGORIZATION_NOTIFICATION__BASE_USE_CASE);

		deepfakeEClass = createEClass(DEEPFAKE);
		createEReference(deepfakeEClass, DEEPFAKE__BASE_USE_CASE);

		publicInterestTextEClass = createEClass(PUBLIC_INTEREST_TEXT);
		createEReference(publicInterestTextEClass, PUBLIC_INTEREST_TEXT__BASE_USE_CASE);

		manipulativeBehaviourEClass = createEClass(MANIPULATIVE_BEHAVIOUR);
		createEReference(manipulativeBehaviourEClass, MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE);

		exploitingVulnerabilityEClass = createEClass(EXPLOITING_VULNERABILITY);
		createEAttribute(exploitingVulnerabilityEClass, EXPLOITING_VULNERABILITY__AGE);
		createEAttribute(exploitingVulnerabilityEClass, EXPLOITING_VULNERABILITY__DISABILITY);
		createEAttribute(exploitingVulnerabilityEClass, EXPLOITING_VULNERABILITY__SOCIAL);
		createEAttribute(exploitingVulnerabilityEClass, EXPLOITING_VULNERABILITY__ECONOMIC);
		createEReference(exploitingVulnerabilityEClass, EXPLOITING_VULNERABILITY__BASE_USE_CASE);

		socialScoringEClass = createEClass(SOCIAL_SCORING);
		createEReference(socialScoringEClass, SOCIAL_SCORING__BASE_USE_CASE);

		predictivePolicingEClass = createEClass(PREDICTIVE_POLICING);
		createEReference(predictivePolicingEClass, PREDICTIVE_POLICING__BASE_USE_CASE);

		facialRecognitionEClass = createEClass(FACIAL_RECOGNITION);
		createEAttribute(facialRecognitionEClass, FACIAL_RECOGNITION__INTERNET);
		createEAttribute(facialRecognitionEClass, FACIAL_RECOGNITION__CCTV);
		createEReference(facialRecognitionEClass, FACIAL_RECOGNITION__BASE_USE_CASE);

		emotionRecognitionEClass = createEClass(EMOTION_RECOGNITION);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__RACE);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__POLITICS);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__UNION_MEMBERSHIP);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__RELIGION);
		createEAttribute(emotionRecognitionEClass, EMOTION_RECOGNITION__SEXUALITY);
		createEReference(emotionRecognitionEClass, EMOTION_RECOGNITION__BASE_USE_CASE);

		biometricCategorisationEClass = createEClass(BIOMETRIC_CATEGORISATION);
		createEReference(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__BASE_USE_CASE);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS);
		createEAttribute(biometricCategorisationEClass, BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT);

		biometricIdentificationEClass = createEClass(BIOMETRIC_IDENTIFICATION);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION);
		createEAttribute(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH);
		createEReference(biometricIdentificationEClass, BIOMETRIC_IDENTIFICATION__BASE_USE_CASE);

		aiSystemEClass = createEClass(AI_SYSTEM);
		createEReference(aiSystemEClass, AI_SYSTEM__BASE_COMPONENT);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__BASE_ACTOR);

		generalDescriptionAISystemEClass = createEClass(GENERAL_DESCRIPTION_AI_SYSTEM);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__VERSION);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE);
		createEAttribute(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS);
		createEReference(generalDescriptionAISystemEClass, GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT);

		detailedDescriptionAISystemEClass = createEClass(DETAILED_DESCRIPTION_AI_SYSTEM);
		createEAttribute(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES);
		createEAttribute(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY);
		createEAttribute(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS);
		createEAttribute(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT);
		createEAttribute(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION);
		createEReference(detailedDescriptionAISystemEClass, DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT);

		detailedInformationAISystemEClass = createEClass(DETAILED_INFORMATION_AI_SYSTEM);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__RESOURCES);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__PARAMETER);
		createEAttribute(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY);
		createEReference(detailedInformationAISystemEClass, DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT);

		descriptionPerformanceMetricsEClass = createEClass(DESCRIPTION_PERFORMANCE_METRICS);
		createEReference(descriptionPerformanceMetricsEClass, DESCRIPTION_PERFORMANCE_METRICS__BASE_ARTIFACT);

		descriptionRiskManagementEClass = createEClass(DESCRIPTION_RISK_MANAGEMENT);
		createEReference(descriptionRiskManagementEClass, DESCRIPTION_RISK_MANAGEMENT__BASE_ARTIFACT);

		descriptionProviderRelevantChangesEClass = createEClass(DESCRIPTION_PROVIDER_RELEVANT_CHANGES);
		createEReference(descriptionProviderRelevantChangesEClass, DESCRIPTION_PROVIDER_RELEVANT_CHANGES__BASE_ARTIFACT);

		listHarmonisedStandardsEClass = createEClass(LIST_HARMONISED_STANDARDS);
		createEReference(listHarmonisedStandardsEClass, LIST_HARMONISED_STANDARDS__BASE_ARTIFACT);

		copyEUConformityDeclarationEClass = createEClass(COPY_EU_CONFORMITY_DECLARATION);
		createEReference(copyEUConformityDeclarationEClass, COPY_EU_CONFORMITY_DECLARATION__BASE_ARTIFACT);

		descriptionAISystemPostMarketPhaseEClass = createEClass(DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE);
		createEReference(descriptionAISystemPostMarketPhaseEClass, DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE__BASE_ARTIFACT);

		documentsEClass = createEClass(DOCUMENTS);
		createEReference(documentsEClass, DOCUMENTS__BASE_DEPENDENCY);

		transparencyObligationEClass = createEClass(TRANSPARENCY_OBLIGATION);
		createEReference(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__BASE_ARTIFACT);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__DEEPFAKE);
		createEAttribute(transparencyObligationEClass, TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(annexIIIUseCaseEClass, AnnexIIIUseCase.class, "AnnexIIIUseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnexIIIUseCase_BiometricIdentification(), theTypesPackage.getBoolean(), "BiometricIdentification", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_BiometricCategorisation(), theTypesPackage.getBoolean(), "BiometricCategorisation", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_CriticalInfrastructure(), theTypesPackage.getBoolean(), "CriticalInfrastructure", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_Education(), theTypesPackage.getBoolean(), "Education", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_HumanEmployment(), theTypesPackage.getBoolean(), "HumanEmployment", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_EssentialServices(), theTypesPackage.getBoolean(), "EssentialServices", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_Law(), theTypesPackage.getBoolean(), "Law", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_Migration(), theTypesPackage.getBoolean(), "Migration", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_Justice(), theTypesPackage.getBoolean(), "Justice", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_NarrowProceduralTask(), theTypesPackage.getBoolean(), "NarrowProceduralTask", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_ImprovesHumanActivity(), theTypesPackage.getBoolean(), "ImprovesHumanActivity", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnexIIIUseCase_PreparatoryTask(), theTypesPackage.getBoolean(), "PreparatoryTask", null, 1, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnexIIIUseCase_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, AnnexIIIUseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profilingEClass, Profiling.class, "Profiling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfiling_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Profiling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(safetyComponentEClass, SafetyComponent.class, "SafetyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyComponent_Machinery(), theTypesPackage.getBoolean(), "Machinery", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_Toy(), theTypesPackage.getBoolean(), "Toy", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_Elevator(), theTypesPackage.getBoolean(), "Elevator", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_Medical(), theTypesPackage.getBoolean(), "Medical", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_InVitroDiagnostics(), theTypesPackage.getBoolean(), "InVitroDiagnostics", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_PersonalProtective(), theTypesPackage.getBoolean(), "PersonalProtective", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_CivilAviation(), theTypesPackage.getBoolean(), "CivilAviation", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_RailSystem(), theTypesPackage.getBoolean(), "RailSystem", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSafetyComponent_Agricultural(), theTypesPackage.getBoolean(), "Agricultural", null, 1, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSafetyComponent_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, SafetyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(humanInteractionEClass, HumanInteraction.class, "HumanInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanInteraction_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, HumanInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(syntheticContentEClass, SyntheticContent.class, "SyntheticContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSyntheticContent_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, SyntheticContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emotionRecognitionNotificationEClass, EmotionRecognitionNotification.class, "EmotionRecognitionNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmotionRecognitionNotification_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, EmotionRecognitionNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(biometricCategorizationNotificationEClass, BiometricCategorizationNotification.class, "BiometricCategorizationNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiometricCategorizationNotification_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, BiometricCategorizationNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deepfakeEClass, Deepfake.class, "Deepfake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeepfake_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Deepfake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publicInterestTextEClass, PublicInterestText.class, "PublicInterestText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicInterestText_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, PublicInterestText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manipulativeBehaviourEClass, ManipulativeBehaviour.class, "ManipulativeBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManipulativeBehaviour_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, ManipulativeBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exploitingVulnerabilityEClass, ExploitingVulnerability.class, "ExploitingVulnerability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExploitingVulnerability_Age(), theTypesPackage.getBoolean(), "Age", null, 1, 1, ExploitingVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingVulnerability_Disability(), theTypesPackage.getBoolean(), "Disability", null, 1, 1, ExploitingVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingVulnerability_Social(), theTypesPackage.getBoolean(), "Social", null, 1, 1, ExploitingVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExploitingVulnerability_Economic(), theTypesPackage.getBoolean(), "Economic", null, 1, 1, ExploitingVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExploitingVulnerability_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, ExploitingVulnerability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(socialScoringEClass, SocialScoring.class, "SocialScoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocialScoring_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, SocialScoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(predictivePolicingEClass, PredictivePolicing.class, "PredictivePolicing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredictivePolicing_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, PredictivePolicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facialRecognitionEClass, FacialRecognition.class, "FacialRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacialRecognition_Internet(), theTypesPackage.getBoolean(), "Internet", null, 1, 1, FacialRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFacialRecognition_CCTV(), theTypesPackage.getBoolean(), "CCTV", null, 1, 1, FacialRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacialRecognition_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, FacialRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emotionRecognitionEClass, EmotionRecognition.class, "EmotionRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotionRecognition_Race(), theTypesPackage.getBoolean(), "Race", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_Politics(), theTypesPackage.getBoolean(), "Politics", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_UnionMembership(), theTypesPackage.getBoolean(), "UnionMembership", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_Religion(), theTypesPackage.getBoolean(), "Religion", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmotionRecognition_Sexuality(), theTypesPackage.getBoolean(), "Sexuality", null, 1, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmotionRecognition_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, EmotionRecognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(biometricCategorisationEClass, BiometricCategorisation.class, "BiometricCategorisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiometricCategorisation_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_LawfullyAcquiredDatasets(), theTypesPackage.getBoolean(), "LawfullyAcquiredDatasets", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricCategorisation_LawEnforcement(), theTypesPackage.getBoolean(), "LawEnforcement", null, 1, 1, BiometricCategorisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(biometricIdentificationEClass, BiometricIdentification.class, "BiometricIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiometricIdentification_PublicSpace(), theTypesPackage.getBoolean(), "PublicSpace", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_VictimSearch(), theTypesPackage.getBoolean(), "VictimSearch", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_ThreatPrevention(), theTypesPackage.getBoolean(), "ThreatPrevention", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBiometricIdentification_CriminalSuspectSearch(), theTypesPackage.getBoolean(), "CriminalSuspectSearch", null, 1, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiometricIdentification_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, BiometricIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aiSystemEClass, AISystem.class, "AISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAISystem_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, AISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalDescriptionAISystemEClass, GeneralDescriptionAISystem.class, "GeneralDescriptionAISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralDescriptionAISystem_Purpose(), theTypesPackage.getBoolean(), "Purpose", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Provider(), theTypesPackage.getBoolean(), "Provider", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Version(), theTypesPackage.getBoolean(), "Version", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Interaction(), theTypesPackage.getBoolean(), "Interaction", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Deployment(), theTypesPackage.getBoolean(), "Deployment", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Hardware(), theTypesPackage.getBoolean(), "Hardware", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_VisualDocumentation(), theTypesPackage.getBoolean(), "VisualDocumentation", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Interface(), theTypesPackage.getBoolean(), "Interface", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralDescriptionAISystem_Instructions(), theTypesPackage.getBoolean(), "Instructions", null, 1, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralDescriptionAISystem_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, GeneralDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(detailedDescriptionAISystemEClass, DetailedDescriptionAISystem.class, "DetailedDescriptionAISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailedDescriptionAISystem_Capabilities(), theTypesPackage.getBoolean(), "Capabilities", null, 1, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedDescriptionAISystem_Accuracy(), theTypesPackage.getBoolean(), "Accuracy", null, 1, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedDescriptionAISystem_PredictableRisks(), theTypesPackage.getBoolean(), "PredictableRisks", null, 1, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedDescriptionAISystem_HumanOversightPostAssessment(), theTypesPackage.getBoolean(), "HumanOversightPostAssessment", null, 1, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedDescriptionAISystem_InputSpecification(), theTypesPackage.getBoolean(), "InputSpecification", null, 1, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDetailedDescriptionAISystem_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DetailedDescriptionAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(detailedInformationAISystemEClass, DetailedInformationAISystem.class, "DetailedInformationAISystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailedInformationAISystem_Developement(), theTypesPackage.getBoolean(), "Developement", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_ThirdPartyElements(), theTypesPackage.getBoolean(), "ThirdPartyElements", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_DesignSpecification(), theTypesPackage.getBoolean(), "DesignSpecification", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_DesignDecision(), theTypesPackage.getBoolean(), "DesignDecision", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Objective(), theTypesPackage.getBoolean(), "Objective", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_ExpectedOutput(), theTypesPackage.getBoolean(), "ExpectedOutput", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Compromise(), theTypesPackage.getBoolean(), "Compromise", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Architecture(), theTypesPackage.getBoolean(), "Architecture", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Resources(), theTypesPackage.getBoolean(), "Resources", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TrainingMethods(), theTypesPackage.getBoolean(), "TrainingMethods", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TrainingDataDescription(), theTypesPackage.getBoolean(), "TrainingDataDescription", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TrainingDataSelection(), theTypesPackage.getBoolean(), "TrainingDataSelection", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TrainingDataLabeling(), theTypesPackage.getBoolean(), "TrainingDataLabeling", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TrainingDataCleaning(), theTypesPackage.getBoolean(), "TrainingDataCleaning", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_HumanOversightPreassessment(), theTypesPackage.getBoolean(), "HumanOversightPreassessment", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_PlannedModification(), theTypesPackage.getBoolean(), "PlannedModification", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_ValidationProcess(), theTypesPackage.getBoolean(), "ValidationProcess", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_TestingProcess(), theTypesPackage.getBoolean(), "TestingProcess", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Parameter(), theTypesPackage.getBoolean(), "Parameter", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailedInformationAISystem_Cybersecurity(), theTypesPackage.getBoolean(), "Cybersecurity", null, 1, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDetailedInformationAISystem_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DetailedInformationAISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionPerformanceMetricsEClass, DescriptionPerformanceMetrics.class, "DescriptionPerformanceMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionPerformanceMetrics_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DescriptionPerformanceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionRiskManagementEClass, DescriptionRiskManagement.class, "DescriptionRiskManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionRiskManagement_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DescriptionRiskManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionProviderRelevantChangesEClass, DescriptionProviderRelevantChanges.class, "DescriptionProviderRelevantChanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionProviderRelevantChanges_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DescriptionProviderRelevantChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(listHarmonisedStandardsEClass, ListHarmonisedStandards.class, "ListHarmonisedStandards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListHarmonisedStandards_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, ListHarmonisedStandards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(copyEUConformityDeclarationEClass, CopyEUConformityDeclaration.class, "CopyEUConformityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopyEUConformityDeclaration_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, CopyEUConformityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionAISystemPostMarketPhaseEClass, DescriptionAISystemPostMarketPhase.class, "DescriptionAISystemPostMarketPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionAISystemPostMarketPhase_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, DescriptionAISystemPostMarketPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(documentsEClass, Documents.class, "Documents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocuments_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Documents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transparencyObligationEClass, TransparencyObligation.class, "TransparencyObligation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransparencyObligation_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_HumanInteraction(), theTypesPackage.getBoolean(), "HumanInteraction", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_SyntheticContent(), theTypesPackage.getBoolean(), "SyntheticContent", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_EmotionRecognitionNotification(), theTypesPackage.getBoolean(), "EmotionRecognitionNotification", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_BiometricCategorizationNotification(), theTypesPackage.getBoolean(), "BiometricCategorizationNotification", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_Deepfake(), theTypesPackage.getBoolean(), "Deepfake", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransparencyObligation_PublicInterestText(), theTypesPackage.getBoolean(), "PublicInterestText", null, 1, 1, TransparencyObligation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EuaiactcompliancePackageImpl
