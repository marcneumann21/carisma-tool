/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Employment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.HumanEmployment#isRecruitment <em>Recruitment</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#isWorkConditionsDecisions <em>Work Conditions Decisions</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.HumanEmployment#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment()
 * @model
 * @generated
 */
public interface HumanEmployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Recruitment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recruitment</em>' attribute.
	 * @see #setRecruitment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_Recruitment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRecruitment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isRecruitment <em>Recruitment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recruitment</em>' attribute.
	 * @see #isRecruitment()
	 * @generated
	 */
	void setRecruitment(boolean value);

	/**
	 * Returns the value of the '<em><b>Work Conditions Decisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Conditions Decisions</em>' attribute.
	 * @see #setWorkConditionsDecisions(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_WorkConditionsDecisions()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isWorkConditionsDecisions();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isWorkConditionsDecisions <em>Work Conditions Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Conditions Decisions</em>' attribute.
	 * @see #isWorkConditionsDecisions()
	 * @generated
	 */
	void setWorkConditionsDecisions(boolean value);

	/**
	 * Returns the value of the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #setDecisionPatternDetection(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_DecisionPatternDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDecisionPatternDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isDecisionPatternDetection <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #isDecisionPatternDetection()
	 * @generated
	 */
	void setDecisionPatternDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #setImprovesHumanActivity(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_ImprovesHumanActivity()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImprovesHumanActivity();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isImprovesHumanActivity <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #isImprovesHumanActivity()
	 * @generated
	 */
	void setImprovesHumanActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparatory Task</em>' attribute.
	 * @see #setPreparatoryTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_PreparatoryTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPreparatoryTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isPreparatoryTask <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparatory Task</em>' attribute.
	 * @see #isPreparatoryTask()
	 * @generated
	 */
	void setPreparatoryTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #setNarrowProceduralTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_NarrowProceduralTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNarrowProceduralTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#isNarrowProceduralTask <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #isNarrowProceduralTask()
	 * @generated
	 */
	void setNarrowProceduralTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanEmployment_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanEmployment#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // HumanEmployment
