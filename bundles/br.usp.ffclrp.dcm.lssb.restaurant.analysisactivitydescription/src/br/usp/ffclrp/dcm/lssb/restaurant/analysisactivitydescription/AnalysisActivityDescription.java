/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Activity Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This metaclass describes the information necessary to execute a command
 * line application, as well as its inputs and outputs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getInputDatasets <em>Input Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getOutputDatasets <em>Output Datasets</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getCommandLineTemplate <em>Command Line Template</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription#getReadinessContraints <em>Readiness Contraints</em>}</li>
 * </ul>
 *
 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noStdInAmongOutputs noStdOutOrStdErrAmongInputs onlyOneSdtInAmongInputs onlyOneSdtOutAmongOutputs onlyOneSdtErrAmongOutputs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noStdInAmongOutputs='\n            0 = self.outputDatasets-&gt;collect(d :DatasetDescription \n                | d.datasetKind = \'#STANDARD_INPUT\'\n            )-&gt;size()' noStdOutOrStdErrAmongInputs='\n            0 = self.inputDatasets-&gt;collect(d :DatasetDescription \n                | d.datasetKind = \'#STANDARD_OUTPUT\' or d.datasetKind = \'#STANDARD_ERR\'\n            )-&gt;size()' onlyOneSdtInAmongInputs=' \n            2 &gt; self.inputDatasets-&gt;collect(d :DatasetDescription \n                | d.datasetKind = \'#STANDARD_INPUT\'\n            )-&gt;size()' onlyOneSdtOutAmongOutputs=' \n            2 &gt; self.outputDatasets-&gt;collect(d :DatasetDescription \n                | d.datasetKind = \'#STANDARD_OUTPUT\'\n            )-&gt;size()' onlyOneSdtErrAmongOutputs=' \n            2 &gt; self.outputDatasets-&gt;collect(d :DatasetDescription \n                | d.datasetKind = \'#STANDARD_ERR\'\n            )-&gt;size()'"
 * @generated
 */
public interface AnalysisActivityDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription_Parameters()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ParameterDescription> getParameters();

	/**
	 * Returns the value of the '<em><b>Input Datasets</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Datasets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Datasets</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription_InputDatasets()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<DatasetDescription> getInputDatasets();

	/**
	 * Returns the value of the '<em><b>Output Datasets</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Datasets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Datasets</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription_OutputDatasets()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<DatasetDescription> getOutputDatasets();

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
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription_CommandLineTemplate()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<CommandLineEntryList> getCommandLineTemplate();

	/**
	 * Returns the value of the '<em><b>Readiness Contraints</b></em>' containment reference list.
	 * The list contents are of type {@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ReadinessConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readiness Contraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readiness Contraints</em>' containment reference list.
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage#getAnalysisActivityDescription_ReadinessContraints()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ReadinessConstraint> getReadinessContraints();

} // AnalysisActivityDescription
