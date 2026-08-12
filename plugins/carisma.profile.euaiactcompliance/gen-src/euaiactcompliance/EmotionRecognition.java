/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotion Recognition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isEducation <em>Education</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isWorkplace <em>Workplace</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isMedicalOrSafetyReason <em>Medical Or Safety Reason</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#getExceptionJustificatio <em>Exception Justificatio</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition()
 * @model
 * @generated
 */
public interface EmotionRecognition extends EObject {
	/**
	 * Returns the value of the '<em><b>Education</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education</em>' attribute.
	 * @see #setEducation(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Education()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEducation();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isEducation <em>Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education</em>' attribute.
	 * @see #isEducation()
	 * @generated
	 */
	void setEducation(boolean value);

	/**
	 * Returns the value of the '<em><b>Workplace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workplace</em>' attribute.
	 * @see #setWorkplace(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Workplace()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isWorkplace();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isWorkplace <em>Workplace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workplace</em>' attribute.
	 * @see #isWorkplace()
	 * @generated
	 */
	void setWorkplace(boolean value);

	/**
	 * Returns the value of the '<em><b>Medical Or Safety Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medical Or Safety Reason</em>' attribute.
	 * @see #setMedicalOrSafetyReason(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_MedicalOrSafetyReason()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMedicalOrSafetyReason();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isMedicalOrSafetyReason <em>Medical Or Safety Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical Or Safety Reason</em>' attribute.
	 * @see #isMedicalOrSafetyReason()
	 * @generated
	 */
	void setMedicalOrSafetyReason(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Exception Justificatio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justificatio</em>' attribute.
	 * @see #setExceptionJustificatio(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_ExceptionJustificatio()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustificatio();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#getExceptionJustificatio <em>Exception Justificatio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justificatio</em>' attribute.
	 * @see #getExceptionJustificatio()
	 * @generated
	 */
	void setExceptionJustificatio(String value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link euaiactcompliance.Exception}.
	 * The literals are from the enumeration {@link euaiactcompliance.Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see euaiactcompliance.Exception
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Exception()
	 * @model ordered="false"
	 * @generated
	 */
	EList<euaiactcompliance.Exception> getException();

} // EmotionRecognition
