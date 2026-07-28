/**
 */
package euaiactcompliance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator {
	/**
	 * The '<em><b>Machinery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINERY_VALUE
	 * @generated
	 * @ordered
	 */
	MACHINERY(0, "Machinery", "Machinery"),

	/**
	 * The '<em><b>Toy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOY_VALUE
	 * @generated
	 * @ordered
	 */
	TOY(1, "Toy", "Toy"),

	/**
	 * The '<em><b>Elevator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATOR(2, "Elevator", "Elevator"),

	/**
	 * The '<em><b>Medical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICAL(3, "Medical", "Medical"),

	/**
	 * The '<em><b>In Vitro Diagnostics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VITRO_DIAGNOSTICS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_VITRO_DIAGNOSTICS(4, "InVitroDiagnostics", "InVitroDiagnostics"),

	/**
	 * The '<em><b>Personal Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_PROTECTION(5, "PersonalProtection", "PersonalProtection"),

	/**
	 * The '<em><b>Civil Aviation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVIL_AVIATION_VALUE
	 * @generated
	 * @ordered
	 */
	CIVIL_AVIATION(6, "CivilAviation", "CivilAviation"),

	/**
	 * The '<em><b>Rail Sytem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SYTEM_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_SYTEM(7, "RailSytem", "RailSytem"),

	/**
	 * The '<em><b>Agricultural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGRICULTURAL_VALUE
	 * @generated
	 * @ordered
	 */
	AGRICULTURAL(8, "Agricultural", "Agricultural");

	/**
	 * The '<em><b>Machinery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACHINERY
	 * @model name="Machinery"
	 * @generated
	 * @ordered
	 */
	public static final int MACHINERY_VALUE = 0;

	/**
	 * The '<em><b>Toy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOY
	 * @model name="Toy"
	 * @generated
	 * @ordered
	 */
	public static final int TOY_VALUE = 1;

	/**
	 * The '<em><b>Elevator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATOR
	 * @model name="Elevator"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATOR_VALUE = 2;

	/**
	 * The '<em><b>Medical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICAL
	 * @model name="Medical"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICAL_VALUE = 3;

	/**
	 * The '<em><b>In Vitro Diagnostics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VITRO_DIAGNOSTICS
	 * @model name="InVitroDiagnostics"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VITRO_DIAGNOSTICS_VALUE = 4;

	/**
	 * The '<em><b>Personal Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_PROTECTION
	 * @model name="PersonalProtection"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_PROTECTION_VALUE = 5;

	/**
	 * The '<em><b>Civil Aviation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVIL_AVIATION
	 * @model name="CivilAviation"
	 * @generated
	 * @ordered
	 */
	public static final int CIVIL_AVIATION_VALUE = 6;

	/**
	 * The '<em><b>Rail Sytem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SYTEM
	 * @model name="RailSytem"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_SYTEM_VALUE = 7;

	/**
	 * The '<em><b>Agricultural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGRICULTURAL
	 * @model name="Agricultural"
	 * @generated
	 * @ordered
	 */
	public static final int AGRICULTURAL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[] {
			MACHINERY,
			TOY,
			ELEVATOR,
			MEDICAL,
			IN_VITRO_DIAGNOSTICS,
			PERSONAL_PROTECTION,
			CIVIL_AVIATION,
			RAIL_SYTEM,
			AGRICULTURAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value) {
		switch (value) {
			case MACHINERY_VALUE: return MACHINERY;
			case TOY_VALUE: return TOY;
			case ELEVATOR_VALUE: return ELEVATOR;
			case MEDICAL_VALUE: return MEDICAL;
			case IN_VITRO_DIAGNOSTICS_VALUE: return IN_VITRO_DIAGNOSTICS;
			case PERSONAL_PROTECTION_VALUE: return PERSONAL_PROTECTION;
			case CIVIL_AVIATION_VALUE: return CIVIL_AVIATION;
			case RAIL_SYTEM_VALUE: return RAIL_SYTEM;
			case AGRICULTURAL_VALUE: return AGRICULTURAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Category(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Category
