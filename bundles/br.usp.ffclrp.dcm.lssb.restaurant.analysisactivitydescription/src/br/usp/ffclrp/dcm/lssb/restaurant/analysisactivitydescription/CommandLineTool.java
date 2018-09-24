/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Line Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A command line tool that can be called to execute the activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getCommandLineTemplate <em>Command Line Template</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardInputStream <em>Standard Input Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardOutputStream <em>Standard Output Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardErrorStream <em>Standard Error Stream</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getExitCodes <em>Exit Codes</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stdInMustBeInputDatasetInRelatedActivity stdOutMustBeOutputDatasetInRelatedActivity stdErrMustBeOutputDatasetInRelatedActivity stdInMustHave1AsCardinality stdOutMustHave1AsCardinality stdErrMustHave1AsCardinality'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot stdInMustBeInputDatasetInRelatedActivity='\n            if not self.standardInputStream.oclIsUndefined() then\n                self.activity.inputDatasets-&gt;includes(self.standardInputStream)\n            else true endif' stdOutMustBeOutputDatasetInRelatedActivity='\n            if not self.standardOutputStream.oclIsUndefined() then\n                self.activity.outputDatasets-&gt;includes(self.standardOutputStream)\n            else true endif' stdErrMustBeOutputDatasetInRelatedActivity='\n            if not self.standardErrorStream.oclIsUndefined() then\n                self.activity.outputDatasets-&gt;includes(self.standardErrorStream)\n            else true endif' stdInMustHave1AsCardinality='\n            if not self.standardInputStream.oclIsUndefined() then\n                self.standardInputStream.minimumCardinality = 1\n                and self.standardInputStream.maximumCardinality = 1\n            else \n                true \n            endif' stdOutMustHave1AsCardinality='\n            if not self.standardOutputStream.oclIsUndefined() then\n                self.standardOutputStream.minimumCardinality = 1\n                and self.standardOutputStream.maximumCardinality = 1\n            else \n                true \n            endif' stdErrMustHave1AsCardinality='\n            if not self.standardErrorStream.oclIsUndefined() then\n                self.standardErrorStream.minimumCardinality = 1\n                and self.standardErrorStream.maximumCardinality = 1\n            else \n                true \n            endif'"
 * @generated
 */
public interface CommandLineTool extends FunctionalEntity {
	/**
	 * Returns the value of the '<em><b>Command Line Template</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Line Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Line Template</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool_CommandLineTemplate()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<CommandLineEntryList> getCommandLineTemplate();

	/**
	 * Returns the value of the '<em><b>Standard Input Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Input Stream</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Input Stream</em>' reference.
	 * @see #setStandardInputStream(InputDataset)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool_StandardInputStream()
	 * @model
	 * @generated
	 */
	InputDataset getStandardInputStream();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardInputStream <em>Standard Input Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Input Stream</em>' reference.
	 * @see #getStandardInputStream()
	 * @generated
	 */
	void setStandardInputStream(InputDataset value);

	/**
	 * Returns the value of the '<em><b>Standard Output Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Output Stream</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Output Stream</em>' reference.
	 * @see #setStandardOutputStream(OutputDataset)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool_StandardOutputStream()
	 * @model
	 * @generated
	 */
	OutputDataset getStandardOutputStream();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardOutputStream <em>Standard Output Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Output Stream</em>' reference.
	 * @see #getStandardOutputStream()
	 * @generated
	 */
	void setStandardOutputStream(OutputDataset value);

	/**
	 * Returns the value of the '<em><b>Standard Error Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Error Stream</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Error Stream</em>' reference.
	 * @see #setStandardErrorStream(OutputDataset)
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool_StandardErrorStream()
	 * @model
	 * @generated
	 */
	OutputDataset getStandardErrorStream();

	/**
	 * Sets the value of the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool#getStandardErrorStream <em>Standard Error Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Error Stream</em>' reference.
	 * @see #getStandardErrorStream()
	 * @generated
	 */
	void setStandardErrorStream(OutputDataset value);

	/**
	 * Returns the value of the '<em><b>Exit Codes</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Codes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Codes</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getCommandLineTool_ExitCodes()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ExitCode> getExitCodes();

} // CommandLineTool
