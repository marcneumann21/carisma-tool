/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Essential Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.EssentialService#isCreditworthiness <em>Creditworthiness</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isPublicBenefitsEligibility <em>Public Benefits Eligibility</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isFraudDetectionOnly <em>Fraud Detection Only</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isInsuranceRiskPricing <em>Insurance Risk Pricing</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.EssentialService#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService()
 * @model
 * @generated
 */
public interface EssentialService extends EObject {
	/**
	 * Returns the value of the '<em><b>Creditworthiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creditworthiness</em>' attribute.
	 * @see #setCreditworthiness(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_Creditworthiness()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCreditworthiness();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isCreditworthiness <em>Creditworthiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditworthiness</em>' attribute.
	 * @see #isCreditworthiness()
	 * @generated
	 */
	void setCreditworthiness(boolean value);

	/**
	 * Returns the value of the '<em><b>Public Benefits Eligibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Benefits Eligibility</em>' attribute.
	 * @see #setPublicBenefitsEligibility(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_PublicBenefitsEligibility()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPublicBenefitsEligibility();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isPublicBenefitsEligibility <em>Public Benefits Eligibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Benefits Eligibility</em>' attribute.
	 * @see #isPublicBenefitsEligibility()
	 * @generated
	 */
	void setPublicBenefitsEligibility(boolean value);

	/**
	 * Returns the value of the '<em><b>Fraud Detection Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraud Detection Only</em>' attribute.
	 * @see #setFraudDetectionOnly(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_FraudDetectionOnly()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFraudDetectionOnly();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isFraudDetectionOnly <em>Fraud Detection Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraud Detection Only</em>' attribute.
	 * @see #isFraudDetectionOnly()
	 * @generated
	 */
	void setFraudDetectionOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Insurance Risk Pricing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance Risk Pricing</em>' attribute.
	 * @see #setInsuranceRiskPricing(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_InsuranceRiskPricing()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInsuranceRiskPricing();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isInsuranceRiskPricing <em>Insurance Risk Pricing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Risk Pricing</em>' attribute.
	 * @see #isInsuranceRiskPricing()
	 * @generated
	 */
	void setInsuranceRiskPricing(boolean value);

	/**
	 * Returns the value of the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparatory Task</em>' attribute.
	 * @see #setPreparatoryTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_PreparatoryTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPreparatoryTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isPreparatoryTask <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparatory Task</em>' attribute.
	 * @see #isPreparatoryTask()
	 * @generated
	 */
	void setPreparatoryTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #setNarrowProceduralTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_NarrowProceduralTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNarrowProceduralTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isNarrowProceduralTask <em>Narrow Procedural Task</em>}' attribute.
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #setImprovesHumanActivity(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_ImprovesHumanActivity()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImprovesHumanActivity();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isImprovesHumanActivity <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #isImprovesHumanActivity()
	 * @generated
	 */
	void setImprovesHumanActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Decision Pattern Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #setDecisionPatternDetection(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_DecisionPatternDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDecisionPatternDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#isDecisionPatternDetection <em>Decision Pattern Detection</em>}' attribute.
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getEssentialService_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.EssentialService#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // EssentialService
