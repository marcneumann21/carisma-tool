/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.SelfDevelopedModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Developed Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getTrainingMethods <em>Training Methods</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getTestingProcess <em>Testing Process</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#isTestReports <em>Test Reports</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link euaiactcompliance.impl.SelfDevelopedModelImpl#getInputData <em>Input Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfDevelopedModelImpl extends MinimalEObjectImpl.Container implements SelfDevelopedModel {
	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected String objective = OBJECTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The default value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected String expectedOutput = EXPECTED_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainingMethods() <em>Training Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingMethods()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAINING_METHODS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainingMethods() <em>Training Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingMethods()
	 * @generated
	 * @ordered
	 */
	protected String trainingMethods = TRAINING_METHODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationProcess() <em>Validation Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationProcess() <em>Validation Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected String validationProcess = VALIDATION_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingProcess() <em>Testing Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingProcess() <em>Testing Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingProcess()
	 * @generated
	 * @ordered
	 */
	protected String testingProcess = TESTING_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestReports() <em>Test Reports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestReports()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_REPORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTestReports() <em>Test Reports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestReports()
	 * @generated
	 * @ordered
	 */
	protected boolean testReports = TEST_REPORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String capabilities = CAPABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCURACY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected String accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputData() <em>Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected String inputData = INPUT_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfDevelopedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.SELF_DEVELOPED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjective(String newObjective) {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedOutput() {
		return expectedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedOutput(String newExpectedOutput) {
		String oldExpectedOutput = expectedOutput;
		expectedOutput = newExpectedOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT, oldExpectedOutput, expectedOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrainingMethods() {
		return trainingMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingMethods(String newTrainingMethods) {
		String oldTrainingMethods = trainingMethods;
		trainingMethods = newTrainingMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TRAINING_METHODS, oldTrainingMethods, trainingMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationProcess() {
		return validationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationProcess(String newValidationProcess) {
		String oldValidationProcess = validationProcess;
		validationProcess = newValidationProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__VALIDATION_PROCESS, oldValidationProcess, validationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingProcess() {
		return testingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingProcess(String newTestingProcess) {
		String oldTestingProcess = testingProcess;
		testingProcess = newTestingProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TESTING_PROCESS, oldTestingProcess, testingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTestReports() {
		return testReports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestReports(boolean newTestReports) {
		boolean oldTestReports = testReports;
		testReports = newTestReports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TEST_REPORTS, oldTestReports, testReports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapabilities(String newCapabilities) {
		String oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__CAPABILITIES, oldCapabilities, capabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccuracy(String newAccuracy) {
		String oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputData() {
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputData(String newInputData) {
		String oldInputData = inputData;
		inputData = newInputData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__INPUT_DATA, oldInputData, inputData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__OBJECTIVE:
				return getObjective();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT:
				return getExpectedOutput();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__PARAMETER:
				return getParameter();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TRAINING_METHODS:
				return getTrainingMethods();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__VALIDATION_PROCESS:
				return getValidationProcess();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TESTING_PROCESS:
				return getTestingProcess();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TEST_REPORTS:
				return isTestReports();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__CAPABILITIES:
				return getCapabilities();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__ACCURACY:
				return getAccuracy();
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__INPUT_DATA:
				return getInputData();
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
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT:
				setExpectedOutput((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__PARAMETER:
				setParameter((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TRAINING_METHODS:
				setTrainingMethods((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__VALIDATION_PROCESS:
				setValidationProcess((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TESTING_PROCESS:
				setTestingProcess((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TEST_REPORTS:
				setTestReports((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__CAPABILITIES:
				setCapabilities((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__ACCURACY:
				setAccuracy((String)newValue);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__INPUT_DATA:
				setInputData((String)newValue);
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
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT:
				setExpectedOutput(EXPECTED_OUTPUT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TRAINING_METHODS:
				setTrainingMethods(TRAINING_METHODS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__VALIDATION_PROCESS:
				setValidationProcess(VALIDATION_PROCESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TESTING_PROCESS:
				setTestingProcess(TESTING_PROCESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TEST_REPORTS:
				setTestReports(TEST_REPORTS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__CAPABILITIES:
				setCapabilities(CAPABILITIES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__INPUT_DATA:
				setInputData(INPUT_DATA_EDEFAULT);
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
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__BASE_COMPONENT:
				return base_Component != null;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__EXPECTED_OUTPUT:
				return EXPECTED_OUTPUT_EDEFAULT == null ? expectedOutput != null : !EXPECTED_OUTPUT_EDEFAULT.equals(expectedOutput);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TRAINING_METHODS:
				return TRAINING_METHODS_EDEFAULT == null ? trainingMethods != null : !TRAINING_METHODS_EDEFAULT.equals(trainingMethods);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__VALIDATION_PROCESS:
				return VALIDATION_PROCESS_EDEFAULT == null ? validationProcess != null : !VALIDATION_PROCESS_EDEFAULT.equals(validationProcess);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TESTING_PROCESS:
				return TESTING_PROCESS_EDEFAULT == null ? testingProcess != null : !TESTING_PROCESS_EDEFAULT.equals(testingProcess);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__TEST_REPORTS:
				return testReports != TEST_REPORTS_EDEFAULT;
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__CAPABILITIES:
				return CAPABILITIES_EDEFAULT == null ? capabilities != null : !CAPABILITIES_EDEFAULT.equals(capabilities);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__ACCURACY:
				return ACCURACY_EDEFAULT == null ? accuracy != null : !ACCURACY_EDEFAULT.equals(accuracy);
			case EuaiactcompliancePackage.SELF_DEVELOPED_MODEL__INPUT_DATA:
				return INPUT_DATA_EDEFAULT == null ? inputData != null : !INPUT_DATA_EDEFAULT.equals(inputData);
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
		result.append(" (Objective: ");
		result.append(objective);
		result.append(", ExpectedOutput: ");
		result.append(expectedOutput);
		result.append(", Parameter: ");
		result.append(parameter);
		result.append(", TrainingMethods: ");
		result.append(trainingMethods);
		result.append(", ValidationProcess: ");
		result.append(validationProcess);
		result.append(", TestingProcess: ");
		result.append(testingProcess);
		result.append(", TestReports: ");
		result.append(testReports);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", Accuracy: ");
		result.append(accuracy);
		result.append(", InputData: ");
		result.append(inputData);
		result.append(')');
		return result.toString();
	}

} //SelfDevelopedModelImpl
