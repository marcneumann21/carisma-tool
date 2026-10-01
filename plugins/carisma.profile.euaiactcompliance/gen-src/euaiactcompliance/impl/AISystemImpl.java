/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.AISystem;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getProviderContact <em>Provider Contact</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getExternalInteraction <em>External Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getMarketPlacementForm <em>Market Placement Form</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHardwareDescription <em>Hardware Description</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#isVisualDocumentation <em>Visual Documentation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getUserInterfaceDescription <em>User Interface Description</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getInstructionsForUse <em>Instructions For Use</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDevelopmentSteps <em>Development Steps</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDesignSpecification <em>Design Specification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getKeyDesignDecision <em>Key Design Decision</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getAffectedPersons <em>Affected Persons</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDesignTradeOffs <em>Design Trade Offs</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDevelopementResources <em>Developement Resources</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPredeterminedChanges <em>Predetermined Changes</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getCybersecurityMeasures <em>Cybersecurity Measures</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHumanOversightMeasures <em>Human Oversight Measures</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getUpdateRequirements <em>Update Requirements</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getForseeableRisks <em>Forseeable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPerformanceMetricsAppropriateness <em>Performance Metrics Appropriateness</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getRelevantChanges <em>Relevant Changes</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHarmonisedStandards <em>Harmonised Standards</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPostMarketMonitoring <em>Post Market Monitoring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AISystemImpl extends MinimalEObjectImpl.Container implements AISystem {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderContact() <em>Provider Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderContact()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderContact() <em>Provider Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderContact()
	 * @generated
	 * @ordered
	 */
	protected String providerContact = PROVIDER_CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalInteraction() <em>External Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_INTERACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalInteraction() <em>External Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInteraction()
	 * @generated
	 * @ordered
	 */
	protected String externalInteraction = EXTERNAL_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarketPlacementForm() <em>Market Placement Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketPlacementForm()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKET_PLACEMENT_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarketPlacementForm() <em>Market Placement Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketPlacementForm()
	 * @generated
	 * @ordered
	 */
	protected String marketPlacementForm = MARKET_PLACEMENT_FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareDescription() <em>Hardware Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareDescription() <em>Hardware Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareDescription()
	 * @generated
	 * @ordered
	 */
	protected String hardwareDescription = HARDWARE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisualDocumentation() <em>Visual Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisualDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISUAL_DOCUMENTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisualDocumentation() <em>Visual Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisualDocumentation()
	 * @generated
	 * @ordered
	 */
	protected boolean visualDocumentation = VISUAL_DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserInterfaceDescription() <em>User Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_INTERFACE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserInterfaceDescription() <em>User Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaceDescription()
	 * @generated
	 * @ordered
	 */
	protected String userInterfaceDescription = USER_INTERFACE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionsForUse() <em>Instructions For Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsForUse()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_FOR_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructionsForUse() <em>Instructions For Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsForUse()
	 * @generated
	 * @ordered
	 */
	protected String instructionsForUse = INSTRUCTIONS_FOR_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevelopmentSteps() <em>Development Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentSteps()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPMENT_STEPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevelopmentSteps() <em>Development Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentSteps()
	 * @generated
	 * @ordered
	 */
	protected String developmentSteps = DEVELOPMENT_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignSpecification() <em>Design Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignSpecification() <em>Design Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpecification()
	 * @generated
	 * @ordered
	 */
	protected String designSpecification = DESIGN_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyDesignDecision() <em>Key Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_DESIGN_DECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyDesignDecision() <em>Key Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected String keyDesignDecision = KEY_DESIGN_DECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAffectedPersons() <em>Affected Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedPersons()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFECTED_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffectedPersons() <em>Affected Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedPersons()
	 * @generated
	 * @ordered
	 */
	protected String affectedPersons = AFFECTED_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignTradeOffs() <em>Design Trade Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignTradeOffs()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_TRADE_OFFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignTradeOffs() <em>Design Trade Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignTradeOffs()
	 * @generated
	 * @ordered
	 */
	protected String designTradeOffs = DESIGN_TRADE_OFFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevelopementResources() <em>Developement Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopementResources()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPEMENT_RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevelopementResources() <em>Developement Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopementResources()
	 * @generated
	 * @ordered
	 */
	protected String developementResources = DEVELOPEMENT_RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanOversightPreAssessment() <em>Human Oversight Pre Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightPreAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanOversightPreAssessment() <em>Human Oversight Pre Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightPreAssessment()
	 * @generated
	 * @ordered
	 */
	protected String humanOversightPreAssessment = HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredeterminedChanges() <em>Predetermined Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredeterminedChanges()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDETERMINED_CHANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredeterminedChanges() <em>Predetermined Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredeterminedChanges()
	 * @generated
	 * @ordered
	 */
	protected String predeterminedChanges = PREDETERMINED_CHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCybersecurityMeasures() <em>Cybersecurity Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCybersecurityMeasures()
	 * @generated
	 * @ordered
	 */
	protected static final String CYBERSECURITY_MEASURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCybersecurityMeasures() <em>Cybersecurity Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCybersecurityMeasures()
	 * @generated
	 * @ordered
	 */
	protected String cybersecurityMeasures = CYBERSECURITY_MEASURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanOversightMeasures() <em>Human Oversight Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightMeasures()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_OVERSIGHT_MEASURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanOversightMeasures() <em>Human Oversight Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightMeasures()
	 * @generated
	 * @ordered
	 */
	protected String humanOversightMeasures = HUMAN_OVERSIGHT_MEASURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateRequirements() <em>Update Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_REQUIREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateRequirements() <em>Update Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRequirements()
	 * @generated
	 * @ordered
	 */
	protected String updateRequirements = UPDATE_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getForseeableRisks() <em>Forseeable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForseeableRisks()
	 * @generated
	 * @ordered
	 */
	protected static final String FORSEEABLE_RISKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForseeableRisks() <em>Forseeable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForseeableRisks()
	 * @generated
	 * @ordered
	 */
	protected String forseeableRisks = FORSEEABLE_RISKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceMetricsAppropriateness() <em>Performance Metrics Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetricsAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_METRICS_APPROPRIATENESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceMetricsAppropriateness() <em>Performance Metrics Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetricsAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected String performanceMetricsAppropriateness = PERFORMANCE_METRICS_APPROPRIATENESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevantChanges() <em>Relevant Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantChanges()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEVANT_CHANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelevantChanges() <em>Relevant Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantChanges()
	 * @generated
	 * @ordered
	 */
	protected String relevantChanges = RELEVANT_CHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHarmonisedStandards() <em>Harmonised Standards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmonisedStandards()
	 * @generated
	 * @ordered
	 */
	protected static final String HARMONISED_STANDARDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHarmonisedStandards() <em>Harmonised Standards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmonisedStandards()
	 * @generated
	 * @ordered
	 */
	protected String harmonisedStandards = HARMONISED_STANDARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCopyEUConformityDeclaration() <em>Copy EU Conformity Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyEUConformityDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_EU_CONFORMITY_DECLARATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopyEUConformityDeclaration() <em>Copy EU Conformity Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyEUConformityDeclaration()
	 * @generated
	 * @ordered
	 */
	protected boolean copyEUConformityDeclaration = COPY_EU_CONFORMITY_DECLARATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostMarketMonitoring() <em>Post Market Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostMarketMonitoring()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_MARKET_MONITORING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostMarketMonitoring() <em>Post Market Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostMarketMonitoring()
	 * @generated
	 * @ordered
	 */
	protected String postMarketMonitoring = POST_MARKET_MONITORING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.AI_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderContact() {
		return providerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderContact(String newProviderContact) {
		String oldProviderContact = providerContact;
		providerContact = newProviderContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT, oldProviderContact, providerContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalInteraction() {
		return externalInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalInteraction(String newExternalInteraction) {
		String oldExternalInteraction = externalInteraction;
		externalInteraction = newExternalInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION, oldExternalInteraction, externalInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarketPlacementForm() {
		return marketPlacementForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketPlacementForm(String newMarketPlacementForm) {
		String oldMarketPlacementForm = marketPlacementForm;
		marketPlacementForm = newMarketPlacementForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM, oldMarketPlacementForm, marketPlacementForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHardwareDescription() {
		return hardwareDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareDescription(String newHardwareDescription) {
		String oldHardwareDescription = hardwareDescription;
		hardwareDescription = newHardwareDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HARDWARE_DESCRIPTION, oldHardwareDescription, hardwareDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVisualDocumentation() {
		return visualDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualDocumentation(boolean newVisualDocumentation) {
		boolean oldVisualDocumentation = visualDocumentation;
		visualDocumentation = newVisualDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION, oldVisualDocumentation, visualDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserInterfaceDescription() {
		return userInterfaceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserInterfaceDescription(String newUserInterfaceDescription) {
		String oldUserInterfaceDescription = userInterfaceDescription;
		userInterfaceDescription = newUserInterfaceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE_DESCRIPTION, oldUserInterfaceDescription, userInterfaceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructionsForUse() {
		return instructionsForUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructionsForUse(String newInstructionsForUse) {
		String oldInstructionsForUse = instructionsForUse;
		instructionsForUse = newInstructionsForUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS_FOR_USE, oldInstructionsForUse, instructionsForUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevelopmentSteps() {
		return developmentSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopmentSteps(String newDevelopmentSteps) {
		String oldDevelopmentSteps = developmentSteps;
		developmentSteps = newDevelopmentSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_STEPS, oldDevelopmentSteps, developmentSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignSpecification() {
		return designSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignSpecification(String newDesignSpecification) {
		String oldDesignSpecification = designSpecification;
		designSpecification = newDesignSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION, oldDesignSpecification, designSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyDesignDecision() {
		return keyDesignDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyDesignDecision(String newKeyDesignDecision) {
		String oldKeyDesignDecision = keyDesignDecision;
		keyDesignDecision = newKeyDesignDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__KEY_DESIGN_DECISION, oldKeyDesignDecision, keyDesignDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAffectedPersons() {
		return affectedPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffectedPersons(String newAffectedPersons) {
		String oldAffectedPersons = affectedPersons;
		affectedPersons = newAffectedPersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__AFFECTED_PERSONS, oldAffectedPersons, affectedPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignTradeOffs() {
		return designTradeOffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignTradeOffs(String newDesignTradeOffs) {
		String oldDesignTradeOffs = designTradeOffs;
		designTradeOffs = newDesignTradeOffs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS, oldDesignTradeOffs, designTradeOffs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevelopementResources() {
		return developementResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopementResources(String newDevelopementResources) {
		String oldDevelopementResources = developementResources;
		developementResources = newDevelopementResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DEVELOPEMENT_RESOURCES, oldDevelopementResources, developementResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanOversightPreAssessment() {
		return humanOversightPreAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanOversightPreAssessment(String newHumanOversightPreAssessment) {
		String oldHumanOversightPreAssessment = humanOversightPreAssessment;
		humanOversightPreAssessment = newHumanOversightPreAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT, oldHumanOversightPreAssessment, humanOversightPreAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPredeterminedChanges() {
		return predeterminedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredeterminedChanges(String newPredeterminedChanges) {
		String oldPredeterminedChanges = predeterminedChanges;
		predeterminedChanges = newPredeterminedChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PREDETERMINED_CHANGES, oldPredeterminedChanges, predeterminedChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCybersecurityMeasures() {
		return cybersecurityMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCybersecurityMeasures(String newCybersecurityMeasures) {
		String oldCybersecurityMeasures = cybersecurityMeasures;
		cybersecurityMeasures = newCybersecurityMeasures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY_MEASURES, oldCybersecurityMeasures, cybersecurityMeasures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanOversightMeasures() {
		return humanOversightMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanOversightMeasures(String newHumanOversightMeasures) {
		String oldHumanOversightMeasures = humanOversightMeasures;
		humanOversightMeasures = newHumanOversightMeasures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES, oldHumanOversightMeasures, humanOversightMeasures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdateRequirements() {
		return updateRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateRequirements(String newUpdateRequirements) {
		String oldUpdateRequirements = updateRequirements;
		updateRequirements = newUpdateRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS, oldUpdateRequirements, updateRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForseeableRisks() {
		return forseeableRisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForseeableRisks(String newForseeableRisks) {
		String oldForseeableRisks = forseeableRisks;
		forseeableRisks = newForseeableRisks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__FORSEEABLE_RISKS, oldForseeableRisks, forseeableRisks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformanceMetricsAppropriateness() {
		return performanceMetricsAppropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceMetricsAppropriateness(String newPerformanceMetricsAppropriateness) {
		String oldPerformanceMetricsAppropriateness = performanceMetricsAppropriateness;
		performanceMetricsAppropriateness = newPerformanceMetricsAppropriateness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS, oldPerformanceMetricsAppropriateness, performanceMetricsAppropriateness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelevantChanges() {
		return relevantChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevantChanges(String newRelevantChanges) {
		String oldRelevantChanges = relevantChanges;
		relevantChanges = newRelevantChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES, oldRelevantChanges, relevantChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHarmonisedStandards() {
		return harmonisedStandards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHarmonisedStandards(String newHarmonisedStandards) {
		String oldHarmonisedStandards = harmonisedStandards;
		harmonisedStandards = newHarmonisedStandards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS, oldHarmonisedStandards, harmonisedStandards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCopyEUConformityDeclaration() {
		return copyEUConformityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyEUConformityDeclaration(boolean newCopyEUConformityDeclaration) {
		boolean oldCopyEUConformityDeclaration = copyEUConformityDeclaration;
		copyEUConformityDeclaration = newCopyEUConformityDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION, oldCopyEUConformityDeclaration, copyEUConformityDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostMarketMonitoring() {
		return postMarketMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostMarketMonitoring(String newPostMarketMonitoring) {
		String oldPostMarketMonitoring = postMarketMonitoring;
		postMarketMonitoring = newPostMarketMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING, oldPostMarketMonitoring, postMarketMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				return getProviderName();
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				return getProviderContact();
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				return getVersion();
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				return getExternalInteraction();
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				return getMarketPlacementForm();
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE_DESCRIPTION:
				return getHardwareDescription();
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				return isVisualDocumentation();
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE_DESCRIPTION:
				return getUserInterfaceDescription();
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS_FOR_USE:
				return getInstructionsForUse();
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_STEPS:
				return getDevelopmentSteps();
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				return getDesignSpecification();
			case EuaiactcompliancePackage.AI_SYSTEM__KEY_DESIGN_DECISION:
				return getKeyDesignDecision();
			case EuaiactcompliancePackage.AI_SYSTEM__AFFECTED_PERSONS:
				return getAffectedPersons();
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				return getDesignTradeOffs();
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPEMENT_RESOURCES:
				return getDevelopementResources();
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				return getHumanOversightPreAssessment();
			case EuaiactcompliancePackage.AI_SYSTEM__PREDETERMINED_CHANGES:
				return getPredeterminedChanges();
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY_MEASURES:
				return getCybersecurityMeasures();
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES:
				return getHumanOversightMeasures();
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				return getUpdateRequirements();
			case EuaiactcompliancePackage.AI_SYSTEM__FORSEEABLE_RISKS:
				return getForseeableRisks();
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS:
				return getPerformanceMetricsAppropriateness();
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				return getRelevantChanges();
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				return getHarmonisedStandards();
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				return isCopyEUConformityDeclaration();
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				return getPostMarketMonitoring();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				setProviderContact((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				setVersion((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				setExternalInteraction((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				setMarketPlacementForm((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE_DESCRIPTION:
				setHardwareDescription((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE_DESCRIPTION:
				setUserInterfaceDescription((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS_FOR_USE:
				setInstructionsForUse((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_STEPS:
				setDevelopmentSteps((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__KEY_DESIGN_DECISION:
				setKeyDesignDecision((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__AFFECTED_PERSONS:
				setAffectedPersons((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				setDesignTradeOffs((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPEMENT_RESOURCES:
				setDevelopementResources((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				setHumanOversightPreAssessment((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PREDETERMINED_CHANGES:
				setPredeterminedChanges((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY_MEASURES:
				setCybersecurityMeasures((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES:
				setHumanOversightMeasures((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				setUpdateRequirements((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__FORSEEABLE_RISKS:
				setForseeableRisks((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS:
				setPerformanceMetricsAppropriateness((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				setRelevantChanges((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				setHarmonisedStandards((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				setCopyEUConformityDeclaration((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				setPostMarketMonitoring((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				setProviderContact(PROVIDER_CONTACT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				setExternalInteraction(EXTERNAL_INTERACTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				setMarketPlacementForm(MARKET_PLACEMENT_FORM_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE_DESCRIPTION:
				setHardwareDescription(HARDWARE_DESCRIPTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation(VISUAL_DOCUMENTATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE_DESCRIPTION:
				setUserInterfaceDescription(USER_INTERFACE_DESCRIPTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS_FOR_USE:
				setInstructionsForUse(INSTRUCTIONS_FOR_USE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_STEPS:
				setDevelopmentSteps(DEVELOPMENT_STEPS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification(DESIGN_SPECIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__KEY_DESIGN_DECISION:
				setKeyDesignDecision(KEY_DESIGN_DECISION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__AFFECTED_PERSONS:
				setAffectedPersons(AFFECTED_PERSONS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				setDesignTradeOffs(DESIGN_TRADE_OFFS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPEMENT_RESOURCES:
				setDevelopementResources(DEVELOPEMENT_RESOURCES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				setHumanOversightPreAssessment(HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PREDETERMINED_CHANGES:
				setPredeterminedChanges(PREDETERMINED_CHANGES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY_MEASURES:
				setCybersecurityMeasures(CYBERSECURITY_MEASURES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES:
				setHumanOversightMeasures(HUMAN_OVERSIGHT_MEASURES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				setUpdateRequirements(UPDATE_REQUIREMENTS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__FORSEEABLE_RISKS:
				setForseeableRisks(FORSEEABLE_RISKS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS:
				setPerformanceMetricsAppropriateness(PERFORMANCE_METRICS_APPROPRIATENESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				setRelevantChanges(RELEVANT_CHANGES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				setHarmonisedStandards(HARMONISED_STANDARDS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				setCopyEUConformityDeclaration(COPY_EU_CONFORMITY_DECLARATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				setPostMarketMonitoring(POST_MARKET_MONITORING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT:
				return base_Component != null;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				return PROVIDER_CONTACT_EDEFAULT == null ? providerContact != null : !PROVIDER_CONTACT_EDEFAULT.equals(providerContact);
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				return EXTERNAL_INTERACTION_EDEFAULT == null ? externalInteraction != null : !EXTERNAL_INTERACTION_EDEFAULT.equals(externalInteraction);
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				return MARKET_PLACEMENT_FORM_EDEFAULT == null ? marketPlacementForm != null : !MARKET_PLACEMENT_FORM_EDEFAULT.equals(marketPlacementForm);
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE_DESCRIPTION:
				return HARDWARE_DESCRIPTION_EDEFAULT == null ? hardwareDescription != null : !HARDWARE_DESCRIPTION_EDEFAULT.equals(hardwareDescription);
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				return visualDocumentation != VISUAL_DOCUMENTATION_EDEFAULT;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE_DESCRIPTION:
				return USER_INTERFACE_DESCRIPTION_EDEFAULT == null ? userInterfaceDescription != null : !USER_INTERFACE_DESCRIPTION_EDEFAULT.equals(userInterfaceDescription);
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS_FOR_USE:
				return INSTRUCTIONS_FOR_USE_EDEFAULT == null ? instructionsForUse != null : !INSTRUCTIONS_FOR_USE_EDEFAULT.equals(instructionsForUse);
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_STEPS:
				return DEVELOPMENT_STEPS_EDEFAULT == null ? developmentSteps != null : !DEVELOPMENT_STEPS_EDEFAULT.equals(developmentSteps);
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				return DESIGN_SPECIFICATION_EDEFAULT == null ? designSpecification != null : !DESIGN_SPECIFICATION_EDEFAULT.equals(designSpecification);
			case EuaiactcompliancePackage.AI_SYSTEM__KEY_DESIGN_DECISION:
				return KEY_DESIGN_DECISION_EDEFAULT == null ? keyDesignDecision != null : !KEY_DESIGN_DECISION_EDEFAULT.equals(keyDesignDecision);
			case EuaiactcompliancePackage.AI_SYSTEM__AFFECTED_PERSONS:
				return AFFECTED_PERSONS_EDEFAULT == null ? affectedPersons != null : !AFFECTED_PERSONS_EDEFAULT.equals(affectedPersons);
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				return DESIGN_TRADE_OFFS_EDEFAULT == null ? designTradeOffs != null : !DESIGN_TRADE_OFFS_EDEFAULT.equals(designTradeOffs);
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPEMENT_RESOURCES:
				return DEVELOPEMENT_RESOURCES_EDEFAULT == null ? developementResources != null : !DEVELOPEMENT_RESOURCES_EDEFAULT.equals(developementResources);
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				return HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT == null ? humanOversightPreAssessment != null : !HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT.equals(humanOversightPreAssessment);
			case EuaiactcompliancePackage.AI_SYSTEM__PREDETERMINED_CHANGES:
				return PREDETERMINED_CHANGES_EDEFAULT == null ? predeterminedChanges != null : !PREDETERMINED_CHANGES_EDEFAULT.equals(predeterminedChanges);
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY_MEASURES:
				return CYBERSECURITY_MEASURES_EDEFAULT == null ? cybersecurityMeasures != null : !CYBERSECURITY_MEASURES_EDEFAULT.equals(cybersecurityMeasures);
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_MEASURES:
				return HUMAN_OVERSIGHT_MEASURES_EDEFAULT == null ? humanOversightMeasures != null : !HUMAN_OVERSIGHT_MEASURES_EDEFAULT.equals(humanOversightMeasures);
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				return UPDATE_REQUIREMENTS_EDEFAULT == null ? updateRequirements != null : !UPDATE_REQUIREMENTS_EDEFAULT.equals(updateRequirements);
			case EuaiactcompliancePackage.AI_SYSTEM__FORSEEABLE_RISKS:
				return FORSEEABLE_RISKS_EDEFAULT == null ? forseeableRisks != null : !FORSEEABLE_RISKS_EDEFAULT.equals(forseeableRisks);
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_APPROPRIATENESS:
				return PERFORMANCE_METRICS_APPROPRIATENESS_EDEFAULT == null ? performanceMetricsAppropriateness != null : !PERFORMANCE_METRICS_APPROPRIATENESS_EDEFAULT.equals(performanceMetricsAppropriateness);
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				return RELEVANT_CHANGES_EDEFAULT == null ? relevantChanges != null : !RELEVANT_CHANGES_EDEFAULT.equals(relevantChanges);
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				return HARMONISED_STANDARDS_EDEFAULT == null ? harmonisedStandards != null : !HARMONISED_STANDARDS_EDEFAULT.equals(harmonisedStandards);
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				return copyEUConformityDeclaration != COPY_EU_CONFORMITY_DECLARATION_EDEFAULT;
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				return POST_MARKET_MONITORING_EDEFAULT == null ? postMarketMonitoring != null : !POST_MARKET_MONITORING_EDEFAULT.equals(postMarketMonitoring);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ProviderName: ");
		result.append(providerName);
		result.append(", ProviderContact: ");
		result.append(providerContact);
		result.append(", Version: ");
		result.append(version);
		result.append(", ExternalInteraction: ");
		result.append(externalInteraction);
		result.append(", MarketPlacementForm: ");
		result.append(marketPlacementForm);
		result.append(", HardwareDescription: ");
		result.append(hardwareDescription);
		result.append(", VisualDocumentation: ");
		result.append(visualDocumentation);
		result.append(", UserInterfaceDescription: ");
		result.append(userInterfaceDescription);
		result.append(", InstructionsForUse: ");
		result.append(instructionsForUse);
		result.append(", DevelopmentSteps: ");
		result.append(developmentSteps);
		result.append(", DesignSpecification: ");
		result.append(designSpecification);
		result.append(", KeyDesignDecision: ");
		result.append(keyDesignDecision);
		result.append(", AffectedPersons: ");
		result.append(affectedPersons);
		result.append(", DesignTradeOffs: ");
		result.append(designTradeOffs);
		result.append(", DevelopementResources: ");
		result.append(developementResources);
		result.append(", HumanOversightPreAssessment: ");
		result.append(humanOversightPreAssessment);
		result.append(", PredeterminedChanges: ");
		result.append(predeterminedChanges);
		result.append(", CybersecurityMeasures: ");
		result.append(cybersecurityMeasures);
		result.append(", HumanOversightMeasures: ");
		result.append(humanOversightMeasures);
		result.append(", UpdateRequirements: ");
		result.append(updateRequirements);
		result.append(", ForseeableRisks: ");
		result.append(forseeableRisks);
		result.append(", PerformanceMetricsAppropriateness: ");
		result.append(performanceMetricsAppropriateness);
		result.append(", RelevantChanges: ");
		result.append(relevantChanges);
		result.append(", HarmonisedStandards: ");
		result.append(harmonisedStandards);
		result.append(", CopyEUConformityDeclaration: ");
		result.append(copyEUConformityDeclaration);
		result.append(", PostMarketMonitoring: ");
		result.append(postMarketMonitoring);
		result.append(')');
		return result.toString();
	}

} //AISystemImpl
