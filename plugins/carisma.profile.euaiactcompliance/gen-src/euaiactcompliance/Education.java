/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.Education#isAccessAdmission <em>Access Admission</em>}</li>
 *   <li>{@link euaiactcompliance.Education#isLearningOutcomeEvaluation <em>Learning Outcome Evaluation</em>}</li>
 *   <li>{@link euaiactcompliance.Education#isEducationLevelAssessment <em>Education Level Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.Education#isExamMonitoring <em>Exam Monitoring</em>}</li>
 *   <li>{@link euaiactcompliance.Education#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.Education#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.Education#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation()
 * @model
 * @generated
 */
public interface Education extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Admission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Admission</em>' attribute.
	 * @see #setAccessAdmission(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_AccessAdmission()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAccessAdmission();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#isAccessAdmission <em>Access Admission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Admission</em>' attribute.
	 * @see #isAccessAdmission()
	 * @generated
	 */
	void setAccessAdmission(boolean value);

	/**
	 * Returns the value of the '<em><b>Learning Outcome Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning Outcome Evaluation</em>' attribute.
	 * @see #setLearningOutcomeEvaluation(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_LearningOutcomeEvaluation()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLearningOutcomeEvaluation();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#isLearningOutcomeEvaluation <em>Learning Outcome Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning Outcome Evaluation</em>' attribute.
	 * @see #isLearningOutcomeEvaluation()
	 * @generated
	 */
	void setLearningOutcomeEvaluation(boolean value);

	/**
	 * Returns the value of the '<em><b>Education Level Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Level Assessment</em>' attribute.
	 * @see #setEducationLevelAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_EducationLevelAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEducationLevelAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#isEducationLevelAssessment <em>Education Level Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level Assessment</em>' attribute.
	 * @see #isEducationLevelAssessment()
	 * @generated
	 */
	void setEducationLevelAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Exam Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Monitoring</em>' attribute.
	 * @see #setExamMonitoring(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_ExamMonitoring()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isExamMonitoring();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#isExamMonitoring <em>Exam Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Monitoring</em>' attribute.
	 * @see #isExamMonitoring()
	 * @generated
	 */
	void setExamMonitoring(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Education#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link euaiactcompliance.Exception}.
	 * The literals are from the enumeration {@link euaiactcompliance.Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see euaiactcompliance.Exception
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEducation_Exception()
	 * @model ordered="false"
	 * @generated
	 */
	EList<euaiactcompliance.Exception> getException();

} // Education
