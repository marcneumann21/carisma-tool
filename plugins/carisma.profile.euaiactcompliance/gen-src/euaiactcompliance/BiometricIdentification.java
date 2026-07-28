/**
 */
package euaiactcompliance;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biometric Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isVerificationOnly <em>Verification Only</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isRealTime <em>Real Time</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isPubliclyAccessibleSpace <em>Publicly Accessible Space</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isLawEnforcementPurpose <em>Law Enforcement Purpose</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isVictimSearch <em>Victim Search</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isImminentThreatPrevention <em>Imminent Threat Prevention</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isSeriousCrimeSuspectSearch <em>Serious Crime Suspect Search</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isDecisionPatternDetection <em>Decision Pattern Detection</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#getExceptionJustification <em>Exception Justification</em>}</li>
 *   <li>{@link euaiactcompliance.BiometricIdentification#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification()
 * @model
 * @generated
 */
public interface BiometricIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Verification Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Only</em>' attribute.
	 * @see #setVerificationOnly(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_VerificationOnly()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVerificationOnly();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isVerificationOnly <em>Verification Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Only</em>' attribute.
	 * @see #isVerificationOnly()
	 * @generated
	 */
	void setVerificationOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Time</em>' attribute.
	 * @see #setRealTime(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_RealTime()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRealTime();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isRealTime <em>Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Time</em>' attribute.
	 * @see #isRealTime()
	 * @generated
	 */
	void setRealTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Publicly Accessible Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicly Accessible Space</em>' attribute.
	 * @see #setPubliclyAccessibleSpace(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_PubliclyAccessibleSpace()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPubliclyAccessibleSpace();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isPubliclyAccessibleSpace <em>Publicly Accessible Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicly Accessible Space</em>' attribute.
	 * @see #isPubliclyAccessibleSpace()
	 * @generated
	 */
	void setPubliclyAccessibleSpace(boolean value);

	/**
	 * Returns the value of the '<em><b>Law Enforcement Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Law Enforcement Purpose</em>' attribute.
	 * @see #setLawEnforcementPurpose(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_LawEnforcementPurpose()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLawEnforcementPurpose();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isLawEnforcementPurpose <em>Law Enforcement Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Law Enforcement Purpose</em>' attribute.
	 * @see #isLawEnforcementPurpose()
	 * @generated
	 */
	void setLawEnforcementPurpose(boolean value);

	/**
	 * Returns the value of the '<em><b>Victim Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Search</em>' attribute.
	 * @see #setVictimSearch(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_VictimSearch()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVictimSearch();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isVictimSearch <em>Victim Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Search</em>' attribute.
	 * @see #isVictimSearch()
	 * @generated
	 */
	void setVictimSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Imminent Threat Prevention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imminent Threat Prevention</em>' attribute.
	 * @see #setImminentThreatPrevention(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_ImminentThreatPrevention()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImminentThreatPrevention();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isImminentThreatPrevention <em>Imminent Threat Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imminent Threat Prevention</em>' attribute.
	 * @see #isImminentThreatPrevention()
	 * @generated
	 */
	void setImminentThreatPrevention(boolean value);

	/**
	 * Returns the value of the '<em><b>Serious Crime Suspect Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serious Crime Suspect Search</em>' attribute.
	 * @see #setSeriousCrimeSuspectSearch(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_SeriousCrimeSuspectSearch()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSeriousCrimeSuspectSearch();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isSeriousCrimeSuspectSearch <em>Serious Crime Suspect Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serious Crime Suspect Search</em>' attribute.
	 * @see #isSeriousCrimeSuspectSearch()
	 * @generated
	 */
	void setSeriousCrimeSuspectSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Narrow Procedural Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #setNarrowProceduralTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_NarrowProceduralTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNarrowProceduralTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isNarrowProceduralTask <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrow Procedural Task</em>' attribute.
	 * @see #isNarrowProceduralTask()
	 * @generated
	 */
	void setNarrowProceduralTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Improves Human Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improves Human Activity</em>' attribute.
	 * @see #setImprovesHumanActivity(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_ImprovesHumanActivity()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImprovesHumanActivity();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isImprovesHumanActivity <em>Improves Human Activity</em>}' attribute.
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
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_DecisionPatternDetection()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDecisionPatternDetection();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isDecisionPatternDetection <em>Decision Pattern Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Pattern Detection</em>' attribute.
	 * @see #isDecisionPatternDetection()
	 * @generated
	 */
	void setDecisionPatternDetection(boolean value);

	/**
	 * Returns the value of the '<em><b>Preparatory Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparatory Task</em>' attribute.
	 * @see #setPreparatoryTask(boolean)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_PreparatoryTask()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPreparatoryTask();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#isPreparatoryTask <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparatory Task</em>' attribute.
	 * @see #isPreparatoryTask()
	 * @generated
	 */
	void setPreparatoryTask(boolean value);

	/**
	 * Returns the value of the '<em><b>Exception Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Justification</em>' attribute.
	 * @see #setExceptionJustification(String)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_ExceptionJustification()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionJustification();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#getExceptionJustification <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Justification</em>' attribute.
	 * @see #getExceptionJustification()
	 * @generated
	 */
	void setExceptionJustification(String value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see euaiactcompliance.EuaiactcompliancePackage#getBiometricIdentification_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link euaiactcompliance.BiometricIdentification#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // BiometricIdentification
