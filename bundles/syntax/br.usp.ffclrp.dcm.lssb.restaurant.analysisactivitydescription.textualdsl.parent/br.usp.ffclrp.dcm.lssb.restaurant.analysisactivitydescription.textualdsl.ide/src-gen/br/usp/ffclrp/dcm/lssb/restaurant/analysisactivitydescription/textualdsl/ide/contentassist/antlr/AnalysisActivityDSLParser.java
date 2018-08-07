/*
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.ide.contentassist.antlr;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.ide.contentassist.antlr.internal.InternalAnalysisActivityDSLParser;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.services.AnalysisActivityDSLGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AnalysisActivityDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AnalysisActivityDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AnalysisActivityDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getReadinessConstraintAccess().getAlternatives(), "rule__ReadinessConstraint__Alternatives");
			builder.put(grammarAccess.getDatasetAccess().getAlternatives(), "rule__Dataset__Alternatives");
			builder.put(grammarAccess.getCommandLineEntryListAccess().getAlternatives(), "rule__CommandLineEntryList__Alternatives");
			builder.put(grammarAccess.getStringListManipulatorAccess().getAlternatives(), "rule__StringListManipulator__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getTerminationStatusAccess().getAlternatives(), "rule__TerminationStatus__Alternatives");
			builder.put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_3(), "rule__Activity__Group_3__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_4(), "rule__Activity__Group_4__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_5(), "rule__Activity__Group_5__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_6(), "rule__Activity__Group_6__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_7(), "rule__Activity__Group_7__0");
			builder.put(grammarAccess.getActivityAccess().getGroup_7_3(), "rule__Activity__Group_7_3__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_9(), "rule__Parameter__Group_9__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_9_3(), "rule__Parameter__Group_9_3__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_10(), "rule__Parameter__Group_10__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_10_1(), "rule__Parameter__Group_10_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_10_1_3(), "rule__Parameter__Group_10_1_3__0");
			builder.put(grammarAccess.getInputDatasetAccess().getGroup(), "rule__InputDataset__Group__0");
			builder.put(grammarAccess.getInputDatasetAccess().getGroup_9(), "rule__InputDataset__Group_9__0");
			builder.put(grammarAccess.getInputDatasetAccess().getGroup_9_1_0(), "rule__InputDataset__Group_9_1_0__0");
			builder.put(grammarAccess.getInputDatasetAccess().getGroup_9_1_1(), "rule__InputDataset__Group_9_1_1__0");
			builder.put(grammarAccess.getInputDatasetAccess().getGroup_9_1_1_3(), "rule__InputDataset__Group_9_1_1_3__0");
			builder.put(grammarAccess.getOutputDatasetAccess().getGroup(), "rule__OutputDataset__Group__0");
			builder.put(grammarAccess.getOutputDatasetAccess().getGroup_9(), "rule__OutputDataset__Group_9__0");
			builder.put(grammarAccess.getOutputDatasetAccess().getGroup_9_1_0(), "rule__OutputDataset__Group_9_1_0__0");
			builder.put(grammarAccess.getOutputDatasetAccess().getGroup_9_1_1(), "rule__OutputDataset__Group_9_1_1__0");
			builder.put(grammarAccess.getOutputDatasetAccess().getGroup_9_1_1_3(), "rule__OutputDataset__Group_9_1_1_3__0");
			builder.put(grammarAccess.getEBigIntegerAccess().getGroup(), "rule__EBigInteger__Group__0");
			builder.put(grammarAccess.getCustomParameterConstraintAccess().getGroup(), "rule__CustomParameterConstraint__Group__0");
			builder.put(grammarAccess.getCustomDatasetConstraintAccess().getGroup(), "rule__CustomDatasetConstraint__Group__0");
			builder.put(grammarAccess.getCustomParameterReadinessConstraintAccess().getGroup(), "rule__CustomParameterReadinessConstraint__Group__0");
			builder.put(grammarAccess.getCustomDatasetReadinessConstraintAccess().getGroup(), "rule__CustomDatasetReadinessConstraint__Group__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup(), "rule__CommandLineTool__Group__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_3(), "rule__CommandLineTool__Group_3__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_4(), "rule__CommandLineTool__Group_4__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_4_2_0(), "rule__CommandLineTool__Group_4_2_0__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_4_2_1(), "rule__CommandLineTool__Group_4_2_1__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_4_2_2(), "rule__CommandLineTool__Group_4_2_2__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_8(), "rule__CommandLineTool__Group_8__0");
			builder.put(grammarAccess.getCommandLineToolAccess().getGroup_10(), "rule__CommandLineTool__Group_10__0");
			builder.put(grammarAccess.getExitCodeAccess().getGroup(), "rule__ExitCode__Group__0");
			builder.put(grammarAccess.getToolNameCommandLineEntryAccess().getGroup(), "rule__ToolNameCommandLineEntry__Group__0");
			builder.put(grammarAccess.getToolNameCommandLineEntryAccess().getGroup_2(), "rule__ToolNameCommandLineEntry__Group_2__0");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getGroup(), "rule__LiteralCommandLineEntryList__Group__0");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getGroup_4(), "rule__LiteralCommandLineEntryList__Group_4__0");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getGroup_6(), "rule__LiteralCommandLineEntryList__Group_6__0");
			builder.put(grammarAccess.getDatasetCommandLineEntryListAccess().getGroup(), "rule__DatasetCommandLineEntryList__Group__0");
			builder.put(grammarAccess.getDatasetCommandLineEntryListAccess().getGroup_2(), "rule__DatasetCommandLineEntryList__Group_2__0");
			builder.put(grammarAccess.getParameterCommandLineEntryListAccess().getGroup(), "rule__ParameterCommandLineEntryList__Group__0");
			builder.put(grammarAccess.getParameterCommandLineEntryListAccess().getGroup_2(), "rule__ParameterCommandLineEntryList__Group_2__0");
			builder.put(grammarAccess.getJoinAccess().getGroup(), "rule__Join__Group__0");
			builder.put(grammarAccess.getPrependEachAccess().getGroup(), "rule__PrependEach__Group__0");
			builder.put(grammarAccess.getAppendEachAccess().getGroup(), "rule__AppendEach__Group__0");
			builder.put(grammarAccess.getAppendListWithAccess().getGroup(), "rule__AppendListWith__Group__0");
			builder.put(grammarAccess.getPrependListWithAccess().getGroup(), "rule__PrependListWith__Group__0");
			builder.put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
			builder.put(grammarAccess.getActivityAccess().getDescriptionAssignment_3_1(), "rule__Activity__DescriptionAssignment_3_1");
			builder.put(grammarAccess.getActivityAccess().getInputDatasetsAssignment_4_2(), "rule__Activity__InputDatasetsAssignment_4_2");
			builder.put(grammarAccess.getActivityAccess().getInputDatasetsAssignment_4_3(), "rule__Activity__InputDatasetsAssignment_4_3");
			builder.put(grammarAccess.getActivityAccess().getParametersAssignment_5_2(), "rule__Activity__ParametersAssignment_5_2");
			builder.put(grammarAccess.getActivityAccess().getParametersAssignment_5_3(), "rule__Activity__ParametersAssignment_5_3");
			builder.put(grammarAccess.getActivityAccess().getOutputDatasetsAssignment_6_2(), "rule__Activity__OutputDatasetsAssignment_6_2");
			builder.put(grammarAccess.getActivityAccess().getOutputDatasetsAssignment_6_3(), "rule__Activity__OutputDatasetsAssignment_6_3");
			builder.put(grammarAccess.getActivityAccess().getReadinessContraintsAssignment_7_2(), "rule__Activity__ReadinessContraintsAssignment_7_2");
			builder.put(grammarAccess.getActivityAccess().getReadinessContraintsAssignment_7_3_1(), "rule__Activity__ReadinessContraintsAssignment_7_3_1");
			builder.put(grammarAccess.getActivityAccess().getToolAssignment_9(), "rule__Activity__ToolAssignment_9");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getParameterTypeAssignment_3(), "rule__Parameter__ParameterTypeAssignment_3");
			builder.put(grammarAccess.getParameterAccess().getMinimumCardinalityAssignment_5(), "rule__Parameter__MinimumCardinalityAssignment_5");
			builder.put(grammarAccess.getParameterAccess().getMaximumCardinalityAssignment_7(), "rule__Parameter__MaximumCardinalityAssignment_7");
			builder.put(grammarAccess.getParameterAccess().getDefaultValueAssignment_9_2(), "rule__Parameter__DefaultValueAssignment_9_2");
			builder.put(grammarAccess.getParameterAccess().getDefaultValueAssignment_9_3_1(), "rule__Parameter__DefaultValueAssignment_9_3_1");
			builder.put(grammarAccess.getParameterAccess().getConstraintsAssignment_10_1_2(), "rule__Parameter__ConstraintsAssignment_10_1_2");
			builder.put(grammarAccess.getParameterAccess().getConstraintsAssignment_10_1_3_1(), "rule__Parameter__ConstraintsAssignment_10_1_3_1");
			builder.put(grammarAccess.getInputDatasetAccess().getNameAssignment_1(), "rule__InputDataset__NameAssignment_1");
			builder.put(grammarAccess.getInputDatasetAccess().getMimetypeAssignment_3(), "rule__InputDataset__MimetypeAssignment_3");
			builder.put(grammarAccess.getInputDatasetAccess().getMinimumCardinalityAssignment_5(), "rule__InputDataset__MinimumCardinalityAssignment_5");
			builder.put(grammarAccess.getInputDatasetAccess().getMaximumCardinalityAssignment_7(), "rule__InputDataset__MaximumCardinalityAssignment_7");
			builder.put(grammarAccess.getInputDatasetAccess().getRemarksAssignment_9_1_0_1(), "rule__InputDataset__RemarksAssignment_9_1_0_1");
			builder.put(grammarAccess.getInputDatasetAccess().getConstraintsAssignment_9_1_1_2(), "rule__InputDataset__ConstraintsAssignment_9_1_1_2");
			builder.put(grammarAccess.getInputDatasetAccess().getConstraintsAssignment_9_1_1_3_1(), "rule__InputDataset__ConstraintsAssignment_9_1_1_3_1");
			builder.put(grammarAccess.getOutputDatasetAccess().getNameAssignment_1(), "rule__OutputDataset__NameAssignment_1");
			builder.put(grammarAccess.getOutputDatasetAccess().getMimetypeAssignment_3(), "rule__OutputDataset__MimetypeAssignment_3");
			builder.put(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityAssignment_5(), "rule__OutputDataset__MinimumCardinalityAssignment_5");
			builder.put(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityAssignment_7(), "rule__OutputDataset__MaximumCardinalityAssignment_7");
			builder.put(grammarAccess.getOutputDatasetAccess().getRemarksAssignment_9_1_0_1(), "rule__OutputDataset__RemarksAssignment_9_1_0_1");
			builder.put(grammarAccess.getOutputDatasetAccess().getConstraintsAssignment_9_1_1_2(), "rule__OutputDataset__ConstraintsAssignment_9_1_1_2");
			builder.put(grammarAccess.getOutputDatasetAccess().getConstraintsAssignment_9_1_1_3_1(), "rule__OutputDataset__ConstraintsAssignment_9_1_1_3_1");
			builder.put(grammarAccess.getCustomParameterConstraintAccess().getNameAssignment_1(), "rule__CustomParameterConstraint__NameAssignment_1");
			builder.put(grammarAccess.getCustomDatasetConstraintAccess().getNameAssignment_1(), "rule__CustomDatasetConstraint__NameAssignment_1");
			builder.put(grammarAccess.getCustomParameterReadinessConstraintAccess().getNameAssignment_1(), "rule__CustomParameterReadinessConstraint__NameAssignment_1");
			builder.put(grammarAccess.getCustomParameterReadinessConstraintAccess().getParameterAssignment_4(), "rule__CustomParameterReadinessConstraint__ParameterAssignment_4");
			builder.put(grammarAccess.getCustomDatasetReadinessConstraintAccess().getNameAssignment_1(), "rule__CustomDatasetReadinessConstraint__NameAssignment_1");
			builder.put(grammarAccess.getCustomDatasetReadinessConstraintAccess().getDatasetAssignment_4(), "rule__CustomDatasetReadinessConstraint__DatasetAssignment_4");
			builder.put(grammarAccess.getCommandLineToolAccess().getNameAssignment_1(), "rule__CommandLineTool__NameAssignment_1");
			builder.put(grammarAccess.getCommandLineToolAccess().getExecutablePathAssignment_3_1(), "rule__CommandLineTool__ExecutablePathAssignment_3_1");
			builder.put(grammarAccess.getCommandLineToolAccess().getStandardInputStreamAssignment_4_2_0_2(), "rule__CommandLineTool__StandardInputStreamAssignment_4_2_0_2");
			builder.put(grammarAccess.getCommandLineToolAccess().getStandardOutputStreamAssignment_4_2_1_2(), "rule__CommandLineTool__StandardOutputStreamAssignment_4_2_1_2");
			builder.put(grammarAccess.getCommandLineToolAccess().getStandardErrorStreamAssignment_4_2_2_2(), "rule__CommandLineTool__StandardErrorStreamAssignment_4_2_2_2");
			builder.put(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateAssignment_7(), "rule__CommandLineTool__CommandLineTemplateAssignment_7");
			builder.put(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateAssignment_8_1(), "rule__CommandLineTool__CommandLineTemplateAssignment_8_1");
			builder.put(grammarAccess.getCommandLineToolAccess().getExitCodesAssignment_10_2(), "rule__CommandLineTool__ExitCodesAssignment_10_2");
			builder.put(grammarAccess.getCommandLineToolAccess().getExitCodesAssignment_10_3(), "rule__CommandLineTool__ExitCodesAssignment_10_3");
			builder.put(grammarAccess.getExitCodeAccess().getCodeAssignment_0(), "rule__ExitCode__CodeAssignment_0");
			builder.put(grammarAccess.getExitCodeAccess().getStatusAssignment_2(), "rule__ExitCode__StatusAssignment_2");
			builder.put(grammarAccess.getExitCodeAccess().getReportMessageAssignment_3(), "rule__ExitCode__ReportMessageAssignment_3");
			builder.put(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsAssignment_2_1(), "rule__ToolNameCommandLineEntry__ManipulatorsAssignment_2_1");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsAssignment_3(), "rule__LiteralCommandLineEntryList__LiteralsAssignment_3");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsAssignment_4_1(), "rule__LiteralCommandLineEntryList__LiteralsAssignment_4_1");
			builder.put(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsAssignment_6_1(), "rule__LiteralCommandLineEntryList__ManipulatorsAssignment_6_1");
			builder.put(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetAssignment_1(), "rule__DatasetCommandLineEntryList__DatasetAssignment_1");
			builder.put(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsAssignment_2_1(), "rule__DatasetCommandLineEntryList__ManipulatorsAssignment_2_1");
			builder.put(grammarAccess.getParameterCommandLineEntryListAccess().getParameterAssignment_1(), "rule__ParameterCommandLineEntryList__ParameterAssignment_1");
			builder.put(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsAssignment_2_1(), "rule__ParameterCommandLineEntryList__ManipulatorsAssignment_2_1");
			builder.put(grammarAccess.getJoinAccess().getDelimiterAssignment_1(), "rule__Join__DelimiterAssignment_1");
			builder.put(grammarAccess.getPrependEachAccess().getValueAssignment_1(), "rule__PrependEach__ValueAssignment_1");
			builder.put(grammarAccess.getAppendEachAccess().getValueAssignment_1(), "rule__AppendEach__ValueAssignment_1");
			builder.put(grammarAccess.getAppendListWithAccess().getValueAssignment_1(), "rule__AppendListWith__ValueAssignment_1");
			builder.put(grammarAccess.getPrependListWithAccess().getValueAssignment_1(), "rule__PrependListWith__ValueAssignment_1");
			builder.put(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), "rule__InputDataset__UnorderedGroup_9_1");
			builder.put(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), "rule__OutputDataset__UnorderedGroup_9_1");
			builder.put(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), "rule__CommandLineTool__UnorderedGroup_4_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AnalysisActivityDSLGrammarAccess grammarAccess;

	@Override
	protected InternalAnalysisActivityDSLParser createParser() {
		InternalAnalysisActivityDSLParser result = new InternalAnalysisActivityDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AnalysisActivityDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnalysisActivityDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
