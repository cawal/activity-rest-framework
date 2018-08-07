/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Dataset Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AbstractDatasetConstraint#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAbstractDatasetConstraint()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDatasetConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference.
	 * @see #setOn(Dataset)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAbstractDatasetConstraint_On()
	 * @model required="true"
	 * @generated
	 */
	Dataset getOn();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AbstractDatasetConstraint#getOn <em>On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Dataset value);

} // AbstractDatasetConstraint
