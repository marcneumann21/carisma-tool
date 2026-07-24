/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.BiometricIdentification;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biometric Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isPublicSpace <em>Public Space</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isVictimSearch <em>Victim Search</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isThreatPrevention <em>Threat Prevention</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isCriminalSuspectSearch <em>Criminal Suspect Search</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiometricIdentificationImpl extends MinimalEObjectImpl.Container implements BiometricIdentification {
	/**
	 * The default value of the '{@link #isPublicSpace() <em>Public Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicSpace() <em>Public Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean publicSpace = PUBLIC_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVictimSearch() <em>Victim Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictimSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VICTIM_SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVictimSearch() <em>Victim Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictimSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean victimSearch = VICTIM_SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreatPrevention() <em>Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreatPrevention()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAT_PREVENTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreatPrevention() <em>Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreatPrevention()
	 * @generated
	 * @ordered
	 */
	protected boolean threatPrevention = THREAT_PREVENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCriminalSuspectSearch() <em>Criminal Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriminalSuspectSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRIMINAL_SUSPECT_SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCriminalSuspectSearch() <em>Criminal Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriminalSuspectSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean criminalSuspectSearch = CRIMINAL_SUSPECT_SEARCH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiometricIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.BIOMETRIC_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPublicSpace() {
		return publicSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicSpace(boolean newPublicSpace) {
		boolean oldPublicSpace = publicSpace;
		publicSpace = newPublicSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE, oldPublicSpace, publicSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVictimSearch() {
		return victimSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVictimSearch(boolean newVictimSearch) {
		boolean oldVictimSearch = victimSearch;
		victimSearch = newVictimSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH, oldVictimSearch, victimSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThreatPrevention() {
		return threatPrevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatPrevention(boolean newThreatPrevention) {
		boolean oldThreatPrevention = threatPrevention;
		threatPrevention = newThreatPrevention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION, oldThreatPrevention, threatPrevention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCriminalSuspectSearch() {
		return criminalSuspectSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriminalSuspectSearch(boolean newCriminalSuspectSearch) {
		boolean oldCriminalSuspectSearch = criminalSuspectSearch;
		criminalSuspectSearch = newCriminalSuspectSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH, oldCriminalSuspectSearch, criminalSuspectSearch));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE:
				return isPublicSpace();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				return isVictimSearch();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION:
				return isThreatPrevention();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH:
				return isCriminalSuspectSearch();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
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
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE:
				setPublicSpace((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				setVictimSearch((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION:
				setThreatPrevention((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH:
				setCriminalSuspectSearch((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
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
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE:
				setPublicSpace(PUBLIC_SPACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				setVictimSearch(VICTIM_SEARCH_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION:
				setThreatPrevention(THREAT_PREVENTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH:
				setCriminalSuspectSearch(CRIMINAL_SUSPECT_SEARCH_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
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
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLIC_SPACE:
				return publicSpace != PUBLIC_SPACE_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				return victimSearch != VICTIM_SEARCH_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__THREAT_PREVENTION:
				return threatPrevention != THREAT_PREVENTION_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__CRIMINAL_SUSPECT_SEARCH:
				return criminalSuspectSearch != CRIMINAL_SUSPECT_SEARCH_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				return base_UseCase != null;
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
		result.append(" (PublicSpace: ");
		result.append(publicSpace);
		result.append(", VictimSearch: ");
		result.append(victimSearch);
		result.append(", ThreatPrevention: ");
		result.append(threatPrevention);
		result.append(", CriminalSuspectSearch: ");
		result.append(criminalSuspectSearch);
		result.append(')');
		return result.toString();
	}

} //BiometricIdentificationImpl
