/**
 */
package euaiactcompliance;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isDeduceRace <em>Deduce Race</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isDeducePoliticalOpinion <em>Deduce Political Opinion</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isDeduceReligiousBelief <em>Deduce Religious Belief</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isDeduceUnionMembership <em>Deduce Union Membership</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isDeduceSexuality <em>Deduce Sexuality</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isLawfulDatasetLabeling <em>Lawful Dataset Labeling</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#isLawEnforcementCategorisation <em>Law Enforcement Categorisation</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricCategorisation#getExceptionJustification <em>Exception Justification</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation()
 * @model
 * @generated
 */
public interface BiometricCategorisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Deduce Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduce Race</em>' attribute.
	 * @see #setDeduceRace(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_DeduceRace()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeduceRace();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isDeduceRace <em>Deduce Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduce Race</em>' attribute.
	 * @see #isDeduceRace()
	 * @generated
	 */
	void setDeduceRace(boolean value);

	/**
	 * Returns the value of the '<em><b>Deduce Political Opinion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduce Political Opinion</em>' attribute.
	 * @see #setDeducePoliticalOpinion(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_DeducePoliticalOpinion()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeducePoliticalOpinion();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isDeducePoliticalOpinion <em>Deduce Political Opinion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduce Political Opinion</em>' attribute.
	 * @see #isDeducePoliticalOpinion()
	 * @generated
	 */
	void setDeducePoliticalOpinion(boolean value);

	/**
	 * Returns the value of the '<em><b>Deduce Religious Belief</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduce Religious Belief</em>' attribute.
	 * @see #setDeduceReligiousBelief(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_DeduceReligiousBelief()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeduceReligiousBelief();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isDeduceReligiousBelief <em>Deduce Religious Belief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduce Religious Belief</em>' attribute.
	 * @see #isDeduceReligiousBelief()
	 * @generated
	 */
	void setDeduceReligiousBelief(boolean value);

	/**
	 * Returns the value of the '<em><b>Deduce Union Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduce Union Membership</em>' attribute.
	 * @see #setDeduceUnionMembership(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_DeduceUnionMembership()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeduceUnionMembership();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isDeduceUnionMembership <em>Deduce Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduce Union Membership</em>' attribute.
	 * @see #isDeduceUnionMembership()
	 * @generated
	 */
	void setDeduceUnionMembership(boolean value);

	/**
	 * Returns the value of the '<em><b>Deduce Sexuality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduce Sexuality</em>' attribute.
	 * @see #setDeduceSexuality(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_DeduceSexuality()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeduceSexuality();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isDeduceSexuality <em>Deduce Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduce Sexuality</em>' attribute.
	 * @see #isDeduceSexuality()
	 * @generated
	 */
	void setDeduceSexuality(boolean value);

	/**
	 * Returns the value of the '<em><b>Lawful Dataset Labeling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lawful Dataset Labeling</em>' attribute.
	 * @see #setLawfulDatasetLabeling(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_LawfulDatasetLabeling()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawfulDatasetLabeling();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isLawfulDatasetLabeling <em>Lawful Dataset Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lawful Dataset Labeling</em>' attribute.
	 * @see #isLawfulDatasetLabeling()
	 * @generated
	 */
	void setLawfulDatasetLabeling(boolean value);

	/**
	 * Returns the value of the '<em><b>Law Enforcement Categorisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Law Enforcement Categorisation</em>' attribute.
	 * @see #setLawEnforcementCategorisation(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_LawEnforcementCategorisation()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawEnforcementCategorisation();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#isLawEnforcementCategorisation <em>Law Enforcement Categorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Law Enforcement Categorisation</em>' attribute.
	 * @see #isLawEnforcementCategorisation()
	 * @generated
	 */
	void setLawEnforcementCategorisation(boolean value);

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
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link euaiactcompliance.Exception}.
	 * The literals are from the enumeration {@link euaiactcompliance.Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see euaiactcompliance.Exception
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_Exception()
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricCategorisation_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricCategorisation#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

} // BiometricCategorisation
