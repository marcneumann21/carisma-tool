/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.TransparencyObligation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transparency Obligation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isHumanInteraction <em>Human Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isSyntheticContent <em>Synthetic Content</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isEmotionRecognitionNotification <em>Emotion Recognition Notification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isBiometricCategorizationNotification <em>Biometric Categorization Notification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isDeepfake <em>Deepfake</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TransparencyObligationImpl#isPublicInterestText <em>Public Interest Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransparencyObligationImpl extends MinimalEObjectImpl.Container implements TransparencyObligation {
	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * The default value of the '{@link #isHumanInteraction() <em>Human Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_INTERACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHumanInteraction() <em>Human Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanInteraction()
	 * @generated
	 * @ordered
	 */
	protected boolean humanInteraction = HUMAN_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSyntheticContent() <em>Synthetic Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyntheticContent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNTHETIC_CONTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSyntheticContent() <em>Synthetic Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyntheticContent()
	 * @generated
	 * @ordered
	 */
	protected boolean syntheticContent = SYNTHETIC_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmotionRecognitionNotification() <em>Emotion Recognition Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmotionRecognitionNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMOTION_RECOGNITION_NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmotionRecognitionNotification() <em>Emotion Recognition Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmotionRecognitionNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean emotionRecognitionNotification = EMOTION_RECOGNITION_NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBiometricCategorizationNotification() <em>Biometric Categorization Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricCategorizationNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIOMETRIC_CATEGORIZATION_NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBiometricCategorizationNotification() <em>Biometric Categorization Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricCategorizationNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean biometricCategorizationNotification = BIOMETRIC_CATEGORIZATION_NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeepfake() <em>Deepfake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepfake()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEEPFAKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeepfake() <em>Deepfake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeepfake()
	 * @generated
	 * @ordered
	 */
	protected boolean deepfake = DEEPFAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublicInterestText() <em>Public Interest Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicInterestText()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_INTEREST_TEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicInterestText() <em>Public Interest Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicInterestText()
	 * @generated
	 * @ordered
	 */
	protected boolean publicInterestText = PUBLIC_INTEREST_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransparencyObligationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.TRANSPARENCY_OBLIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHumanInteraction() {
		return humanInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanInteraction(boolean newHumanInteraction) {
		boolean oldHumanInteraction = humanInteraction;
		humanInteraction = newHumanInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION, oldHumanInteraction, humanInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSyntheticContent() {
		return syntheticContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyntheticContent(boolean newSyntheticContent) {
		boolean oldSyntheticContent = syntheticContent;
		syntheticContent = newSyntheticContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT, oldSyntheticContent, syntheticContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmotionRecognitionNotification() {
		return emotionRecognitionNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmotionRecognitionNotification(boolean newEmotionRecognitionNotification) {
		boolean oldEmotionRecognitionNotification = emotionRecognitionNotification;
		emotionRecognitionNotification = newEmotionRecognitionNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION, oldEmotionRecognitionNotification, emotionRecognitionNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBiometricCategorizationNotification() {
		return biometricCategorizationNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiometricCategorizationNotification(boolean newBiometricCategorizationNotification) {
		boolean oldBiometricCategorizationNotification = biometricCategorizationNotification;
		biometricCategorizationNotification = newBiometricCategorizationNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION, oldBiometricCategorizationNotification, biometricCategorizationNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeepfake() {
		return deepfake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeepfake(boolean newDeepfake) {
		boolean oldDeepfake = deepfake;
		deepfake = newDeepfake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__DEEPFAKE, oldDeepfake, deepfake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPublicInterestText() {
		return publicInterestText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicInterestText(boolean newPublicInterestText) {
		boolean oldPublicInterestText = publicInterestText;
		publicInterestText = newPublicInterestText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT, oldPublicInterestText, publicInterestText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION:
				return isHumanInteraction();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT:
				return isSyntheticContent();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION:
				return isEmotionRecognitionNotification();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION:
				return isBiometricCategorizationNotification();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__DEEPFAKE:
				return isDeepfake();
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT:
				return isPublicInterestText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION:
				setHumanInteraction((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT:
				setSyntheticContent((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION:
				setEmotionRecognitionNotification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION:
				setBiometricCategorizationNotification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__DEEPFAKE:
				setDeepfake((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT:
				setPublicInterestText((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION:
				setHumanInteraction(HUMAN_INTERACTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT:
				setSyntheticContent(SYNTHETIC_CONTENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION:
				setEmotionRecognitionNotification(EMOTION_RECOGNITION_NOTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION:
				setBiometricCategorizationNotification(BIOMETRIC_CATEGORIZATION_NOTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__DEEPFAKE:
				setDeepfake(DEEPFAKE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT:
				setPublicInterestText(PUBLIC_INTEREST_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BASE_ARTIFACT:
				return base_Artifact != null;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__HUMAN_INTERACTION:
				return humanInteraction != HUMAN_INTERACTION_EDEFAULT;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__SYNTHETIC_CONTENT:
				return syntheticContent != SYNTHETIC_CONTENT_EDEFAULT;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__EMOTION_RECOGNITION_NOTIFICATION:
				return emotionRecognitionNotification != EMOTION_RECOGNITION_NOTIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__BIOMETRIC_CATEGORIZATION_NOTIFICATION:
				return biometricCategorizationNotification != BIOMETRIC_CATEGORIZATION_NOTIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__DEEPFAKE:
				return deepfake != DEEPFAKE_EDEFAULT;
			case EuaiactcompliancePackage.TRANSPARENCY_OBLIGATION__PUBLIC_INTEREST_TEXT:
				return publicInterestText != PUBLIC_INTEREST_TEXT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (HumanInteraction: ");
		result.append(humanInteraction);
		result.append(", SyntheticContent: ");
		result.append(syntheticContent);
		result.append(", EmotionRecognitionNotification: ");
		result.append(emotionRecognitionNotification);
		result.append(", BiometricCategorizationNotification: ");
		result.append(biometricCategorizationNotification);
		result.append(", Deepfake: ");
		result.append(deepfake);
		result.append(", PublicInterestText: ");
		result.append(publicInterestText);
		result.append(')');
		return result.toString();
	}

} //TransparencyObligationImpl
