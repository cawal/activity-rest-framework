/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntries#getManipulators <em>Manipulators</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineEntries()
 * @model abstract="true"
 * @generated
 */
public interface CommandLineEntries extends EObject {
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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineEntries_Manipulators()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator> getManipulators();

} // CommandLineEntries
