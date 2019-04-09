/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This metaclass describes a dataset of the command line application.
 * A Dataset is a number of related files. These files contains the data
 * of most interest for the analysis and are passed for the underlying tool
 * by their file system paths.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDataset()
 * @model abstract="true"
 * @generated
 */
public interface Dataset extends MultiplicityElement, IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see #setMimetype(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDataset_Mimetype()
	 * @model
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getDataset_Constraints()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Dataset
