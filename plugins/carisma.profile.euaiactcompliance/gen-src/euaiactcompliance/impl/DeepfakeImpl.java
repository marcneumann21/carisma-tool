/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.Deepfake;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deepfake</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.DeepfakeImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DeepfakeImpl#isCreativeWork <em>Creative Work</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DeepfakeImpl#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeepfakeImpl extends MinimalEObjectImpl.Container implements Deepfake {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The default value of the '{@link #isCreativeWork() <em>Creative Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreativeWork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATIVE_WORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreativeWork() <em>Creative Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreativeWork()
	 * @generated
	 * @ordered
	 */
	protected boolean creativeWork = CREATIVE_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #isLawEnforcementAuthorised() <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_ENFORCEMENT_AUTHORISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawEnforcementAuthorised() <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 * @ordered
	 */
	protected boolean lawEnforcementAuthorised = LAW_ENFORCEMENT_AUTHORISED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeepfakeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.DEEPFAKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreativeWork() {
		return creativeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreativeWork(boolean newCreativeWork) {
		boolean oldCreativeWork = creativeWork;
		creativeWork = newCreativeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DEEPFAKE__CREATIVE_WORK, oldCreativeWork, creativeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawEnforcementAuthorised() {
		return lawEnforcementAuthorised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawEnforcementAuthorised(boolean newLawEnforcementAuthorised) {
		boolean oldLawEnforcementAuthorised = lawEnforcementAuthorised;
		lawEnforcementAuthorised = newLawEnforcementAuthorised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED, oldLawEnforcementAuthorised, lawEnforcementAuthorised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.DEEPFAKE__CREATIVE_WORK:
				return isCreativeWork();
			case EuaiactcompliancePackage.DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED:
				return isLawEnforcementAuthorised();
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
			case EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.DEEPFAKE__CREATIVE_WORK:
				setCreativeWork((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED:
				setLawEnforcementAuthorised((Boolean)newValue);
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
			case EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.DEEPFAKE__CREATIVE_WORK:
				setCreativeWork(CREATIVE_WORK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED:
				setLawEnforcementAuthorised(LAW_ENFORCEMENT_AUTHORISED_EDEFAULT);
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
			case EuaiactcompliancePackage.DEEPFAKE__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.DEEPFAKE__CREATIVE_WORK:
				return creativeWork != CREATIVE_WORK_EDEFAULT;
			case EuaiactcompliancePackage.DEEPFAKE__LAW_ENFORCEMENT_AUTHORISED:
				return lawEnforcementAuthorised != LAW_ENFORCEMENT_AUTHORISED_EDEFAULT;
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
		result.append(" (CreativeWork: ");
		result.append(creativeWork);
		result.append(", LawEnforcementAuthorised: ");
		result.append(lawEnforcementAuthorised);
		result.append(')');
		return result.toString();
	}

} //DeepfakeImpl
