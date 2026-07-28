/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third Party Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.ThirdPartyComponent#getOrigin <em>Origin</em>}</li>
 *   <li>{@link euaiactcompliance.ThirdPartyComponent#getIntegrationDescription <em>Integration Description</em>}</li>
 *   <li>{@link euaiactcompliance.ThirdPartyComponent#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getThirdPartyComponent()
 * @model
 * @generated
 */
public interface ThirdPartyComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getThirdPartyComponent_Origin()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ThirdPartyComponent#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Integration Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Description</em>' attribute.
	 * @see #setIntegrationDescription(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getThirdPartyComponent_IntegrationDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIntegrationDescription();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ThirdPartyComponent#getIntegrationDescription <em>Integration Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration Description</em>' attribute.
	 * @see #getIntegrationDescription()
	 * @generated
	 */
	void setIntegrationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getThirdPartyComponent_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ThirdPartyComponent#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // ThirdPartyComponent
