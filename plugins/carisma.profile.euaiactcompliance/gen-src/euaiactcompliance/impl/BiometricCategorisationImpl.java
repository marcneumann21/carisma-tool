/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.BiometricCategorisation;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biometric Categorisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isLawfullyAcquiredDatasets <em>Lawfully Acquired Datasets</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isLawEnforcement <em>Law Enforcement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiometricCategorisationImpl extends MinimalEObjectImpl.Container implements BiometricCategorisation {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The default value of the '{@link #isLawfullyAcquiredDatasets() <em>Lawfully Acquired Datasets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawfullyAcquiredDatasets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAWFULLY_ACQUIRED_DATASETS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawfullyAcquiredDatasets() <em>Lawfully Acquired Datasets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawfullyAcquiredDatasets()
	 * @generated
	 * @ordered
	 */
	protected boolean lawfullyAcquiredDatasets = LAWFULLY_ACQUIRED_DATASETS_EDEFAULT;

	/**
	 * The default value of the '{@link #isLawEnforcement() <em>Law Enforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_ENFORCEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawEnforcement() <em>Law Enforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcement()
	 * @generated
	 * @ordered
	 */
	protected boolean lawEnforcement = LAW_ENFORCEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiometricCategorisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.BIOMETRIC_CATEGORISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawfullyAcquiredDatasets() {
		return lawfullyAcquiredDatasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawfullyAcquiredDatasets(boolean newLawfullyAcquiredDatasets) {
		boolean oldLawfullyAcquiredDatasets = lawfullyAcquiredDatasets;
		lawfullyAcquiredDatasets = newLawfullyAcquiredDatasets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS, oldLawfullyAcquiredDatasets, lawfullyAcquiredDatasets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawEnforcement() {
		return lawEnforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawEnforcement(boolean newLawEnforcement) {
		boolean oldLawEnforcement = lawEnforcement;
		lawEnforcement = newLawEnforcement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT, oldLawEnforcement, lawEnforcement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS:
				return isLawfullyAcquiredDatasets();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT:
				return isLawEnforcement();
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS:
				setLawfullyAcquiredDatasets((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT:
				setLawEnforcement((Boolean)newValue);
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS:
				setLawfullyAcquiredDatasets(LAWFULLY_ACQUIRED_DATASETS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT:
				setLawEnforcement(LAW_ENFORCEMENT_EDEFAULT);
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFULLY_ACQUIRED_DATASETS:
				return lawfullyAcquiredDatasets != LAWFULLY_ACQUIRED_DATASETS_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT:
				return lawEnforcement != LAW_ENFORCEMENT_EDEFAULT;
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
		result.append(" (LawfullyAcquiredDatasets: ");
		result.append(lawfullyAcquiredDatasets);
		result.append(", LawEnforcement: ");
		result.append(lawEnforcement);
		result.append(')');
		return result.toString();
	}

} //BiometricCategorisationImpl
