/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDatasetConstraint()
 * @model abstract="true"
 * @generated
 */
public interface DatasetConstraint extends ReadinessConstraint {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference.
	 * @see #setDataset(DatasetDescription)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDatasetConstraint_Dataset()
	 * @model required="true"
	 * @generated
	 */
	DatasetDescription getDataset();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetConstraint#getDataset <em>Dataset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(DatasetDescription value);

} // DatasetConstraint
