/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotion Recognition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isRace <em>Race</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isPolitics <em>Politics</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isUnionMembership <em>Union Membership</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isReligion <em>Religion</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#isSexuality <em>Sexuality</em>}</li>
 *   <li>{@link euaiactcompliance.EmotionRecognition#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition()
 * @model
 * @generated
 */
public interface EmotionRecognition extends EObject {
	/**
	 * Returns the value of the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Race</em>' attribute.
	 * @see #setRace(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Race()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRace();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isRace <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race</em>' attribute.
	 * @see #isRace()
	 * @generated
	 */
	void setRace(boolean value);

	/**
	 * Returns the value of the '<em><b>Politics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Politics</em>' attribute.
	 * @see #setPolitics(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Politics()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPolitics();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isPolitics <em>Politics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Politics</em>' attribute.
	 * @see #isPolitics()
	 * @generated
	 */
	void setPolitics(boolean value);

	/**
	 * Returns the value of the '<em><b>Union Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Membership</em>' attribute.
	 * @see #setUnionMembership(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_UnionMembership()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnionMembership();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isUnionMembership <em>Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union Membership</em>' attribute.
	 * @see #isUnionMembership()
	 * @generated
	 */
	void setUnionMembership(boolean value);

	/**
	 * Returns the value of the '<em><b>Religion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Religion</em>' attribute.
	 * @see #setReligion(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Religion()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReligion();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isReligion <em>Religion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Religion</em>' attribute.
	 * @see #isReligion()
	 * @generated
	 */
	void setReligion(boolean value);

	/**
	 * Returns the value of the '<em><b>Sexuality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexuality</em>' attribute.
	 * @see #setSexuality(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Sexuality()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSexuality();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#isSexuality <em>Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexuality</em>' attribute.
	 * @see #isSexuality()
	 * @generated
	 */
	void setSexuality(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEmotionRecognition_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EmotionRecognition#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // EmotionRecognition
