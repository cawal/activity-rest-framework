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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTITY_START", "RULE_STATEMENT_END", "RULE_ENTITY_END", "RULE_LIST_START", "RULE_LIST_SEPARATOR", "RULE_LIST_END", "RULE_MULTILINE_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PIPE_TO", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'remark'", "'on'", "'with'", "'produces'", "'readinessContraints'", "'using'", "'parameter'", "':'", "'='", "'constraints'", "'dataset'", "'-'", "'CustomParameterConstraint'", "'CustomDatasetConstraint'", "'CustomParameterReadinessConstraint'", "'CustomDatasetReadinessConstraint'", "'executable'", "'redirecting'", "'stdin'", "'from'", "'stdout'", "'to'", "'stderr'", "'commandLineTemplate'", "'returns'", "'if'", "'toolname'", "'literals'", "'Join'", "'PrependEach'", "'AppendEach'", "'AppendListWith'", "'PrependListWith'", "'STRING'", "'INTEGER'", "'REAL'", "'SUCCEEDED'", "'FAILED'"
    };
    public static final int T__50=50;
    public static final int RULE_LIST_END=9;
    public static final int T__19=19;
    public static final int T__55=55;
    public static final int RULE_ENTITY_START=4;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=12;
    public static final int RULE_ENTITY_END=6;
    public static final int RULE_LIST_SEPARATOR=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_STATEMENT_END=5;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_LIST_START=7;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=16;
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
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_MULTILINE_STRING=10;
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
    // InternalAnalysisActivityDSL.g:72:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )? otherlv_27= 'using' ( (lv_tool_28_0= ruleTool ) ) this_ENTITY_END_29= RULE_ENTITY_END ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_STATEMENT_END_5=null;
        Token otherlv_6=null;
        Token this_ENTITY_START_7=null;
        Token this_ENTITY_END_10=null;
        Token otherlv_11=null;
        Token this_ENTITY_START_12=null;
        Token this_ENTITY_END_15=null;
        Token otherlv_16=null;
        Token this_ENTITY_START_17=null;
        Token this_ENTITY_END_20=null;
        Token otherlv_21=null;
        Token this_LIST_START_22=null;
        Token this_LIST_SEPARATOR_24=null;
        Token this_LIST_END_26=null;
        Token otherlv_27=null;
        Token this_ENTITY_END_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_remark_4_0 = null;

        EObject lv_inputDatasets_8_0 = null;

        EObject lv_inputDatasets_9_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_outputDatasets_18_0 = null;

        EObject lv_outputDatasets_19_0 = null;

        EObject lv_readinessContraints_23_0 = null;

        EObject lv_readinessContraints_25_0 = null;

        EObject lv_tool_28_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:78:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )? otherlv_27= 'using' ( (lv_tool_28_0= ruleTool ) ) this_ENTITY_END_29= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )? otherlv_27= 'using' ( (lv_tool_28_0= ruleTool ) ) this_ENTITY_END_29= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )? otherlv_27= 'using' ( (lv_tool_28_0= ruleTool ) ) this_ENTITY_END_29= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:80:3: otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )? otherlv_27= 'using' ( (lv_tool_28_0= ruleTool ) ) this_ENTITY_END_29= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:84:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:85:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:85:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:86:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_5); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:107:3: (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:108:4: otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getRemarkKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:112:4: ( (lv_remark_4_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:113:5: (lv_remark_4_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:113:5: (lv_remark_4_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:114:6: lv_remark_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getRemarkEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_remark_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						set(
                    							current,
                    							"remark",
                    							lv_remark_4_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_STATEMENT_END_5=(Token)match(input,RULE_STATEMENT_END,FOLLOW_8); 

                    				newLeafNode(this_STATEMENT_END_5, grammarAccess.getActivityAccess().getSTATEMENT_ENDTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:136:3: (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:137:4: otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getOnKeyword_4_0());
                    			
                    this_ENTITY_START_7=(Token)match(input,RULE_ENTITY_START,FOLLOW_9); 

                    				newLeafNode(this_ENTITY_START_7, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:145:4: ( (lv_inputDatasets_8_0= ruleInputDataset ) )
                    // InternalAnalysisActivityDSL.g:146:5: (lv_inputDatasets_8_0= ruleInputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:146:5: (lv_inputDatasets_8_0= ruleInputDataset )
                    // InternalAnalysisActivityDSL.g:147:6: lv_inputDatasets_8_0= ruleInputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalAnalysisActivityDSL.g:164:4: ( (lv_inputDatasets_9_0= ruleInputDataset ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==30) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:165:5: (lv_inputDatasets_9_0= ruleInputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:165:5: (lv_inputDatasets_9_0= ruleInputDataset )
                    	    // InternalAnalysisActivityDSL.g:166:6: lv_inputDatasets_9_0= ruleInputDataset
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_inputDatasets_9_0=ruleInputDataset();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputDatasets",
                    	    							lv_inputDatasets_9_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.InputDataset");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    this_ENTITY_END_10=(Token)match(input,RULE_ENTITY_END,FOLLOW_11); 

                    				newLeafNode(this_ENTITY_END_10, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:188:3: (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:189:4: otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getWithKeyword_5_0());
                    			
                    this_ENTITY_START_12=(Token)match(input,RULE_ENTITY_START,FOLLOW_12); 

                    				newLeafNode(this_ENTITY_START_12, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_5_1());
                    			
                    // InternalAnalysisActivityDSL.g:197:4: ( (lv_parameters_13_0= ruleParameter ) )
                    // InternalAnalysisActivityDSL.g:198:5: (lv_parameters_13_0= ruleParameter )
                    {
                    // InternalAnalysisActivityDSL.g:198:5: (lv_parameters_13_0= ruleParameter )
                    // InternalAnalysisActivityDSL.g:199:6: lv_parameters_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalAnalysisActivityDSL.g:216:4: ( (lv_parameters_14_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==26) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:217:5: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:217:5: (lv_parameters_14_0= ruleParameter )
                    	    // InternalAnalysisActivityDSL.g:218:6: lv_parameters_14_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_14_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_ENTITY_END_15=(Token)match(input,RULE_ENTITY_END,FOLLOW_14); 

                    				newLeafNode(this_ENTITY_END_15, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:240:3: (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:241:4: otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getProducesKeyword_6_0());
                    			
                    this_ENTITY_START_17=(Token)match(input,RULE_ENTITY_START,FOLLOW_9); 

                    				newLeafNode(this_ENTITY_START_17, grammarAccess.getActivityAccess().getENTITY_STARTTerminalRuleCall_6_1());
                    			
                    // InternalAnalysisActivityDSL.g:249:4: ( (lv_outputDatasets_18_0= ruleOutputDataset ) )
                    // InternalAnalysisActivityDSL.g:250:5: (lv_outputDatasets_18_0= ruleOutputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:250:5: (lv_outputDatasets_18_0= ruleOutputDataset )
                    // InternalAnalysisActivityDSL.g:251:6: lv_outputDatasets_18_0= ruleOutputDataset
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalAnalysisActivityDSL.g:268:4: ( (lv_outputDatasets_19_0= ruleOutputDataset ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==30) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:269:5: (lv_outputDatasets_19_0= ruleOutputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:269:5: (lv_outputDatasets_19_0= ruleOutputDataset )
                    	    // InternalAnalysisActivityDSL.g:270:6: lv_outputDatasets_19_0= ruleOutputDataset
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getOutputDatasetsOutputDatasetParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_15); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_6_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:292:3: (otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:293:4: otherlv_21= 'readinessContraints' this_LIST_START_22= RULE_LIST_START ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )* this_LIST_END_26= RULE_LIST_END
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getReadinessContraintsKeyword_7_0());
                    			
                    this_LIST_START_22=(Token)match(input,RULE_LIST_START,FOLLOW_17); 

                    				newLeafNode(this_LIST_START_22, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_7_1());
                    			
                    // InternalAnalysisActivityDSL.g:301:4: ( (lv_readinessContraints_23_0= ruleReadinessConstraint ) )
                    // InternalAnalysisActivityDSL.g:302:5: (lv_readinessContraints_23_0= ruleReadinessConstraint )
                    {
                    // InternalAnalysisActivityDSL.g:302:5: (lv_readinessContraints_23_0= ruleReadinessConstraint )
                    // InternalAnalysisActivityDSL.g:303:6: lv_readinessContraints_23_0= ruleReadinessConstraint
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_readinessContraints_23_0=ruleReadinessConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"readinessContraints",
                    							lv_readinessContraints_23_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ReadinessConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:320:4: (this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_LIST_SEPARATOR) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:321:5: this_LIST_SEPARATOR_24= RULE_LIST_SEPARATOR ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) )
                    	    {
                    	    this_LIST_SEPARATOR_24=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_17); 

                    	    					newLeafNode(this_LIST_SEPARATOR_24, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_7_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:325:5: ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) )
                    	    // InternalAnalysisActivityDSL.g:326:6: (lv_readinessContraints_25_0= ruleReadinessConstraint )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:326:6: (lv_readinessContraints_25_0= ruleReadinessConstraint )
                    	    // InternalAnalysisActivityDSL.g:327:7: lv_readinessContraints_25_0= ruleReadinessConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getReadinessContraintsReadinessConstraintParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_LIST_END_26=(Token)match(input,RULE_LIST_END,FOLLOW_19); 

                    				newLeafNode(this_LIST_END_26, grammarAccess.getActivityAccess().getLIST_ENDTerminalRuleCall_7_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_27, grammarAccess.getActivityAccess().getUsingKeyword_8());
            		
            // InternalAnalysisActivityDSL.g:354:3: ( (lv_tool_28_0= ruleTool ) )
            // InternalAnalysisActivityDSL.g:355:4: (lv_tool_28_0= ruleTool )
            {
            // InternalAnalysisActivityDSL.g:355:4: (lv_tool_28_0= ruleTool )
            // InternalAnalysisActivityDSL.g:356:5: lv_tool_28_0= ruleTool
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getToolToolParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_tool_28_0=ruleTool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"tool",
            						lv_tool_28_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Tool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_END_29=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_29, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_10());
            		

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
    // InternalAnalysisActivityDSL.g:381:1: entryRuleReadinessConstraint returns [EObject current=null] : iv_ruleReadinessConstraint= ruleReadinessConstraint EOF ;
    public final EObject entryRuleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:381:60: (iv_ruleReadinessConstraint= ruleReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:382:2: iv_ruleReadinessConstraint= ruleReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:388:1: ruleReadinessConstraint returns [EObject current=null] : (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint ) ;
    public final EObject ruleReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReadinessConstraint_0 = null;

        EObject this_DatasetReadinessConstraint_1 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:394:2: ( (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint ) )
            // InternalAnalysisActivityDSL.g:395:2: (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint )
            {
            // InternalAnalysisActivityDSL.g:395:2: (this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint | this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:396:3: this_ParameterReadinessConstraint_0= ruleParameterReadinessConstraint
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
                    // InternalAnalysisActivityDSL.g:405:3: this_DatasetReadinessConstraint_1= ruleDatasetReadinessConstraint
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
    // InternalAnalysisActivityDSL.g:417:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalAnalysisActivityDSL.g:417:45: (iv_ruleTool= ruleTool EOF )
            // InternalAnalysisActivityDSL.g:418:2: iv_ruleTool= ruleTool EOF
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
    // InternalAnalysisActivityDSL.g:424:1: ruleTool returns [EObject current=null] : this_CommandLineTool_0= ruleCommandLineTool ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_CommandLineTool_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:430:2: (this_CommandLineTool_0= ruleCommandLineTool )
            // InternalAnalysisActivityDSL.g:431:2: this_CommandLineTool_0= ruleCommandLineTool
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
    // InternalAnalysisActivityDSL.g:442:1: entryRuleCommandLineEntryList returns [EObject current=null] : iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF ;
    public final EObject entryRuleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:442:61: (iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:443:2: iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:449:1: ruleCommandLineEntryList returns [EObject current=null] : (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) ;
    public final EObject ruleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject this_ToolNameCommandLineEntry_0 = null;

        EObject this_LiteralCommandLineEntryList_1 = null;

        EObject this_DatasetCommandLineEntryList_2 = null;

        EObject this_ParameterCommandLineEntryList_3 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:455:2: ( (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:456:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:456:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt11=1;
                }
                break;
            case 47:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 26:
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
                    // InternalAnalysisActivityDSL.g:457:3: this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry
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
                    // InternalAnalysisActivityDSL.g:466:3: this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:475:3: this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:484:3: this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList
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
    // InternalAnalysisActivityDSL.g:496:1: entryRuleStringListManipulator returns [EObject current=null] : iv_ruleStringListManipulator= ruleStringListManipulator EOF ;
    public final EObject entryRuleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringListManipulator = null;


        try {
            // InternalAnalysisActivityDSL.g:496:62: (iv_ruleStringListManipulator= ruleStringListManipulator EOF )
            // InternalAnalysisActivityDSL.g:497:2: iv_ruleStringListManipulator= ruleStringListManipulator EOF
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
    // InternalAnalysisActivityDSL.g:503:1: ruleStringListManipulator returns [EObject current=null] : (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) ;
    public final EObject ruleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_PrependEach_1 = null;

        EObject this_AppendEach_2 = null;

        EObject this_AppendListWith_3 = null;

        EObject this_PrependListWith_4 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:509:2: ( (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) )
            // InternalAnalysisActivityDSL.g:510:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            {
            // InternalAnalysisActivityDSL.g:510:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt12=1;
                }
                break;
            case 49:
                {
                alt12=2;
                }
                break;
            case 50:
                {
                alt12=3;
                }
                break;
            case 51:
                {
                alt12=4;
                }
                break;
            case 52:
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
                    // InternalAnalysisActivityDSL.g:511:3: this_Join_0= ruleJoin
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
                    // InternalAnalysisActivityDSL.g:520:3: this_PrependEach_1= rulePrependEach
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
                    // InternalAnalysisActivityDSL.g:529:3: this_AppendEach_2= ruleAppendEach
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
                    // InternalAnalysisActivityDSL.g:538:3: this_AppendListWith_3= ruleAppendListWith
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
                    // InternalAnalysisActivityDSL.g:547:3: this_PrependListWith_4= rulePrependListWith
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
    // InternalAnalysisActivityDSL.g:559:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAnalysisActivityDSL.g:559:47: (iv_ruleEString= ruleEString EOF )
            // InternalAnalysisActivityDSL.g:560:2: iv_ruleEString= ruleEString EOF
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
    // InternalAnalysisActivityDSL.g:566:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTILINE_STRING_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:572:2: ( (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // InternalAnalysisActivityDSL.g:573:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // InternalAnalysisActivityDSL.g:573:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
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
                    // InternalAnalysisActivityDSL.g:574:3: this_MULTILINE_STRING_0= RULE_MULTILINE_STRING
                    {
                    this_MULTILINE_STRING_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_2); 

                    			current.merge(this_MULTILINE_STRING_0);
                    		

                    			newLeafNode(this_MULTILINE_STRING_0, grammarAccess.getEStringAccess().getMULTILINE_STRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:582:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:590:3: this_ID_2= RULE_ID
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalAnalysisActivityDSL.g:601:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalAnalysisActivityDSL.g:601:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalAnalysisActivityDSL.g:602:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalAnalysisActivityDSL.g:608:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:614:2: (this_ID_0= RULE_ID )
            // InternalAnalysisActivityDSL.g:615:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleParameter"
    // InternalAnalysisActivityDSL.g:625:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAnalysisActivityDSL.g:625:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAnalysisActivityDSL.g:626:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAnalysisActivityDSL.g:632:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) ;
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
        Token otherlv_16=null;
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

        AntlrDatatypeRuleToken lv_remark_17_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_constraints_23_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:638:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:639:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:639:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:640:3: otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:644:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:645:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:645:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:646:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:667:3: ( (lv_parameterType_3_0= ruleParameterType ) )
            // InternalAnalysisActivityDSL.g:668:4: (lv_parameterType_3_0= ruleParameterType )
            {
            // InternalAnalysisActivityDSL.g:668:4: (lv_parameterType_3_0= ruleParameterType )
            // InternalAnalysisActivityDSL.g:669:5: lv_parameterType_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeParameterTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_24); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:690:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:691:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:691:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:692:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_24); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:713:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:714:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:714:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:715:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_27); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:736:3: (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:737:4: otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getEqualsSignKeyword_9_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_6); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:745:4: ( (lv_defaultValue_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:746:5: (lv_defaultValue_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:746:5: (lv_defaultValue_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:747:6: lv_defaultValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalAnalysisActivityDSL.g:764:4: (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_LIST_SEPARATOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:765:5: this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) )
                    	    {
                    	    this_LIST_SEPARATOR_12=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_6); 

                    	    					newLeafNode(this_LIST_SEPARATOR_12, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_9_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:769:5: ( (lv_defaultValue_13_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:770:6: (lv_defaultValue_13_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:770:6: (lv_defaultValue_13_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:771:7: lv_defaultValue_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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

                    this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_28); 

                    				newLeafNode(this_LIST_END_14, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_9_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:794:3: (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ENTITY_START) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:795:4: this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END
                    {
                    this_ENTITY_START_15=(Token)match(input,RULE_ENTITY_START,FOLLOW_29); 

                    				newLeafNode(this_ENTITY_START_15, grammarAccess.getParameterAccess().getENTITY_STARTTerminalRuleCall_10_0());
                    			
                    // InternalAnalysisActivityDSL.g:799:4: (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:800:5: otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END
                            {
                            otherlv_16=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getRemarkKeyword_10_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:804:5: ( (lv_remark_17_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:805:6: (lv_remark_17_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:805:6: (lv_remark_17_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:806:7: lv_remark_17_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getRemarkEStringParserRuleCall_10_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_remark_17_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterRule());
                            							}
                            							set(
                            								current,
                            								"remark",
                            								lv_remark_17_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            this_STATEMENT_END_18=(Token)match(input,RULE_STATEMENT_END,FOLLOW_30); 

                            					newLeafNode(this_STATEMENT_END_18, grammarAccess.getParameterAccess().getSTATEMENT_ENDTerminalRuleCall_10_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:828:4: (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:829:5: otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleParameterConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )* this_LIST_END_24= RULE_LIST_END
                            {
                            otherlv_19=(Token)match(input,29,FOLLOW_16); 

                            					newLeafNode(otherlv_19, grammarAccess.getParameterAccess().getConstraintsKeyword_10_2_0());
                            				
                            this_LIST_START_20=(Token)match(input,RULE_LIST_START,FOLLOW_31); 

                            					newLeafNode(this_LIST_START_20, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_10_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:837:5: ( (lv_constraints_21_0= ruleParameterConstraint ) )
                            // InternalAnalysisActivityDSL.g:838:6: (lv_constraints_21_0= ruleParameterConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:838:6: (lv_constraints_21_0= ruleParameterConstraint )
                            // InternalAnalysisActivityDSL.g:839:7: lv_constraints_21_0= ruleParameterConstraint
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getConstraintsParameterConstraintParserRuleCall_10_2_2_0());
                            						
                            pushFollow(FOLLOW_18);
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

                            // InternalAnalysisActivityDSL.g:856:5: (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_LIST_SEPARATOR) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:857:6: this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleParameterConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_22=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_31); 

                            	    						newLeafNode(this_LIST_SEPARATOR_22, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_10_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:861:6: ( (lv_constraints_23_0= ruleParameterConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:862:7: (lv_constraints_23_0= ruleParameterConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:862:7: (lv_constraints_23_0= ruleParameterConstraint )
                            	    // InternalAnalysisActivityDSL.g:863:8: lv_constraints_23_0= ruleParameterConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterAccess().getConstraintsParameterConstraintParserRuleCall_10_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
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
                            	    break loop17;
                                }
                            } while (true);

                            this_LIST_END_24=(Token)match(input,RULE_LIST_END,FOLLOW_21); 

                            					newLeafNode(this_LIST_END_24, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_10_2_4());
                            				

                            }
                            break;

                    }

                    this_ENTITY_END_25=(Token)match(input,RULE_ENTITY_END,FOLLOW_7); 

                    				newLeafNode(this_ENTITY_END_25, grammarAccess.getParameterAccess().getENTITY_ENDTerminalRuleCall_10_3());
                    			

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
    // InternalAnalysisActivityDSL.g:899:1: entryRuleInputDataset returns [EObject current=null] : iv_ruleInputDataset= ruleInputDataset EOF ;
    public final EObject entryRuleInputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:899:53: (iv_ruleInputDataset= ruleInputDataset EOF )
            // InternalAnalysisActivityDSL.g:900:2: iv_ruleInputDataset= ruleInputDataset EOF
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
    // InternalAnalysisActivityDSL.g:906:1: ruleInputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
    public final EObject ruleInputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token otherlv_10=null;
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

        AntlrDatatypeRuleToken lv_remark_11_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_17_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:912:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:913:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:913:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:914:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:918:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:919:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:919:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:920:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:941:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_MULTILINE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:942:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:942:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:943:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getInputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_24); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:964:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:965:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:965:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:966:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_24); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:987:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:988:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:988:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:989:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_28); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1010:3: (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ENTITY_START) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1011:4: this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_29); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getInputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:1015:4: (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==20) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1016:5: otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getInputDatasetAccess().getRemarkKeyword_9_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:1020:5: ( (lv_remark_11_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1021:6: (lv_remark_11_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1021:6: (lv_remark_11_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:1022:7: lv_remark_11_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getInputDatasetAccess().getRemarkEStringParserRuleCall_9_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_remark_11_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                            							}
                            							set(
                            								current,
                            								"remark",
                            								lv_remark_11_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_30); 

                            					newLeafNode(this_STATEMENT_END_12, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:1044:4: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==29) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1045:5: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            {
                            otherlv_13=(Token)match(input,29,FOLLOW_16); 

                            					newLeafNode(otherlv_13, grammarAccess.getInputDatasetAccess().getConstraintsKeyword_9_2_0());
                            				
                            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_33); 

                            					newLeafNode(this_LIST_START_14, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_9_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:1053:5: ( (lv_constraints_15_0= ruleDatasetConstraint ) )
                            // InternalAnalysisActivityDSL.g:1054:6: (lv_constraints_15_0= ruleDatasetConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:1054:6: (lv_constraints_15_0= ruleDatasetConstraint )
                            // InternalAnalysisActivityDSL.g:1055:7: lv_constraints_15_0= ruleDatasetConstraint
                            {

                            							newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_2_2_0());
                            						
                            pushFollow(FOLLOW_18);
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

                            // InternalAnalysisActivityDSL.g:1072:5: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_LIST_SEPARATOR) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:1073:6: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_33); 

                            	    						newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:1077:6: ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:1078:7: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1078:7: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    // InternalAnalysisActivityDSL.g:1079:8: lv_constraints_17_0= ruleDatasetConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
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
                            	    break loop22;
                                }
                            } while (true);

                            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_7); 

                            					newLeafNode(this_LIST_END_18, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_9_2_4());
                            				
                            this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_21); 

                            					newLeafNode(this_STATEMENT_END_19, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_2_5());
                            				

                            }
                            break;

                    }

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_7); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getInputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_3());
                    			

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
    // InternalAnalysisActivityDSL.g:1119:1: entryRuleOutputDataset returns [EObject current=null] : iv_ruleOutputDataset= ruleOutputDataset EOF ;
    public final EObject entryRuleOutputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:1119:54: (iv_ruleOutputDataset= ruleOutputDataset EOF )
            // InternalAnalysisActivityDSL.g:1120:2: iv_ruleOutputDataset= ruleOutputDataset EOF
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
    // InternalAnalysisActivityDSL.g:1126:1: ruleOutputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
    public final EObject ruleOutputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token otherlv_10=null;
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

        AntlrDatatypeRuleToken lv_remark_11_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_17_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1132:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:1133:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:1133:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:1134:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1138:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1139:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1139:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1140:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1161:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_MULTILINE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1162:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1162:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1163:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_24); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:1184:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1185:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1185:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1186:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_24); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1207:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1208:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1208:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1209:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_28); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1230:3: (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ENTITY_START) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1231:4: this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_29); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getOutputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:1235:4: (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==20) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1236:5: otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getOutputDatasetAccess().getRemarkKeyword_9_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:1240:5: ( (lv_remark_11_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1241:6: (lv_remark_11_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1241:6: (lv_remark_11_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:1242:7: lv_remark_11_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getOutputDatasetAccess().getRemarkEStringParserRuleCall_9_1_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_remark_11_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                            							}
                            							set(
                            								current,
                            								"remark",
                            								lv_remark_11_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_30); 

                            					newLeafNode(this_STATEMENT_END_12, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:1264:4: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==29) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1265:5: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleDatasetConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            {
                            otherlv_13=(Token)match(input,29,FOLLOW_16); 

                            					newLeafNode(otherlv_13, grammarAccess.getOutputDatasetAccess().getConstraintsKeyword_9_2_0());
                            				
                            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_33); 

                            					newLeafNode(this_LIST_START_14, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_9_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:1273:5: ( (lv_constraints_15_0= ruleDatasetConstraint ) )
                            // InternalAnalysisActivityDSL.g:1274:6: (lv_constraints_15_0= ruleDatasetConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:1274:6: (lv_constraints_15_0= ruleDatasetConstraint )
                            // InternalAnalysisActivityDSL.g:1275:7: lv_constraints_15_0= ruleDatasetConstraint
                            {

                            							newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_2_2_0());
                            						
                            pushFollow(FOLLOW_18);
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

                            // InternalAnalysisActivityDSL.g:1292:5: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_LIST_SEPARATOR) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:1293:6: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_33); 

                            	    						newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:1297:6: ( (lv_constraints_17_0= ruleDatasetConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:1298:7: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1298:7: (lv_constraints_17_0= ruleDatasetConstraint )
                            	    // InternalAnalysisActivityDSL.g:1299:8: lv_constraints_17_0= ruleDatasetConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsDatasetConstraintParserRuleCall_9_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
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
                            	    break loop27;
                                }
                            } while (true);

                            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_7); 

                            					newLeafNode(this_LIST_END_18, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_9_2_4());
                            				
                            this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_21); 

                            					newLeafNode(this_STATEMENT_END_19, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_2_5());
                            				

                            }
                            break;

                    }

                    this_ENTITY_END_20=(Token)match(input,RULE_ENTITY_END,FOLLOW_7); 

                    				newLeafNode(this_ENTITY_END_20, grammarAccess.getOutputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_3());
                    			

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
    // InternalAnalysisActivityDSL.g:1339:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalAnalysisActivityDSL.g:1339:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalAnalysisActivityDSL.g:1340:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalAnalysisActivityDSL.g:1346:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1352:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAnalysisActivityDSL.g:1353:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAnalysisActivityDSL.g:1353:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAnalysisActivityDSL.g:1354:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAnalysisActivityDSL.g:1354:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1355:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_34); 

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
    // InternalAnalysisActivityDSL.g:1372:1: entryRuleParameterConstraint returns [EObject current=null] : iv_ruleParameterConstraint= ruleParameterConstraint EOF ;
    public final EObject entryRuleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1372:60: (iv_ruleParameterConstraint= ruleParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1373:2: iv_ruleParameterConstraint= ruleParameterConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1379:1: ruleParameterConstraint returns [EObject current=null] : this_CustomParameterConstraint_0= ruleCustomParameterConstraint ;
    public final EObject ruleParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomParameterConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1385:2: (this_CustomParameterConstraint_0= ruleCustomParameterConstraint )
            // InternalAnalysisActivityDSL.g:1386:2: this_CustomParameterConstraint_0= ruleCustomParameterConstraint
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
    // InternalAnalysisActivityDSL.g:1397:1: entryRuleCustomParameterConstraint returns [EObject current=null] : iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF ;
    public final EObject entryRuleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1397:66: (iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1398:2: iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1404:1: ruleCustomParameterConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) ;
    public final EObject ruleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token this_ENTITY_END_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1410:2: ( (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:1411:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:1411:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:1412:3: otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterConstraintAccess().getCustomParameterConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1416:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1417:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1417:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1418:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getCustomParameterConstraintAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomParameterConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1435:3: (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ENTITY_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1436:4: this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END
                    {
                    this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_21); 

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
    // InternalAnalysisActivityDSL.g:1449:1: entryRuleDatasetConstraint returns [EObject current=null] : iv_ruleDatasetConstraint= ruleDatasetConstraint EOF ;
    public final EObject entryRuleDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1449:58: (iv_ruleDatasetConstraint= ruleDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1450:2: iv_ruleDatasetConstraint= ruleDatasetConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1456:1: ruleDatasetConstraint returns [EObject current=null] : this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint ;
    public final EObject ruleDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomDatasetConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1462:2: (this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint )
            // InternalAnalysisActivityDSL.g:1463:2: this_CustomDatasetConstraint_0= ruleCustomDatasetConstraint
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
    // InternalAnalysisActivityDSL.g:1474:1: entryRuleCustomDatasetConstraint returns [EObject current=null] : iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF ;
    public final EObject entryRuleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1474:64: (iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1475:2: iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1481:1: ruleCustomDatasetConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) ;
    public final EObject ruleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token this_ENTITY_END_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1487:2: ( (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:1488:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:1488:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:1489:3: otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleIdentifier ) ) (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetConstraintAccess().getCustomDatasetConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1493:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1494:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1494:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1495:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getCustomDatasetConstraintAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDatasetConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1512:3: (this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ENTITY_START) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1513:4: this_ENTITY_START_2= RULE_ENTITY_START this_ENTITY_END_3= RULE_ENTITY_END
                    {
                    this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_21); 

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
    // InternalAnalysisActivityDSL.g:1526:1: entryRuleParameterReadinessConstraint returns [EObject current=null] : iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF ;
    public final EObject entryRuleParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1526:69: (iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1527:2: iv_ruleParameterReadinessConstraint= ruleParameterReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1533:1: ruleParameterReadinessConstraint returns [EObject current=null] : this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint ;
    public final EObject ruleParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomParameterReadinessConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1539:2: (this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint )
            // InternalAnalysisActivityDSL.g:1540:2: this_CustomParameterReadinessConstraint_0= ruleCustomParameterReadinessConstraint
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
    // InternalAnalysisActivityDSL.g:1551:1: entryRuleCustomParameterReadinessConstraint returns [EObject current=null] : iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF ;
    public final EObject entryRuleCustomParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1551:75: (iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1552:2: iv_ruleCustomParameterReadinessConstraint= ruleCustomParameterReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1558:1: ruleCustomParameterReadinessConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomParameterReadinessConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1564:2: ( (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1565:2: (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1565:2: (otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1566:3: otherlv_0= 'CustomParameterReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterReadinessConstraintAccess().getCustomParameterReadinessConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1570:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1571:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1571:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1572:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getCustomParameterReadinessConstraintAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomParameterReadinessConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_36); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomParameterReadinessConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomParameterReadinessConstraintAccess().getOnKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1597:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1598:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1598:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1599:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomParameterReadinessConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomParameterReadinessConstraintAccess().getParameterParameterCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
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
    // InternalAnalysisActivityDSL.g:1621:1: entryRuleDatasetReadinessConstraint returns [EObject current=null] : iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF ;
    public final EObject entryRuleDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1621:67: (iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1622:2: iv_ruleDatasetReadinessConstraint= ruleDatasetReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1628:1: ruleDatasetReadinessConstraint returns [EObject current=null] : this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint ;
    public final EObject ruleDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_CustomDatasetReadinessConstraint_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1634:2: (this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint )
            // InternalAnalysisActivityDSL.g:1635:2: this_CustomDatasetReadinessConstraint_0= ruleCustomDatasetReadinessConstraint
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
    // InternalAnalysisActivityDSL.g:1646:1: entryRuleCustomDatasetReadinessConstraint returns [EObject current=null] : iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF ;
    public final EObject entryRuleCustomDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetReadinessConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1646:73: (iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF )
            // InternalAnalysisActivityDSL.g:1647:2: iv_ruleCustomDatasetReadinessConstraint= ruleCustomDatasetReadinessConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1653:1: ruleCustomDatasetReadinessConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomDatasetReadinessConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1659:2: ( (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1660:2: (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1660:2: (otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1661:3: otherlv_0= 'CustomDatasetReadinessConstraint' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'on' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetReadinessConstraintAccess().getCustomDatasetReadinessConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1665:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1666:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1666:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1667:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getCustomDatasetReadinessConstraintAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDatasetReadinessConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_36); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomDatasetReadinessConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDatasetReadinessConstraintAccess().getOnKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1692:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1693:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1693:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1694:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomDatasetReadinessConstraintRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCustomDatasetReadinessConstraintAccess().getDatasetDatasetCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
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
    // InternalAnalysisActivityDSL.g:1716:1: entryRuleCommandLineTool returns [EObject current=null] : iv_ruleCommandLineTool= ruleCommandLineTool EOF ;
    public final EObject entryRuleCommandLineTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineTool = null;


        try {
            // InternalAnalysisActivityDSL.g:1716:56: (iv_ruleCommandLineTool= ruleCommandLineTool EOF )
            // InternalAnalysisActivityDSL.g:1717:2: iv_ruleCommandLineTool= ruleCommandLineTool EOF
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
    // InternalAnalysisActivityDSL.g:1723:1: ruleCommandLineTool returns [EObject current=null] : (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END ) ;
    public final EObject ruleCommandLineTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_STATEMENT_END_5=null;
        Token otherlv_6=null;
        Token this_ENTITY_START_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_STATEMENT_END_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_STATEMENT_END_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token this_STATEMENT_END_20=null;
        Token this_ENTITY_END_21=null;
        Token otherlv_22=null;
        Token this_LIST_START_23=null;
        Token this_LIST_SEPARATOR_25=null;
        Token this_LIST_END_27=null;
        Token otherlv_28=null;
        Token this_ENTITY_START_29=null;
        Token this_ENTITY_END_32=null;
        Token this_ENTITY_END_33=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_remark_4_0 = null;

        EObject lv_commandLineTemplate_24_0 = null;

        EObject lv_commandLineTemplate_26_0 = null;

        EObject lv_exitCodes_30_0 = null;

        EObject lv_exitCodes_31_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1729:2: ( (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1730:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1730:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1731:3: otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLineToolAccess().getExecutableKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1735:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1736:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1736:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1737:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_37); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:1758:3: (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1759:4: otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandLineToolAccess().getRemarkKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:1763:4: ( (lv_remark_4_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1764:5: (lv_remark_4_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1764:5: (lv_remark_4_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1765:6: lv_remark_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getRemarkEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_remark_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    						}
                    						set(
                    							current,
                    							"remark",
                    							lv_remark_4_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_STATEMENT_END_5=(Token)match(input,RULE_STATEMENT_END,FOLLOW_38); 

                    				newLeafNode(this_STATEMENT_END_5, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:1787:3: (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1788:4: otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandLineToolAccess().getRedirectingKeyword_4_0());
                    			
                    this_ENTITY_START_7=(Token)match(input,RULE_ENTITY_START,FOLLOW_39); 

                    				newLeafNode(this_ENTITY_START_7, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:1796:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) )
                    // InternalAnalysisActivityDSL.g:1797:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) )
                    {
                    // InternalAnalysisActivityDSL.g:1797:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) )
                    // InternalAnalysisActivityDSL.g:1798:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					
                    // InternalAnalysisActivityDSL.g:1801:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* )
                    // InternalAnalysisActivityDSL.g:1802:7: ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )*
                    {
                    // InternalAnalysisActivityDSL.g:1802:7: ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )*
                    loop34:
                    do {
                        int alt34=4;
                        int LA34_0 = input.LA(1);

                        if ( LA34_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                            alt34=1;
                        }
                        else if ( LA34_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                            alt34=2;
                        }
                        else if ( LA34_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                            alt34=3;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1803:5: ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1803:5: ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1804:6: {...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1804:115: ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1805:7: ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1808:10: ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1808:11: {...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1808:20: (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1808:21: otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                    	    {
                    	    otherlv_9=(Token)match(input,38,FOLLOW_40); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getCommandLineToolAccess().getStdinKeyword_4_2_0_0());
                    	    									
                    	    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getCommandLineToolAccess().getFromKeyword_4_2_0_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1816:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1817:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1817:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1818:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardInputStreamInputDatasetCrossReference_4_2_0_2_0());
                    	    											
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_39); 

                    	    										newLeafNode(this_STATEMENT_END_12, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_0_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:1842:5: ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1842:5: ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1843:6: {...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1843:115: ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1844:7: ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1847:10: ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1847:11: {...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1847:20: (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1847:21: otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END
                    	    {
                    	    otherlv_13=(Token)match(input,40,FOLLOW_41); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getCommandLineToolAccess().getStdoutKeyword_4_2_1_0());
                    	    									
                    	    otherlv_14=(Token)match(input,41,FOLLOW_6); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_1_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1855:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1856:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1856:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1857:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardOutputStreamOutputDatasetCrossReference_4_2_1_2_0());
                    	    											
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_16=(Token)match(input,RULE_STATEMENT_END,FOLLOW_39); 

                    	    										newLeafNode(this_STATEMENT_END_16, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_1_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAnalysisActivityDSL.g:1881:5: ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1881:5: ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1882:6: {...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1882:115: ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1883:7: ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1886:10: ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1886:11: {...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1886:20: (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1886:21: otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END
                    	    {
                    	    otherlv_17=(Token)match(input,42,FOLLOW_41); 

                    	    										newLeafNode(otherlv_17, grammarAccess.getCommandLineToolAccess().getStderrKeyword_4_2_2_0());
                    	    									
                    	    otherlv_18=(Token)match(input,41,FOLLOW_6); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_2_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1894:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1895:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1895:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1896:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getCommandLineToolRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardErrorStreamOutputDatasetCrossReference_4_2_2_2_0());
                    	    											
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    this_STATEMENT_END_20=(Token)match(input,RULE_STATEMENT_END,FOLLOW_39); 

                    	    										newLeafNode(this_STATEMENT_END_20, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_2_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					

                    }

                    this_ENTITY_END_21=(Token)match(input,RULE_ENTITY_END,FOLLOW_42); 

                    				newLeafNode(this_ENTITY_END_21, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_22, grammarAccess.getCommandLineToolAccess().getCommandLineTemplateKeyword_5());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_43); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1940:3: ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:1941:4: (lv_commandLineTemplate_24_0= ruleCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:1941:4: (lv_commandLineTemplate_24_0= ruleCommandLineEntryList )
            // InternalAnalysisActivityDSL.g:1942:5: lv_commandLineTemplate_24_0= ruleCommandLineEntryList
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_commandLineTemplate_24_0=ruleCommandLineEntryList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            					}
            					add(
            						current,
            						"commandLineTemplate",
            						lv_commandLineTemplate_24_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1959:3: (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_LIST_SEPARATOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1960:4: this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) )
            	    {
            	    this_LIST_SEPARATOR_25=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_43); 

            	    				newLeafNode(this_LIST_SEPARATOR_25, grammarAccess.getCommandLineToolAccess().getLIST_SEPARATORTerminalRuleCall_8_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1964:4: ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) )
            	    // InternalAnalysisActivityDSL.g:1965:5: (lv_commandLineTemplate_26_0= ruleCommandLineEntryList )
            	    {
            	    // InternalAnalysisActivityDSL.g:1965:5: (lv_commandLineTemplate_26_0= ruleCommandLineEntryList )
            	    // InternalAnalysisActivityDSL.g:1966:6: lv_commandLineTemplate_26_0= ruleCommandLineEntryList
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_commandLineTemplate_26_0=ruleCommandLineEntryList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commandLineTemplate",
            	    							lv_commandLineTemplate_26_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_9());
            		
            // InternalAnalysisActivityDSL.g:1988:3: (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1989:4: otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END
                    {
                    otherlv_28=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getCommandLineToolAccess().getReturnsKeyword_10_0());
                    			
                    this_ENTITY_START_29=(Token)match(input,RULE_ENTITY_START,FOLLOW_24); 

                    				newLeafNode(this_ENTITY_START_29, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_10_1());
                    			
                    // InternalAnalysisActivityDSL.g:1997:4: ( (lv_exitCodes_30_0= ruleExitCode ) )
                    // InternalAnalysisActivityDSL.g:1998:5: (lv_exitCodes_30_0= ruleExitCode )
                    {
                    // InternalAnalysisActivityDSL.g:1998:5: (lv_exitCodes_30_0= ruleExitCode )
                    // InternalAnalysisActivityDSL.g:1999:6: lv_exitCodes_30_0= ruleExitCode
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_45);
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

                    // InternalAnalysisActivityDSL.g:2016:4: ( (lv_exitCodes_31_0= ruleExitCode ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_INT||LA37_0==31) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2017:5: (lv_exitCodes_31_0= ruleExitCode )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:2017:5: (lv_exitCodes_31_0= ruleExitCode )
                    	    // InternalAnalysisActivityDSL.g:2018:6: lv_exitCodes_31_0= ruleExitCode
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_45);
                    	    lv_exitCodes_31_0=ruleExitCode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exitCodes",
                    	    							lv_exitCodes_31_0,
                    	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    this_ENTITY_END_32=(Token)match(input,RULE_ENTITY_END,FOLLOW_21); 

                    				newLeafNode(this_ENTITY_END_32, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_10_4());
                    			

                    }
                    break;

            }

            this_ENTITY_END_33=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_33, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_11());
            		

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


    // $ANTLR start "entryRuleExitCode"
    // InternalAnalysisActivityDSL.g:2048:1: entryRuleExitCode returns [EObject current=null] : iv_ruleExitCode= ruleExitCode EOF ;
    public final EObject entryRuleExitCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitCode = null;


        try {
            // InternalAnalysisActivityDSL.g:2048:49: (iv_ruleExitCode= ruleExitCode EOF )
            // InternalAnalysisActivityDSL.g:2049:2: iv_ruleExitCode= ruleExitCode EOF
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
    // InternalAnalysisActivityDSL.g:2055:1: ruleExitCode returns [EObject current=null] : ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) ;
    public final EObject ruleExitCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STATEMENT_END_4=null;
        AntlrDatatypeRuleToken lv_code_0_0 = null;

        Enumerator lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_reportMessage_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2061:2: ( ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:2062:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:2062:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:2063:3: ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END
            {
            // InternalAnalysisActivityDSL.g:2063:3: ( (lv_code_0_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:2064:4: (lv_code_0_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:2064:4: (lv_code_0_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:2065:5: lv_code_0_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getCodeEBigIntegerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_1=(Token)match(input,45,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getExitCodeAccess().getIfKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:2086:3: ( (lv_status_2_0= ruleTerminationStatus ) )
            // InternalAnalysisActivityDSL.g:2087:4: (lv_status_2_0= ruleTerminationStatus )
            {
            // InternalAnalysisActivityDSL.g:2087:4: (lv_status_2_0= ruleTerminationStatus )
            // InternalAnalysisActivityDSL.g:2088:5: lv_status_2_0= ruleTerminationStatus
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getStatusTerminationStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalAnalysisActivityDSL.g:2105:3: ( (lv_reportMessage_3_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_MULTILINE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2106:4: (lv_reportMessage_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:2106:4: (lv_reportMessage_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:2107:5: lv_reportMessage_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getExitCodeAccess().getReportMessageEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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
    // InternalAnalysisActivityDSL.g:2132:1: entryRuleToolNameCommandLineEntry returns [EObject current=null] : iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF ;
    public final EObject entryRuleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolNameCommandLineEntry = null;


        try {
            // InternalAnalysisActivityDSL.g:2132:65: (iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF )
            // InternalAnalysisActivityDSL.g:2133:2: iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF
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
    // InternalAnalysisActivityDSL.g:2139:1: ruleToolNameCommandLineEntry returns [EObject current=null] : ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2145:2: ( ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2146:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2146:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2147:3: () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2147:3: ()
            // InternalAnalysisActivityDSL.g:2148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getToolNameCommandLineEntryAccess().getToolnameKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:2158:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_PIPE_TO) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2159:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_50); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getToolNameCommandLineEntryAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2163:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2164:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2164:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2165:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop40;
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
    // InternalAnalysisActivityDSL.g:2187:1: entryRuleLiteralCommandLineEntryList returns [EObject current=null] : iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF ;
    public final EObject entryRuleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2187:68: (iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2188:2: iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2194:1: ruleLiteralCommandLineEntryList returns [EObject current=null] : ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) ;
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
            // InternalAnalysisActivityDSL.g:2200:2: ( ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2201:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2201:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2202:3: () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2202:3: ()
            // InternalAnalysisActivityDSL.g:2203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsKeyword_1());
            		
            this_LIST_START_2=(Token)match(input,RULE_LIST_START,FOLLOW_6); 

            			newLeafNode(this_LIST_START_2, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:2217:3: ( (lv_literals_3_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2218:4: (lv_literals_3_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2218:4: (lv_literals_3_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2219:5: lv_literals_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalAnalysisActivityDSL.g:2236:3: (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_LIST_SEPARATOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2237:4: this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) )
            	    {
            	    this_LIST_SEPARATOR_4=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_6); 

            	    				newLeafNode(this_LIST_SEPARATOR_4, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_SEPARATORTerminalRuleCall_4_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2241:4: ( (lv_literals_5_0= ruleEString ) )
            	    // InternalAnalysisActivityDSL.g:2242:5: (lv_literals_5_0= ruleEString )
            	    {
            	    // InternalAnalysisActivityDSL.g:2242:5: (lv_literals_5_0= ruleEString )
            	    // InternalAnalysisActivityDSL.g:2243:6: lv_literals_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop41;
                }
            } while (true);

            this_LIST_END_6=(Token)match(input,RULE_LIST_END,FOLLOW_49); 

            			newLeafNode(this_LIST_END_6, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_5());
            		
            // InternalAnalysisActivityDSL.g:2265:3: (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_PIPE_TO) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2266:4: this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_7=(Token)match(input,RULE_PIPE_TO,FOLLOW_50); 

            	    				newLeafNode(this_PIPE_TO_7, grammarAccess.getLiteralCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_6_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2270:4: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2271:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2271:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2272:6: lv_manipulators_8_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
    // $ANTLR end "ruleLiteralCommandLineEntryList"


    // $ANTLR start "entryRuleDatasetCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2294:1: entryRuleDatasetCommandLineEntryList returns [EObject current=null] : iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF ;
    public final EObject entryRuleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2294:68: (iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2295:2: iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2301:1: ruleDatasetCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2307:2: ( (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2308:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2308:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2309:3: otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2313:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2314:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2314:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2315:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetDatasetCrossReference_1_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2329:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_PIPE_TO) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2330:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_50); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getDatasetCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2334:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2335:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2335:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2336:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
    // $ANTLR end "ruleDatasetCommandLineEntryList"


    // $ANTLR start "entryRuleParameterCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:2358:1: entryRuleParameterCommandLineEntryList returns [EObject current=null] : iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF ;
    public final EObject entryRuleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2358:70: (iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2359:2: iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2365:1: ruleParameterCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2371:2: ( (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2372:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2372:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2373:3: otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterCommandLineEntryListAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2377:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2378:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2378:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2379:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getParameterParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2393:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_PIPE_TO) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2394:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_50); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getParameterCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2398:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2399:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2399:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2400:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop44;
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
    // InternalAnalysisActivityDSL.g:2422:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalAnalysisActivityDSL.g:2422:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalAnalysisActivityDSL.g:2423:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalAnalysisActivityDSL.g:2429:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_delimiter_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2435:2: ( (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2436:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2436:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2437:3: otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2441:3: ( (lv_delimiter_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2442:4: (lv_delimiter_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2442:4: (lv_delimiter_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2443:5: lv_delimiter_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2464:1: entryRulePrependEach returns [EObject current=null] : iv_rulePrependEach= rulePrependEach EOF ;
    public final EObject entryRulePrependEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2464:52: (iv_rulePrependEach= rulePrependEach EOF )
            // InternalAnalysisActivityDSL.g:2465:2: iv_rulePrependEach= rulePrependEach EOF
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
    // InternalAnalysisActivityDSL.g:2471:1: rulePrependEach returns [EObject current=null] : (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2477:2: ( (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2478:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2478:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2479:3: otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependEachAccess().getPrependEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2483:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2484:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2484:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2485:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2506:1: entryRuleAppendEach returns [EObject current=null] : iv_ruleAppendEach= ruleAppendEach EOF ;
    public final EObject entryRuleAppendEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2506:51: (iv_ruleAppendEach= ruleAppendEach EOF )
            // InternalAnalysisActivityDSL.g:2507:2: iv_ruleAppendEach= ruleAppendEach EOF
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
    // InternalAnalysisActivityDSL.g:2513:1: ruleAppendEach returns [EObject current=null] : (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2519:2: ( (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2520:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2520:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2521:3: otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendEachAccess().getAppendEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2525:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2526:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2526:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2527:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2548:1: entryRuleAppendListWith returns [EObject current=null] : iv_ruleAppendListWith= ruleAppendListWith EOF ;
    public final EObject entryRuleAppendListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2548:55: (iv_ruleAppendListWith= ruleAppendListWith EOF )
            // InternalAnalysisActivityDSL.g:2549:2: iv_ruleAppendListWith= ruleAppendListWith EOF
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
    // InternalAnalysisActivityDSL.g:2555:1: ruleAppendListWith returns [EObject current=null] : (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2561:2: ( (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2562:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2562:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2563:3: otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendListWithAccess().getAppendListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2567:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2568:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2568:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2569:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2590:1: entryRulePrependListWith returns [EObject current=null] : iv_rulePrependListWith= rulePrependListWith EOF ;
    public final EObject entryRulePrependListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2590:56: (iv_rulePrependListWith= rulePrependListWith EOF )
            // InternalAnalysisActivityDSL.g:2591:2: iv_rulePrependListWith= rulePrependListWith EOF
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
    // InternalAnalysisActivityDSL.g:2597:1: rulePrependListWith returns [EObject current=null] : (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2603:2: ( (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2604:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2604:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2605:3: otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependListWithAccess().getPrependListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2609:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2610:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2610:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2611:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2632:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2638:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalAnalysisActivityDSL.g:2639:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalAnalysisActivityDSL.g:2639:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt45=1;
                }
                break;
            case 54:
                {
                alt45=2;
                }
                break;
            case 55:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2640:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalAnalysisActivityDSL.g:2640:3: (enumLiteral_0= 'STRING' )
                    // InternalAnalysisActivityDSL.g:2641:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2648:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalAnalysisActivityDSL.g:2648:3: (enumLiteral_1= 'INTEGER' )
                    // InternalAnalysisActivityDSL.g:2649:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:2656:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalAnalysisActivityDSL.g:2656:3: (enumLiteral_2= 'REAL' )
                    // InternalAnalysisActivityDSL.g:2657:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAnalysisActivityDSL.g:2667:1: ruleTerminationStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) ;
    public final Enumerator ruleTerminationStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2673:2: ( ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) )
            // InternalAnalysisActivityDSL.g:2674:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            {
            // InternalAnalysisActivityDSL.g:2674:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==57) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2675:3: (enumLiteral_0= 'SUCCEEDED' )
                    {
                    // InternalAnalysisActivityDSL.g:2675:3: (enumLiteral_0= 'SUCCEEDED' )
                    // InternalAnalysisActivityDSL.g:2676:4: enumLiteral_0= 'SUCCEEDED'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2683:3: (enumLiteral_1= 'FAILED' )
                    {
                    // InternalAnalysisActivityDSL.g:2683:3: (enumLiteral_1= 'FAILED' )
                    // InternalAnalysisActivityDSL.g:2684:4: enumLiteral_1= 'FAILED'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020100040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001C80L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000082000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000054000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00044000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080002040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001C20L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x001F000000000000L});

}
