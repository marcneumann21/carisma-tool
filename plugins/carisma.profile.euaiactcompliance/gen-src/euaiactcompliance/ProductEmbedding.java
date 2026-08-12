/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Embedding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.ProductEmbedding#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.ProductEmbedding#isFailureEndangerSafety <em>Failure Endanger Safety</em>}</li>
 *   <li>{@link euaiactcompliance.ProductEmbedding#isThirdPartyConformityAssessment <em>Third Party Conformity Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.ProductEmbedding#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link euaiactcompliance.ProductEmbedding#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding()
 * @model
 * @generated
 */
public interface ProductEmbedding extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ProductEmbedding#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Failure Endanger Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Endanger Safety</em>' attribute.
	 * @see #setFailureEndangerSafety(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding_FailureEndangerSafety()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFailureEndangerSafety();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ProductEmbedding#isFailureEndangerSafety <em>Failure Endanger Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Endanger Safety</em>' attribute.
	 * @see #isFailureEndangerSafety()
	 * @generated
	 */
	void setFailureEndangerSafety(boolean value);

	/**
	 * Returns the value of the '<em><b>Third Party Conformity Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Conformity Assessment</em>' attribute.
	 * @see #setThirdPartyConformityAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding_ThirdPartyConformityAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isThirdPartyConformityAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ProductEmbedding#isThirdPartyConformityAssessment <em>Third Party Conformity Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Conformity Assessment</em>' attribute.
	 * @see #isThirdPartyConformityAssessment()
	 * @generated
	 */
	void setThirdPartyConformityAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' attribute list.
	 * The list contents are of type {@link euaiactcompliance.ProductCategory}.
	 * The literals are from the enumeration {@link euaiactcompliance.ProductCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' attribute list.
	 * @see euaiactcompliance.ProductCategory
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding_ProductCategory()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<ProductCategory> getProductCategory();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link euaiactcompliance.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see euaiactcompliance.Role
	 * @see #setRole(Role)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProductEmbedding_Role()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ProductEmbedding#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see euaiactcompliance.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // ProductEmbedding
