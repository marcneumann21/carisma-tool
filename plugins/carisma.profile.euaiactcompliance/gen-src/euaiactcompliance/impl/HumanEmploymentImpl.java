/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.HumanEmployment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Employment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#isRecruitment <em>Recruitment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#isWorkConditionsDecisions <em>Work Conditions Decisions</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#isPromotion <em>Promotion</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanEmploymentImpl#isTermination <em>Termination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumanEmploymentImpl extends MinimalEObjectImpl.Container implements HumanEmployment {
	/**
	 * The default value of the '{@link #isRecruitment() <em>Recruitment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecruitment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECRUITMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecruitment() <em>Recruitment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecruitment()
	 * @generated
	 * @ordered
	 */
	protected boolean recruitment = RECRUITMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isWorkConditionsDecisions() <em>Work Conditions Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorkConditionsDecisions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WORK_CONDITIONS_DECISIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWorkConditionsDecisions() <em>Work Conditions Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorkConditionsDecisions()
	 * @generated
	 * @ordered
	 */
	protected boolean workConditionsDecisions = WORK_CONDITIONS_DECISIONS_EDEFAULT;

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
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<euaiactcompliance.Exception> exception;

	/**
	 * The default value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected String exceptionJustification = EXCEPTION_JUSTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromotion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMOTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPromotion() <em>Promotion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPromotion()
	 * @generated
	 * @ordered
	 */
	protected boolean promotion = PROMOTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTermination()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTermination() <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTermination()
	 * @generated
	 * @ordered
	 */
	protected boolean termination = TERMINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanEmploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.HUMAN_EMPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRecruitment() {
		return recruitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecruitment(boolean newRecruitment) {
		boolean oldRecruitment = recruitment;
		recruitment = newRecruitment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__RECRUITMENT, oldRecruitment, recruitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWorkConditionsDecisions() {
		return workConditionsDecisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkConditionsDecisions(boolean newWorkConditionsDecisions) {
		boolean oldWorkConditionsDecisions = workConditionsDecisions;
		workConditionsDecisions = newWorkConditionsDecisions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS, oldWorkConditionsDecisions, workConditionsDecisions));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionJustification() {
		return exceptionJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionJustification(String newExceptionJustification) {
		String oldExceptionJustification = exceptionJustification;
		exceptionJustification = newExceptionJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPromotion() {
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromotion(boolean newPromotion) {
		boolean oldPromotion = promotion;
		promotion = newPromotion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__PROMOTION, oldPromotion, promotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTermination() {
		return termination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermination(boolean newTermination) {
		boolean oldTermination = termination;
		termination = newTermination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_EMPLOYMENT__TERMINATION, oldTermination, termination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__RECRUITMENT:
				return isRecruitment();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS:
				return isWorkConditionsDecisions();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION:
				return getException();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__PROMOTION:
				return isPromotion();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__TERMINATION:
				return isTermination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__RECRUITMENT:
				setRecruitment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS:
				setWorkConditionsDecisions((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends euaiactcompliance.Exception>)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__PROMOTION:
				setPromotion((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__TERMINATION:
				setTermination((Boolean)newValue);
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
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__RECRUITMENT:
				setRecruitment(RECRUITMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS:
				setWorkConditionsDecisions(WORK_CONDITIONS_DECISIONS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION:
				getException().clear();
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__PROMOTION:
				setPromotion(PROMOTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__TERMINATION:
				setTermination(TERMINATION_EDEFAULT);
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
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__RECRUITMENT:
				return recruitment != RECRUITMENT_EDEFAULT;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__WORK_CONDITIONS_DECISIONS:
				return workConditionsDecisions != WORK_CONDITIONS_DECISIONS_EDEFAULT;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__PROMOTION:
				return promotion != PROMOTION_EDEFAULT;
			case EuaiactcompliancePackage.HUMAN_EMPLOYMENT__TERMINATION:
				return termination != TERMINATION_EDEFAULT;
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
		result.append(" (Recruitment: ");
		result.append(recruitment);
		result.append(", WorkConditionsDecisions: ");
		result.append(workConditionsDecisions);
		result.append(", Exception: ");
		result.append(exception);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", Promotion: ");
		result.append(promotion);
		result.append(", Termination: ");
		result.append(termination);
		result.append(')');
		return result.toString();
	}

} //HumanEmploymentImpl
