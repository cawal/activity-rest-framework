/**
 */
package br.usp.ffclrp.dcm.lssb.activityrest.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Validation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterValidationResult#getIsValid <em>Is Valid</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#getParameterValidationResult()
 * @model
 * @generated
 */
public interface ParameterValidationResult extends EObject {
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
	 * @see br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage#getParameterValidationResult_IsValid()
	 * @model
	 * @generated
	 */
	Boolean getIsValid();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterValidationResult#getIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #getIsValid()
	 * @generated
	 */
	void setIsValid(Boolean value);

} // ParameterValidationResult
