/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maximun Parameter Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getMaximunParameterCardinalityConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyPositiveNumbersOrInfinite'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnlyPositiveNumbersOrInfinite='\n            value = -1 or value &gt; 0'"
 * @generated
 */
public interface MaximunParameterCardinalityConstraint extends ParameterConstraint {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getMaximunParameterCardinalityConstraint_Value()
	 * @model
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // MaximunParameterCardinalityConstraint
