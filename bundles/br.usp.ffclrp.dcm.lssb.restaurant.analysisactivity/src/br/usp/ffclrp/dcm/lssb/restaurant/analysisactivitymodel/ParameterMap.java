/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;

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
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription}.
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
	EList<ParameterDescription> getDescriptions();

} // ParameterMap
