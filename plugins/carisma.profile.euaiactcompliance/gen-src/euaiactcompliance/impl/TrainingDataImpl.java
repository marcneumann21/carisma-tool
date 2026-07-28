/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.TrainingData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getCleaning <em>Cleaning</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getLabeling <em>Labeling</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link euaiactcompliance.impl.TrainingDataImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingDataImpl extends MinimalEObjectImpl.Container implements TrainingData {
	/**
	 * The default value of the '{@link #getCleaning() <em>Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEANING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCleaning() <em>Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaning()
	 * @generated
	 * @ordered
	 */
	protected String cleaning = CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabeling() <em>Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeling()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabeling() <em>Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeling()
	 * @generated
	 * @ordered
	 */
	protected String labeling = LABELING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected String selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

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
	protected TrainingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.TRAINING_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCleaning() {
		return cleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleaning(String newCleaning) {
		String oldCleaning = cleaning;
		cleaning = newCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__CLEANING, oldCleaning, cleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabeling() {
		return labeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabeling(String newLabeling) {
		String oldLabeling = labeling;
		labeling = newLabeling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__LABELING, oldLabeling, labeling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelection(String newSelection) {
		String oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__SCOPE, oldScope, scope));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.TRAINING_DATA__CLEANING:
				return getCleaning();
			case EuaiactcompliancePackage.TRAINING_DATA__LABELING:
				return getLabeling();
			case EuaiactcompliancePackage.TRAINING_DATA__SELECTION:
				return getSelection();
			case EuaiactcompliancePackage.TRAINING_DATA__DESCRIPTION:
				return getDescription();
			case EuaiactcompliancePackage.TRAINING_DATA__ORIGIN:
				return getOrigin();
			case EuaiactcompliancePackage.TRAINING_DATA__SCOPE:
				return getScope();
			case EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.TRAINING_DATA__CLEANING:
				setCleaning((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__LABELING:
				setLabeling((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__SELECTION:
				setSelection((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__ORIGIN:
				setOrigin((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__SCOPE:
				setScope((String)newValue);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.TRAINING_DATA__CLEANING:
				setCleaning(CLEANING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__LABELING:
				setLabeling(LABELING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.TRAINING_DATA__CLEANING:
				return CLEANING_EDEFAULT == null ? cleaning != null : !CLEANING_EDEFAULT.equals(cleaning);
			case EuaiactcompliancePackage.TRAINING_DATA__LABELING:
				return LABELING_EDEFAULT == null ? labeling != null : !LABELING_EDEFAULT.equals(labeling);
			case EuaiactcompliancePackage.TRAINING_DATA__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case EuaiactcompliancePackage.TRAINING_DATA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EuaiactcompliancePackage.TRAINING_DATA__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case EuaiactcompliancePackage.TRAINING_DATA__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case EuaiactcompliancePackage.TRAINING_DATA__BASE_ARTIFACT:
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
		result.append(" (Cleaning: ");
		result.append(cleaning);
		result.append(", Labeling: ");
		result.append(labeling);
		result.append(", Selection: ");
		result.append(selection);
		result.append(", Description: ");
		result.append(description);
		result.append(", Origin: ");
		result.append(origin);
		result.append(", Scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //TrainingDataImpl
