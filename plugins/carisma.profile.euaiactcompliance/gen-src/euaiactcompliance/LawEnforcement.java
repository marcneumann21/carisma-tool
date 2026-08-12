/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Law Enforcement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.LawEnforcement#isVictimRiskAssessment <em>Victim Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#isLieDetection <em>Lie Detection</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#isEvidenceReliability <em>Evidence Reliability</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#isOffendingRiskAssessment <em>Offending Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#isSolelyProfilingBased <em>Solely Profiling Based</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#isSupportsHumanAssessment <em>Supports Human Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.LawEnforcement#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement()
 * @model
 * @generated
 */
public interface LawEnforcement extends EObject {
	/**
	 * Returns the value of the '<em><b>Victim Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Risk Assessment</em>' attribute.
	 * @see #setVictimRiskAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_VictimRiskAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVictimRiskAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isVictimRiskAssessment <em>Victim Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Risk Assessment</em>' attribute.
	 * @see #isVictimRiskAssessment()
	 * @generated
	 */
	void setVictimRiskAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Lie Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lie Detection</em>' attribute.
	 * @see #setLieDetection(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_LieDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLieDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isLieDetection <em>Lie Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lie Detection</em>' attribute.
	 * @see #isLieDetection()
	 * @generated
	 */
	void setLieDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Evidence Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Reliability</em>' attribute.
	 * @see #setEvidenceReliability(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_EvidenceReliability()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEvidenceReliability();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isEvidenceReliability <em>Evidence Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Reliability</em>' attribute.
	 * @see #isEvidenceReliability()
	 * @generated
	 */
	void setEvidenceReliability(boolean value);

	/**
	 * Returns the value of the '<em><b>Offending Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offending Risk Assessment</em>' attribute.
	 * @see #setOffendingRiskAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_OffendingRiskAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOffendingRiskAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isOffendingRiskAssessment <em>Offending Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offending Risk Assessment</em>' attribute.
	 * @see #isOffendingRiskAssessment()
	 * @generated
	 */
	void setOffendingRiskAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Solely Profiling Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solely Profiling Based</em>' attribute.
	 * @see #setSolelyProfilingBased(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_SolelyProfilingBased()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSolelyProfilingBased();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isSolelyProfilingBased <em>Solely Profiling Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solely Profiling Based</em>' attribute.
	 * @see #isSolelyProfilingBased()
	 * @generated
	 */
	void setSolelyProfilingBased(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Supports Human Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Human Assessment</em>' attribute.
	 * @see #setSupportsHumanAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_SupportsHumanAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSupportsHumanAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#isSupportsHumanAssessment <em>Supports Human Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Human Assessment</em>' attribute.
	 * @see #isSupportsHumanAssessment()
	 * @generated
	 */
	void setSupportsHumanAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.LawEnforcement#getExceptionJustification <em>Exception Justification</em>}' attribute.
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getLawEnforcement_Exception()
	 * @model ordered="false"
	 * @generated
	 */
	EList<euaiactcompliance.Exception> getException();

} // LawEnforcement
