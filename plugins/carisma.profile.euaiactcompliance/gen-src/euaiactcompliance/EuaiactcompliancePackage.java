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
	String eNS_URI = "http://www.umlsec.de/profiles/UMLsec/euaiactcompliance.ecore";

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
	 * The feature id for the '<em><b>Product Category</b></em>' attribute list.
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
	 * The feature id for the '<em><b>Law Enforcement Authorised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED = 1;

	/**
	 * The feature id for the '<em><b>Obvious AI Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION = 2;

	/**
	 * The feature id for the '<em><b>Public Criminal Offence Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION__PUBLIC_CRIMINAL_OFFENCE_REPORT = 3;

	/**
	 * The number of structural features of the '<em>Human Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_INTERACTION_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Law Enforcement Authorised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT__LAW_ENFORCEMENT_AUTHORISED = 1;

	/**
	 * The feature id for the '<em><b>Standard Editing Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT__STANDARD_EDITING_ONLY = 2;

	/**
	 * The number of structural features of the '<em>Synthetic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Synthetic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHETIC_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.ManipulativeBehaviourImpl <em>Manipulative Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.ManipulativeBehaviourImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getManipulativeBehaviour()
	 * @generated
	 */
	int MANIPULATIVE_BEHAVIOUR = 4;

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
	int EXPLOITING_HUMAN_VULNERABILITY = 5;

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
	int SOCIAL_SCORING = 6;

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
	int FACIAL_IMAGE_SCRAPING = 7;

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
	int AI_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PROVIDER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Provider Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PROVIDER_CONTACT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__VERSION = 3;

	/**
	 * The feature id for the '<em><b>External Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__EXTERNAL_INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Market Placement Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__MARKET_PLACEMENT_FORM = 5;

	/**
	 * The feature id for the '<em><b>Hardware Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HARDWARE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Visual Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__VISUAL_DOCUMENTATION = 7;

	/**
	 * The feature id for the '<em><b>User Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__USER_INTERFACE_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Instructions For Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__INSTRUCTIONS_FOR_USE = 9;

	/**
	 * The feature id for the '<em><b>Development Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DEVELOPMENT_STEPS = 10;

	/**
	 * The feature id for the '<em><b>Design Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DESIGN_SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Key Design Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__KEY_DESIGN_DECISION = 12;

	/**
	 * The feature id for the '<em><b>Affected Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__AFFECTED_PERSONS = 13;

	/**
	 * The feature id for the '<em><b>Design Trade Offs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DESIGN_TRADE_OFFS = 14;

	/**
	 * The feature id for the '<em><b>Developement Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__DEVELOPEMENT_RESOURCES = 15;

	/**
	 * The feature id for the '<em><b>Human Oversight Pre Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT = 16;

	/**
	 * The feature id for the '<em><b>Predetermined Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PREDETERMINED_CHANGES = 17;

	/**
	 * The feature id for the '<em><b>Cybersecurity Measures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__CYBERSECURITY_MEASURES = 18;

	/**
	 * The feature id for the '<em><b>Human Oversight Measures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES = 19;

	/**
	 * The feature id for the '<em><b>Update Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__UPDATE_REQUIREMENTS = 20;

	/**
	 * The feature id for the '<em><b>Forseeable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__FORSEEABLE_RISKS = 21;

	/**
	 * The feature id for the '<em><b>Performance Metrics Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS = 22;

	/**
	 * The feature id for the '<em><b>Relevant Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__RELEVANT_CHANGES = 23;

	/**
	 * The feature id for the '<em><b>Harmonised Standards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__HARMONISED_STANDARDS = 24;

	/**
	 * The feature id for the '<em><b>Copy EU Conformity Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION = 25;

	/**
	 * The feature id for the '<em><b>Post Market Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM__POST_MARKET_MONITORING = 26;

	/**
	 * The number of structural features of the '<em>AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM_FEATURE_COUNT = 27;

	/**
	 * The number of operations of the '<em>AI System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.CriticalInfrastructureImpl <em>Critical Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.CriticalInfrastructureImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getCriticalInfrastructure()
	 * @generated
	 */
	int CRITICAL_INFRASTRUCTURE = 9;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__BASE_USE_CASE = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE__EXCEPTION = 8;

	/**
	 * The number of structural features of the '<em>Critical Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Critical Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.SelfDevelopedModelImpl <em>Self Developed Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.SelfDevelopedModelImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSelfDevelopedModel()
	 * @generated
	 */
	int SELF_DEVELOPED_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Training Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__TRAINING_METHODS = 4;

	/**
	 * The feature id for the '<em><b>Validation Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__VALIDATION_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Testing Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__TESTING_PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Test Reports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__TEST_REPORTS = 7;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__CAPABILITIES = 8;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__ACCURACY = 9;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL__INPUT_DATA = 10;

	/**
	 * The number of structural features of the '<em>Self Developed Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Self Developed Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_DEVELOPED_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.EducationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 11;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__BASE_USE_CASE = 4;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EXCEPTION_JUSTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__EXCEPTION = 6;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = 7;

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
	int HUMAN_EMPLOYMENT = 12;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__BASE_USE_CASE = 2;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__EXCEPTION = 3;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__PROMOTION = 5;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT__TERMINATION = 6;

	/**
	 * The number of structural features of the '<em>Human Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_EMPLOYMENT_FEATURE_COUNT = 7;

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
	int TRAINING_DATA = 13;

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
	int THIRD_PARTY_COMPONENT = 14;

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
	int ESSENTIAL_SERVICE = 15;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__BASE_USE_CASE = 4;

	/**
	 * The feature id for the '<em><b>Emergency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__EMERGENCY = 5;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE__EXCEPTION = 7;

	/**
	 * The number of structural features of the '<em>Essential Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENTIAL_SERVICE_FEATURE_COUNT = 8;

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
	int LAW_ENFORCEMENT = 16;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__BASE_USE_CASE = 5;

	/**
	 * The feature id for the '<em><b>Supports Human Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__SUPPORTS_HUMAN_ASSESSMENT = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT__EXCEPTION = 8;

	/**
	 * The number of structural features of the '<em>Law Enforcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAW_ENFORCEMENT_FEATURE_COUNT = 9;

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
	int MIGRATION_BORDER = 17;

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
	 * The feature id for the '<em><b>Asylum Visa Or Residence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__ASYLUM_VISA_OR_RESIDENCE = 2;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__BASE_USE_CASE = 5;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__EXCEPTION = 6;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER__EXCEPTION_JUSTIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Migration Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Migration Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.AdministrationJusticeDemocracyImpl <em>Administration Justice Democracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.AdministrationJusticeDemocracyImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAdministrationJusticeDemocracy()
	 * @generated
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY = 18;

	/**
	 * The feature id for the '<em><b>Judicial Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__JUDICIAL_SUPPORT = 0;

	/**
	 * The feature id for the '<em><b>Election Influence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__ELECTION_INFLUENCE = 1;

	/**
	 * The feature id for the '<em><b>No Direct Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__NO_DIRECT_EXPOSURE = 2;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__BASE_USE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__EXCEPTION = 4;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY__EXCEPTION_JUSTIFICATION = 5;

	/**
	 * The number of structural features of the '<em>Administration Justice Democracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Administration Justice Democracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATION_JUSTICE_DEMOCRACY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.impl.BiometricIdentificationImpl <em>Biometric Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.BiometricIdentificationImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getBiometricIdentification()
	 * @generated
	 */
	int BIOMETRIC_IDENTIFICATION = 19;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = 7;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__EXCEPTION = 8;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION = 9;

	/**
	 * The number of structural features of the '<em>Biometric Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_IDENTIFICATION_FEATURE_COUNT = 10;

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
	int BIOMETRIC_CATEGORISATION = 20;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__BASE_USE_CASE = 7;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__EXCEPTION = 8;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION = 9;

	/**
	 * The number of structural features of the '<em>Biometric Categorisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOMETRIC_CATEGORISATION_FEATURE_COUNT = 10;

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
	int EMOTION_RECOGNITION = 21;

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
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__BASE_USE_CASE = 3;

	/**
	 * The feature id for the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_RECOGNITION__EXCEPTION = 5;

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
	 * The meta object id for the '{@link euaiactcompliance.impl.RiskManagementSystemImpl <em>Risk Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.impl.RiskManagementSystemImpl
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRiskManagementSystem()
	 * @generated
	 */
	int RISK_MANAGEMENT_SYSTEM = 22;

	/**
	 * The feature id for the '<em><b>Risk Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__RISK_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Risk Estimation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__RISK_ESTIMATION = 1;

	/**
	 * The feature id for the '<em><b>Risk Mitigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__RISK_MITIGATION = 2;

	/**
	 * The feature id for the '<em><b>Residual Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__RESIDUAL_RISK = 3;

	/**
	 * The feature id for the '<em><b>Vulnerable Groups Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__VULNERABLE_GROUPS_ASSESSMENT = 4;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM__BASE_ARTIFACT = 5;

	/**
	 * The number of structural features of the '<em>Risk Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Risk Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MANAGEMENT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link euaiactcompliance.ProductCategory <em>Product Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.ProductCategory
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProductCategory()
	 * @generated
	 */
	int PRODUCT_CATEGORY = 23;

	/**
	 * The meta object id for the '{@link euaiactcompliance.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.Role
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 24;

	/**
	 * The meta object id for the '{@link euaiactcompliance.Exception <em>Exception</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see euaiactcompliance.Exception
	 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 25;


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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.ProductEmbedding#isThirdPartyConformityAssessment <em>Third Party Conformity Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Conformity Assessment</em>'.
	 * @see euaiactcompliance.ProductEmbedding#isThirdPartyConformityAssessment()
	 * @see #getProductEmbedding()
	 * @generated
	 */
	EAttribute getProductEmbedding_ThirdPartyConformityAssessment();

	/**
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.ProductEmbedding#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Product Category</em>'.
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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanInteraction#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law Enforcement Authorised</em>'.
	 * @see euaiactcompliance.HumanInteraction#isLawEnforcementAuthorised()
	 * @see #getHumanInteraction()
	 * @generated
	 */
	EAttribute getHumanInteraction_LawEnforcementAuthorised();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanInteraction#isObviousAIInteraction <em>Obvious AI Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obvious AI Interaction</em>'.
	 * @see euaiactcompliance.HumanInteraction#isObviousAIInteraction()
	 * @see #getHumanInteraction()
	 * @generated
	 */
	EAttribute getHumanInteraction_ObviousAIInteraction();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanInteraction#isPublicCriminalOffenceReport <em>Public Criminal Offence Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Criminal Offence Report</em>'.
	 * @see euaiactcompliance.HumanInteraction#isPublicCriminalOffenceReport()
	 * @see #getHumanInteraction()
	 * @generated
	 */
	EAttribute getHumanInteraction_PublicCriminalOffenceReport();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SyntheticContent#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Law Enforcement Authorised</em>'.
	 * @see euaiactcompliance.SyntheticContent#isLawEnforcementAuthorised()
	 * @see #getSyntheticContent()
	 * @generated
	 */
	EAttribute getSyntheticContent_LawEnforcementAuthorised();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SyntheticContent#isStandardEditingOnly <em>Standard Editing Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Editing Only</em>'.
	 * @see euaiactcompliance.SyntheticContent#isStandardEditingOnly()
	 * @see #getSyntheticContent()
	 * @generated
	 */
	EAttribute getSyntheticContent_StandardEditingOnly();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see euaiactcompliance.AISystem#getProviderName()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getProviderContact <em>Provider Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Contact</em>'.
	 * @see euaiactcompliance.AISystem#getProviderContact()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_ProviderContact();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHardwareDescription <em>Hardware Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Description</em>'.
	 * @see euaiactcompliance.AISystem#getHardwareDescription()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HardwareDescription();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getUserInterfaceDescription <em>User Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interface Description</em>'.
	 * @see euaiactcompliance.AISystem#getUserInterfaceDescription()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_UserInterfaceDescription();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getInstructionsForUse <em>Instructions For Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions For Use</em>'.
	 * @see euaiactcompliance.AISystem#getInstructionsForUse()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_InstructionsForUse();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDevelopmentSteps <em>Development Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Steps</em>'.
	 * @see euaiactcompliance.AISystem#getDevelopmentSteps()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DevelopmentSteps();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getKeyDesignDecision <em>Key Design Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Design Decision</em>'.
	 * @see euaiactcompliance.AISystem#getKeyDesignDecision()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_KeyDesignDecision();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getAffectedPersons <em>Affected Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affected Persons</em>'.
	 * @see euaiactcompliance.AISystem#getAffectedPersons()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_AffectedPersons();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getDevelopementResources <em>Developement Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developement Resources</em>'.
	 * @see euaiactcompliance.AISystem#getDevelopementResources()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_DevelopementResources();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Pre Assessment</em>'.
	 * @see euaiactcompliance.AISystem#getHumanOversightPreAssessment()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HumanOversightPreAssessment();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPredeterminedChanges <em>Predetermined Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predetermined Changes</em>'.
	 * @see euaiactcompliance.AISystem#getPredeterminedChanges()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PredeterminedChanges();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getCybersecurityMeasures <em>Cybersecurity Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cybersecurity Measures</em>'.
	 * @see euaiactcompliance.AISystem#getCybersecurityMeasures()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_CybersecurityMeasures();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getHumanOversightMeasures <em>Human Oversight Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Oversight Measures</em>'.
	 * @see euaiactcompliance.AISystem#getHumanOversightMeasures()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_HumanOversightMeasures();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getForseeableRisks <em>Forseeable Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forseeable Risks</em>'.
	 * @see euaiactcompliance.AISystem#getForseeableRisks()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_ForseeableRisks();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AISystem#getPerformanceMetricsAppropriateness <em>Performance Metrics Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Metrics Appropriateness</em>'.
	 * @see euaiactcompliance.AISystem#getPerformanceMetricsAppropriateness()
	 * @see #getAISystem()
	 * @generated
	 */
	EAttribute getAISystem_PerformanceMetricsAppropriateness();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.CriticalInfrastructure#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.CriticalInfrastructure#getException()
	 * @see #getCriticalInfrastructure()
	 * @generated
	 */
	EAttribute getCriticalInfrastructure_Exception();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.SelfDevelopedModel <em>Self Developed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Developed Model</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel
	 * @generated
	 */
	EClass getSelfDevelopedModel();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getObjective()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_Objective();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.SelfDevelopedModel#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getBase_Component()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EReference getSelfDevelopedModel_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Output</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getExpectedOutput()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_ExpectedOutput();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getParameter()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getTrainingMethods <em>Training Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Methods</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getTrainingMethods()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_TrainingMethods();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getValidationProcess <em>Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Process</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getValidationProcess()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_ValidationProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getTestingProcess <em>Testing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Process</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getTestingProcess()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_TestingProcess();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#isTestReports <em>Test Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Reports</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#isTestReports()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_TestReports();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabilities</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getCapabilities()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getAccuracy()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.SelfDevelopedModel#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Data</em>'.
	 * @see euaiactcompliance.SelfDevelopedModel#getInputData()
	 * @see #getSelfDevelopedModel()
	 * @generated
	 */
	EAttribute getSelfDevelopedModel_InputData();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.Education#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.Education#getException()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Exception();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.HumanEmployment#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.HumanEmployment#getException()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_Exception();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isPromotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promotion</em>'.
	 * @see euaiactcompliance.HumanEmployment#isPromotion()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_Promotion();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.HumanEmployment#isTermination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination</em>'.
	 * @see euaiactcompliance.HumanEmployment#isTermination()
	 * @see #getHumanEmployment()
	 * @generated
	 */
	EAttribute getHumanEmployment_Termination();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.EssentialService#isEmergency <em>Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency</em>'.
	 * @see euaiactcompliance.EssentialService#isEmergency()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_Emergency();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.EssentialService#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.EssentialService#getException()
	 * @see #getEssentialService()
	 * @generated
	 */
	EAttribute getEssentialService_Exception();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.LawEnforcement#isSupportsHumanAssessment <em>Supports Human Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Human Assessment</em>'.
	 * @see euaiactcompliance.LawEnforcement#isSupportsHumanAssessment()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_SupportsHumanAssessment();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.LawEnforcement#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.LawEnforcement#getException()
	 * @see #getLawEnforcement()
	 * @generated
	 */
	EAttribute getLawEnforcement_Exception();

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
	 * Returns the meta object for the attribute '{@link euaiactcompliance.MigrationBorder#isAsylumVisaOrResidence <em>Asylum Visa Or Residence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asylum Visa Or Residence</em>'.
	 * @see euaiactcompliance.MigrationBorder#isAsylumVisaOrResidence()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_AsylumVisaOrResidence();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.MigrationBorder#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.MigrationBorder#getException()
	 * @see #getMigrationBorder()
	 * @generated
	 */
	EAttribute getMigrationBorder_Exception();

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
	 * Returns the meta object for class '{@link euaiactcompliance.AdministrationJusticeDemocracy <em>Administration Justice Democracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administration Justice Democracy</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy
	 * @generated
	 */
	EClass getAdministrationJusticeDemocracy();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AdministrationJusticeDemocracy#isJudicialSupport <em>Judicial Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Judicial Support</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#isJudicialSupport()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EAttribute getAdministrationJusticeDemocracy_JudicialSupport();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AdministrationJusticeDemocracy#isElectionInfluence <em>Election Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Election Influence</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#isElectionInfluence()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EAttribute getAdministrationJusticeDemocracy_ElectionInfluence();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AdministrationJusticeDemocracy#isNoDirectExposure <em>No Direct Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Direct Exposure</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#isNoDirectExposure()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EAttribute getAdministrationJusticeDemocracy_NoDirectExposure();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.AdministrationJusticeDemocracy#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#getBase_UseCase()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EReference getAdministrationJusticeDemocracy_Base_UseCase();

	/**
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.AdministrationJusticeDemocracy#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#getException()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EAttribute getAdministrationJusticeDemocracy_Exception();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.AdministrationJusticeDemocracy#getExceptionJustification <em>Exception Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Justification</em>'.
	 * @see euaiactcompliance.AdministrationJusticeDemocracy#getExceptionJustification()
	 * @see #getAdministrationJusticeDemocracy()
	 * @generated
	 */
	EAttribute getAdministrationJusticeDemocracy_ExceptionJustification();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.BiometricIdentification#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.BiometricIdentification#getException()
	 * @see #getBiometricIdentification()
	 * @generated
	 */
	EAttribute getBiometricIdentification_Exception();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.BiometricCategorisation#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.BiometricCategorisation#getException()
	 * @see #getBiometricCategorisation()
	 * @generated
	 */
	EAttribute getBiometricCategorisation_Exception();

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
	 * Returns the meta object for the attribute list '{@link euaiactcompliance.EmotionRecognition#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exception</em>'.
	 * @see euaiactcompliance.EmotionRecognition#getException()
	 * @see #getEmotionRecognition()
	 * @generated
	 */
	EAttribute getEmotionRecognition_Exception();

	/**
	 * Returns the meta object for class '{@link euaiactcompliance.RiskManagementSystem <em>Risk Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Management System</em>'.
	 * @see euaiactcompliance.RiskManagementSystem
	 * @generated
	 */
	EClass getRiskManagementSystem();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.RiskManagementSystem#getRiskIdentification <em>Risk Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Identification</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getRiskIdentification()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EAttribute getRiskManagementSystem_RiskIdentification();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.RiskManagementSystem#getRiskEstimation <em>Risk Estimation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Estimation</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getRiskEstimation()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EAttribute getRiskManagementSystem_RiskEstimation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.RiskManagementSystem#getRiskMitigation <em>Risk Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Mitigation</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getRiskMitigation()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EAttribute getRiskManagementSystem_RiskMitigation();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.RiskManagementSystem#getResidualRisk <em>Residual Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Risk</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getResidualRisk()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EAttribute getRiskManagementSystem_ResidualRisk();

	/**
	 * Returns the meta object for the attribute '{@link euaiactcompliance.RiskManagementSystem#getVulnerableGroupsAssessment <em>Vulnerable Groups Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerable Groups Assessment</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getVulnerableGroupsAssessment()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EAttribute getRiskManagementSystem_VulnerableGroupsAssessment();

	/**
	 * Returns the meta object for the reference '{@link euaiactcompliance.RiskManagementSystem#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see euaiactcompliance.RiskManagementSystem#getBase_Artifact()
	 * @see #getRiskManagementSystem()
	 * @generated
	 */
	EReference getRiskManagementSystem_Base_Artifact();

	/**
	 * Returns the meta object for enum '{@link euaiactcompliance.ProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Category</em>'.
	 * @see euaiactcompliance.ProductCategory
	 * @generated
	 */
	EEnum getProductCategory();

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
	 * Returns the meta object for enum '{@link euaiactcompliance.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exception</em>'.
	 * @see euaiactcompliance.Exception
	 * @generated
	 */
	EEnum getException();

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
		 * The meta object literal for the '<em><b>Product Category</b></em>' attribute list feature.
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
		 * The meta object literal for the '<em><b>Law Enforcement Authorised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED = eINSTANCE.getHumanInteraction_LawEnforcementAuthorised();

		/**
		 * The meta object literal for the '<em><b>Obvious AI Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION = eINSTANCE.getHumanInteraction_ObviousAIInteraction();

		/**
		 * The meta object literal for the '<em><b>Public Criminal Offence Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_INTERACTION__PUBLIC_CRIMINAL_OFFENCE_REPORT = eINSTANCE.getHumanInteraction_PublicCriminalOffenceReport();

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
		 * The meta object literal for the '<em><b>Law Enforcement Authorised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHETIC_CONTENT__LAW_ENFORCEMENT_AUTHORISED = eINSTANCE.getSyntheticContent_LawEnforcementAuthorised();

		/**
		 * The meta object literal for the '<em><b>Standard Editing Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHETIC_CONTENT__STANDARD_EDITING_ONLY = eINSTANCE.getSyntheticContent_StandardEditingOnly();

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
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PROVIDER_NAME = eINSTANCE.getAISystem_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Provider Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PROVIDER_CONTACT = eINSTANCE.getAISystem_ProviderContact();

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
		 * The meta object literal for the '<em><b>Hardware Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HARDWARE_DESCRIPTION = eINSTANCE.getAISystem_HardwareDescription();

		/**
		 * The meta object literal for the '<em><b>Visual Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__VISUAL_DOCUMENTATION = eINSTANCE.getAISystem_VisualDocumentation();

		/**
		 * The meta object literal for the '<em><b>User Interface Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__USER_INTERFACE_DESCRIPTION = eINSTANCE.getAISystem_UserInterfaceDescription();

		/**
		 * The meta object literal for the '<em><b>Instructions For Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__INSTRUCTIONS_FOR_USE = eINSTANCE.getAISystem_InstructionsForUse();

		/**
		 * The meta object literal for the '<em><b>Development Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DEVELOPMENT_STEPS = eINSTANCE.getAISystem_DevelopmentSteps();

		/**
		 * The meta object literal for the '<em><b>Design Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DESIGN_SPECIFICATION = eINSTANCE.getAISystem_DesignSpecification();

		/**
		 * The meta object literal for the '<em><b>Key Design Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__KEY_DESIGN_DECISION = eINSTANCE.getAISystem_KeyDesignDecision();

		/**
		 * The meta object literal for the '<em><b>Affected Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__AFFECTED_PERSONS = eINSTANCE.getAISystem_AffectedPersons();

		/**
		 * The meta object literal for the '<em><b>Design Trade Offs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DESIGN_TRADE_OFFS = eINSTANCE.getAISystem_DesignTradeOffs();

		/**
		 * The meta object literal for the '<em><b>Developement Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__DEVELOPEMENT_RESOURCES = eINSTANCE.getAISystem_DevelopementResources();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Pre Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT = eINSTANCE.getAISystem_HumanOversightPreAssessment();

		/**
		 * The meta object literal for the '<em><b>Predetermined Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PREDETERMINED_CHANGES = eINSTANCE.getAISystem_PredeterminedChanges();

		/**
		 * The meta object literal for the '<em><b>Cybersecurity Measures</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__CYBERSECURITY_MEASURES = eINSTANCE.getAISystem_CybersecurityMeasures();

		/**
		 * The meta object literal for the '<em><b>Human Oversight Measures</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES = eINSTANCE.getAISystem_HumanOversightMeasures();

		/**
		 * The meta object literal for the '<em><b>Update Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__UPDATE_REQUIREMENTS = eINSTANCE.getAISystem_UpdateRequirements();

		/**
		 * The meta object literal for the '<em><b>Forseeable Risks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__FORSEEABLE_RISKS = eINSTANCE.getAISystem_ForseeableRisks();

		/**
		 * The meta object literal for the '<em><b>Performance Metrics Appropriateness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS = eINSTANCE.getAISystem_PerformanceMetricsAppropriateness();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITICAL_INFRASTRUCTURE__BASE_USE_CASE = eINSTANCE.getCriticalInfrastructure_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION = eINSTANCE.getCriticalInfrastructure_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITICAL_INFRASTRUCTURE__EXCEPTION = eINSTANCE.getCriticalInfrastructure_Exception();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.SelfDevelopedModelImpl <em>Self Developed Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.SelfDevelopedModelImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getSelfDevelopedModel()
		 * @generated
		 */
		EClass SELF_DEVELOPED_MODEL = eINSTANCE.getSelfDevelopedModel();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__OBJECTIVE = eINSTANCE.getSelfDevelopedModel_Objective();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELF_DEVELOPED_MODEL__BASE_COMPONENT = eINSTANCE.getSelfDevelopedModel_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Expected Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT = eINSTANCE.getSelfDevelopedModel_ExpectedOutput();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__PARAMETER = eINSTANCE.getSelfDevelopedModel_Parameter();

		/**
		 * The meta object literal for the '<em><b>Training Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__TRAINING_METHODS = eINSTANCE.getSelfDevelopedModel_TrainingMethods();

		/**
		 * The meta object literal for the '<em><b>Validation Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__VALIDATION_PROCESS = eINSTANCE.getSelfDevelopedModel_ValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Testing Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__TESTING_PROCESS = eINSTANCE.getSelfDevelopedModel_TestingProcess();

		/**
		 * The meta object literal for the '<em><b>Test Reports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__TEST_REPORTS = eINSTANCE.getSelfDevelopedModel_TestReports();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__CAPABILITIES = eINSTANCE.getSelfDevelopedModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__ACCURACY = eINSTANCE.getSelfDevelopedModel_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_DEVELOPED_MODEL__INPUT_DATA = eINSTANCE.getSelfDevelopedModel_InputData();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDUCATION__BASE_USE_CASE = eINSTANCE.getEducation_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getEducation_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__EXCEPTION = eINSTANCE.getEducation_Exception();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_EMPLOYMENT__BASE_USE_CASE = eINSTANCE.getHumanEmployment_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__EXCEPTION = eINSTANCE.getHumanEmployment_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION = eINSTANCE.getHumanEmployment_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Promotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__PROMOTION = eINSTANCE.getHumanEmployment_Promotion();

		/**
		 * The meta object literal for the '<em><b>Termination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_EMPLOYMENT__TERMINATION = eINSTANCE.getHumanEmployment_Termination();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESSENTIAL_SERVICE__BASE_USE_CASE = eINSTANCE.getEssentialService_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Emergency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__EMERGENCY = eINSTANCE.getEssentialService_Emergency();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION = eINSTANCE.getEssentialService_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESSENTIAL_SERVICE__EXCEPTION = eINSTANCE.getEssentialService_Exception();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAW_ENFORCEMENT__BASE_USE_CASE = eINSTANCE.getLawEnforcement_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Supports Human Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__SUPPORTS_HUMAN_ASSESSMENT = eINSTANCE.getLawEnforcement_SupportsHumanAssessment();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION = eINSTANCE.getLawEnforcement_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAW_ENFORCEMENT__EXCEPTION = eINSTANCE.getLawEnforcement_Exception();

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
		 * The meta object literal for the '<em><b>Asylum Visa Or Residence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__ASYLUM_VISA_OR_RESIDENCE = eINSTANCE.getMigrationBorder_AsylumVisaOrResidence();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_BORDER__BASE_USE_CASE = eINSTANCE.getMigrationBorder_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__EXCEPTION = eINSTANCE.getMigrationBorder_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_BORDER__EXCEPTION_JUSTIFICATION = eINSTANCE.getMigrationBorder_ExceptionJustification();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.AdministrationJusticeDemocracyImpl <em>Administration Justice Democracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.AdministrationJusticeDemocracyImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getAdministrationJusticeDemocracy()
		 * @generated
		 */
		EClass ADMINISTRATION_JUSTICE_DEMOCRACY = eINSTANCE.getAdministrationJusticeDemocracy();

		/**
		 * The meta object literal for the '<em><b>Judicial Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_JUSTICE_DEMOCRACY__JUDICIAL_SUPPORT = eINSTANCE.getAdministrationJusticeDemocracy_JudicialSupport();

		/**
		 * The meta object literal for the '<em><b>Election Influence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_JUSTICE_DEMOCRACY__ELECTION_INFLUENCE = eINSTANCE.getAdministrationJusticeDemocracy_ElectionInfluence();

		/**
		 * The meta object literal for the '<em><b>No Direct Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_JUSTICE_DEMOCRACY__NO_DIRECT_EXPOSURE = eINSTANCE.getAdministrationJusticeDemocracy_NoDirectExposure();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATION_JUSTICE_DEMOCRACY__BASE_USE_CASE = eINSTANCE.getAdministrationJusticeDemocracy_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_JUSTICE_DEMOCRACY__EXCEPTION = eINSTANCE.getAdministrationJusticeDemocracy_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATION_JUSTICE_DEMOCRACY__EXCEPTION_JUSTIFICATION = eINSTANCE.getAdministrationJusticeDemocracy_ExceptionJustification();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_IDENTIFICATION__BASE_USE_CASE = eINSTANCE.getBiometricIdentification_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__EXCEPTION = eINSTANCE.getBiometricIdentification_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getBiometricIdentification_ExceptionJustification();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOMETRIC_CATEGORISATION__BASE_USE_CASE = eINSTANCE.getBiometricCategorisation_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__EXCEPTION = eINSTANCE.getBiometricCategorisation_Exception();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION = eINSTANCE.getBiometricCategorisation_ExceptionJustification();

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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTION_RECOGNITION__BASE_USE_CASE = eINSTANCE.getEmotionRecognition_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Exception Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATION = eINSTANCE.getEmotionRecognition_ExceptionJustification();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTION_RECOGNITION__EXCEPTION = eINSTANCE.getEmotionRecognition_Exception();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.impl.RiskManagementSystemImpl <em>Risk Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.impl.RiskManagementSystemImpl
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRiskManagementSystem()
		 * @generated
		 */
		EClass RISK_MANAGEMENT_SYSTEM = eINSTANCE.getRiskManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Risk Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MANAGEMENT_SYSTEM__RISK_IDENTIFICATION = eINSTANCE.getRiskManagementSystem_RiskIdentification();

		/**
		 * The meta object literal for the '<em><b>Risk Estimation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MANAGEMENT_SYSTEM__RISK_ESTIMATION = eINSTANCE.getRiskManagementSystem_RiskEstimation();

		/**
		 * The meta object literal for the '<em><b>Risk Mitigation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MANAGEMENT_SYSTEM__RISK_MITIGATION = eINSTANCE.getRiskManagementSystem_RiskMitigation();

		/**
		 * The meta object literal for the '<em><b>Residual Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MANAGEMENT_SYSTEM__RESIDUAL_RISK = eINSTANCE.getRiskManagementSystem_ResidualRisk();

		/**
		 * The meta object literal for the '<em><b>Vulnerable Groups Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MANAGEMENT_SYSTEM__VULNERABLE_GROUPS_ASSESSMENT = eINSTANCE.getRiskManagementSystem_VulnerableGroupsAssessment();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MANAGEMENT_SYSTEM__BASE_ARTIFACT = eINSTANCE.getRiskManagementSystem_Base_Artifact();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.ProductCategory <em>Product Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.ProductCategory
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getProductCategory()
		 * @generated
		 */
		EEnum PRODUCT_CATEGORY = eINSTANCE.getProductCategory();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.Role
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link euaiactcompliance.Exception <em>Exception</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see euaiactcompliance.Exception
		 * @see euaiactcompliance.impl.EuaiactcompliancePackageImpl#getException()
		 * @generated
		 */
		EEnum EXCEPTION = eINSTANCE.getException();

	}

} //EuaiactcompliancePackage
