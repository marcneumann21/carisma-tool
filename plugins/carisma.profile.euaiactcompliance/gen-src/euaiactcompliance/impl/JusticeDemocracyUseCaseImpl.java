/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.JusticeDemocracyUseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justice Democracy Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isJudicialSupport <em>Judicial Support</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isElectionInfluence <em>Election Influence</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#isNoDirectExposure <em>No Direct Exposure</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#getException <em>Exception</em>}</li>
 *   <li>{@link euaiactcompliance.impl.JusticeDemocracyUseCaseImpl#getExceptionJustification <em>Exception Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JusticeDemocracyUseCaseImpl extends MinimalEObjectImpl.Container implements JusticeDemocracyUseCase {
	/**
	 * The default value of the '{@link #isJudicialSupport() <em>Judicial Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJudicialSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUDICIAL_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJudicialSupport() <em>Judicial Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJudicialSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean judicialSupport = JUDICIAL_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isElectionInfluence() <em>Election Influence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectionInfluence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELECTION_INFLUENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElectionInfluence() <em>Election Influence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElectionInfluence()
	 * @generated
	 * @ordered
	 */
	protected boolean electionInfluence = ELECTION_INFLUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDirectExposure() <em>No Direct Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectExposure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DIRECT_EXPOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoDirectExposure() <em>No Direct Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDirectExposure()
	 * @generated
	 * @ordered
	 */
	protected boolean noDirectExposure = NO_DIRECT_EXPOSURE_EDEFAULT;

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
	 * The cached value of the '{@link #getException() <em>Exception</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<euaiactcompliance.Exception> exception;

	/**
	 * The default value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionJustification() <em>Exception Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionJustification()
	 * @generated
	 * @ordered
	 */
	protected String exceptionJustification = EXCEPTION_JUSTIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JusticeDemocracyUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.JUSTICE_DEMOCRACY_USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isJudicialSupport() {
		return judicialSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJudicialSupport(boolean newJudicialSupport) {
		boolean oldJudicialSupport = judicialSupport;
		judicialSupport = newJudicialSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT, oldJudicialSupport, judicialSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElectionInfluence() {
		return electionInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectionInfluence(boolean newElectionInfluence) {
		boolean oldElectionInfluence = electionInfluence;
		electionInfluence = newElectionInfluence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE, oldElectionInfluence, electionInfluence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoDirectExposure() {
		return noDirectExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoDirectExposure(boolean newNoDirectExposure) {
		boolean oldNoDirectExposure = noDirectExposure;
		noDirectExposure = newNoDirectExposure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE, oldNoDirectExposure, noDirectExposure));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<euaiactcompliance.Exception> getException() {
		if (exception == null) {
			exception = new EDataTypeUniqueEList<euaiactcompliance.Exception>(euaiactcompliance.Exception.class, this, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionJustification() {
		return exceptionJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionJustification(String newExceptionJustification) {
		String oldExceptionJustification = exceptionJustification;
		exceptionJustification = newExceptionJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION, oldExceptionJustification, exceptionJustification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				return isJudicialSupport();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				return isElectionInfluence();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				return isNoDirectExposure();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION:
				return getException();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				return getExceptionJustification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				setJudicialSupport((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				setElectionInfluence((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				setNoDirectExposure((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends euaiactcompliance.Exception>)newValue);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification((String)newValue);
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
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				setJudicialSupport(JUDICIAL_SUPPORT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				setElectionInfluence(ELECTION_INFLUENCE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				setNoDirectExposure(NO_DIRECT_EXPOSURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION:
				getException().clear();
				return;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				setExceptionJustification(EXCEPTION_JUSTIFICATION_EDEFAULT);
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
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__JUDICIAL_SUPPORT:
				return judicialSupport != JUDICIAL_SUPPORT_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__ELECTION_INFLUENCE:
				return electionInfluence != ELECTION_INFLUENCE_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__NO_DIRECT_EXPOSURE:
				return noDirectExposure != NO_DIRECT_EXPOSURE_EDEFAULT;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__BASE_USE_CASE:
				return base_UseCase != null;
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case EuaiactcompliancePackage.JUSTICE_DEMOCRACY_USE_CASE__EXCEPTION_JUSTIFICATION:
				return EXCEPTION_JUSTIFICATION_EDEFAULT == null ? exceptionJustification != null : !EXCEPTION_JUSTIFICATION_EDEFAULT.equals(exceptionJustification);
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
		result.append(" (JudicialSupport: ");
		result.append(judicialSupport);
		result.append(", ElectionInfluence: ");
		result.append(electionInfluence);
		result.append(", NoDirectExposure: ");
		result.append(noDirectExposure);
		result.append(", Exception: ");
		result.append(exception);
		result.append(", ExceptionJustification: ");
		result.append(exceptionJustification);
		result.append(')');
		return result.toString();
	}

} //JusticeDemocracyUseCaseImpl
