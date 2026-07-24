/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biometric Categorisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isLawfullyAcquiredDatasets <em>Lawfully Acquired Datasets</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isLawEnforcement <em>Law Enforcement</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation()
 * @model
 * @generated
 */
public interface BiometricCategorisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Lawfully Acquired Datasets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lawfully Acquired Datasets</em>' attribute.
	 * @see #setLawfullyAcquiredDatasets(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_LawfullyAcquiredDatasets()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawfullyAcquiredDatasets();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isLawfullyAcquiredDatasets <em>Lawfully Acquired Datasets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lawfully Acquired Datasets</em>' attribute.
	 * @see #isLawfullyAcquiredDatasets()
	 * @generated
	 */
	void setLawfullyAcquiredDatasets(boolean value);

	/**
	 * Returns the value of the '<em><b>Law Enforcement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Law Enforcement</em>' attribute.
	 * @see #setLawEnforcement(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_LawEnforcement()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawEnforcement();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isLawEnforcement <em>Law Enforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Law Enforcement</em>' attribute.
	 * @see #isLawEnforcement()
	 * @generated
	 */
	void setLawEnforcement(boolean value);

} // BiometricCategorisation
