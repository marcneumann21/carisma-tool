/**
 */
package euaiactcompliance.impl;

import euaiactcompliance.EuaiactcompliancePackage;
import euaiactcompliance.ProductCategory;
import euaiactcompliance.ProductEmbedding;
import euaiactcompliance.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Embedding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link euaiactcompliance.impl.ProductEmbeddingImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ProductEmbeddingImpl#isFailureEndangerSafety <em>Failure Endanger Safety</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ProductEmbeddingImpl#isThirdPartyConformityAssessment <em>Third Party Conformity Assessment</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ProductEmbeddingImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link euaiactcompliance.impl.ProductEmbeddingImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductEmbeddingImpl extends MinimalEObjectImpl.Container implements ProductEmbedding {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The default value of the '{@link #isFailureEndangerSafety() <em>Failure Endanger Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailureEndangerSafety()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILURE_ENDANGER_SAFETY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailureEndangerSafety() <em>Failure Endanger Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailureEndangerSafety()
	 * @generated
	 * @ordered
	 */
	protected boolean failureEndangerSafety = FAILURE_ENDANGER_SAFETY_EDEFAULT;

	/**
	 * The default value of the '{@link #isThirdPartyConformityAssessment() <em>Third Party Conformity Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdPartyConformityAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THIRD_PARTY_CONFORMITY_ASSESSMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThirdPartyConformityAssessment() <em>Third Party Conformity Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdPartyConformityAssessment()
	 * @generated
	 * @ordered
	 */
	protected boolean thirdPartyConformityAssessment = THIRD_PARTY_CONFORMITY_ASSESSMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductCategory() <em>Product Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductCategory> productCategory;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.COMPONENT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductEmbeddingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuaiactcompliancePackage.Literals.PRODUCT_EMBEDDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFailureEndangerSafety() {
		return failureEndangerSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureEndangerSafety(boolean newFailureEndangerSafety) {
		boolean oldFailureEndangerSafety = failureEndangerSafety;
		failureEndangerSafety = newFailureEndangerSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY, oldFailureEndangerSafety, failureEndangerSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThirdPartyConformityAssessment() {
		return thirdPartyConformityAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyConformityAssessment(boolean newThirdPartyConformityAssessment) {
		boolean oldThirdPartyConformityAssessment = thirdPartyConformityAssessment;
		thirdPartyConformityAssessment = newThirdPartyConformityAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT, oldThirdPartyConformityAssessment, thirdPartyConformityAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductCategory> getProductCategory() {
		if (productCategory == null) {
			productCategory = new EDataTypeEList<ProductCategory>(ProductCategory.class, this, EuaiactcompliancePackage.PRODUCT_EMBEDDING__PRODUCT_CATEGORY);
		}
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EuaiactcompliancePackage.PRODUCT_EMBEDDING__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY:
				return isFailureEndangerSafety();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT:
				return isThirdPartyConformityAssessment();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__PRODUCT_CATEGORY:
				return getProductCategory();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__ROLE:
				return getRole();
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
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY:
				setFailureEndangerSafety((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT:
				setThirdPartyConformityAssessment((Boolean)newValue);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__PRODUCT_CATEGORY:
				getProductCategory().clear();
				getProductCategory().addAll((Collection<? extends ProductCategory>)newValue);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__ROLE:
				setRole((Role)newValue);
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
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY:
				setFailureEndangerSafety(FAILURE_ENDANGER_SAFETY_EDEFAULT);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT:
				setThirdPartyConformityAssessment(THIRD_PARTY_CONFORMITY_ASSESSMENT_EDEFAULT);
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__PRODUCT_CATEGORY:
				getProductCategory().clear();
				return;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__BASE_COMPONENT:
				return base_Component != null;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__FAILURE_ENDANGER_SAFETY:
				return failureEndangerSafety != FAILURE_ENDANGER_SAFETY_EDEFAULT;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__THIRD_PARTY_CONFORMITY_ASSESSMENT:
				return thirdPartyConformityAssessment != THIRD_PARTY_CONFORMITY_ASSESSMENT_EDEFAULT;
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__PRODUCT_CATEGORY:
				return productCategory != null && !productCategory.isEmpty();
			case EuaiactcompliancePackage.PRODUCT_EMBEDDING__ROLE:
				return role != ROLE_EDEFAULT;
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
		result.append(" (FailureEndangerSafety: ");
		result.append(failureEndangerSafety);
		result.append(", ThirdPartyConformityAssessment: ");
		result.append(thirdPartyConformityAssessment);
		result.append(", ProductCategory: ");
		result.append(productCategory);
		result.append(", Role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ProductEmbeddingImpl
