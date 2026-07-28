/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.MigrationBorder#isLieDetection <em>Lie Detection</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isEntryRiskAssessment <em>Entry Risk Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isAsylumVisaResidencePermitsApplication <em>Asylum Visa Residence Permits Application</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isTravelDocumentVerificationOnly <em>Travel Document Verification Only</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isPersonIdentification <em>Person Identification</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.MigrationBorder#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder()
 * @model
 * @generated
 */
public interface MigrationBorder extends EObject {
	/**
	 * Returns the value of the '<em><b>Lie Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lie Detection</em>' attribute.
	 * @see #setLieDetection(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_LieDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLieDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isLieDetection <em>Lie Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lie Detection</em>' attribute.
	 * @see #isLieDetection()
	 * @generated
	 */
	void setLieDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Entry Risk Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Risk Assessment</em>' attribute.
	 * @see #setEntryRiskAssessment(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_EntryRiskAssessment()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEntryRiskAssessment();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isEntryRiskAssessment <em>Entry Risk Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Risk Assessment</em>' attribute.
	 * @see #isEntryRiskAssessment()
	 * @generated
	 */
	void setEntryRiskAssessment(boolean value);

	/**
	 * Returns the value of the '<em><b>Asylum Visa Residence Permits Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asylum Visa Residence Permits Application</em>' attribute.
	 * @see #setAsylumVisaResidencePermitsApplication(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_AsylumVisaResidencePermitsApplication()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAsylumVisaResidencePermitsApplication();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isAsylumVisaResidencePermitsApplication <em>Asylum Visa Residence Permits Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asylum Visa Residence Permits Application</em>' attribute.
	 * @see #isAsylumVisaResidencePermitsApplication()
	 * @generated
	 */
	void setAsylumVisaResidencePermitsApplication(boolean value);

	/**
	 * Returns the value of the '<em><b>Travel Document Verification Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Document Verification Only</em>' attribute.
	 * @see #setTravelDocumentVerificationOnly(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_TravelDocumentVerificationOnly()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTravelDocumentVerificationOnly();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isTravelDocumentVerificationOnly <em>Travel Document Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Document Verification Only</em>' attribute.
	 * @see #isTravelDocumentVerificationOnly()
	 * @generated
	 */
	void setTravelDocumentVerificationOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Person Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Identification</em>' attribute.
	 * @see #setPersonIdentification(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_PersonIdentification()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPersonIdentification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isPersonIdentification <em>Person Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Identification</em>' attribute.
	 * @see #isPersonIdentification()
	 * @generated
	 */
	void setPersonIdentification(boolean value);

	/**
	 * Returns the value of the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #setImprovesHumanActivity(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_ImprovesHumanActivity()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImprovesHumanActivity();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isImprovesHumanActivity <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #isImprovesHumanActivity()
	 * @generated
	 */
	void setImprovesHumanActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #setNarrowProceduralTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_NarrowProceduralTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNarrowProceduralTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isNarrowProceduralTask <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #isNarrowProceduralTask()
	 * @generated
	 */
	void setNarrowProceduralTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparatory Task</em>' attribute.
	 * @see #setPreparatoryTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_PreparatoryTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPreparatoryTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isPreparatoryTask <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparatory Task</em>' attribute.
	 * @see #isPreparatoryTask()
	 * @generated
	 */
	void setPreparatoryTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #setDecisionPatternDetection(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_DecisionPatternDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDecisionPatternDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#isDecisionPatternDetection <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #isDecisionPatternDetection()
	 * @generated
	 */
	void setDecisionPatternDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getMigrationBorder_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.MigrationBorder#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // MigrationBorder
