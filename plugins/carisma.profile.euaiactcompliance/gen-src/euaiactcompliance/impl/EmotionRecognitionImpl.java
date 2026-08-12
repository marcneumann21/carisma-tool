/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EmotionRecognition;
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
 * An implementation of the model object '<em><b>Emotion Recognition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isEducation <em>Education</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isWorkplace <em>Workplace</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#isMedicalOrSafetyReason <em>Medical Or Safety Reason</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#getExceptionJustificatio <em>Exception Justificatio</em>}</li>
 *   <li>{@link euaiactcompliance.impl.EmotionRecognitionImpl#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmotionRecognitionImpl extends MinimalEObjectImpl.Container implements EmotionRecognition {
	/**
	 * The default value of the '{@link #isEducation() <em>Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDUCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEducation() <em>Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducation()
	 * @generated
	 * @ordered
	 */
	protected boolean education = EDUCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isWorkplace() <em>Workplace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorkplace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WORKPLACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWorkplace() <em>Workplace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorkplace()
	 * @generated
	 * @ordered
	 */
	protected boolean workplace = WORKPLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMedicalOrSafetyReason() <em>Medical Or Safety Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMedicalOrSafetyReason()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEDICAL_OR_SAFETY_REASON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMedicalOrSafetyReason() <em>Medical Or Safety Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMedicalOrSafetyReason()
	 * @generated
	 * @ordered
	 */
	protected boolean medicalOrSafetyReason = MEDICAL_OR_SAFETY_REASON_EDEFAULT;

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
	 * The default value of the '{@link #getExceptionJustificatio() <em>Exception Justificatio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustificatio()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_JUSTIFICATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionJustificatio() <em>Exception Justificatio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustificatio()
	 * @generated
	 * @ordered
	 */
	protected String exceptionJustificatio = EXCEPTION_JUSTIFICATIO_EDEFAULT;

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
	public boolean isEducation() {
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEducation(boolean newEducation) {
		boolean oldEducation = education;
		education = newEducation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__EDUCATION, oldEducation, education));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWorkplace() {
		return workplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkplace(boolean newWorkplace) {
		boolean oldWorkplace = workplace;
		workplace = newWorkplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__WORKPLACE, oldWorkplace, workplace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMedicalOrSafetyReason() {
		return medicalOrSafetyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedicalOrSafetyReason(boolean newMedicalOrSafetyReason) {
		boolean oldMedicalOrSafetyReason = medicalOrSafetyReason;
		medicalOrSafetyReason = newMedicalOrSafetyReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON, oldMedicalOrSafetyReason, medicalOrSafetyReason));
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
	public String getExceptionJustificatio() {
		return exceptionJustificatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionJustificatio(String newExceptionJustificatio) {
		String oldExceptionJustificatio = exceptionJustificatio;
		exceptionJustificatio = newExceptionJustificatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO, oldExceptionJustificatio, exceptionJustificatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION);
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EDUCATION:
				return isEducation();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__WORKPLACE:
				return isWorkplace();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON:
				return isMedicalOrSafetyReason();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO:
				return getExceptionJustificatio();
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EDUCATION:
				setEducation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__WORKPLACE:
				setWorkplace((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON:
				setMedicalOrSafetyReason((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO:
				setExceptionJustificatio((String)newValue);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EDUCATION:
				setEducation(EDUCATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__WORKPLACE:
				setWorkplace(WORKPLACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON:
				setMedicalOrSafetyReason(MEDICAL_OR_SAFETY_REASON_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO:
				setExceptionJustificatio(EXCEPTION_JUSTIFICATIO_EDEFAULT);
				return;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION:
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
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EDUCATION:
				return education != EDUCATION_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__WORKPLACE:
				return workplace != WORKPLACE_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__MEDICAL_OR_SAFETY_REASON:
				return medicalOrSafetyReason != MEDICAL_OR_SAFETY_REASON_EDEFAULT;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION_JUSTIFICATIO:
				return EXCEPTION_JUSTIFICATIO_EDEFAULT == null ? exceptionJustificatio != null : !EXCEPTION_JUSTIFICATIO_EDEFAULT.equals(exceptionJustificatio);
			case EuaiactcompliancePackage.EMOTION_RECOGNITION__EXCEPTION:
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
		result.append(" (Education: ");
		result.append(education);
		result.append(", Workplace: ");
		result.append(workplace);
		result.append(", MedicalOrSafetyReason: ");
		result.append(medicalOrSafetyReason);
		result.append(", ExceptionJustificatio: ");
		result.append(exceptionJustificatio);
		result.append(", Exception: ");
		result.append(exception);
		result.append(')');
		return result.toString();
	}

} //EmotionRecognitionImpl
