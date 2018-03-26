/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterKind <em>Parameter Kind</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterProperties()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Thing'"
 * @generated
 */
public interface ParameterProperties extends EObject {
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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterProperties_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Kind</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds
	 * @see #setParameterKind(ParameterKinds)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterProperties_ParameterKind()
	 * @model required="true"
	 * @generated
	 */
	ParameterKinds getParameterKind();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterKind <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Kind</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKinds
	 * @see #getParameterKind()
	 * @generated
	 */
	void setParameterKind(ParameterKinds value);

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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterProperties_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterProperties#getParameterType <em>Parameter Type</em>}' attribute.
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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterProperties_DefaultValue()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> getDefaultValue();

} // ParameterProperties
