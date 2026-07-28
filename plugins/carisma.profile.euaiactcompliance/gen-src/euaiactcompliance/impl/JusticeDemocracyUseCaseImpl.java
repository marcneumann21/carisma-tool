/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.JusticeDemocracyUseCase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justice Democracy Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isJudicialSupport <em>Judicial Support</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isElectionInfluence <em>Election Influence</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isNoDirectExposure <em>No Direct Exposure</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JusticeDemocracyUseCaseImpl extends MinimalEObjectImpl.Container implements JusticeDemocracyUseCase {
	/**
	 * The default value of the '{@link #isJudicialSupport() <em>Judicial Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJudicialSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUDICIAL_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJudicialSupport() <em>Judicial Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJudicialSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean judicialSupport = JUDICIAL_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isElectionInfluence() <em>Election Influence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectionInfluence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELECTION_INFLUENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElectionInfluence() <em>Election Influence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectionInfluence()
	 * @generated
	 * @ordered
	 */
	protected boolean electionInfluence = ELECTION_INFLUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDirectExposure() <em>No Direct Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectExposure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DIRECT_EXPOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoDirectExposure() <em>No Direct Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectExposure()
	 * @generated
	 * @ordered
	 */
	protected boolean noDirectExposure = NO_DIRECT_EXPOSURE_EDEFAULT;

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
	protected JusticeDemocracyUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.JUSTICE_DEMOCRACY_USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isJudicialSupport() {
		return judicialSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJudicialSupport(boolean newJudicialSupport) {
		boolean oldJudicialSupport = judicialSupport;
		judicialSupport = newJudicialSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT, oldJudicialSupport, judicialSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElectionInfluence() {
		return electionInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectionInfluence(boolean newElectionInfluence) {
		boolean oldElectionInfluence = electionInfluence;
		electionInfluence = newElectionInfluence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE, oldElectionInfluence, electionInfluence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoDirectExposure() {
		return noDirectExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoDirectExposure(boolean newNoDirectExposure) {
		boolean oldNoDirectExposure = noDirectExposure;
		noDirectExposure = newNoDirectExposure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE, oldNoDirectExposure, noDirectExposure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				return isJudicialSupport();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				return isElectionInfluence();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				return isNoDirectExposure();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				setJudicialSupport((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				setElectionInfluence((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				setNoDirectExposure((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				setJudicialSupport(JUDICIAL_SUPPORT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				setElectionInfluence(ELECTION_INFLUENCE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				setNoDirectExposure(NO_DIRECT_EXPOSURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				return judicialSupport != JUDICIAL_SUPPORT_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				return electionInfluence != ELECTION_INFLUENCE_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				return noDirectExposure != NO_DIRECT_EXPOSURE_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
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
		result.append(" (JudicialSupport: ");
		result.append(judicialSupport);
		result.append(", ElectionInfluence: ");
		result.append(electionInfluence);
		result.append(", NoDirectExposure: ");
		result.append(noDirectExposure);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(')');
		return result.toString();
	}

} //JusticeDemocracyUseCaseImpl
