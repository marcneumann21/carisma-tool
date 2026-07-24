/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facial Recognition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.FacialRecognition#isInternet <em>Internet</em>}</li>
 *   <li>{@link euaiactcompliance.FacialRecognition#isCCTV <em>CCTV</em>}</li>
 *   <li>{@link euaiactcompliance.FacialRecognition#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getFacialRecognition()
 * @model
 * @generated
 */
public interface FacialRecognition extends EObject {
	/**
	 * Returns the value of the '<em><b>Internet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet</em>' attribute.
	 * @see #setInternet(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getFacialRecognition_Internet()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInternet();

	/**
	 * Sets the value of the '{@link euaiactcompliance.FacialRecognition#isInternet <em>Internet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet</em>' attribute.
	 * @see #isInternet()
	 * @generated
	 */
	void setInternet(boolean value);

	/**
	 * Returns the value of the '<em><b>CCTV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCTV</em>' attribute.
	 * @see #setCCTV(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getFacialRecognition_CCTV()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCCTV();

	/**
	 * Sets the value of the '{@link euaiactcompliance.FacialRecognition#isCCTV <em>CCTV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCTV</em>' attribute.
	 * @see #isCCTV()
	 * @generated
	 */
	void setCCTV(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getFacialRecognition_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.FacialRecognition#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // FacialRecognition
