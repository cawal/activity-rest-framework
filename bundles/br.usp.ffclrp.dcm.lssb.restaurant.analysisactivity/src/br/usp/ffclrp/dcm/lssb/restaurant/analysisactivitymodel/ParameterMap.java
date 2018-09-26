/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getParameterMap()
 * @model superTypes="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.JavaMap&lt;org.eclipse.emf.ecore.EString, br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Object&gt;"
 * @generated
 */
public interface ParameterMap extends EObject, Map<String, Object> {
	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage#getParameterMap_Descriptions()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Parameter> getDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" mapType="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.JavaMap&lt;org.eclipse.emf.ecore.EString, br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Object&gt;"
	 * @generated
	 */
	ValidationResult validateParameters(Map<String, Object> map);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueDataType="br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Object"
	 * @generated
	 */
	ValidationResult validateParameter(String name, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDefaultValues();

} // ParameterMap
