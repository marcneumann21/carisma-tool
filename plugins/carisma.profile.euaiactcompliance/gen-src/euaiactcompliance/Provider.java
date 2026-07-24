/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.Provider#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getProvider_Base_Actor()
	 * @model ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link euaiactcompliance.Provider#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // Provider
