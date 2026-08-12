/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.PublicInterestText;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Interest Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.PublicInterestTextImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.PublicInterestTextImpl#isHumanReview <em>Human Review</em>}</li>
 *   <li>{@link euaiactcompliance.impl.PublicInterestTextImpl#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicInterestTextImpl extends MinimalEObjectImpl.Container implements PublicInterestText {
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
	 * The default value of the '{@link #isHumanReview() <em>Human Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanReview()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_REVIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHumanReview() <em>Human Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanReview()
	 * @generated
	 * @ordered
	 */
	protected boolean humanReview = HUMAN_REVIEW_EDEFAULT;

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
	protected PublicInterestTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.PUBLIC_INTEREST_TEXT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHumanReview() {
		return humanReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanReview(boolean newHumanReview) {
		boolean oldHumanReview = humanReview;
		humanReview = newHumanReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__HUMAN_REVIEW, oldHumanReview, humanReview));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED, oldLawEnforcementAuthorised, lawEnforcementAuthorised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__HUMAN_REVIEW:
				return isHumanReview();
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED:
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
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__HUMAN_REVIEW:
				setHumanReview((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED:
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
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__HUMAN_REVIEW:
				setHumanReview(HUMAN_REVIEW_EDEFAULT);
				return;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED:
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
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__HUMAN_REVIEW:
				return humanReview != HUMAN_REVIEW_EDEFAULT;
			case EuaiactcompliancePackage.PUBLIC_INTEREST_TEXT__LAW_ENFORCEMENT_AUTHORISED:
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
		result.append(" (HumanReview: ");
		result.append(humanReview);
		result.append(", LawEnforcementAuthorised: ");
		result.append(lawEnforcementAuthorised);
		result.append(')');
		return result.toString();
	}

} //PublicInterestTextImpl
