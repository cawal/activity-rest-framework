/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends StringListManipulator {
	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage#getJoin_Delimiter()
	 * @model required="true"
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

} // Join
