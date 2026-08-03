/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.AISystem#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getVersion <em>Version</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getExternalInteraction <em>External Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getMarketPlacementForm <em>Market Placement Form</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHardware <em>Hardware</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#isVisualDocumentation <em>Visual Documentation</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDevelopmentProcess <em>Development Process</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDesignSpecification <em>Design Specification</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDesignDecision <em>Design Decision</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDesignTradeOffs <em>Design Trade Offs</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getResources <em>Resources</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPlannedModification <em>Planned Modification</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getCybersecurity <em>Cybersecurity</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getUpdateRequirements <em>Update Requirements</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPredictableRisks <em>Predictable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPerformanceMetricsSuitability <em>Performance Metrics Suitability</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getRelevantChanges <em>Relevant Changes</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHarmonisedStandards <em>Harmonised Standards</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPostMarketMonitoring <em>Post Market Monitoring</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem()
 * @model
 * @generated
 */
public interface AISystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Version()
	 * @model id="true" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>External Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interaction</em>' attribute.
	 * @see #setExternalInteraction(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_ExternalInteraction()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExternalInteraction();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getExternalInteraction <em>External Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Interaction</em>' attribute.
	 * @see #getExternalInteraction()
	 * @generated
	 */
	void setExternalInteraction(String value);

	/**
	 * Returns the value of the '<em><b>Market Placement Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Placement Form</em>' attribute.
	 * @see #setMarketPlacementForm(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_MarketPlacementForm()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMarketPlacementForm();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getMarketPlacementForm <em>Market Placement Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Placement Form</em>' attribute.
	 * @see #getMarketPlacementForm()
	 * @generated
	 */
	void setMarketPlacementForm(String value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' attribute.
	 * @see #setHardware(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Hardware()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHardware();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHardware <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' attribute.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(String value);

	/**
	 * Returns the value of the '<em><b>Visual Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Documentation</em>' attribute.
	 * @see #setVisualDocumentation(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_VisualDocumentation()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVisualDocumentation();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#isVisualDocumentation <em>Visual Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Documentation</em>' attribute.
	 * @see #isVisualDocumentation()
	 * @generated
	 */
	void setVisualDocumentation(boolean value);

	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' attribute.
	 * @see #setUserInterface(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_UserInterface()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserInterface();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getUserInterface <em>User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface</em>' attribute.
	 * @see #getUserInterface()
	 * @generated
	 */
	void setUserInterface(String value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Instructions()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Development Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Process</em>' attribute.
	 * @see #setDevelopmentProcess(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DevelopmentProcess()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDevelopmentProcess();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDevelopmentProcess <em>Development Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Process</em>' attribute.
	 * @see #getDevelopmentProcess()
	 * @generated
	 */
	void setDevelopmentProcess(String value);

	/**
	 * Returns the value of the '<em><b>Design Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Specification</em>' attribute.
	 * @see #setDesignSpecification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DesignSpecification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDesignSpecification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDesignSpecification <em>Design Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Specification</em>' attribute.
	 * @see #getDesignSpecification()
	 * @generated
	 */
	void setDesignSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Design Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Decision</em>' attribute.
	 * @see #setDesignDecision(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DesignDecision()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDesignDecision();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDesignDecision <em>Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Decision</em>' attribute.
	 * @see #getDesignDecision()
	 * @generated
	 */
	void setDesignDecision(String value);

	/**
	 * Returns the value of the '<em><b>Design Trade Offs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Trade Offs</em>' attribute.
	 * @see #setDesignTradeOffs(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DesignTradeOffs()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDesignTradeOffs();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDesignTradeOffs <em>Design Trade Offs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Trade Offs</em>' attribute.
	 * @see #getDesignTradeOffs()
	 * @generated
	 */
	void setDesignTradeOffs(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute.
	 * @see #setResources(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Resources()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResources();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getResources <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' attribute.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(String value);

	/**
	 * Returns the value of the '<em><b>Human Oversight Pre Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Oversight Pre Assessment</em>' attribute.
	 * @see #setHumanOversightPreAssessment(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_HumanOversightPreAssessment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHumanOversightPreAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Oversight Pre Assessment</em>' attribute.
	 * @see #getHumanOversightPreAssessment()
	 * @generated
	 */
	void setHumanOversightPreAssessment(String value);

	/**
	 * Returns the value of the '<em><b>Planned Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Modification</em>' attribute.
	 * @see #setPlannedModification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PlannedModification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPlannedModification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPlannedModification <em>Planned Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Modification</em>' attribute.
	 * @see #getPlannedModification()
	 * @generated
	 */
	void setPlannedModification(String value);

	/**
	 * Returns the value of the '<em><b>Cybersecurity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cybersecurity</em>' attribute.
	 * @see #setCybersecurity(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_Cybersecurity()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCybersecurity();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getCybersecurity <em>Cybersecurity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cybersecurity</em>' attribute.
	 * @see #getCybersecurity()
	 * @generated
	 */
	void setCybersecurity(String value);

	/**
	 * Returns the value of the '<em><b>Human Oversight Post Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Oversight Post Assessment</em>' attribute.
	 * @see #setHumanOversightPostAssessment(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_HumanOversightPostAssessment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHumanOversightPostAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHumanOversightPostAssessment <em>Human Oversight Post Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Oversight Post Assessment</em>' attribute.
	 * @see #getHumanOversightPostAssessment()
	 * @generated
	 */
	void setHumanOversightPostAssessment(String value);

	/**
	 * Returns the value of the '<em><b>Update Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Requirements</em>' attribute.
	 * @see #setUpdateRequirements(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_UpdateRequirements()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUpdateRequirements();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getUpdateRequirements <em>Update Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Requirements</em>' attribute.
	 * @see #getUpdateRequirements()
	 * @generated
	 */
	void setUpdateRequirements(String value);

	/**
	 * Returns the value of the '<em><b>Predictable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictable Risks</em>' attribute.
	 * @see #setPredictableRisks(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PredictableRisks()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPredictableRisks();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPredictableRisks <em>Predictable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictable Risks</em>' attribute.
	 * @see #getPredictableRisks()
	 * @generated
	 */
	void setPredictableRisks(String value);

	/**
	 * Returns the value of the '<em><b>Performance Metrics Suitability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Metrics Suitability</em>' attribute.
	 * @see #setPerformanceMetricsSuitability(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PerformanceMetricsSuitability()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPerformanceMetricsSuitability();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPerformanceMetricsSuitability <em>Performance Metrics Suitability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Metrics Suitability</em>' attribute.
	 * @see #getPerformanceMetricsSuitability()
	 * @generated
	 */
	void setPerformanceMetricsSuitability(String value);

	/**
	 * Returns the value of the '<em><b>Relevant Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Changes</em>' attribute.
	 * @see #setRelevantChanges(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_RelevantChanges()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRelevantChanges();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getRelevantChanges <em>Relevant Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant Changes</em>' attribute.
	 * @see #getRelevantChanges()
	 * @generated
	 */
	void setRelevantChanges(String value);

	/**
	 * Returns the value of the '<em><b>Harmonised Standards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Harmonised Standards</em>' attribute.
	 * @see #setHarmonisedStandards(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_HarmonisedStandards()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHarmonisedStandards();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHarmonisedStandards <em>Harmonised Standards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harmonised Standards</em>' attribute.
	 * @see #getHarmonisedStandards()
	 * @generated
	 */
	void setHarmonisedStandards(String value);

	/**
	 * Returns the value of the '<em><b>Copy EU Conformity Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy EU Conformity Declaration</em>' attribute.
	 * @see #setCopyEUConformityDeclaration(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_CopyEUConformityDeclaration()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCopyEUConformityDeclaration();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy EU Conformity Declaration</em>' attribute.
	 * @see #isCopyEUConformityDeclaration()
	 * @generated
	 */
	void setCopyEUConformityDeclaration(boolean value);

	/**
	 * Returns the value of the '<em><b>Post Market Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Market Monitoring</em>' attribute.
	 * @see #setPostMarketMonitoring(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PostMarketMonitoring()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPostMarketMonitoring();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPostMarketMonitoring <em>Post Market Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Market Monitoring</em>' attribute.
	 * @see #getPostMarketMonitoring()
	 * @generated
	 */
	void setPostMarketMonitoring(String value);

} // AISystem
