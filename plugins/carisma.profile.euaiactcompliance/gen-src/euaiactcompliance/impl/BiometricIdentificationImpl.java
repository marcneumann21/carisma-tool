/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.BiometricIdentification;
import euaiactcompliance.EuaiactcompliancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biometric Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isVerificationOnly <em>Verification Only</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isRealTime <em>Real Time</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isPubliclyAccessibleSpace <em>Publicly Accessible Space</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isLawEnforcementPurpose <em>Law Enforcement Purpose</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isVictimSearch <em>Victim Search</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isImminentThreatPrevention <em>Imminent Threat Prevention</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#isSeriousCrimeSuspectSearch <em>Serious Crime Suspect Search</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricIdentificationImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiometricIdentificationImpl extends MinimalEObjectImpl.Container implements BiometricIdentification {
	/**
	 * The default value of the '{@link #isVerificationOnly() <em>Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerificationOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFICATION_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerificationOnly() <em>Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerificationOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean verificationOnly = VERIFICATION_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRealTime() <em>Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REAL_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRealTime() <em>Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTime()
	 * @generated
	 * @ordered
	 */
	protected boolean realTime = REAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPubliclyAccessibleSpace() <em>Publicly Accessible Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPubliclyAccessibleSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLICLY_ACCESSIBLE_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPubliclyAccessibleSpace() <em>Publicly Accessible Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPubliclyAccessibleSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean publiclyAccessibleSpace = PUBLICLY_ACCESSIBLE_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLawEnforcementPurpose() <em>Law Enforcement Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_ENFORCEMENT_PURPOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawEnforcementPurpose() <em>Law Enforcement Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementPurpose()
	 * @generated
	 * @ordered
	 */
	protected boolean lawEnforcementPurpose = LAW_ENFORCEMENT_PURPOSE_EDEFAULT;

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
	 * The default value of the '{@link #isImminentThreatPrevention() <em>Imminent Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImminentThreatPrevention()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMINENT_THREAT_PREVENTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImminentThreatPrevention() <em>Imminent Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImminentThreatPrevention()
	 * @generated
	 * @ordered
	 */
	protected boolean imminentThreatPrevention = IMMINENT_THREAT_PREVENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeriousCrimeSuspectSearch() <em>Serious Crime Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeriousCrimeSuspectSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIOUS_CRIME_SUSPECT_SEARCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeriousCrimeSuspectSearch() <em>Serious Crime Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeriousCrimeSuspectSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean seriousCrimeSuspectSearch = SERIOUS_CRIME_SUSPECT_SEARCH_EDEFAULT;

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
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<euaiactcompliance.Exception> exception;

	/**
	 * The default value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected String exceptionJustification = EXCEPTION_JUSTIFICATION_EDEFAULT;

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
	public boolean isVerificationOnly() {
		return verificationOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerificationOnly(boolean newVerificationOnly) {
		boolean oldVerificationOnly = verificationOnly;
		verificationOnly = newVerificationOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY, oldVerificationOnly, verificationOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRealTime() {
		return realTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealTime(boolean newRealTime) {
		boolean oldRealTime = realTime;
		realTime = newRealTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__REAL_TIME, oldRealTime, realTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPubliclyAccessibleSpace() {
		return publiclyAccessibleSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubliclyAccessibleSpace(boolean newPubliclyAccessibleSpace) {
		boolean oldPubliclyAccessibleSpace = publiclyAccessibleSpace;
		publiclyAccessibleSpace = newPubliclyAccessibleSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE, oldPubliclyAccessibleSpace, publiclyAccessibleSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawEnforcementPurpose() {
		return lawEnforcementPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawEnforcementPurpose(boolean newLawEnforcementPurpose) {
		boolean oldLawEnforcementPurpose = lawEnforcementPurpose;
		lawEnforcementPurpose = newLawEnforcementPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE, oldLawEnforcementPurpose, lawEnforcementPurpose));
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
	public boolean isImminentThreatPrevention() {
		return imminentThreatPrevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImminentThreatPrevention(boolean newImminentThreatPrevention) {
		boolean oldImminentThreatPrevention = imminentThreatPrevention;
		imminentThreatPrevention = newImminentThreatPrevention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION, oldImminentThreatPrevention, imminentThreatPrevention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSeriousCrimeSuspectSearch() {
		return seriousCrimeSuspectSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeriousCrimeSuspectSearch(boolean newSeriousCrimeSuspectSearch) {
		boolean oldSeriousCrimeSuspectSearch = seriousCrimeSuspectSearch;
		seriousCrimeSuspectSearch = newSeriousCrimeSuspectSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH, oldSeriousCrimeSuspectSearch, seriousCrimeSuspectSearch));
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
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionJustification() {
		return exceptionJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionJustification(String newExceptionJustification) {
		String oldExceptionJustification = exceptionJustification;
		exceptionJustification = newExceptionJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY:
				return isVerificationOnly();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__REAL_TIME:
				return isRealTime();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE:
				return isPubliclyAccessibleSpace();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE:
				return isLawEnforcementPurpose();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				return isVictimSearch();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION:
				return isImminentThreatPrevention();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH:
				return isSeriousCrimeSuspectSearch();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION:
				return getException();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY:
				setVerificationOnly((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__REAL_TIME:
				setRealTime((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE:
				setPubliclyAccessibleSpace((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE:
				setLawEnforcementPurpose((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				setVictimSearch((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION:
				setImminentThreatPrevention((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH:
				setSeriousCrimeSuspectSearch((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends euaiactcompliance.Exception>)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
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
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY:
				setVerificationOnly(VERIFICATION_ONLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__REAL_TIME:
				setRealTime(REAL_TIME_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE:
				setPubliclyAccessibleSpace(PUBLICLY_ACCESSIBLE_SPACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE:
				setLawEnforcementPurpose(LAW_ENFORCEMENT_PURPOSE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				setVictimSearch(VICTIM_SEARCH_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION:
				setImminentThreatPrevention(IMMINENT_THREAT_PREVENTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH:
				setSeriousCrimeSuspectSearch(SERIOUS_CRIME_SUSPECT_SEARCH_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION:
				getException().clear();
				return;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
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
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VERIFICATION_ONLY:
				return verificationOnly != VERIFICATION_ONLY_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__REAL_TIME:
				return realTime != REAL_TIME_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__PUBLICLY_ACCESSIBLE_SPACE:
				return publiclyAccessibleSpace != PUBLICLY_ACCESSIBLE_SPACE_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__LAW_ENFORCEMENT_PURPOSE:
				return lawEnforcementPurpose != LAW_ENFORCEMENT_PURPOSE_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__VICTIM_SEARCH:
				return victimSearch != VICTIM_SEARCH_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__IMMINENT_THREAT_PREVENTION:
				return imminentThreatPrevention != IMMINENT_THREAT_PREVENTION_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__SERIOUS_CRIME_SUSPECT_SEARCH:
				return seriousCrimeSuspectSearch != SERIOUS_CRIME_SUSPECT_SEARCH_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case EuaiactcompliancePackage.BIOMETRIC_IDENTIFICATION__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
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
		result.append(" (VerificationOnly: ");
		result.append(verificationOnly);
		result.append(", RealTime: ");
		result.append(realTime);
		result.append(", PubliclyAccessibleSpace: ");
		result.append(publiclyAccessibleSpace);
		result.append(", LawEnforcementPurpose: ");
		result.append(lawEnforcementPurpose);
		result.append(", VictimSearch: ");
		result.append(victimSearch);
		result.append(", ImminentThreatPrevention: ");
		result.append(imminentThreatPrevention);
		result.append(", SeriousCrimeSuspectSearch: ");
		result.append(seriousCrimeSuspectSearch);
		result.append(", Exception: ");
		result.append(exception);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(')');
		return result.toString();
	}

} //BiometricIdentificationImpl
