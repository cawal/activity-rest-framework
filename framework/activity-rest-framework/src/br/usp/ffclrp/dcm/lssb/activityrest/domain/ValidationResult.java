/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getIsValid <em>Is Valid</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getInvalidValues <em>Invalid Values</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#getValidationResult()
 * @model
 * @generated
 */
public interface ValidationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(Boolean)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#getValidationResult_IsValid()
	 * @model
	 * @generated
	 */
	Boolean getIsValid();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #getIsValid()
	 * @generated
	 */
	void setIsValid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Invalid Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Values</em>' reference.
	 * @see #setInvalidValues(Map)
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#getValidationResult_InvalidValues()
	 * @model type="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.JavaMap&lt;org.eclipse.emf.ecore.EString, br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Object&gt;" required="true"
	 * @generated
	 */
	Map<String, Object> getInvalidValues();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ValidationResult#getInvalidValues <em>Invalid Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Values</em>' reference.
	 * @see #getInvalidValues()
	 * @generated
	 */
	void setInvalidValues(Map<String, Object> value);

} // ValidationResult
