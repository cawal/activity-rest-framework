/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dataset Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDatasetKind()
 * @model
 * @generated
 */
public enum DatasetKind implements Enumerator {
	/**
	 * The '<em><b>STANDARD INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_INPUT(0, "STANDARD_INPUT", "STANDARD_INPUT"),

	/**
	 * The '<em><b>STANDARD OUTPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_OUTPUT(1, "STANDARD_OUTPUT", "STANDARD_OUTPUT"),

	/**
	 * The '<em><b>STANDARD ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_ERROR(2, "STANDARD_ERROR", "STANDARD_ERROR"),

	/**
	 * The '<em><b>SINGLE FILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_FILE(3, "SINGLE_FILE", "SINGLE_FILE"),

	/**
	 * The '<em><b>FILE COLLECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_COLLECTION(4, "FILE_COLLECTION", "FILE_COLLECTION");

	/**
	 * The '<em><b>STANDARD INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_INPUT_VALUE = 0;

	/**
	 * The '<em><b>STANDARD OUTPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD OUTPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_OUTPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_OUTPUT_VALUE = 1;

	/**
	 * The '<em><b>STANDARD ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_ERROR_VALUE = 2;

	/**
	 * The '<em><b>SINGLE FILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE FILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_FILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_FILE_VALUE = 3;

	/**
	 * The '<em><b>FILE COLLECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILE COLLECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_COLLECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILE_COLLECTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dataset Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatasetKind[] VALUES_ARRAY =
		new DatasetKind[] {
			STANDARD_INPUT,
			STANDARD_OUTPUT,
			STANDARD_ERROR,
			SINGLE_FILE,
			FILE_COLLECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Dataset Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatasetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dataset Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatasetKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dataset Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatasetKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dataset Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatasetKind get(int value) {
		switch (value) {
			case STANDARD_INPUT_VALUE: return STANDARD_INPUT;
			case STANDARD_OUTPUT_VALUE: return STANDARD_OUTPUT;
			case STANDARD_ERROR_VALUE: return STANDARD_ERROR;
			case SINGLE_FILE_VALUE: return SINGLE_FILE;
			case FILE_COLLECTION_VALUE: return FILE_COLLECTION;
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
	private DatasetKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //DatasetKind
