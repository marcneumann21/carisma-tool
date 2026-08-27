/**
 */
package euaiactcompliance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage#getProductCategory()
 * @model
 * @generated
 */
public enum ProductCategory implements Enumerator {
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
	 * The '<em><b>Recreational Craft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECREATIONAL_CRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	RECREATIONAL_CRAFT(2, "RecreationalCraft", "RecreationalCraft"),

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
	 * The '<em><b>Rail System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL_SYSTEM(7, "RailSystem", "RailSystem"),

	/**
	 * The '<em><b>Agricultural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGRICULTURAL_VALUE
	 * @generated
	 * @ordered
	 */
	AGRICULTURAL(8, "Agricultural", "Agricultural"),

	/**
	 * The '<em><b>Two Three Wheel Vehicle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_THREE_WHEEL_VEHICLE_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_THREE_WHEEL_VEHICLE(9, "TwoThreeWheelVehicle", "TwoThreeWheelVehicle"),

	/**
	 * The '<em><b>Marine Equipment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARINE_EQUIPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MARINE_EQUIPMENT(10, "MarineEquipment", "MarineEquipment"),

	/**
	 * The '<em><b>Motor Vehicle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VEHICLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_VEHICLE(11, "MotorVehicle", "MotorVehicle"),

	/**
	 * The '<em><b>Motor Vehicle Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VEHICLE_SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_VEHICLE_SAFETY(12, "MotorVehicleSafety", "MotorVehicleSafety"),

	/**
	 * The '<em><b>Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFT(13, "Lift", "Lift"),

	/**
	 * The '<em><b>Explosive Atmosphere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLOSIVE_ATMOSPHERE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLOSIVE_ATMOSPHERE(14, "ExplosiveAtmosphere", "ExplosiveAtmosphere"),

	/**
	 * The '<em><b>Radio Equipment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_EQUIPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_EQUIPMENT(15, "RadioEquipment", "RadioEquipment"),

	/**
	 * The '<em><b>Pressure Equipment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_EQUIPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE_EQUIPMENT(16, "PressureEquipment", "PressureEquipment"),

	/**
	 * The '<em><b>Cableway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	CABLEWAY(17, "Cableway", "Cableway"),

	/**
	 * The '<em><b>Gas Appliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_APPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	GAS_APPLIANCE(18, "GasAppliance", "GasAppliance"),

	/**
	 * The '<em><b>Unmanned Aircraft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMANNED_AIRCRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	UNMANNED_AIRCRAFT(19, "UnmannedAircraft", "UnmannedAircraft");

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
	 * The '<em><b>Recreational Craft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECREATIONAL_CRAFT
	 * @model name="RecreationalCraft"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RecreationalCraft '"
	 * @generated
	 * @ordered
	 */
	public static final int RECREATIONAL_CRAFT_VALUE = 2;

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
	 * The '<em><b>Rail System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_SYSTEM
	 * @model name="RailSystem"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_SYSTEM_VALUE = 7;

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
	 * The '<em><b>Two Three Wheel Vehicle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_THREE_WHEEL_VEHICLE
	 * @model name="TwoThreeWheelVehicle"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_THREE_WHEEL_VEHICLE_VALUE = 9;

	/**
	 * The '<em><b>Marine Equipment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARINE_EQUIPMENT
	 * @model name="MarineEquipment"
	 * @generated
	 * @ordered
	 */
	public static final int MARINE_EQUIPMENT_VALUE = 10;

	/**
	 * The '<em><b>Motor Vehicle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VEHICLE
	 * @model name="MotorVehicle"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_VEHICLE_VALUE = 11;

	/**
	 * The '<em><b>Motor Vehicle Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_VEHICLE_SAFETY
	 * @model name="MotorVehicleSafety"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_VEHICLE_SAFETY_VALUE = 12;

	/**
	 * The '<em><b>Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT
	 * @model name="Lift"
	 * @generated
	 * @ordered
	 */
	public static final int LIFT_VALUE = 13;

	/**
	 * The '<em><b>Explosive Atmosphere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLOSIVE_ATMOSPHERE
	 * @model name="ExplosiveAtmosphere"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLOSIVE_ATMOSPHERE_VALUE = 14;

	/**
	 * The '<em><b>Radio Equipment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_EQUIPMENT
	 * @model name="RadioEquipment"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_EQUIPMENT_VALUE = 15;

	/**
	 * The '<em><b>Pressure Equipment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_EQUIPMENT
	 * @model name="PressureEquipment"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_EQUIPMENT_VALUE = 16;

	/**
	 * The '<em><b>Cableway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLEWAY
	 * @model name="Cableway"
	 * @generated
	 * @ordered
	 */
	public static final int CABLEWAY_VALUE = 17;

	/**
	 * The '<em><b>Gas Appliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_APPLIANCE
	 * @model name="GasAppliance"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_APPLIANCE_VALUE = 18;

	/**
	 * The '<em><b>Unmanned Aircraft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMANNED_AIRCRAFT
	 * @model name="UnmannedAircraft"
	 * @generated
	 * @ordered
	 */
	public static final int UNMANNED_AIRCRAFT_VALUE = 19;

	/**
	 * An array of all the '<em><b>Product Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductCategory[] VALUES_ARRAY =
		new ProductCategory[] {
			MACHINERY,
			TOY,
			RECREATIONAL_CRAFT,
			MEDICAL,
			IN_VITRO_DIAGNOSTICS,
			PERSONAL_PROTECTION,
			CIVIL_AVIATION,
			RAIL_SYSTEM,
			AGRICULTURAL,
			TWO_THREE_WHEEL_VEHICLE,
			MARINE_EQUIPMENT,
			MOTOR_VEHICLE,
			MOTOR_VEHICLE_SAFETY,
			LIFT,
			EXPLOSIVE_ATMOSPHERE,
			RADIO_EQUIPMENT,
			PRESSURE_EQUIPMENT,
			CABLEWAY,
			GAS_APPLIANCE,
			UNMANNED_AIRCRAFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductCategory get(int value) {
		switch (value) {
			case MACHINERY_VALUE: return MACHINERY;
			case TOY_VALUE: return TOY;
			case RECREATIONAL_CRAFT_VALUE: return RECREATIONAL_CRAFT;
			case MEDICAL_VALUE: return MEDICAL;
			case IN_VITRO_DIAGNOSTICS_VALUE: return IN_VITRO_DIAGNOSTICS;
			case PERSONAL_PROTECTION_VALUE: return PERSONAL_PROTECTION;
			case CIVIL_AVIATION_VALUE: return CIVIL_AVIATION;
			case RAIL_SYSTEM_VALUE: return RAIL_SYSTEM;
			case AGRICULTURAL_VALUE: return AGRICULTURAL;
			case TWO_THREE_WHEEL_VEHICLE_VALUE: return TWO_THREE_WHEEL_VEHICLE;
			case MARINE_EQUIPMENT_VALUE: return MARINE_EQUIPMENT;
			case MOTOR_VEHICLE_VALUE: return MOTOR_VEHICLE;
			case MOTOR_VEHICLE_SAFETY_VALUE: return MOTOR_VEHICLE_SAFETY;
			case LIFT_VALUE: return LIFT;
			case EXPLOSIVE_ATMOSPHERE_VALUE: return EXPLOSIVE_ATMOSPHERE;
			case RADIO_EQUIPMENT_VALUE: return RADIO_EQUIPMENT;
			case PRESSURE_EQUIPMENT_VALUE: return PRESSURE_EQUIPMENT;
			case CABLEWAY_VALUE: return CABLEWAY;
			case GAS_APPLIANCE_VALUE: return GAS_APPLIANCE;
			case UNMANNED_AIRCRAFT_VALUE: return UNMANNED_AIRCRAFT;
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
	private ProductCategory(int value, String name, String literal) {
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
	
} //ProductCategory
