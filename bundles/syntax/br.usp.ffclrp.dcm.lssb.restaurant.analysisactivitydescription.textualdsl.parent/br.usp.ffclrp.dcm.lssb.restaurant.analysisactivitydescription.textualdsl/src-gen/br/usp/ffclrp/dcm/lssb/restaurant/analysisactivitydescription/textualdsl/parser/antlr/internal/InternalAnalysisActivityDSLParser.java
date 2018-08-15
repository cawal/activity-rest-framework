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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTITY_START", "RULE_MULTILINE_STRING", "RULE_STATEMENT_END", "RULE_ENTITY_END", "RULE_LIST_START", "RULE_LIST_SEPARATOR", "RULE_LIST_END", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PIPE_TO", "RULE_DEFINITION_START", "RULE_DEFINITION_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'on'", "'with'", "'produces'", "'readinessContraints'", "'using'", "'parameter'", "':'", "'='", "'constraints'", "'dataset'", "'-'", "'CustomParameterConstraint'", "'CustomDatasetConstraint'", "'CustomParameterReadinessConstraint'", "'CustomDatasetReadinessConstraint'", "'executable'", "'path'", "'redirecting'", "'stdin'", "'from'", "'stdout'", "'to'", "'stderr'", "'commandLineTemplate'", "'returns'", "'if'", "'toolname'", "'literals'", "'Join'", "'PrependEach'", "'AppendEach'", "'AppendListWith'", "'PrependListWith'", "'STRING'", "'INTEGER'", "'REAL'", "'SUCCEEDED'", "'FAILED'"
    };
    public static final int T__50=50;
    public static final int RULE_LIST_END=10;
    public static final int T__59=59;
    public static final int RULE_DEFINITION_END=16;
    public static final int T__55=55;
    public static final int RULE_ENTITY_START=4;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=12;
    public static final int RULE_ENTITY_END=7;
    public static final int RULE_LIST_SEPARATOR=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_STATEMENT_END=6;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
    public static final int RULE_LIST_START=8;
    public static final int RULE_DEFINITION_START=15;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_PIPE_TO=14;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_MULTILINE_STRING=5;
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
    // InternalAnalysisActivityDSL.g:72:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )? (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )? (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )? (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )? (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )? otherlv_26= 'using' ( (lv_tool_27_0= ruleTool ) ) this_ENTITY_END_28= RULE_ENTITY_END ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token lv_remarks_3_0=null;
        Token this_STATEMENT_END_4=null;
        Token otherlv_5=null;
        Token this_ENTITY_START_6=null;
        Token this_ENTITY_END_9=null;
        Token otherlv_10=null;
        Token this_ENTITY_START_11=null;
        Token this_ENTITY_END_14=null;
        Token otherlv_15=null;
        Token this_ENTITY_START_16=null;
        Token this_ENTITY_END_19=null;
        Token otherlv_20=null;
        Token this_LIST_START_21=null;
        Token this_LIST_SEPARATOR_23=null;
        Token this_LIST_END_25=null;
        Token otherlv_26=null;
        Token this_ENTITY_END_28=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inputDatasets_7_0 = null;

        EObject lv_inputDatasets_8_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_outputDatasets_17_0 = null;

        EObject lv_outputDatasets_18_0 = null;

        EObject lv_readinessContraints_22_0 = null;

        EObject lv_readinessContraints_24_0 = null;

        EObject lv_tool_27_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:78:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )? (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )? (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )? (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )? (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )? otherlv_26= 'using' ( (lv_tool_27_0= ruleTool ) ) this_ENTITY_END_28= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )? (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )? (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )? (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )? (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )? otherlv_26= 'using' ( (lv_tool_27_0= ruleTool ) ) this_ENTITY_END_28= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )? (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )? (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )? (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )? (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )? otherlv_26= 'using' ( (lv_tool_27_0= ruleTool ) ) this_ENTITY_END_28= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:80:3: otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )? (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )? (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )? (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )? (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )? otherlv_26= 'using' ( (lv_tool_27_0= ruleTool ) ) this_ENTITY_END_28= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_5); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:107:3: ( ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_MULTILINE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:108:4: ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_4= RULE_STATEMENT_END
                    {
                    // InternalAnalysisActivityDSL.g:108:4: ( (lv_remarks_3_0= RULE_MULTILINE_STRING ) )
                    // InternalAnalysisActivityDSL.g:109:5: (lv_remarks_3_0= RULE_MULTILINE_STRING )
                    {
                    // InternalAnalysisActivityDSL.g:109:5: (lv_remarks_3_0= RULE_MULTILINE_STRING )
                    // InternalAnalysisActivityDSL.g:110:6: lv_remarks_3_0= RULE_MULTILINE_STRING
                    {
                    lv_remarks_3_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_remarks_3_0, grammarAccess.getActivityAccess().getRemarksMULTILINE_STRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"remarks",
                    							lv_remarks_3_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.MULTILINE_STRING");
                    					

                    }


                    }

                    this_STATEMENT_END_4=(Token)match(input,RULE_STATEMENT_END,FOLLOW_7); 

                    				newLeafNode(this_STATEMENT_END_4, grammarAccess.getActivityAccess().getSTATEMENT_ENDTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:131:3: (otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:132:4: otherlv_5= 'on' this_ENTITY_START_6= RULE_ENTITY_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) ( (lv_inputDatasets_8_0= ruleInputDataset ) )* this_ENTITY_END_9= RULE_ENTITY_END
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getOnKeyword_4_0());
                    			
                    this_ENTITY_START_6=(Token)match(input,RULE_ENTITY_START,FOLLOW_8); 

                    				newLeafNode(this_ENTITY_START_6, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:140:4: ( (lv_inputDatasets_7_0= ruleInputDataset ) )
                    // InternalAnalysisActivityDSL.g:141:5: (lv_inputDatasets_7_0= ruleInputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:141:5: (lv_inputDatasets_7_0= ruleInputDataset )
                    // InternalAnalysisActivityDSL.g:142:6: lv_inputDatasets_7_0= ruleInputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_inputDatasets_7_0=ruleInputDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"inputDatasets",
                    							lv_inputDatasets_7_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.InputDataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:159:4: ( (lv_inputDatasets_8_0= ruleInputDataset ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==31) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:160:5: (lv_inputDatasets_8_0= ruleInputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:160:5: (lv_inputDatasets_8_0= ruleInputDataset )
                    	    // InternalAnalysisActivityDSL.g:161:6: lv_inputDatasets_8_0= ruleInputDataset
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_inputDatasets_8_0=ruleInputDataset();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputDatasets",
                    	    							lv_inputDatasets_8_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.InputDataset");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    this_ENTITY_END_9=(Token)match(input,RULE_ENTITY_END,FOLLOW_10); 

                    				newLeafNode(this_ENTITY_END_9, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:183:3: (otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:184:4: otherlv_10= 'with' this_ENTITY_START_11= RULE_ENTITY_START ( (lv_parameters_12_0= ruleParameter ) ) ( (lv_parameters_13_0= ruleParameter ) )* this_ENTITY_END_14= RULE_ENTITY_END
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getWithKeyword_5_0());
                    			
                    this_ENTITY_START_11=(Token)match(input,RULE_ENTITY_START,FOLLOW_11); 

                    				newLeafNode(this_ENTITY_START_11, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_5_1());
                    			
                    // InternalAnalysisActivityDSL.g:192:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalAnalysisActivityDSL.g:193:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalAnalysisActivityDSL.g:193:5: (lv_parameters_12_0= ruleParameter )
                    // InternalAnalysisActivityDSL.g:194:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:211:4: ( (lv_parameters_13_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:212:5: (lv_parameters_13_0= ruleParameter )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:212:5: (lv_parameters_13_0= ruleParameter )
                    	    // InternalAnalysisActivityDSL.g:213:6: lv_parameters_13_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_13_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_13_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_ENTITY_END_14=(Token)match(input,RULE_ENTITY_END,FOLLOW_13); 

                    				newLeafNode(this_ENTITY_END_14, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:235:3: (otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:236:4: otherlv_15= 'produces' this_ENTITY_START_16= RULE_ENTITY_START ( (lv_outputDatasets_17_0= ruleOutputDataset ) ) ( (lv_outputDatasets_18_0= ruleOutputDataset ) )* this_ENTITY_END_19= RULE_ENTITY_END
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getProducesKeyword_6_0());
                    			
                    this_ENTITY_START_16=(Token)match(input,RULE_ENTITY_START,FOLLOW_8); 

                    				newLeafNode(this_ENTITY_START_16, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_6_1());
                    			
                    // InternalAnalysisActivityDSL.g:244:4: ( (lv_outputDatasets_17_0= ruleOutputDataset ) )
                    // InternalAnalysisActivityDSL.g:245:5: (lv_outputDatasets_17_0= ruleOutputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:245:5: (lv_outputDatasets_17_0= ruleOutputDataset )
                    // InternalAnalysisActivityDSL.g:246:6: lv_outputDatasets_17_0= ruleOutputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_outputDatasets_17_0=ruleOutputDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"outputDatasets",
                    							lv_outputDatasets_17_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.OutputDataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:263:4: ( (lv_outputDatasets_18_0= ruleOutputDataset ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==31) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:264:5: (lv_outputDatasets_18_0= ruleOutputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:264:5: (lv_outputDatasets_18_0= ruleOutputDataset )
                    	    // InternalAnalysisActivityDSL.g:265:6: lv_outputDatasets_18_0= ruleOutputDataset
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_outputDatasets_18_0=ruleOutputDataset();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputDatasets",
                    	    							lv_outputDatasets_18_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.OutputDataset");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_ENTITY_END_19=(Token)match(input,RULE_ENTITY_END,FOLLOW_14); 

                    				newLeafNode(this_ENTITY_END_19, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_6_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:287:3: (otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:288:4: otherlv_20= 'readinessContraints' this_LIST_START_21= RULE_LIST_START ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )* this_LIST_END_25= RULE_LIST_END
                    {
                    otherlv_20=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getReadinessContraintsKeyword_7_0());
                    			
                    this_LIST_START_21=(Token)match(input,RULE_LIST_START,FOLLOW_16); 

                    				newLeafNode(this_LIST_START_21, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_7_1());
                    			
                    // InternalAnalysisActivityDSL.g:296:4: ( (lv_readinessContraints_22_0= ruleReadinessConstraint ) )
                    // InternalAnalysisActivityDSL.g:297:5: (lv_readinessContraints_22_0= ruleReadinessConstraint )
                    {
                    // InternalAnalysisActivityDSL.g:297:5: (lv_readinessContraints_22_0= ruleReadinessConstraint )
                    // InternalAnalysisActivityDSL.g:298:6: lv_readinessContraints_22_0= ruleReadinessConstraint
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_readinessContraints_22_0=ruleReadinessConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"readinessContraints",
                    							lv_readinessContraints_22_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ReadinessConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:315:4: (this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_LIST_SEPARATOR) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:316:5: this_LIST_SEPARATOR_23= RULE_LIST_SEPARATOR ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) )
                    	    {
                    	    this_LIST_SEPARATOR_23=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_16); 

                    	    					newLeafNode(this_LIST_SEPARATOR_23, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_7_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:320:5: ( (lv_readinessContraints_24_0= ruleReadinessConstraint ) )
                    	    // InternalAnalysisActivityDSL.g:321:6: (lv_readinessContraints_24_0= ruleReadinessConstraint )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:321:6: (lv_readinessContraints_24_0= ruleReadinessConstraint )
                    	    // InternalAnalysisActivityDSL.g:322:7: lv_readinessContraints_24_0= ruleReadinessConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_readinessContraints_24_0=ruleReadinessConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"readinessContraints",
                    	    								lv_readinessContraints_24_0,
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

                    this_LIST_END_25=(Token)match(input,RULE_LIST_END,FOLLOW_18); 

                    				newLeafNode(this_LIST_END_25, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_7_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getUsingKeyword_8());
            		
            // InternalAnalysisActivityDSL.g:349:3: ( (lv_tool_27_0= ruleTool ) )
            // InternalAnalysisActivityDSL.g:350:4: (lv_tool_27_0= ruleTool )
            {
            // InternalAnalysisActivityDSL.g:350:4: (lv_tool_27_0= ruleTool )
            // InternalAnalysisActivityDSL.g:351:5: lv_tool_27_0= ruleTool
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getToolToolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_20);
            lv_tool_27_0=ruleTool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"tool",
            						lv_tool_27_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Tool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_END_28=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_28, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_10());
            		

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
    // InternalAnalysisActivityDSL.g:376:1: entryRuleReadinessConstraint returns [EObject current=null] : iv_ruleReadinessConstraint= ruleReadinessConstraint EOF ;
    public final EObject entryRuleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:376:60: (iv_ruleReadinessConstraint= ruleReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:377:2: iv_ruleReadinessConstraint= ruleReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:383:1: ruleReadinessConstraint returns [EObject current=null] : (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint ) ;
    public final EObject ruleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReadinessConstraint_0 = null;

        EObject this_DatasetReadinessConstraint_1 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:389:2: ( (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint ) )
            // InternalAnalysisActivityDSL.g:390:2: (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint )
            {
            // InternalAnalysisActivityDSL.g:390:2: (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:391:3: this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getParameterReadinessConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterReadinessConstraint_0=ruleParameterReadinessConstraint();

                    state._fsp--;


                    			current = this_ParameterReadinessConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:400:3: this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint
                    {

                    			newCompositeNode(grammarAccess.getReadinessConstraintAccess().getDatasetReadinessConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasetReadinessConstraint_1=ruleDatasetReadinessConstraint();

                    state._fsp--;


                    			current = this_DatasetReadinessConstraint_1;
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
    // InternalAnalysisActivityDSL.g:412:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalAnalysisActivityDSL.g:412:45: (iv_ruleTool= ruleTool EOF )
            // InternalAnalysisActivityDSL.g:413:2: iv_ruleTool= ruleTool EOF
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
    // InternalAnalysisActivityDSL.g:419:1: ruleTool returns [EObject current=null] : this_CommandLineTool_0= ruleCommandLineTool ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_CommandLineTool_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:425:2: (this_CommandLineTool_0= ruleCommandLineTool )
            // InternalAnalysisActivityDSL.g:426:2: this_CommandLineTool_0= ruleCommandLineTool
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
    // InternalAnalysisActivityDSL.g:437:1: entryRuleCommandLineEntryList returns [EObject current=null] : iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF ;
    public final EObject entryRuleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:437:61: (iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:438:2: iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:444:1: ruleCommandLineEntryList returns [EObject current=null] : (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) ;
    public final EObject ruleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject this_ToolNameCommandLineEntry_0 = null;

        EObject this_LiteralCommandLineEntryList_1 = null;

        EObject this_DatasetCommandLineEntryList_2 = null;

        EObject this_ParameterCommandLineEntryList_3 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:450:2: ( (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:451:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:451:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 27:
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
                    // InternalAnalysisActivityDSL.g:452:3: this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry
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
                    // InternalAnalysisActivityDSL.g:461:3: this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:470:3: this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:479:3: this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList
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
    // InternalAnalysisActivityDSL.g:491:1: entryRuleStringListManipulator returns [EObject current=null] : iv_ruleStringListManipulator= ruleStringListManipulator EOF ;
    public final EObject entryRuleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringListManipulator = null;


        try {
            // InternalAnalysisActivityDSL.g:491:62: (iv_ruleStringListManipulator= ruleStringListManipulator EOF )
            // InternalAnalysisActivityDSL.g:492:2: iv_ruleStringListManipulator= ruleStringListManipulator EOF
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
    // InternalAnalysisActivityDSL.g:498:1: ruleStringListManipulator returns [EObject current=null] : (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) ;
    public final EObject ruleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_PrependEach_1 = null;

        EObject this_AppendEach_2 = null;

        EObject this_AppendListWith_3 = null;

        EObject this_PrependListWith_4 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:504:2: ( (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) )
            // InternalAnalysisActivityDSL.g:505:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            {
            // InternalAnalysisActivityDSL.g:505:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt12=1;
                }
                break;
            case 51:
                {
                alt12=2;
                }
                break;
            case 52:
                {
                alt12=3;
                }
                break;
            case 53:
                {
                alt12=4;
                }
                break;
            case 54:
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
                    // InternalAnalysisActivityDSL.g:506:3: this_Join_0= ruleJoin
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
                    // InternalAnalysisActivityDSL.g:515:3: this_PrependEach_1= rulePrependEach
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
                    // InternalAnalysisActivityDSL.g:524:3: this_AppendEach_2= ruleAppendEach
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
                    // InternalAnalysisActivityDSL.g:533:3: this_AppendListWith_3= ruleAppendListWith
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
                    // InternalAnalysisActivityDSL.g:542:3: this_PrependListWith_4= rulePrependListWith
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
    // InternalAnalysisActivityDSL.g:554:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAnalysisActivityDSL.g:554:47: (iv_ruleEString= ruleEString EOF )
            // InternalAnalysisActivityDSL.g:555:2: iv_ruleEString= ruleEString EOF
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
    // InternalAnalysisActivityDSL.g:561:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTILINE_STRING_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:567:2: ( (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // InternalAnalysisActivityDSL.g:568:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // InternalAnalysisActivityDSL.g:568:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
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
                    // InternalAnalysisActivityDSL.g:569:3: this_MULTILINE_STRING_0= RULE_MULTILINE_STRING
                    {
                    this_MULTILINE_STRING_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_2); 

                    			current.merge(this_MULTILINE_STRING_0);
                    		

                    			newLeafNode(this_MULTILINE_STRING_0, grammarAccess.getEStringAccess().getMULTILINE_STRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:577:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:585:3: this_ID_2= RULE_ID
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
    // InternalAnalysisActivityDSL.g:596:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAnalysisActivityDSL.g:596:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAnalysisActivityDSL.g:597:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAnalysisActivityDSL.g:603:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token otherlv_9=null;
        Token this_LIST_START_10=null;
        Token this_LIST_SEPARATOR_12=null;
        Token this_LIST_END_14=null;
        Token this_ENTITY_START_15=null;
        Token lv_remarks_17_0=null;
        Token this_STATEMENT_END_18=null;
        Token otherlv_19=null;
        Token this_LIST_START_20=null;
        Token this_LIST_SEPARATOR_22=null;
        Token this_LIST_END_24=null;
        Token this_ENTITY_END_25=null;
        Token this_STATEMENT_END_26=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_parameterType_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_13_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_constraints_23_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:609:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:610:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:610:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:611:3: otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:615:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:616:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:616:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:617:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:638:3: ( (lv_parameterType_3_0= ruleParameterType ) )
            // InternalAnalysisActivityDSL.g:639:4: (lv_parameterType_3_0= ruleParameterType )
            {
            // InternalAnalysisActivityDSL.g:639:4: (lv_parameterType_3_0= ruleParameterType )
            // InternalAnalysisActivityDSL.g:640:5: lv_parameterType_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeParameterTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_parameterType_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameterType",
            						lv_parameterType_3_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_23); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:661:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:662:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:662:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:663:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_minimumCardinality_5_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_5_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_23); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:684:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:685:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:685:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:686:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_maximumCardinality_7_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_7_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_26); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:707:3: (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:708:4: otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getEqualsSignKeyword_9_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:716:4: ( (lv_defaultValue_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:717:5: (lv_defaultValue_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:717:5: (lv_defaultValue_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:718:6: lv_defaultValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalAnalysisActivityDSL.g:735:4: (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_LIST_SEPARATOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:736:5: this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) )
                    	    {
                    	    this_LIST_SEPARATOR_12=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_3); 

                    	    					newLeafNode(this_LIST_SEPARATOR_12, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_9_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:740:5: ( (lv_defaultValue_13_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:741:6: (lv_defaultValue_13_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:741:6: (lv_defaultValue_13_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:742:7: lv_defaultValue_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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

                    this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_27); 

                    				newLeafNode(this_LIST_END_14, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_9_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:765:3: (this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ENTITY_START) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:766:4: this_ENTITY_START_15= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) ) this_ENTITY_END_25= RULE_ENTITY_END
                    {
                    this_ENTITY_START_15=(Token)match(input,RULE_ENTITY_START,FOLLOW_28); 

                    				newLeafNode(this_ENTITY_START_15, grammarAccess.getParameterAccess().getENTITY_STARTTerminalRuleCall_10_0());
                    			
                    // InternalAnalysisActivityDSL.g:770:4: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) ) )
                    // InternalAnalysisActivityDSL.g:771:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) )
                    {
                    // InternalAnalysisActivityDSL.g:771:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* ) )
                    // InternalAnalysisActivityDSL.g:772:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_10_1());
                    					
                    // InternalAnalysisActivityDSL.g:775:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )* )
                    // InternalAnalysisActivityDSL.g:776:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )*
                    {
                    // InternalAnalysisActivityDSL.g:776:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( LA17_0 == RULE_MULTILINE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 0) ) {
                            alt17=1;
                        }
                        else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 1) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:777:5: ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:777:5: ({...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:778:6: {...}? => ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 0)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:778:110: ( ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:779:7: ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 0);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:782:10: ({...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:782:11: {...}? => ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:782:20: ( ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:782:21: ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_18= RULE_STATEMENT_END
                    	    {
                    	    // InternalAnalysisActivityDSL.g:782:21: ( (lv_remarks_17_0= RULE_MULTILINE_STRING ) )
                    	    // InternalAnalysisActivityDSL.g:783:11: (lv_remarks_17_0= RULE_MULTILINE_STRING )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:783:11: (lv_remarks_17_0= RULE_MULTILINE_STRING )
                    	    // InternalAnalysisActivityDSL.g:784:12: lv_remarks_17_0= RULE_MULTILINE_STRING
                    	    {
                    	    lv_remarks_17_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_6); 

                    	    												newLeafNode(lv_remarks_17_0, grammarAccess.getParameterAccess().getRemarksMULTILINE_STRINGTerminalRuleCall_10_1_0_0_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getParameterRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"remarks",
                    	    													lv_remarks_17_0,
                    	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.MULTILINE_STRING");
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_18=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                    	    										newLeafNode(this_STATEMENT_END_18, grammarAccess.getParameterAccess().getSTATEMENT_ENDTerminalRuleCall_10_1_0_1());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_10_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:810:5: ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:810:5: ({...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:811:6: {...}? => ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 1)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:811:110: ( ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:812:7: ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_10_1(), 1);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:815:10: ({...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END ) )
                    	    // InternalAnalysisActivityDSL.g:815:11: {...}? => (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:815:20: (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )
                    	    // InternalAnalysisActivityDSL.g:815:21: otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END
                    	    {
                    	    otherlv_19=(Token)match(input,30,FOLLOW_15); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getParameterAccess().getConstraintsKeyword_10_1_1_0());
                    	    									
                    	    this_LIST_START_20=(Token)match(input,RULE_LIST_START,FOLLOW_29); 

                    	    										newLeafNode(this_LIST_START_20, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_10_1_1_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:823:10: ( (lv_constraints_21_0= ruleParameterConstraint ) )
                    	    // InternalAnalysisActivityDSL.g:824:11: (lv_constraints_21_0= ruleParameterConstraint )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:824:11: (lv_constraints_21_0= ruleParameterConstraint )
                    	    // InternalAnalysisActivityDSL.g:825:12: lv_constraints_21_0= ruleParameterConstraint
                    	    {

                    	    												newCompositeNode(grammarAccess.getParameterAccess().getConstraintsParameterConstraintParserRuleCall_10_1_1_2_0());
                    	    											
                    	    pushFollow(FOLLOW_17);
                    	    lv_constraints_21_0=ruleParameterConstraint();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    												}
                    	    												add(
                    	    													current,
                    	    													"constraints",
                    	    													lv_constraints_21_0,
                    	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ParameterConstraint");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    // InternalAnalysisActivityDSL.g:842:10: (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )*
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==RULE_LIST_SEPARATOR) ) {
                    	            alt16=1;
                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // InternalAnalysisActivityDSL.g:843:11: this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) )
                    	    	    {
                    	    	    this_LIST_SEPARATOR_22=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_29); 

                    	    	    											newLeafNode(this_LIST_SEPARATOR_22, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_10_1_1_3_0());
                    	    	    										
                    	    	    // InternalAnalysisActivityDSL.g:847:11: ( (lv_constraints_23_0= ruleParameterConstraint ) )
                    	    	    // InternalAnalysisActivityDSL.g:848:12: (lv_constraints_23_0= ruleParameterConstraint )
                    	    	    {
                    	    	    // InternalAnalysisActivityDSL.g:848:12: (lv_constraints_23_0= ruleParameterConstraint )
                    	    	    // InternalAnalysisActivityDSL.g:849:13: lv_constraints_23_0= ruleParameterConstraint
                    	    	    {

                    	    	    													newCompositeNode(grammarAccess.getParameterAccess().getConstraintsParameterConstraintParserRuleCall_10_1_1_3_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_17);
                    	    	    lv_constraints_23_0=ruleParameterConstraint();

                    	    	    state._fsp--;


                    	    	    													if (current==null) {
                    	    	    														current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    	    													}
                    	    	    													add(
                    	    	    														current,
                    	    	    														"constraints",
                    	    	    														lv_constraints_23_0,
                    	    	    														"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ParameterConstraint");
                    	    	    													afterParserOrEnumRuleCall();
                    	    	    												

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop16;
                    	        }
                    	    } while (true);

                    	    this_LIST_END_24=(Token)match(input,RULE_LIST_END,FOLLOW_28); 

                    	    										newLeafNode(this_LIST_END_24, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_10_1_1_4());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_10_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_10_1());
                    					

                    }

                    this_ENTITY_END_25=(Token)match(input,RULE_ENTITY_END,FOLLOW_6); 

                    				newLeafNode(this_ENTITY_END_25, grammarAccess.getParameterAccess().getENTITY_ENDTerminalRuleCall_10_2());
                    			

                    }
                    break;

            }

            this_STATEMENT_END_26=(Token)match(input,RULE_STATEMENT_END,FOLLOW_2); 

            			newLeafNode(this_STATEMENT_END_26, grammarAccess.getParameterAccess().getSTATEMENT_ENDTerminalRuleCall_11());
            		

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
    // InternalAnalysisActivityDSL.g:897:1: entryRuleInputDataset returns [EObject current=null] : iv_ruleInputDataset= ruleInputDataset EOF ;
    public final EObject entryRuleInputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:897:53: (iv_ruleInputDataset= ruleInputDataset EOF )
            // InternalAnalysisActivityDSL.g:898:2: iv_ruleInputDataset= ruleInputDataset EOF
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
    // InternalAnalysisActivityDSL.g:904:1: ruleInputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
    public final EObject ruleInputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token lv_remarks_11_0=null;
        Token this_STATEMENT_END_12=null;
        Token otherlv_13=null;
        Token this_LIST_START_14=null;
        Token this_LIST_SEPARATOR_16=null;
        Token this_LIST_END_18=null;
        Token this_STATEMENT_END_19=null;
        Token this_ENTITY_END_20=null;
        Token this_STATEMENT_END_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_17_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:910:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:911:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:911:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:912:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:916:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:917:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:917:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:918:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:939:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_MULTILINE_STRING||(LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:940:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:940:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:941:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getInputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_mimetype_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                    					}
                    					set(
                    						current,
                    						"mimetype",
                    						lv_mimetype_3_0,
                    						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_23); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:962:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:963:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:963:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:964:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_minimumCardinality_5_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_5_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_23); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:985:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:986:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:986:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:987:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_maximumCardinality_7_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_7_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_27); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1008:3: (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ENTITY_START) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1009:4: this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_28); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getInputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:1013:4: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_MULTILINE_STRING||LA22_0==30) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1014:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) )
                            {
                            // InternalAnalysisActivityDSL.g:1014:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) )
                            // InternalAnalysisActivityDSL.g:1015:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?)
                            {
                             
                            					  getUnorderedGroupHelper().enter(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1());
                            					
                            // InternalAnalysisActivityDSL.g:1018:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?)
                            // InternalAnalysisActivityDSL.g:1019:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?
                            {
                            // InternalAnalysisActivityDSL.g:1019:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=3;
                                int LA21_0 = input.LA(1);

                                if ( LA21_0 == RULE_MULTILINE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 0) ) {
                                    alt21=1;
                                }
                                else if ( LA21_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 1) ) {
                                    alt21=2;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:1020:5: ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1020:5: ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                            	    // InternalAnalysisActivityDSL.g:1021:6: {...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleInputDataset", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 0)");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1021:112: ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                            	    // InternalAnalysisActivityDSL.g:1022:7: ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 0);
                            	    						
                            	    // InternalAnalysisActivityDSL.g:1025:10: ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                            	    // InternalAnalysisActivityDSL.g:1025:11: {...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleInputDataset", "true");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1025:20: ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                            	    // InternalAnalysisActivityDSL.g:1025:21: ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1025:21: ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) )
                            	    // InternalAnalysisActivityDSL.g:1026:11: (lv_remarks_11_0= RULE_MULTILINE_STRING )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1026:11: (lv_remarks_11_0= RULE_MULTILINE_STRING )
                            	    // InternalAnalysisActivityDSL.g:1027:12: lv_remarks_11_0= RULE_MULTILINE_STRING
                            	    {
                            	    lv_remarks_11_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_6); 

                            	    												newLeafNode(lv_remarks_11_0, grammarAccess.getInputDatasetAccess().getRemarksMULTILINE_STRINGTerminalRuleCall_9_1_0_0_0());
                            	    											

                            	    												if (current==null) {
                            	    													current = createModelElement(grammarAccess.getInputDatasetRule());
                            	    												}
                            	    												setWithLastConsumed(
                            	    													current,
                            	    													"remarks",
                            	    													lv_remarks_11_0,
                            	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.MULTILINE_STRING");
                            	    											

                            	    }


                            	    }

                            	    this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            	    										newLeafNode(this_STATEMENT_END_12, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_0_1());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalAnalysisActivityDSL.g:1053:5: ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1053:5: ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                            	    // InternalAnalysisActivityDSL.g:1054:6: {...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleInputDataset", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 1)");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1054:112: ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                            	    // InternalAnalysisActivityDSL.g:1055:7: ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1(), 1);
                            	    						
                            	    // InternalAnalysisActivityDSL.g:1058:10: ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                            	    // InternalAnalysisActivityDSL.g:1058:11: {...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleInputDataset", "true");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1058:20: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )
                            	    // InternalAnalysisActivityDSL.g:1058:21: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            	    {
                            	    otherlv_13=(Token)match(input,30,FOLLOW_15); 

                            	    										newLeafNode(otherlv_13, grammarAccess.getInputDatasetAccess().getConstraintsKeyword_9_1_1_0());
                            	    									
                            	    this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_31); 

                            	    										newLeafNode(this_LIST_START_14, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_9_1_1_1());
                            	    									
                            	    // InternalAnalysisActivityDSL.g:1066:10: ( (lv_constraints_15_0= ruleDatasetConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:1067:11: (lv_constraints_15_0= ruleDatasetConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1067:11: (lv_constraints_15_0= ruleDatasetConstraint )
                            	    // InternalAnalysisActivityDSL.g:1068:12: lv_constraints_15_0= ruleDatasetConstraint
                            	    {

                            	    												newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_1_1_2_0());
                            	    											
                            	    pushFollow(FOLLOW_17);
                            	    lv_constraints_15_0=ruleDatasetConstraint();

                            	    state._fsp--;


                            	    												if (current==null) {
                            	    													current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                            	    												}
                            	    												add(
                            	    													current,
                            	    													"constraints",
                            	    													lv_constraints_15_0,
                            	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.DatasetConstraint");
                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    // InternalAnalysisActivityDSL.g:1085:10: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )*
                            	    loop20:
                            	    do {
                            	        int alt20=2;
                            	        int LA20_0 = input.LA(1);

                            	        if ( (LA20_0==RULE_LIST_SEPARATOR) ) {
                            	            alt20=1;
                            	        }


                            	        switch (alt20) {
                            	    	case 1 :
                            	    	    // InternalAnalysisActivityDSL.g:1086:11: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    	    {
                            	    	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_31); 

                            	    	    											newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_1_1_3_0());
                            	    	    										
                            	    	    // InternalAnalysisActivityDSL.g:1090:11: ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    	    // InternalAnalysisActivityDSL.g:1091:12: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    	    {
                            	    	    // InternalAnalysisActivityDSL.g:1091:12: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    	    // InternalAnalysisActivityDSL.g:1092:13: lv_constraints_17_0= ruleDatasetConstraint
                            	    	    {

                            	    	    													newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_1_1_3_1_0());
                            	    	    												
                            	    	    pushFollow(FOLLOW_17);
                            	    	    lv_constraints_17_0=ruleDatasetConstraint();

                            	    	    state._fsp--;


                            	    	    													if (current==null) {
                            	    	    														current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                            	    	    													}
                            	    	    													add(
                            	    	    														current,
                            	    	    														"constraints",
                            	    	    														lv_constraints_17_0,
                            	    	    														"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.DatasetConstraint");
                            	    	    													afterParserOrEnumRuleCall();
                            	    	    												

                            	    	    }


                            	    	    }


                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop20;
                            	        }
                            	    } while (true);

                            	    this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_6); 

                            	    										newLeafNode(this_LIST_END_18, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_9_1_1_4());
                            	    									
                            	    this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            	    										newLeafNode(this_STATEMENT_END_19, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_1_5());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt21 >= 1 ) break loop21;
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);

                            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1()) ) {
                                throw new FailedPredicateException(input, "ruleInputDataset", "getUnorderedGroupHelper().canLeave(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1())");
                            }

                            }


                            }

                             
                            					  getUnorderedGroupHelper().leave(grammarAccess.getInputDatasetAccess().getUnorderedGroup_9_1());
                            					

                            }
                            break;

                    }

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_6); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getInputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_2());
                    			

                    }
                    break;

            }

            this_STATEMENT_END_21=(Token)match(input,RULE_STATEMENT_END,FOLLOW_2); 

            			newLeafNode(this_STATEMENT_END_21, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_10());
            		

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
    // InternalAnalysisActivityDSL.g:1145:1: entryRuleOutputDataset returns [EObject current=null] : iv_ruleOutputDataset= ruleOutputDataset EOF ;
    public final EObject entryRuleOutputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:1145:54: (iv_ruleOutputDataset= ruleOutputDataset EOF )
            // InternalAnalysisActivityDSL.g:1146:2: iv_ruleOutputDataset= ruleOutputDataset EOF
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
    // InternalAnalysisActivityDSL.g:1152:1: ruleOutputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
    public final EObject ruleOutputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token lv_remarks_11_0=null;
        Token this_STATEMENT_END_12=null;
        Token otherlv_13=null;
        Token this_LIST_START_14=null;
        Token this_LIST_SEPARATOR_16=null;
        Token this_LIST_END_18=null;
        Token this_STATEMENT_END_19=null;
        Token this_ENTITY_END_20=null;
        Token this_STATEMENT_END_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_17_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1158:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:1159:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:1159:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:1160:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1164:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1165:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1165:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1166:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1187:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_MULTILINE_STRING||(LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1188:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1188:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1189:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_mimetype_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                    					}
                    					set(
                    						current,
                    						"mimetype",
                    						lv_mimetype_3_0,
                    						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_23); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:1210:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1211:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1211:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1212:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_minimumCardinality_5_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"minimumCardinality",
            						lv_minimumCardinality_5_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_23); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1233:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1234:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1234:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1235:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_maximumCardinality_7_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"maximumCardinality",
            						lv_maximumCardinality_7_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_27); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1256:3: (this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ENTITY_START) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1257:4: this_ENTITY_START_9= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_28); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getOutputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:1261:4: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_MULTILINE_STRING||LA27_0==30) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1262:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) )
                            {
                            // InternalAnalysisActivityDSL.g:1262:5: ( ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?) )
                            // InternalAnalysisActivityDSL.g:1263:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?)
                            {
                             
                            					  getUnorderedGroupHelper().enter(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1());
                            					
                            // InternalAnalysisActivityDSL.g:1266:6: ( ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?)
                            // InternalAnalysisActivityDSL.g:1267:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+ {...}?
                            {
                            // InternalAnalysisActivityDSL.g:1267:7: ( ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=3;
                                int LA26_0 = input.LA(1);

                                if ( LA26_0 == RULE_MULTILINE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 0) ) {
                                    alt26=1;
                                }
                                else if ( LA26_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 1) ) {
                                    alt26=2;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:1268:5: ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1268:5: ({...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                            	    // InternalAnalysisActivityDSL.g:1269:6: {...}? => ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleOutputDataset", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 0)");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1269:113: ( ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                            	    // InternalAnalysisActivityDSL.g:1270:7: ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 0);
                            	    						
                            	    // InternalAnalysisActivityDSL.g:1273:10: ({...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                            	    // InternalAnalysisActivityDSL.g:1273:11: {...}? => ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleOutputDataset", "true");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1273:20: ( ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                            	    // InternalAnalysisActivityDSL.g:1273:21: ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1273:21: ( (lv_remarks_11_0= RULE_MULTILINE_STRING ) )
                            	    // InternalAnalysisActivityDSL.g:1274:11: (lv_remarks_11_0= RULE_MULTILINE_STRING )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1274:11: (lv_remarks_11_0= RULE_MULTILINE_STRING )
                            	    // InternalAnalysisActivityDSL.g:1275:12: lv_remarks_11_0= RULE_MULTILINE_STRING
                            	    {
                            	    lv_remarks_11_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_6); 

                            	    												newLeafNode(lv_remarks_11_0, grammarAccess.getOutputDatasetAccess().getRemarksMULTILINE_STRINGTerminalRuleCall_9_1_0_0_0());
                            	    											

                            	    												if (current==null) {
                            	    													current = createModelElement(grammarAccess.getOutputDatasetRule());
                            	    												}
                            	    												setWithLastConsumed(
                            	    													current,
                            	    													"remarks",
                            	    													lv_remarks_11_0,
                            	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.MULTILINE_STRING");
                            	    											

                            	    }


                            	    }

                            	    this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            	    										newLeafNode(this_STATEMENT_END_12, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_0_1());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalAnalysisActivityDSL.g:1301:5: ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1301:5: ({...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                            	    // InternalAnalysisActivityDSL.g:1302:6: {...}? => ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleOutputDataset", "getUnorderedGroupHelper().canSelect(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 1)");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1302:113: ( ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                            	    // InternalAnalysisActivityDSL.g:1303:7: ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                            	    {

                            	    							getUnorderedGroupHelper().select(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1(), 1);
                            	    						
                            	    // InternalAnalysisActivityDSL.g:1306:10: ({...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                            	    // InternalAnalysisActivityDSL.g:1306:11: {...}? => (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleOutputDataset", "true");
                            	    }
                            	    // InternalAnalysisActivityDSL.g:1306:20: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )
                            	    // InternalAnalysisActivityDSL.g:1306:21: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            	    {
                            	    otherlv_13=(Token)match(input,30,FOLLOW_15); 

                            	    										newLeafNode(otherlv_13, grammarAccess.getOutputDatasetAccess().getConstraintsKeyword_9_1_1_0());
                            	    									
                            	    this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_31); 

                            	    										newLeafNode(this_LIST_START_14, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_9_1_1_1());
                            	    									
                            	    // InternalAnalysisActivityDSL.g:1314:10: ( (lv_constraints_15_0= ruleDatasetConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:1315:11: (lv_constraints_15_0= ruleDatasetConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1315:11: (lv_constraints_15_0= ruleDatasetConstraint )
                            	    // InternalAnalysisActivityDSL.g:1316:12: lv_constraints_15_0= ruleDatasetConstraint
                            	    {

                            	    												newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_1_1_2_0());
                            	    											
                            	    pushFollow(FOLLOW_17);
                            	    lv_constraints_15_0=ruleDatasetConstraint();

                            	    state._fsp--;


                            	    												if (current==null) {
                            	    													current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                            	    												}
                            	    												add(
                            	    													current,
                            	    													"constraints",
                            	    													lv_constraints_15_0,
                            	    													"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.DatasetConstraint");
                            	    												afterParserOrEnumRuleCall();
                            	    											

                            	    }


                            	    }

                            	    // InternalAnalysisActivityDSL.g:1333:10: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )*
                            	    loop25:
                            	    do {
                            	        int alt25=2;
                            	        int LA25_0 = input.LA(1);

                            	        if ( (LA25_0==RULE_LIST_SEPARATOR) ) {
                            	            alt25=1;
                            	        }


                            	        switch (alt25) {
                            	    	case 1 :
                            	    	    // InternalAnalysisActivityDSL.g:1334:11: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    	    {
                            	    	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_31); 

                            	    	    											newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_1_1_3_0());
                            	    	    										
                            	    	    // InternalAnalysisActivityDSL.g:1338:11: ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    	    // InternalAnalysisActivityDSL.g:1339:12: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    	    {
                            	    	    // InternalAnalysisActivityDSL.g:1339:12: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    	    // InternalAnalysisActivityDSL.g:1340:13: lv_constraints_17_0= ruleDatasetConstraint
                            	    	    {

                            	    	    													newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_1_1_3_1_0());
                            	    	    												
                            	    	    pushFollow(FOLLOW_17);
                            	    	    lv_constraints_17_0=ruleDatasetConstraint();

                            	    	    state._fsp--;


                            	    	    													if (current==null) {
                            	    	    														current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                            	    	    													}
                            	    	    													add(
                            	    	    														current,
                            	    	    														"constraints",
                            	    	    														lv_constraints_17_0,
                            	    	    														"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.DatasetConstraint");
                            	    	    													afterParserOrEnumRuleCall();
                            	    	    												

                            	    	    }


                            	    	    }


                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop25;
                            	        }
                            	    } while (true);

                            	    this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_6); 

                            	    										newLeafNode(this_LIST_END_18, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_9_1_1_4());
                            	    									
                            	    this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            	    										newLeafNode(this_STATEMENT_END_19, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_1_5());
                            	    									

                            	    }


                            	    }

                            	     
                            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1());
                            	    						

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt26 >= 1 ) break loop26;
                                        EarlyExitException eee =
                                            new EarlyExitException(26, input);
                                        throw eee;
                                }
                                cnt26++;
                            } while (true);

                            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1()) ) {
                                throw new FailedPredicateException(input, "ruleOutputDataset", "getUnorderedGroupHelper().canLeave(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1())");
                            }

                            }


                            }

                             
                            					  getUnorderedGroupHelper().leave(grammarAccess.getOutputDatasetAccess().getUnorderedGroup_9_1());
                            					

                            }
                            break;

                    }

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_6); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getOutputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_2());
                    			

                    }
                    break;

            }

            this_STATEMENT_END_21=(Token)match(input,RULE_STATEMENT_END,FOLLOW_2); 

            			newLeafNode(this_STATEMENT_END_21, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_10());
            		

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
    // InternalAnalysisActivityDSL.g:1393:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalAnalysisActivityDSL.g:1393:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalAnalysisActivityDSL.g:1394:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalAnalysisActivityDSL.g:1400:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1406:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAnalysisActivityDSL.g:1407:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAnalysisActivityDSL.g:1407:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAnalysisActivityDSL.g:1408:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAnalysisActivityDSL.g:1408:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1409:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32); 

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


    // $ANTLR start "entryRuleParameterConstraint"
    // InternalAnalysisActivityDSL.g:1426:1: entryRuleParameterConstraint returns [EObject current=null] : iv_ruleParameterConstraint= ruleParameterConstraint EOF ;
    public final EObject entryRuleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1426:60: (iv_ruleParameterConstraint= ruleParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1427:2: iv_ruleParameterConstraint= ruleParameterConstraint EOF
            {
             newCompositeNode(grammarAccess.getParameterConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterConstraint=ruleParameterConstraint();

            state._fsp--;

             current =iv_ruleParameterConstraint; 
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
    // $ANTLR end "entryRuleParameterConstraint"


    // $ANTLR start "ruleParameterConstraint"
    // InternalAnalysisActivityDSL.g:1433:1: ruleParameterConstraint returns [EObject current=null] : this_CustomParameterConstraint_0= ruleCustomParameterConstraint ;
    public final EObject ruleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomParameterConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1439:2: (this_CustomParameterConstraint_0= ruleCustomParameterConstraint )
            // InternalAnalysisActivityDSL.g:1440:2: this_CustomParameterConstraint_0= ruleCustomParameterConstraint
            {

            		newCompositeNode(grammarAccess.getParameterConstraintAccess().getCustomParameterConstraintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CustomParameterConstraint_0=ruleCustomParameterConstraint();

            state._fsp--;


            		current = this_CustomParameterConstraint_0;
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
    // $ANTLR end "ruleParameterConstraint"


    // $ANTLR start "entryRuleCustomParameterConstraint"
    // InternalAnalysisActivityDSL.g:1451:1: entryRuleCustomParameterConstraint returns [EObject current=null] : iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF ;
    public final EObject entryRuleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1451:66: (iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1452:2: iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1458:1: ruleCustomParameterConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) ;
    public final EObject ruleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token this_ENTITY_END_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1464:2: ( (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:1465:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:1465:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:1466:3: otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterConstraintAccess().getCustomParameterConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1470:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1471:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1471:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1472:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomParameterConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalAnalysisActivityDSL.g:1489:3: (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ENTITY_START) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1490:4: this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END
                    {
                    this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_20); 

                    				newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomParameterConstraintAccess().getENTITY_STARTTerminalRuleCall_2_0());
                    			
                    this_ENTITY_END_3=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

                    				newLeafNode(this_ENTITY_END_3, grammarAccess.getCustomParameterConstraintAccess().getENTITY_ENDTerminalRuleCall_2_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleCustomParameterConstraint"


    // $ANTLR start "entryRuleDatasetConstraint"
    // InternalAnalysisActivityDSL.g:1503:1: entryRuleDatasetConstraint returns [EObject current=null] : iv_ruleDatasetConstraint= ruleDatasetConstraint EOF ;
    public final EObject entryRuleDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1503:58: (iv_ruleDatasetConstraint= ruleDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1504:2: iv_ruleDatasetConstraint= ruleDatasetConstraint EOF
            {
             newCompositeNode(grammarAccess.getDatasetConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetConstraint=ruleDatasetConstraint();

            state._fsp--;

             current =iv_ruleDatasetConstraint; 
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
    // $ANTLR end "entryRuleDatasetConstraint"


    // $ANTLR start "ruleDatasetConstraint"
    // InternalAnalysisActivityDSL.g:1510:1: ruleDatasetConstraint returns [EObject current=null] : this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint ;
    public final EObject ruleDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomDatasetConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1516:2: (this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint )
            // InternalAnalysisActivityDSL.g:1517:2: this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint
            {

            		newCompositeNode(grammarAccess.getDatasetConstraintAccess().getCustomDatasetConstraintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CustomDatasetConstraint_0=ruleCustomDatasetConstraint();

            state._fsp--;


            		current = this_CustomDatasetConstraint_0;
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
    // $ANTLR end "ruleDatasetConstraint"


    // $ANTLR start "entryRuleCustomDatasetConstraint"
    // InternalAnalysisActivityDSL.g:1528:1: entryRuleCustomDatasetConstraint returns [EObject current=null] : iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF ;
    public final EObject entryRuleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1528:64: (iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1529:2: iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1535:1: ruleCustomDatasetConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) ;
    public final EObject ruleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token this_ENTITY_END_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1541:2: ( (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:1542:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:1542:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:1543:3: otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetConstraintAccess().getCustomDatasetConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1547:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1548:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1548:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1549:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDatasetConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalAnalysisActivityDSL.g:1566:3: (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ENTITY_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1567:4: this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END
                    {
                    this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_20); 

                    				newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomDatasetConstraintAccess().getENTITY_STARTTerminalRuleCall_2_0());
                    			
                    this_ENTITY_END_3=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

                    				newLeafNode(this_ENTITY_END_3, grammarAccess.getCustomDatasetConstraintAccess().getENTITY_ENDTerminalRuleCall_2_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleCustomDatasetConstraint"


    // $ANTLR start "entryRuleParameterReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1580:1: entryRuleParameterReadinessConstraint returns [EObject current=null] : iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF ;
    public final EObject entryRuleParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1580:69: (iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1581:2: iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF
            {
             newCompositeNode(grammarAccess.getParameterReadinessConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterReadinessConstraint=ruleParameterReadinessConstraint();

            state._fsp--;

             current =iv_ruleParameterReadinessConstraint; 
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
    // $ANTLR end "entryRuleParameterReadinessConstraint"


    // $ANTLR start "ruleParameterReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1587:1: ruleParameterReadinessConstraint returns [EObject current=null] : this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint ;
    public final EObject ruleParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomParameterReadinessConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1593:2: (this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint )
            // InternalAnalysisActivityDSL.g:1594:2: this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint
            {

            		newCompositeNode(grammarAccess.getParameterReadinessConstraintAccess().getCustomParameterReadinessConstraintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CustomParameterReadinessConstraint_0=ruleCustomParameterReadinessConstraint();

            state._fsp--;


            		current = this_CustomParameterReadinessConstraint_0;
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
    // $ANTLR end "ruleParameterReadinessConstraint"


    // $ANTLR start "entryRuleCustomParameterReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1605:1: entryRuleCustomParameterReadinessConstraint returns [EObject current=null] : iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF ;
    public final EObject entryRuleCustomParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1605:75: (iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1606:2: iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF
            {
             newCompositeNode(grammarAccess.getCustomParameterReadinessConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomParameterReadinessConstraint=ruleCustomParameterReadinessConstraint();

            state._fsp--;

             current =iv_ruleCustomParameterReadinessConstraint; 
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
    // $ANTLR end "entryRuleCustomParameterReadinessConstraint"


    // $ANTLR start "ruleCustomParameterReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1612:1: ruleCustomParameterReadinessConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1618:2: ( (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1619:2: (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1619:2: (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1620:3: otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterReadinessConstraintAccess().getCustomParameterReadinessConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1624:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1625:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1625:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1626:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomParameterReadinessConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomParameterReadinessConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_34); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomParameterReadinessConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomParameterReadinessConstraintAccess().getOnKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1651:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1652:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1652:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1653:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomParameterReadinessConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomParameterReadinessConstraintAccess().getParameterParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_END_5=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_5, grammarAccess.getCustomParameterReadinessConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleCustomParameterReadinessConstraint"


    // $ANTLR start "entryRuleDatasetReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1675:1: entryRuleDatasetReadinessConstraint returns [EObject current=null] : iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF ;
    public final EObject entryRuleDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1675:67: (iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1676:2: iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF
            {
             newCompositeNode(grammarAccess.getDatasetReadinessConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetReadinessConstraint=ruleDatasetReadinessConstraint();

            state._fsp--;

             current =iv_ruleDatasetReadinessConstraint; 
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
    // $ANTLR end "entryRuleDatasetReadinessConstraint"


    // $ANTLR start "ruleDatasetReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1682:1: ruleDatasetReadinessConstraint returns [EObject current=null] : this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint ;
    public final EObject ruleDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomDatasetReadinessConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1688:2: (this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint )
            // InternalAnalysisActivityDSL.g:1689:2: this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint
            {

            		newCompositeNode(grammarAccess.getDatasetReadinessConstraintAccess().getCustomDatasetReadinessConstraintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CustomDatasetReadinessConstraint_0=ruleCustomDatasetReadinessConstraint();

            state._fsp--;


            		current = this_CustomDatasetReadinessConstraint_0;
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
    // $ANTLR end "ruleDatasetReadinessConstraint"


    // $ANTLR start "entryRuleCustomDatasetReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1700:1: entryRuleCustomDatasetReadinessConstraint returns [EObject current=null] : iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF ;
    public final EObject entryRuleCustomDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1700:73: (iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1701:2: iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF
            {
             newCompositeNode(grammarAccess.getCustomDatasetReadinessConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDatasetReadinessConstraint=ruleCustomDatasetReadinessConstraint();

            state._fsp--;

             current =iv_ruleCustomDatasetReadinessConstraint; 
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
    // $ANTLR end "entryRuleCustomDatasetReadinessConstraint"


    // $ANTLR start "ruleCustomDatasetReadinessConstraint"
    // InternalAnalysisActivityDSL.g:1707:1: ruleCustomDatasetReadinessConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1713:2: ( (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1714:2: (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1714:2: (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1715:3: otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetReadinessConstraintAccess().getCustomDatasetReadinessConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1719:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1720:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1720:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1721:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomDatasetReadinessConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDatasetReadinessConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_34); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomDatasetReadinessConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDatasetReadinessConstraintAccess().getOnKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1746:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1747:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1747:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1748:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomDatasetReadinessConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomDatasetReadinessConstraintAccess().getDatasetDatasetCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_END_5=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_5, grammarAccess.getCustomDatasetReadinessConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleCustomDatasetReadinessConstraint"


    // $ANTLR start "entryRuleCommandLineTool"
    // InternalAnalysisActivityDSL.g:1770:1: entryRuleCommandLineTool returns [EObject current=null] : iv_ruleCommandLineTool= ruleCommandLineTool EOF ;
    public final EObject entryRuleCommandLineTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineTool = null;


        try {
            // InternalAnalysisActivityDSL.g:1770:56: (iv_ruleCommandLineTool= ruleCommandLineTool EOF )
            // InternalAnalysisActivityDSL.g:1771:2: iv_ruleCommandLineTool= ruleCommandLineTool EOF
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
    // InternalAnalysisActivityDSL.g:1777:1: ruleCommandLineTool returns [EObject current=null] : (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'commandLineTemplate' this_LIST_START_22= RULE_LIST_START ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )* this_LIST_END_26= RULE_LIST_END (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )? this_ENTITY_END_32= RULE_ENTITY_END ) ;
    public final EObject ruleCommandLineTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_ENTITY_START_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_STATEMENT_END_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_STATEMENT_END_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_STATEMENT_END_19=null;
        Token this_ENTITY_END_20=null;
        Token otherlv_21=null;
        Token this_LIST_START_22=null;
        Token this_LIST_SEPARATOR_24=null;
        Token this_LIST_END_26=null;
        Token otherlv_27=null;
        Token this_ENTITY_START_28=null;
        Token this_ENTITY_END_31=null;
        Token this_ENTITY_END_32=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_executablePath_4_0 = null;

        EObject lv_commandLineTemplate_23_0 = null;

        EObject lv_commandLineTemplate_25_0 = null;

        EObject lv_exitCodes_29_0 = null;

        EObject lv_exitCodes_30_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1783:2: ( (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'commandLineTemplate' this_LIST_START_22= RULE_LIST_START ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )* this_LIST_END_26= RULE_LIST_END (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )? this_ENTITY_END_32= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1784:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'commandLineTemplate' this_LIST_START_22= RULE_LIST_START ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )* this_LIST_END_26= RULE_LIST_END (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )? this_ENTITY_END_32= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1784:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'commandLineTemplate' this_LIST_START_22= RULE_LIST_START ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )* this_LIST_END_26= RULE_LIST_END (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )? this_ENTITY_END_32= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1785:3: otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'commandLineTemplate' this_LIST_START_22= RULE_LIST_START ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )* this_LIST_END_26= RULE_LIST_END (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )? this_ENTITY_END_32= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLineToolAccess().getExecutableKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1789:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1790:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1790:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1791:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_35); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:1812:3: (otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1813:4: otherlv_3= 'path' ( (lv_executablePath_4_0= ruleFilePath ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandLineToolAccess().getPathKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:1817:4: ( (lv_executablePath_4_0= ruleFilePath ) )
                    // InternalAnalysisActivityDSL.g:1818:5: (lv_executablePath_4_0= ruleFilePath )
                    {
                    // InternalAnalysisActivityDSL.g:1818:5: (lv_executablePath_4_0= ruleFilePath )
                    // InternalAnalysisActivityDSL.g:1819:6: lv_executablePath_4_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExecutablePathFilePathParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalAnalysisActivityDSL.g:1837:3: (otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1838:4: otherlv_5= 'redirecting' this_ENTITY_START_6= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandLineToolAccess().getRedirectingKeyword_4_0());
                    			
                    this_ENTITY_START_6=(Token)match(input,RULE_ENTITY_START,FOLLOW_37); 

                    				newLeafNode(this_ENTITY_START_6, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:1846:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) ) )
                    // InternalAnalysisActivityDSL.g:1847:5: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) )
                    {
                    // InternalAnalysisActivityDSL.g:1847:5: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* ) )
                    // InternalAnalysisActivityDSL.g:1848:6: ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					
                    // InternalAnalysisActivityDSL.g:1851:6: ( ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )* )
                    // InternalAnalysisActivityDSL.g:1852:7: ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )*
                    {
                    // InternalAnalysisActivityDSL.g:1852:7: ( ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) ) )*
                    loop33:
                    do {
                        int alt33=4;
                        int LA33_0 = input.LA(1);

                        if ( LA33_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                            alt33=1;
                        }
                        else if ( LA33_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                            alt33=2;
                        }
                        else if ( LA33_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                            alt33=3;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1853:5: ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1853:5: ({...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1854:6: {...}? => ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1854:115: ( ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1855:7: ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1858:10: ({...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1858:11: {...}? => (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1858:20: (otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1858:21: otherlv_8= 'stdin' otherlv_9= 'from' ( ( ruleEString ) ) this_STATEMENT_END_11= RULE_STATEMENT_END
                    	    {
                    	    otherlv_8=(Token)match(input,40,FOLLOW_38); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getCommandLineToolAccess().getStdinKeyword_4_2_0_0());
                    	    									
                    	    otherlv_9=(Token)match(input,41,FOLLOW_3); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getCommandLineToolAccess().getFromKeyword_4_2_0_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1866:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1867:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1867:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1868:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardInputStreamInputDatasetCrossReference_4_2_0_2_0());
                    	    											
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_11=(Token)match(input,RULE_STATEMENT_END,FOLLOW_37); 

                    	    										newLeafNode(this_STATEMENT_END_11, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_0_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:1892:5: ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1892:5: ({...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1893:6: {...}? => ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1893:115: ( ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1894:7: ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1897:10: ({...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1897:11: {...}? => (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1897:20: (otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1897:21: otherlv_12= 'stdout' otherlv_13= 'to' ( ( ruleEString ) ) this_STATEMENT_END_15= RULE_STATEMENT_END
                    	    {
                    	    otherlv_12=(Token)match(input,42,FOLLOW_39); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getCommandLineToolAccess().getStdoutKeyword_4_2_1_0());
                    	    									
                    	    otherlv_13=(Token)match(input,43,FOLLOW_3); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_1_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1905:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1906:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1906:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1907:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardOutputStreamOutputDatasetCrossReference_4_2_1_2_0());
                    	    											
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_15=(Token)match(input,RULE_STATEMENT_END,FOLLOW_37); 

                    	    										newLeafNode(this_STATEMENT_END_15, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_1_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAnalysisActivityDSL.g:1931:5: ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1931:5: ({...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1932:6: {...}? => ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1932:115: ( ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1933:7: ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1936:10: ({...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1936:11: {...}? => (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1936:20: (otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1936:21: otherlv_16= 'stderr' otherlv_17= 'to' ( ( ruleEString ) ) this_STATEMENT_END_19= RULE_STATEMENT_END
                    	    {
                    	    otherlv_16=(Token)match(input,44,FOLLOW_39); 

                    	    										newLeafNode(otherlv_16, grammarAccess.getCommandLineToolAccess().getStderrKeyword_4_2_2_0());
                    	    									
                    	    otherlv_17=(Token)match(input,43,FOLLOW_3); 

                    	    										newLeafNode(otherlv_17, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_2_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1944:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1945:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1945:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1946:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardErrorStreamOutputDatasetCrossReference_4_2_2_2_0());
                    	    											
                    	    pushFollow(FOLLOW_6);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_37); 

                    	    										newLeafNode(this_STATEMENT_END_19, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_2_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					

                    }

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_40); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,45,FOLLOW_15); 

            			newLeafNode(otherlv_21, grammarAccess.getCommandLineToolAccess().getCommandLineTemplateKeyword_5());
            		
            this_LIST_START_22=(Token)match(input,RULE_LIST_START,FOLLOW_41); 

            			newLeafNode(this_LIST_START_22, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1990:3: ( (lv_commandLineTemplate_23_0= ruleCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:1991:4: (lv_commandLineTemplate_23_0= ruleCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:1991:4: (lv_commandLineTemplate_23_0= ruleCommandLineEntryList )
            // InternalAnalysisActivityDSL.g:1992:5: lv_commandLineTemplate_23_0= ruleCommandLineEntryList
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_commandLineTemplate_23_0=ruleCommandLineEntryList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            					}
            					add(
            						current,
            						"commandLineTemplate",
            						lv_commandLineTemplate_23_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2009:3: (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_LIST_SEPARATOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2010:4: this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) )
            	    {
            	    this_LIST_SEPARATOR_24=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_41); 

            	    				newLeafNode(this_LIST_SEPARATOR_24, grammarAccess.getCommandLineToolAccess().getLIST_SEPARATORTerminalRuleCall_8_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2014:4: ( (lv_commandLineTemplate_25_0= ruleCommandLineEntryList ) )
            	    // InternalAnalysisActivityDSL.g:2015:5: (lv_commandLineTemplate_25_0= ruleCommandLineEntryList )
            	    {
            	    // InternalAnalysisActivityDSL.g:2015:5: (lv_commandLineTemplate_25_0= ruleCommandLineEntryList )
            	    // InternalAnalysisActivityDSL.g:2016:6: lv_commandLineTemplate_25_0= ruleCommandLineEntryList
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_commandLineTemplate_25_0=ruleCommandLineEntryList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commandLineTemplate",
            	    							lv_commandLineTemplate_25_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_LIST_END_26=(Token)match(input,RULE_LIST_END,FOLLOW_42); 

            			newLeafNode(this_LIST_END_26, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_9());
            		
            // InternalAnalysisActivityDSL.g:2038:3: (otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2039:4: otherlv_27= 'returns' this_ENTITY_START_28= RULE_ENTITY_START ( (lv_exitCodes_29_0= ruleExitCode ) ) ( (lv_exitCodes_30_0= ruleExitCode ) )* this_ENTITY_END_31= RULE_ENTITY_END
                    {
                    otherlv_27=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getCommandLineToolAccess().getReturnsKeyword_10_0());
                    			
                    this_ENTITY_START_28=(Token)match(input,RULE_ENTITY_START,FOLLOW_23); 

                    				newLeafNode(this_ENTITY_START_28, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_10_1());
                    			
                    // InternalAnalysisActivityDSL.g:2047:4: ( (lv_exitCodes_29_0= ruleExitCode ) )
                    // InternalAnalysisActivityDSL.g:2048:5: (lv_exitCodes_29_0= ruleExitCode )
                    {
                    // InternalAnalysisActivityDSL.g:2048:5: (lv_exitCodes_29_0= ruleExitCode )
                    // InternalAnalysisActivityDSL.g:2049:6: lv_exitCodes_29_0= ruleExitCode
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_exitCodes_29_0=ruleExitCode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    						}
                    						add(
                    							current,
                    							"exitCodes",
                    							lv_exitCodes_29_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:2066:4: ( (lv_exitCodes_30_0= ruleExitCode ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_INT||LA36_0==32) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2067:5: (lv_exitCodes_30_0= ruleExitCode )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2067:5: (lv_exitCodes_30_0= ruleExitCode )
                    	    // InternalAnalysisActivityDSL.g:2068:6: lv_exitCodes_30_0= ruleExitCode
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
                    	    lv_exitCodes_30_0=ruleExitCode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exitCodes",
                    	    							lv_exitCodes_30_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    this_ENTITY_END_31=(Token)match(input,RULE_ENTITY_END,FOLLOW_20); 

                    				newLeafNode(this_ENTITY_END_31, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_10_4());
                    			

                    }
                    break;

            }

            this_ENTITY_END_32=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_32, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_11());
            		

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
    // InternalAnalysisActivityDSL.g:2098:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalAnalysisActivityDSL.g:2098:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalAnalysisActivityDSL.g:2099:2: iv_ruleFilePath= ruleFilePath EOF
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
    // InternalAnalysisActivityDSL.g:2105:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2111:2: (this_EString_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2112:2: this_EString_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2125:1: entryRuleExitCode returns [EObject current=null] : iv_ruleExitCode= ruleExitCode EOF ;
    public final EObject entryRuleExitCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitCode = null;


        try {
            // InternalAnalysisActivityDSL.g:2125:49: (iv_ruleExitCode= ruleExitCode EOF )
            // InternalAnalysisActivityDSL.g:2126:2: iv_ruleExitCode= ruleExitCode EOF
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
    // InternalAnalysisActivityDSL.g:2132:1: ruleExitCode returns [EObject current=null] : ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) ;
    public final EObject ruleExitCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STATEMENT_END_4=null;
        AntlrDatatypeRuleToken lv_code_0_0 = null;

        Enumerator lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_reportMessage_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2138:2: ( ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:2139:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:2139:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:2140:3: ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END
            {
            // InternalAnalysisActivityDSL.g:2140:3: ( (lv_code_0_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:2141:4: (lv_code_0_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:2141:4: (lv_code_0_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:2142:5: lv_code_0_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getCodeEBigIntegerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_code_0_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExitCodeRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_0_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getExitCodeAccess().getIfKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:2163:3: ( (lv_status_2_0= ruleTerminationStatus ) )
            // InternalAnalysisActivityDSL.g:2164:4: (lv_status_2_0= ruleTerminationStatus )
            {
            // InternalAnalysisActivityDSL.g:2164:4: (lv_status_2_0= ruleTerminationStatus )
            // InternalAnalysisActivityDSL.g:2165:5: lv_status_2_0= ruleTerminationStatus
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getStatusTerminationStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_status_2_0=ruleTerminationStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExitCodeRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.TerminationStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2182:3: ( (lv_reportMessage_3_0= ruleEString ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_MULTILINE_STRING||(LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2183:4: (lv_reportMessage_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:2183:4: (lv_reportMessage_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:2184:5: lv_reportMessage_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getExitCodeAccess().getReportMessageEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_reportMessage_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExitCodeRule());
                    					}
                    					set(
                    						current,
                    						"reportMessage",
                    						lv_reportMessage_3_0,
                    						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_STATEMENT_END_4=(Token)match(input,RULE_STATEMENT_END,FOLLOW_2); 

            			newLeafNode(this_STATEMENT_END_4, grammarAccess.getExitCodeAccess().getSTATEMENT_ENDTerminalRuleCall_4());
            		

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
    // InternalAnalysisActivityDSL.g:2209:1: entryRuleToolNameCommandLineEntry returns [EObject current=null] : iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF ;
    public final EObject entryRuleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolNameCommandLineEntry = null;


        try {
            // InternalAnalysisActivityDSL.g:2209:65: (iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF )
            // InternalAnalysisActivityDSL.g:2210:2: iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF
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
    // InternalAnalysisActivityDSL.g:2216:1: ruleToolNameCommandLineEntry returns [EObject current=null] : ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2222:2: ( ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2223:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2223:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2224:3: () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2224:3: ()
            // InternalAnalysisActivityDSL.g:2225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getToolNameCommandLineEntryAccess().getToolnameKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:2235:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_PIPE_TO) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2236:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_48); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getToolNameCommandLineEntryAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2240:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2241:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2241:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2242:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_manipulators_3_0=ruleStringListManipulator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getToolNameCommandLineEntryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"manipulators",
            	    							lv_manipulators_3_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // InternalAnalysisActivityDSL.g:2264:1: entryRuleLiteralCommandLineEntryList returns [EObject current=null] : iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF ;
    public final EObject entryRuleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2264:68: (iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2265:2: iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2271:1: ruleLiteralCommandLineEntryList returns [EObject current=null] : ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LIST_START_2=null;
        Token this_LIST_SEPARATOR_4=null;
        Token this_LIST_END_6=null;
        Token this_PIPE_TO_7=null;
        AntlrDatatypeRuleToken lv_literals_3_0 = null;

        AntlrDatatypeRuleToken lv_literals_5_0 = null;

        EObject lv_manipulators_8_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2277:2: ( ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2278:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2278:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2279:3: () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2279:3: ()
            // InternalAnalysisActivityDSL.g:2280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsKeyword_1());
            		
            this_LIST_START_2=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

            			newLeafNode(this_LIST_START_2, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:2294:3: ( (lv_literals_3_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2295:4: (lv_literals_3_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2295:4: (lv_literals_3_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2296:5: lv_literals_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_literals_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_3_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2313:3: (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_LIST_SEPARATOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2314:4: this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) )
            	    {
            	    this_LIST_SEPARATOR_4=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_3); 

            	    				newLeafNode(this_LIST_SEPARATOR_4, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_SEPARATORTerminalRuleCall_4_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2318:4: ( (lv_literals_5_0= ruleEString ) )
            	    // InternalAnalysisActivityDSL.g:2319:5: (lv_literals_5_0= ruleEString )
            	    {
            	    // InternalAnalysisActivityDSL.g:2319:5: (lv_literals_5_0= ruleEString )
            	    // InternalAnalysisActivityDSL.g:2320:6: lv_literals_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            this_LIST_END_6=(Token)match(input,RULE_LIST_END,FOLLOW_47); 

            			newLeafNode(this_LIST_END_6, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_5());
            		
            // InternalAnalysisActivityDSL.g:2342:3: (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_PIPE_TO) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2343:4: this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_7=(Token)match(input,RULE_PIPE_TO,FOLLOW_48); 

            	    				newLeafNode(this_PIPE_TO_7, grammarAccess.getLiteralCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_6_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2347:4: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2348:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2348:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2349:6: lv_manipulators_8_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_manipulators_8_0=ruleStringListManipulator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLiteralCommandLineEntryListRule());
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
            	    break loop41;
                }
            } while (true);


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
    // InternalAnalysisActivityDSL.g:2371:1: entryRuleDatasetCommandLineEntryList returns [EObject current=null] : iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF ;
    public final EObject entryRuleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2371:68: (iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2372:2: iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2378:1: ruleDatasetCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2384:2: ( (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2385:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2385:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2386:3: otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2390:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2391:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2391:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2392:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetDatasetCrossReference_1_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2406:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_PIPE_TO) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2407:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_48); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getDatasetCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2411:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2412:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2412:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2413:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_manipulators_3_0=ruleStringListManipulator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasetCommandLineEntryListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"manipulators",
            	    							lv_manipulators_3_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


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
    // InternalAnalysisActivityDSL.g:2435:1: entryRuleParameterCommandLineEntryList returns [EObject current=null] : iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF ;
    public final EObject entryRuleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2435:70: (iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2436:2: iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2442:1: ruleParameterCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2448:2: ( (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2449:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2449:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2450:3: otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterCommandLineEntryListAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2454:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2455:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2455:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2456:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getParameterParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2470:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_PIPE_TO) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2471:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_48); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getParameterCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2475:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2476:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2476:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2477:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_manipulators_3_0=ruleStringListManipulator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterCommandLineEntryListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"manipulators",
            	    							lv_manipulators_3_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.StringListManipulator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


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
    // InternalAnalysisActivityDSL.g:2499:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalAnalysisActivityDSL.g:2499:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalAnalysisActivityDSL.g:2500:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalAnalysisActivityDSL.g:2506:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_delimiter_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2512:2: ( (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2513:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2513:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2514:3: otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2518:3: ( (lv_delimiter_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2519:4: (lv_delimiter_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2519:4: (lv_delimiter_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2520:5: lv_delimiter_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2541:1: entryRulePrependEach returns [EObject current=null] : iv_rulePrependEach= rulePrependEach EOF ;
    public final EObject entryRulePrependEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2541:52: (iv_rulePrependEach= rulePrependEach EOF )
            // InternalAnalysisActivityDSL.g:2542:2: iv_rulePrependEach= rulePrependEach EOF
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
    // InternalAnalysisActivityDSL.g:2548:1: rulePrependEach returns [EObject current=null] : (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2554:2: ( (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2555:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2555:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2556:3: otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependEachAccess().getPrependEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2560:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2561:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2561:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2562:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2583:1: entryRuleAppendEach returns [EObject current=null] : iv_ruleAppendEach= ruleAppendEach EOF ;
    public final EObject entryRuleAppendEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2583:51: (iv_ruleAppendEach= ruleAppendEach EOF )
            // InternalAnalysisActivityDSL.g:2584:2: iv_ruleAppendEach= ruleAppendEach EOF
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
    // InternalAnalysisActivityDSL.g:2590:1: ruleAppendEach returns [EObject current=null] : (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2596:2: ( (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2597:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2597:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2598:3: otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendEachAccess().getAppendEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2602:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2603:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2603:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2604:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2625:1: entryRuleAppendListWith returns [EObject current=null] : iv_ruleAppendListWith= ruleAppendListWith EOF ;
    public final EObject entryRuleAppendListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2625:55: (iv_ruleAppendListWith= ruleAppendListWith EOF )
            // InternalAnalysisActivityDSL.g:2626:2: iv_ruleAppendListWith= ruleAppendListWith EOF
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
    // InternalAnalysisActivityDSL.g:2632:1: ruleAppendListWith returns [EObject current=null] : (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2638:2: ( (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2639:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2639:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2640:3: otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendListWithAccess().getAppendListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2644:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2645:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2645:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2646:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2667:1: entryRulePrependListWith returns [EObject current=null] : iv_rulePrependListWith= rulePrependListWith EOF ;
    public final EObject entryRulePrependListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2667:56: (iv_rulePrependListWith= rulePrependListWith EOF )
            // InternalAnalysisActivityDSL.g:2668:2: iv_rulePrependListWith= rulePrependListWith EOF
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
    // InternalAnalysisActivityDSL.g:2674:1: rulePrependListWith returns [EObject current=null] : (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2680:2: ( (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2681:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2681:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2682:3: otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependListWithAccess().getPrependListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2686:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2687:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2687:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2688:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2709:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2715:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalAnalysisActivityDSL.g:2716:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalAnalysisActivityDSL.g:2716:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case 57:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2717:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalAnalysisActivityDSL.g:2717:3: (enumLiteral_0= 'STRING' )
                    // InternalAnalysisActivityDSL.g:2718:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2725:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalAnalysisActivityDSL.g:2725:3: (enumLiteral_1= 'INTEGER' )
                    // InternalAnalysisActivityDSL.g:2726:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:2733:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalAnalysisActivityDSL.g:2733:3: (enumLiteral_2= 'REAL' )
                    // InternalAnalysisActivityDSL.g:2734:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

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
    // InternalAnalysisActivityDSL.g:2744:1: ruleTerminationStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) ;
    public final Enumerator ruleTerminationStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2750:2: ( ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) )
            // InternalAnalysisActivityDSL.g:2751:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            {
            // InternalAnalysisActivityDSL.g:2751:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            else if ( (LA45_0==59) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2752:3: (enumLiteral_0= 'SUCCEEDED' )
                    {
                    // InternalAnalysisActivityDSL.g:2752:3: (enumLiteral_0= 'SUCCEEDED' )
                    // InternalAnalysisActivityDSL.g:2753:4: enumLiteral_0= 'SUCCEEDED'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2760:3: (enumLiteral_1= 'FAILED' )
                    {
                    // InternalAnalysisActivityDSL.g:2760:3: (enumLiteral_1= 'FAILED' )
                    // InternalAnalysisActivityDSL.g:2761:4: enumLiteral_1= 'FAILED'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007C00020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000400000A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001920L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000020C000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000150000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003000088000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100002080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001860L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x007C000000000000L});

}
