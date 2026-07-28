/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.LawEnforcement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Law Enforcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isVictimRiskAssessment <em>Victim Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isLieDetection <em>Lie Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isEvidenceReliability <em>Evidence Reliability</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isOffendingRiskAssessment <em>Offending Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isSolelyProfilingBased <em>Solely Profiling Based</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.LawEnforcementImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LawEnforcementImpl extends MinimalEObjectImpl.Container implements LawEnforcement {
	/**
	 * The default value of the '{@link #isVictimRiskAssessment() <em>Victim Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictimRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VICTIM_RISK_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVictimRiskAssessment() <em>Victim Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictimRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean victimRiskAssessment = VICTIM_RISK_ASSESSMENT_EDEFAULT;

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
	 * The default value of the '{@link #isEvidenceReliability() <em>Evidence Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvidenceReliability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVIDENCE_RELIABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvidenceReliability() <em>Evidence Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvidenceReliability()
	 * @generated
	 * @ordered
	 */
	protected boolean evidenceReliability = EVIDENCE_RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOffendingRiskAssessment() <em>Offending Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffendingRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OFFENDING_RISK_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOffendingRiskAssessment() <em>Offending Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffendingRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean offendingRiskAssessment = OFFENDING_RISK_ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSolelyProfilingBased() <em>Solely Profiling Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolelyProfilingBased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLELY_PROFILING_BASED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSolelyProfilingBased() <em>Solely Profiling Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSolelyProfilingBased()
	 * @generated
	 * @ordered
	 */
	protected boolean solelyProfilingBased = SOLELY_PROFILING_BASED_EDEFAULT;

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
	protected LawEnforcementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.LAW_ENFORCEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVictimRiskAssessment() {
		return victimRiskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVictimRiskAssessment(boolean newVictimRiskAssessment) {
		boolean oldVictimRiskAssessment = victimRiskAssessment;
		victimRiskAssessment = newVictimRiskAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT, oldVictimRiskAssessment, victimRiskAssessment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__LIE_DETECTION, oldLieDetection, lieDetection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEvidenceReliability() {
		return evidenceReliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvidenceReliability(boolean newEvidenceReliability) {
		boolean oldEvidenceReliability = evidenceReliability;
		evidenceReliability = newEvidenceReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__EVIDENCE_RELIABILITY, oldEvidenceReliability, evidenceReliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOffendingRiskAssessment() {
		return offendingRiskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffendingRiskAssessment(boolean newOffendingRiskAssessment) {
		boolean oldOffendingRiskAssessment = offendingRiskAssessment;
		offendingRiskAssessment = newOffendingRiskAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT, oldOffendingRiskAssessment, offendingRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSolelyProfilingBased() {
		return solelyProfilingBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolelyProfilingBased(boolean newSolelyProfilingBased) {
		boolean oldSolelyProfilingBased = solelyProfilingBased;
		solelyProfilingBased = newSolelyProfilingBased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__SOLELY_PROFILING_BASED, oldSolelyProfilingBased, solelyProfilingBased));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT:
				return isVictimRiskAssessment();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__LIE_DETECTION:
				return isLieDetection();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EVIDENCE_RELIABILITY:
				return isEvidenceReliability();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT:
				return isOffendingRiskAssessment();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__SOLELY_PROFILING_BASED:
				return isSolelyProfilingBased();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT:
				setVictimRiskAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__LIE_DETECTION:
				setLieDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EVIDENCE_RELIABILITY:
				setEvidenceReliability((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT:
				setOffendingRiskAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__SOLELY_PROFILING_BASED:
				setSolelyProfilingBased((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT:
				setVictimRiskAssessment(VICTIM_RISK_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__LIE_DETECTION:
				setLieDetection(LIE_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EVIDENCE_RELIABILITY:
				setEvidenceReliability(EVIDENCE_RELIABILITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT:
				setOffendingRiskAssessment(OFFENDING_RISK_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__SOLELY_PROFILING_BASED:
				setSolelyProfilingBased(SOLELY_PROFILING_BASED_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__VICTIM_RISK_ASSESSMENT:
				return victimRiskAssessment != VICTIM_RISK_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__LIE_DETECTION:
				return lieDetection != LIE_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EVIDENCE_RELIABILITY:
				return evidenceReliability != EVIDENCE_RELIABILITY_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__OFFENDING_RISK_ASSESSMENT:
				return offendingRiskAssessment != OFFENDING_RISK_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__SOLELY_PROFILING_BASED:
				return solelyProfilingBased != SOLELY_PROFILING_BASED_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.LAW_ENFORCEMENT__BASE_USE_CASE:
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
		result.append(" (VictimRiskAssessment: ");
		result.append(victimRiskAssessment);
		result.append(", LieDetection: ");
		result.append(lieDetection);
		result.append(", EvidenceReliability: ");
		result.append(evidenceReliability);
		result.append(", OffendingRiskAssessment: ");
		result.append(offendingRiskAssessment);
		result.append(", SolelyProfilingBased: ");
		result.append(solelyProfilingBased);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(')');
		return result.toString();
	}

} //LawEnforcementImpl
