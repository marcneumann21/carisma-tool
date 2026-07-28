/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.CriticalInfrastructure;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critical Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isDigitalInfrastructure <em>Digital Infrastructure</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isRoadTraffic <em>Road Traffic</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isWaterSupply <em>Water Supply</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isGasSupply <em>Gas Supply</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isHeatSupply <em>Heat Supply</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isElectricitySupply <em>Electricity Supply</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.CriticalInfrastructureImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriticalInfrastructureImpl extends MinimalEObjectImpl.Container implements CriticalInfrastructure {
	/**
	 * The default value of the '{@link #isDigitalInfrastructure() <em>Digital Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDigitalInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIGITAL_INFRASTRUCTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDigitalInfrastructure() <em>Digital Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDigitalInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected boolean digitalInfrastructure = DIGITAL_INFRASTRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRoadTraffic() <em>Road Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoadTraffic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROAD_TRAFFIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoadTraffic() <em>Road Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoadTraffic()
	 * @generated
	 * @ordered
	 */
	protected boolean roadTraffic = ROAD_TRAFFIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isWaterSupply() <em>Water Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaterSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATER_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWaterSupply() <em>Water Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaterSupply()
	 * @generated
	 * @ordered
	 */
	protected boolean waterSupply = WATER_SUPPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isGasSupply() <em>Gas Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGasSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAS_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGasSupply() <em>Gas Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGasSupply()
	 * @generated
	 * @ordered
	 */
	protected boolean gasSupply = GAS_SUPPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isHeatSupply() <em>Heat Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatSupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEAT_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeatSupply() <em>Heat Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatSupply()
	 * @generated
	 * @ordered
	 */
	protected boolean heatSupply = HEAT_SUPPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isElectricitySupply() <em>Electricity Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectricitySupply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELECTRICITY_SUPPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElectricitySupply() <em>Electricity Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectricitySupply()
	 * @generated
	 * @ordered
	 */
	protected boolean electricitySupply = ELECTRICITY_SUPPLY_EDEFAULT;

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
	protected CriticalInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.CRITICAL_INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDigitalInfrastructure() {
		return digitalInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigitalInfrastructure(boolean newDigitalInfrastructure) {
		boolean oldDigitalInfrastructure = digitalInfrastructure;
		digitalInfrastructure = newDigitalInfrastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE, oldDigitalInfrastructure, digitalInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRoadTraffic() {
		return roadTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoadTraffic(boolean newRoadTraffic) {
		boolean oldRoadTraffic = roadTraffic;
		roadTraffic = newRoadTraffic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC, oldRoadTraffic, roadTraffic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWaterSupply() {
		return waterSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaterSupply(boolean newWaterSupply) {
		boolean oldWaterSupply = waterSupply;
		waterSupply = newWaterSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__WATER_SUPPLY, oldWaterSupply, waterSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGasSupply() {
		return gasSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGasSupply(boolean newGasSupply) {
		boolean oldGasSupply = gasSupply;
		gasSupply = newGasSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__GAS_SUPPLY, oldGasSupply, gasSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHeatSupply() {
		return heatSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeatSupply(boolean newHeatSupply) {
		boolean oldHeatSupply = heatSupply;
		heatSupply = newHeatSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY, oldHeatSupply, heatSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElectricitySupply() {
		return electricitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectricitySupply(boolean newElectricitySupply) {
		boolean oldElectricitySupply = electricitySupply;
		electricitySupply = newElectricitySupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY, oldElectricitySupply, electricitySupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION, oldDecisionPatternDetection, decisionPatternDetection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE:
				return isDigitalInfrastructure();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC:
				return isRoadTraffic();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__WATER_SUPPLY:
				return isWaterSupply();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__GAS_SUPPLY:
				return isGasSupply();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY:
				return isHeatSupply();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY:
				return isElectricitySupply();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION:
				return isDecisionPatternDetection();
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE:
				setDigitalInfrastructure((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC:
				setRoadTraffic((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__WATER_SUPPLY:
				setWaterSupply((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__GAS_SUPPLY:
				setGasSupply((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY:
				setHeatSupply((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY:
				setElectricitySupply((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE:
				setDigitalInfrastructure(DIGITAL_INFRASTRUCTURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC:
				setRoadTraffic(ROAD_TRAFFIC_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__WATER_SUPPLY:
				setWaterSupply(WATER_SUPPLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__GAS_SUPPLY:
				setGasSupply(GAS_SUPPLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY:
				setHeatSupply(HEAT_SUPPLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY:
				setElectricitySupply(ELECTRICITY_SUPPLY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION:
				setDecisionPatternDetection(DECISION_PATTERN_DETECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE:
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
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DIGITAL_INFRASTRUCTURE:
				return digitalInfrastructure != DIGITAL_INFRASTRUCTURE_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ROAD_TRAFFIC:
				return roadTraffic != ROAD_TRAFFIC_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__WATER_SUPPLY:
				return waterSupply != WATER_SUPPLY_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__GAS_SUPPLY:
				return gasSupply != GAS_SUPPLY_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__HEAT_SUPPLY:
				return heatSupply != HEAT_SUPPLY_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__ELECTRICITY_SUPPLY:
				return electricitySupply != ELECTRICITY_SUPPLY_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__DECISION_PATTERN_DETECTION:
				return decisionPatternDetection != DECISION_PATTERN_DETECTION_EDEFAULT;
			case EuaiactcompliancePackage.CRITICAL_INFRASTRUCTURE__BASE_USE_CASE:
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
		result.append(" (DigitalInfrastructure: ");
		result.append(digitalInfrastructure);
		result.append(", RoadTraffic: ");
		result.append(roadTraffic);
		result.append(", WaterSupply: ");
		result.append(waterSupply);
		result.append(", GasSupply: ");
		result.append(gasSupply);
		result.append(", HeatSupply: ");
		result.append(heatSupply);
		result.append(", ElectricitySupply: ");
		result.append(electricitySupply);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(", DecisionPatternDetection: ");
		result.append(decisionPatternDetection);
		result.append(')');
		return result.toString();
	}

} //CriticalInfrastructureImpl
