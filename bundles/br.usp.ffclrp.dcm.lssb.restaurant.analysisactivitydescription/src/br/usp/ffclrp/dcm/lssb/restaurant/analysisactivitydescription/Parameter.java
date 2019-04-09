/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This metaclass describes a parameter of a command line application.
 * A parameter is a argument that is passed by its literal value.
 * @SeeOther Dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='defaultValueCardinalityMustBeLessThanMaximun'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot defaultValueCardinalityMustBeLessThanMaximun='\n            if maximumCardinality &gt; 1 then\n                defaultValue-&gt;size() &lt;= maximumCardinality\n            else true endif'"
 * @generated
 */
public interface Parameter extends MultiplicityElement, IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @see #setParameterType(ParameterType)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameter_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameter_DefaultValue()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> getDefaultValue();

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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameter_Constraints()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Parameter
