/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Developed Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getParameter <em>Parameter</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getTrainingMethods <em>Training Methods</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getObjective <em>Objective</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getValidationProcess <em>Validation Process</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getTestingProcess <em>Testing Process</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#isTestReports <em>Test Reports</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.SelfDevelopedModel#getInputSpecification <em>Input Specification</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel()
 * @model
 * @generated
 */
public interface SelfDevelopedModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_Parameter()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Training Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Methods</em>' attribute.
	 * @see #setTrainingMethods(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_TrainingMethods()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTrainingMethods();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getTrainingMethods <em>Training Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Methods</em>' attribute.
	 * @see #getTrainingMethods()
	 * @generated
	 */
	void setTrainingMethods(String value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see #setObjective(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_Objective()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>Validation Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Process</em>' attribute.
	 * @see #setValidationProcess(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_ValidationProcess()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getValidationProcess();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getValidationProcess <em>Validation Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Process</em>' attribute.
	 * @see #getValidationProcess()
	 * @generated
	 */
	void setValidationProcess(String value);

	/**
	 * Returns the value of the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Output</em>' attribute.
	 * @see #setExpectedOutput(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_ExpectedOutput()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExpectedOutput();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getExpectedOutput <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Output</em>' attribute.
	 * @see #getExpectedOutput()
	 * @generated
	 */
	void setExpectedOutput(String value);

	/**
	 * Returns the value of the '<em><b>Testing Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Process</em>' attribute.
	 * @see #setTestingProcess(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_TestingProcess()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTestingProcess();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getTestingProcess <em>Testing Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Process</em>' attribute.
	 * @see #getTestingProcess()
	 * @generated
	 */
	void setTestingProcess(String value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_Accuracy()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAccuracy();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute.
	 * @see #setCapabilities(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_Capabilities()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCapabilities();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getCapabilities <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' attribute.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(String value);

	/**
	 * Returns the value of the '<em><b>Test Reports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Reports</em>' attribute.
	 * @see #setTestReports(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_TestReports()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTestReports();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#isTestReports <em>Test Reports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Reports</em>' attribute.
	 * @see #isTestReports()
	 * @generated
	 */
	void setTestReports(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Input Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Specification</em>' attribute.
	 * @see #setInputSpecification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getSelfDevelopedModel_InputSpecification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInputSpecification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.SelfDevelopedModel#getInputSpecification <em>Input Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Specification</em>' attribute.
	 * @see #getInputSpecification()
	 * @generated
	 */
	void setInputSpecification(String value);

} // SelfDevelopedModel
