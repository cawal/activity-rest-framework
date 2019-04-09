/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMinimumCardinality <em>Minimum Cardinality</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMaximumCardinality <em>Maximum Cardinality</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getMultiplicityElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyPositiveNumbersForMinimumCardinality OnlyPositiveNumbersOrMinusOneForMaximumCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OnlyPositiveNumbersForMinimumCardinality='\n            minimumCardinality &gt;= 1' OnlyPositiveNumbersOrMinusOneForMaximumCardinality='\n            maximumCardinality &gt;= 1 or maximumCardinality = -1'"
 * @generated
 */
public interface MultiplicityElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum Cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Cardinality</em>' attribute.
	 * @see #setMinimumCardinality(BigInteger)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getMultiplicityElement_MinimumCardinality()
	 * @model default="1" required="true"
	 * @generated
	 */
	BigInteger getMinimumCardinality();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMinimumCardinality <em>Minimum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Cardinality</em>' attribute.
	 * @see #getMinimumCardinality()
	 * @generated
	 */
	void setMinimumCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maximum Cardinality</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cardinality</em>' attribute.
	 * @see #setMaximumCardinality(BigInteger)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getMultiplicityElement_MaximumCardinality()
	 * @model default="1" required="true"
	 * @generated
	 */
	BigInteger getMaximumCardinality();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MultiplicityElement#getMaximumCardinality <em>Maximum Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cardinality</em>' attribute.
	 * @see #getMaximumCardinality()
	 * @generated
	 */
	void setMaximumCardinality(BigInteger value);

} // MultiplicityElement
