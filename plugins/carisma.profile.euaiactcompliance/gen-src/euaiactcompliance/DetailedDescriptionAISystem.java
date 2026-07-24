/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detailed Description AI System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#isCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#isAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#isPredictableRisks <em>Predictable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#isHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#isInputSpecification <em>Input Specification</em>}</li>
 *   <li>{@link euaiactcompliance.DetailedDescriptionAISystem#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem()
 * @model
 * @generated
 */
public interface DetailedDescriptionAISystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute.
	 * @see #setCapabilities(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_Capabilities()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCapabilities();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#isCapabilities <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' attribute.
	 * @see #isCapabilities()
	 * @generated
	 */
	void setCapabilities(boolean value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_Accuracy()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAccuracy();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#isAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #isAccuracy()
	 * @generated
	 */
	void setAccuracy(boolean value);

	/**
	 * Returns the value of the '<em><b>Predictable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictable Risks</em>' attribute.
	 * @see #setPredictableRisks(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_PredictableRisks()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPredictableRisks();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#isPredictableRisks <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictable Risks</em>' attribute.
	 * @see #isPredictableRisks()
	 * @generated
	 */
	void setPredictableRisks(boolean value);

	/**
	 * Returns the value of the '<em><b>Human Oversight Post Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Oversight Post Assessment</em>' attribute.
	 * @see #setHumanOversightPostAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_HumanOversightPostAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isHumanOversightPostAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#isHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Oversight Post Assessment</em>' attribute.
	 * @see #isHumanOversightPostAssessment()
	 * @generated
	 */
	void setHumanOversightPostAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Specification</em>' attribute.
	 * @see #setInputSpecification(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_InputSpecification()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInputSpecification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#isInputSpecification <em>Input Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Specification</em>' attribute.
	 * @see #isInputSpecification()
	 * @generated
	 */
	void setInputSpecification(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getDetailedDescriptionAISystem_Base_Artifact()
	 * @model ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link euaiactcompliance.DetailedDescriptionAISystem#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

} // DetailedDescriptionAISystem
