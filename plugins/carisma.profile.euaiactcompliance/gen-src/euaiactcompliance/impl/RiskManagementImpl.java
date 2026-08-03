/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.RiskManagement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getRiskIdentification <em>Risk Identification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getRiskEstimation <em>Risk Estimation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getPostMarketRiskEvaluation <em>Post Market Risk Evaluation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getRiskMitigation <em>Risk Mitigation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getResidualRisk <em>Residual Risk</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getTestingProcedure <em>Testing Procedure</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getTestingMetrics <em>Testing Metrics</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getVulnerableGroupsAssessment <em>Vulnerable Groups Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.RiskManagementImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskManagementImpl extends MinimalEObjectImpl.Container implements RiskManagement {
	/**
	 * The default value of the '{@link #getRiskIdentification() <em>Risk Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiskIdentification() <em>Risk Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskIdentification()
	 * @generated
	 * @ordered
	 */
	protected String riskIdentification = RISK_IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskEstimation() <em>Risk Estimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskEstimation()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_ESTIMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiskEstimation() <em>Risk Estimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskEstimation()
	 * @generated
	 * @ordered
	 */
	protected String riskEstimation = RISK_ESTIMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostMarketRiskEvaluation() <em>Post Market Risk Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostMarketRiskEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_MARKET_RISK_EVALUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostMarketRiskEvaluation() <em>Post Market Risk Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostMarketRiskEvaluation()
	 * @generated
	 * @ordered
	 */
	protected String postMarketRiskEvaluation = POST_MARKET_RISK_EVALUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskMitigation() <em>Risk Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskMitigation()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_MITIGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiskMitigation() <em>Risk Mitigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskMitigation()
	 * @generated
	 * @ordered
	 */
	protected String riskMitigation = RISK_MITIGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidualRisk() <em>Residual Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualRisk()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDUAL_RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResidualRisk() <em>Residual Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidualRisk()
	 * @generated
	 * @ordered
	 */
	protected String residualRisk = RESIDUAL_RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingProcedure() <em>Testing Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_PROCEDURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingProcedure() <em>Testing Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingProcedure()
	 * @generated
	 * @ordered
	 */
	protected String testingProcedure = TESTING_PROCEDURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingMetrics() <em>Testing Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_METRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingMetrics() <em>Testing Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingMetrics()
	 * @generated
	 * @ordered
	 */
	protected String testingMetrics = TESTING_METRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVulnerableGroupsAssessment() <em>Vulnerable Groups Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableGroupsAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final String VULNERABLE_GROUPS_ASSESSMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVulnerableGroupsAssessment() <em>Vulnerable Groups Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerableGroupsAssessment()
	 * @generated
	 * @ordered
	 */
	protected String vulnerableGroupsAssessment = VULNERABLE_GROUPS_ASSESSMENT_EDEFAULT;

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
	protected RiskManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.RISK_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRiskIdentification() {
		return riskIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskIdentification(String newRiskIdentification) {
		String oldRiskIdentification = riskIdentification;
		riskIdentification = newRiskIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_IDENTIFICATION, oldRiskIdentification, riskIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRiskEstimation() {
		return riskEstimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskEstimation(String newRiskEstimation) {
		String oldRiskEstimation = riskEstimation;
		riskEstimation = newRiskEstimation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_ESTIMATION, oldRiskEstimation, riskEstimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostMarketRiskEvaluation() {
		return postMarketRiskEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostMarketRiskEvaluation(String newPostMarketRiskEvaluation) {
		String oldPostMarketRiskEvaluation = postMarketRiskEvaluation;
		postMarketRiskEvaluation = newPostMarketRiskEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__POST_MARKET_RISK_EVALUATION, oldPostMarketRiskEvaluation, postMarketRiskEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRiskMitigation() {
		return riskMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskMitigation(String newRiskMitigation) {
		String oldRiskMitigation = riskMitigation;
		riskMitigation = newRiskMitigation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_MITIGATION, oldRiskMitigation, riskMitigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResidualRisk() {
		return residualRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidualRisk(String newResidualRisk) {
		String oldResidualRisk = residualRisk;
		residualRisk = newResidualRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__RESIDUAL_RISK, oldResidualRisk, residualRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingProcedure() {
		return testingProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingProcedure(String newTestingProcedure) {
		String oldTestingProcedure = testingProcedure;
		testingProcedure = newTestingProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_PROCEDURE, oldTestingProcedure, testingProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingMetrics() {
		return testingMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingMetrics(String newTestingMetrics) {
		String oldTestingMetrics = testingMetrics;
		testingMetrics = newTestingMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_METRICS, oldTestingMetrics, testingMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVulnerableGroupsAssessment() {
		return vulnerableGroupsAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVulnerableGroupsAssessment(String newVulnerableGroupsAssessment) {
		String oldVulnerableGroupsAssessment = vulnerableGroupsAssessment;
		vulnerableGroupsAssessment = newVulnerableGroupsAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__VULNERABLE_GROUPS_ASSESSMENT, oldVulnerableGroupsAssessment, vulnerableGroupsAssessment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_IDENTIFICATION:
				return getRiskIdentification();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_ESTIMATION:
				return getRiskEstimation();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__POST_MARKET_RISK_EVALUATION:
				return getPostMarketRiskEvaluation();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_MITIGATION:
				return getRiskMitigation();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RESIDUAL_RISK:
				return getResidualRisk();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_PROCEDURE:
				return getTestingProcedure();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_METRICS:
				return getTestingMetrics();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__VULNERABLE_GROUPS_ASSESSMENT:
				return getVulnerableGroupsAssessment();
			case EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_IDENTIFICATION:
				setRiskIdentification((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_ESTIMATION:
				setRiskEstimation((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__POST_MARKET_RISK_EVALUATION:
				setPostMarketRiskEvaluation((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_MITIGATION:
				setRiskMitigation((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RESIDUAL_RISK:
				setResidualRisk((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_PROCEDURE:
				setTestingProcedure((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_METRICS:
				setTestingMetrics((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__VULNERABLE_GROUPS_ASSESSMENT:
				setVulnerableGroupsAssessment((String)newValue);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_IDENTIFICATION:
				setRiskIdentification(RISK_IDENTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_ESTIMATION:
				setRiskEstimation(RISK_ESTIMATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__POST_MARKET_RISK_EVALUATION:
				setPostMarketRiskEvaluation(POST_MARKET_RISK_EVALUATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_MITIGATION:
				setRiskMitigation(RISK_MITIGATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RESIDUAL_RISK:
				setResidualRisk(RESIDUAL_RISK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_PROCEDURE:
				setTestingProcedure(TESTING_PROCEDURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_METRICS:
				setTestingMetrics(TESTING_METRICS_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__VULNERABLE_GROUPS_ASSESSMENT:
				setVulnerableGroupsAssessment(VULNERABLE_GROUPS_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT:
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
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_IDENTIFICATION:
				return RISK_IDENTIFICATION_EDEFAULT == null ? riskIdentification != null : !RISK_IDENTIFICATION_EDEFAULT.equals(riskIdentification);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_ESTIMATION:
				return RISK_ESTIMATION_EDEFAULT == null ? riskEstimation != null : !RISK_ESTIMATION_EDEFAULT.equals(riskEstimation);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__POST_MARKET_RISK_EVALUATION:
				return POST_MARKET_RISK_EVALUATION_EDEFAULT == null ? postMarketRiskEvaluation != null : !POST_MARKET_RISK_EVALUATION_EDEFAULT.equals(postMarketRiskEvaluation);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RISK_MITIGATION:
				return RISK_MITIGATION_EDEFAULT == null ? riskMitigation != null : !RISK_MITIGATION_EDEFAULT.equals(riskMitigation);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__RESIDUAL_RISK:
				return RESIDUAL_RISK_EDEFAULT == null ? residualRisk != null : !RESIDUAL_RISK_EDEFAULT.equals(residualRisk);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_PROCEDURE:
				return TESTING_PROCEDURE_EDEFAULT == null ? testingProcedure != null : !TESTING_PROCEDURE_EDEFAULT.equals(testingProcedure);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__TESTING_METRICS:
				return TESTING_METRICS_EDEFAULT == null ? testingMetrics != null : !TESTING_METRICS_EDEFAULT.equals(testingMetrics);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__VULNERABLE_GROUPS_ASSESSMENT:
				return VULNERABLE_GROUPS_ASSESSMENT_EDEFAULT == null ? vulnerableGroupsAssessment != null : !VULNERABLE_GROUPS_ASSESSMENT_EDEFAULT.equals(vulnerableGroupsAssessment);
			case EuaiactcompliancePackage.RISK_MANAGEMENT__BASE_ARTIFACT:
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
		result.append(" (RiskIdentification: ");
		result.append(riskIdentification);
		result.append(", RiskEstimation: ");
		result.append(riskEstimation);
		result.append(", PostMarketRiskEvaluation: ");
		result.append(postMarketRiskEvaluation);
		result.append(", RiskMitigation: ");
		result.append(riskMitigation);
		result.append(", ResidualRisk: ");
		result.append(residualRisk);
		result.append(", TestingProcedure: ");
		result.append(testingProcedure);
		result.append(", TestingMetrics: ");
		result.append(testingMetrics);
		result.append(", VulnerableGroupsAssessment: ");
		result.append(vulnerableGroupsAssessment);
		result.append(')');
		return result.toString();
	}

} //RiskManagementImpl
