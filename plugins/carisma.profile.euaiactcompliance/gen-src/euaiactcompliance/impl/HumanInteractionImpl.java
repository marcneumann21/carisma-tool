/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.HumanInteraction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.HumanInteractionImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanInteractionImpl#isLawEnforcementAuthorised <em>Law Enforcement Authorised</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanInteractionImpl#isObviousAIInteraction <em>Obvious AI Interaction</em>}</li>
 *   <li>{@link euaiactcompliance.impl.HumanInteractionImpl#isPuplicCriminalOffenceReport <em>Puplic Criminal Offence Report</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumanInteractionImpl extends MinimalEObjectImpl.Container implements HumanInteraction {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The default value of the '{@link #isLawEnforcementAuthorised() <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_ENFORCEMENT_AUTHORISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLawEnforcementAuthorised() <em>Law Enforcement Authorised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLawEnforcementAuthorised()
	 * @generated
	 * @ordered
	 */
	protected boolean lawEnforcementAuthorised = LAW_ENFORCEMENT_AUTHORISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isObviousAIInteraction() <em>Obvious AI Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObviousAIInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBVIOUS_AI_INTERACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObviousAIInteraction() <em>Obvious AI Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObviousAIInteraction()
	 * @generated
	 * @ordered
	 */
	protected boolean obviousAIInteraction = OBVIOUS_AI_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPuplicCriminalOffenceReport() <em>Puplic Criminal Offence Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPuplicCriminalOffenceReport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUPLIC_CRIMINAL_OFFENCE_REPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPuplicCriminalOffenceReport() <em>Puplic Criminal Offence Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPuplicCriminalOffenceReport()
	 * @generated
	 * @ordered
	 */
	protected boolean puplicCriminalOffenceReport = PUPLIC_CRIMINAL_OFFENCE_REPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.HUMAN_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLawEnforcementAuthorised() {
		return lawEnforcementAuthorised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLawEnforcementAuthorised(boolean newLawEnforcementAuthorised) {
		boolean oldLawEnforcementAuthorised = lawEnforcementAuthorised;
		lawEnforcementAuthorised = newLawEnforcementAuthorised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED, oldLawEnforcementAuthorised, lawEnforcementAuthorised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObviousAIInteraction() {
		return obviousAIInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObviousAIInteraction(boolean newObviousAIInteraction) {
		boolean oldObviousAIInteraction = obviousAIInteraction;
		obviousAIInteraction = newObviousAIInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION, oldObviousAIInteraction, obviousAIInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPuplicCriminalOffenceReport() {
		return puplicCriminalOffenceReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPuplicCriminalOffenceReport(boolean newPuplicCriminalOffenceReport) {
		boolean oldPuplicCriminalOffenceReport = puplicCriminalOffenceReport;
		puplicCriminalOffenceReport = newPuplicCriminalOffenceReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT, oldPuplicCriminalOffenceReport, puplicCriminalOffenceReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED:
				return isLawEnforcementAuthorised();
			case EuaiactcompliancePackage.HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION:
				return isObviousAIInteraction();
			case EuaiactcompliancePackage.HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT:
				return isPuplicCriminalOffenceReport();
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
			case EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED:
				setLawEnforcementAuthorised((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION:
				setObviousAIInteraction((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT:
				setPuplicCriminalOffenceReport((Boolean)newValue);
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
			case EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED:
				setLawEnforcementAuthorised(LAW_ENFORCEMENT_AUTHORISED_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION:
				setObviousAIInteraction(OBVIOUS_AI_INTERACTION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT:
				setPuplicCriminalOffenceReport(PUPLIC_CRIMINAL_OFFENCE_REPORT_EDEFAULT);
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
			case EuaiactcompliancePackage.HUMAN_INTERACTION__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__LAW_ENFORCEMENT_AUTHORISED:
				return lawEnforcementAuthorised != LAW_ENFORCEMENT_AUTHORISED_EDEFAULT;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__OBVIOUS_AI_INTERACTION:
				return obviousAIInteraction != OBVIOUS_AI_INTERACTION_EDEFAULT;
			case EuaiactcompliancePackage.HUMAN_INTERACTION__PUPLIC_CRIMINAL_OFFENCE_REPORT:
				return puplicCriminalOffenceReport != PUPLIC_CRIMINAL_OFFENCE_REPORT_EDEFAULT;
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
		result.append(" (LawEnforcementAuthorised: ");
		result.append(lawEnforcementAuthorised);
		result.append(", ObviousAIInteraction: ");
		result.append(obviousAIInteraction);
		result.append(", PuplicCriminalOffenceReport: ");
		result.append(puplicCriminalOffenceReport);
		result.append(')');
		return result.toString();
	}

} //HumanInteractionImpl
