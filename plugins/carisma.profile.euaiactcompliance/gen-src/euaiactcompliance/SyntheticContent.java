/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synthetic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.SyntheticContent#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.SyntheticContent#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}</li>
 *   <li>{@link euaiactcompliance.SyntheticContent#isStandardEditingOnly <em>Standard Editing Only</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getSyntheticContent()
 * @model
 * @generated
 */
public interface SyntheticContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSyntheticContent_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SyntheticContent#getBase_UseCase <em>Base Use Case</em>}' reference.
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSyntheticContent_LawEnforcementAuthorised()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawEnforcementAuthorised();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SyntheticContent#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Law Enforcement Authorised</em>' attribute.
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 */
	void setLawEnforcementAuthorised(boolean value);

	/**
	 * Returns the value of the '<em><b>Standard Editing Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Editing Only</em>' attribute.
	 * @see #setStandardEditingOnly(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSyntheticContent_StandardEditingOnly()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStandardEditingOnly();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SyntheticContent#isStandardEditingOnly <em>Standard Editing Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Editing Only</em>' attribute.
	 * @see #isStandardEditingOnly()
	 * @generated
	 */
	void setStandardEditingOnly(boolean value);

} // SyntheticContent
