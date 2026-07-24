/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.SafetyComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isMachinery <em>Machinery</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isToy <em>Toy</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isElevator <em>Elevator</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isMedical <em>Medical</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isInVitroDiagnostics <em>In Vitro Diagnostics</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isPersonalProtective <em>Personal Protective</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isCivilAviation <em>Civil Aviation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isRailSystem <em>Rail System</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#isAgricultural <em>Agricultural</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SafetyComponentImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyComponentImpl extends MinimalEObjectImpl.Container implements SafetyComponent {
	/**
	 * The default value of the '{@link #isMachinery() <em>Machinery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMachinery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MACHINERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMachinery() <em>Machinery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMachinery()
	 * @generated
	 * @ordered
	 */
	protected boolean machinery = MACHINERY_EDEFAULT;

	/**
	 * The default value of the '{@link #isToy() <em>Toy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToy() <em>Toy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToy()
	 * @generated
	 * @ordered
	 */
	protected boolean toy = TOY_EDEFAULT;

	/**
	 * The default value of the '{@link #isElevator() <em>Elevator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEVATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElevator() <em>Elevator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevator()
	 * @generated
	 * @ordered
	 */
	protected boolean elevator = ELEVATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMedical() <em>Medical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMedical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEDICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMedical() <em>Medical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMedical()
	 * @generated
	 * @ordered
	 */
	protected boolean medical = MEDICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isInVitroDiagnostics() <em>In Vitro Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInVitroDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_VITRO_DIAGNOSTICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInVitroDiagnostics() <em>In Vitro Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInVitroDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected boolean inVitroDiagnostics = IN_VITRO_DIAGNOSTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersonalProtective() <em>Personal Protective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonalProtective()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSONAL_PROTECTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersonalProtective() <em>Personal Protective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonalProtective()
	 * @generated
	 * @ordered
	 */
	protected boolean personalProtective = PERSONAL_PROTECTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCivilAviation() <em>Civil Aviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCivilAviation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIVIL_AVIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCivilAviation() <em>Civil Aviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCivilAviation()
	 * @generated
	 * @ordered
	 */
	protected boolean civilAviation = CIVIL_AVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRailSystem() <em>Rail System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRailSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RAIL_SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRailSystem() <em>Rail System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRailSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean railSystem = RAIL_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isAgricultural() <em>Agricultural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgricultural()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGRICULTURAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAgricultural() <em>Agricultural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgricultural()
	 * @generated
	 * @ordered
	 */
	protected boolean agricultural = AGRICULTURAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.SAFETY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMachinery() {
		return machinery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachinery(boolean newMachinery) {
		boolean oldMachinery = machinery;
		machinery = newMachinery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__MACHINERY, oldMachinery, machinery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isToy() {
		return toy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToy(boolean newToy) {
		boolean oldToy = toy;
		toy = newToy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__TOY, oldToy, toy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElevator() {
		return elevator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElevator(boolean newElevator) {
		boolean oldElevator = elevator;
		elevator = newElevator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__ELEVATOR, oldElevator, elevator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMedical() {
		return medical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedical(boolean newMedical) {
		boolean oldMedical = medical;
		medical = newMedical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__MEDICAL, oldMedical, medical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInVitroDiagnostics() {
		return inVitroDiagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInVitroDiagnostics(boolean newInVitroDiagnostics) {
		boolean oldInVitroDiagnostics = inVitroDiagnostics;
		inVitroDiagnostics = newInVitroDiagnostics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS, oldInVitroDiagnostics, inVitroDiagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersonalProtective() {
		return personalProtective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalProtective(boolean newPersonalProtective) {
		boolean oldPersonalProtective = personalProtective;
		personalProtective = newPersonalProtective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__PERSONAL_PROTECTIVE, oldPersonalProtective, personalProtective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCivilAviation() {
		return civilAviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCivilAviation(boolean newCivilAviation) {
		boolean oldCivilAviation = civilAviation;
		civilAviation = newCivilAviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__CIVIL_AVIATION, oldCivilAviation, civilAviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRailSystem() {
		return railSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRailSystem(boolean newRailSystem) {
		boolean oldRailSystem = railSystem;
		railSystem = newRailSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__RAIL_SYSTEM, oldRailSystem, railSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAgricultural() {
		return agricultural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgricultural(boolean newAgricultural) {
		boolean oldAgricultural = agricultural;
		agricultural = newAgricultural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__AGRICULTURAL, oldAgricultural, agricultural));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MACHINERY:
				return isMachinery();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__TOY:
				return isToy();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__ELEVATOR:
				return isElevator();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MEDICAL:
				return isMedical();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS:
				return isInVitroDiagnostics();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__PERSONAL_PROTECTIVE:
				return isPersonalProtective();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__CIVIL_AVIATION:
				return isCivilAviation();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__RAIL_SYSTEM:
				return isRailSystem();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__AGRICULTURAL:
				return isAgricultural();
			case EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MACHINERY:
				setMachinery((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__TOY:
				setToy((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__ELEVATOR:
				setElevator((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MEDICAL:
				setMedical((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS:
				setInVitroDiagnostics((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__PERSONAL_PROTECTIVE:
				setPersonalProtective((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__CIVIL_AVIATION:
				setCivilAviation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__RAIL_SYSTEM:
				setRailSystem((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__AGRICULTURAL:
				setAgricultural((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MACHINERY:
				setMachinery(MACHINERY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__TOY:
				setToy(TOY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__ELEVATOR:
				setElevator(ELEVATOR_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MEDICAL:
				setMedical(MEDICAL_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS:
				setInVitroDiagnostics(IN_VITRO_DIAGNOSTICS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__PERSONAL_PROTECTIVE:
				setPersonalProtective(PERSONAL_PROTECTIVE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__CIVIL_AVIATION:
				setCivilAviation(CIVIL_AVIATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__RAIL_SYSTEM:
				setRailSystem(RAIL_SYSTEM_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__AGRICULTURAL:
				setAgricultural(AGRICULTURAL_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MACHINERY:
				return machinery != MACHINERY_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__TOY:
				return toy != TOY_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__ELEVATOR:
				return elevator != ELEVATOR_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__MEDICAL:
				return medical != MEDICAL_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__IN_VITRO_DIAGNOSTICS:
				return inVitroDiagnostics != IN_VITRO_DIAGNOSTICS_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__PERSONAL_PROTECTIVE:
				return personalProtective != PERSONAL_PROTECTIVE_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__CIVIL_AVIATION:
				return civilAviation != CIVIL_AVIATION_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__RAIL_SYSTEM:
				return railSystem != RAIL_SYSTEM_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__AGRICULTURAL:
				return agricultural != AGRICULTURAL_EDEFAULT;
			case EuaiactcompliancePackage.SAFETY_COMPONENT__BASE_COMPONENT:
				return base_Component != null;
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
		result.append(" (Machinery: ");
		result.append(machinery);
		result.append(", Toy: ");
		result.append(toy);
		result.append(", Elevator: ");
		result.append(elevator);
		result.append(", Medical: ");
		result.append(medical);
		result.append(", InVitroDiagnostics: ");
		result.append(inVitroDiagnostics);
		result.append(", PersonalProtective: ");
		result.append(personalProtective);
		result.append(", CivilAviation: ");
		result.append(civilAviation);
		result.append(", RailSystem: ");
		result.append(railSystem);
		result.append(", Agricultural: ");
		result.append(agricultural);
		result.append(')');
		return result.toString();
	}

} //SafetyComponentImpl
