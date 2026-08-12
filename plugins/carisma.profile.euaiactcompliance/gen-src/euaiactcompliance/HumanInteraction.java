/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.HumanInteraction#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.HumanInteraction#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}</li>
 *   <li>{@link euaiactcompliance.HumanInteraction#isObviousAIInteraction <em>Obvious AI Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.HumanInteraction#isPuplicCriminalOffenceReport <em>Puplic Criminal Offence Report</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanInteraction()
 * @model
 * @generated
 */
public interface HumanInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanInteraction_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanInteraction#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Law Enforcement Authorised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Law Enforcement Authorised</em>' attribute.
	 * @see #setLawEnforcementAuthorised(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanInteraction_LawEnforcementAuthorised()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawEnforcementAuthorised();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanInteraction#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Law Enforcement Authorised</em>' attribute.
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 */
	void setLawEnforcementAuthorised(boolean value);

	/**
	 * Returns the value of the '<em><b>Obvious AI Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obvious AI Interaction</em>' attribute.
	 * @see #setObviousAIInteraction(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanInteraction_ObviousAIInteraction()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isObviousAIInteraction();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanInteraction#isObviousAIInteraction <em>Obvious AI Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obvious AI Interaction</em>' attribute.
	 * @see #isObviousAIInteraction()
	 * @generated
	 */
	void setObviousAIInteraction(boolean value);

	/**
	 * Returns the value of the '<em><b>Puplic Criminal Offence Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puplic Criminal Offence Report</em>' attribute.
	 * @see #setPuplicCriminalOffenceReport(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getHumanInteraction_PuplicCriminalOffenceReport()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPuplicCriminalOffenceReport();

	/**
	 * Sets the value of the '{@link euaiactcompliance.HumanInteraction#isPuplicCriminalOffenceReport <em>Puplic Criminal Offence Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puplic Criminal Offence Report</em>' attribute.
	 * @see #isPuplicCriminalOffenceReport()
	 * @generated
	 */
	void setPuplicCriminalOffenceReport(boolean value);

} // HumanInteraction
