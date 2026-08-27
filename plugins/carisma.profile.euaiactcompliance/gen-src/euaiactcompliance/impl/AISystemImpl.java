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
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getExternalInteraction <em>External Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getMarketPlacementForm <em>Market Placement Form</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#isVisualDocumentation <em>Visual Documentation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDevelopmentProcess <em>Development Process</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDesignSpecification <em>Design Specification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDesignDecision <em>Design Decision</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getDesignTradeOffs <em>Design Trade Offs</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPlannedModification <em>Planned Modification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getCybersecurity <em>Cybersecurity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getUpdateRequirements <em>Update Requirements</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPredictableRisks <em>Predictable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPerformanceMetricsSuitability <em>Performance Metrics Suitability</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getRelevantChanges <em>Relevant Changes</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getHarmonisedStandards <em>Harmonised Standards</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getPostMarketMonitoring <em>Post Market Monitoring</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AISystemImpl#getProviderContact <em>Provider Contact</em>}</li>
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
	 * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected String hardware = HARDWARE_EDEFAULT;

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
	 * The default value of the '{@link #getUserInterface() <em>User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserInterface() <em>User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterface()
	 * @generated
	 * @ordered
	 */
	protected String userInterface = USER_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected String instructions = INSTRUCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevelopmentProcess() <em>Development Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPMENT_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevelopmentProcess() <em>Development Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentProcess()
	 * @generated
	 * @ordered
	 */
	protected String developmentProcess = DEVELOPMENT_PROCESS_EDEFAULT;

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
	 * The default value of the '{@link #getDesignDecision() <em>Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_DECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignDecision() <em>Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected String designDecision = DESIGN_DECISION_EDEFAULT;

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
	 * The default value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected String resources = RESOURCES_EDEFAULT;

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
	 * The default value of the '{@link #getPlannedModification() <em>Planned Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedModification()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANNED_MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannedModification() <em>Planned Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedModification()
	 * @generated
	 * @ordered
	 */
	protected String plannedModification = PLANNED_MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCybersecurity() <em>Cybersecurity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCybersecurity()
	 * @generated
	 * @ordered
	 */
	protected static final String CYBERSECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCybersecurity() <em>Cybersecurity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCybersecurity()
	 * @generated
	 * @ordered
	 */
	protected String cybersecurity = CYBERSECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHumanOversightPostAssessment() <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightPostAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanOversightPostAssessment() <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanOversightPostAssessment()
	 * @generated
	 * @ordered
	 */
	protected String humanOversightPostAssessment = HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT;

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
	 * The default value of the '{@link #getPredictableRisks() <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictableRisks()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICTABLE_RISKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredictableRisks() <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictableRisks()
	 * @generated
	 * @ordered
	 */
	protected String predictableRisks = PREDICTABLE_RISKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceMetricsSuitability() <em>Performance Metrics Suitability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetricsSuitability()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_METRICS_SUITABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceMetricsSuitability() <em>Performance Metrics Suitability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetricsSuitability()
	 * @generated
	 * @ordered
	 */
	protected String performanceMetricsSuitability = PERFORMANCE_METRICS_SUITABILITY_EDEFAULT;

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
	public String getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardware(String newHardware) {
		String oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HARDWARE, oldHardware, hardware));
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
	public String getUserInterface() {
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserInterface(String newUserInterface) {
		String oldUserInterface = userInterface;
		userInterface = newUserInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE, oldUserInterface, userInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(String newInstructions) {
		String oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS, oldInstructions, instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevelopmentProcess() {
		return developmentProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopmentProcess(String newDevelopmentProcess) {
		String oldDevelopmentProcess = developmentProcess;
		developmentProcess = newDevelopmentProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_PROCESS, oldDevelopmentProcess, developmentProcess));
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
	public String getDesignDecision() {
		return designDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignDecision(String newDesignDecision) {
		String oldDesignDecision = designDecision;
		designDecision = newDesignDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__DESIGN_DECISION, oldDesignDecision, designDecision));
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
	public String getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(String newResources) {
		String oldResources = resources;
		resources = newResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__RESOURCES, oldResources, resources));
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
	public String getPlannedModification() {
		return plannedModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedModification(String newPlannedModification) {
		String oldPlannedModification = plannedModification;
		plannedModification = newPlannedModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PLANNED_MODIFICATION, oldPlannedModification, plannedModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCybersecurity() {
		return cybersecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCybersecurity(String newCybersecurity) {
		String oldCybersecurity = cybersecurity;
		cybersecurity = newCybersecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY, oldCybersecurity, cybersecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanOversightPostAssessment() {
		return humanOversightPostAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanOversightPostAssessment(String newHumanOversightPostAssessment) {
		String oldHumanOversightPostAssessment = humanOversightPostAssessment;
		humanOversightPostAssessment = newHumanOversightPostAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT, oldHumanOversightPostAssessment, humanOversightPostAssessment));
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
	public String getPredictableRisks() {
		return predictableRisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredictableRisks(String newPredictableRisks) {
		String oldPredictableRisks = predictableRisks;
		predictableRisks = newPredictableRisks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PREDICTABLE_RISKS, oldPredictableRisks, predictableRisks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformanceMetricsSuitability() {
		return performanceMetricsSuitability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceMetricsSuitability(String newPerformanceMetricsSuitability) {
		String oldPerformanceMetricsSuitability = performanceMetricsSuitability;
		performanceMetricsSuitability = newPerformanceMetricsSuitability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY, oldPerformanceMetricsSuitability, performanceMetricsSuitability));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.AI_SYSTEM__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				return getVersion();
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				return getExternalInteraction();
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				return getMarketPlacementForm();
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE:
				return getHardware();
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				return isVisualDocumentation();
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE:
				return getUserInterface();
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS:
				return getInstructions();
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_PROCESS:
				return getDevelopmentProcess();
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				return getDesignSpecification();
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_DECISION:
				return getDesignDecision();
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				return getDesignTradeOffs();
			case EuaiactcompliancePackage.AI_SYSTEM__RESOURCES:
				return getResources();
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				return getHumanOversightPreAssessment();
			case EuaiactcompliancePackage.AI_SYSTEM__PLANNED_MODIFICATION:
				return getPlannedModification();
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY:
				return getCybersecurity();
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				return getHumanOversightPostAssessment();
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				return getUpdateRequirements();
			case EuaiactcompliancePackage.AI_SYSTEM__PREDICTABLE_RISKS:
				return getPredictableRisks();
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY:
				return getPerformanceMetricsSuitability();
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				return getRelevantChanges();
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				return getHarmonisedStandards();
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				return isCopyEUConformityDeclaration();
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				return getPostMarketMonitoring();
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				return getProviderName();
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				return getProviderContact();
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
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				setVersion((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				setExternalInteraction((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				setMarketPlacementForm((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE:
				setHardware((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE:
				setUserInterface((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS:
				setInstructions((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_PROCESS:
				setDevelopmentProcess((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_DECISION:
				setDesignDecision((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				setDesignTradeOffs((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__RESOURCES:
				setResources((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				setHumanOversightPreAssessment((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PLANNED_MODIFICATION:
				setPlannedModification((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY:
				setCybersecurity((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				setHumanOversightPostAssessment((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				setUpdateRequirements((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PREDICTABLE_RISKS:
				setPredictableRisks((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY:
				setPerformanceMetricsSuitability((String)newValue);
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
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				setProviderContact((String)newValue);
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
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				setExternalInteraction(EXTERNAL_INTERACTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				setMarketPlacementForm(MARKET_PLACEMENT_FORM_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation(VISUAL_DOCUMENTATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE:
				setUserInterface(USER_INTERFACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_PROCESS:
				setDevelopmentProcess(DEVELOPMENT_PROCESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification(DESIGN_SPECIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_DECISION:
				setDesignDecision(DESIGN_DECISION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				setDesignTradeOffs(DESIGN_TRADE_OFFS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__RESOURCES:
				setResources(RESOURCES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				setHumanOversightPreAssessment(HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PLANNED_MODIFICATION:
				setPlannedModification(PLANNED_MODIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY:
				setCybersecurity(CYBERSECURITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				setHumanOversightPostAssessment(HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				setUpdateRequirements(UPDATE_REQUIREMENTS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PREDICTABLE_RISKS:
				setPredictableRisks(PREDICTABLE_RISKS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY:
				setPerformanceMetricsSuitability(PERFORMANCE_METRICS_SUITABILITY_EDEFAULT);
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
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				setProviderContact(PROVIDER_CONTACT_EDEFAULT);
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
			case EuaiactcompliancePackage.AI_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EuaiactcompliancePackage.AI_SYSTEM__EXTERNAL_INTERACTION:
				return EXTERNAL_INTERACTION_EDEFAULT == null ? externalInteraction != null : !EXTERNAL_INTERACTION_EDEFAULT.equals(externalInteraction);
			case EuaiactcompliancePackage.AI_SYSTEM__MARKET_PLACEMENT_FORM:
				return MARKET_PLACEMENT_FORM_EDEFAULT == null ? marketPlacementForm != null : !MARKET_PLACEMENT_FORM_EDEFAULT.equals(marketPlacementForm);
			case EuaiactcompliancePackage.AI_SYSTEM__HARDWARE:
				return HARDWARE_EDEFAULT == null ? hardware != null : !HARDWARE_EDEFAULT.equals(hardware);
			case EuaiactcompliancePackage.AI_SYSTEM__VISUAL_DOCUMENTATION:
				return visualDocumentation != VISUAL_DOCUMENTATION_EDEFAULT;
			case EuaiactcompliancePackage.AI_SYSTEM__USER_INTERFACE:
				return USER_INTERFACE_EDEFAULT == null ? userInterface != null : !USER_INTERFACE_EDEFAULT.equals(userInterface);
			case EuaiactcompliancePackage.AI_SYSTEM__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? instructions != null : !INSTRUCTIONS_EDEFAULT.equals(instructions);
			case EuaiactcompliancePackage.AI_SYSTEM__DEVELOPMENT_PROCESS:
				return DEVELOPMENT_PROCESS_EDEFAULT == null ? developmentProcess != null : !DEVELOPMENT_PROCESS_EDEFAULT.equals(developmentProcess);
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_SPECIFICATION:
				return DESIGN_SPECIFICATION_EDEFAULT == null ? designSpecification != null : !DESIGN_SPECIFICATION_EDEFAULT.equals(designSpecification);
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_DECISION:
				return DESIGN_DECISION_EDEFAULT == null ? designDecision != null : !DESIGN_DECISION_EDEFAULT.equals(designDecision);
			case EuaiactcompliancePackage.AI_SYSTEM__DESIGN_TRADE_OFFS:
				return DESIGN_TRADE_OFFS_EDEFAULT == null ? designTradeOffs != null : !DESIGN_TRADE_OFFS_EDEFAULT.equals(designTradeOffs);
			case EuaiactcompliancePackage.AI_SYSTEM__RESOURCES:
				return RESOURCES_EDEFAULT == null ? resources != null : !RESOURCES_EDEFAULT.equals(resources);
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_PRE_ASSESSMENT:
				return HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT == null ? humanOversightPreAssessment != null : !HUMAN_OVERSIGHT_PRE_ASSESSMENT_EDEFAULT.equals(humanOversightPreAssessment);
			case EuaiactcompliancePackage.AI_SYSTEM__PLANNED_MODIFICATION:
				return PLANNED_MODIFICATION_EDEFAULT == null ? plannedModification != null : !PLANNED_MODIFICATION_EDEFAULT.equals(plannedModification);
			case EuaiactcompliancePackage.AI_SYSTEM__CYBERSECURITY:
				return CYBERSECURITY_EDEFAULT == null ? cybersecurity != null : !CYBERSECURITY_EDEFAULT.equals(cybersecurity);
			case EuaiactcompliancePackage.AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				return HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT == null ? humanOversightPostAssessment != null : !HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT.equals(humanOversightPostAssessment);
			case EuaiactcompliancePackage.AI_SYSTEM__UPDATE_REQUIREMENTS:
				return UPDATE_REQUIREMENTS_EDEFAULT == null ? updateRequirements != null : !UPDATE_REQUIREMENTS_EDEFAULT.equals(updateRequirements);
			case EuaiactcompliancePackage.AI_SYSTEM__PREDICTABLE_RISKS:
				return PREDICTABLE_RISKS_EDEFAULT == null ? predictableRisks != null : !PREDICTABLE_RISKS_EDEFAULT.equals(predictableRisks);
			case EuaiactcompliancePackage.AI_SYSTEM__PERFORMANCE_METRICS_SUITABILITY:
				return PERFORMANCE_METRICS_SUITABILITY_EDEFAULT == null ? performanceMetricsSuitability != null : !PERFORMANCE_METRICS_SUITABILITY_EDEFAULT.equals(performanceMetricsSuitability);
			case EuaiactcompliancePackage.AI_SYSTEM__RELEVANT_CHANGES:
				return RELEVANT_CHANGES_EDEFAULT == null ? relevantChanges != null : !RELEVANT_CHANGES_EDEFAULT.equals(relevantChanges);
			case EuaiactcompliancePackage.AI_SYSTEM__HARMONISED_STANDARDS:
				return HARMONISED_STANDARDS_EDEFAULT == null ? harmonisedStandards != null : !HARMONISED_STANDARDS_EDEFAULT.equals(harmonisedStandards);
			case EuaiactcompliancePackage.AI_SYSTEM__COPY_EU_CONFORMITY_DECLARATION:
				return copyEUConformityDeclaration != COPY_EU_CONFORMITY_DECLARATION_EDEFAULT;
			case EuaiactcompliancePackage.AI_SYSTEM__POST_MARKET_MONITORING:
				return POST_MARKET_MONITORING_EDEFAULT == null ? postMarketMonitoring != null : !POST_MARKET_MONITORING_EDEFAULT.equals(postMarketMonitoring);
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case EuaiactcompliancePackage.AI_SYSTEM__PROVIDER_CONTACT:
				return PROVIDER_CONTACT_EDEFAULT == null ? providerContact != null : !PROVIDER_CONTACT_EDEFAULT.equals(providerContact);
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
		result.append(" (Version: ");
		result.append(version);
		result.append(", ExternalInteraction: ");
		result.append(externalInteraction);
		result.append(", MarketPlacementForm: ");
		result.append(marketPlacementForm);
		result.append(", Hardware: ");
		result.append(hardware);
		result.append(", VisualDocumentation: ");
		result.append(visualDocumentation);
		result.append(", UserInterface: ");
		result.append(userInterface);
		result.append(", Instructions: ");
		result.append(instructions);
		result.append(", DevelopmentProcess: ");
		result.append(developmentProcess);
		result.append(", DesignSpecification: ");
		result.append(designSpecification);
		result.append(", DesignDecision: ");
		result.append(designDecision);
		result.append(", DesignTradeOffs: ");
		result.append(designTradeOffs);
		result.append(", Resources: ");
		result.append(resources);
		result.append(", HumanOversightPreAssessment: ");
		result.append(humanOversightPreAssessment);
		result.append(", PlannedModification: ");
		result.append(plannedModification);
		result.append(", Cybersecurity: ");
		result.append(cybersecurity);
		result.append(", HumanOversightPostAssessment: ");
		result.append(humanOversightPostAssessment);
		result.append(", UpdateRequirements: ");
		result.append(updateRequirements);
		result.append(", PredictableRisks: ");
		result.append(predictableRisks);
		result.append(", PerformanceMetricsSuitability: ");
		result.append(performanceMetricsSuitability);
		result.append(", RelevantChanges: ");
		result.append(relevantChanges);
		result.append(", HarmonisedStandards: ");
		result.append(harmonisedStandards);
		result.append(", CopyEUConformityDeclaration: ");
		result.append(copyEUConformityDeclaration);
		result.append(", PostMarketMonitoring: ");
		result.append(postMarketMonitoring);
		result.append(", ProviderName: ");
		result.append(providerName);
		result.append(", ProviderContact: ");
		result.append(providerContact);
		result.append(')');
		return result.toString();
	}

} //AISystemImpl
