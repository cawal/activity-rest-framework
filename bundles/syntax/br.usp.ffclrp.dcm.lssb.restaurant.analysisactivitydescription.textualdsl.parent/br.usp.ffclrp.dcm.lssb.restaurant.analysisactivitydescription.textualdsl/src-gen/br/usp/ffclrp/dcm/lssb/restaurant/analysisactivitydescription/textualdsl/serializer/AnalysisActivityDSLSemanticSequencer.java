/*
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.serializer;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomDatasetConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CustomParameterConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MaximunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunDatasetCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.MinimunParameterCardinalityConstraint;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ToolNameCommandLineEntry;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.services.AnalysisActivityDSLGrammarAccess;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendEach;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.AppendListWith;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.Join;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependEach;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.PrependListWith;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AnalysisActivityDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnalysisActivityDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AnalysisActivityDescriptionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AnalysisActivityDescriptionPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.COMMAND_LINE_TOOL:
				sequence_CommandLineTool(context, (CommandLineTool) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.CUSTOM_DATASET_CONSTRAINT:
				sequence_CustomDatasetConstraint(context, (CustomDatasetConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.CUSTOM_PARAMETER_CONSTRAINT:
				sequence_CustomParameterConstraint(context, (CustomParameterConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.DATASET_COMMAND_LINE_ENTRY_LIST:
				sequence_DatasetCommandLineEntryList(context, (DatasetCommandLineEntryList) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.EXIT_CODE:
				sequence_ExitCode(context, (ExitCode) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.INPUT_DATASET:
				sequence_InputDataset(context, (InputDataset) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.LITERAL_COMMAND_LINE_ENTRY_LIST:
				sequence_LiteralCommandLineEntryList(context, (LiteralCommandLineEntryList) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.MAXIMUN_DATASET_CARDINALITY_CONSTRAINT:
				sequence_MaximunDatasetCardinalityConstraint(context, (MaximunDatasetCardinalityConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.MAXIMUN_PARAMETER_CARDINALITY_CONSTRAINT:
				sequence_MaximunParameterCardinalityConstraint(context, (MaximunParameterCardinalityConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.MINIMUN_DATASET_CARDINALITY_CONSTRAINT:
				sequence_MinimunDatasetCardinalityConstraint(context, (MinimunDatasetCardinalityConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.MINIMUN_PARAMETER_CARDINALITY_CONSTRAINT:
				sequence_MinimunParameterCardinalityConstraint(context, (MinimunParameterCardinalityConstraint) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.OUTPUT_DATASET:
				sequence_OutputDataset(context, (OutputDataset) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.PARAMETER:
				sequence_Parameter(context, (br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.PARAMETER_COMMAND_LINE_ENTRY_LIST:
				sequence_ParameterCommandLineEntryList(context, (ParameterCommandLineEntryList) semanticObject); 
				return; 
			case AnalysisActivityDescriptionPackage.TOOL_NAME_COMMAND_LINE_ENTRY:
				sequence_ToolNameCommandLineEntry(context, (ToolNameCommandLineEntry) semanticObject); 
				return; 
			}
		else if (epackage == StringListManipulatorsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StringListManipulatorsPackage.APPEND_EACH:
				sequence_AppendEach(context, (AppendEach) semanticObject); 
				return; 
			case StringListManipulatorsPackage.APPEND_LIST_WITH:
				sequence_AppendListWith(context, (AppendListWith) semanticObject); 
				return; 
			case StringListManipulatorsPackage.JOIN:
				sequence_Join(context, (Join) semanticObject); 
				return; 
			case StringListManipulatorsPackage.PREPEND_EACH:
				sequence_PrependEach(context, (PrependEach) semanticObject); 
				return; 
			case StringListManipulatorsPackage.PREPEND_LIST_WITH:
				sequence_PrependListWith(context, (PrependListWith) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Activity returns Activity
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         (inputDatasets+=InputDataset inputDatasets+=InputDataset*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         (outputDatasets+=OutputDataset outputDatasets+=OutputDataset*)? 
	 *         (readinessContraints+=ReadinessConstraint readinessContraints+=ReadinessConstraint*)? 
	 *         tool=Tool
	 *     )
	 */
	protected void sequence_Activity(ISerializationContext context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringListManipulator returns AppendEach
	 *     AppendEach returns AppendEach
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_AppendEach(ISerializationContext context, AppendEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StringListManipulatorsPackage.Literals.APPEND_EACH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StringListManipulatorsPackage.Literals.APPEND_EACH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppendEachAccess().getValueEStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StringListManipulator returns AppendListWith
	 *     AppendListWith returns AppendListWith
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_AppendListWith(ISerializationContext context, AppendListWith semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StringListManipulatorsPackage.Literals.APPEND_LIST_WITH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StringListManipulatorsPackage.Literals.APPEND_LIST_WITH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppendListWithAccess().getValueEStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tool returns CommandLineTool
	 *     CommandLineTool returns CommandLineTool
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         executablePath=FilePath? 
	 *         (standardInputStream=[InputDataset|EString] | standardOutputStream=[OutputDataset|EString] | standardErrorStream=[OutputDataset|EString])* 
	 *         commandLineTemplate+=CommandLineEntryList 
	 *         commandLineTemplate+=CommandLineEntryList* 
	 *         (exitCodes+=ExitCode exitCodes+=ExitCode*)?
	 *     )
	 */
	protected void sequence_CommandLineTool(ISerializationContext context, CommandLineTool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns CustomDatasetConstraint
	 *     CustomDatasetConstraint returns CustomDatasetConstraint
	 *
	 * Constraint:
	 *     (name=EString dataset=[Dataset|EString])
	 */
	protected void sequence_CustomDatasetConstraint(ISerializationContext context, CustomDatasetConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnalysisActivityDescriptionPackage.Literals.CUSTOM_CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnalysisActivityDescriptionPackage.Literals.CUSTOM_CONSTRAINT__NAME));
			if (transientValues.isValueTransient(semanticObject, AnalysisActivityDescriptionPackage.Literals.DATASET_READINESS_CONSTRAINT__DATASET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnalysisActivityDescriptionPackage.Literals.DATASET_READINESS_CONSTRAINT__DATASET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomDatasetConstraintAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomDatasetConstraintAccess().getDatasetDatasetEStringParserRuleCall_4_0_1(), semanticObject.eGet(AnalysisActivityDescriptionPackage.Literals.DATASET_READINESS_CONSTRAINT__DATASET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns CustomParameterConstraint
	 *     CustomParameterConstraint returns CustomParameterConstraint
	 *
	 * Constraint:
	 *     (name=EString parameter=[Parameter|EString])
	 */
	protected void sequence_CustomParameterConstraint(ISerializationContext context, CustomParameterConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnalysisActivityDescriptionPackage.Literals.CUSTOM_CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnalysisActivityDescriptionPackage.Literals.CUSTOM_CONSTRAINT__NAME));
			if (transientValues.isValueTransient(semanticObject, AnalysisActivityDescriptionPackage.Literals.PARAMETER_READINESS_CONSTRAINT__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnalysisActivityDescriptionPackage.Literals.PARAMETER_READINESS_CONSTRAINT__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomParameterConstraintAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCustomParameterConstraintAccess().getParameterParameterEStringParserRuleCall_4_0_1(), semanticObject.eGet(AnalysisActivityDescriptionPackage.Literals.PARAMETER_READINESS_CONSTRAINT__PARAMETER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CommandLineEntryList returns DatasetCommandLineEntryList
	 *     DatasetCommandLineEntryList returns DatasetCommandLineEntryList
	 *
	 * Constraint:
	 *     (dataset=[Dataset|EString] manipulators+=StringListManipulator*)
	 */
	protected void sequence_DatasetCommandLineEntryList(ISerializationContext context, DatasetCommandLineEntryList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExitCode returns ExitCode
	 *
	 * Constraint:
	 *     (code=EBigInteger status=TerminationStatus reportMessage=EString?)
	 */
	protected void sequence_ExitCode(ISerializationContext context, ExitCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dataset returns InputDataset
	 *     InputDataset returns InputDataset
	 *
	 * Constraint:
	 *     (name=EString mimetype=EString? minimumCardinality=EBigInteger maximumCardinality=EBigInteger remarks=EString?)
	 */
	protected void sequence_InputDataset(ISerializationContext context, InputDataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringListManipulator returns Join
	 *     Join returns Join
	 *
	 * Constraint:
	 *     delimiter=EString
	 */
	protected void sequence_Join(ISerializationContext context, Join semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StringListManipulatorsPackage.Literals.JOIN__DELIMITER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StringListManipulatorsPackage.Literals.JOIN__DELIMITER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJoinAccess().getDelimiterEStringParserRuleCall_1_0(), semanticObject.getDelimiter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CommandLineEntryList returns LiteralCommandLineEntryList
	 *     LiteralCommandLineEntryList returns LiteralCommandLineEntryList
	 *
	 * Constraint:
	 *     (literals+=EString literals+=EString* manipulators+=StringListManipulator*)
	 */
	protected void sequence_LiteralCommandLineEntryList(ISerializationContext context, LiteralCommandLineEntryList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns MaximunDatasetCardinalityConstraint
	 *     MaximunDatasetCardinalityConstraint returns MaximunDatasetCardinalityConstraint
	 *
	 * Constraint:
	 *     (value=EBigInteger? dataset=[Dataset|EString])
	 */
	protected void sequence_MaximunDatasetCardinalityConstraint(ISerializationContext context, MaximunDatasetCardinalityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns MaximunParameterCardinalityConstraint
	 *     MaximunParameterCardinalityConstraint returns MaximunParameterCardinalityConstraint
	 *
	 * Constraint:
	 *     (value=EBigInteger? parameter=[Parameter|EString])
	 */
	protected void sequence_MaximunParameterCardinalityConstraint(ISerializationContext context, MaximunParameterCardinalityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns MinimunDatasetCardinalityConstraint
	 *     MinimunDatasetCardinalityConstraint returns MinimunDatasetCardinalityConstraint
	 *
	 * Constraint:
	 *     (value=EBigInteger? dataset=[Dataset|EString])
	 */
	protected void sequence_MinimunDatasetCardinalityConstraint(ISerializationContext context, MinimunDatasetCardinalityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReadinessConstraint returns MinimunParameterCardinalityConstraint
	 *     MinimunParameterCardinalityConstraint returns MinimunParameterCardinalityConstraint
	 *
	 * Constraint:
	 *     (value=EBigInteger? parameter=[Parameter|EString])
	 */
	protected void sequence_MinimunParameterCardinalityConstraint(ISerializationContext context, MinimunParameterCardinalityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dataset returns OutputDataset
	 *     OutputDataset returns OutputDataset
	 *
	 * Constraint:
	 *     (name=EString mimetype=EString? minimumCardinality=EBigInteger maximumCardinality=EBigInteger remarks=EString?)
	 */
	protected void sequence_OutputDataset(ISerializationContext context, OutputDataset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommandLineEntryList returns ParameterCommandLineEntryList
	 *     ParameterCommandLineEntryList returns ParameterCommandLineEntryList
	 *
	 * Constraint:
	 *     (parameter=[Parameter|EString] manipulators+=StringListManipulator*)
	 */
	protected void sequence_ParameterCommandLineEntryList(ISerializationContext context, ParameterCommandLineEntryList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         parameterType=ParameterType 
	 *         minimumCardinality=EBigInteger 
	 *         maximumCardinality=EBigInteger 
	 *         (defaultValue+=EString defaultValue+=EString*)?
	 *     )
	 */
	protected void sequence_Parameter(ISerializationContext context, br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringListManipulator returns PrependEach
	 *     PrependEach returns PrependEach
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_PrependEach(ISerializationContext context, PrependEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StringListManipulatorsPackage.Literals.PREPEND_EACH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StringListManipulatorsPackage.Literals.PREPEND_EACH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrependEachAccess().getValueEStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StringListManipulator returns PrependListWith
	 *     PrependListWith returns PrependListWith
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_PrependListWith(ISerializationContext context, PrependListWith semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StringListManipulatorsPackage.Literals.PREPEND_LIST_WITH__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StringListManipulatorsPackage.Literals.PREPEND_LIST_WITH__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrependListWithAccess().getValueEStringParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CommandLineEntryList returns ToolNameCommandLineEntry
	 *     ToolNameCommandLineEntry returns ToolNameCommandLineEntry
	 *
	 * Constraint:
	 *     manipulators+=StringListManipulator*
	 */
	protected void sequence_ToolNameCommandLineEntry(ISerializationContext context, ToolNameCommandLineEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
