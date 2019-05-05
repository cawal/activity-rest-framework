/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Flag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfTrue <em>If True</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getToFlag()
 * @model
 * @generated
 */
public interface ToFlag extends StringListManipulator {
	/**
	 * Returns the value of the '<em><b>If True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If True</em>' attribute.
	 * @see #setIfTrue(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getToFlag_IfTrue()
	 * @model
	 * @generated
	 */
	String getIfTrue();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfTrue <em>If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If True</em>' attribute.
	 * @see #getIfTrue()
	 * @generated
	 */
	void setIfTrue(String value);

	/**
	 * Returns the value of the '<em><b>If False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If False</em>' attribute.
	 * @see #setIfFalse(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getToFlag_IfFalse()
	 * @model
	 * @generated
	 */
	String getIfFalse();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.ToFlag#getIfFalse <em>If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If False</em>' attribute.
	 * @see #getIfFalse()
	 * @generated
	 */
	void setIfFalse(String value);

} // ToFlag
