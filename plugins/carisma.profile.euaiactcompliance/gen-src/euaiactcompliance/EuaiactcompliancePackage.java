/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link euaiactcompliance.impl.ProfilingImpl <em>Profiling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ProfilingImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProfiling()
	 * @generated
	 */
	int PROFILING = 0;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.ProductEmbeddingImpl <em>Product Embedding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ProductEmbeddingImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProductEmbedding()
	 * @generated
	 */
	int PRODUCT_EMBEDDING = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Failure Endanger Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY = 1;

	/**
	 * The feature id for the '<em><b>Third Party Conformity Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING__PRODUCT_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING__ROLE = 4;

	/**
	 * The number of structural features of the '<em>Product Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_EMBEDDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.HumanInteractionImpl <em>Human Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.HumanInteractionImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getHumanInteraction()
	 * @generated
	 */
	int HUMAN_INTERACTION = 2;

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
	int SYNTHETIC_CONTENT = 3;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.DeepfakeImpl <em>Deepfake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.DeepfakeImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getDeepfake()
	 * @generated
	 */
	int DEEPFAKE = 4;

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
	int PUBLIC_INTEREST_TEXT = 5;

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
	int MANIPULATIVE_BEHAVIOUR = 6;

	/**
	 * The feature id for the '<em><b>Subliminal Techniques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES = 0;

	/**
	 * The feature id for the '<em><b>Deceptive Techniques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES = 1;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE = 2;

	/**
	 * The number of structural features of the '<em>Manipulative Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Manipulative Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIPULATIVE_BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ExploitingHumanVulnerabilityImpl <em>Exploiting Human Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ExploitingHumanVulnerabilityImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getExploitingHumanVulnerability()
	 * @generated
	 */
	int EXPLOITING_HUMAN_VULNERABILITY = 7;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY__AGE = 0;

	/**
	 * The feature id for the '<em><b>Disability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY__DISABILITY = 1;

	/**
	 * The feature id for the '<em><b>Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY__SOCIAL = 2;

	/**
	 * The feature id for the '<em><b>Economic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY__ECONOMIC = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY__BASE_USE_CASE = 4;

	/**
	 * The number of structural features of the '<em>Exploiting Human Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Exploiting Human Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOITING_HUMAN_VULNERABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.SocialScoringImpl <em>Social Scoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.SocialScoringImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSocialScoring()
	 * @generated
	 */
	int SOCIAL_SCORING = 8;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.FacialImageScrapingImpl <em>Facial Image Scraping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.FacialImageScrapingImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getFacialImageScraping()
	 * @generated
	 */
	int FACIAL_IMAGE_SCRAPING = 9;

	/**
	 * The feature id for the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_IMAGE_SCRAPING__INTERNET = 0;

	/**
	 * The feature id for the '<em><b>CCTV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_IMAGE_SCRAPING__CCTV = 1;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_IMAGE_SCRAPING__BASE_USE_CASE = 2;

	/**
	 * The number of structural features of the '<em>Facial Image Scraping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_IMAGE_SCRAPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Facial Image Scraping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACIAL_IMAGE_SCRAPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.AISystemImpl <em>AI System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.AISystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAISystem()
	 * @generated
	 */
	int AI_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__VERSION = 2;

	/**
	 * The feature id for the '<em><b>External Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__EXTERNAL_INTERACTION = 3;

	/**
	 * The feature id for the '<em><b>Market Placement Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__MARKET_PLACEMENT_FORM = 4;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HARDWARE = 5;

	/**
	 * The feature id for the '<em><b>Visual Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__VISUAL_DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__USER_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__INSTRUCTIONS = 8;

	/**
	 * The feature id for the '<em><b>Development Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DEVELOPMENT_PROCESS = 9;

	/**
	 * The feature id for the '<em><b>Design Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DESIGN_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Design Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DESIGN_DECISION = 11;

	/**
	 * The feature id for the '<em><b>Design Trade Offs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DESIGN_TRADE_OFFS = 12;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__RESOURCES = 13;

	/**
	 * The feature id for the '<em><b>Human Oversight Preassessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT = 14;

	/**
	 * The feature id for the '<em><b>Planned Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PLANNED_MODIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Cybersecurity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__CYBERSECURITY = 16;

	/**
	 * The feature id for the '<em><b>Human Oversight Post Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT = 17;

	/**
	 * The feature id for the '<em><b>Update Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__UPDATE_REQUIREMENTS = 18;

	/**
	 * The feature id for the '<em><b>Predictable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PREDICTABLE_RISKS = 19;

	/**
	 * The feature id for the '<em><b>Performance Metrics Suitability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY = 20;

	/**
	 * The feature id for the '<em><b>Risk Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__RISK_MANAGEMENT = 21;

	/**
	 * The feature id for the '<em><b>Relevant Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__RELEVANT_CHANGES = 22;

	/**
	 * The feature id for the '<em><b>Harmonised Standards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HARMONISED_STANDARDS = 23;

	/**
	 * The feature id for the '<em><b>Copy EU Conformity Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Post Market Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__POST_MARKET_MONITORING = 25;

	/**
	 * The number of structural features of the '<em>AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM_FEATURE_COUNT = 26;

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
	int PROVIDER = 11;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.ListHarmonisedStandardsImpl <em>List Harmonised Standards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ListHarmonisedStandardsImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getListHarmonisedStandards()
	 * @generated
	 */
	int LIST_HARMONISED_STANDARDS = 12;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.ProvidesImpl <em>Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ProvidesImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProvides()
	 * @generated
	 */
	int PROVIDES = 13;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__BASE_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.CriticalInfrastructureImpl <em>Critical Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.CriticalInfrastructureImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCriticalInfrastructure()
	 * @generated
	 */
	int CRITICAL_INFRASTRUCTURE = 14;

	/**
	 * The feature id for the '<em><b>Digital Infrastructure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Road Traffic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC = 1;

	/**
	 * The feature id for the '<em><b>Water Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__WATER_SUPPLY = 2;

	/**
	 * The feature id for the '<em><b>Gas Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__GAS_SUPPLY = 3;

	/**
	 * The feature id for the '<em><b>Heat Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY = 4;

	/**
	 * The feature id for the '<em><b>Electricity Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY = 5;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK = 8;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK = 9;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION = 10;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__BASE_USE_CASE = 11;

	/**
	 * The number of structural features of the '<em>Critical Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Critical Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.MLModelImpl <em>ML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.MLModelImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getMLModel()
	 * @generated
	 */
	int ML_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Training Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__TRAINING_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__OBJECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Validation Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__VALIDATION_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__EXPECTED_OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Testing Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__TESTING_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__ACCURACY = 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__CAPABILITIES = 7;

	/**
	 * The feature id for the '<em><b>Test Reports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__TEST_REPORTS = 8;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__BASE_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Input Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL__INPUT_SPECIFICATION = 10;

	/**
	 * The number of structural features of the '<em>ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EducationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 16;

	/**
	 * The feature id for the '<em><b>Access Admission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__ACCESS_ADMISSION = 0;

	/**
	 * The feature id for the '<em><b>Learning Outcome Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__LEARNING_OUTCOME_EVALUATION = 1;

	/**
	 * The feature id for the '<em><b>Education Level Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EDUCATION_LEVEL_ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Exam Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EXAM_MONITORING = 3;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__NARROW_PROCEDURAL_TASK = 4;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__IMPROVES_HUMAN_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__DECISION_PATTERN_DETECTION = 6;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__PREPARATORY_TASK = 7;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EXCEPTION_JUSTIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__BASE_USE_CASE = 9;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.HumanEmploymentImpl <em>Human Employment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.HumanEmploymentImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getHumanEmployment()
	 * @generated
	 */
	int HUMAN_EMPLOYMENT = 17;

	/**
	 * The feature id for the '<em><b>Recruitment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__RECRUITMENT = 0;

	/**
	 * The feature id for the '<em><b>Work Conditions Decisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS = 1;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__DECISION_PATTERN_DETECTION = 2;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__IMPROVES_HUMAN_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__PREPARATORY_TASK = 4;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__NARROW_PROCEDURAL_TASK = 6;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__BASE_USE_CASE = 7;

	/**
	 * The number of structural features of the '<em>Human Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Human Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.TrainingDataImpl <em>Training Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.TrainingDataImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getTrainingData()
	 * @generated
	 */
	int TRAINING_DATA = 18;

	/**
	 * The feature id for the '<em><b>Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__CLEANING = 0;

	/**
	 * The feature id for the '<em><b>Labeling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__LABELING = 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA__BASE_ARTIFACT = 6;

	/**
	 * The number of structural features of the '<em>Training Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Training Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ThirdPartyComponentImpl <em>Third Party Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ThirdPartyComponentImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getThirdPartyComponent()
	 * @generated
	 */
	int THIRD_PARTY_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Integration Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT__INTEGRATION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT__BASE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Third Party Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Third Party Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EssentialServiceImpl <em>Essential Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EssentialServiceImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEssentialService()
	 * @generated
	 */
	int ESSENTIAL_SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Creditworthiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__CREDITWORTHINESS = 0;

	/**
	 * The feature id for the '<em><b>Public Benefits Eligibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Fraud Detection Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Insurance Risk Pricing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING = 3;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__PREPARATORY_TASK = 4;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK = 5;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION = 8;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__BASE_USE_CASE = 9;

	/**
	 * The number of structural features of the '<em>Essential Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Essential Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.LawEnforcementImpl <em>Law Enforcement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.LawEnforcementImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getLawEnforcement()
	 * @generated
	 */
	int LAW_ENFORCEMENT = 21;

	/**
	 * The feature id for the '<em><b>Victim Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Lie Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__LIE_DETECTION = 1;

	/**
	 * The feature id for the '<em><b>Evidence Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__EVIDENCE_RELIABILITY = 2;

	/**
	 * The feature id for the '<em><b>Offending Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT = 3;

	/**
	 * The feature id for the '<em><b>Solely Profiling Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__SOLELY_PROFILING_BASED = 4;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK = 5;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION = 7;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__PREPARATORY_TASK = 8;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__BASE_USE_CASE = 10;

	/**
	 * The number of structural features of the '<em>Law Enforcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Law Enforcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.MigrationBorderImpl <em>Migration Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.MigrationBorderImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getMigrationBorder()
	 * @generated
	 */
	int MIGRATION_BORDER = 22;

	/**
	 * The feature id for the '<em><b>Lie Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__LIE_DETECTION = 0;

	/**
	 * The feature id for the '<em><b>Entry Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT = 1;

	/**
	 * The feature id for the '<em><b>Asylum Visa Residence Permits Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Travel Document Verification Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Person Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__PERSON_IDENTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__NARROW_PROCEDURAL_TASK = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__PREPARATORY_TASK = 8;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__DECISION_PATTERN_DETECTION = 9;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__BASE_USE_CASE = 10;

	/**
	 * The number of structural features of the '<em>Migration Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Migration Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl <em>Justice Democracy Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.JusticeDemocracyUseCaseImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getJusticeDemocracyUseCase()
	 * @generated
	 */
	int JUSTICE_DEMOCRACY_USE_CASE = 23;

	/**
	 * The feature id for the '<em><b>Judicial Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT = 0;

	/**
	 * The feature id for the '<em><b>Election Influence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE = 1;

	/**
	 * The feature id for the '<em><b>No Direct Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE = 2;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION = 3;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK = 5;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE = 8;

	/**
	 * The number of structural features of the '<em>Justice Democracy Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Justice Democracy Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTICE_DEMOCRACY_USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricIdentificationImpl <em>Biometric Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricIdentificationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricIdentification()
	 * @generated
	 */
	int BIOMETRIC_IDENTIFICATION = 24;

	/**
	 * The feature id for the '<em><b>Verification Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__REAL_TIME = 1;

	/**
	 * The feature id for the '<em><b>Publicly Accessible Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE = 2;

	/**
	 * The feature id for the '<em><b>Law Enforcement Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE = 3;

	/**
	 * The feature id for the '<em><b>Victim Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH = 4;

	/**
	 * The feature id for the '<em><b>Imminent Threat Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION = 5;

	/**
	 * The feature id for the '<em><b>Serious Crime Suspect Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH = 6;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__NARROW_PROCEDURAL_TASK = 7;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__IMPROVES_HUMAN_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__DECISION_PATTERN_DETECTION = 9;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__PREPARATORY_TASK = 10;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = 12;

	/**
	 * The number of structural features of the '<em>Biometric Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Biometric Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricCategorisationImpl <em>Biometric Categorisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricCategorisationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricCategorisation()
	 * @generated
	 */
	int BIOMETRIC_CATEGORISATION = 25;

	/**
	 * The feature id for the '<em><b>Deduce Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DEDUCE_RACE = 0;

	/**
	 * The feature id for the '<em><b>Deduce Political Opinion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION = 1;

	/**
	 * The feature id for the '<em><b>Deduce Religious Belief</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF = 2;

	/**
	 * The feature id for the '<em><b>Deduce Union Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP = 3;

	/**
	 * The feature id for the '<em><b>Deduce Sexuality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY = 4;

	/**
	 * The feature id for the '<em><b>Lawful Dataset Labeling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING = 5;

	/**
	 * The feature id for the '<em><b>Law Enforcement Categorisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION = 6;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK = 7;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION = 9;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__PREPARATORY_TASK = 10;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__BASE_USE_CASE = 12;

	/**
	 * The number of structural features of the '<em>Biometric Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Biometric Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EmotionRecognitionImpl <em>Emotion Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EmotionRecognitionImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEmotionRecognition()
	 * @generated
	 */
	int EMOTION_RECOGNITION = 26;

	/**
	 * The feature id for the '<em><b>Education</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__EDUCATION = 0;

	/**
	 * The feature id for the '<em><b>Workplace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__WORKPLACE = 1;

	/**
	 * The feature id for the '<em><b>Medical Or Safety Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON = 2;

	/**
	 * The feature id for the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__NARROW_PROCEDURAL_TASK = 3;

	/**
	 * The feature id for the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__IMPROVES_HUMAN_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__DECISION_PATTERN_DETECTION = 5;

	/**
	 * The feature id for the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__PREPARATORY_TASK = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__BASE_USE_CASE = 8;

	/**
	 * The number of structural features of the '<em>Emotion Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Emotion Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.Category
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 27;

	/**
	 * The meta object id for the '{@link euaiactcompliance.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.Role
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 28;


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
	 * Returns the meta object for class '{@link euaiactcompliance.ProductEmbedding <em>Product Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Embedding</em>'.
	 * @see euaiactcompliance.ProductEmbedding
	 * @generated
	 */
	EClass getProductEmbedding();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ProductEmbedding#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.ProductEmbedding#getBase_Component()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EReference getProductEmbedding_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ProductEmbedding#isFailureEndangerSafety <em>Failure Endanger Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Endanger Safety</em>'.
	 * @see euaiactcompliance.ProductEmbedding#isFailureEndangerSafety()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EAttribute getProductEmbedding_FailureEndangerSafety();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ProductEmbedding#getThirdPartyConformityAssessment <em>Third Party Conformity Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Conformity Assessment</em>'.
	 * @see euaiactcompliance.ProductEmbedding#getThirdPartyConformityAssessment()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EAttribute getProductEmbedding_ThirdPartyConformityAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ProductEmbedding#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Category</em>'.
	 * @see euaiactcompliance.ProductEmbedding#getProductCategory()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EAttribute getProductEmbedding_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ProductEmbedding#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see euaiactcompliance.ProductEmbedding#getRole()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EAttribute getProductEmbedding_Role();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ManipulativeBehaviour#isSubliminalTechniques <em>Subliminal Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subliminal Techniques</em>'.
	 * @see euaiactcompliance.ManipulativeBehaviour#isSubliminalTechniques()
	 * @see #getManipulativeBehaviour()
	 * @generated
	 */
	EAttribute getManipulativeBehaviour_SubliminalTechniques();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ManipulativeBehaviour#isDeceptiveTechniques <em>Deceptive Techniques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deceptive Techniques</em>'.
	 * @see euaiactcompliance.ManipulativeBehaviour#isDeceptiveTechniques()
	 * @see #getManipulativeBehaviour()
	 * @generated
	 */
	EAttribute getManipulativeBehaviour_DeceptiveTechniques();

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
	 * Returns the meta object for class '{@link euaiactcompliance.ExploitingHumanVulnerability <em>Exploiting Human Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploiting Human Vulnerability</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability
	 * @generated
	 */
	EClass getExploitingHumanVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingHumanVulnerability#isAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability#isAge()
	 * @see #getExploitingHumanVulnerability()
	 * @generated
	 */
	EAttribute getExploitingHumanVulnerability_Age();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingHumanVulnerability#isDisability <em>Disability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability#isDisability()
	 * @see #getExploitingHumanVulnerability()
	 * @generated
	 */
	EAttribute getExploitingHumanVulnerability_Disability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingHumanVulnerability#isSocial <em>Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability#isSocial()
	 * @see #getExploitingHumanVulnerability()
	 * @generated
	 */
	EAttribute getExploitingHumanVulnerability_Social();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ExploitingHumanVulnerability#isEconomic <em>Economic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Economic</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability#isEconomic()
	 * @see #getExploitingHumanVulnerability()
	 * @generated
	 */
	EAttribute getExploitingHumanVulnerability_Economic();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ExploitingHumanVulnerability#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.ExploitingHumanVulnerability#getBase_UseCase()
	 * @see #getExploitingHumanVulnerability()
	 * @generated
	 */
	EReference getExploitingHumanVulnerability_Base_UseCase();

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
	 * Returns the meta object for class '{@link euaiactcompliance.FacialImageScraping <em>Facial Image Scraping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facial Image Scraping</em>'.
	 * @see euaiactcompliance.FacialImageScraping
	 * @generated
	 */
	EClass getFacialImageScraping();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.FacialImageScraping#isInternet <em>Internet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internet</em>'.
	 * @see euaiactcompliance.FacialImageScraping#isInternet()
	 * @see #getFacialImageScraping()
	 * @generated
	 */
	EAttribute getFacialImageScraping_Internet();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.FacialImageScraping#isCCTV <em>CCTV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCTV</em>'.
	 * @see euaiactcompliance.FacialImageScraping#isCCTV()
	 * @see #getFacialImageScraping()
	 * @generated
	 */
	EAttribute getFacialImageScraping_CCTV();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.FacialImageScraping#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.FacialImageScraping#getBase_UseCase()
	 * @see #getFacialImageScraping()
	 * @generated
	 */
	EReference getFacialImageScraping_Base_UseCase();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see euaiactcompliance.AISystem#getPurpose()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see euaiactcompliance.AISystem#getVersion()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getExternalInteraction <em>External Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Interaction</em>'.
	 * @see euaiactcompliance.AISystem#getExternalInteraction()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_ExternalInteraction();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getMarketPlacementForm <em>Market Placement Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Market Placement Form</em>'.
	 * @see euaiactcompliance.AISystem#getMarketPlacementForm()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_MarketPlacementForm();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see euaiactcompliance.AISystem#getHardware()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Hardware();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#isVisualDocumentation <em>Visual Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Documentation</em>'.
	 * @see euaiactcompliance.AISystem#isVisualDocumentation()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_VisualDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interface</em>'.
	 * @see euaiactcompliance.AISystem#getUserInterface()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_UserInterface();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see euaiactcompliance.AISystem#getInstructions()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDevelopmentProcess <em>Development Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Process</em>'.
	 * @see euaiactcompliance.AISystem#getDevelopmentProcess()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DevelopmentProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDesignSpecification <em>Design Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Specification</em>'.
	 * @see euaiactcompliance.AISystem#getDesignSpecification()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DesignSpecification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDesignDecision <em>Design Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Decision</em>'.
	 * @see euaiactcompliance.AISystem#getDesignDecision()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DesignDecision();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDesignTradeOffs <em>Design Trade Offs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Trade Offs</em>'.
	 * @see euaiactcompliance.AISystem#getDesignTradeOffs()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DesignTradeOffs();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources</em>'.
	 * @see euaiactcompliance.AISystem#getResources()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Resources();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHumanOversightPreassessment <em>Human Oversight Preassessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Preassessment</em>'.
	 * @see euaiactcompliance.AISystem#getHumanOversightPreassessment()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HumanOversightPreassessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPlannedModification <em>Planned Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planned Modification</em>'.
	 * @see euaiactcompliance.AISystem#getPlannedModification()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PlannedModification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getCybersecurity <em>Cybersecurity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cybersecurity</em>'.
	 * @see euaiactcompliance.AISystem#getCybersecurity()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_Cybersecurity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Post Assessment</em>'.
	 * @see euaiactcompliance.AISystem#getHumanOversightPostAssessment()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HumanOversightPostAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getUpdateRequirements <em>Update Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Requirements</em>'.
	 * @see euaiactcompliance.AISystem#getUpdateRequirements()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_UpdateRequirements();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPredictableRisks <em>Predictable Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predictable Risks</em>'.
	 * @see euaiactcompliance.AISystem#getPredictableRisks()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PredictableRisks();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPerformanceMetricsSuitability <em>Performance Metrics Suitability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Metrics Suitability</em>'.
	 * @see euaiactcompliance.AISystem#getPerformanceMetricsSuitability()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PerformanceMetricsSuitability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getRiskManagement <em>Risk Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Management</em>'.
	 * @see euaiactcompliance.AISystem#getRiskManagement()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_RiskManagement();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getRelevantChanges <em>Relevant Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevant Changes</em>'.
	 * @see euaiactcompliance.AISystem#getRelevantChanges()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_RelevantChanges();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHarmonisedStandards <em>Harmonised Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Harmonised Standards</em>'.
	 * @see euaiactcompliance.AISystem#getHarmonisedStandards()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HarmonisedStandards();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy EU Conformity Declaration</em>'.
	 * @see euaiactcompliance.AISystem#isCopyEUConformityDeclaration()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_CopyEUConformityDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPostMarketMonitoring <em>Post Market Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Market Monitoring</em>'.
	 * @see euaiactcompliance.AISystem#getPostMarketMonitoring()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PostMarketMonitoring();

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
	 * Returns the meta object for class '{@link euaiactcompliance.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides</em>'.
	 * @see euaiactcompliance.Provides
	 * @generated
	 */
	EClass getProvides();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Provides#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see euaiactcompliance.Provides#getBase_Association()
	 * @see #getProvides()
	 * @generated
	 */
	EReference getProvides_Base_Association();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.CriticalInfrastructure <em>Critical Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Infrastructure</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure
	 * @generated
	 */
	EClass getCriticalInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isDigitalInfrastructure <em>Digital Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digital Infrastructure</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isDigitalInfrastructure()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_DigitalInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isRoadTraffic <em>Road Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Traffic</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isRoadTraffic()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_RoadTraffic();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isWaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Supply</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isWaterSupply()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_WaterSupply();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isGasSupply <em>Gas Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gas Supply</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isGasSupply()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_GasSupply();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isHeatSupply <em>Heat Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Supply</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isHeatSupply()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_HeatSupply();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isElectricitySupply <em>Electricity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electricity Supply</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isElectricitySupply()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_ElectricitySupply();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#getExceptionJustification()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_ExceptionJustification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isImprovesHumanActivity()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isNarrowProceduralTask()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isPreparatoryTask()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.CriticalInfrastructure#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#isDecisionPatternDetection()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_DecisionPatternDetection();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.CriticalInfrastructure#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#getBase_UseCase()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EReference getCriticalInfrastructure_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.MLModel <em>ML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Model</em>'.
	 * @see euaiactcompliance.MLModel
	 * @generated
	 */
	EClass getMLModel();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see euaiactcompliance.MLModel#getParameter()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getTrainingMethods <em>Training Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Methods</em>'.
	 * @see euaiactcompliance.MLModel#getTrainingMethods()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_TrainingMethods();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see euaiactcompliance.MLModel#getObjective()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_Objective();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getValidationProcess <em>Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Process</em>'.
	 * @see euaiactcompliance.MLModel#getValidationProcess()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_ValidationProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Output</em>'.
	 * @see euaiactcompliance.MLModel#getExpectedOutput()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_ExpectedOutput();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getTestingProcess <em>Testing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Process</em>'.
	 * @see euaiactcompliance.MLModel#getTestingProcess()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_TestingProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see euaiactcompliance.MLModel#getAccuracy()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabilities</em>'.
	 * @see euaiactcompliance.MLModel#getCapabilities()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#isTestReports <em>Test Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Reports</em>'.
	 * @see euaiactcompliance.MLModel#isTestReports()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_TestReports();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.MLModel#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.MLModel#getBase_Component()
	 * @see #getMLModel()
	 * @generated
	 */
	EReference getMLModel_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MLModel#getInputSpecification <em>Input Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Specification</em>'.
	 * @see euaiactcompliance.MLModel#getInputSpecification()
	 * @see #getMLModel()
	 * @generated
	 */
	EAttribute getMLModel_InputSpecification();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education</em>'.
	 * @see euaiactcompliance.Education
	 * @generated
	 */
	EClass getEducation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isAccessAdmission <em>Access Admission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Admission</em>'.
	 * @see euaiactcompliance.Education#isAccessAdmission()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_AccessAdmission();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isLearningOutcomeEvaluation <em>Learning Outcome Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learning Outcome Evaluation</em>'.
	 * @see euaiactcompliance.Education#isLearningOutcomeEvaluation()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_LearningOutcomeEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isEducationLevelAssessment <em>Education Level Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level Assessment</em>'.
	 * @see euaiactcompliance.Education#isEducationLevelAssessment()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_EducationLevelAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isExamMonitoring <em>Exam Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam Monitoring</em>'.
	 * @see euaiactcompliance.Education#isExamMonitoring()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_ExamMonitoring();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.Education#isNarrowProceduralTask()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.Education#isImprovesHumanActivity()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.Education#isDecisionPatternDetection()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.Education#isPreparatoryTask()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.Education#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.Education#getExceptionJustification()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_ExceptionJustification();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.Education#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.Education#getBase_UseCase()
	 * @see #getEducation()
	 * @generated
	 */
	EReference getEducation_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.HumanEmployment <em>Human Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Employment</em>'.
	 * @see euaiactcompliance.HumanEmployment
	 * @generated
	 */
	EClass getHumanEmployment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isRecruitment <em>Recruitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recruitment</em>'.
	 * @see euaiactcompliance.HumanEmployment#isRecruitment()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_Recruitment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isWorkConditionsDecisions <em>Work Conditions Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Conditions Decisions</em>'.
	 * @see euaiactcompliance.HumanEmployment#isWorkConditionsDecisions()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_WorkConditionsDecisions();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.HumanEmployment#isDecisionPatternDetection()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.HumanEmployment#isImprovesHumanActivity()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.HumanEmployment#isPreparatoryTask()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.HumanEmployment#getExceptionJustification()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_ExceptionJustification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.HumanEmployment#isNarrowProceduralTask()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_NarrowProceduralTask();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.HumanEmployment#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.HumanEmployment#getBase_UseCase()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EReference getHumanEmployment_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.TrainingData <em>Training Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Data</em>'.
	 * @see euaiactcompliance.TrainingData
	 * @generated
	 */
	EClass getTrainingData();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getCleaning <em>Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleaning</em>'.
	 * @see euaiactcompliance.TrainingData#getCleaning()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Cleaning();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getLabeling <em>Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labeling</em>'.
	 * @see euaiactcompliance.TrainingData#getLabeling()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Labeling();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see euaiactcompliance.TrainingData#getSelection()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Selection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see euaiactcompliance.TrainingData#getDescription()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Description();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see euaiactcompliance.TrainingData#getOrigin()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Origin();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.TrainingData#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see euaiactcompliance.TrainingData#getScope()
	 * @see #getTrainingData()
	 * @generated
	 */
	EAttribute getTrainingData_Scope();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.TrainingData#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.TrainingData#getBase_Artifact()
	 * @see #getTrainingData()
	 * @generated
	 */
	EReference getTrainingData_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.ThirdPartyComponent <em>Third Party Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party Component</em>'.
	 * @see euaiactcompliance.ThirdPartyComponent
	 * @generated
	 */
	EClass getThirdPartyComponent();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ThirdPartyComponent#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see euaiactcompliance.ThirdPartyComponent#getOrigin()
	 * @see #getThirdPartyComponent()
	 * @generated
	 */
	EAttribute getThirdPartyComponent_Origin();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ThirdPartyComponent#getIntegrationDescription <em>Integration Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integration Description</em>'.
	 * @see euaiactcompliance.ThirdPartyComponent#getIntegrationDescription()
	 * @see #getThirdPartyComponent()
	 * @generated
	 */
	EAttribute getThirdPartyComponent_IntegrationDescription();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.ThirdPartyComponent#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.ThirdPartyComponent#getBase_Component()
	 * @see #getThirdPartyComponent()
	 * @generated
	 */
	EReference getThirdPartyComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.EssentialService <em>Essential Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Essential Service</em>'.
	 * @see euaiactcompliance.EssentialService
	 * @generated
	 */
	EClass getEssentialService();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isCreditworthiness <em>Creditworthiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creditworthiness</em>'.
	 * @see euaiactcompliance.EssentialService#isCreditworthiness()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_Creditworthiness();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isPublicBenefitsEligibility <em>Public Benefits Eligibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Benefits Eligibility</em>'.
	 * @see euaiactcompliance.EssentialService#isPublicBenefitsEligibility()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_PublicBenefitsEligibility();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isFraudDetectionOnly <em>Fraud Detection Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraud Detection Only</em>'.
	 * @see euaiactcompliance.EssentialService#isFraudDetectionOnly()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_FraudDetectionOnly();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isInsuranceRiskPricing <em>Insurance Risk Pricing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance Risk Pricing</em>'.
	 * @see euaiactcompliance.EssentialService#isInsuranceRiskPricing()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_InsuranceRiskPricing();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.EssentialService#isPreparatoryTask()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.EssentialService#isNarrowProceduralTask()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.EssentialService#getExceptionJustification()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_ExceptionJustification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.EssentialService#isImprovesHumanActivity()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.EssentialService#isDecisionPatternDetection()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_DecisionPatternDetection();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.EssentialService#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.EssentialService#getBase_UseCase()
	 * @see #getEssentialService()
	 * @generated
	 */
	EReference getEssentialService_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.LawEnforcement <em>Law Enforcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Law Enforcement</em>'.
	 * @see euaiactcompliance.LawEnforcement
	 * @generated
	 */
	EClass getLawEnforcement();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isVictimRiskAssessment <em>Victim Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Risk Assessment</em>'.
	 * @see euaiactcompliance.LawEnforcement#isVictimRiskAssessment()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_VictimRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isLieDetection <em>Lie Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lie Detection</em>'.
	 * @see euaiactcompliance.LawEnforcement#isLieDetection()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_LieDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isEvidenceReliability <em>Evidence Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evidence Reliability</em>'.
	 * @see euaiactcompliance.LawEnforcement#isEvidenceReliability()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_EvidenceReliability();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isOffendingRiskAssessment <em>Offending Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offending Risk Assessment</em>'.
	 * @see euaiactcompliance.LawEnforcement#isOffendingRiskAssessment()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_OffendingRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isSolelyProfilingBased <em>Solely Profiling Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solely Profiling Based</em>'.
	 * @see euaiactcompliance.LawEnforcement#isSolelyProfilingBased()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_SolelyProfilingBased();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.LawEnforcement#isNarrowProceduralTask()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.LawEnforcement#getExceptionJustification()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_ExceptionJustification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.LawEnforcement#isDecisionPatternDetection()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.LawEnforcement#isPreparatoryTask()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.LawEnforcement#isImprovesHumanActivity()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.LawEnforcement#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.LawEnforcement#getBase_UseCase()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EReference getLawEnforcement_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.MigrationBorder <em>Migration Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Border</em>'.
	 * @see euaiactcompliance.MigrationBorder
	 * @generated
	 */
	EClass getMigrationBorder();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isLieDetection <em>Lie Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lie Detection</em>'.
	 * @see euaiactcompliance.MigrationBorder#isLieDetection()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_LieDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isEntryRiskAssessment <em>Entry Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Risk Assessment</em>'.
	 * @see euaiactcompliance.MigrationBorder#isEntryRiskAssessment()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_EntryRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isAsylumVisaResidencePermitsApplication <em>Asylum Visa Residence Permits Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asylum Visa Residence Permits Application</em>'.
	 * @see euaiactcompliance.MigrationBorder#isAsylumVisaResidencePermitsApplication()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_AsylumVisaResidencePermitsApplication();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isTravelDocumentVerificationOnly <em>Travel Document Verification Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Document Verification Only</em>'.
	 * @see euaiactcompliance.MigrationBorder#isTravelDocumentVerificationOnly()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_TravelDocumentVerificationOnly();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isPersonIdentification <em>Person Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Identification</em>'.
	 * @see euaiactcompliance.MigrationBorder#isPersonIdentification()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_PersonIdentification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.MigrationBorder#isImprovesHumanActivity()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.MigrationBorder#isNarrowProceduralTask()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.MigrationBorder#getExceptionJustification()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_ExceptionJustification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.MigrationBorder#isPreparatoryTask()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.MigrationBorder#isDecisionPatternDetection()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_DecisionPatternDetection();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.MigrationBorder#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.MigrationBorder#getBase_UseCase()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EReference getMigrationBorder_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.JusticeDemocracyUseCase <em>Justice Democracy Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justice Democracy Use Case</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase
	 * @generated
	 */
	EClass getJusticeDemocracyUseCase();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isJudicialSupport <em>Judicial Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Judicial Support</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isJudicialSupport()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_JudicialSupport();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isElectionInfluence <em>Election Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Election Influence</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isElectionInfluence()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_ElectionInfluence();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isNoDirectExposure <em>No Direct Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Direct Exposure</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isNoDirectExposure()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_NoDirectExposure();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isDecisionPatternDetection()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isImprovesHumanActivity()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isPreparatoryTask()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#isNarrowProceduralTask()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.JusticeDemocracyUseCase#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#getExceptionJustification()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EAttribute getJusticeDemocracyUseCase_ExceptionJustification();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.JusticeDemocracyUseCase#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.JusticeDemocracyUseCase#getBase_UseCase()
	 * @see #getJusticeDemocracyUseCase()
	 * @generated
	 */
	EReference getJusticeDemocracyUseCase_Base_UseCase();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isVerificationOnly <em>Verification Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Only</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isVerificationOnly()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_VerificationOnly();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isRealTime <em>Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Time</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isRealTime()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_RealTime();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isPubliclyAccessibleSpace <em>Publicly Accessible Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publicly Accessible Space</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isPubliclyAccessibleSpace()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_PubliclyAccessibleSpace();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isLawEnforcementPurpose <em>Law Enforcement Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law Enforcement Purpose</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isLawEnforcementPurpose()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_LawEnforcementPurpose();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isImminentThreatPrevention <em>Imminent Threat Prevention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imminent Threat Prevention</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isImminentThreatPrevention()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_ImminentThreatPrevention();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isSeriousCrimeSuspectSearch <em>Serious Crime Suspect Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serious Crime Suspect Search</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isSeriousCrimeSuspectSearch()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_SeriousCrimeSuspectSearch();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isNarrowProceduralTask()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isImprovesHumanActivity()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isDecisionPatternDetection()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.BiometricIdentification#isPreparatoryTask()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricIdentification#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.BiometricIdentification#getExceptionJustification()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_ExceptionJustification();

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
	 * Returns the meta object for class '{@link euaiactcompliance.BiometricCategorisation <em>Biometric Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biometric Categorisation</em>'.
	 * @see euaiactcompliance.BiometricCategorisation
	 * @generated
	 */
	EClass getBiometricCategorisation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDeduceRace <em>Deduce Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduce Race</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDeduceRace()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DeduceRace();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDeducePoliticalOpinion <em>Deduce Political Opinion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduce Political Opinion</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDeducePoliticalOpinion()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DeducePoliticalOpinion();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDeduceReligiousBelief <em>Deduce Religious Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduce Religious Belief</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDeduceReligiousBelief()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DeduceReligiousBelief();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDeduceUnionMembership <em>Deduce Union Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduce Union Membership</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDeduceUnionMembership()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DeduceUnionMembership();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDeduceSexuality <em>Deduce Sexuality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduce Sexuality</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDeduceSexuality()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DeduceSexuality();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isLawfulDatasetLabeling <em>Lawful Dataset Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lawful Dataset Labeling</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isLawfulDatasetLabeling()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_LawfulDatasetLabeling();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isLawEnforcementCategorisation <em>Law Enforcement Categorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law Enforcement Categorisation</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isLawEnforcementCategorisation()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_LawEnforcementCategorisation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isNarrowProceduralTask()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isImprovesHumanActivity()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isDecisionPatternDetection()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#isPreparatoryTask()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.BiometricCategorisation#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#getExceptionJustification()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_ExceptionJustification();

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
	 * Returns the meta object for class '{@link euaiactcompliance.EmotionRecognition <em>Emotion Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion Recognition</em>'.
	 * @see euaiactcompliance.EmotionRecognition
	 * @generated
	 */
	EClass getEmotionRecognition();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isEducation <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isEducation()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Education();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isWorkplace <em>Workplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workplace</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isWorkplace()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Workplace();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isMedicalOrSafetyReason <em>Medical Or Safety Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical Or Safety Reason</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isMedicalOrSafetyReason()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_MedicalOrSafetyReason();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isNarrowProceduralTask <em>Narrow Procedural Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Narrow Procedural Task</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isNarrowProceduralTask()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_NarrowProceduralTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isImprovesHumanActivity <em>Improves Human Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Improves Human Activity</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isImprovesHumanActivity()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_ImprovesHumanActivity();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isDecisionPatternDetection <em>Decision Pattern Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Pattern Detection</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isDecisionPatternDetection()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_DecisionPatternDetection();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#isPreparatoryTask <em>Preparatory Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparatory Task</em>'.
	 * @see euaiactcompliance.EmotionRecognition#isPreparatoryTask()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_PreparatoryTask();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EmotionRecognition#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.EmotionRecognition#getExceptionJustification()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_ExceptionJustification();

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
	 * Returns the meta object for enum '{@link euaiactcompliance.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see euaiactcompliance.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link euaiactcompliance.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see euaiactcompliance.Role
	 * @generated
	 */
	EEnum getRole();

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
		 * The meta object literal for the '{@link euaiactcompliance.impl.ProductEmbeddingImpl <em>Product Embedding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ProductEmbeddingImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProductEmbedding()
		 * @generated
		 */
		EClass PRODUCT_EMBEDDING = eINSTANCE.getProductEmbedding();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_EMBEDDING__BASE_COMPONENT = eINSTANCE.getProductEmbedding_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Failure Endanger Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY = eINSTANCE.getProductEmbedding_FailureEndangerSafety();

		/**
		 * The meta object literal for the '<em><b>Third Party Conformity Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT = eINSTANCE.getProductEmbedding_ThirdPartyConformityAssessment();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_EMBEDDING__PRODUCT_CATEGORY = eINSTANCE.getProductEmbedding_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_EMBEDDING__ROLE = eINSTANCE.getProductEmbedding_Role();

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
		 * The meta object literal for the '<em><b>Subliminal Techniques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES = eINSTANCE.getManipulativeBehaviour_SubliminalTechniques();

		/**
		 * The meta object literal for the '<em><b>Deceptive Techniques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES = eINSTANCE.getManipulativeBehaviour_DeceptiveTechniques();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE = eINSTANCE.getManipulativeBehaviour_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ExploitingHumanVulnerabilityImpl <em>Exploiting Human Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ExploitingHumanVulnerabilityImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getExploitingHumanVulnerability()
		 * @generated
		 */
		EClass EXPLOITING_HUMAN_VULNERABILITY = eINSTANCE.getExploitingHumanVulnerability();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_HUMAN_VULNERABILITY__AGE = eINSTANCE.getExploitingHumanVulnerability_Age();

		/**
		 * The meta object literal for the '<em><b>Disability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_HUMAN_VULNERABILITY__DISABILITY = eINSTANCE.getExploitingHumanVulnerability_Disability();

		/**
		 * The meta object literal for the '<em><b>Social</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_HUMAN_VULNERABILITY__SOCIAL = eINSTANCE.getExploitingHumanVulnerability_Social();

		/**
		 * The meta object literal for the '<em><b>Economic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOITING_HUMAN_VULNERABILITY__ECONOMIC = eINSTANCE.getExploitingHumanVulnerability_Economic();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLOITING_HUMAN_VULNERABILITY__BASE_USE_CASE = eINSTANCE.getExploitingHumanVulnerability_Base_UseCase();

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
		 * The meta object literal for the '{@link euaiactcompliance.impl.FacialImageScrapingImpl <em>Facial Image Scraping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.FacialImageScrapingImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getFacialImageScraping()
		 * @generated
		 */
		EClass FACIAL_IMAGE_SCRAPING = eINSTANCE.getFacialImageScraping();

		/**
		 * The meta object literal for the '<em><b>Internet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACIAL_IMAGE_SCRAPING__INTERNET = eINSTANCE.getFacialImageScraping_Internet();

		/**
		 * The meta object literal for the '<em><b>CCTV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACIAL_IMAGE_SCRAPING__CCTV = eINSTANCE.getFacialImageScraping_CCTV();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACIAL_IMAGE_SCRAPING__BASE_USE_CASE = eINSTANCE.getFacialImageScraping_Base_UseCase();

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
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PURPOSE = eINSTANCE.getAISystem_Purpose();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__VERSION = eINSTANCE.getAISystem_Version();

		/**
		 * The meta object literal for the '<em><b>External Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__EXTERNAL_INTERACTION = eINSTANCE.getAISystem_ExternalInteraction();

		/**
		 * The meta object literal for the '<em><b>Market Placement Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__MARKET_PLACEMENT_FORM = eINSTANCE.getAISystem_MarketPlacementForm();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HARDWARE = eINSTANCE.getAISystem_Hardware();

		/**
		 * The meta object literal for the '<em><b>Visual Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__VISUAL_DOCUMENTATION = eINSTANCE.getAISystem_VisualDocumentation();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__USER_INTERFACE = eINSTANCE.getAISystem_UserInterface();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__INSTRUCTIONS = eINSTANCE.getAISystem_Instructions();

		/**
		 * The meta object literal for the '<em><b>Development Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DEVELOPMENT_PROCESS = eINSTANCE.getAISystem_DevelopmentProcess();

		/**
		 * The meta object literal for the '<em><b>Design Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DESIGN_SPECIFICATION = eINSTANCE.getAISystem_DesignSpecification();

		/**
		 * The meta object literal for the '<em><b>Design Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DESIGN_DECISION = eINSTANCE.getAISystem_DesignDecision();

		/**
		 * The meta object literal for the '<em><b>Design Trade Offs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DESIGN_TRADE_OFFS = eINSTANCE.getAISystem_DesignTradeOffs();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__RESOURCES = eINSTANCE.getAISystem_Resources();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Preassessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT = eINSTANCE.getAISystem_HumanOversightPreassessment();

		/**
		 * The meta object literal for the '<em><b>Planned Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PLANNED_MODIFICATION = eINSTANCE.getAISystem_PlannedModification();

		/**
		 * The meta object literal for the '<em><b>Cybersecurity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__CYBERSECURITY = eINSTANCE.getAISystem_Cybersecurity();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Post Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT = eINSTANCE.getAISystem_HumanOversightPostAssessment();

		/**
		 * The meta object literal for the '<em><b>Update Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__UPDATE_REQUIREMENTS = eINSTANCE.getAISystem_UpdateRequirements();

		/**
		 * The meta object literal for the '<em><b>Predictable Risks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PREDICTABLE_RISKS = eINSTANCE.getAISystem_PredictableRisks();

		/**
		 * The meta object literal for the '<em><b>Performance Metrics Suitability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY = eINSTANCE.getAISystem_PerformanceMetricsSuitability();

		/**
		 * The meta object literal for the '<em><b>Risk Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__RISK_MANAGEMENT = eINSTANCE.getAISystem_RiskManagement();

		/**
		 * The meta object literal for the '<em><b>Relevant Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__RELEVANT_CHANGES = eINSTANCE.getAISystem_RelevantChanges();

		/**
		 * The meta object literal for the '<em><b>Harmonised Standards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HARMONISED_STANDARDS = eINSTANCE.getAISystem_HarmonisedStandards();

		/**
		 * The meta object literal for the '<em><b>Copy EU Conformity Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION = eINSTANCE.getAISystem_CopyEUConformityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Post Market Monitoring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__POST_MARKET_MONITORING = eINSTANCE.getAISystem_PostMarketMonitoring();

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
		 * The meta object literal for the '{@link euaiactcompliance.impl.ProvidesImpl <em>Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ProvidesImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProvides()
		 * @generated
		 */
		EClass PROVIDES = eINSTANCE.getProvides();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES__BASE_ASSOCIATION = eINSTANCE.getProvides_Base_Association();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.CriticalInfrastructureImpl <em>Critical Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.CriticalInfrastructureImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCriticalInfrastructure()
		 * @generated
		 */
		EClass CRITICAL_INFRASTRUCTURE = eINSTANCE.getCriticalInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Digital Infrastructure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE = eINSTANCE.getCriticalInfrastructure_DigitalInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Road Traffic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC = eINSTANCE.getCriticalInfrastructure_RoadTraffic();

		/**
		 * The meta object literal for the '<em><b>Water Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__WATER_SUPPLY = eINSTANCE.getCriticalInfrastructure_WaterSupply();

		/**
		 * The meta object literal for the '<em><b>Gas Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__GAS_SUPPLY = eINSTANCE.getCriticalInfrastructure_GasSupply();

		/**
		 * The meta object literal for the '<em><b>Heat Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY = eINSTANCE.getCriticalInfrastructure_HeatSupply();

		/**
		 * The meta object literal for the '<em><b>Electricity Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY = eINSTANCE.getCriticalInfrastructure_ElectricitySupply();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION = eINSTANCE.getCriticalInfrastructure_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getCriticalInfrastructure_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK = eINSTANCE.getCriticalInfrastructure_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK = eINSTANCE.getCriticalInfrastructure_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION = eINSTANCE.getCriticalInfrastructure_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITICAL_INFRASTRUCTURE__BASE_USE_CASE = eINSTANCE.getCriticalInfrastructure_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.MLModelImpl <em>ML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.MLModelImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getMLModel()
		 * @generated
		 */
		EClass ML_MODEL = eINSTANCE.getMLModel();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__PARAMETER = eINSTANCE.getMLModel_Parameter();

		/**
		 * The meta object literal for the '<em><b>Training Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__TRAINING_METHODS = eINSTANCE.getMLModel_TrainingMethods();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__OBJECTIVE = eINSTANCE.getMLModel_Objective();

		/**
		 * The meta object literal for the '<em><b>Validation Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__VALIDATION_PROCESS = eINSTANCE.getMLModel_ValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Expected Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__EXPECTED_OUTPUT = eINSTANCE.getMLModel_ExpectedOutput();

		/**
		 * The meta object literal for the '<em><b>Testing Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__TESTING_PROCESS = eINSTANCE.getMLModel_TestingProcess();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__ACCURACY = eINSTANCE.getMLModel_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__CAPABILITIES = eINSTANCE.getMLModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Test Reports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__TEST_REPORTS = eINSTANCE.getMLModel_TestReports();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_MODEL__BASE_COMPONENT = eINSTANCE.getMLModel_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Input Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_MODEL__INPUT_SPECIFICATION = eINSTANCE.getMLModel_InputSpecification();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.EducationImpl <em>Education</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.EducationImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEducation()
		 * @generated
		 */
		EClass EDUCATION = eINSTANCE.getEducation();

		/**
		 * The meta object literal for the '<em><b>Access Admission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__ACCESS_ADMISSION = eINSTANCE.getEducation_AccessAdmission();

		/**
		 * The meta object literal for the '<em><b>Learning Outcome Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__LEARNING_OUTCOME_EVALUATION = eINSTANCE.getEducation_LearningOutcomeEvaluation();

		/**
		 * The meta object literal for the '<em><b>Education Level Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__EDUCATION_LEVEL_ASSESSMENT = eINSTANCE.getEducation_EducationLevelAssessment();

		/**
		 * The meta object literal for the '<em><b>Exam Monitoring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__EXAM_MONITORING = eINSTANCE.getEducation_ExamMonitoring();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__NARROW_PROCEDURAL_TASK = eINSTANCE.getEducation_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getEducation_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__DECISION_PATTERN_DETECTION = eINSTANCE.getEducation_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__PREPARATORY_TASK = eINSTANCE.getEducation_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getEducation_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATION__BASE_USE_CASE = eINSTANCE.getEducation_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.HumanEmploymentImpl <em>Human Employment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.HumanEmploymentImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getHumanEmployment()
		 * @generated
		 */
		EClass HUMAN_EMPLOYMENT = eINSTANCE.getHumanEmployment();

		/**
		 * The meta object literal for the '<em><b>Recruitment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__RECRUITMENT = eINSTANCE.getHumanEmployment_Recruitment();

		/**
		 * The meta object literal for the '<em><b>Work Conditions Decisions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS = eINSTANCE.getHumanEmployment_WorkConditionsDecisions();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__DECISION_PATTERN_DETECTION = eINSTANCE.getHumanEmployment_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getHumanEmployment_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__PREPARATORY_TASK = eINSTANCE.getHumanEmployment_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION = eINSTANCE.getHumanEmployment_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__NARROW_PROCEDURAL_TASK = eINSTANCE.getHumanEmployment_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_EMPLOYMENT__BASE_USE_CASE = eINSTANCE.getHumanEmployment_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.TrainingDataImpl <em>Training Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.TrainingDataImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getTrainingData()
		 * @generated
		 */
		EClass TRAINING_DATA = eINSTANCE.getTrainingData();

		/**
		 * The meta object literal for the '<em><b>Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__CLEANING = eINSTANCE.getTrainingData_Cleaning();

		/**
		 * The meta object literal for the '<em><b>Labeling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__LABELING = eINSTANCE.getTrainingData_Labeling();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__SELECTION = eINSTANCE.getTrainingData_Selection();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__DESCRIPTION = eINSTANCE.getTrainingData_Description();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__ORIGIN = eINSTANCE.getTrainingData_Origin();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_DATA__SCOPE = eINSTANCE.getTrainingData_Scope();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_DATA__BASE_ARTIFACT = eINSTANCE.getTrainingData_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.ThirdPartyComponentImpl <em>Third Party Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.ThirdPartyComponentImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getThirdPartyComponent()
		 * @generated
		 */
		EClass THIRD_PARTY_COMPONENT = eINSTANCE.getThirdPartyComponent();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_COMPONENT__ORIGIN = eINSTANCE.getThirdPartyComponent_Origin();

		/**
		 * The meta object literal for the '<em><b>Integration Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_COMPONENT__INTEGRATION_DESCRIPTION = eINSTANCE.getThirdPartyComponent_IntegrationDescription();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_COMPONENT__BASE_COMPONENT = eINSTANCE.getThirdPartyComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.EssentialServiceImpl <em>Essential Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.EssentialServiceImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEssentialService()
		 * @generated
		 */
		EClass ESSENTIAL_SERVICE = eINSTANCE.getEssentialService();

		/**
		 * The meta object literal for the '<em><b>Creditworthiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__CREDITWORTHINESS = eINSTANCE.getEssentialService_Creditworthiness();

		/**
		 * The meta object literal for the '<em><b>Public Benefits Eligibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY = eINSTANCE.getEssentialService_PublicBenefitsEligibility();

		/**
		 * The meta object literal for the '<em><b>Fraud Detection Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY = eINSTANCE.getEssentialService_FraudDetectionOnly();

		/**
		 * The meta object literal for the '<em><b>Insurance Risk Pricing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING = eINSTANCE.getEssentialService_InsuranceRiskPricing();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__PREPARATORY_TASK = eINSTANCE.getEssentialService_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK = eINSTANCE.getEssentialService_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION = eINSTANCE.getEssentialService_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getEssentialService_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION = eINSTANCE.getEssentialService_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESSENTIAL_SERVICE__BASE_USE_CASE = eINSTANCE.getEssentialService_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.LawEnforcementImpl <em>Law Enforcement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.LawEnforcementImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getLawEnforcement()
		 * @generated
		 */
		EClass LAW_ENFORCEMENT = eINSTANCE.getLawEnforcement();

		/**
		 * The meta object literal for the '<em><b>Victim Risk Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT = eINSTANCE.getLawEnforcement_VictimRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Lie Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__LIE_DETECTION = eINSTANCE.getLawEnforcement_LieDetection();

		/**
		 * The meta object literal for the '<em><b>Evidence Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__EVIDENCE_RELIABILITY = eINSTANCE.getLawEnforcement_EvidenceReliability();

		/**
		 * The meta object literal for the '<em><b>Offending Risk Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT = eINSTANCE.getLawEnforcement_OffendingRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Solely Profiling Based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__SOLELY_PROFILING_BASED = eINSTANCE.getLawEnforcement_SolelyProfilingBased();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK = eINSTANCE.getLawEnforcement_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION = eINSTANCE.getLawEnforcement_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION = eINSTANCE.getLawEnforcement_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__PREPARATORY_TASK = eINSTANCE.getLawEnforcement_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getLawEnforcement_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAW_ENFORCEMENT__BASE_USE_CASE = eINSTANCE.getLawEnforcement_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.MigrationBorderImpl <em>Migration Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.MigrationBorderImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getMigrationBorder()
		 * @generated
		 */
		EClass MIGRATION_BORDER = eINSTANCE.getMigrationBorder();

		/**
		 * The meta object literal for the '<em><b>Lie Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__LIE_DETECTION = eINSTANCE.getMigrationBorder_LieDetection();

		/**
		 * The meta object literal for the '<em><b>Entry Risk Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT = eINSTANCE.getMigrationBorder_EntryRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Asylum Visa Residence Permits Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION = eINSTANCE.getMigrationBorder_AsylumVisaResidencePermitsApplication();

		/**
		 * The meta object literal for the '<em><b>Travel Document Verification Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY = eINSTANCE.getMigrationBorder_TravelDocumentVerificationOnly();

		/**
		 * The meta object literal for the '<em><b>Person Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__PERSON_IDENTIFICATION = eINSTANCE.getMigrationBorder_PersonIdentification();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getMigrationBorder_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__NARROW_PROCEDURAL_TASK = eINSTANCE.getMigrationBorder_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__EXCEPTION_JUSTIFICATION = eINSTANCE.getMigrationBorder_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__PREPARATORY_TASK = eINSTANCE.getMigrationBorder_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__DECISION_PATTERN_DETECTION = eINSTANCE.getMigrationBorder_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_BORDER__BASE_USE_CASE = eINSTANCE.getMigrationBorder_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl <em>Justice Democracy Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.JusticeDemocracyUseCaseImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getJusticeDemocracyUseCase()
		 * @generated
		 */
		EClass JUSTICE_DEMOCRACY_USE_CASE = eINSTANCE.getJusticeDemocracyUseCase();

		/**
		 * The meta object literal for the '<em><b>Judicial Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT = eINSTANCE.getJusticeDemocracyUseCase_JudicialSupport();

		/**
		 * The meta object literal for the '<em><b>Election Influence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE = eINSTANCE.getJusticeDemocracyUseCase_ElectionInfluence();

		/**
		 * The meta object literal for the '<em><b>No Direct Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE = eINSTANCE.getJusticeDemocracyUseCase_NoDirectExposure();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION = eINSTANCE.getJusticeDemocracyUseCase_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getJusticeDemocracyUseCase_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK = eINSTANCE.getJusticeDemocracyUseCase_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK = eINSTANCE.getJusticeDemocracyUseCase_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION = eINSTANCE.getJusticeDemocracyUseCase_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE = eINSTANCE.getJusticeDemocracyUseCase_Base_UseCase();

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
		 * The meta object literal for the '<em><b>Verification Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY = eINSTANCE.getBiometricIdentification_VerificationOnly();

		/**
		 * The meta object literal for the '<em><b>Real Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__REAL_TIME = eINSTANCE.getBiometricIdentification_RealTime();

		/**
		 * The meta object literal for the '<em><b>Publicly Accessible Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE = eINSTANCE.getBiometricIdentification_PubliclyAccessibleSpace();

		/**
		 * The meta object literal for the '<em><b>Law Enforcement Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE = eINSTANCE.getBiometricIdentification_LawEnforcementPurpose();

		/**
		 * The meta object literal for the '<em><b>Victim Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH = eINSTANCE.getBiometricIdentification_VictimSearch();

		/**
		 * The meta object literal for the '<em><b>Imminent Threat Prevention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION = eINSTANCE.getBiometricIdentification_ImminentThreatPrevention();

		/**
		 * The meta object literal for the '<em><b>Serious Crime Suspect Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH = eINSTANCE.getBiometricIdentification_SeriousCrimeSuspectSearch();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__NARROW_PROCEDURAL_TASK = eINSTANCE.getBiometricIdentification_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getBiometricIdentification_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__DECISION_PATTERN_DETECTION = eINSTANCE.getBiometricIdentification_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__PREPARATORY_TASK = eINSTANCE.getBiometricIdentification_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getBiometricIdentification_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = eINSTANCE.getBiometricIdentification_Base_UseCase();

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
		 * The meta object literal for the '<em><b>Deduce Race</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DEDUCE_RACE = eINSTANCE.getBiometricCategorisation_DeduceRace();

		/**
		 * The meta object literal for the '<em><b>Deduce Political Opinion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION = eINSTANCE.getBiometricCategorisation_DeducePoliticalOpinion();

		/**
		 * The meta object literal for the '<em><b>Deduce Religious Belief</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF = eINSTANCE.getBiometricCategorisation_DeduceReligiousBelief();

		/**
		 * The meta object literal for the '<em><b>Deduce Union Membership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP = eINSTANCE.getBiometricCategorisation_DeduceUnionMembership();

		/**
		 * The meta object literal for the '<em><b>Deduce Sexuality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY = eINSTANCE.getBiometricCategorisation_DeduceSexuality();

		/**
		 * The meta object literal for the '<em><b>Lawful Dataset Labeling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING = eINSTANCE.getBiometricCategorisation_LawfulDatasetLabeling();

		/**
		 * The meta object literal for the '<em><b>Law Enforcement Categorisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION = eINSTANCE.getBiometricCategorisation_LawEnforcementCategorisation();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK = eINSTANCE.getBiometricCategorisation_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getBiometricCategorisation_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION = eINSTANCE.getBiometricCategorisation_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__PREPARATORY_TASK = eINSTANCE.getBiometricCategorisation_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getBiometricCategorisation_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_CATEGORISATION__BASE_USE_CASE = eINSTANCE.getBiometricCategorisation_Base_UseCase();

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
		 * The meta object literal for the '<em><b>Education</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__EDUCATION = eINSTANCE.getEmotionRecognition_Education();

		/**
		 * The meta object literal for the '<em><b>Workplace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__WORKPLACE = eINSTANCE.getEmotionRecognition_Workplace();

		/**
		 * The meta object literal for the '<em><b>Medical Or Safety Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON = eINSTANCE.getEmotionRecognition_MedicalOrSafetyReason();

		/**
		 * The meta object literal for the '<em><b>Narrow Procedural Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__NARROW_PROCEDURAL_TASK = eINSTANCE.getEmotionRecognition_NarrowProceduralTask();

		/**
		 * The meta object literal for the '<em><b>Improves Human Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__IMPROVES_HUMAN_ACTIVITY = eINSTANCE.getEmotionRecognition_ImprovesHumanActivity();

		/**
		 * The meta object literal for the '<em><b>Decision Pattern Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__DECISION_PATTERN_DETECTION = eINSTANCE.getEmotionRecognition_DecisionPatternDetection();

		/**
		 * The meta object literal for the '<em><b>Preparatory Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__PREPARATORY_TASK = eINSTANCE.getEmotionRecognition_PreparatoryTask();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATION = eINSTANCE.getEmotionRecognition_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTION_RECOGNITION__BASE_USE_CASE = eINSTANCE.getEmotionRecognition_Base_UseCase();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.Category
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.Role
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //EuaiactcompliancePackage
