/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Command Line Entry List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getLiteralCommandLineEntryList()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOrMoreLiterals'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneOrMoreLiterals='\n            literals-&gt;size() &gt; 0'"
 * @generated
 */
public interface LiteralCommandLineEntryList extends CommandLineEntryList {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' attribute list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getLiteralCommandLineEntryList_Literals()
	 * @model annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<String> getLiterals();

} // LiteralCommandLineEntryList
