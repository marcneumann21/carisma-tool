/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.AnnexIIIUseCase;
import euaiactcompliance.EuaiactcompliancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annex III Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isBiometricIdentification <em>Biometric Identification</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isBiometricCategorisation <em>Biometric Categorisation</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isCriticalInfrastructure <em>Critical Infrastructure</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isEducation <em>Education</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isHumanEmployment <em>Human Employment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isEssentialServices <em>Essential Services</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isLaw <em>Law</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isMigration <em>Migration</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isJustice <em>Justice</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isNarrowProceduralTask <em>Narrow Procedural Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isImprovesHumanActivity <em>Improves Human Activity</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#isPreparatoryTask <em>Preparatory Task</em>}</li>
 *   <li>{@link euaiactcompliance.impl.AnnexIIIUseCaseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnexIIIUseCaseImpl extends MinimalEObjectImpl.Container implements AnnexIIIUseCase {
	/**
	 * The default value of the '{@link #isBiometricIdentification() <em>Biometric Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIOMETRIC_IDENTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBiometricIdentification() <em>Biometric Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricIdentification()
	 * @generated
	 * @ordered
	 */
	protected boolean biometricIdentification = BIOMETRIC_IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBiometricCategorisation() <em>Biometric Categorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricCategorisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIOMETRIC_CATEGORISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBiometricCategorisation() <em>Biometric Categorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiometricCategorisation()
	 * @generated
	 * @ordered
	 */
	protected boolean biometricCategorisation = BIOMETRIC_CATEGORISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCriticalInfrastructure() <em>Critical Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticalInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_INFRASTRUCTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCriticalInfrastructure() <em>Critical Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCriticalInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected boolean criticalInfrastructure = CRITICAL_INFRASTRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEducation() <em>Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDUCATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEducation() <em>Education</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEducation()
	 * @generated
	 * @ordered
	 */
	protected boolean education = EDUCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHumanEmployment() <em>Human Employment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanEmployment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HUMAN_EMPLOYMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHumanEmployment() <em>Human Employment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHumanEmployment()
	 * @generated
	 * @ordered
	 */
	protected boolean humanEmployment = HUMAN_EMPLOYMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEssentialServices() <em>Essential Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEssentialServices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESSENTIAL_SERVICES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEssentialServices() <em>Essential Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEssentialServices()
	 * @generated
	 * @ordered
	 */
	protected boolean essentialServices = ESSENTIAL_SERVICES_EDEFAULT;

	/**
	 * The default value of the '{@link #isLaw() <em>Law</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaw()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLaw() <em>Law</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaw()
	 * @generated
	 * @ordered
	 */
	protected boolean law = LAW_EDEFAULT;

	/**
	 * The default value of the '{@link #isMigration() <em>Migration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMigration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIGRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMigration() <em>Migration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMigration()
	 * @generated
	 * @ordered
	 */
	protected boolean migration = MIGRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isJustice() <em>Justice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJustice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUSTICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJustice() <em>Justice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJustice()
	 * @generated
	 * @ordered
	 */
	protected boolean justice = JUSTICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NARROW_PROCEDURAL_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNarrowProceduralTask() <em>Narrow Procedural Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNarrowProceduralTask()
	 * @generated
	 * @ordered
	 */
	protected boolean narrowProceduralTask = NARROW_PROCEDURAL_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPROVES_HUMAN_ACTIVITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImprovesHumanActivity() <em>Improves Human Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImprovesHumanActivity()
	 * @generated
	 * @ordered
	 */
	protected boolean improvesHumanActivity = IMPROVES_HUMAN_ACTIVITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPARATORY_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreparatoryTask() <em>Preparatory Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreparatoryTask()
	 * @generated
	 * @ordered
	 */
	protected boolean preparatoryTask = PREPARATORY_TASK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnexIIIUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.ANNEX_III_USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBiometricIdentification() {
		return biometricIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiometricIdentification(boolean newBiometricIdentification) {
		boolean oldBiometricIdentification = biometricIdentification;
		biometricIdentification = newBiometricIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION, oldBiometricIdentification, biometricIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBiometricCategorisation() {
		return biometricCategorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiometricCategorisation(boolean newBiometricCategorisation) {
		boolean oldBiometricCategorisation = biometricCategorisation;
		biometricCategorisation = newBiometricCategorisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION, oldBiometricCategorisation, biometricCategorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCriticalInfrastructure() {
		return criticalInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticalInfrastructure(boolean newCriticalInfrastructure) {
		boolean oldCriticalInfrastructure = criticalInfrastructure;
		criticalInfrastructure = newCriticalInfrastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE, oldCriticalInfrastructure, criticalInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEducation() {
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEducation(boolean newEducation) {
		boolean oldEducation = education;
		education = newEducation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__EDUCATION, oldEducation, education));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHumanEmployment() {
		return humanEmployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanEmployment(boolean newHumanEmployment) {
		boolean oldHumanEmployment = humanEmployment;
		humanEmployment = newHumanEmployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT, oldHumanEmployment, humanEmployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEssentialServices() {
		return essentialServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEssentialServices(boolean newEssentialServices) {
		boolean oldEssentialServices = essentialServices;
		essentialServices = newEssentialServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__ESSENTIAL_SERVICES, oldEssentialServices, essentialServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLaw() {
		return law;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaw(boolean newLaw) {
		boolean oldLaw = law;
		law = newLaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__LAW, oldLaw, law));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMigration() {
		return migration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMigration(boolean newMigration) {
		boolean oldMigration = migration;
		migration = newMigration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__MIGRATION, oldMigration, migration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isJustice() {
		return justice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustice(boolean newJustice) {
		boolean oldJustice = justice;
		justice = newJustice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__JUSTICE, oldJustice, justice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNarrowProceduralTask() {
		return narrowProceduralTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNarrowProceduralTask(boolean newNarrowProceduralTask) {
		boolean oldNarrowProceduralTask = narrowProceduralTask;
		narrowProceduralTask = newNarrowProceduralTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK, oldNarrowProceduralTask, narrowProceduralTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImprovesHumanActivity() {
		return improvesHumanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImprovesHumanActivity(boolean newImprovesHumanActivity) {
		boolean oldImprovesHumanActivity = improvesHumanActivity;
		improvesHumanActivity = newImprovesHumanActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY, oldImprovesHumanActivity, improvesHumanActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreparatoryTask() {
		return preparatoryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreparatoryTask(boolean newPreparatoryTask) {
		boolean oldPreparatoryTask = preparatoryTask;
		preparatoryTask = newPreparatoryTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__PREPARATORY_TASK, oldPreparatoryTask, preparatoryTask));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION:
				return isBiometricIdentification();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION:
				return isBiometricCategorisation();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE:
				return isCriticalInfrastructure();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__EDUCATION:
				return isEducation();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT:
				return isHumanEmployment();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__ESSENTIAL_SERVICES:
				return isEssentialServices();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__LAW:
				return isLaw();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__MIGRATION:
				return isMigration();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__JUSTICE:
				return isJustice();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK:
				return isNarrowProceduralTask();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				return isImprovesHumanActivity();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__PREPARATORY_TASK:
				return isPreparatoryTask();
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
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
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION:
				setBiometricIdentification((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION:
				setBiometricCategorisation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE:
				setCriticalInfrastructure((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__EDUCATION:
				setEducation((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT:
				setHumanEmployment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__ESSENTIAL_SERVICES:
				setEssentialServices((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__LAW:
				setLaw((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__MIGRATION:
				setMigration((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__JUSTICE:
				setJustice((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__PREPARATORY_TASK:
				setPreparatoryTask((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
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
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION:
				setBiometricIdentification(BIOMETRIC_IDENTIFICATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION:
				setBiometricCategorisation(BIOMETRIC_CATEGORISATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE:
				setCriticalInfrastructure(CRITICAL_INFRASTRUCTURE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__EDUCATION:
				setEducation(EDUCATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT:
				setHumanEmployment(HUMAN_EMPLOYMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__ESSENTIAL_SERVICES:
				setEssentialServices(ESSENTIAL_SERVICES_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__LAW:
				setLaw(LAW_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__MIGRATION:
				setMigration(MIGRATION_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__JUSTICE:
				setJustice(JUSTICE_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK:
				setNarrowProceduralTask(NARROW_PROCEDURAL_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				setImprovesHumanActivity(IMPROVES_HUMAN_ACTIVITY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__PREPARATORY_TASK:
				setPreparatoryTask(PREPARATORY_TASK_EDEFAULT);
				return;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
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
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_IDENTIFICATION:
				return biometricIdentification != BIOMETRIC_IDENTIFICATION_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BIOMETRIC_CATEGORISATION:
				return biometricCategorisation != BIOMETRIC_CATEGORISATION_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__CRITICAL_INFRASTRUCTURE:
				return criticalInfrastructure != CRITICAL_INFRASTRUCTURE_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__EDUCATION:
				return education != EDUCATION_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__HUMAN_EMPLOYMENT:
				return humanEmployment != HUMAN_EMPLOYMENT_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__ESSENTIAL_SERVICES:
				return essentialServices != ESSENTIAL_SERVICES_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__LAW:
				return law != LAW_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__MIGRATION:
				return migration != MIGRATION_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__JUSTICE:
				return justice != JUSTICE_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__NARROW_PROCEDURAL_TASK:
				return narrowProceduralTask != NARROW_PROCEDURAL_TASK_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__IMPROVES_HUMAN_ACTIVITY:
				return improvesHumanActivity != IMPROVES_HUMAN_ACTIVITY_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__PREPARATORY_TASK:
				return preparatoryTask != PREPARATORY_TASK_EDEFAULT;
			case EuaiactcompliancePackage.ANNEX_III_USE_CASE__BASE_USE_CASE:
				return base_UseCase != null;
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
		result.append(" (BiometricIdentification: ");
		result.append(biometricIdentification);
		result.append(", BiometricCategorisation: ");
		result.append(biometricCategorisation);
		result.append(", CriticalInfrastructure: ");
		result.append(criticalInfrastructure);
		result.append(", Education: ");
		result.append(education);
		result.append(", HumanEmployment: ");
		result.append(humanEmployment);
		result.append(", EssentialServices: ");
		result.append(essentialServices);
		result.append(", Law: ");
		result.append(law);
		result.append(", Migration: ");
		result.append(migration);
		result.append(", Justice: ");
		result.append(justice);
		result.append(", NarrowProceduralTask: ");
		result.append(narrowProceduralTask);
		result.append(", ImprovesHumanActivity: ");
		result.append(improvesHumanActivity);
		result.append(", PreparatoryTask: ");
		result.append(preparatoryTask);
		result.append(')');
		return result.toString();
	}

} //AnnexIIIUseCaseImpl
