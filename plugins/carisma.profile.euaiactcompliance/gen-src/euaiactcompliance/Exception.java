/**
 */
package euaiactcompliance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exception</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see euaiactcompliance.EuaiactcompliancePackage#getException()
 * @model
 * @generated
 */
public enum Exception implements Enumerator {
	/**
	 * The '<em><b>Narrow Procedural Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_PROCEDURAL_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	NARROW_PROCEDURAL_TASK(0, "NarrowProceduralTask", "NarrowProceduralTask"),

	/**
	 * The '<em><b>Decision Pattern Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_PATTERN_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_PATTERN_DETECTION(1, "DecisionPatternDetection", "DecisionPatternDetection"),

	/**
	 * The '<em><b>Prepatory Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPATORY_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	PREPATORY_TASK(2, "PrepatoryTask", "PrepatoryTask"),

	/**
	 * The '<em><b>Improves Human Activity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROVES_HUMAN_ACTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROVES_HUMAN_ACTIVITY(3, "ImprovesHumanActivity", "ImprovesHumanActivity");

	/**
	 * The '<em><b>Narrow Procedural Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROW_PROCEDURAL_TASK
	 * @model name="NarrowProceduralTask"
	 * @generated
	 * @ordered
	 */
	public static final int NARROW_PROCEDURAL_TASK_VALUE = 0;

	/**
	 * The '<em><b>Decision Pattern Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_PATTERN_DETECTION
	 * @model name="DecisionPatternDetection"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_PATTERN_DETECTION_VALUE = 1;

	/**
	 * The '<em><b>Prepatory Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPATORY_TASK
	 * @model name="PrepatoryTask"
	 * @generated
	 * @ordered
	 */
	public static final int PREPATORY_TASK_VALUE = 2;

	/**
	 * The '<em><b>Improves Human Activity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROVES_HUMAN_ACTIVITY
	 * @model name="ImprovesHumanActivity"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROVES_HUMAN_ACTIVITY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Exception</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Exception[] VALUES_ARRAY =
		new Exception[] {
			NARROW_PROCEDURAL_TASK,
			DECISION_PATTERN_DETECTION,
			PREPATORY_TASK,
			IMPROVES_HUMAN_ACTIVITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Exception</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Exception> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exception</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exception get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Exception result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exception</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exception getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Exception result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exception</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Exception get(int value) {
		switch (value) {
			case NARROW_PROCEDURAL_TASK_VALUE: return NARROW_PROCEDURAL_TASK;
			case DECISION_PATTERN_DETECTION_VALUE: return DECISION_PATTERN_DETECTION;
			case PREPATORY_TASK_VALUE: return PREPATORY_TASK;
			case IMPROVES_HUMAN_ACTIVITY_VALUE: return IMPROVES_HUMAN_ACTIVITY;
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
	private Exception(int value, String name, String literal) {
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
	
} //Exception
