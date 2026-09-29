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
 *   <li>{@link euaiactcompliance.AISystem#getVersion <em>Version</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getExternalInteraction <em>External Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getMarketPlacementForm <em>Market Placement Form</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHardwareDescription <em>Hardware Description</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#isVisualDocumentation <em>Visual Documentation</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getUserInterfaceDescription <em>User Interface Description</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getInstructionsForUse <em>Instructions For Use</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDevelopmentSteps <em>Development Steps</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDesignSpecification <em>Design Specification</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getKeyDesignDecision <em>Key Design Decision</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDesignTradeOffs <em>Design Trade Offs</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getDevelopementResources <em>Developement Resources</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHumanOversightPreAssessment <em>Human Oversight Pre Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPredeterminedChanges <em>Predetermined Changes</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getCybersecurityMeasures <em>Cybersecurity Measures</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHumanOversightMeasures <em>Human Oversight Measures</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getUpdateRequirements <em>Update Requirements</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getForseeableRisks <em>Forseeable Risks</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPerformanceMetricsAppropriateness <em>Performance Metrics Appropriateness</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getRelevantChanges <em>Relevant Changes</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getHarmonisedStandards <em>Harmonised Standards</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#isCopyEUConformityDeclaration <em>Copy EU Conformity Declaration</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getPostMarketMonitoring <em>Post Market Monitoring</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getProviderContact <em>Provider Contact</em>}</li>
 *   <li>{@link euaiactcompliance.AISystem#getAffectedPersons <em>Affected Persons</em>}</li>
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
	 * Returns the value of the '<em><b>Hardware Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Description</em>' attribute.
	 * @see #setHardwareDescription(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_HardwareDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHardwareDescription();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHardwareDescription <em>Hardware Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Description</em>' attribute.
	 * @see #getHardwareDescription()
	 * @generated
	 */
	void setHardwareDescription(String value);

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
	 * Returns the value of the '<em><b>User Interface Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface Description</em>' attribute.
	 * @see #setUserInterfaceDescription(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_UserInterfaceDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserInterfaceDescription();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getUserInterfaceDescription <em>User Interface Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface Description</em>' attribute.
	 * @see #getUserInterfaceDescription()
	 * @generated
	 */
	void setUserInterfaceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Instructions For Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions For Use</em>' attribute.
	 * @see #setInstructionsForUse(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_InstructionsForUse()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstructionsForUse();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getInstructionsForUse <em>Instructions For Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions For Use</em>' attribute.
	 * @see #getInstructionsForUse()
	 * @generated
	 */
	void setInstructionsForUse(String value);

	/**
	 * Returns the value of the '<em><b>Development Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Steps</em>' attribute.
	 * @see #setDevelopmentSteps(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DevelopmentSteps()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDevelopmentSteps();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDevelopmentSteps <em>Development Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Steps</em>' attribute.
	 * @see #getDevelopmentSteps()
	 * @generated
	 */
	void setDevelopmentSteps(String value);

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
	 * Returns the value of the '<em><b>Key Design Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Design Decision</em>' attribute.
	 * @see #setKeyDesignDecision(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_KeyDesignDecision()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKeyDesignDecision();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getKeyDesignDecision <em>Key Design Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Design Decision</em>' attribute.
	 * @see #getKeyDesignDecision()
	 * @generated
	 */
	void setKeyDesignDecision(String value);

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
	 * Returns the value of the '<em><b>Developement Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developement Resources</em>' attribute.
	 * @see #setDevelopementResources(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_DevelopementResources()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDevelopementResources();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getDevelopementResources <em>Developement Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developement Resources</em>' attribute.
	 * @see #getDevelopementResources()
	 * @generated
	 */
	void setDevelopementResources(String value);

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
	 * Returns the value of the '<em><b>Predetermined Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predetermined Changes</em>' attribute.
	 * @see #setPredeterminedChanges(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PredeterminedChanges()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPredeterminedChanges();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPredeterminedChanges <em>Predetermined Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predetermined Changes</em>' attribute.
	 * @see #getPredeterminedChanges()
	 * @generated
	 */
	void setPredeterminedChanges(String value);

	/**
	 * Returns the value of the '<em><b>Cybersecurity Measures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cybersecurity Measures</em>' attribute.
	 * @see #setCybersecurityMeasures(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_CybersecurityMeasures()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCybersecurityMeasures();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getCybersecurityMeasures <em>Cybersecurity Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cybersecurity Measures</em>' attribute.
	 * @see #getCybersecurityMeasures()
	 * @generated
	 */
	void setCybersecurityMeasures(String value);

	/**
	 * Returns the value of the '<em><b>Human Oversight Measures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Oversight Measures</em>' attribute.
	 * @see #setHumanOversightMeasures(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_HumanOversightMeasures()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getHumanOversightMeasures();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getHumanOversightMeasures <em>Human Oversight Measures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Oversight Measures</em>' attribute.
	 * @see #getHumanOversightMeasures()
	 * @generated
	 */
	void setHumanOversightMeasures(String value);

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
	 * Returns the value of the '<em><b>Forseeable Risks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forseeable Risks</em>' attribute.
	 * @see #setForseeableRisks(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_ForseeableRisks()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getForseeableRisks();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getForseeableRisks <em>Forseeable Risks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forseeable Risks</em>' attribute.
	 * @see #getForseeableRisks()
	 * @generated
	 */
	void setForseeableRisks(String value);

	/**
	 * Returns the value of the '<em><b>Performance Metrics Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Metrics Appropriateness</em>' attribute.
	 * @see #setPerformanceMetricsAppropriateness(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_PerformanceMetricsAppropriateness()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPerformanceMetricsAppropriateness();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getPerformanceMetricsAppropriateness <em>Performance Metrics Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Metrics Appropriateness</em>' attribute.
	 * @see #getPerformanceMetricsAppropriateness()
	 * @generated
	 */
	void setPerformanceMetricsAppropriateness(String value);

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

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_ProviderName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Contact</em>' attribute.
	 * @see #setProviderContact(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_ProviderContact()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProviderContact();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getProviderContact <em>Provider Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Contact</em>' attribute.
	 * @see #getProviderContact()
	 * @generated
	 */
	void setProviderContact(String value);

	/**
	 * Returns the value of the '<em><b>Affected Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Persons</em>' attribute.
	 * @see #setAffectedPersons(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getAISystem_AffectedPersons()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAffectedPersons();

	/**
	 * Sets the value of the '{@link euaiactcompliance.AISystem#getAffectedPersons <em>Affected Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Persons</em>' attribute.
	 * @see #getAffectedPersons()
	 * @generated
	 */
	void setAffectedPersons(String value);

} // AISystem
