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
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDeduceRace <em>Deduce Race</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDeducePoliticalOpinion <em>Deduce Political Opinion</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDeduceReligiousBelief <em>Deduce Religious Belief</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDeduceUnionMembership <em>Deduce Union Membership</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDeduceSexuality <em>Deduce Sexuality</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isLawfulDatasetLabeling <em>Lawful Dataset Labeling</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isLawEnforcementCategorisation <em>Law Enforcement Categorisation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.BiometricCategorisationImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiometricCategorisationImpl extends MinimalEObjectImpl.Container implements BiometricCategorisation {
	/**
	 * The default value of the '{@link #isDeduceRace() <em>Deduce Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceRace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUCE_RACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeduceRace() <em>Deduce Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceRace()
	 * @generated
	 * @ordered
	 */
	protected boolean deduceRace = DEDUCE_RACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeducePoliticalOpinion() <em>Deduce Political Opinion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeducePoliticalOpinion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUCE_POLITICAL_OPINION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeducePoliticalOpinion() <em>Deduce Political Opinion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeducePoliticalOpinion()
	 * @generated
	 * @ordered
	 */
	protected boolean deducePoliticalOpinion = DEDUCE_POLITICAL_OPINION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeduceReligiousBelief() <em>Deduce Religious Belief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceReligiousBelief()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUCE_RELIGIOUS_BELIEF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeduceReligiousBelief() <em>Deduce Religious Belief</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceReligiousBelief()
	 * @generated
	 * @ordered
	 */
	protected boolean deduceReligiousBelief = DEDUCE_RELIGIOUS_BELIEF_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeduceUnionMembership() <em>Deduce Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceUnionMembership()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUCE_UNION_MEMBERSHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeduceUnionMembership() <em>Deduce Union Membership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceUnionMembership()
	 * @generated
	 * @ordered
	 */
	protected boolean deduceUnionMembership = DEDUCE_UNION_MEMBERSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeduceSexuality() <em>Deduce Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceSexuality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUCE_SEXUALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeduceSexuality() <em>Deduce Sexuality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduceSexuality()
	 * @generated
	 * @ordered
	 */
	protected boolean deduceSexuality = DEDUCE_SEXUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isLawfulDatasetLabeling() <em>Lawful Dataset Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawfulDatasetLabeling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAWFUL_DATASET_LABELING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawfulDatasetLabeling() <em>Lawful Dataset Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawfulDatasetLabeling()
	 * @generated
	 * @ordered
	 */
	protected boolean lawfulDatasetLabeling = LAWFUL_DATASET_LABELING_EDEFAULT;

	/**
	 * The default value of the '{@link #isLawEnforcementCategorisation() <em>Law Enforcement Categorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementCategorisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_ENFORCEMENT_CATEGORISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawEnforcementCategorisation() <em>Law Enforcement Categorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementCategorisation()
	 * @generated
	 * @ordered
	 */
	protected boolean lawEnforcementCategorisation = LAW_ENFORCEMENT_CATEGORISATION_EDEFAULT;

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
	public boolean isDeduceRace() {
		return deduceRace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduceRace(boolean newDeduceRace) {
		boolean oldDeduceRace = deduceRace;
		deduceRace = newDeduceRace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RACE, oldDeduceRace, deduceRace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeducePoliticalOpinion() {
		return deducePoliticalOpinion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeducePoliticalOpinion(boolean newDeducePoliticalOpinion) {
		boolean oldDeducePoliticalOpinion = deducePoliticalOpinion;
		deducePoliticalOpinion = newDeducePoliticalOpinion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION, oldDeducePoliticalOpinion, deducePoliticalOpinion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeduceReligiousBelief() {
		return deduceReligiousBelief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduceReligiousBelief(boolean newDeduceReligiousBelief) {
		boolean oldDeduceReligiousBelief = deduceReligiousBelief;
		deduceReligiousBelief = newDeduceReligiousBelief;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF, oldDeduceReligiousBelief, deduceReligiousBelief));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeduceUnionMembership() {
		return deduceUnionMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduceUnionMembership(boolean newDeduceUnionMembership) {
		boolean oldDeduceUnionMembership = deduceUnionMembership;
		deduceUnionMembership = newDeduceUnionMembership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP, oldDeduceUnionMembership, deduceUnionMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeduceSexuality() {
		return deduceSexuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduceSexuality(boolean newDeduceSexuality) {
		boolean oldDeduceSexuality = deduceSexuality;
		deduceSexuality = newDeduceSexuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY, oldDeduceSexuality, deduceSexuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawfulDatasetLabeling() {
		return lawfulDatasetLabeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawfulDatasetLabeling(boolean newLawfulDatasetLabeling) {
		boolean oldLawfulDatasetLabeling = lawfulDatasetLabeling;
		lawfulDatasetLabeling = newLawfulDatasetLabeling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING, oldLawfulDatasetLabeling, lawfulDatasetLabeling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawEnforcementCategorisation() {
		return lawEnforcementCategorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawEnforcementCategorisation(boolean newLawEnforcementCategorisation) {
		boolean oldLawEnforcementCategorisation = lawEnforcementCategorisation;
		lawEnforcementCategorisation = newLawEnforcementCategorisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION, oldLawEnforcementCategorisation, lawEnforcementCategorisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RACE:
				return isDeduceRace();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION:
				return isDeducePoliticalOpinion();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF:
				return isDeduceReligiousBelief();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP:
				return isDeduceUnionMembership();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY:
				return isDeduceSexuality();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING:
				return isLawfulDatasetLabeling();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION:
				return isLawEnforcementCategorisation();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RACE:
				setDeduceRace((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION:
				setDeducePoliticalOpinion((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF:
				setDeduceReligiousBelief((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP:
				setDeduceUnionMembership((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY:
				setDeduceSexuality((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING:
				setLawfulDatasetLabeling((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION:
				setLawEnforcementCategorisation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RACE:
				setDeduceRace(DEDUCE_RACE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION:
				setDeducePoliticalOpinion(DEDUCE_POLITICAL_OPINION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF:
				setDeduceReligiousBelief(DEDUCE_RELIGIOUS_BELIEF_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP:
				setDeduceUnionMembership(DEDUCE_UNION_MEMBERSHIP_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY:
				setDeduceSexuality(DEDUCE_SEXUALITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING:
				setLawfulDatasetLabeling(LAWFUL_DATASET_LABELING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION:
				setLawEnforcementCategorisation(LAW_ENFORCEMENT_CATEGORISATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RACE:
				return deduceRace != DEDUCE_RACE_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_POLITICAL_OPINION:
				return deducePoliticalOpinion != DEDUCE_POLITICAL_OPINION_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_RELIGIOUS_BELIEF:
				return deduceReligiousBelief != DEDUCE_RELIGIOUS_BELIEF_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_UNION_MEMBERSHIP:
				return deduceUnionMembership != DEDUCE_UNION_MEMBERSHIP_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DEDUCE_SEXUALITY:
				return deduceSexuality != DEDUCE_SEXUALITY_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAWFUL_DATASET_LABELING:
				return lawfulDatasetLabeling != LAWFUL_DATASET_LABELING_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__LAW_ENFORCEMENT_CATEGORISATION:
				return lawEnforcementCategorisation != LAW_ENFORCEMENT_CATEGORISATION_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.BIOMETRIC_CATEGORISATION__BASE_USE_CASE:
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
		result.append(" (DeduceRace: ");
		result.append(deduceRace);
		result.append(", DeducePoliticalOpinion: ");
		result.append(deducePoliticalOpinion);
		result.append(", DeduceReligiousBelief: ");
		result.append(deduceReligiousBelief);
		result.append(", DeduceUnionMembership: ");
		result.append(deduceUnionMembership);
		result.append(", DeduceSexuality: ");
		result.append(deduceSexuality);
		result.append(", LawfulDatasetLabeling: ");
		result.append(lawfulDatasetLabeling);
		result.append(", LawEnforcementCategorisation: ");
		result.append(lawEnforcementCategorisation);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(')');
		return result.toString();
	}

} //BiometricCategorisationImpl
