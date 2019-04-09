/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Description</b></em>'.
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
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getName <em>Name</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterKind <em>Parameter Kind</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterDescription()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Thing'"
 * @generated
 */
public interface ParameterDescription extends EObject {
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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterDescription_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Kind</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind
	 * @see #setParameterKind(ParameterKind)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterDescription_ParameterKind()
	 * @model required="true"
	 * @generated
	 */
	ParameterKind getParameterKind();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterKind <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Kind</em>' attribute.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterKind
	 * @see #getParameterKind()
	 * @generated
	 */
	void setParameterKind(ParameterKind value);

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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterDescription_ParameterType()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription#getParameterType <em>Parameter Type</em>}' attribute.
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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterDescription_DefaultValue()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> getDefaultValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueMany="true" valueOrdered="false"
	 *        valueAnnotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	<A> boolean isValidValue(EList<A> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	<A> boolean isValidValue(A value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueDataType="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.List&lt;A&gt;" valueMany="false"
	 * @generated
	 */
	<A> boolean isValidValue(List<A> value);

} // ParameterDescription
