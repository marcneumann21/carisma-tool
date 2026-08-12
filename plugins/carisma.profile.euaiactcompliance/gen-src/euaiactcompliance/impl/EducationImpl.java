/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.Education;
import euaiactcompliance.EuaiactcompliancePackage;

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
 * An implementation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#isAccessAdmission <em>Access Admission</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#isLearningOutcomeEvaluation <em>Learning Outcome Evaluation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#isEducationLevelAssessment <em>Education Level Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#isExamMonitoring <em>Exam Monitoring</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EducationImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationImpl extends MinimalEObjectImpl.Container implements Education {
	/**
	 * The default value of the '{@link #isAccessAdmission() <em>Access Admission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessAdmission()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESS_ADMISSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccessAdmission() <em>Access Admission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessAdmission()
	 * @generated
	 * @ordered
	 */
	protected boolean accessAdmission = ACCESS_ADMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isLearningOutcomeEvaluation() <em>Learning Outcome Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearningOutcomeEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEARNING_OUTCOME_EVALUATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLearningOutcomeEvaluation() <em>Learning Outcome Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearningOutcomeEvaluation()
	 * @generated
	 * @ordered
	 */
	protected boolean learningOutcomeEvaluation = LEARNING_OUTCOME_EVALUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEducationLevelAssessment() <em>Education Level Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducationLevelAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDUCATION_LEVEL_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEducationLevelAssessment() <em>Education Level Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducationLevelAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean educationLevelAssessment = EDUCATION_LEVEL_ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isExamMonitoring() <em>Exam Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExamMonitoring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXAM_MONITORING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExamMonitoring() <em>Exam Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExamMonitoring()
	 * @generated
	 * @ordered
	 */
	protected boolean examMonitoring = EXAM_MONITORING_EDEFAULT;

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
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<euaiactcompliance.Exception> exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.EDUCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccessAdmission() {
		return accessAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessAdmission(boolean newAccessAdmission) {
		boolean oldAccessAdmission = accessAdmission;
		accessAdmission = newAccessAdmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__ACCESS_ADMISSION, oldAccessAdmission, accessAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLearningOutcomeEvaluation() {
		return learningOutcomeEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearningOutcomeEvaluation(boolean newLearningOutcomeEvaluation) {
		boolean oldLearningOutcomeEvaluation = learningOutcomeEvaluation;
		learningOutcomeEvaluation = newLearningOutcomeEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__LEARNING_OUTCOME_EVALUATION, oldLearningOutcomeEvaluation, learningOutcomeEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEducationLevelAssessment() {
		return educationLevelAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEducationLevelAssessment(boolean newEducationLevelAssessment) {
		boolean oldEducationLevelAssessment = educationLevelAssessment;
		educationLevelAssessment = newEducationLevelAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__EDUCATION_LEVEL_ASSESSMENT, oldEducationLevelAssessment, educationLevelAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExamMonitoring() {
		return examMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExamMonitoring(boolean newExamMonitoring) {
		boolean oldExamMonitoring = examMonitoring;
		examMonitoring = newExamMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__EXAM_MONITORING, oldExamMonitoring, examMonitoring));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EDUCATION__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.EDUCATION__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.EDUCATION__ACCESS_ADMISSION:
				return isAccessAdmission();
			case EuaiactcompliancePackage.EDUCATION__LEARNING_OUTCOME_EVALUATION:
				return isLearningOutcomeEvaluation();
			case EuaiactcompliancePackage.EDUCATION__EDUCATION_LEVEL_ASSESSMENT:
				return isEducationLevelAssessment();
			case EuaiactcompliancePackage.EDUCATION__EXAM_MONITORING:
				return isExamMonitoring();
			case EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION:
				return getException();
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
			case EuaiactcompliancePackage.EDUCATION__ACCESS_ADMISSION:
				setAccessAdmission((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__LEARNING_OUTCOME_EVALUATION:
				setLearningOutcomeEvaluation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__EDUCATION_LEVEL_ASSESSMENT:
				setEducationLevelAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXAM_MONITORING:
				setExamMonitoring((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends euaiactcompliance.Exception>)newValue);
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
			case EuaiactcompliancePackage.EDUCATION__ACCESS_ADMISSION:
				setAccessAdmission(ACCESS_ADMISSION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EDUCATION__LEARNING_OUTCOME_EVALUATION:
				setLearningOutcomeEvaluation(LEARNING_OUTCOME_EVALUATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EDUCATION__EDUCATION_LEVEL_ASSESSMENT:
				setEducationLevelAssessment(EDUCATION_LEVEL_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXAM_MONITORING:
				setExamMonitoring(EXAM_MONITORING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION:
				getException().clear();
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
			case EuaiactcompliancePackage.EDUCATION__ACCESS_ADMISSION:
				return accessAdmission != ACCESS_ADMISSION_EDEFAULT;
			case EuaiactcompliancePackage.EDUCATION__LEARNING_OUTCOME_EVALUATION:
				return learningOutcomeEvaluation != LEARNING_OUTCOME_EVALUATION_EDEFAULT;
			case EuaiactcompliancePackage.EDUCATION__EDUCATION_LEVEL_ASSESSMENT:
				return educationLevelAssessment != EDUCATION_LEVEL_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.EDUCATION__EXAM_MONITORING:
				return examMonitoring != EXAM_MONITORING_EDEFAULT;
			case EuaiactcompliancePackage.EDUCATION__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.EDUCATION__EXCEPTION:
				return exception != null && !exception.isEmpty();
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
		result.append(" (AccessAdmission: ");
		result.append(accessAdmission);
		result.append(", LearningOutcomeEvaluation: ");
		result.append(learningOutcomeEvaluation);
		result.append(", EducationLevelAssessment: ");
		result.append(educationLevelAssessment);
		result.append(", ExamMonitoring: ");
		result.append(examMonitoring);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", Exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} //EducationImpl
