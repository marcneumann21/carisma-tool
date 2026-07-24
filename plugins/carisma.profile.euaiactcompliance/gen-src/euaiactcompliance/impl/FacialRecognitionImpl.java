/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.FacialRecognition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facial Recognition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.FacialRecognitionImpl#isInternet <em>Internet</em>}</li>
 *   <li>{@link euaiactcompliance.impl.FacialRecognitionImpl#isCCTV <em>CCTV</em>}</li>
 *   <li>{@link euaiactcompliance.impl.FacialRecognitionImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacialRecognitionImpl extends MinimalEObjectImpl.Container implements FacialRecognition {
	/**
	 * The default value of the '{@link #isInternet() <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERNET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInternet() <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInternet()
	 * @generated
	 * @ordered
	 */
	protected boolean internet = INTERNET_EDEFAULT;

	/**
	 * The default value of the '{@link #isCCTV() <em>CCTV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCCTV()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CCTV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCCTV() <em>CCTV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCCTV()
	 * @generated
	 * @ordered
	 */
	protected boolean cctv = CCTV_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacialRecognitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.FACIAL_RECOGNITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInternet() {
		return internet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternet(boolean newInternet) {
		boolean oldInternet = internet;
		internet = newInternet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.FACIAL_RECOGNITION__INTERNET, oldInternet, internet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCCTV() {
		return cctv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCTV(boolean newCCTV) {
		boolean oldCCTV = cctv;
		cctv = newCCTV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.FACIAL_RECOGNITION__CCTV, oldCCTV, cctv));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__INTERNET:
				return isInternet();
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__CCTV:
				return isCCTV();
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
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
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__INTERNET:
				setInternet((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__CCTV:
				setCCTV((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
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
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__INTERNET:
				setInternet(INTERNET_EDEFAULT);
				return;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__CCTV:
				setCCTV(CCTV_EDEFAULT);
				return;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
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
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__INTERNET:
				return internet != INTERNET_EDEFAULT;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__CCTV:
				return cctv != CCTV_EDEFAULT;
			case EuaiactcompliancePackage.FACIAL_RECOGNITION__BASE_USE_CASE:
				return base_UseCase != null;
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
		result.append(" (Internet: ");
		result.append(internet);
		result.append(", CCTV: ");
		result.append(cctv);
		result.append(')');
		return result.toString();
	}

} //FacialRecognitionImpl
