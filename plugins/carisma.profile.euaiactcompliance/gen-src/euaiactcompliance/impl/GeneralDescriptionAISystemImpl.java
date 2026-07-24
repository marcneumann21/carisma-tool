/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.GeneralDescriptionAISystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Description AI System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isPurpose <em>Purpose</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isProvider <em>Provider</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isInteraction <em>Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isDeployment <em>Deployment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isHardware <em>Hardware</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isVisualDocumentation <em>Visual Documentation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#isInstructions <em>Instructions</em>}</li>
 *   <li>{@link euaiactcompliance.impl.GeneralDescriptionAISystemImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralDescriptionAISystemImpl extends MinimalEObjectImpl.Container implements GeneralDescriptionAISystem {
	/**
	 * The default value of the '{@link #isPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PURPOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPurpose()
	 * @generated
	 * @ordered
	 */
	protected boolean purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvider()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvider()
	 * @generated
	 * @ordered
	 */
	protected boolean provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteraction()
	 * @generated
	 * @ordered
	 */
	protected boolean interaction = INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeployment() <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeployment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPLOYMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeployment() <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeployment()
	 * @generated
	 * @ordered
	 */
	protected boolean deployment = DEPLOYMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHardware()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HARDWARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHardware()
	 * @generated
	 * @ordered
	 */
	protected boolean hardware = HARDWARE_EDEFAULT;

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
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTRUCTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstructions()
	 * @generated
	 * @ordered
	 */
	protected boolean instructions = INSTRUCTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralDescriptionAISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.GENERAL_DESCRIPTION_AI_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(boolean newPurpose) {
		boolean oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(boolean newProvider) {
		boolean oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(boolean newVersion) {
		boolean oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteraction(boolean newInteraction) {
		boolean oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployment(boolean newDeployment) {
		boolean oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT, oldDeployment, deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardware(boolean newHardware) {
		boolean oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE, oldHardware, hardware));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION, oldVisualDocumentation, visualDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(boolean newInstructions) {
		boolean oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS, oldInstructions, instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE:
				return isPurpose();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER:
				return isProvider();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VERSION:
				return isVersion();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION:
				return isInteraction();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT:
				return isDeployment();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE:
				return isHardware();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION:
				return isVisualDocumentation();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE:
				return isInterface();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS:
				return isInstructions();
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
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
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE:
				setPurpose((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER:
				setProvider((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VERSION:
				setVersion((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION:
				setInteraction((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT:
				setDeployment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE:
				setHardware((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE:
				setInterface((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS:
				setInstructions((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
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
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION:
				setInteraction(INTERACTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT:
				setDeployment(DEPLOYMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION:
				setVisualDocumentation(VISUAL_DOCUMENTATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
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
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PURPOSE:
				return purpose != PURPOSE_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__PROVIDER:
				return provider != PROVIDER_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERACTION:
				return interaction != INTERACTION_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__DEPLOYMENT:
				return deployment != DEPLOYMENT_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__HARDWARE:
				return hardware != HARDWARE_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__VISUAL_DOCUMENTATION:
				return visualDocumentation != VISUAL_DOCUMENTATION_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__INSTRUCTIONS:
				return instructions != INSTRUCTIONS_EDEFAULT;
			case EuaiactcompliancePackage.GENERAL_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				return base_Artifact != null;
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
		result.append(" (Purpose: ");
		result.append(purpose);
		result.append(", Provider: ");
		result.append(provider);
		result.append(", Version: ");
		result.append(version);
		result.append(", Interaction: ");
		result.append(interaction);
		result.append(", Deployment: ");
		result.append(deployment);
		result.append(", Hardware: ");
		result.append(hardware);
		result.append(", VisualDocumentation: ");
		result.append(visualDocumentation);
		result.append(", Interface: ");
		result.append(interface_);
		result.append(", Instructions: ");
		result.append(instructions);
		result.append(')');
		return result.toString();
	}

} //GeneralDescriptionAISystemImpl
