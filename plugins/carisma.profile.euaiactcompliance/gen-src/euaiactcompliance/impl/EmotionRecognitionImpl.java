/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EmotionRecognition;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emotion Recognition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isRace <em>Race</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isPolitics <em>Politics</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isUnionMembership <em>Union Membership</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isReligion <em>Religion</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isSexuality <em>Sexuality</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmotionRecognitionImpl extends MinimalEObjectImpl.Container implements EmotionRecognition {
	/**
	 * The default value of the '{@link #isRace() <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRace() <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRace()
	 * @generated
	 * @ordered
	 */
	protected boolean race = RACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPolitics() <em>Politics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolitics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POLITICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPolitics() <em>Politics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolitics()
	 * @generated
	 * @ordered
	 */
	protected boolean politics = POLITICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnionMembership() <em>Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnionMembership()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNION_MEMBERSHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnionMembership() <em>Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnionMembership()
	 * @generated
	 * @ordered
	 */
	protected boolean unionMembership = UNION_MEMBERSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #isReligion() <em>Religion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReligion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELIGION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReligion() <em>Religion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReligion()
	 * @generated
	 * @ordered
	 */
	protected boolean religion = RELIGION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSexuality() <em>Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSexuality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEXUALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSexuality() <em>Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSexuality()
	 * @generated
	 * @ordered
	 */
	protected boolean sexuality = SEXUALITY_EDEFAULT;

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
	protected EmotionRecognitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.EMOTION_RECOGNITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRace() {
		return race;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRace(boolean newRace) {
		boolean oldRace = race;
		race = newRace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__RACE, oldRace, race));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPolitics() {
		return politics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolitics(boolean newPolitics) {
		boolean oldPolitics = politics;
		politics = newPolitics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__POLITICS, oldPolitics, politics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnionMembership() {
		return unionMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnionMembership(boolean newUnionMembership) {
		boolean oldUnionMembership = unionMembership;
		unionMembership = newUnionMembership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__UNION_MEMBERSHIP, oldUnionMembership, unionMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReligion() {
		return religion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReligion(boolean newReligion) {
		boolean oldReligion = religion;
		religion = newReligion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__RELIGION, oldReligion, religion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSexuality() {
		return sexuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSexuality(boolean newSexuality) {
		boolean oldSexuality = sexuality;
		sexuality = newSexuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__SEXUALITY, oldSexuality, sexuality));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RACE:
				return isRace();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__POLITICS:
				return isPolitics();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__UNION_MEMBERSHIP:
				return isUnionMembership();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RELIGION:
				return isReligion();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__SEXUALITY:
				return isSexuality();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RACE:
				setRace((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__POLITICS:
				setPolitics((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__UNION_MEMBERSHIP:
				setUnionMembership((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RELIGION:
				setReligion((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__SEXUALITY:
				setSexuality((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RACE:
				setRace(RACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__POLITICS:
				setPolitics(POLITICS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__UNION_MEMBERSHIP:
				setUnionMembership(UNION_MEMBERSHIP_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RELIGION:
				setReligion(RELIGION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__SEXUALITY:
				setSexuality(SEXUALITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RACE:
				return race != RACE_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__POLITICS:
				return politics != POLITICS_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__UNION_MEMBERSHIP:
				return unionMembership != UNION_MEMBERSHIP_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__RELIGION:
				return religion != RELIGION_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__SEXUALITY:
				return sexuality != SEXUALITY_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
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
		result.append(" (Race: ");
		result.append(race);
		result.append(", Politics: ");
		result.append(politics);
		result.append(", UnionMembership: ");
		result.append(unionMembership);
		result.append(", Religion: ");
		result.append(religion);
		result.append(", Sexuality: ");
		result.append(sexuality);
		result.append(')');
		return result.toString();
	}

} //EmotionRecognitionImpl
