package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.services.AnalysisActivityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisActivityDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LIST_START", "RULE_LIST_END", "RULE_MULTILINE_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Activity'", "'{'", "'description'", "'parameters'", "','", "'inputDatasets'", "'outputDatasets'", "'readinessContraints'", "'tool'", "'}'", "'Parameter'", "'minimumCardinality'", "'maximumCardinality'", "'parameterType'", "'defaultValues'", "'Dataset'", "'mimetype'", "'remarks'", "'-'", "'MinimunDatasetCardinalityConstraint'", "'value'", "'dataset'", "'MaximunDatasetCardinalityConstraint'", "'MinimunParameterCardinalityConstraint'", "'parameter'", "'MaximunParameterCardinalityConstraint'", "'CustomParameterConstraint'", "'CustomDatasetConstraint'", "'CommandLineTool'", "'executablePath'", "'standardInputStream'", "'standardOutputStream'", "'standardErrorStream'", "'commandLineTemplate'", "'exitCodes'", "'ExitCode'", "'code'", "'reportMessage'", "'status'", "'ToolNameCommandLineEntry'", "'manipulators'", "'LiteralCommandLineEntryList'", "'literals'", "'DatasetCommandLineEntryList'", "'ParameterCommandLineEntryList'", "'Join'", "'PrependEach'", "'AppendEach'", "'AppendListWith'", "'PrependListWith'", "'STRING'", "'INTEGER'", "'REAL'", "'SUCCEEDED'", "'FAILED'"
    };
    public static final int T__50=50;
    public static final int RULE_LIST_END=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_LIST_START=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_MULTILINE_STRING=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAnalysisActivityDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnalysisActivityDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnalysisActivityDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnalysisActivityDSL.g"; }



     	private AnalysisActivityDSLGrammarAccess grammarAccess;

        public InternalAnalysisActivityDSLParser(TokenStream input, AnalysisActivityDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Activity";
       	}

       	@Override
       	protected AnalysisActivityDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivity"
    // InternalAnalysisActivityDSL.g:65:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalAnalysisActivityDSL.g:65:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalAnalysisActivityDSL.g:66:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalAnalysisActivityDSL.g:72:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'tool' ( (lv_tool_30_0= ruleTool ) ) otherlv_31= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_LIST_START_6=null;
        Token otherlv_8=null;
        Token this_LIST_END_10=null;
        Token otherlv_11=null;
        Token this_LIST_START_12=null;
        Token otherlv_14=null;
        Token this_LIST_END_16=null;
        Token otherlv_17=null;
        Token this_LIST_START_18=null;
        Token otherlv_20=null;
        Token this_LIST_END_22=null;
        Token otherlv_23=null;
        Token this_LIST_START_24=null;
        Token otherlv_26=null;
        Token this_LIST_END_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_inputDatasets_13_0 = null;

        EObject lv_inputDatasets_15_0 = null;

        EObject lv_outputDatasets_19_0 = null;

        EObject lv_outputDatasets_21_0 = null;

        EObject lv_readinessContraints_25_0 = null;

        EObject lv_readinessContraints_27_0 = null;

        EObject lv_tool_30_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:78:2: ( (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'tool' ( (lv_tool_30_0= ruleTool ) ) otherlv_31= '}' ) )
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'tool' ( (lv_tool_30_0= ruleTool ) ) otherlv_31= '}' )
            {
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'tool' ( (lv_tool_30_0= ruleTool ) ) otherlv_31= '}' )
            // InternalAnalysisActivityDSL.g:80:3: otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'tool' ( (lv_tool_30_0= ruleTool ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:107:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:108:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:112:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:113:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:113:5: (lv_description_4_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:114:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:132:3: (otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:133:4: otherlv_5= 'parameters' this_LIST_START_6= RULE_LIST_START ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* this_LIST_END_10= RULE_LIST_END
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getParametersKeyword_4_0());
                    			
                    this_LIST_START_6=(Token)match(input,RULE_LIST_START,FOLLOW_8); 

                    				newLeafNode(this_LIST_START_6, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:141:4: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalAnalysisActivityDSL.g:142:5: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalAnalysisActivityDSL.g:142:5: (lv_parameters_7_0= ruleParameter )
                    // InternalAnalysisActivityDSL.g:143:6: lv_parameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_7_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:160:4: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:161:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:165:5: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalAnalysisActivityDSL.g:166:6: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:166:6: (lv_parameters_9_0= ruleParameter )
                    	    // InternalAnalysisActivityDSL.g:167:7: lv_parameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_9_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    this_LIST_END_10=(Token)match(input,RULE_LIST_END,FOLLOW_10); 

                    				newLeafNode(this_LIST_END_10, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:190:3: (otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:191:4: otherlv_11= 'inputDatasets' this_LIST_START_12= RULE_LIST_START ( (lv_inputDatasets_13_0= ruleInputDataset ) ) (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )* this_LIST_END_16= RULE_LIST_END
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getInputDatasetsKeyword_5_0());
                    			
                    this_LIST_START_12=(Token)match(input,RULE_LIST_START,FOLLOW_11); 

                    				newLeafNode(this_LIST_START_12, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_5_1());
                    			
                    // InternalAnalysisActivityDSL.g:199:4: ( (lv_inputDatasets_13_0= ruleInputDataset ) )
                    // InternalAnalysisActivityDSL.g:200:5: (lv_inputDatasets_13_0= ruleInputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:200:5: (lv_inputDatasets_13_0= ruleInputDataset )
                    // InternalAnalysisActivityDSL.g:201:6: lv_inputDatasets_13_0= ruleInputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_inputDatasets_13_0=ruleInputDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"inputDatasets",
                    							lv_inputDatasets_13_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.InputDataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:218:4: (otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:219:5: otherlv_14= ',' ( (lv_inputDatasets_15_0= ruleInputDataset ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_11); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:223:5: ( (lv_inputDatasets_15_0= ruleInputDataset ) )
                    	    // InternalAnalysisActivityDSL.g:224:6: (lv_inputDatasets_15_0= ruleInputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:224:6: (lv_inputDatasets_15_0= ruleInputDataset )
                    	    // InternalAnalysisActivityDSL.g:225:7: lv_inputDatasets_15_0= ruleInputDataset
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_inputDatasets_15_0=ruleInputDataset();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputDatasets",
                    	    								lv_inputDatasets_15_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.InputDataset");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_LIST_END_16=(Token)match(input,RULE_LIST_END,FOLLOW_12); 

                    				newLeafNode(this_LIST_END_16, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:248:3: (otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:249:4: otherlv_17= 'outputDatasets' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getOutputDatasetsKeyword_6_0());
                    			
                    this_LIST_START_18=(Token)match(input,RULE_LIST_START,FOLLOW_11); 

                    				newLeafNode(this_LIST_START_18, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_6_1());
                    			
                    // InternalAnalysisActivityDSL.g:257:4: ( (lv_outputDatasets_19_0= ruleOutputDataset ) )
                    // InternalAnalysisActivityDSL.g:258:5: (lv_outputDatasets_19_0= ruleOutputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:258:5: (lv_outputDatasets_19_0= ruleOutputDataset )
                    // InternalAnalysisActivityDSL.g:259:6: lv_outputDatasets_19_0= ruleOutputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_outputDatasets_19_0=ruleOutputDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"outputDatasets",
                    							lv_outputDatasets_19_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.OutputDataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:276:4: (otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:277:5: otherlv_20= ',' ( (lv_outputDatasets_21_0= ruleOutputDataset ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FOLLOW_11); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:281:5: ( (lv_outputDatasets_21_0= ruleOutputDataset ) )
                    	    // InternalAnalysisActivityDSL.g:282:6: (lv_outputDatasets_21_0= ruleOutputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:282:6: (lv_outputDatasets_21_0= ruleOutputDataset )
                    	    // InternalAnalysisActivityDSL.g:283:7: lv_outputDatasets_21_0= ruleOutputDataset
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_outputDatasets_21_0=ruleOutputDataset();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputDatasets",
                    	    								lv_outputDatasets_21_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.OutputDataset");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_LIST_END_22=(Token)match(input,RULE_LIST_END,FOLLOW_13); 

                    				newLeafNode(this_LIST_END_22, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_6_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:306:3: (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:307:4: otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getReadinessContraintsKeyword_7_0());
                    			
                    this_LIST_START_24=(Token)match(input,RULE_LIST_START,FOLLOW_14); 

                    				newLeafNode(this_LIST_START_24, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_7_1());
                    			
                    // InternalAnalysisActivityDSL.g:315:4: ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) )
                    // InternalAnalysisActivityDSL.g:316:5: (lv_readinessContraints_25_0= ruleReadinessConstraint )
                    {
                    // InternalAnalysisActivityDSL.g:316:5: (lv_readinessContraints_25_0= ruleReadinessConstraint )
                    // InternalAnalysisActivityDSL.g:317:6: lv_readinessContraints_25_0= ruleReadinessConstraint
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_readinessContraints_25_0=ruleReadinessConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"readinessContraints",
                    							lv_readinessContraints_25_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ReadinessConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:334:4: (otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:335:5: otherlv_26= ',' ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:339:5: ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) )
                    	    // InternalAnalysisActivityDSL.g:340:6: (lv_readinessContraints_27_0= ruleReadinessConstraint )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:340:6: (lv_readinessContraints_27_0= ruleReadinessConstraint )
                    	    // InternalAnalysisActivityDSL.g:341:7: lv_readinessContraints_27_0= ruleReadinessConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_readinessContraints_27_0=ruleReadinessConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"readinessContraints",
                    	    								lv_readinessContraints_27_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ReadinessConstraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_LIST_END_28=(Token)match(input,RULE_LIST_END,FOLLOW_15); 

                    				newLeafNode(this_LIST_END_28, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_29, grammarAccess.getActivityAccess().getToolKeyword_8());
            		
            // InternalAnalysisActivityDSL.g:368:3: ( (lv_tool_30_0= ruleTool ) )
            // InternalAnalysisActivityDSL.g:369:4: (lv_tool_30_0= ruleTool )
            {
            // InternalAnalysisActivityDSL.g:369:4: (lv_tool_30_0= ruleTool )
            // InternalAnalysisActivityDSL.g:370:5: lv_tool_30_0= ruleTool
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getToolToolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_tool_30_0=ruleTool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"tool",
            						lv_tool_30_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Tool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleReadinessConstraint"
    // InternalAnalysisActivityDSL.g:395:1: entryRuleReadinessConstraint returns [EObject current=null] : iv_ruleReadinessConstraint= ruleReadinessConstraint EOF ;
    public final EObject entryRuleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:395:60: (iv_ruleReadinessConstraint= ruleReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:396:2: iv_ruleReadinessConstraint= ruleReadinessConstraint EOF
            {
             newCompositeNode(grammarAccess.getReadinessConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadinessConstraint=ruleReadinessConstraint();

            state._fsp--;

             current =iv_ruleReadinessConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadinessConstraint"


    // $ANTLR start "ruleReadinessConstraint"
    // InternalAnalysisActivityDSL.g:402:1: ruleReadinessConstraint returns [EObject current=null] : (this_MinimunDatasetCardinalityConstraint_0= ruleMinimunDatasetCardinalityConstraint | this_MaximunDatasetCardinalityConstraint_1= ruleMaximunDatasetCardinalityConstraint | this_MinimunParameterCardinalityConstraint_2= ruleMinimunParameterCardinalityConstraint | this_MaximunParameterCardinalityConstraint_3= ruleMaximunParameterCardinalityConstraint | this_CustomParameterConstraint_4= ruleCustomParameterConstraint | this_CustomDatasetConstraint_5= ruleCustomDatasetConstraint ) ;
    public final EObject ruleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_MinimunDatasetCardinalityConstraint_0 = null;

        EObject this_MaximunDatasetCardinalityConstraint_1 = null;

        EObject this_MinimunParameterCardinalityConstraint_2 = null;

        EObject this_MaximunParameterCardinalityConstraint_3 = null;

        EObject this_CustomParameterConstraint_4 = null;

        EObject this_CustomDatasetConstraint_5 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:408:2: ( (this_MinimunDatasetCardinalityConstraint_0= ruleMinimunDatasetCardinalityConstraint | this_MaximunDatasetCardinalityConstraint_1= ruleMaximunDatasetCardinalityConstraint | this_MinimunParameterCardinalityConstraint_2= ruleMinimunParameterCardinalityConstraint | this_MaximunParameterCardinalityConstraint_3= ruleMaximunParameterCardinalityConstraint | this_CustomParameterConstraint_4= ruleCustomParameterConstraint | this_CustomDatasetConstraint_5= ruleCustomDatasetConstraint ) )
            // InternalAnalysisActivityDSL.g:409:2: (this_MinimunDatasetCardinalityConstraint_0= ruleMinimunDatasetCardinalityConstraint | this_MaximunDatasetCardinalityConstraint_1= ruleMaximunDatasetCardinalityConstraint | this_MinimunParameterCardinalityConstraint_2= ruleMinimunParameterCardinalityConstraint | this_MaximunParameterCardinalityConstraint_3= ruleMaximunParameterCardinalityConstraint | this_CustomParameterConstraint_4= ruleCustomParameterConstraint | this_CustomDatasetConstraint_5= ruleCustomDatasetConstraint )
            {
            // InternalAnalysisActivityDSL.g:409:2: (this_MinimunDatasetCardinalityConstraint_0= ruleMinimunDatasetCardinalityConstraint | this_MaximunDatasetCardinalityConstraint_1= ruleMaximunDatasetCardinalityConstraint | this_MinimunParameterCardinalityConstraint_2= ruleMinimunParameterCardinalityConstraint | this_MaximunParameterCardinalityConstraint_3= ruleMaximunParameterCardinalityConstraint | this_CustomParameterConstraint_4= ruleCustomParameterConstraint | this_CustomDatasetConstraint_5= ruleCustomDatasetConstraint )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            case 40:
                {
                alt10=5;
                }
                break;
            case 41:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:410:3: this_MinimunDatasetCardinalityConstraint_0= ruleMinimunDatasetCardinalityConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getMinimunDatasetCardinalityConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinimunDatasetCardinalityConstraint_0=ruleMinimunDatasetCardinalityConstraint();

                    state._fsp--;


                    			current = this_MinimunDatasetCardinalityConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:419:3: this_MaximunDatasetCardinalityConstraint_1= ruleMaximunDatasetCardinalityConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getMaximunDatasetCardinalityConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaximunDatasetCardinalityConstraint_1=ruleMaximunDatasetCardinalityConstraint();

                    state._fsp--;


                    			current = this_MaximunDatasetCardinalityConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:428:3: this_MinimunParameterCardinalityConstraint_2= ruleMinimunParameterCardinalityConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getMinimunParameterCardinalityConstraintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinimunParameterCardinalityConstraint_2=ruleMinimunParameterCardinalityConstraint();

                    state._fsp--;


                    			current = this_MinimunParameterCardinalityConstraint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnalysisActivityDSL.g:437:3: this_MaximunParameterCardinalityConstraint_3= ruleMaximunParameterCardinalityConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getMaximunParameterCardinalityConstraintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaximunParameterCardinalityConstraint_3=ruleMaximunParameterCardinalityConstraint();

                    state._fsp--;


                    			current = this_MaximunParameterCardinalityConstraint_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnalysisActivityDSL.g:446:3: this_CustomParameterConstraint_4= ruleCustomParameterConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getCustomParameterConstraintParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomParameterConstraint_4=ruleCustomParameterConstraint();

                    state._fsp--;


                    			current = this_CustomParameterConstraint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAnalysisActivityDSL.g:455:3: this_CustomDatasetConstraint_5= ruleCustomDatasetConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getCustomDatasetConstraintParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomDatasetConstraint_5=ruleCustomDatasetConstraint();

                    state._fsp--;


                    			current = this_CustomDatasetConstraint_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadinessConstraint"


    // $ANTLR start "entryRuleTool"
    // InternalAnalysisActivityDSL.g:467:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalAnalysisActivityDSL.g:467:45: (iv_ruleTool= ruleTool EOF )
            // InternalAnalysisActivityDSL.g:468:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalAnalysisActivityDSL.g:474:1: ruleTool returns [EObject current=null] : this_CommandLineTool_0= ruleCommandLineTool ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_CommandLineTool_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:480:2: (this_CommandLineTool_0= ruleCommandLineTool )
            // InternalAnalysisActivityDSL.g:481:2: this_CommandLineTool_0= ruleCommandLineTool
            {

            		newCompositeNode(grammarAccess.getToolAccess().getCommandLineToolParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CommandLineTool_0=ruleCommandLineTool();

            state._fsp--;


            		current = this_CommandLineTool_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:492:1: entryRuleCommandLineEntryList returns [EObject current=null] : iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF ;
    public final EObject entryRuleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:492:61: (iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:493:2: iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF
            {
             newCompositeNode(grammarAccess.getCommandLineEntryListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandLineEntryList=ruleCommandLineEntryList();

            state._fsp--;

             current =iv_ruleCommandLineEntryList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandLineEntryList"


    // $ANTLR start "ruleCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:499:1: ruleCommandLineEntryList returns [EObject current=null] : (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) ;
    public final EObject ruleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject this_ToolNameCommandLineEntry_0 = null;

        EObject this_LiteralCommandLineEntryList_1 = null;

        EObject this_DatasetCommandLineEntryList_2 = null;

        EObject this_ParameterCommandLineEntryList_3 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:505:2: ( (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:506:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:506:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 57:
                {
                alt11=3;
                }
                break;
            case 58:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:507:3: this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry
                    {

                    			newCompositeNode(grammarAccess.getCommandLineEntryListAccess().getToolNameCommandLineEntryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToolNameCommandLineEntry_0=ruleToolNameCommandLineEntry();

                    state._fsp--;


                    			current = this_ToolNameCommandLineEntry_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:516:3: this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList
                    {

                    			newCompositeNode(grammarAccess.getCommandLineEntryListAccess().getLiteralCommandLineEntryListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralCommandLineEntryList_1=ruleLiteralCommandLineEntryList();

                    state._fsp--;


                    			current = this_LiteralCommandLineEntryList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:525:3: this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList
                    {

                    			newCompositeNode(grammarAccess.getCommandLineEntryListAccess().getDatasetCommandLineEntryListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasetCommandLineEntryList_2=ruleDatasetCommandLineEntryList();

                    state._fsp--;


                    			current = this_DatasetCommandLineEntryList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnalysisActivityDSL.g:534:3: this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList
                    {

                    			newCompositeNode(grammarAccess.getCommandLineEntryListAccess().getParameterCommandLineEntryListParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterCommandLineEntryList_3=ruleParameterCommandLineEntryList();

                    state._fsp--;


                    			current = this_ParameterCommandLineEntryList_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandLineEntryList"


    // $ANTLR start "entryRuleStringListManipulator"
    // InternalAnalysisActivityDSL.g:546:1: entryRuleStringListManipulator returns [EObject current=null] : iv_ruleStringListManipulator= ruleStringListManipulator EOF ;
    public final EObject entryRuleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringListManipulator = null;


        try {
            // InternalAnalysisActivityDSL.g:546:62: (iv_ruleStringListManipulator= ruleStringListManipulator EOF )
            // InternalAnalysisActivityDSL.g:547:2: iv_ruleStringListManipulator= ruleStringListManipulator EOF
            {
             newCompositeNode(grammarAccess.getStringListManipulatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringListManipulator=ruleStringListManipulator();

            state._fsp--;

             current =iv_ruleStringListManipulator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringListManipulator"


    // $ANTLR start "ruleStringListManipulator"
    // InternalAnalysisActivityDSL.g:553:1: ruleStringListManipulator returns [EObject current=null] : (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) ;
    public final EObject ruleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_PrependEach_1 = null;

        EObject this_AppendEach_2 = null;

        EObject this_AppendListWith_3 = null;

        EObject this_PrependListWith_4 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:559:2: ( (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) )
            // InternalAnalysisActivityDSL.g:560:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            {
            // InternalAnalysisActivityDSL.g:560:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt12=1;
                }
                break;
            case 60:
                {
                alt12=2;
                }
                break;
            case 61:
                {
                alt12=3;
                }
                break;
            case 62:
                {
                alt12=4;
                }
                break;
            case 63:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:561:3: this_Join_0= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getStringListManipulatorAccess().getJoinParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_0=ruleJoin();

                    state._fsp--;


                    			current = this_Join_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:570:3: this_PrependEach_1= rulePrependEach
                    {

                    			newCompositeNode(grammarAccess.getStringListManipulatorAccess().getPrependEachParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrependEach_1=rulePrependEach();

                    state._fsp--;


                    			current = this_PrependEach_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:579:3: this_AppendEach_2= ruleAppendEach
                    {

                    			newCompositeNode(grammarAccess.getStringListManipulatorAccess().getAppendEachParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppendEach_2=ruleAppendEach();

                    state._fsp--;


                    			current = this_AppendEach_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnalysisActivityDSL.g:588:3: this_AppendListWith_3= ruleAppendListWith
                    {

                    			newCompositeNode(grammarAccess.getStringListManipulatorAccess().getAppendListWithParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppendListWith_3=ruleAppendListWith();

                    state._fsp--;


                    			current = this_AppendListWith_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnalysisActivityDSL.g:597:3: this_PrependListWith_4= rulePrependListWith
                    {

                    			newCompositeNode(grammarAccess.getStringListManipulatorAccess().getPrependListWithParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrependListWith_4=rulePrependListWith();

                    state._fsp--;


                    			current = this_PrependListWith_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringListManipulator"


    // $ANTLR start "entryRuleEString"
    // InternalAnalysisActivityDSL.g:609:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAnalysisActivityDSL.g:609:47: (iv_ruleEString= ruleEString EOF )
            // InternalAnalysisActivityDSL.g:610:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAnalysisActivityDSL.g:616:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTILINE_STRING_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:622:2: ( (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // InternalAnalysisActivityDSL.g:623:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // InternalAnalysisActivityDSL.g:623:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_MULTILINE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:624:3: this_MULTILINE_STRING_0= RULE_MULTILINE_STRING
                    {
                    this_MULTILINE_STRING_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_2); 

                    			current.merge(this_MULTILINE_STRING_0);
                    		

                    			newLeafNode(this_MULTILINE_STRING_0, grammarAccess.getEStringAccess().getMULTILINE_STRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:632:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:640:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_2);
                    		

                    			newLeafNode(this_ID_2, grammarAccess.getEStringAccess().getIDTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameter"
    // InternalAnalysisActivityDSL.g:651:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAnalysisActivityDSL.g:651:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAnalysisActivityDSL.g:652:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAnalysisActivityDSL.g:658:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) otherlv_7= 'parameterType' ( (lv_parameterType_8_0= ruleParameterType ) ) (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )? otherlv_15= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_LIST_START_10=null;
        Token otherlv_12=null;
        Token this_LIST_START_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_4_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_6_0 = null;

        Enumerator lv_parameterType_8_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_13_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:664:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) otherlv_7= 'parameterType' ( (lv_parameterType_8_0= ruleParameterType ) ) (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )? otherlv_15= '}' ) )
            // InternalAnalysisActivityDSL.g:665:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) otherlv_7= 'parameterType' ( (lv_parameterType_8_0= ruleParameterType ) ) (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )? otherlv_15= '}' )
            {
            // InternalAnalysisActivityDSL.g:665:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) otherlv_7= 'parameterType' ( (lv_parameterType_8_0= ruleParameterType ) ) (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )? otherlv_15= '}' )
            // InternalAnalysisActivityDSL.g:666:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) otherlv_7= 'parameterType' ( (lv_parameterType_8_0= ruleParameterType ) ) (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:670:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:671:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:671:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:672:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getMinimumCardinalityKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:697:3: ( (lv_minimumCardinality_4_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:698:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:698:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:699:5: lv_minimumCardinality_4_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMinimumCardinalityEBigIntegerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_minimumCardinality_4_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_4_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getMaximumCardinalityKeyword_5());
            		
            // InternalAnalysisActivityDSL.g:720:3: ( (lv_maximumCardinality_6_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:721:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:721:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:722:5: lv_maximumCardinality_6_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMaximumCardinalityEBigIntegerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_maximumCardinality_6_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_6_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getParameterTypeKeyword_7());
            		
            // InternalAnalysisActivityDSL.g:743:3: ( (lv_parameterType_8_0= ruleParameterType ) )
            // InternalAnalysisActivityDSL.g:744:4: (lv_parameterType_8_0= ruleParameterType )
            {
            // InternalAnalysisActivityDSL.g:744:4: (lv_parameterType_8_0= ruleParameterType )
            // InternalAnalysisActivityDSL.g:745:5: lv_parameterType_8_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeParameterTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
            lv_parameterType_8_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameterType",
            						lv_parameterType_8_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:762:3: (otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:763:4: otherlv_9= 'defaultValues' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_START_14= RULE_LIST_START
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getDefaultValuesKeyword_9_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:771:4: ( (lv_defaultValue_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:772:5: (lv_defaultValue_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:772:5: (lv_defaultValue_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:773:6: lv_defaultValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_defaultValue_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						add(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_11_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:790:4: (otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:791:5: otherlv_12= ',' ( (lv_defaultValue_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:795:5: ( (lv_defaultValue_13_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:796:6: (lv_defaultValue_13_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:796:6: (lv_defaultValue_13_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:797:7: lv_defaultValue_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_defaultValue_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defaultValue",
                    	    								lv_defaultValue_13_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_17); 

                    				newLeafNode(this_LIST_START_14, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInputDataset"
    // InternalAnalysisActivityDSL.g:828:1: entryRuleInputDataset returns [EObject current=null] : iv_ruleInputDataset= ruleInputDataset EOF ;
    public final EObject entryRuleInputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:828:53: (iv_ruleInputDataset= ruleInputDataset EOF )
            // InternalAnalysisActivityDSL.g:829:2: iv_ruleInputDataset= ruleInputDataset EOF
            {
             newCompositeNode(grammarAccess.getInputDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputDataset=ruleInputDataset();

            state._fsp--;

             current =iv_ruleInputDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputDataset"


    // $ANTLR start "ruleInputDataset"
    // InternalAnalysisActivityDSL.g:835:1: ruleInputDataset returns [EObject current=null] : (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleInputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_4_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_8_0 = null;

        AntlrDatatypeRuleToken lv_remarks_10_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:841:2: ( (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalAnalysisActivityDSL.g:842:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalAnalysisActivityDSL.g:842:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalAnalysisActivityDSL.g:843:3: otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:847:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:848:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:848:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:849:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDatasetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInputDatasetAccess().getMinimumCardinalityKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:874:3: ( (lv_minimumCardinality_4_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:875:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:875:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:876:5: lv_minimumCardinality_4_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_minimumCardinality_4_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_4_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getInputDatasetAccess().getMaximumCardinalityKeyword_5());
            		
            // InternalAnalysisActivityDSL.g:897:3: ( (lv_maximumCardinality_6_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:898:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:898:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:899:5: lv_maximumCardinality_6_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_maximumCardinality_6_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_6_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:916:3: (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:917:4: otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputDatasetAccess().getMimetypeKeyword_7_0());
                    			
                    // InternalAnalysisActivityDSL.g:921:4: ( (lv_mimetype_8_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:922:5: (lv_mimetype_8_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:922:5: (lv_mimetype_8_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:923:6: lv_mimetype_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputDatasetAccess().getMimetypeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_mimetype_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                    						}
                    						set(
                    							current,
                    							"mimetype",
                    							lv_mimetype_8_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:941:3: (otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:942:4: otherlv_9= 'remarks' ( (lv_remarks_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getInputDatasetAccess().getRemarksKeyword_8_0());
                    			
                    // InternalAnalysisActivityDSL.g:946:4: ( (lv_remarks_10_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:947:5: (lv_remarks_10_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:947:5: (lv_remarks_10_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:948:6: lv_remarks_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputDatasetAccess().getRemarksEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_remarks_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                    						}
                    						set(
                    							current,
                    							"remarks",
                    							lv_remarks_10_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInputDatasetAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputDataset"


    // $ANTLR start "entryRuleOutputDataset"
    // InternalAnalysisActivityDSL.g:974:1: entryRuleOutputDataset returns [EObject current=null] : iv_ruleOutputDataset= ruleOutputDataset EOF ;
    public final EObject entryRuleOutputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:974:54: (iv_ruleOutputDataset= ruleOutputDataset EOF )
            // InternalAnalysisActivityDSL.g:975:2: iv_ruleOutputDataset= ruleOutputDataset EOF
            {
             newCompositeNode(grammarAccess.getOutputDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputDataset=ruleOutputDataset();

            state._fsp--;

             current =iv_ruleOutputDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputDataset"


    // $ANTLR start "ruleOutputDataset"
    // InternalAnalysisActivityDSL.g:981:1: ruleOutputDataset returns [EObject current=null] : (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleOutputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_4_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_6_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_8_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:987:2: ( (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalAnalysisActivityDSL.g:988:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalAnalysisActivityDSL.g:988:2: (otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalAnalysisActivityDSL.g:989:3: otherlv_0= 'Dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'minimumCardinality' ( (lv_minimumCardinality_4_0= ruleEBigInteger ) ) otherlv_5= 'maximumCardinality' ( (lv_maximumCardinality_6_0= ruleEBigInteger ) ) (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:993:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:994:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:994:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:995:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDatasetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputDatasetAccess().getMinimumCardinalityKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1020:3: ( (lv_minimumCardinality_4_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1021:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1021:4: (lv_minimumCardinality_4_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1022:5: lv_minimumCardinality_4_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_minimumCardinality_4_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_4_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getOutputDatasetAccess().getMaximumCardinalityKeyword_5());
            		
            // InternalAnalysisActivityDSL.g:1043:3: ( (lv_maximumCardinality_6_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1044:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1044:4: (lv_maximumCardinality_6_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1045:5: lv_maximumCardinality_6_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_maximumCardinality_6_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_6_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1062:3: (otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1063:4: otherlv_7= 'mimetype' ( (lv_mimetype_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputDatasetAccess().getMimetypeKeyword_7_0());
                    			
                    // InternalAnalysisActivityDSL.g:1067:4: ( (lv_mimetype_8_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1068:5: (lv_mimetype_8_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1068:5: (lv_mimetype_8_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1069:6: lv_mimetype_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputDatasetAccess().getMimetypeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_mimetype_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                    						}
                    						set(
                    							current,
                    							"mimetype",
                    							lv_mimetype_8_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOutputDatasetAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputDataset"


    // $ANTLR start "entryRuleEBigInteger"
    // InternalAnalysisActivityDSL.g:1095:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalAnalysisActivityDSL.g:1095:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalAnalysisActivityDSL.g:1096:2: iv_ruleEBigInteger= ruleEBigInteger EOF
            {
             newCompositeNode(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigInteger=ruleEBigInteger();

            state._fsp--;

             current =iv_ruleEBigInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // InternalAnalysisActivityDSL.g:1102:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1108:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAnalysisActivityDSL.g:1109:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAnalysisActivityDSL.g:1109:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAnalysisActivityDSL.g:1110:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAnalysisActivityDSL.g:1110:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1111:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleMinimunDatasetCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1128:1: entryRuleMinimunDatasetCardinalityConstraint returns [EObject current=null] : iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF ;
    public final EObject entryRuleMinimunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimunDatasetCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1128:76: (iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1129:2: iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF
            {
             newCompositeNode(grammarAccess.getMinimunDatasetCardinalityConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimunDatasetCardinalityConstraint=ruleMinimunDatasetCardinalityConstraint();

            state._fsp--;

             current =iv_ruleMinimunDatasetCardinalityConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimunDatasetCardinalityConstraint"


    // $ANTLR start "ruleMinimunDatasetCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1135:1: ruleMinimunDatasetCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MinimunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMinimunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1141:2: ( (otherlv_0= 'MinimunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAnalysisActivityDSL.g:1142:2: (otherlv_0= 'MinimunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAnalysisActivityDSL.g:1142:2: (otherlv_0= 'MinimunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAnalysisActivityDSL.g:1143:3: otherlv_0= 'MinimunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getMinimunDatasetCardinalityConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1151:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1152:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1156:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1157:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1157:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1158:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMinimunDatasetCardinalityConstraintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1180:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1181:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1181:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1182:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinimunDatasetCardinalityConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getDatasetDatasetCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimunDatasetCardinalityConstraint"


    // $ANTLR start "entryRuleMaximunDatasetCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1204:1: entryRuleMaximunDatasetCardinalityConstraint returns [EObject current=null] : iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF ;
    public final EObject entryRuleMaximunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximunDatasetCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1204:76: (iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1205:2: iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF
            {
             newCompositeNode(grammarAccess.getMaximunDatasetCardinalityConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximunDatasetCardinalityConstraint=ruleMaximunDatasetCardinalityConstraint();

            state._fsp--;

             current =iv_ruleMaximunDatasetCardinalityConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximunDatasetCardinalityConstraint"


    // $ANTLR start "ruleMaximunDatasetCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1211:1: ruleMaximunDatasetCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MaximunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMaximunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1217:2: ( (otherlv_0= 'MaximunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAnalysisActivityDSL.g:1218:2: (otherlv_0= 'MaximunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAnalysisActivityDSL.g:1218:2: (otherlv_0= 'MaximunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAnalysisActivityDSL.g:1219:3: otherlv_0= 'MaximunDatasetCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getMaximunDatasetCardinalityConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1227:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1228:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1232:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1233:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1233:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1234:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaximunDatasetCardinalityConstraintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1256:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1257:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1257:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1258:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaximunDatasetCardinalityConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getDatasetDatasetCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximunDatasetCardinalityConstraint"


    // $ANTLR start "entryRuleMinimunParameterCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1280:1: entryRuleMinimunParameterCardinalityConstraint returns [EObject current=null] : iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF ;
    public final EObject entryRuleMinimunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimunParameterCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1280:78: (iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1281:2: iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF
            {
             newCompositeNode(grammarAccess.getMinimunParameterCardinalityConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimunParameterCardinalityConstraint=ruleMinimunParameterCardinalityConstraint();

            state._fsp--;

             current =iv_ruleMinimunParameterCardinalityConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimunParameterCardinalityConstraint"


    // $ANTLR start "ruleMinimunParameterCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1287:1: ruleMinimunParameterCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MinimunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMinimunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1293:2: ( (otherlv_0= 'MinimunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAnalysisActivityDSL.g:1294:2: (otherlv_0= 'MinimunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAnalysisActivityDSL.g:1294:2: (otherlv_0= 'MinimunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAnalysisActivityDSL.g:1295:3: otherlv_0= 'MinimunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getMinimunParameterCardinalityConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1303:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1304:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1308:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1309:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1309:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1310:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMinimunParameterCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_value_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMinimunParameterCardinalityConstraintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1332:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1333:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1333:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinimunParameterCardinalityConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMinimunParameterCardinalityConstraintAccess().getParameterParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimunParameterCardinalityConstraint"


    // $ANTLR start "entryRuleMaximunParameterCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1356:1: entryRuleMaximunParameterCardinalityConstraint returns [EObject current=null] : iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF ;
    public final EObject entryRuleMaximunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximunParameterCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1356:78: (iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1357:2: iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF
            {
             newCompositeNode(grammarAccess.getMaximunParameterCardinalityConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximunParameterCardinalityConstraint=ruleMaximunParameterCardinalityConstraint();

            state._fsp--;

             current =iv_ruleMaximunParameterCardinalityConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximunParameterCardinalityConstraint"


    // $ANTLR start "ruleMaximunParameterCardinalityConstraint"
    // InternalAnalysisActivityDSL.g:1363:1: ruleMaximunParameterCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MaximunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleMaximunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1369:2: ( (otherlv_0= 'MaximunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAnalysisActivityDSL.g:1370:2: (otherlv_0= 'MaximunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAnalysisActivityDSL.g:1370:2: (otherlv_0= 'MaximunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAnalysisActivityDSL.g:1371:3: otherlv_0= 'MaximunParameterCardinalityConstraint' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getMaximunParameterCardinalityConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1379:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1380:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1384:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1385:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1385:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1386:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMaximunParameterCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_value_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaximunParameterCardinalityConstraintRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1408:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1409:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1409:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1410:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaximunParameterCardinalityConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMaximunParameterCardinalityConstraintAccess().getParameterParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximunParameterCardinalityConstraint"


    // $ANTLR start "entryRuleCustomParameterConstraint"
    // InternalAnalysisActivityDSL.g:1432:1: entryRuleCustomParameterConstraint returns [EObject current=null] : iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF ;
    public final EObject entryRuleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1432:66: (iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1433:2: iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF
            {
             newCompositeNode(grammarAccess.getCustomParameterConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomParameterConstraint=ruleCustomParameterConstraint();

            state._fsp--;

             current =iv_ruleCustomParameterConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomParameterConstraint"


    // $ANTLR start "ruleCustomParameterConstraint"
    // InternalAnalysisActivityDSL.g:1439:1: ruleCustomParameterConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parameter' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1445:2: ( (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parameter' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAnalysisActivityDSL.g:1446:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parameter' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAnalysisActivityDSL.g:1446:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parameter' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAnalysisActivityDSL.g:1447:3: otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parameter' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterConstraintAccess().getCustomParameterConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1451:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1452:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1452:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1453:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomParameterConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomParameterConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomParameterConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomParameterConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1478:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1479:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1479:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1480:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomParameterConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomParameterConstraintAccess().getParameterParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomParameterConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomParameterConstraint"


    // $ANTLR start "entryRuleCustomDatasetConstraint"
    // InternalAnalysisActivityDSL.g:1502:1: entryRuleCustomDatasetConstraint returns [EObject current=null] : iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF ;
    public final EObject entryRuleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1502:64: (iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1503:2: iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF
            {
             newCompositeNode(grammarAccess.getCustomDatasetConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDatasetConstraint=ruleCustomDatasetConstraint();

            state._fsp--;

             current =iv_ruleCustomDatasetConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomDatasetConstraint"


    // $ANTLR start "ruleCustomDatasetConstraint"
    // InternalAnalysisActivityDSL.g:1509:1: ruleCustomDatasetConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dataset' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1515:2: ( (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dataset' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAnalysisActivityDSL.g:1516:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dataset' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAnalysisActivityDSL.g:1516:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dataset' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAnalysisActivityDSL.g:1517:3: otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dataset' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetConstraintAccess().getCustomDatasetConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1521:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1522:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1522:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1523:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDatasetConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDatasetConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomDatasetConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDatasetConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1548:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1549:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1549:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1550:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomDatasetConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomDatasetConstraintAccess().getDatasetDatasetCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDatasetConstraintAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomDatasetConstraint"


    // $ANTLR start "entryRuleCommandLineTool"
    // InternalAnalysisActivityDSL.g:1572:1: entryRuleCommandLineTool returns [EObject current=null] : iv_ruleCommandLineTool= ruleCommandLineTool EOF ;
    public final EObject entryRuleCommandLineTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineTool = null;


        try {
            // InternalAnalysisActivityDSL.g:1572:56: (iv_ruleCommandLineTool= ruleCommandLineTool EOF )
            // InternalAnalysisActivityDSL.g:1573:2: iv_ruleCommandLineTool= ruleCommandLineTool EOF
            {
             newCompositeNode(grammarAccess.getCommandLineToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandLineTool=ruleCommandLineTool();

            state._fsp--;

             current =iv_ruleCommandLineTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandLineTool"


    // $ANTLR start "ruleCommandLineTool"
    // InternalAnalysisActivityDSL.g:1579:1: ruleCommandLineTool returns [EObject current=null] : (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )? (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )? (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )? otherlv_11= 'commandLineTemplate' this_LIST_START_12= RULE_LIST_START ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) ) (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )* this_LIST_END_16= RULE_LIST_END (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )? otherlv_23= '}' ) ;
    public final EObject ruleCommandLineTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_LIST_START_12=null;
        Token otherlv_14=null;
        Token this_LIST_END_16=null;
        Token otherlv_17=null;
        Token this_LIST_START_18=null;
        Token otherlv_20=null;
        Token this_LIST_END_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_executablePath_4_0 = null;

        EObject lv_commandLineTemplate_13_0 = null;

        EObject lv_commandLineTemplate_15_0 = null;

        EObject lv_exitCodes_19_0 = null;

        EObject lv_exitCodes_21_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1585:2: ( (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )? (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )? (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )? otherlv_11= 'commandLineTemplate' this_LIST_START_12= RULE_LIST_START ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) ) (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )* this_LIST_END_16= RULE_LIST_END (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )? otherlv_23= '}' ) )
            // InternalAnalysisActivityDSL.g:1586:2: (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )? (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )? (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )? otherlv_11= 'commandLineTemplate' this_LIST_START_12= RULE_LIST_START ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) ) (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )* this_LIST_END_16= RULE_LIST_END (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )? otherlv_23= '}' )
            {
            // InternalAnalysisActivityDSL.g:1586:2: (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )? (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )? (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )? otherlv_11= 'commandLineTemplate' this_LIST_START_12= RULE_LIST_START ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) ) (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )* this_LIST_END_16= RULE_LIST_END (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )? otherlv_23= '}' )
            // InternalAnalysisActivityDSL.g:1587:3: otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )? (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )? (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )? otherlv_11= 'commandLineTemplate' this_LIST_START_12= RULE_LIST_START ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) ) (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )* this_LIST_END_16= RULE_LIST_END (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLineToolAccess().getCommandLineToolKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1591:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1592:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1592:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1593:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandLineToolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1614:3: (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1615:4: otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandLineToolAccess().getExecutablePathKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:1619:4: ( (lv_executablePath_4_0= ruleFilePath ) )
                    // InternalAnalysisActivityDSL.g:1620:5: (lv_executablePath_4_0= ruleFilePath )
                    {
                    // InternalAnalysisActivityDSL.g:1620:5: (lv_executablePath_4_0= ruleFilePath )
                    // InternalAnalysisActivityDSL.g:1621:6: lv_executablePath_4_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExecutablePathFilePathParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_executablePath_4_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    						}
                    						set(
                    							current,
                    							"executablePath",
                    							lv_executablePath_4_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:1639:3: (otherlv_5= 'standardInputStream' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1640:4: otherlv_5= 'standardInputStream' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandLineToolAccess().getStandardInputStreamKeyword_4_0());
                    			
                    // InternalAnalysisActivityDSL.g:1644:4: ( ( ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1645:5: ( ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1645:5: ( ruleEString )
                    // InternalAnalysisActivityDSL.g:1646:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandLineToolRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardInputStreamInputDatasetCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:1661:3: (otherlv_7= 'standardOutputStream' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1662:4: otherlv_7= 'standardOutputStream' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommandLineToolAccess().getStandardOutputStreamKeyword_5_0());
                    			
                    // InternalAnalysisActivityDSL.g:1666:4: ( ( ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1667:5: ( ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1667:5: ( ruleEString )
                    // InternalAnalysisActivityDSL.g:1668:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandLineToolRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardOutputStreamOutputDatasetCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:1683:3: (otherlv_9= 'standardErrorStream' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1684:4: otherlv_9= 'standardErrorStream' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommandLineToolAccess().getStandardErrorStreamKeyword_6_0());
                    			
                    // InternalAnalysisActivityDSL.g:1688:4: ( ( ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1689:5: ( ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1689:5: ( ruleEString )
                    // InternalAnalysisActivityDSL.g:1690:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommandLineToolRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardErrorStreamOutputDatasetCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getCommandLineToolAccess().getCommandLineTemplateKeyword_7());
            		
            this_LIST_START_12=(Token)match(input,RULE_LIST_START,FOLLOW_38); 

            			newLeafNode(this_LIST_START_12, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1713:3: ( (lv_commandLineTemplate_13_0= ruleCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:1714:4: (lv_commandLineTemplate_13_0= ruleCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:1714:4: (lv_commandLineTemplate_13_0= ruleCommandLineEntryList )
            // InternalAnalysisActivityDSL.g:1715:5: lv_commandLineTemplate_13_0= ruleCommandLineEntryList
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_commandLineTemplate_13_0=ruleCommandLineEntryList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            					}
            					add(
            						current,
            						"commandLineTemplate",
            						lv_commandLineTemplate_13_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1732:3: (otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1733:4: otherlv_14= ',' ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_38); 

            	    				newLeafNode(otherlv_14, grammarAccess.getCommandLineToolAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1737:4: ( (lv_commandLineTemplate_15_0= ruleCommandLineEntryList ) )
            	    // InternalAnalysisActivityDSL.g:1738:5: (lv_commandLineTemplate_15_0= ruleCommandLineEntryList )
            	    {
            	    // InternalAnalysisActivityDSL.g:1738:5: (lv_commandLineTemplate_15_0= ruleCommandLineEntryList )
            	    // InternalAnalysisActivityDSL.g:1739:6: lv_commandLineTemplate_15_0= ruleCommandLineEntryList
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_commandLineTemplate_15_0=ruleCommandLineEntryList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commandLineTemplate",
            	    							lv_commandLineTemplate_15_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            this_LIST_END_16=(Token)match(input,RULE_LIST_END,FOLLOW_39); 

            			newLeafNode(this_LIST_END_16, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_11());
            		
            // InternalAnalysisActivityDSL.g:1761:3: (otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1762:4: otherlv_17= 'exitCodes' this_LIST_START_18= RULE_LIST_START ( (lv_exitCodes_19_0= ruleExitCode ) ) (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )* this_LIST_END_22= RULE_LIST_END
                    {
                    otherlv_17=(Token)match(input,48,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandLineToolAccess().getExitCodesKeyword_12_0());
                    			
                    this_LIST_START_18=(Token)match(input,RULE_LIST_START,FOLLOW_40); 

                    				newLeafNode(this_LIST_START_18, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_12_1());
                    			
                    // InternalAnalysisActivityDSL.g:1770:4: ( (lv_exitCodes_19_0= ruleExitCode ) )
                    // InternalAnalysisActivityDSL.g:1771:5: (lv_exitCodes_19_0= ruleExitCode )
                    {
                    // InternalAnalysisActivityDSL.g:1771:5: (lv_exitCodes_19_0= ruleExitCode )
                    // InternalAnalysisActivityDSL.g:1772:6: lv_exitCodes_19_0= ruleExitCode
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exitCodes_19_0=ruleExitCode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    						}
                    						add(
                    							current,
                    							"exitCodes",
                    							lv_exitCodes_19_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:1789:4: (otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1790:5: otherlv_20= ',' ( (lv_exitCodes_21_0= ruleExitCode ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FOLLOW_40); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getCommandLineToolAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:1794:5: ( (lv_exitCodes_21_0= ruleExitCode ) )
                    	    // InternalAnalysisActivityDSL.g:1795:6: (lv_exitCodes_21_0= ruleExitCode )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1795:6: (lv_exitCodes_21_0= ruleExitCode )
                    	    // InternalAnalysisActivityDSL.g:1796:7: lv_exitCodes_21_0= ruleExitCode
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_exitCodes_21_0=ruleExitCode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exitCodes",
                    	    								lv_exitCodes_21_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    this_LIST_END_22=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_22, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_12_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getCommandLineToolAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandLineTool"


    // $ANTLR start "entryRuleFilePath"
    // InternalAnalysisActivityDSL.g:1827:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalAnalysisActivityDSL.g:1827:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalAnalysisActivityDSL.g:1828:2: iv_ruleFilePath= ruleFilePath EOF
            {
             newCompositeNode(grammarAccess.getFilePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilePath=ruleFilePath();

            state._fsp--;

             current =iv_ruleFilePath.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilePath"


    // $ANTLR start "ruleFilePath"
    // InternalAnalysisActivityDSL.g:1834:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1840:2: (this_EString_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1841:2: this_EString_0= ruleEString
            {

            		newCompositeNode(grammarAccess.getFilePathAccess().getEStringParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilePath"


    // $ANTLR start "entryRuleExitCode"
    // InternalAnalysisActivityDSL.g:1854:1: entryRuleExitCode returns [EObject current=null] : iv_ruleExitCode= ruleExitCode EOF ;
    public final EObject entryRuleExitCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitCode = null;


        try {
            // InternalAnalysisActivityDSL.g:1854:49: (iv_ruleExitCode= ruleExitCode EOF )
            // InternalAnalysisActivityDSL.g:1855:2: iv_ruleExitCode= ruleExitCode EOF
            {
             newCompositeNode(grammarAccess.getExitCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExitCode=ruleExitCode();

            state._fsp--;

             current =iv_ruleExitCode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitCode"


    // $ANTLR start "ruleExitCode"
    // InternalAnalysisActivityDSL.g:1861:1: ruleExitCode returns [EObject current=null] : (otherlv_0= 'ExitCode' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= ruleEBigInteger ) ) (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )? otherlv_6= 'status' ( (lv_status_7_0= ruleTerminationStatus ) ) otherlv_8= '}' ) ;
    public final EObject ruleExitCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_code_3_0 = null;

        AntlrDatatypeRuleToken lv_reportMessage_5_0 = null;

        Enumerator lv_status_7_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1867:2: ( (otherlv_0= 'ExitCode' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= ruleEBigInteger ) ) (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )? otherlv_6= 'status' ( (lv_status_7_0= ruleTerminationStatus ) ) otherlv_8= '}' ) )
            // InternalAnalysisActivityDSL.g:1868:2: (otherlv_0= 'ExitCode' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= ruleEBigInteger ) ) (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )? otherlv_6= 'status' ( (lv_status_7_0= ruleTerminationStatus ) ) otherlv_8= '}' )
            {
            // InternalAnalysisActivityDSL.g:1868:2: (otherlv_0= 'ExitCode' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= ruleEBigInteger ) ) (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )? otherlv_6= 'status' ( (lv_status_7_0= ruleTerminationStatus ) ) otherlv_8= '}' )
            // InternalAnalysisActivityDSL.g:1869:3: otherlv_0= 'ExitCode' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= ruleEBigInteger ) ) (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )? otherlv_6= 'status' ( (lv_status_7_0= ruleTerminationStatus ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExitCodeAccess().getExitCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getExitCodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getExitCodeAccess().getCodeKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1881:3: ( (lv_code_3_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1882:4: (lv_code_3_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1882:4: (lv_code_3_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1883:5: lv_code_3_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getCodeEBigIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_code_3_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExitCodeRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_3_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1900:3: (otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1901:4: otherlv_4= 'reportMessage' ( (lv_reportMessage_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExitCodeAccess().getReportMessageKeyword_4_0());
                    			
                    // InternalAnalysisActivityDSL.g:1905:4: ( (lv_reportMessage_5_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1906:5: (lv_reportMessage_5_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1906:5: (lv_reportMessage_5_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1907:6: lv_reportMessage_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExitCodeAccess().getReportMessageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_reportMessage_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExitCodeRule());
                    						}
                    						set(
                    							current,
                    							"reportMessage",
                    							lv_reportMessage_5_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_44); 

            			newLeafNode(otherlv_6, grammarAccess.getExitCodeAccess().getStatusKeyword_5());
            		
            // InternalAnalysisActivityDSL.g:1929:3: ( (lv_status_7_0= ruleTerminationStatus ) )
            // InternalAnalysisActivityDSL.g:1930:4: (lv_status_7_0= ruleTerminationStatus )
            {
            // InternalAnalysisActivityDSL.g:1930:4: (lv_status_7_0= ruleTerminationStatus )
            // InternalAnalysisActivityDSL.g:1931:5: lv_status_7_0= ruleTerminationStatus
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getStatusTerminationStatusEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_status_7_0=ruleTerminationStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExitCodeRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_7_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.TerminationStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExitCodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExitCode"


    // $ANTLR start "entryRuleToolNameCommandLineEntry"
    // InternalAnalysisActivityDSL.g:1956:1: entryRuleToolNameCommandLineEntry returns [EObject current=null] : iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF ;
    public final EObject entryRuleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolNameCommandLineEntry = null;


        try {
            // InternalAnalysisActivityDSL.g:1956:65: (iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF )
            // InternalAnalysisActivityDSL.g:1957:2: iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF
            {
             newCompositeNode(grammarAccess.getToolNameCommandLineEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToolNameCommandLineEntry=ruleToolNameCommandLineEntry();

            state._fsp--;

             current =iv_ruleToolNameCommandLineEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToolNameCommandLineEntry"


    // $ANTLR start "ruleToolNameCommandLineEntry"
    // InternalAnalysisActivityDSL.g:1963:1: ruleToolNameCommandLineEntry returns [EObject current=null] : ( () otherlv_1= 'ToolNameCommandLineEntry' otherlv_2= '{' (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )? otherlv_9= '}' ) ;
    public final EObject ruleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_LIST_START_4=null;
        Token otherlv_6=null;
        Token this_LIST_END_8=null;
        Token otherlv_9=null;
        EObject lv_manipulators_5_0 = null;

        EObject lv_manipulators_7_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1969:2: ( ( () otherlv_1= 'ToolNameCommandLineEntry' otherlv_2= '{' (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )? otherlv_9= '}' ) )
            // InternalAnalysisActivityDSL.g:1970:2: ( () otherlv_1= 'ToolNameCommandLineEntry' otherlv_2= '{' (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )? otherlv_9= '}' )
            {
            // InternalAnalysisActivityDSL.g:1970:2: ( () otherlv_1= 'ToolNameCommandLineEntry' otherlv_2= '{' (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )? otherlv_9= '}' )
            // InternalAnalysisActivityDSL.g:1971:3: () otherlv_1= 'ToolNameCommandLineEntry' otherlv_2= '{' (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )? otherlv_9= '}'
            {
            // InternalAnalysisActivityDSL.g:1971:3: ()
            // InternalAnalysisActivityDSL.g:1972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getToolNameCommandLineEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1986:3: (otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1987:4: otherlv_3= 'manipulators' this_LIST_START_4= RULE_LIST_START ( (lv_manipulators_5_0= ruleStringListManipulator ) ) (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )* this_LIST_END_8= RULE_LIST_END
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsKeyword_3_0());
                    			
                    this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_46); 

                    				newLeafNode(this_LIST_START_4, grammarAccess.getToolNameCommandLineEntryAccess().getLIST_STARTTerminalRuleCall_3_1());
                    			
                    // InternalAnalysisActivityDSL.g:1995:4: ( (lv_manipulators_5_0= ruleStringListManipulator ) )
                    // InternalAnalysisActivityDSL.g:1996:5: (lv_manipulators_5_0= ruleStringListManipulator )
                    {
                    // InternalAnalysisActivityDSL.g:1996:5: (lv_manipulators_5_0= ruleStringListManipulator )
                    // InternalAnalysisActivityDSL.g:1997:6: lv_manipulators_5_0= ruleStringListManipulator
                    {

                    						newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_manipulators_5_0=ruleStringListManipulator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getToolNameCommandLineEntryRule());
                    						}
                    						add(
                    							current,
                    							"manipulators",
                    							lv_manipulators_5_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2014:4: (otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2015:5: otherlv_6= ',' ( (lv_manipulators_7_0= ruleStringListManipulator ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_46); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getToolNameCommandLineEntryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:2019:5: ( (lv_manipulators_7_0= ruleStringListManipulator ) )
                    	    // InternalAnalysisActivityDSL.g:2020:6: (lv_manipulators_7_0= ruleStringListManipulator )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2020:6: (lv_manipulators_7_0= ruleStringListManipulator )
                    	    // InternalAnalysisActivityDSL.g:2021:7: lv_manipulators_7_0= ruleStringListManipulator
                    	    {

                    	    							newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_manipulators_7_0=ruleStringListManipulator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getToolNameCommandLineEntryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manipulators",
                    	    								lv_manipulators_7_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_8, grammarAccess.getToolNameCommandLineEntryAccess().getLIST_ENDTerminalRuleCall_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getToolNameCommandLineEntryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToolNameCommandLineEntry"


    // $ANTLR start "entryRuleLiteralCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2052:1: entryRuleLiteralCommandLineEntryList returns [EObject current=null] : iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF ;
    public final EObject entryRuleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2052:68: (iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2053:2: iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF
            {
             newCompositeNode(grammarAccess.getLiteralCommandLineEntryListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralCommandLineEntryList=ruleLiteralCommandLineEntryList();

            state._fsp--;

             current =iv_ruleLiteralCommandLineEntryList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralCommandLineEntryList"


    // $ANTLR start "ruleLiteralCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2059:1: ruleLiteralCommandLineEntryList returns [EObject current=null] : ( () otherlv_1= 'LiteralCommandLineEntryList' otherlv_2= '{' (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )? (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )? otherlv_15= '}' ) ;
    public final EObject ruleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_LIST_START_4=null;
        Token otherlv_6=null;
        Token this_LIST_END_8=null;
        Token otherlv_9=null;
        Token this_LIST_START_10=null;
        Token otherlv_12=null;
        Token this_LIST_END_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_literals_5_0 = null;

        AntlrDatatypeRuleToken lv_literals_7_0 = null;

        EObject lv_manipulators_11_0 = null;

        EObject lv_manipulators_13_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2065:2: ( ( () otherlv_1= 'LiteralCommandLineEntryList' otherlv_2= '{' (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )? (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )? otherlv_15= '}' ) )
            // InternalAnalysisActivityDSL.g:2066:2: ( () otherlv_1= 'LiteralCommandLineEntryList' otherlv_2= '{' (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )? (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )? otherlv_15= '}' )
            {
            // InternalAnalysisActivityDSL.g:2066:2: ( () otherlv_1= 'LiteralCommandLineEntryList' otherlv_2= '{' (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )? (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )? otherlv_15= '}' )
            // InternalAnalysisActivityDSL.g:2067:3: () otherlv_1= 'LiteralCommandLineEntryList' otherlv_2= '{' (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )? (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )? otherlv_15= '}'
            {
            // InternalAnalysisActivityDSL.g:2067:3: ()
            // InternalAnalysisActivityDSL.g:2068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getLiteralCommandLineEntryListAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:2082:3: (otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2083:4: otherlv_3= 'literals' this_LIST_START_4= RULE_LIST_START ( (lv_literals_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )* this_LIST_END_8= RULE_LIST_END
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsKeyword_3_0());
                    			
                    this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

                    				newLeafNode(this_LIST_START_4, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_3_1());
                    			
                    // InternalAnalysisActivityDSL.g:2091:4: ( (lv_literals_5_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:2092:5: (lv_literals_5_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:2092:5: (lv_literals_5_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:2093:6: lv_literals_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_literals_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_5_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2110:4: (otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2111:5: otherlv_6= ',' ( (lv_literals_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLiteralCommandLineEntryListAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:2115:5: ( (lv_literals_7_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:2116:6: (lv_literals_7_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2116:6: (lv_literals_7_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:2117:7: lv_literals_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_literals_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_7_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_45); 

                    				newLeafNode(this_LIST_END_8, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_3_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:2140:3: (otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2141:4: otherlv_9= 'manipulators' this_LIST_START_10= RULE_LIST_START ( (lv_manipulators_11_0= ruleStringListManipulator ) ) (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )* this_LIST_END_14= RULE_LIST_END
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsKeyword_4_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_46); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:2149:4: ( (lv_manipulators_11_0= ruleStringListManipulator ) )
                    // InternalAnalysisActivityDSL.g:2150:5: (lv_manipulators_11_0= ruleStringListManipulator )
                    {
                    // InternalAnalysisActivityDSL.g:2150:5: (lv_manipulators_11_0= ruleStringListManipulator )
                    // InternalAnalysisActivityDSL.g:2151:6: lv_manipulators_11_0= ruleStringListManipulator
                    {

                    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_manipulators_11_0=ruleStringListManipulator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
                    						}
                    						add(
                    							current,
                    							"manipulators",
                    							lv_manipulators_11_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2168:4: (otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2169:5: otherlv_12= ',' ( (lv_manipulators_13_0= ruleStringListManipulator ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_46); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getLiteralCommandLineEntryListAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:2173:5: ( (lv_manipulators_13_0= ruleStringListManipulator ) )
                    	    // InternalAnalysisActivityDSL.g:2174:6: (lv_manipulators_13_0= ruleStringListManipulator )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2174:6: (lv_manipulators_13_0= ruleStringListManipulator )
                    	    // InternalAnalysisActivityDSL.g:2175:7: lv_manipulators_13_0= ruleStringListManipulator
                    	    {

                    	    							newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_manipulators_13_0=ruleStringListManipulator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manipulators",
                    	    								lv_manipulators_13_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_14, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLiteralCommandLineEntryListAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralCommandLineEntryList"


    // $ANTLR start "entryRuleDatasetCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2206:1: entryRuleDatasetCommandLineEntryList returns [EObject current=null] : iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF ;
    public final EObject entryRuleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2206:68: (iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2207:2: iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF
            {
             newCompositeNode(grammarAccess.getDatasetCommandLineEntryListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetCommandLineEntryList=ruleDatasetCommandLineEntryList();

            state._fsp--;

             current =iv_ruleDatasetCommandLineEntryList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatasetCommandLineEntryList"


    // $ANTLR start "ruleDatasetCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2213:1: ruleDatasetCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'DatasetCommandLineEntryList' otherlv_1= '{' otherlv_2= 'dataset' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' ) ;
    public final EObject ruleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_LIST_START_5=null;
        Token otherlv_7=null;
        Token this_LIST_END_9=null;
        Token otherlv_10=null;
        EObject lv_manipulators_6_0 = null;

        EObject lv_manipulators_8_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2219:2: ( (otherlv_0= 'DatasetCommandLineEntryList' otherlv_1= '{' otherlv_2= 'dataset' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' ) )
            // InternalAnalysisActivityDSL.g:2220:2: (otherlv_0= 'DatasetCommandLineEntryList' otherlv_1= '{' otherlv_2= 'dataset' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' )
            {
            // InternalAnalysisActivityDSL.g:2220:2: (otherlv_0= 'DatasetCommandLineEntryList' otherlv_1= '{' otherlv_2= 'dataset' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' )
            // InternalAnalysisActivityDSL.g:2221:3: otherlv_0= 'DatasetCommandLineEntryList' otherlv_1= '{' otherlv_2= 'dataset' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetCommandLineEntryListKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetCommandLineEntryListAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:2233:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2234:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2234:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2235:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetDatasetCrossReference_3_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2249:3: (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2250:4: otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsKeyword_4_0());
                    			
                    this_LIST_START_5=(Token)match(input,RULE_LIST_START,FOLLOW_46); 

                    				newLeafNode(this_LIST_START_5, grammarAccess.getDatasetCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:2258:4: ( (lv_manipulators_6_0= ruleStringListManipulator ) )
                    // InternalAnalysisActivityDSL.g:2259:5: (lv_manipulators_6_0= ruleStringListManipulator )
                    {
                    // InternalAnalysisActivityDSL.g:2259:5: (lv_manipulators_6_0= ruleStringListManipulator )
                    // InternalAnalysisActivityDSL.g:2260:6: lv_manipulators_6_0= ruleStringListManipulator
                    {

                    						newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_manipulators_6_0=ruleStringListManipulator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatasetCommandLineEntryListRule());
                    						}
                    						add(
                    							current,
                    							"manipulators",
                    							lv_manipulators_6_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2277:4: (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2278:5: otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_46); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDatasetCommandLineEntryListAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:2282:5: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
                    	    // InternalAnalysisActivityDSL.g:2283:6: (lv_manipulators_8_0= ruleStringListManipulator )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2283:6: (lv_manipulators_8_0= ruleStringListManipulator )
                    	    // InternalAnalysisActivityDSL.g:2284:7: lv_manipulators_8_0= ruleStringListManipulator
                    	    {

                    	    							newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_manipulators_8_0=ruleStringListManipulator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDatasetCommandLineEntryListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manipulators",
                    	    								lv_manipulators_8_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    this_LIST_END_9=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_9, grammarAccess.getDatasetCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDatasetCommandLineEntryListAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatasetCommandLineEntryList"


    // $ANTLR start "entryRuleParameterCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2315:1: entryRuleParameterCommandLineEntryList returns [EObject current=null] : iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF ;
    public final EObject entryRuleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2315:70: (iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2316:2: iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF
            {
             newCompositeNode(grammarAccess.getParameterCommandLineEntryListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterCommandLineEntryList=ruleParameterCommandLineEntryList();

            state._fsp--;

             current =iv_ruleParameterCommandLineEntryList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCommandLineEntryList"


    // $ANTLR start "ruleParameterCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2322:1: ruleParameterCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'ParameterCommandLineEntryList' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' ) ;
    public final EObject ruleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_LIST_START_5=null;
        Token otherlv_7=null;
        Token this_LIST_END_9=null;
        Token otherlv_10=null;
        EObject lv_manipulators_6_0 = null;

        EObject lv_manipulators_8_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2328:2: ( (otherlv_0= 'ParameterCommandLineEntryList' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' ) )
            // InternalAnalysisActivityDSL.g:2329:2: (otherlv_0= 'ParameterCommandLineEntryList' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' )
            {
            // InternalAnalysisActivityDSL.g:2329:2: (otherlv_0= 'ParameterCommandLineEntryList' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}' )
            // InternalAnalysisActivityDSL.g:2330:3: otherlv_0= 'ParameterCommandLineEntryList' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterCommandLineEntryListAccess().getParameterCommandLineEntryListKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterCommandLineEntryListAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterCommandLineEntryListAccess().getParameterKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:2342:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2343:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2343:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2344:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getParameterParameterCrossReference_3_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2358:3: (otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2359:4: otherlv_4= 'manipulators' this_LIST_START_5= RULE_LIST_START ( (lv_manipulators_6_0= ruleStringListManipulator ) ) (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* this_LIST_END_9= RULE_LIST_END
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsKeyword_4_0());
                    			
                    this_LIST_START_5=(Token)match(input,RULE_LIST_START,FOLLOW_46); 

                    				newLeafNode(this_LIST_START_5, grammarAccess.getParameterCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:2367:4: ( (lv_manipulators_6_0= ruleStringListManipulator ) )
                    // InternalAnalysisActivityDSL.g:2368:5: (lv_manipulators_6_0= ruleStringListManipulator )
                    {
                    // InternalAnalysisActivityDSL.g:2368:5: (lv_manipulators_6_0= ruleStringListManipulator )
                    // InternalAnalysisActivityDSL.g:2369:6: lv_manipulators_6_0= ruleStringListManipulator
                    {

                    						newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_manipulators_6_0=ruleStringListManipulator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterCommandLineEntryListRule());
                    						}
                    						add(
                    							current,
                    							"manipulators",
                    							lv_manipulators_6_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2386:4: (otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==18) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2387:5: otherlv_7= ',' ( (lv_manipulators_8_0= ruleStringListManipulator ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_46); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getParameterCommandLineEntryListAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:2391:5: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
                    	    // InternalAnalysisActivityDSL.g:2392:6: (lv_manipulators_8_0= ruleStringListManipulator )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2392:6: (lv_manipulators_8_0= ruleStringListManipulator )
                    	    // InternalAnalysisActivityDSL.g:2393:7: lv_manipulators_8_0= ruleStringListManipulator
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_manipulators_8_0=ruleStringListManipulator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterCommandLineEntryListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"manipulators",
                    	    								lv_manipulators_8_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    this_LIST_END_9=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_9, grammarAccess.getParameterCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getParameterCommandLineEntryListAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterCommandLineEntryList"


    // $ANTLR start "entryRuleJoin"
    // InternalAnalysisActivityDSL.g:2424:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalAnalysisActivityDSL.g:2424:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalAnalysisActivityDSL.g:2425:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalAnalysisActivityDSL.g:2431:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_delimiter_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2437:2: ( (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2438:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2438:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2439:3: otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2443:3: ( (lv_delimiter_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2444:4: (lv_delimiter_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2444:4: (lv_delimiter_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2445:5: lv_delimiter_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getDelimiterEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_delimiter_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"delimiter",
            						lv_delimiter_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRulePrependEach"
    // InternalAnalysisActivityDSL.g:2466:1: entryRulePrependEach returns [EObject current=null] : iv_rulePrependEach= rulePrependEach EOF ;
    public final EObject entryRulePrependEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2466:52: (iv_rulePrependEach= rulePrependEach EOF )
            // InternalAnalysisActivityDSL.g:2467:2: iv_rulePrependEach= rulePrependEach EOF
            {
             newCompositeNode(grammarAccess.getPrependEachRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrependEach=rulePrependEach();

            state._fsp--;

             current =iv_rulePrependEach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrependEach"


    // $ANTLR start "rulePrependEach"
    // InternalAnalysisActivityDSL.g:2473:1: rulePrependEach returns [EObject current=null] : (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2479:2: ( (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2480:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2480:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2481:3: otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependEachAccess().getPrependEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2485:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2486:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2486:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2487:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrependEachAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrependEachRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrependEach"


    // $ANTLR start "entryRuleAppendEach"
    // InternalAnalysisActivityDSL.g:2508:1: entryRuleAppendEach returns [EObject current=null] : iv_ruleAppendEach= ruleAppendEach EOF ;
    public final EObject entryRuleAppendEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2508:51: (iv_ruleAppendEach= ruleAppendEach EOF )
            // InternalAnalysisActivityDSL.g:2509:2: iv_ruleAppendEach= ruleAppendEach EOF
            {
             newCompositeNode(grammarAccess.getAppendEachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppendEach=ruleAppendEach();

            state._fsp--;

             current =iv_ruleAppendEach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppendEach"


    // $ANTLR start "ruleAppendEach"
    // InternalAnalysisActivityDSL.g:2515:1: ruleAppendEach returns [EObject current=null] : (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2521:2: ( (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2522:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2522:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2523:3: otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendEachAccess().getAppendEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2527:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2528:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2528:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2529:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppendEachAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppendEachRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppendEach"


    // $ANTLR start "entryRuleAppendListWith"
    // InternalAnalysisActivityDSL.g:2550:1: entryRuleAppendListWith returns [EObject current=null] : iv_ruleAppendListWith= ruleAppendListWith EOF ;
    public final EObject entryRuleAppendListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2550:55: (iv_ruleAppendListWith= ruleAppendListWith EOF )
            // InternalAnalysisActivityDSL.g:2551:2: iv_ruleAppendListWith= ruleAppendListWith EOF
            {
             newCompositeNode(grammarAccess.getAppendListWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppendListWith=ruleAppendListWith();

            state._fsp--;

             current =iv_ruleAppendListWith; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppendListWith"


    // $ANTLR start "ruleAppendListWith"
    // InternalAnalysisActivityDSL.g:2557:1: ruleAppendListWith returns [EObject current=null] : (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2563:2: ( (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2564:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2564:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2565:3: otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendListWithAccess().getAppendListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2569:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2570:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2570:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2571:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppendListWithAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppendListWithRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppendListWith"


    // $ANTLR start "entryRulePrependListWith"
    // InternalAnalysisActivityDSL.g:2592:1: entryRulePrependListWith returns [EObject current=null] : iv_rulePrependListWith= rulePrependListWith EOF ;
    public final EObject entryRulePrependListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2592:56: (iv_rulePrependListWith= rulePrependListWith EOF )
            // InternalAnalysisActivityDSL.g:2593:2: iv_rulePrependListWith= rulePrependListWith EOF
            {
             newCompositeNode(grammarAccess.getPrependListWithRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrependListWith=rulePrependListWith();

            state._fsp--;

             current =iv_rulePrependListWith; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrependListWith"


    // $ANTLR start "rulePrependListWith"
    // InternalAnalysisActivityDSL.g:2599:1: rulePrependListWith returns [EObject current=null] : (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2605:2: ( (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2606:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2606:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2607:3: otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependListWithAccess().getPrependListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2611:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2612:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2612:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2613:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrependListWithAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrependListWithRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrependListWith"


    // $ANTLR start "ruleParameterType"
    // InternalAnalysisActivityDSL.g:2634:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2640:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalAnalysisActivityDSL.g:2641:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalAnalysisActivityDSL.g:2641:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt42=1;
                }
                break;
            case 65:
                {
                alt42=2;
                }
                break;
            case 66:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2642:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalAnalysisActivityDSL.g:2642:3: (enumLiteral_0= 'STRING' )
                    // InternalAnalysisActivityDSL.g:2643:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2650:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalAnalysisActivityDSL.g:2650:3: (enumLiteral_1= 'INTEGER' )
                    // InternalAnalysisActivityDSL.g:2651:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:2658:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalAnalysisActivityDSL.g:2658:3: (enumLiteral_2= 'REAL' )
                    // InternalAnalysisActivityDSL.g:2659:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "ruleTerminationStatus"
    // InternalAnalysisActivityDSL.g:2669:1: ruleTerminationStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) ;
    public final Enumerator ruleTerminationStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2675:2: ( ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) )
            // InternalAnalysisActivityDSL.g:2676:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            {
            // InternalAnalysisActivityDSL.g:2676:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==67) ) {
                alt43=1;
            }
            else if ( (LA43_0==68) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2677:3: (enumLiteral_0= 'SUCCEEDED' )
                    {
                    // InternalAnalysisActivityDSL.g:2677:3: (enumLiteral_0= 'SUCCEEDED' )
                    // InternalAnalysisActivityDSL.g:2678:4: enumLiteral_0= 'SUCCEEDED'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2685:3: (enumLiteral_1= 'FAILED' )
                    {
                    // InternalAnalysisActivityDSL.g:2685:3: (enumLiteral_1= 'FAILED' )
                    // InternalAnalysisActivityDSL.g:2686:4: enumLiteral_1= 'FAILED'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getFAILEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTerminationStatusAccess().getFAILEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminationStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007B0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003B200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x06A0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0140000000800000L});

}