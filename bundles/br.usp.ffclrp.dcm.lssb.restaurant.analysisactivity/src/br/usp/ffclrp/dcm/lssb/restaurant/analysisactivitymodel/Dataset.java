/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetProperties;

import java.io.File;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getProperties <em>Properties</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getDataset_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(DatasetProperties)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getDataset_Properties()
	 * @model required="true"
	 * @generated
	 */
	DatasetProperties getProperties();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(DatasetProperties value);

	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' attribute list.
	 * The list contents are of type {@link java.io.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' attribute list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getDataset_Datasets()
	 * @model dataType="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.File"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<File> getDatasets();

} // Dataset
