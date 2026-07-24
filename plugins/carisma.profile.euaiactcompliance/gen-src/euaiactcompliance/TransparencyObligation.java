/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transparency Obligation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.TransparencyObligation#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isHumanInteraction <em>Human Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isSyntheticContent <em>Synthetic Content</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isEmotionRecognitionNotification <em>Emotion Recognition Notification</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isBiometricCategorizationNotification <em>Biometric Categorization Notification</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isDeepfake <em>Deepfake</em>}</li>
 *   <li>{@link euaiactcompliance.TransparencyObligation#isPublicInterestText <em>Public Interest Text</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation()
 * @model
 * @generated
 */
public interface TransparencyObligation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_Base_Artifact()
	 * @model ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Human Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Interaction</em>' attribute.
	 * @see #setHumanInteraction(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_HumanInteraction()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isHumanInteraction();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isHumanInteraction <em>Human Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Interaction</em>' attribute.
	 * @see #isHumanInteraction()
	 * @generated
	 */
	void setHumanInteraction(boolean value);

	/**
	 * Returns the value of the '<em><b>Synthetic Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Content</em>' attribute.
	 * @see #setSyntheticContent(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_SyntheticContent()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSyntheticContent();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isSyntheticContent <em>Synthetic Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Content</em>' attribute.
	 * @see #isSyntheticContent()
	 * @generated
	 */
	void setSyntheticContent(boolean value);

	/**
	 * Returns the value of the '<em><b>Emotion Recognition Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emotion Recognition Notification</em>' attribute.
	 * @see #setEmotionRecognitionNotification(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_EmotionRecognitionNotification()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEmotionRecognitionNotification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isEmotionRecognitionNotification <em>Emotion Recognition Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emotion Recognition Notification</em>' attribute.
	 * @see #isEmotionRecognitionNotification()
	 * @generated
	 */
	void setEmotionRecognitionNotification(boolean value);

	/**
	 * Returns the value of the '<em><b>Biometric Categorization Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biometric Categorization Notification</em>' attribute.
	 * @see #setBiometricCategorizationNotification(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_BiometricCategorizationNotification()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBiometricCategorizationNotification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isBiometricCategorizationNotification <em>Biometric Categorization Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biometric Categorization Notification</em>' attribute.
	 * @see #isBiometricCategorizationNotification()
	 * @generated
	 */
	void setBiometricCategorizationNotification(boolean value);

	/**
	 * Returns the value of the '<em><b>Deepfake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deepfake</em>' attribute.
	 * @see #setDeepfake(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_Deepfake()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDeepfake();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isDeepfake <em>Deepfake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deepfake</em>' attribute.
	 * @see #isDeepfake()
	 * @generated
	 */
	void setDeepfake(boolean value);

	/**
	 * Returns the value of the '<em><b>Public Interest Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Interest Text</em>' attribute.
	 * @see #setPublicInterestText(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getTransparencyObligation_PublicInterestText()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPublicInterestText();

	/**
	 * Sets the value of the '{@link euaiactcompliance.TransparencyObligation#isPublicInterestText <em>Public Interest Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Interest Text</em>' attribute.
	 * @see #isPublicInterestText()
	 * @generated
	 */
	void setPublicInterestText(boolean value);

} // TransparencyObligation
