/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.MigrationBorder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.MigrationBorderImpl#getBase_UseCase <em>Base Use Case</em>}</li>
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
	 * The default value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPROVES_HUMAN_ACTIVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean improvesHumanActivity = IMPROVES_HUMAN_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NARROW_PROCEDURAL_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected boolean narrowProceduralTask = NARROW_PROCEDURAL_TASK_EDEFAULT;

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
	 * The default value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPARATORY_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected boolean preparatoryTask = PREPARATORY_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #isDecisionPatternDetection() <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecisionPatternDetection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECISION_PATTERN_DETECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDecisionPatternDetection() <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecisionPatternDetection()
	 * @generated
	 * @ordered
	 */
	protected boolean decisionPatternDetection = DECISION_PATTERN_DETECTION_EDEFAULT;

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
	public boolean isImprovesHumanActivity() {
		return improvesHumanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImprovesHumanActivity(boolean newImprovesHumanActivity) {
		boolean oldImprovesHumanActivity = improvesHumanActivity;
		improvesHumanActivity = newImprovesHumanActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNarrowProceduralTask() {
		return narrowProceduralTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNarrowProceduralTask(boolean newNarrowProceduralTask) {
		boolean oldNarrowProceduralTask = narrowProceduralTask;
		narrowProceduralTask = newNarrowProceduralTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
	public boolean isPreparatoryTask() {
		return preparatoryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreparatoryTask(boolean newPreparatoryTask) {
		boolean oldPreparatoryTask = preparatoryTask;
		preparatoryTask = newPreparatoryTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDecisionPatternDetection() {
		return decisionPatternDetection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionPatternDetection(boolean newDecisionPatternDetection) {
		boolean oldDecisionPatternDetection = decisionPatternDetection;
		decisionPatternDetection = newDecisionPatternDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.MIGRATION_BORDER__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.MIGRATION_BORDER__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.MIGRATION_BORDER__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.MIGRATION_BORDER__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.MIGRATION_BORDER__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.MIGRATION_BORDER__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.MIGRATION_BORDER__BASE_USE_CASE:
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
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(')');
		return result.toString();
	}

} //MigrationBorderImpl
