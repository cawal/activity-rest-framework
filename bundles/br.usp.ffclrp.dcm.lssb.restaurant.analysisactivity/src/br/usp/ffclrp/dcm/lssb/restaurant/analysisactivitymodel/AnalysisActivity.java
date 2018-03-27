/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;

import java.io.File;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getId <em>Id</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getDescription <em>Description</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getErrorReport <em>Error Report</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity()
 * @model
 * @generated
 */
public interface AnalysisActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(AnalysisActivityDescription)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_Description()
	 * @model required="true"
	 * @generated
	 */
	AnalysisActivityDescription getDescription();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(AnalysisActivityDescription value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_Inputs()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Dataset> getInputs();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_Parameters()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_Outputs()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Dataset> getOutputs();

	/**
	 * Returns the value of the '<em><b>Error Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Report</em>' attribute.
	 * @see #setErrorReport(File)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getAnalysisActivity_ErrorReport()
	 * @model dataType="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.File"
	 * @generated
	 */
	File getErrorReport();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity#getErrorReport <em>Error Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Report</em>' attribute.
	 * @see #getErrorReport()
	 * @generated
	 */
	void setErrorReport(File value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dataset inputDatasetForName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dataset outputDatasetForName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Parameter parameterForName(String name);

} // AnalysisActivity
