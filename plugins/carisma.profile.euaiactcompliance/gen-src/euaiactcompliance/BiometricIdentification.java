/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biometric Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isPublicSpace <em>Public Space</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isVictimSearch <em>Victim Search</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isThreatPrevention <em>Threat Prevention</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isCriminalSuspectSearch <em>Criminal Suspect Search</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification()
 * @model
 * @generated
 */
public interface BiometricIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Public Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Space</em>' attribute.
	 * @see #setPublicSpace(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_PublicSpace()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPublicSpace();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isPublicSpace <em>Public Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Space</em>' attribute.
	 * @see #isPublicSpace()
	 * @generated
	 */
	void setPublicSpace(boolean value);

	/**
	 * Returns the value of the '<em><b>Victim Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Search</em>' attribute.
	 * @see #setVictimSearch(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_VictimSearch()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVictimSearch();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isVictimSearch <em>Victim Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Search</em>' attribute.
	 * @see #isVictimSearch()
	 * @generated
	 */
	void setVictimSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Threat Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Prevention</em>' attribute.
	 * @see #setThreatPrevention(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_ThreatPrevention()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isThreatPrevention();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isThreatPrevention <em>Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Prevention</em>' attribute.
	 * @see #isThreatPrevention()
	 * @generated
	 */
	void setThreatPrevention(boolean value);

	/**
	 * Returns the value of the '<em><b>Criminal Suspect Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criminal Suspect Search</em>' attribute.
	 * @see #setCriminalSuspectSearch(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_CriminalSuspectSearch()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCriminalSuspectSearch();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isCriminalSuspectSearch <em>Criminal Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criminal Suspect Search</em>' attribute.
	 * @see #isCriminalSuspectSearch()
	 * @generated
	 */
	void setCriminalSuspectSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // BiometricIdentification
