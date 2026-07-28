/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.ManipulativeBehaviour;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manipulative Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.ManipulativeBehaviourImpl#isSubliminalTechniques <em>Subliminal Techniques</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ManipulativeBehaviourImpl#isDeceptiveTechniques <em>Deceptive Techniques</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ManipulativeBehaviourImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManipulativeBehaviourImpl extends MinimalEObjectImpl.Container implements ManipulativeBehaviour {
	/**
	 * The default value of the '{@link #isSubliminalTechniques() <em>Subliminal Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubliminalTechniques()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBLIMINAL_TECHNIQUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubliminalTechniques() <em>Subliminal Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubliminalTechniques()
	 * @generated
	 * @ordered
	 */
	protected boolean subliminalTechniques = SUBLIMINAL_TECHNIQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeceptiveTechniques() <em>Deceptive Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeceptiveTechniques()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECEPTIVE_TECHNIQUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeceptiveTechniques() <em>Deceptive Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeceptiveTechniques()
	 * @generated
	 * @ordered
	 */
	protected boolean deceptiveTechniques = DECEPTIVE_TECHNIQUES_EDEFAULT;

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
	protected ManipulativeBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.MANIPULATIVE_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSubliminalTechniques() {
		return subliminalTechniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubliminalTechniques(boolean newSubliminalTechniques) {
		boolean oldSubliminalTechniques = subliminalTechniques;
		subliminalTechniques = newSubliminalTechniques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES, oldSubliminalTechniques, subliminalTechniques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeceptiveTechniques() {
		return deceptiveTechniques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeceptiveTechniques(boolean newDeceptiveTechniques) {
		boolean oldDeceptiveTechniques = deceptiveTechniques;
		deceptiveTechniques = newDeceptiveTechniques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES, oldDeceptiveTechniques, deceptiveTechniques));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES:
				return isSubliminalTechniques();
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES:
				return isDeceptiveTechniques();
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES:
				setSubliminalTechniques((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES:
				setDeceptiveTechniques((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES:
				setSubliminalTechniques(SUBLIMINAL_TECHNIQUES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES:
				setDeceptiveTechniques(DECEPTIVE_TECHNIQUES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__SUBLIMINAL_TECHNIQUES:
				return subliminalTechniques != SUBLIMINAL_TECHNIQUES_EDEFAULT;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__DECEPTIVE_TECHNIQUES:
				return deceptiveTechniques != DECEPTIVE_TECHNIQUES_EDEFAULT;
			case EuaiactcompliancePackage.MANIPULATIVE_BEHAVIOUR__BASE_USE_CASE:
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
		result.append(" (SubliminalTechniques: ");
		result.append(subliminalTechniques);
		result.append(", DeceptiveTechniques: ");
		result.append(deceptiveTechniques);
		result.append(')');
		return result.toString();
	}

} //ManipulativeBehaviourImpl
