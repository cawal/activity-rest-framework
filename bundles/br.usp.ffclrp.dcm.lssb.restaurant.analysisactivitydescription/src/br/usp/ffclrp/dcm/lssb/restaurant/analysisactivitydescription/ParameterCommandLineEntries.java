/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Command Line Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterCommandLineEntries()
 * @model
 * @generated
 */
public interface ParameterCommandLineEntries extends CommandLineEntries {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterProperties)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getParameterCommandLineEntries_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterProperties getParameter();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntries#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterProperties value);

} // ParameterCommandLineEntries
