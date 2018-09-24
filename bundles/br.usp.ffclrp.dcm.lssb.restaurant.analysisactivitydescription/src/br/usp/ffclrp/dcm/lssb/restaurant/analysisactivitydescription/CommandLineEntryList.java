/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line Entry List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of entries for the command line tool.
 * This entry list can be manipulated before being used
 * for the command line.
 * Each item of the final list will be used as a different
 * argument for the command line tool.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList#getManipulators <em>Manipulators</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineEntryList()
 * @model abstract="true"
 * @generated
 */
public interface CommandLineEntryList extends EObject {
	/**
	 * Returns the value of the '<em><b>Manipulators</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulators</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineEntryList_Manipulators()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<StringListManipulator> getManipulators();

} // CommandLineEntryList
