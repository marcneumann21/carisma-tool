/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manipulative Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.ManipulativeBehaviour#isSubliminalTechniques <em>Subliminal Techniques</em>}</li>
 *   <li>{@link euaiactcompliance.ManipulativeBehaviour#isDeceptiveTechniques <em>Deceptive Techniques</em>}</li>
 *   <li>{@link euaiactcompliance.ManipulativeBehaviour#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getManipulativeBehaviour()
 * @model
 * @generated
 */
public interface ManipulativeBehaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Subliminal Techniques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subliminal Techniques</em>' attribute.
	 * @see #setSubliminalTechniques(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getManipulativeBehaviour_SubliminalTechniques()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSubliminalTechniques();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ManipulativeBehaviour#isSubliminalTechniques <em>Subliminal Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subliminal Techniques</em>' attribute.
	 * @see #isSubliminalTechniques()
	 * @generated
	 */
	void setSubliminalTechniques(boolean value);

	/**
	 * Returns the value of the '<em><b>Deceptive Techniques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceptive Techniques</em>' attribute.
	 * @see #setDeceptiveTechniques(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getManipulativeBehaviour_DeceptiveTechniques()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeceptiveTechniques();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ManipulativeBehaviour#isDeceptiveTechniques <em>Deceptive Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceptive Techniques</em>' attribute.
	 * @see #isDeceptiveTechniques()
	 * @generated
	 */
	void setDeceptiveTechniques(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getManipulativeBehaviour_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.ManipulativeBehaviour#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // ManipulativeBehaviour
