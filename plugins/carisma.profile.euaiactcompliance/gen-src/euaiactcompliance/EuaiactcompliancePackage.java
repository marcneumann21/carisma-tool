/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcomplianceFactory
 * @model kind="package"
 * @generated
 */
public interface EuaiactcompliancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "euaiactcompliance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///euaiactcompliance.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "euaiactcompliance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EuaiactcompliancePackage eINSTANCE = euaiactcompliance.impl.EuaiactcompliancePackageImpl.init();

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl <em>Annex III Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.AnnexIIIUseCaseImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAnnexIIIUseCase()
	 * @generated
	 */
	int ANNEX_III_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Biometric Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Biometric Categorisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION = 1;

	/**
	 * The feature id for the '<em><b>Critical Infrastructure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Education</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__EDUCATION = 3;

	/**
	 * The feature id for the '<em><b>Human Employment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Essential Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__ESSENTIAL_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Law</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__LAW = 6;

	/**
	 * The feature id for the '<em><b>Migration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__MIGRATION = 7;

	/**
	 * The feature id for the '<em><b>Justice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__JUSTICE = 8;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK = 9;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__PREPARATORY_TASK = 11;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE__BASE_USE_CASE = 12;

	/**
	 * The number of structural features of the '<em>Annex III Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Annex III Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_III_USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ProfilingImpl <em>Profiling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ProfilingImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProfiling()
	 * @generated
	 */
	int PROFILING = 1;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Profiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.SafetyComponentImpl <em>Safety Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.SafetyComponentImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSafetyComponent()
	 * @generated
	 */
	int SAFETY_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Machinery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__MACHINERY = 0;

	/**
	 * The feature id for the '<em><b>Toy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__TOY = 1;

	/**
	 * The feature id for the '<em><b>Elevator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__ELEVATOR = 2;

	/**
	 * The feature id for the '<em><b>Medical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__MEDICAL = 3;

	/**
	 * The feature id for the '<em><b>In Vitro Diagnostics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS = 4;

	/**
	 * The feature id for the '<em><b>Personal Protective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__PERSONAL_PROTECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Civil Aviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__CIVIL_AVIATION = 6;

	/**
	 * The feature id for the '<em><b>Rail System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__RAIL_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Agricultural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__AGRICULTURAL = 8;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT__BASE_COMPONENT = 9;

	/**
	 * The number of structural features of the '<em>Safety Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Safety Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.HumanInteractionImpl <em>Human Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.HumanInteractionImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getHumanInteraction()
	 * @generated
	 */
	int HUMAN_INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Human Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Human Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.SyntheticContentImpl <em>Synthetic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.SyntheticContentImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSyntheticContent()
	 * @generated
	 */
	int SYNTHETIC_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Synthetic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Synthetic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EmotionRecognitionNotificationImpl <em>Emotion Recognition Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EmotionRecognitionNotificationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEmotionRecognitionNotification()
	 * @generated
	 */
	int EMOTION_RECOGNITION_NOTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_NOTIFICATION__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Emotion Recognition Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_NOTIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emotion Recognition Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricCategorizationNotificationImpl <em>Biometric Categorization Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricCategorizationNotificationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricCategorizationNotification()
	 * @generated
	 */
	int BIOMETRIC_CATEGORIZATION_NOTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORIZATION_NOTIFICATION__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Biometric Categorization Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORIZATION_NOTIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Biometric Categorization Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORIZATION_NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DeepfakeImpl <em>Deepfake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DeepfakeImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDeepfake()
	 * @generated
	 */
	int DEEPFAKE = 7;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEPFAKE__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Deepfake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEPFAKE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deepfake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEEPFAKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.PublicInterestTextImpl <em>Public Interest Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.PublicInterestTextImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getPublicInterestText()
	 * @generated
	 */
	int PUBLIC_INTEREST_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INTEREST_TEXT__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Public Interest Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INTEREST_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Public Interest Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_INTEREST_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ManipulativeBehaviourImpl <em>Manipulative Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ManipulativeBehaviourImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getManipulativeBehaviour()
	 * @generated
	 */
	int MANIPULATIVE_BEHAVIOUR = 9;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Manipulative Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Manipulative Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ExploitingVulnerabilityImpl <em>Exploiting Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ExploitingVulnerabilityImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getExploitingVulnerability()
	 * @generated
	 */
	int EXPLOITING_VULNERABILITY = 10;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY__AGE = 0;

	/**
	 * The feature id for the '<em><b>Disability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY__DISABILITY = 1;

	/**
	 * The feature id for the '<em><b>Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY__SOCIAL = 2;

	/**
	 * The feature id for the '<em><b>Economic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY__ECONOMIC = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY__BASE_USE_CASE = 4;

	/**
	 * The number of structural features of the '<em>Exploiting Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Exploiting Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_VULNERABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.SocialScoringImpl <em>Social Scoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.SocialScoringImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSocialScoring()
	 * @generated
	 */
	int SOCIAL_SCORING = 11;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_SCORING__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Social Scoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_SCORING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Social Scoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_SCORING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.PredictivePolicingImpl <em>Predictive Policing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.PredictivePolicingImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getPredictivePolicing()
	 * @generated
	 */
	int PREDICTIVE_POLICING = 12;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_POLICING__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Predictive Policing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_POLICING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predictive Policing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_POLICING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.FacialRecognitionImpl <em>Facial Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.FacialRecognitionImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getFacialRecognition()
	 * @generated
	 */
	int FACIAL_RECOGNITION = 13;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_RECOGNITION__INTERNET = 0;

	/**
	 * The feature id for the '<em><b>CCTV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_RECOGNITION__CCTV = 1;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_RECOGNITION__BASE_USE_CASE = 2;

	/**
	 * The number of structural features of the '<em>Facial Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_RECOGNITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Facial Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_RECOGNITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EmotionRecognitionImpl <em>Emotion Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EmotionRecognitionImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEmotionRecognition()
	 * @generated
	 */
	int EMOTION_RECOGNITION = 14;

	/**
	 * The feature id for the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__RACE = 0;

	/**
	 * The feature id for the '<em><b>Politics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__POLITICS = 1;

	/**
	 * The feature id for the '<em><b>Union Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__UNION_MEMBERSHIP = 2;

	/**
	 * The feature id for the '<em><b>Religion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__RELIGION = 3;

	/**
	 * The feature id for the '<em><b>Sexuality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__SEXUALITY = 4;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__BASE_USE_CASE = 5;

	/**
	 * The number of structural features of the '<em>Emotion Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Emotion Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricCategorisationImpl <em>Biometric Categorisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricCategorisationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricCategorisation()
	 * @generated
	 */
	int BIOMETRIC_CATEGORISATION = 15;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__BASE_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Lawfully Acquired Datasets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS = 1;

	/**
	 * The feature id for the '<em><b>Law Enforcement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT = 2;

	/**
	 * The number of structural features of the '<em>Biometric Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Biometric Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricIdentificationImpl <em>Biometric Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricIdentificationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricIdentification()
	 * @generated
	 */
	int BIOMETRIC_IDENTIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Public Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Victim Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH = 1;

	/**
	 * The feature id for the '<em><b>Threat Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION = 2;

	/**
	 * The feature id for the '<em><b>Criminal Suspect Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = 4;

	/**
	 * The number of structural features of the '<em>Biometric Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Biometric Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.AISystemImpl <em>AI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.AISystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAISystem()
	 * @generated
	 */
	int AI_SYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ProviderImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 18;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__BASE_ACTOR = 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl <em>General Description AI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.GeneralDescriptionAISystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getGeneralDescriptionAISystem()
	 * @generated
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM = 19;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE = 5;

	/**
	 * The feature id for the '<em><b>Visual Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS = 8;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT = 9;

	/**
	 * The number of structural features of the '<em>General Description AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>General Description AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DESCRIPTION_AI_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl <em>Detailed Description AI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DetailedDescriptionAISystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDetailedDescriptionAISystem()
	 * @generated
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM = 20;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY = 1;

	/**
	 * The feature id for the '<em><b>Predictable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS = 2;

	/**
	 * The feature id for the '<em><b>Human Oversight Post Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT = 3;

	/**
	 * The feature id for the '<em><b>Input Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT = 5;

	/**
	 * The number of structural features of the '<em>Detailed Description AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Detailed Description AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_DESCRIPTION_AI_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DetailedInformationAISystemImpl <em>Detailed Information AI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DetailedInformationAISystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDetailedInformationAISystem()
	 * @generated
	 */
	int DETAILED_INFORMATION_AI_SYSTEM = 21;

	/**
	 * The feature id for the '<em><b>Developement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT = 0;

	/**
	 * The feature id for the '<em><b>Third Party Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Design Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Design Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION = 3;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Compromise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE = 6;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE = 7;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Training Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS = 9;

	/**
	 * The feature id for the '<em><b>Training Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Training Data Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION = 11;

	/**
	 * The feature id for the '<em><b>Training Data Labeling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING = 12;

	/**
	 * The feature id for the '<em><b>Training Data Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING = 13;

	/**
	 * The feature id for the '<em><b>Human Oversight Preassessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT = 14;

	/**
	 * The feature id for the '<em><b>Planned Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Validation Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS = 16;

	/**
	 * The feature id for the '<em><b>Testing Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS = 17;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Cybersecurity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY = 19;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT = 20;

	/**
	 * The number of structural features of the '<em>Detailed Information AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Detailed Information AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_INFORMATION_AI_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DescriptionPerformanceMetricsImpl <em>Description Performance Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DescriptionPerformanceMetricsImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionPerformanceMetrics()
	 * @generated
	 */
	int DESCRIPTION_PERFORMANCE_METRICS = 22;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PERFORMANCE_METRICS__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Description Performance Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PERFORMANCE_METRICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description Performance Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PERFORMANCE_METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DescriptionRiskManagementImpl <em>Description Risk Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DescriptionRiskManagementImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionRiskManagement()
	 * @generated
	 */
	int DESCRIPTION_RISK_MANAGEMENT = 23;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_RISK_MANAGEMENT__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Description Risk Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_RISK_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description Risk Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_RISK_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DescriptionProviderRelevantChangesImpl <em>Description Provider Relevant Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DescriptionProviderRelevantChangesImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionProviderRelevantChanges()
	 * @generated
	 */
	int DESCRIPTION_PROVIDER_RELEVANT_CHANGES = 24;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PROVIDER_RELEVANT_CHANGES__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Description Provider Relevant Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PROVIDER_RELEVANT_CHANGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description Provider Relevant Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PROVIDER_RELEVANT_CHANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ListHarmonisedStandardsImpl <em>List Harmonised Standards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ListHarmonisedStandardsImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getListHarmonisedStandards()
	 * @generated
	 */
	int LIST_HARMONISED_STANDARDS = 25;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_HARMONISED_STANDARDS__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>List Harmonised Standards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_HARMONISED_STANDARDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Harmonised Standards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_HARMONISED_STANDARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.CopyEUConformityDeclarationImpl <em>Copy EU Conformity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.CopyEUConformityDeclarationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCopyEUConformityDeclaration()
	 * @generated
	 */
	int COPY_EU_CONFORMITY_DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_EU_CONFORMITY_DECLARATION__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Copy EU Conformity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_EU_CONFORMITY_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Copy EU Conformity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_EU_CONFORMITY_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DescriptionAISystemPostMarketPhaseImpl <em>Description AI System Post Market Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DescriptionAISystemPostMarketPhaseImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionAISystemPostMarketPhase()
	 * @generated
	 */
	int DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE = 27;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE__BASE_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Description AI System Post Market Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description AI System Post Market Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.DocumentsImpl <em>Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DocumentsImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDocuments()
	 * @generated
	 */
	int DOCUMENTS = 28;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.TransparencyObligationImpl <em>Transparency Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.TransparencyObligationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getTransparencyObligation()
	 * @generated
	 */
	int TRANSPARENCY_OBLIGATION = 29;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__BASE_ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Human Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Synthetic Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Emotion Recognition Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Biometric Categorization Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Deepfake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__DEEPFAKE = 5;

	/**
	 * The feature id for the '<em><b>Public Interest Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT = 6;

	/**
	 * The number of structural features of the '<em>Transparency Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Transparency Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OBLIGATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link euaiactcompliance.AnnexIIIUseCase <em>Annex III Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex III Use Case</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase
	 * @generated
	 */
	EClass getAnnexIIIUseCase();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isBiometricIdentification <em>Biometric Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biometric Identification</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isBiometricIdentification()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_BiometricIdentification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isBiometricCategorisation <em>Biometric Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biometric Categorisation</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isBiometricCategorisation()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_BiometricCategorisation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isCriticalInfrastructure <em>Critical Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Infrastructure</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isCriticalInfrastructure()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_CriticalInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isEducation <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isEducation()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_Education();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isHumanEmployment <em>Human Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Employment</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isHumanEmployment()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_HumanEmployment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isEssentialServices <em>Essential Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Essential Services</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isEssentialServices()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_EssentialServices();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isLaw <em>Law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isLaw()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_Law();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isMigration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Migration</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isMigration()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_Migration();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isJustice <em>Justice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justice</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isJustice()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_Justice();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isNarrowProceduralTask()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isImprovesHumanActivity()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AnnexIIIUseCase#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#isPreparatoryTask()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EAttribute getAnnexIIIUseCase_PreparatoryTask();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.AnnexIIIUseCase#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.AnnexIIIUseCase#getBase_UseCase()
	 * @see #getAnnexIIIUseCase()
	 * @generated
	 */
	EReference getAnnexIIIUseCase_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.Profiling <em>Profiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profiling</em>'.
	 * @see euaiactcompliance.Profiling
	 * @generated
	 */
	EClass getProfiling();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Profiling#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.Profiling#getBase_UseCase()
	 * @see #getProfiling()
	 * @generated
	 */
	EReference getProfiling_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.SafetyComponent <em>Safety Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Component</em>'.
	 * @see euaiactcompliance.SafetyComponent
	 * @generated
	 */
	EClass getSafetyComponent();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isMachinery <em>Machinery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machinery</em>'.
	 * @see euaiactcompliance.SafetyComponent#isMachinery()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_Machinery();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isToy <em>Toy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toy</em>'.
	 * @see euaiactcompliance.SafetyComponent#isToy()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_Toy();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isElevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevator</em>'.
	 * @see euaiactcompliance.SafetyComponent#isElevator()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_Elevator();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isMedical <em>Medical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical</em>'.
	 * @see euaiactcompliance.SafetyComponent#isMedical()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_Medical();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isInVitroDiagnostics <em>In Vitro Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Vitro Diagnostics</em>'.
	 * @see euaiactcompliance.SafetyComponent#isInVitroDiagnostics()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_InVitroDiagnostics();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isPersonalProtective <em>Personal Protective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Protective</em>'.
	 * @see euaiactcompliance.SafetyComponent#isPersonalProtective()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_PersonalProtective();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isCivilAviation <em>Civil Aviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Civil Aviation</em>'.
	 * @see euaiactcompliance.SafetyComponent#isCivilAviation()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_CivilAviation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isRailSystem <em>Rail System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rail System</em>'.
	 * @see euaiactcompliance.SafetyComponent#isRailSystem()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_RailSystem();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SafetyComponent#isAgricultural <em>Agricultural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agricultural</em>'.
	 * @see euaiactcompliance.SafetyComponent#isAgricultural()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EAttribute getSafetyComponent_Agricultural();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.SafetyComponent#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.SafetyComponent#getBase_Component()
	 * @see #getSafetyComponent()
	 * @generated
	 */
	EReference getSafetyComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.HumanInteraction <em>Human Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Interaction</em>'.
	 * @see euaiactcompliance.HumanInteraction
	 * @generated
	 */
	EClass getHumanInteraction();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.HumanInteraction#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.HumanInteraction#getBase_UseCase()
	 * @see #getHumanInteraction()
	 * @generated
	 */
	EReference getHumanInteraction_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.SyntheticContent <em>Synthetic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthetic Content</em>'.
	 * @see euaiactcompliance.SyntheticContent
	 * @generated
	 */
	EClass getSyntheticContent();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.SyntheticContent#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.SyntheticContent#getBase_UseCase()
	 * @see #getSyntheticContent()
	 * @generated
	 */
	EReference getSyntheticContent_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.EmotionRecognitionNotification <em>Emotion Recognition Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion Recognition Notification</em>'.
	 * @see euaiactcompliance.EmotionRecognitionNotification
	 * @generated
	 */
	EClass getEmotionRecognitionNotification();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.EmotionRecognitionNotification#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.EmotionRecognitionNotification#getBase_UseCase()
	 * @see #getEmotionRecognitionNotification()
	 * @generated
	 */
	EReference getEmotionRecognitionNotification_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.BiometricCategorizationNotification <em>Biometric Categorization Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biometric Categorization Notification</em>'.
	 * @see euaiactcompliance.BiometricCategorizationNotification
	 * @generated
	 */
	EClass getBiometricCategorizationNotification();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.BiometricCategorizationNotification#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.BiometricCategorizationNotification#getBase_UseCase()
	 * @see #getBiometricCategorizationNotification()
	 * @generated
	 */
	EReference getBiometricCategorizationNotification_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.Deepfake <em>Deepfake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deepfake</em>'.
	 * @see euaiactcompliance.Deepfake
	 * @generated
	 */
	EClass getDeepfake();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Deepfake#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.Deepfake#getBase_UseCase()
	 * @see #getDeepfake()
	 * @generated
	 */
	EReference getDeepfake_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.PublicInterestText <em>Public Interest Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Interest Text</em>'.
	 * @see euaiactcompliance.PublicInterestText
	 * @generated
	 */
	EClass getPublicInterestText();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.PublicInterestText#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.PublicInterestText#getBase_UseCase()
	 * @see #getPublicInterestText()
	 * @generated
	 */
	EReference getPublicInterestText_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.ManipulativeBehaviour <em>Manipulative Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manipulative Behaviour</em>'.
	 * @see euaiactcompliance.ManipulativeBehaviour
	 * @generated
	 */
	EClass getManipulativeBehaviour();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ManipulativeBehaviour#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.ManipulativeBehaviour#getBase_UseCase()
	 * @see #getManipulativeBehaviour()
	 * @generated
	 */
	EReference getManipulativeBehaviour_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.ExploitingVulnerability <em>Exploiting Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploiting Vulnerability</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability
	 * @generated
	 */
	EClass getExploitingVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingVulnerability#isAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability#isAge()
	 * @see #getExploitingVulnerability()
	 * @generated
	 */
	EAttribute getExploitingVulnerability_Age();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingVulnerability#isDisability <em>Disability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability#isDisability()
	 * @see #getExploitingVulnerability()
	 * @generated
	 */
	EAttribute getExploitingVulnerability_Disability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingVulnerability#isSocial <em>Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability#isSocial()
	 * @see #getExploitingVulnerability()
	 * @generated
	 */
	EAttribute getExploitingVulnerability_Social();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingVulnerability#isEconomic <em>Economic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Economic</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability#isEconomic()
	 * @see #getExploitingVulnerability()
	 * @generated
	 */
	EAttribute getExploitingVulnerability_Economic();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ExploitingVulnerability#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.ExploitingVulnerability#getBase_UseCase()
	 * @see #getExploitingVulnerability()
	 * @generated
	 */
	EReference getExploitingVulnerability_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.SocialScoring <em>Social Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Scoring</em>'.
	 * @see euaiactcompliance.SocialScoring
	 * @generated
	 */
	EClass getSocialScoring();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.SocialScoring#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.SocialScoring#getBase_UseCase()
	 * @see #getSocialScoring()
	 * @generated
	 */
	EReference getSocialScoring_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.PredictivePolicing <em>Predictive Policing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predictive Policing</em>'.
	 * @see euaiactcompliance.PredictivePolicing
	 * @generated
	 */
	EClass getPredictivePolicing();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.PredictivePolicing#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.PredictivePolicing#getBase_UseCase()
	 * @see #getPredictivePolicing()
	 * @generated
	 */
	EReference getPredictivePolicing_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.FacialRecognition <em>Facial Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facial Recognition</em>'.
	 * @see euaiactcompliance.FacialRecognition
	 * @generated
	 */
	EClass getFacialRecognition();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.FacialRecognition#isInternet <em>Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internet</em>'.
	 * @see euaiactcompliance.FacialRecognition#isInternet()
	 * @see #getFacialRecognition()
	 * @generated
	 */
	EAttribute getFacialRecognition_Internet();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.FacialRecognition#isCCTV <em>CCTV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCTV</em>'.
	 * @see euaiactcompliance.FacialRecognition#isCCTV()
	 * @see #getFacialRecognition()
	 * @generated
	 */
	EAttribute getFacialRecognition_CCTV();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.FacialRecognition#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.FacialRecognition#getBase_UseCase()
	 * @see #getFacialRecognition()
	 * @generated
	 */
	EReference getFacialRecognition_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.EmotionRecognition <em>Emotion Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion Recognition</em>'.
	 * @see euaiactcompliance.EmotionRecognition
	 * @generated
	 */
	EClass getEmotionRecognition();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isRace <em>Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Race</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isRace()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Race();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isPolitics <em>Politics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Politics</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isPolitics()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Politics();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isUnionMembership <em>Union Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Union Membership</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isUnionMembership()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_UnionMembership();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isReligion <em>Religion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Religion</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isReligion()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Religion();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isSexuality <em>Sexuality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexuality</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isSexuality()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Sexuality();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.EmotionRecognition#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.EmotionRecognition#getBase_UseCase()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EReference getEmotionRecognition_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.BiometricCategorisation <em>Biometric Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biometric Categorisation</em>'.
	 * @see euaiactcompliance.BiometricCategorisation
	 * @generated
	 */
	EClass getBiometricCategorisation();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.BiometricCategorisation#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#getBase_UseCase()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EReference getBiometricCategorisation_Base_UseCase();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isLawfullyAcquiredDatasets <em>Lawfully Acquired Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lawfully Acquired Datasets</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isLawfullyAcquiredDatasets()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_LawfullyAcquiredDatasets();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isLawEnforcement <em>Law Enforcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law Enforcement</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isLawEnforcement()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_LawEnforcement();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.BiometricIdentification <em>Biometric Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biometric Identification</em>'.
	 * @see euaiactcompliance.BiometricIdentification
	 * @generated
	 */
	EClass getBiometricIdentification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isPublicSpace <em>Public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Space</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isPublicSpace()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_PublicSpace();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isVictimSearch <em>Victim Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Search</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isVictimSearch()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_VictimSearch();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isThreatPrevention <em>Threat Prevention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat Prevention</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isThreatPrevention()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_ThreatPrevention();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isCriminalSuspectSearch <em>Criminal Suspect Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criminal Suspect Search</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isCriminalSuspectSearch()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_CriminalSuspectSearch();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.BiometricIdentification#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.BiometricIdentification#getBase_UseCase()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EReference getBiometricIdentification_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.AISystem <em>AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI System</em>'.
	 * @see euaiactcompliance.AISystem
	 * @generated
	 */
	EClass getAISystem();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.AISystem#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.AISystem#getBase_Component()
	 * @see #getAISystem()
	 * @generated
	 */
	EReference getAISystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see euaiactcompliance.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Provider#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see euaiactcompliance.Provider#getBase_Actor()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Base_Actor();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.GeneralDescriptionAISystem <em>General Description AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Description AI System</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem
	 * @generated
	 */
	EClass getGeneralDescriptionAISystem();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isPurpose()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isProvider()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Provider();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isVersion()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isInteraction()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Interaction();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isDeployment()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Deployment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isHardware()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Hardware();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isVisualDocumentation <em>Visual Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Documentation</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isVisualDocumentation()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_VisualDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isInterface()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Interface();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.GeneralDescriptionAISystem#isInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#isInstructions()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EAttribute getGeneralDescriptionAISystem_Instructions();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.GeneralDescriptionAISystem#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.GeneralDescriptionAISystem#getBase_Artifact()
	 * @see #getGeneralDescriptionAISystem()
	 * @generated
	 */
	EReference getGeneralDescriptionAISystem_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DetailedDescriptionAISystem <em>Detailed Description AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Description AI System</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem
	 * @generated
	 */
	EClass getDetailedDescriptionAISystem();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedDescriptionAISystem#isCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabilities</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#isCapabilities()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EAttribute getDetailedDescriptionAISystem_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedDescriptionAISystem#isAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#isAccuracy()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EAttribute getDetailedDescriptionAISystem_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedDescriptionAISystem#isPredictableRisks <em>Predictable Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predictable Risks</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#isPredictableRisks()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EAttribute getDetailedDescriptionAISystem_PredictableRisks();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedDescriptionAISystem#isHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Post Assessment</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#isHumanOversightPostAssessment()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EAttribute getDetailedDescriptionAISystem_HumanOversightPostAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedDescriptionAISystem#isInputSpecification <em>Input Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Specification</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#isInputSpecification()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EAttribute getDetailedDescriptionAISystem_InputSpecification();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DetailedDescriptionAISystem#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DetailedDescriptionAISystem#getBase_Artifact()
	 * @see #getDetailedDescriptionAISystem()
	 * @generated
	 */
	EReference getDetailedDescriptionAISystem_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DetailedInformationAISystem <em>Detailed Information AI System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Information AI System</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem
	 * @generated
	 */
	EClass getDetailedInformationAISystem();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isDevelopement <em>Developement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developement</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isDevelopement()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Developement();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isThirdPartyElements <em>Third Party Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Elements</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isThirdPartyElements()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_ThirdPartyElements();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isDesignSpecification <em>Design Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Specification</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isDesignSpecification()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_DesignSpecification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isDesignDecision <em>Design Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Decision</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isDesignDecision()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_DesignDecision();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isObjective()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Objective();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Output</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isExpectedOutput()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_ExpectedOutput();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isCompromise <em>Compromise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compromise</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isCompromise()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Compromise();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isArchitecture()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isResources()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Resources();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTrainingMethods <em>Training Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Methods</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTrainingMethods()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TrainingMethods();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTrainingDataDescription <em>Training Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Data Description</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTrainingDataDescription()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TrainingDataDescription();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTrainingDataSelection <em>Training Data Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Data Selection</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTrainingDataSelection()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TrainingDataSelection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTrainingDataLabeling <em>Training Data Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Data Labeling</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTrainingDataLabeling()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TrainingDataLabeling();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTrainingDataCleaning <em>Training Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Data Cleaning</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTrainingDataCleaning()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TrainingDataCleaning();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isHumanOversightPreassessment <em>Human Oversight Preassessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Preassessment</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isHumanOversightPreassessment()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_HumanOversightPreassessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isPlannedModification <em>Planned Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Modification</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isPlannedModification()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_PlannedModification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isValidationProcess <em>Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Process</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isValidationProcess()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_ValidationProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isTestingProcess <em>Testing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Process</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isTestingProcess()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_TestingProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isParameter()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.DetailedInformationAISystem#isCybersecurity <em>Cybersecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cybersecurity</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#isCybersecurity()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EAttribute getDetailedInformationAISystem_Cybersecurity();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DetailedInformationAISystem#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DetailedInformationAISystem#getBase_Artifact()
	 * @see #getDetailedInformationAISystem()
	 * @generated
	 */
	EReference getDetailedInformationAISystem_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DescriptionPerformanceMetrics <em>Description Performance Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Performance Metrics</em>'.
	 * @see euaiactcompliance.DescriptionPerformanceMetrics
	 * @generated
	 */
	EClass getDescriptionPerformanceMetrics();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DescriptionPerformanceMetrics#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DescriptionPerformanceMetrics#getBase_Artifact()
	 * @see #getDescriptionPerformanceMetrics()
	 * @generated
	 */
	EReference getDescriptionPerformanceMetrics_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DescriptionRiskManagement <em>Description Risk Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Risk Management</em>'.
	 * @see euaiactcompliance.DescriptionRiskManagement
	 * @generated
	 */
	EClass getDescriptionRiskManagement();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DescriptionRiskManagement#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DescriptionRiskManagement#getBase_Artifact()
	 * @see #getDescriptionRiskManagement()
	 * @generated
	 */
	EReference getDescriptionRiskManagement_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DescriptionProviderRelevantChanges <em>Description Provider Relevant Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Provider Relevant Changes</em>'.
	 * @see euaiactcompliance.DescriptionProviderRelevantChanges
	 * @generated
	 */
	EClass getDescriptionProviderRelevantChanges();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DescriptionProviderRelevantChanges#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DescriptionProviderRelevantChanges#getBase_Artifact()
	 * @see #getDescriptionProviderRelevantChanges()
	 * @generated
	 */
	EReference getDescriptionProviderRelevantChanges_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.ListHarmonisedStandards <em>List Harmonised Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Harmonised Standards</em>'.
	 * @see euaiactcompliance.ListHarmonisedStandards
	 * @generated
	 */
	EClass getListHarmonisedStandards();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ListHarmonisedStandards#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.ListHarmonisedStandards#getBase_Artifact()
	 * @see #getListHarmonisedStandards()
	 * @generated
	 */
	EReference getListHarmonisedStandards_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.CopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy EU Conformity Declaration</em>'.
	 * @see euaiactcompliance.CopyEUConformityDeclaration
	 * @generated
	 */
	EClass getCopyEUConformityDeclaration();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.CopyEUConformityDeclaration#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.CopyEUConformityDeclaration#getBase_Artifact()
	 * @see #getCopyEUConformityDeclaration()
	 * @generated
	 */
	EReference getCopyEUConformityDeclaration_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.DescriptionAISystemPostMarketPhase <em>Description AI System Post Market Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description AI System Post Market Phase</em>'.
	 * @see euaiactcompliance.DescriptionAISystemPostMarketPhase
	 * @generated
	 */
	EClass getDescriptionAISystemPostMarketPhase();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.DescriptionAISystemPostMarketPhase#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.DescriptionAISystemPostMarketPhase#getBase_Artifact()
	 * @see #getDescriptionAISystemPostMarketPhase()
	 * @generated
	 */
	EReference getDescriptionAISystemPostMarketPhase_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.Documents <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documents</em>'.
	 * @see euaiactcompliance.Documents
	 * @generated
	 */
	EClass getDocuments();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Documents#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see euaiactcompliance.Documents#getBase_Dependency()
	 * @see #getDocuments()
	 * @generated
	 */
	EReference getDocuments_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.TransparencyObligation <em>Transparency Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transparency Obligation</em>'.
	 * @see euaiactcompliance.TransparencyObligation
	 * @generated
	 */
	EClass getTransparencyObligation();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.TransparencyObligation#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.TransparencyObligation#getBase_Artifact()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EReference getTransparencyObligation_Base_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isHumanInteraction <em>Human Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Interaction</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isHumanInteraction()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_HumanInteraction();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isSyntheticContent <em>Synthetic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic Content</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isSyntheticContent()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_SyntheticContent();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isEmotionRecognitionNotification <em>Emotion Recognition Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emotion Recognition Notification</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isEmotionRecognitionNotification()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_EmotionRecognitionNotification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isBiometricCategorizationNotification <em>Biometric Categorization Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biometric Categorization Notification</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isBiometricCategorizationNotification()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_BiometricCategorizationNotification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isDeepfake <em>Deepfake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deepfake</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isDeepfake()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_Deepfake();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TransparencyObligation#isPublicInterestText <em>Public Interest Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Interest Text</em>'.
	 * @see euaiactcompliance.TransparencyObligation#isPublicInterestText()
	 * @see #getTransparencyObligation()
	 * @generated
	 */
	EAttribute getTransparencyObligation_PublicInterestText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EuaiactcomplianceFactory getEuaiactcomplianceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl <em>Annex III Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.AnnexIIIUseCaseImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAnnexIIIUseCase()
		 * @generated
		 */
		EClass ANNEX_III_USE_CASE = eINSTANCE.getAnnexIIIUseCase();

		/**
		 * The meta object literal for the '<em><b>Biometric Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION = eINSTANCE.getAnnexIIIUseCase_BiometricIdentification();

		/**
		 * The meta object literal for the '<em><b>Biometric Categorisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION = eINSTANCE.getAnnexIIIUseCase_BiometricCategorisation();

		/**
		 * The meta object literal for the '<em><b>Critical Infrastructure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE = eINSTANCE.getAnnexIIIUseCase_CriticalInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Education</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__EDUCATION = eINSTANCE.getAnnexIIIUseCase_Education();

		/**
		 * The meta object literal for the '<em><b>Human Employment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT = eINSTANCE.getAnnexIIIUseCase_HumanEmployment();

		/**
		 * The meta object literal for the '<em><b>Essential Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__ESSENTIAL_SERVICES = eINSTANCE.getAnnexIIIUseCase_EssentialServices();

		/**
		 * The meta object literal for the '<em><b>Law</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__LAW = eINSTANCE.getAnnexIIIUseCase_Law();

		/**
		 * The meta object literal for the '<em><b>Migration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__MIGRATION = eINSTANCE.getAnnexIIIUseCase_Migration();

		/**
		 * The meta object literal for the '<em><b>Justice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__JUSTICE = eINSTANCE.getAnnexIIIUseCase_Justice();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK = eINSTANCE.getAnnexIIIUseCase_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getAnnexIIIUseCase_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNEX_III_USE_CASE__PREPARATORY_TASK = eINSTANCE.getAnnexIIIUseCase_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX_III_USE_CASE__BASE_USE_CASE = eINSTANCE.getAnnexIIIUseCase_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ProfilingImpl <em>Profiling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ProfilingImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProfiling()
		 * @generated
		 */
		EClass PROFILING = eINSTANCE.getProfiling();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILING__BASE_USE_CASE = eINSTANCE.getProfiling_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.SafetyComponentImpl <em>Safety Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.SafetyComponentImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSafetyComponent()
		 * @generated
		 */
		EClass SAFETY_COMPONENT = eINSTANCE.getSafetyComponent();

		/**
		 * The meta object literal for the '<em><b>Machinery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__MACHINERY = eINSTANCE.getSafetyComponent_Machinery();

		/**
		 * The meta object literal for the '<em><b>Toy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__TOY = eINSTANCE.getSafetyComponent_Toy();

		/**
		 * The meta object literal for the '<em><b>Elevator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__ELEVATOR = eINSTANCE.getSafetyComponent_Elevator();

		/**
		 * The meta object literal for the '<em><b>Medical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__MEDICAL = eINSTANCE.getSafetyComponent_Medical();

		/**
		 * The meta object literal for the '<em><b>In Vitro Diagnostics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS = eINSTANCE.getSafetyComponent_InVitroDiagnostics();

		/**
		 * The meta object literal for the '<em><b>Personal Protective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__PERSONAL_PROTECTIVE = eINSTANCE.getSafetyComponent_PersonalProtective();

		/**
		 * The meta object literal for the '<em><b>Civil Aviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__CIVIL_AVIATION = eINSTANCE.getSafetyComponent_CivilAviation();

		/**
		 * The meta object literal for the '<em><b>Rail System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__RAIL_SYSTEM = eINSTANCE.getSafetyComponent_RailSystem();

		/**
		 * The meta object literal for the '<em><b>Agricultural</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_COMPONENT__AGRICULTURAL = eINSTANCE.getSafetyComponent_Agricultural();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_COMPONENT__BASE_COMPONENT = eINSTANCE.getSafetyComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.HumanInteractionImpl <em>Human Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.HumanInteractionImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getHumanInteraction()
		 * @generated
		 */
		EClass HUMAN_INTERACTION = eINSTANCE.getHumanInteraction();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_INTERACTION__BASE_USE_CASE = eINSTANCE.getHumanInteraction_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.SyntheticContentImpl <em>Synthetic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.SyntheticContentImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSyntheticContent()
		 * @generated
		 */
		EClass SYNTHETIC_CONTENT = eINSTANCE.getSyntheticContent();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTHETIC_CONTENT__BASE_USE_CASE = eINSTANCE.getSyntheticContent_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.EmotionRecognitionNotificationImpl <em>Emotion Recognition Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.EmotionRecognitionNotificationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEmotionRecognitionNotification()
		 * @generated
		 */
		EClass EMOTION_RECOGNITION_NOTIFICATION = eINSTANCE.getEmotionRecognitionNotification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTION_RECOGNITION_NOTIFICATION__BASE_USE_CASE = eINSTANCE.getEmotionRecognitionNotification_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.BiometricCategorizationNotificationImpl <em>Biometric Categorization Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.BiometricCategorizationNotificationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricCategorizationNotification()
		 * @generated
		 */
		EClass BIOMETRIC_CATEGORIZATION_NOTIFICATION = eINSTANCE.getBiometricCategorizationNotification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_CATEGORIZATION_NOTIFICATION__BASE_USE_CASE = eINSTANCE.getBiometricCategorizationNotification_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DeepfakeImpl <em>Deepfake</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DeepfakeImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDeepfake()
		 * @generated
		 */
		EClass DEEPFAKE = eINSTANCE.getDeepfake();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEEPFAKE__BASE_USE_CASE = eINSTANCE.getDeepfake_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.PublicInterestTextImpl <em>Public Interest Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.PublicInterestTextImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getPublicInterestText()
		 * @generated
		 */
		EClass PUBLIC_INTEREST_TEXT = eINSTANCE.getPublicInterestText();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_INTEREST_TEXT__BASE_USE_CASE = eINSTANCE.getPublicInterestText_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ManipulativeBehaviourImpl <em>Manipulative Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ManipulativeBehaviourImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getManipulativeBehaviour()
		 * @generated
		 */
		EClass MANIPULATIVE_BEHAVIOUR = eINSTANCE.getManipulativeBehaviour();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE = eINSTANCE.getManipulativeBehaviour_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ExploitingVulnerabilityImpl <em>Exploiting Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ExploitingVulnerabilityImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getExploitingVulnerability()
		 * @generated
		 */
		EClass EXPLOITING_VULNERABILITY = eINSTANCE.getExploitingVulnerability();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_VULNERABILITY__AGE = eINSTANCE.getExploitingVulnerability_Age();

		/**
		 * The meta object literal for the '<em><b>Disability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_VULNERABILITY__DISABILITY = eINSTANCE.getExploitingVulnerability_Disability();

		/**
		 * The meta object literal for the '<em><b>Social</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_VULNERABILITY__SOCIAL = eINSTANCE.getExploitingVulnerability_Social();

		/**
		 * The meta object literal for the '<em><b>Economic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_VULNERABILITY__ECONOMIC = eINSTANCE.getExploitingVulnerability_Economic();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLOITING_VULNERABILITY__BASE_USE_CASE = eINSTANCE.getExploitingVulnerability_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.SocialScoringImpl <em>Social Scoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.SocialScoringImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSocialScoring()
		 * @generated
		 */
		EClass SOCIAL_SCORING = eINSTANCE.getSocialScoring();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_SCORING__BASE_USE_CASE = eINSTANCE.getSocialScoring_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.PredictivePolicingImpl <em>Predictive Policing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.PredictivePolicingImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getPredictivePolicing()
		 * @generated
		 */
		EClass PREDICTIVE_POLICING = eINSTANCE.getPredictivePolicing();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTIVE_POLICING__BASE_USE_CASE = eINSTANCE.getPredictivePolicing_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.FacialRecognitionImpl <em>Facial Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.FacialRecognitionImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getFacialRecognition()
		 * @generated
		 */
		EClass FACIAL_RECOGNITION = eINSTANCE.getFacialRecognition();

		/**
		 * The meta object literal for the '<em><b>Internet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACIAL_RECOGNITION__INTERNET = eINSTANCE.getFacialRecognition_Internet();

		/**
		 * The meta object literal for the '<em><b>CCTV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACIAL_RECOGNITION__CCTV = eINSTANCE.getFacialRecognition_CCTV();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACIAL_RECOGNITION__BASE_USE_CASE = eINSTANCE.getFacialRecognition_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.EmotionRecognitionImpl <em>Emotion Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.EmotionRecognitionImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEmotionRecognition()
		 * @generated
		 */
		EClass EMOTION_RECOGNITION = eINSTANCE.getEmotionRecognition();

		/**
		 * The meta object literal for the '<em><b>Race</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__RACE = eINSTANCE.getEmotionRecognition_Race();

		/**
		 * The meta object literal for the '<em><b>Politics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__POLITICS = eINSTANCE.getEmotionRecognition_Politics();

		/**
		 * The meta object literal for the '<em><b>Union Membership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__UNION_MEMBERSHIP = eINSTANCE.getEmotionRecognition_UnionMembership();

		/**
		 * The meta object literal for the '<em><b>Religion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__RELIGION = eINSTANCE.getEmotionRecognition_Religion();

		/**
		 * The meta object literal for the '<em><b>Sexuality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__SEXUALITY = eINSTANCE.getEmotionRecognition_Sexuality();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTION_RECOGNITION__BASE_USE_CASE = eINSTANCE.getEmotionRecognition_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.BiometricCategorisationImpl <em>Biometric Categorisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.BiometricCategorisationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricCategorisation()
		 * @generated
		 */
		EClass BIOMETRIC_CATEGORISATION = eINSTANCE.getBiometricCategorisation();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_CATEGORISATION__BASE_USE_CASE = eINSTANCE.getBiometricCategorisation_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Lawfully Acquired Datasets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS = eINSTANCE.getBiometricCategorisation_LawfullyAcquiredDatasets();

		/**
		 * The meta object literal for the '<em><b>Law Enforcement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT = eINSTANCE.getBiometricCategorisation_LawEnforcement();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.BiometricIdentificationImpl <em>Biometric Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.BiometricIdentificationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricIdentification()
		 * @generated
		 */
		EClass BIOMETRIC_IDENTIFICATION = eINSTANCE.getBiometricIdentification();

		/**
		 * The meta object literal for the '<em><b>Public Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE = eINSTANCE.getBiometricIdentification_PublicSpace();

		/**
		 * The meta object literal for the '<em><b>Victim Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH = eINSTANCE.getBiometricIdentification_VictimSearch();

		/**
		 * The meta object literal for the '<em><b>Threat Prevention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION = eINSTANCE.getBiometricIdentification_ThreatPrevention();

		/**
		 * The meta object literal for the '<em><b>Criminal Suspect Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH = eINSTANCE.getBiometricIdentification_CriminalSuspectSearch();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = eINSTANCE.getBiometricIdentification_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.AISystemImpl <em>AI System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.AISystemImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAISystem()
		 * @generated
		 */
		EClass AI_SYSTEM = eINSTANCE.getAISystem();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_SYSTEM__BASE_COMPONENT = eINSTANCE.getAISystem_Base_Component();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ProviderImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__BASE_ACTOR = eINSTANCE.getProvider_Base_Actor();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl <em>General Description AI System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.GeneralDescriptionAISystemImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getGeneralDescriptionAISystem()
		 * @generated
		 */
		EClass GENERAL_DESCRIPTION_AI_SYSTEM = eINSTANCE.getGeneralDescriptionAISystem();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE = eINSTANCE.getGeneralDescriptionAISystem_Purpose();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER = eINSTANCE.getGeneralDescriptionAISystem_Provider();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__VERSION = eINSTANCE.getGeneralDescriptionAISystem_Version();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION = eINSTANCE.getGeneralDescriptionAISystem_Interaction();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT = eINSTANCE.getGeneralDescriptionAISystem_Deployment();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE = eINSTANCE.getGeneralDescriptionAISystem_Hardware();

		/**
		 * The meta object literal for the '<em><b>Visual Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION = eINSTANCE.getGeneralDescriptionAISystem_VisualDocumentation();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE = eINSTANCE.getGeneralDescriptionAISystem_Interface();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS = eINSTANCE.getGeneralDescriptionAISystem_Instructions();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT = eINSTANCE.getGeneralDescriptionAISystem_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl <em>Detailed Description AI System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DetailedDescriptionAISystemImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDetailedDescriptionAISystem()
		 * @generated
		 */
		EClass DETAILED_DESCRIPTION_AI_SYSTEM = eINSTANCE.getDetailedDescriptionAISystem();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES = eINSTANCE.getDetailedDescriptionAISystem_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY = eINSTANCE.getDetailedDescriptionAISystem_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Predictable Risks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS = eINSTANCE.getDetailedDescriptionAISystem_PredictableRisks();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Post Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT = eINSTANCE.getDetailedDescriptionAISystem_HumanOversightPostAssessment();

		/**
		 * The meta object literal for the '<em><b>Input Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION = eINSTANCE.getDetailedDescriptionAISystem_InputSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT = eINSTANCE.getDetailedDescriptionAISystem_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DetailedInformationAISystemImpl <em>Detailed Information AI System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DetailedInformationAISystemImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDetailedInformationAISystem()
		 * @generated
		 */
		EClass DETAILED_INFORMATION_AI_SYSTEM = eINSTANCE.getDetailedInformationAISystem();

		/**
		 * The meta object literal for the '<em><b>Developement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT = eINSTANCE.getDetailedInformationAISystem_Developement();

		/**
		 * The meta object literal for the '<em><b>Third Party Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS = eINSTANCE.getDetailedInformationAISystem_ThirdPartyElements();

		/**
		 * The meta object literal for the '<em><b>Design Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION = eINSTANCE.getDetailedInformationAISystem_DesignSpecification();

		/**
		 * The meta object literal for the '<em><b>Design Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION = eINSTANCE.getDetailedInformationAISystem_DesignDecision();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE = eINSTANCE.getDetailedInformationAISystem_Objective();

		/**
		 * The meta object literal for the '<em><b>Expected Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT = eINSTANCE.getDetailedInformationAISystem_ExpectedOutput();

		/**
		 * The meta object literal for the '<em><b>Compromise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE = eINSTANCE.getDetailedInformationAISystem_Compromise();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE = eINSTANCE.getDetailedInformationAISystem_Architecture();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__RESOURCES = eINSTANCE.getDetailedInformationAISystem_Resources();

		/**
		 * The meta object literal for the '<em><b>Training Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS = eINSTANCE.getDetailedInformationAISystem_TrainingMethods();

		/**
		 * The meta object literal for the '<em><b>Training Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION = eINSTANCE.getDetailedInformationAISystem_TrainingDataDescription();

		/**
		 * The meta object literal for the '<em><b>Training Data Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION = eINSTANCE.getDetailedInformationAISystem_TrainingDataSelection();

		/**
		 * The meta object literal for the '<em><b>Training Data Labeling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING = eINSTANCE.getDetailedInformationAISystem_TrainingDataLabeling();

		/**
		 * The meta object literal for the '<em><b>Training Data Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING = eINSTANCE.getDetailedInformationAISystem_TrainingDataCleaning();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Preassessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT = eINSTANCE.getDetailedInformationAISystem_HumanOversightPreassessment();

		/**
		 * The meta object literal for the '<em><b>Planned Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION = eINSTANCE.getDetailedInformationAISystem_PlannedModification();

		/**
		 * The meta object literal for the '<em><b>Validation Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS = eINSTANCE.getDetailedInformationAISystem_ValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Testing Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS = eINSTANCE.getDetailedInformationAISystem_TestingProcess();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__PARAMETER = eINSTANCE.getDetailedInformationAISystem_Parameter();

		/**
		 * The meta object literal for the '<em><b>Cybersecurity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY = eINSTANCE.getDetailedInformationAISystem_Cybersecurity();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT = eINSTANCE.getDetailedInformationAISystem_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DescriptionPerformanceMetricsImpl <em>Description Performance Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DescriptionPerformanceMetricsImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionPerformanceMetrics()
		 * @generated
		 */
		EClass DESCRIPTION_PERFORMANCE_METRICS = eINSTANCE.getDescriptionPerformanceMetrics();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_PERFORMANCE_METRICS__BASE_ARTIFACT = eINSTANCE.getDescriptionPerformanceMetrics_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DescriptionRiskManagementImpl <em>Description Risk Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DescriptionRiskManagementImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionRiskManagement()
		 * @generated
		 */
		EClass DESCRIPTION_RISK_MANAGEMENT = eINSTANCE.getDescriptionRiskManagement();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_RISK_MANAGEMENT__BASE_ARTIFACT = eINSTANCE.getDescriptionRiskManagement_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DescriptionProviderRelevantChangesImpl <em>Description Provider Relevant Changes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DescriptionProviderRelevantChangesImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionProviderRelevantChanges()
		 * @generated
		 */
		EClass DESCRIPTION_PROVIDER_RELEVANT_CHANGES = eINSTANCE.getDescriptionProviderRelevantChanges();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_PROVIDER_RELEVANT_CHANGES__BASE_ARTIFACT = eINSTANCE.getDescriptionProviderRelevantChanges_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ListHarmonisedStandardsImpl <em>List Harmonised Standards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ListHarmonisedStandardsImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getListHarmonisedStandards()
		 * @generated
		 */
		EClass LIST_HARMONISED_STANDARDS = eINSTANCE.getListHarmonisedStandards();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_HARMONISED_STANDARDS__BASE_ARTIFACT = eINSTANCE.getListHarmonisedStandards_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.CopyEUConformityDeclarationImpl <em>Copy EU Conformity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.CopyEUConformityDeclarationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCopyEUConformityDeclaration()
		 * @generated
		 */
		EClass COPY_EU_CONFORMITY_DECLARATION = eINSTANCE.getCopyEUConformityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_EU_CONFORMITY_DECLARATION__BASE_ARTIFACT = eINSTANCE.getCopyEUConformityDeclaration_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DescriptionAISystemPostMarketPhaseImpl <em>Description AI System Post Market Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DescriptionAISystemPostMarketPhaseImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDescriptionAISystemPostMarketPhase()
		 * @generated
		 */
		EClass DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE = eINSTANCE.getDescriptionAISystemPostMarketPhase();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_AI_SYSTEM_POST_MARKET_PHASE__BASE_ARTIFACT = eINSTANCE.getDescriptionAISystemPostMarketPhase_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.DocumentsImpl <em>Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.DocumentsImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDocuments()
		 * @generated
		 */
		EClass DOCUMENTS = eINSTANCE.getDocuments();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTS__BASE_DEPENDENCY = eINSTANCE.getDocuments_Base_Dependency();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.TransparencyObligationImpl <em>Transparency Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.TransparencyObligationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getTransparencyObligation()
		 * @generated
		 */
		EClass TRANSPARENCY_OBLIGATION = eINSTANCE.getTransparencyObligation();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPARENCY_OBLIGATION__BASE_ARTIFACT = eINSTANCE.getTransparencyObligation_Base_Artifact();

		/**
		 * The meta object literal for the '<em><b>Human Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION = eINSTANCE.getTransparencyObligation_HumanInteraction();

		/**
		 * The meta object literal for the '<em><b>Synthetic Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT = eINSTANCE.getTransparencyObligation_SyntheticContent();

		/**
		 * The meta object literal for the '<em><b>Emotion Recognition Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION = eINSTANCE.getTransparencyObligation_EmotionRecognitionNotification();

		/**
		 * The meta object literal for the '<em><b>Biometric Categorization Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION = eINSTANCE.getTransparencyObligation_BiometricCategorizationNotification();

		/**
		 * The meta object literal for the '<em><b>Deepfake</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__DEEPFAKE = eINSTANCE.getTransparencyObligation_Deepfake();

		/**
		 * The meta object literal for the '<em><b>Public Interest Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT = eINSTANCE.getTransparencyObligation_PublicInterestText();

	}

} //EuaiactcompliancePackage
