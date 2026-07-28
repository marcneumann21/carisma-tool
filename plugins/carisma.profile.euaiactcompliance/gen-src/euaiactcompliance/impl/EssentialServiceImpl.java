/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EssentialService;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Essential Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isCreditworthiness <em>Creditworthiness</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isPublicBenefitsEligibility <em>Public Benefits Eligibility</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isFraudDetectionOnly <em>Fraud Detection Only</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isInsuranceRiskPricing <em>Insurance Risk Pricing</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EssentialServiceImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EssentialServiceImpl extends MinimalEObjectImpl.Container implements EssentialService {
	/**
	 * The default value of the '{@link #isCreditworthiness() <em>Creditworthiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreditworthiness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREDITWORTHINESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreditworthiness() <em>Creditworthiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreditworthiness()
	 * @generated
	 * @ordered
	 */
	protected boolean creditworthiness = CREDITWORTHINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublicBenefitsEligibility() <em>Public Benefits Eligibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicBenefitsEligibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_BENEFITS_ELIGIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicBenefitsEligibility() <em>Public Benefits Eligibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicBenefitsEligibility()
	 * @generated
	 * @ordered
	 */
	protected boolean publicBenefitsEligibility = PUBLIC_BENEFITS_ELIGIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFraudDetectionOnly() <em>Fraud Detection Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraudDetectionOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAUD_DETECTION_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFraudDetectionOnly() <em>Fraud Detection Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraudDetectionOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean fraudDetectionOnly = FRAUD_DETECTION_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsuranceRiskPricing() <em>Insurance Risk Pricing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsuranceRiskPricing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSURANCE_RISK_PRICING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsuranceRiskPricing() <em>Insurance Risk Pricing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsuranceRiskPricing()
	 * @generated
	 * @ordered
	 */
	protected boolean insuranceRiskPricing = INSURANCE_RISK_PRICING_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPARATORY_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected boolean preparatoryTask = PREPARATORY_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NARROW_PROCEDURAL_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected boolean narrowProceduralTask = NARROW_PROCEDURAL_TASK_EDEFAULT;

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
	 * The default value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPROVES_HUMAN_ACTIVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean improvesHumanActivity = IMPROVES_HUMAN_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDecisionPatternDetection() <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecisionPatternDetection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECISION_PATTERN_DETECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDecisionPatternDetection() <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecisionPatternDetection()
	 * @generated
	 * @ordered
	 */
	protected boolean decisionPatternDetection = DECISION_PATTERN_DETECTION_EDEFAULT;

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
	protected EssentialServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.ESSENTIAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreditworthiness() {
		return creditworthiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditworthiness(boolean newCreditworthiness) {
		boolean oldCreditworthiness = creditworthiness;
		creditworthiness = newCreditworthiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__CREDITWORTHINESS, oldCreditworthiness, creditworthiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPublicBenefitsEligibility() {
		return publicBenefitsEligibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicBenefitsEligibility(boolean newPublicBenefitsEligibility) {
		boolean oldPublicBenefitsEligibility = publicBenefitsEligibility;
		publicBenefitsEligibility = newPublicBenefitsEligibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY, oldPublicBenefitsEligibility, publicBenefitsEligibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFraudDetectionOnly() {
		return fraudDetectionOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFraudDetectionOnly(boolean newFraudDetectionOnly) {
		boolean oldFraudDetectionOnly = fraudDetectionOnly;
		fraudDetectionOnly = newFraudDetectionOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY, oldFraudDetectionOnly, fraudDetectionOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInsuranceRiskPricing() {
		return insuranceRiskPricing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuranceRiskPricing(boolean newInsuranceRiskPricing) {
		boolean oldInsuranceRiskPricing = insuranceRiskPricing;
		insuranceRiskPricing = newInsuranceRiskPricing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING, oldInsuranceRiskPricing, insuranceRiskPricing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreparatoryTask() {
		return preparatoryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreparatoryTask(boolean newPreparatoryTask) {
		boolean oldPreparatoryTask = preparatoryTask;
		preparatoryTask = newPreparatoryTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNarrowProceduralTask() {
		return narrowProceduralTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNarrowProceduralTask(boolean newNarrowProceduralTask) {
		boolean oldNarrowProceduralTask = narrowProceduralTask;
		narrowProceduralTask = newNarrowProceduralTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImprovesHumanActivity() {
		return improvesHumanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImprovesHumanActivity(boolean newImprovesHumanActivity) {
		boolean oldImprovesHumanActivity = improvesHumanActivity;
		improvesHumanActivity = newImprovesHumanActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDecisionPatternDetection() {
		return decisionPatternDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionPatternDetection(boolean newDecisionPatternDetection) {
		boolean oldDecisionPatternDetection = decisionPatternDetection;
		decisionPatternDetection = newDecisionPatternDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__CREDITWORTHINESS:
				return isCreditworthiness();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY:
				return isPublicBenefitsEligibility();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY:
				return isFraudDetectionOnly();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING:
				return isInsuranceRiskPricing();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__CREDITWORTHINESS:
				setCreditworthiness((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY:
				setPublicBenefitsEligibility((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY:
				setFraudDetectionOnly((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING:
				setInsuranceRiskPricing((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__CREDITWORTHINESS:
				setCreditworthiness(CREDITWORTHINESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY:
				setPublicBenefitsEligibility(PUBLIC_BENEFITS_ELIGIBILITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY:
				setFraudDetectionOnly(FRAUD_DETECTION_ONLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING:
				setInsuranceRiskPricing(INSURANCE_RISK_PRICING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__CREDITWORTHINESS:
				return creditworthiness != CREDITWORTHINESS_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PUBLIC_BENEFITS_ELIGIBILITY:
				return publicBenefitsEligibility != PUBLIC_BENEFITS_ELIGIBILITY_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__FRAUD_DETECTION_ONLY:
				return fraudDetectionOnly != FRAUD_DETECTION_ONLY_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__INSURANCE_RISK_PRICING:
				return insuranceRiskPricing != INSURANCE_RISK_PRICING_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.ESSENTIAL_SERVICE__BASE_USE_CASE:
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
		result.append(" (Creditworthiness: ");
		result.append(creditworthiness);
		result.append(", PublicBenefitsEligibility: ");
		result.append(publicBenefitsEligibility);
		result.append(", FraudDetectionOnly: ");
		result.append(fraudDetectionOnly);
		result.append(", InsuranceRiskPricing: ");
		result.append(insuranceRiskPricing);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(')');
		return result.toString();
	}

} //EssentialServiceImpl
