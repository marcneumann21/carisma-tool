/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.DetailedDescriptionAISystem;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Description AI System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#isCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#isAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#isPredictableRisks <em>Predictable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#isHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#isInputSpecification <em>Input Specification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedDescriptionAISystemImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailedDescriptionAISystemImpl extends MinimalEObjectImpl.Container implements DetailedDescriptionAISystem {
	/**
	 * The default value of the '{@link #isCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPABILITIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapabilities()
	 * @generated
	 * @ordered
	 */
	protected boolean capabilities = CAPABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCURACY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccuracy()
	 * @generated
	 * @ordered
	 */
	protected boolean accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredictableRisks() <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredictableRisks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDICTABLE_RISKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredictableRisks() <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredictableRisks()
	 * @generated
	 * @ordered
	 */
	protected boolean predictableRisks = PREDICTABLE_RISKS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHumanOversightPostAssessment() <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanOversightPostAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHumanOversightPostAssessment() <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanOversightPostAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean humanOversightPostAssessment = HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInputSpecification() <em>Input Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_SPECIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputSpecification() <em>Input Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputSpecification()
	 * @generated
	 * @ordered
	 */
	protected boolean inputSpecification = INPUT_SPECIFICATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailedDescriptionAISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.DETAILED_DESCRIPTION_AI_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapabilities(boolean newCapabilities) {
		boolean oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccuracy(boolean newAccuracy) {
		boolean oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredictableRisks() {
		return predictableRisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredictableRisks(boolean newPredictableRisks) {
		boolean oldPredictableRisks = predictableRisks;
		predictableRisks = newPredictableRisks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS, oldPredictableRisks, predictableRisks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHumanOversightPostAssessment() {
		return humanOversightPostAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanOversightPostAssessment(boolean newHumanOversightPostAssessment) {
		boolean oldHumanOversightPostAssessment = humanOversightPostAssessment;
		humanOversightPostAssessment = newHumanOversightPostAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT, oldHumanOversightPostAssessment, humanOversightPostAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInputSpecification() {
		return inputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputSpecification(boolean newInputSpecification) {
		boolean oldInputSpecification = inputSpecification;
		inputSpecification = newInputSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION, oldInputSpecification, inputSpecification));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES:
				return isCapabilities();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY:
				return isAccuracy();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS:
				return isPredictableRisks();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				return isHumanOversightPostAssessment();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION:
				return isInputSpecification();
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
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
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES:
				setCapabilities((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY:
				setAccuracy((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS:
				setPredictableRisks((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				setHumanOversightPostAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION:
				setInputSpecification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
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
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES:
				setCapabilities(CAPABILITIES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS:
				setPredictableRisks(PREDICTABLE_RISKS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				setHumanOversightPostAssessment(HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION:
				setInputSpecification(INPUT_SPECIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
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
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__CAPABILITIES:
				return capabilities != CAPABILITIES_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__PREDICTABLE_RISKS:
				return predictableRisks != PREDICTABLE_RISKS_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__HUMAN_OVERSIGHT_POST_ASSESSMENT:
				return humanOversightPostAssessment != HUMAN_OVERSIGHT_POST_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__INPUT_SPECIFICATION:
				return inputSpecification != INPUT_SPECIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_DESCRIPTION_AI_SYSTEM__BASE_ARTIFACT:
				return base_Artifact != null;
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
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", Accuracy: ");
		result.append(accuracy);
		result.append(", PredictableRisks: ");
		result.append(predictableRisks);
		result.append(", HumanOversightPostAssessment: ");
		result.append(humanOversightPostAssessment);
		result.append(", InputSpecification: ");
		result.append(inputSpecification);
		result.append(')');
		return result.toString();
	}

} //DetailedDescriptionAISystemImpl
