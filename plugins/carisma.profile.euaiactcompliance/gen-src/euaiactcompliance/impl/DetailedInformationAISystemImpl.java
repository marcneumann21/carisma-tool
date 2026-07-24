/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.DetailedInformationAISystem;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Information AI System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isDevelopement <em>Developement</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isThirdPartyElements <em>Third Party Elements</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isDesignSpecification <em>Design Specification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isDesignDecision <em>Design Decision</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isObjective <em>Objective</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isCompromise <em>Compromise</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isArchitecture <em>Architecture</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isResources <em>Resources</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTrainingMethods <em>Training Methods</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTrainingDataDescription <em>Training Data Description</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTrainingDataSelection <em>Training Data Selection</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTrainingDataLabeling <em>Training Data Labeling</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTrainingDataCleaning <em>Training Data Cleaning</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isHumanOversightPreassessment <em>Human Oversight Preassessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isPlannedModification <em>Planned Modification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isTestingProcess <em>Testing Process</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isParameter <em>Parameter</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#isCybersecurity <em>Cybersecurity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.DetailedInformationAISystemImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailedInformationAISystemImpl extends MinimalEObjectImpl.Container implements DetailedInformationAISystem {
	/**
	 * The default value of the '{@link #isDevelopement() <em>Developement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDevelopement() <em>Developement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopement()
	 * @generated
	 * @ordered
	 */
	protected boolean developement = DEVELOPEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isThirdPartyElements() <em>Third Party Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdPartyElements()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THIRD_PARTY_ELEMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThirdPartyElements() <em>Third Party Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdPartyElements()
	 * @generated
	 * @ordered
	 */
	protected boolean thirdPartyElements = THIRD_PARTY_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isDesignSpecification() <em>Design Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesignSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESIGN_SPECIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDesignSpecification() <em>Design Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesignSpecification()
	 * @generated
	 * @ordered
	 */
	protected boolean designSpecification = DESIGN_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDesignDecision() <em>Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESIGN_DECISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDesignDecision() <em>Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesignDecision()
	 * @generated
	 * @ordered
	 */
	protected boolean designDecision = DESIGN_DECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjective()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBJECTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjective()
	 * @generated
	 * @ordered
	 */
	protected boolean objective = OBJECTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPECTED_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean expectedOutput = EXPECTED_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompromise() <em>Compromise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompromise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPROMISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompromise() <em>Compromise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompromise()
	 * @generated
	 * @ordered
	 */
	protected boolean compromise = COMPROMISE_EDEFAULT;

	/**
	 * The default value of the '{@link #isArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHITECTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchitecture()
	 * @generated
	 * @ordered
	 */
	protected boolean architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResources()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResources()
	 * @generated
	 * @ordered
	 */
	protected boolean resources = RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainingMethods() <em>Training Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINING_METHODS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainingMethods() <em>Training Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingMethods()
	 * @generated
	 * @ordered
	 */
	protected boolean trainingMethods = TRAINING_METHODS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainingDataDescription() <em>Training Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataDescription()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINING_DATA_DESCRIPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainingDataDescription() <em>Training Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataDescription()
	 * @generated
	 * @ordered
	 */
	protected boolean trainingDataDescription = TRAINING_DATA_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainingDataSelection() <em>Training Data Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINING_DATA_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainingDataSelection() <em>Training Data Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean trainingDataSelection = TRAINING_DATA_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainingDataLabeling() <em>Training Data Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataLabeling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINING_DATA_LABELING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainingDataLabeling() <em>Training Data Labeling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataLabeling()
	 * @generated
	 * @ordered
	 */
	protected boolean trainingDataLabeling = TRAINING_DATA_LABELING_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainingDataCleaning() <em>Training Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINING_DATA_CLEANING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainingDataCleaning() <em>Training Data Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainingDataCleaning()
	 * @generated
	 * @ordered
	 */
	protected boolean trainingDataCleaning = TRAINING_DATA_CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #isHumanOversightPreassessment() <em>Human Oversight Preassessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanOversightPreassessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_OVERSIGHT_PREASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHumanOversightPreassessment() <em>Human Oversight Preassessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanOversightPreassessment()
	 * @generated
	 * @ordered
	 */
	protected boolean humanOversightPreassessment = HUMAN_OVERSIGHT_PREASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlannedModification() <em>Planned Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlannedModification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLANNED_MODIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlannedModification() <em>Planned Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlannedModification()
	 * @generated
	 * @ordered
	 */
	protected boolean plannedModification = PLANNED_MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidationProcess() <em>Validation Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATION_PROCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidationProcess() <em>Validation Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidationProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean validationProcess = VALIDATION_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTestingProcess() <em>Testing Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestingProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESTING_PROCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTestingProcess() <em>Testing Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestingProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean testingProcess = TESTING_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCybersecurity() <em>Cybersecurity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCybersecurity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CYBERSECURITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCybersecurity() <em>Cybersecurity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCybersecurity()
	 * @generated
	 * @ordered
	 */
	protected boolean cybersecurity = CYBERSECURITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailedInformationAISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.DETAILED_INFORMATION_AI_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDevelopement() {
		return developement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopement(boolean newDevelopement) {
		boolean oldDevelopement = developement;
		developement = newDevelopement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT, oldDevelopement, developement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThirdPartyElements() {
		return thirdPartyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyElements(boolean newThirdPartyElements) {
		boolean oldThirdPartyElements = thirdPartyElements;
		thirdPartyElements = newThirdPartyElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS, oldThirdPartyElements, thirdPartyElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDesignSpecification() {
		return designSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignSpecification(boolean newDesignSpecification) {
		boolean oldDesignSpecification = designSpecification;
		designSpecification = newDesignSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION, oldDesignSpecification, designSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDesignDecision() {
		return designDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignDecision(boolean newDesignDecision) {
		boolean oldDesignDecision = designDecision;
		designDecision = newDesignDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION, oldDesignDecision, designDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjective(boolean newObjective) {
		boolean oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpectedOutput() {
		return expectedOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedOutput(boolean newExpectedOutput) {
		boolean oldExpectedOutput = expectedOutput;
		expectedOutput = newExpectedOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT, oldExpectedOutput, expectedOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompromise() {
		return compromise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompromise(boolean newCompromise) {
		boolean oldCompromise = compromise;
		compromise = newCompromise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE, oldCompromise, compromise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitecture(boolean newArchitecture) {
		boolean oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(boolean newResources) {
		boolean oldResources = resources;
		resources = newResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__RESOURCES, oldResources, resources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrainingMethods() {
		return trainingMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingMethods(boolean newTrainingMethods) {
		boolean oldTrainingMethods = trainingMethods;
		trainingMethods = newTrainingMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS, oldTrainingMethods, trainingMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrainingDataDescription() {
		return trainingDataDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingDataDescription(boolean newTrainingDataDescription) {
		boolean oldTrainingDataDescription = trainingDataDescription;
		trainingDataDescription = newTrainingDataDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION, oldTrainingDataDescription, trainingDataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrainingDataSelection() {
		return trainingDataSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingDataSelection(boolean newTrainingDataSelection) {
		boolean oldTrainingDataSelection = trainingDataSelection;
		trainingDataSelection = newTrainingDataSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION, oldTrainingDataSelection, trainingDataSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrainingDataLabeling() {
		return trainingDataLabeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingDataLabeling(boolean newTrainingDataLabeling) {
		boolean oldTrainingDataLabeling = trainingDataLabeling;
		trainingDataLabeling = newTrainingDataLabeling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING, oldTrainingDataLabeling, trainingDataLabeling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrainingDataCleaning() {
		return trainingDataCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingDataCleaning(boolean newTrainingDataCleaning) {
		boolean oldTrainingDataCleaning = trainingDataCleaning;
		trainingDataCleaning = newTrainingDataCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING, oldTrainingDataCleaning, trainingDataCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHumanOversightPreassessment() {
		return humanOversightPreassessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanOversightPreassessment(boolean newHumanOversightPreassessment) {
		boolean oldHumanOversightPreassessment = humanOversightPreassessment;
		humanOversightPreassessment = newHumanOversightPreassessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT, oldHumanOversightPreassessment, humanOversightPreassessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPlannedModification() {
		return plannedModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedModification(boolean newPlannedModification) {
		boolean oldPlannedModification = plannedModification;
		plannedModification = newPlannedModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION, oldPlannedModification, plannedModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidationProcess() {
		return validationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationProcess(boolean newValidationProcess) {
		boolean oldValidationProcess = validationProcess;
		validationProcess = newValidationProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS, oldValidationProcess, validationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTestingProcess() {
		return testingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingProcess(boolean newTestingProcess) {
		boolean oldTestingProcess = testingProcess;
		testingProcess = newTestingProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS, oldTestingProcess, testingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(boolean newParameter) {
		boolean oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCybersecurity() {
		return cybersecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCybersecurity(boolean newCybersecurity) {
		boolean oldCybersecurity = cybersecurity;
		cybersecurity = newCybersecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY, oldCybersecurity, cybersecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT:
				return isDevelopement();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS:
				return isThirdPartyElements();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION:
				return isDesignSpecification();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION:
				return isDesignDecision();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE:
				return isObjective();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT:
				return isExpectedOutput();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE:
				return isCompromise();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE:
				return isArchitecture();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__RESOURCES:
				return isResources();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS:
				return isTrainingMethods();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION:
				return isTrainingDataDescription();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION:
				return isTrainingDataSelection();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING:
				return isTrainingDataLabeling();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING:
				return isTrainingDataCleaning();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT:
				return isHumanOversightPreassessment();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION:
				return isPlannedModification();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS:
				return isValidationProcess();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS:
				return isTestingProcess();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PARAMETER:
				return isParameter();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY:
				return isCybersecurity();
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
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
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT:
				setDevelopement((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS:
				setThirdPartyElements((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION:
				setDesignDecision((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE:
				setObjective((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT:
				setExpectedOutput((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE:
				setCompromise((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE:
				setArchitecture((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__RESOURCES:
				setResources((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS:
				setTrainingMethods((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION:
				setTrainingDataDescription((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION:
				setTrainingDataSelection((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING:
				setTrainingDataLabeling((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING:
				setTrainingDataCleaning((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT:
				setHumanOversightPreassessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION:
				setPlannedModification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS:
				setValidationProcess((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS:
				setTestingProcess((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PARAMETER:
				setParameter((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY:
				setCybersecurity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
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
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT:
				setDevelopement(DEVELOPEMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS:
				setThirdPartyElements(THIRD_PARTY_ELEMENTS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION:
				setDesignSpecification(DESIGN_SPECIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION:
				setDesignDecision(DESIGN_DECISION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT:
				setExpectedOutput(EXPECTED_OUTPUT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE:
				setCompromise(COMPROMISE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__RESOURCES:
				setResources(RESOURCES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS:
				setTrainingMethods(TRAINING_METHODS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION:
				setTrainingDataDescription(TRAINING_DATA_DESCRIPTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION:
				setTrainingDataSelection(TRAINING_DATA_SELECTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING:
				setTrainingDataLabeling(TRAINING_DATA_LABELING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING:
				setTrainingDataCleaning(TRAINING_DATA_CLEANING_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT:
				setHumanOversightPreassessment(HUMAN_OVERSIGHT_PREASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION:
				setPlannedModification(PLANNED_MODIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS:
				setValidationProcess(VALIDATION_PROCESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS:
				setTestingProcess(TESTING_PROCESS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY:
				setCybersecurity(CYBERSECURITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
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
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DEVELOPEMENT:
				return developement != DEVELOPEMENT_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__THIRD_PARTY_ELEMENTS:
				return thirdPartyElements != THIRD_PARTY_ELEMENTS_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_SPECIFICATION:
				return designSpecification != DESIGN_SPECIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__DESIGN_DECISION:
				return designDecision != DESIGN_DECISION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__OBJECTIVE:
				return objective != OBJECTIVE_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__EXPECTED_OUTPUT:
				return expectedOutput != EXPECTED_OUTPUT_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__COMPROMISE:
				return compromise != COMPROMISE_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__RESOURCES:
				return resources != RESOURCES_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_METHODS:
				return trainingMethods != TRAINING_METHODS_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_DESCRIPTION:
				return trainingDataDescription != TRAINING_DATA_DESCRIPTION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_SELECTION:
				return trainingDataSelection != TRAINING_DATA_SELECTION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_LABELING:
				return trainingDataLabeling != TRAINING_DATA_LABELING_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TRAINING_DATA_CLEANING:
				return trainingDataCleaning != TRAINING_DATA_CLEANING_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__HUMAN_OVERSIGHT_PREASSESSMENT:
				return humanOversightPreassessment != HUMAN_OVERSIGHT_PREASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PLANNED_MODIFICATION:
				return plannedModification != PLANNED_MODIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__VALIDATION_PROCESS:
				return validationProcess != VALIDATION_PROCESS_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__TESTING_PROCESS:
				return testingProcess != TESTING_PROCESS_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__PARAMETER:
				return parameter != PARAMETER_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__CYBERSECURITY:
				return cybersecurity != CYBERSECURITY_EDEFAULT;
			case EuaiactcompliancePackage.DETAILED_INFORMATION_AI_SYSTEM__BASE_ARTIFACT:
				return base_Artifact != null;
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
		result.append(" (Developement: ");
		result.append(developement);
		result.append(", ThirdPartyElements: ");
		result.append(thirdPartyElements);
		result.append(", DesignSpecification: ");
		result.append(designSpecification);
		result.append(", DesignDecision: ");
		result.append(designDecision);
		result.append(", Objective: ");
		result.append(objective);
		result.append(", ExpectedOutput: ");
		result.append(expectedOutput);
		result.append(", Compromise: ");
		result.append(compromise);
		result.append(", Architecture: ");
		result.append(architecture);
		result.append(", Resources: ");
		result.append(resources);
		result.append(", TrainingMethods: ");
		result.append(trainingMethods);
		result.append(", TrainingDataDescription: ");
		result.append(trainingDataDescription);
		result.append(", TrainingDataSelection: ");
		result.append(trainingDataSelection);
		result.append(", TrainingDataLabeling: ");
		result.append(trainingDataLabeling);
		result.append(", TrainingDataCleaning: ");
		result.append(trainingDataCleaning);
		result.append(", HumanOversightPreassessment: ");
		result.append(humanOversightPreassessment);
		result.append(", PlannedModification: ");
		result.append(plannedModification);
		result.append(", ValidationProcess: ");
		result.append(validationProcess);
		result.append(", TestingProcess: ");
		result.append(testingProcess);
		result.append(", Parameter: ");
		result.append(parameter);
		result.append(", Cybersecurity: ");
		result.append(cybersecurity);
		result.append(')');
		return result.toString();
	}

} //DetailedInformationAISystemImpl
