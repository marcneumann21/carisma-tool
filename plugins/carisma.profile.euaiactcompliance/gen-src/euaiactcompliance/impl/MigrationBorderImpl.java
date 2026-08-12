/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.MigrationBorder;

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
 * An implementation of the model object '<em><b>Migration Border</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isLieDetection <em>Lie Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isEntryRiskAssessment <em>Entry Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isAsylumVisaResidencePermitsApplication <em>Asylum Visa Residence Permits Application</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isTravelDocumentVerificationOnly <em>Travel Document Verification Only</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isPersonIdentification <em>Person Identification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrationBorderImpl extends MinimalEObjectImpl.Container implements MigrationBorder {
	/**
	 * The default value of the '{@link #isLieDetection() <em>Lie Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLieDetection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIE_DETECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLieDetection() <em>Lie Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLieDetection()
	 * @generated
	 * @ordered
	 */
	protected boolean lieDetection = LIE_DETECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEntryRiskAssessment() <em>Entry Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTRY_RISK_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntryRiskAssessment() <em>Entry Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntryRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean entryRiskAssessment = ENTRY_RISK_ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsylumVisaResidencePermitsApplication() <em>Asylum Visa Residence Permits Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsylumVisaResidencePermitsApplication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsylumVisaResidencePermitsApplication() <em>Asylum Visa Residence Permits Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsylumVisaResidencePermitsApplication()
	 * @generated
	 * @ordered
	 */
	protected boolean asylumVisaResidencePermitsApplication = ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTravelDocumentVerificationOnly() <em>Travel Document Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTravelDocumentVerificationOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAVEL_DOCUMENT_VERIFICATION_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTravelDocumentVerificationOnly() <em>Travel Document Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTravelDocumentVerificationOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean travelDocumentVerificationOnly = TRAVEL_DOCUMENT_VERIFICATION_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersonIdentification() <em>Person Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSON_IDENTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersonIdentification() <em>Person Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonIdentification()
	 * @generated
	 * @ordered
	 */
	protected boolean personIdentification = PERSON_IDENTIFICATION_EDEFAULT;

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
	protected MigrationBorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.MIGRATION_BORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLieDetection() {
		return lieDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLieDetection(boolean newLieDetection) {
		boolean oldLieDetection = lieDetection;
		lieDetection = newLieDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__LIE_DETECTION, oldLieDetection, lieDetection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEntryRiskAssessment() {
		return entryRiskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryRiskAssessment(boolean newEntryRiskAssessment) {
		boolean oldEntryRiskAssessment = entryRiskAssessment;
		entryRiskAssessment = newEntryRiskAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT, oldEntryRiskAssessment, entryRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAsylumVisaResidencePermitsApplication() {
		return asylumVisaResidencePermitsApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsylumVisaResidencePermitsApplication(boolean newAsylumVisaResidencePermitsApplication) {
		boolean oldAsylumVisaResidencePermitsApplication = asylumVisaResidencePermitsApplication;
		asylumVisaResidencePermitsApplication = newAsylumVisaResidencePermitsApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION, oldAsylumVisaResidencePermitsApplication, asylumVisaResidencePermitsApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTravelDocumentVerificationOnly() {
		return travelDocumentVerificationOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTravelDocumentVerificationOnly(boolean newTravelDocumentVerificationOnly) {
		boolean oldTravelDocumentVerificationOnly = travelDocumentVerificationOnly;
		travelDocumentVerificationOnly = newTravelDocumentVerificationOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY, oldTravelDocumentVerificationOnly, travelDocumentVerificationOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersonIdentification() {
		return personIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonIdentification(boolean newPersonIdentification) {
		boolean oldPersonIdentification = personIdentification;
		personIdentification = newPersonIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__PERSON_IDENTIFICATION, oldPersonIdentification, personIdentification));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.MIGRATION_BORDER__LIE_DETECTION:
				return isLieDetection();
			case EuaiactcompliancePackage.MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT:
				return isEntryRiskAssessment();
			case EuaiactcompliancePackage.MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION:
				return isAsylumVisaResidencePermitsApplication();
			case EuaiactcompliancePackage.MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY:
				return isTravelDocumentVerificationOnly();
			case EuaiactcompliancePackage.MIGRATION_BORDER__PERSON_IDENTIFICATION:
				return isPersonIdentification();
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION:
				return getException();
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__LIE_DETECTION:
				setLieDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT:
				setEntryRiskAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION:
				setAsylumVisaResidencePermitsApplication((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY:
				setTravelDocumentVerificationOnly((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__PERSON_IDENTIFICATION:
				setPersonIdentification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends euaiactcompliance.Exception>)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__LIE_DETECTION:
				setLieDetection(LIE_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT:
				setEntryRiskAssessment(ENTRY_RISK_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION:
				setAsylumVisaResidencePermitsApplication(ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY:
				setTravelDocumentVerificationOnly(TRAVEL_DOCUMENT_VERIFICATION_ONLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__PERSON_IDENTIFICATION:
				setPersonIdentification(PERSON_IDENTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION:
				getException().clear();
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__LIE_DETECTION:
				return lieDetection != LIE_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ENTRY_RISK_ASSESSMENT:
				return entryRiskAssessment != ENTRY_RISK_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION:
				return asylumVisaResidencePermitsApplication != ASYLUM_VISA_RESIDENCE_PERMITS_APPLICATION_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__TRAVEL_DOCUMENT_VERIFICATION_ONLY:
				return travelDocumentVerificationOnly != TRAVEL_DOCUMENT_VERIFICATION_ONLY_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__PERSON_IDENTIFICATION:
				return personIdentification != PERSON_IDENTIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
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
		result.append(" (LieDetection: ");
		result.append(lieDetection);
		result.append(", EntryRiskAssessment: ");
		result.append(entryRiskAssessment);
		result.append(", AsylumVisaResidencePermitsApplication: ");
		result.append(asylumVisaResidencePermitsApplication);
		result.append(", TravelDocumentVerificationOnly: ");
		result.append(travelDocumentVerificationOnly);
		result.append(", PersonIdentification: ");
		result.append(personIdentification);
		result.append(", Exception: ");
		result.append(exception);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(')');
		return result.toString();
	}

} //MigrationBorderImpl
