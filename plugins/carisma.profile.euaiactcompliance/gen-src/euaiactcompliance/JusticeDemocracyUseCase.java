/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justice Democracy Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#isJudicialSupport <em>Judicial Support</em>}</li>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#isElectionInfluence <em>Election Influence</em>}</li>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#isNoDirectExposure <em>No Direct Exposure</em>}</li>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.JusticeDemocracyUseCase#getExceptionJustification <em>Exception Justification</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase()
 * @model
 * @generated
 */
public interface JusticeDemocracyUseCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Judicial Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Judicial Support</em>' attribute.
	 * @see #setJudicialSupport(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_JudicialSupport()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isJudicialSupport();

	/**
	 * Sets the value of the '{@link euaiactcompliance.JusticeDemocracyUseCase#isJudicialSupport <em>Judicial Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Judicial Support</em>' attribute.
	 * @see #isJudicialSupport()
	 * @generated
	 */
	void setJudicialSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Election Influence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Election Influence</em>' attribute.
	 * @see #setElectionInfluence(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_ElectionInfluence()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isElectionInfluence();

	/**
	 * Sets the value of the '{@link euaiactcompliance.JusticeDemocracyUseCase#isElectionInfluence <em>Election Influence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Election Influence</em>' attribute.
	 * @see #isElectionInfluence()
	 * @generated
	 */
	void setElectionInfluence(boolean value);

	/**
	 * Returns the value of the '<em><b>No Direct Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Direct Exposure</em>' attribute.
	 * @see #setNoDirectExposure(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_NoDirectExposure()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoDirectExposure();

	/**
	 * Sets the value of the '{@link euaiactcompliance.JusticeDemocracyUseCase#isNoDirectExposure <em>No Direct Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Direct Exposure</em>' attribute.
	 * @see #isNoDirectExposure()
	 * @generated
	 */
	void setNoDirectExposure(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.JusticeDemocracyUseCase#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link euaiactcompliance.Exception}.
	 * The literals are from the enumeration {@link euaiactcompliance.Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see euaiactcompliance.Exception
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_Exception()
	 * @model ordered="false"
	 * @generated
	 */
	EList<euaiactcompliance.Exception> getException();

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getJusticeDemocracyUseCase_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.JusticeDemocracyUseCase#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

} // JusticeDemocracyUseCase
