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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTITY_START", "RULE_LIST_START", "RULE_LIST_SEPARATOR", "RULE_LIST_END", "RULE_ENTITY_END", "RULE_MULTILINE_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PIPE_TO", "RULE_DEFINITION_START", "RULE_DEFINITION_END", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'description'", "'on'", "'with'", "'produces'", "'readinessContraints'", "'using'", "'parameter'", "':'", "'='", "'dataset'", "'remarks'", "'-'", "'MinimunDatasetCardinalityConstraint'", "'value'", "'MaximunDatasetCardinalityConstraint'", "'MinimunParameterCardinalityConstraint'", "'MaximunParameterCardinalityConstraint'", "'CustomParameterConstraint'", "'CustomDatasetConstraint'", "'CommandLineTool'", "'executablePath'", "'pipe'", "'stdin'", "'from'", "'stdout'", "'to'", "'stderr'", "'commandLineTemplate'", "'returns'", "'if'", "'toolname'", "'literals'", "'Join'", "'PrependEach'", "'AppendEach'", "'AppendListWith'", "'PrependListWith'", "'STRING'", "'INTEGER'", "'REAL'", "'SUCCEEDED'", "'FAILED'"
    };
    public static final int T__50=50;
    public static final int RULE_LIST_END=7;
    public static final int T__59=59;
    public static final int RULE_DEFINITION_END=15;
    public static final int T__55=55;
    public static final int RULE_ENTITY_START=4;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int RULE_ENTITY_END=8;
    public static final int RULE_LIST_SEPARATOR=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_LIST_START=5;
    public static final int RULE_DEFINITION_START=14;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_PIPE_TO=13;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_MULTILINE_STRING=9;
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
    // InternalAnalysisActivityDSL.g:72:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'using' ( (lv_tool_30_0= ruleTool ) ) this_ENTITY_END_31= RULE_ENTITY_END ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_LIST_START_6=null;
        Token this_LIST_SEPARATOR_8=null;
        Token this_LIST_END_10=null;
        Token otherlv_11=null;
        Token this_LIST_START_12=null;
        Token this_LIST_SEPARATOR_14=null;
        Token this_LIST_END_16=null;
        Token otherlv_17=null;
        Token this_LIST_START_18=null;
        Token this_LIST_SEPARATOR_20=null;
        Token this_LIST_END_22=null;
        Token otherlv_23=null;
        Token this_LIST_START_24=null;
        Token this_LIST_SEPARATOR_26=null;
        Token this_LIST_END_28=null;
        Token otherlv_29=null;
        Token this_ENTITY_END_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_inputDatasets_7_0 = null;

        EObject lv_inputDatasets_9_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_outputDatasets_19_0 = null;

        EObject lv_outputDatasets_21_0 = null;

        EObject lv_readinessContraints_25_0 = null;

        EObject lv_readinessContraints_27_0 = null;

        EObject lv_tool_30_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:78:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'using' ( (lv_tool_30_0= ruleTool ) ) this_ENTITY_END_31= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'using' ( (lv_tool_30_0= ruleTool ) ) this_ENTITY_END_31= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'using' ( (lv_tool_30_0= ruleTool ) ) this_ENTITY_END_31= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:80:3: otherlv_0= 'activity' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )? (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )? (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )? (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )? otherlv_29= 'using' ( (lv_tool_30_0= ruleTool ) ) this_ENTITY_END_31= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

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
            		
            // InternalAnalysisActivityDSL.g:107:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:108:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

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

            // InternalAnalysisActivityDSL.g:132:3: (otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:133:4: otherlv_5= 'on' this_LIST_START_6= RULE_LIST_START ( (lv_inputDatasets_7_0= ruleInputDataset ) ) (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )* this_LIST_END_10= RULE_LIST_END
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getOnKeyword_4_0());
                    			
                    this_LIST_START_6=(Token)match(input,RULE_LIST_START,FOLLOW_8); 

                    				newLeafNode(this_LIST_START_6, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:141:4: ( (lv_inputDatasets_7_0= ruleInputDataset ) )
                    // InternalAnalysisActivityDSL.g:142:5: (lv_inputDatasets_7_0= ruleInputDataset )
                    {
                    // InternalAnalysisActivityDSL.g:142:5: (lv_inputDatasets_7_0= ruleInputDataset )
                    // InternalAnalysisActivityDSL.g:143:6: lv_inputDatasets_7_0= ruleInputDataset
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

                    // InternalAnalysisActivityDSL.g:160:4: (this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_LIST_SEPARATOR) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:161:5: this_LIST_SEPARATOR_8= RULE_LIST_SEPARATOR ( (lv_inputDatasets_9_0= ruleInputDataset ) )
                    	    {
                    	    this_LIST_SEPARATOR_8=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_8); 

                    	    					newLeafNode(this_LIST_SEPARATOR_8, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_4_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:165:5: ( (lv_inputDatasets_9_0= ruleInputDataset ) )
                    	    // InternalAnalysisActivityDSL.g:166:6: (lv_inputDatasets_9_0= ruleInputDataset )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:166:6: (lv_inputDatasets_9_0= ruleInputDataset )
                    	    // InternalAnalysisActivityDSL.g:167:7: lv_inputDatasets_9_0= ruleInputDataset
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getInputDatasetsInputDatasetParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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

            // InternalAnalysisActivityDSL.g:190:3: (otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:191:4: otherlv_11= 'with' this_LIST_START_12= RULE_LIST_START ( (lv_parameters_13_0= ruleParameter ) ) (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )* this_LIST_END_16= RULE_LIST_END
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getWithKeyword_5_0());
                    			
                    this_LIST_START_12=(Token)match(input,RULE_LIST_START,FOLLOW_11); 

                    				newLeafNode(this_LIST_START_12, grammarAccess.getActivityAccess().getLIST_STARTTerminalRuleCall_5_1());
                    			
                    // InternalAnalysisActivityDSL.g:199:4: ( (lv_parameters_13_0= ruleParameter ) )
                    // InternalAnalysisActivityDSL.g:200:5: (lv_parameters_13_0= ruleParameter )
                    {
                    // InternalAnalysisActivityDSL.g:200:5: (lv_parameters_13_0= ruleParameter )
                    // InternalAnalysisActivityDSL.g:201:6: lv_parameters_13_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalAnalysisActivityDSL.g:218:4: (this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_LIST_SEPARATOR) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:219:5: this_LIST_SEPARATOR_14= RULE_LIST_SEPARATOR ( (lv_parameters_15_0= ruleParameter ) )
                    	    {
                    	    this_LIST_SEPARATOR_14=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_11); 

                    	    					newLeafNode(this_LIST_SEPARATOR_14, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_5_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:223:5: ( (lv_parameters_15_0= ruleParameter ) )
                    	    // InternalAnalysisActivityDSL.g:224:6: (lv_parameters_15_0= ruleParameter )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:224:6: (lv_parameters_15_0= ruleParameter )
                    	    // InternalAnalysisActivityDSL.g:225:7: lv_parameters_15_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_15_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Parameter");
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

            // InternalAnalysisActivityDSL.g:248:3: (otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:249:4: otherlv_17= 'produces' this_LIST_START_18= RULE_LIST_START ( (lv_outputDatasets_19_0= ruleOutputDataset ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )* this_LIST_END_22= RULE_LIST_END
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getProducesKeyword_6_0());
                    			
                    this_LIST_START_18=(Token)match(input,RULE_LIST_START,FOLLOW_8); 

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

                    // InternalAnalysisActivityDSL.g:276:4: (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_LIST_SEPARATOR) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:277:5: this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_outputDatasets_21_0= ruleOutputDataset ) )
                    	    {
                    	    this_LIST_SEPARATOR_20=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_8); 

                    	    					newLeafNode(this_LIST_SEPARATOR_20, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_6_3_0());
                    	    				
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

            // InternalAnalysisActivityDSL.g:306:3: (otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:307:4: otherlv_23= 'readinessContraints' this_LIST_START_24= RULE_LIST_START ( (lv_readinessContraints_25_0= ruleReadinessConstraint ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )* this_LIST_END_28= RULE_LIST_END
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_7); 

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

                    // InternalAnalysisActivityDSL.g:334:4: (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_LIST_SEPARATOR) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:335:5: this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_readinessContraints_27_0= ruleReadinessConstraint ) )
                    	    {
                    	    this_LIST_SEPARATOR_26=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_14); 

                    	    					newLeafNode(this_LIST_SEPARATOR_26, grammarAccess.getActivityAccess().getLIST_SEPARATORTerminalRuleCall_7_3_0());
                    	    				
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

            otherlv_29=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_29, grammarAccess.getActivityAccess().getUsingKeyword_8());
            		
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

            this_ENTITY_END_31=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_31, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_10());
            		

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
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
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
            case 51:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case 30:
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
            case 53:
                {
                alt12=1;
                }
                break;
            case 54:
                {
                alt12=2;
                }
                break;
            case 55:
                {
                alt12=3;
                }
                break;
            case 56:
                {
                alt12=4;
                }
                break;
            case 57:
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
    // InternalAnalysisActivityDSL.g:658:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? ) ;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_parameterType_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_13_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:664:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? ) )
            // InternalAnalysisActivityDSL.g:665:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? )
            {
            // InternalAnalysisActivityDSL.g:665:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? )
            // InternalAnalysisActivityDSL.g:666:3: otherlv_0= 'parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:670:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:671:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:671:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:672:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:693:3: ( (lv_parameterType_3_0= ruleParameterType ) )
            // InternalAnalysisActivityDSL.g:694:4: (lv_parameterType_3_0= ruleParameterType )
            {
            // InternalAnalysisActivityDSL.g:694:4: (lv_parameterType_3_0= ruleParameterType )
            // InternalAnalysisActivityDSL.g:695:5: lv_parameterType_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeParameterTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_20); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:716:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:717:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:717:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:718:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_20); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:739:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:740:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:740:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:741:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_23); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:762:3: (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:763:4: otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getEqualsSignKeyword_9_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:771:4: ( (lv_defaultValue_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:772:5: (lv_defaultValue_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:772:5: (lv_defaultValue_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:773:6: lv_defaultValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalAnalysisActivityDSL.g:790:4: (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_LIST_SEPARATOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:791:5: this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) )
                    	    {
                    	    this_LIST_SEPARATOR_12=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_3); 

                    	    					newLeafNode(this_LIST_SEPARATOR_12, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_9_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:795:5: ( (lv_defaultValue_13_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:796:6: (lv_defaultValue_13_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:796:6: (lv_defaultValue_13_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:797:7: lv_defaultValue_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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

                    this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_2); 

                    				newLeafNode(this_LIST_END_14, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_9_4());
                    			

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInputDataset"
    // InternalAnalysisActivityDSL.g:824:1: entryRuleInputDataset returns [EObject current=null] : iv_ruleInputDataset= ruleInputDataset EOF ;
    public final EObject entryRuleInputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:824:53: (iv_ruleInputDataset= ruleInputDataset EOF )
            // InternalAnalysisActivityDSL.g:825:2: iv_ruleInputDataset= ruleInputDataset EOF
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
    // InternalAnalysisActivityDSL.g:831:1: ruleInputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? ) ;
    public final EObject ruleInputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token otherlv_10=null;
        Token this_ENTITY_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        AntlrDatatypeRuleToken lv_remarks_11_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:837:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:838:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:838:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:839:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:843:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:844:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:844:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:845:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:866:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_MULTILINE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:867:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:867:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:868:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getInputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_20); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:889:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:890:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:890:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:891:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_20); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:912:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:913:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:913:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:914:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_25); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:935:3: (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ENTITY_START) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:936:4: this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_26); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getInputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    otherlv_10=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputDatasetAccess().getRemarksKeyword_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:944:4: ( (lv_remarks_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:945:5: (lv_remarks_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:945:5: (lv_remarks_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:946:6: lv_remarks_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputDatasetAccess().getRemarksEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_remarks_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                    						}
                    						set(
                    							current,
                    							"remarks",
                    							lv_remarks_11_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_ENTITY_END_12=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

                    				newLeafNode(this_ENTITY_END_12, grammarAccess.getInputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_3());
                    			

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
    // $ANTLR end "ruleInputDataset"


    // $ANTLR start "entryRuleOutputDataset"
    // InternalAnalysisActivityDSL.g:972:1: entryRuleOutputDataset returns [EObject current=null] : iv_ruleOutputDataset= ruleOutputDataset EOF ;
    public final EObject entryRuleOutputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:972:54: (iv_ruleOutputDataset= ruleOutputDataset EOF )
            // InternalAnalysisActivityDSL.g:973:2: iv_ruleOutputDataset= ruleOutputDataset EOF
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
    // InternalAnalysisActivityDSL.g:979:1: ruleOutputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? ) ;
    public final EObject ruleOutputDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_LIST_START_4=null;
        Token this_LIST_SEPARATOR_6=null;
        Token this_LIST_END_8=null;
        Token this_ENTITY_START_9=null;
        Token otherlv_10=null;
        Token this_ENTITY_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mimetype_3_0 = null;

        AntlrDatatypeRuleToken lv_minimumCardinality_5_0 = null;

        AntlrDatatypeRuleToken lv_maximumCardinality_7_0 = null;

        AntlrDatatypeRuleToken lv_remarks_11_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:985:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? ) )
            // InternalAnalysisActivityDSL.g:986:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? )
            {
            // InternalAnalysisActivityDSL.g:986:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )? )
            // InternalAnalysisActivityDSL.g:987:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:991:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:992:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:992:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:993:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1014:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_MULTILINE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1015:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1015:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1016:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_20); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:1037:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1038:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1038:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1039:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_20); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1060:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1061:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1061:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1062:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_25); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1083:3: (this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ENTITY_START) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1084:4: this_ENTITY_START_9= RULE_ENTITY_START otherlv_10= 'remarks' ( (lv_remarks_11_0= ruleEString ) ) this_ENTITY_END_12= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_26); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getOutputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    otherlv_10=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutputDatasetAccess().getRemarksKeyword_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:1092:4: ( (lv_remarks_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1093:5: (lv_remarks_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1093:5: (lv_remarks_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1094:6: lv_remarks_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputDatasetAccess().getRemarksEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_remarks_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                    						}
                    						set(
                    							current,
                    							"remarks",
                    							lv_remarks_11_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_ENTITY_END_12=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

                    				newLeafNode(this_ENTITY_END_12, grammarAccess.getOutputDatasetAccess().getENTITY_ENDTerminalRuleCall_9_3());
                    			

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
    // $ANTLR end "ruleOutputDataset"


    // $ANTLR start "entryRuleEBigInteger"
    // InternalAnalysisActivityDSL.g:1120:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalAnalysisActivityDSL.g:1120:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalAnalysisActivityDSL.g:1121:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalAnalysisActivityDSL.g:1127:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1133:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAnalysisActivityDSL.g:1134:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAnalysisActivityDSL.g:1134:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAnalysisActivityDSL.g:1135:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAnalysisActivityDSL.g:1135:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1136:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_27); 

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
    // InternalAnalysisActivityDSL.g:1153:1: entryRuleMinimunDatasetCardinalityConstraint returns [EObject current=null] : iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF ;
    public final EObject entryRuleMinimunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimunDatasetCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1153:76: (iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1154:2: iv_ruleMinimunDatasetCardinalityConstraint= ruleMinimunDatasetCardinalityConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1160:1: ruleMinimunDatasetCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MinimunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) ;
    public final EObject ruleMinimunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ENTITY_END_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1166:2: ( (otherlv_0= 'MinimunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1167:2: (otherlv_0= 'MinimunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1167:2: (otherlv_0= 'MinimunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1168:3: otherlv_0= 'MinimunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getMinimunDatasetCardinalityConstraintKeyword_0());
            		
            this_ENTITY_START_1=(Token)match(input,RULE_ENTITY_START,FOLLOW_28); 

            			newLeafNode(this_ENTITY_START_1, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getENTITY_STARTTerminalRuleCall_1());
            		
            // InternalAnalysisActivityDSL.g:1176:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1177:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1181:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1182:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1182:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1183:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1205:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1206:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1206:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1207:5: ruleEString
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

            this_ENTITY_END_6=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_6, grammarAccess.getMinimunDatasetCardinalityConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1229:1: entryRuleMaximunDatasetCardinalityConstraint returns [EObject current=null] : iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF ;
    public final EObject entryRuleMaximunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximunDatasetCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1229:76: (iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1230:2: iv_ruleMaximunDatasetCardinalityConstraint= ruleMaximunDatasetCardinalityConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1236:1: ruleMaximunDatasetCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MaximunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) ;
    public final EObject ruleMaximunDatasetCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ENTITY_END_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1242:2: ( (otherlv_0= 'MaximunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1243:2: (otherlv_0= 'MaximunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1243:2: (otherlv_0= 'MaximunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1244:3: otherlv_0= 'MaximunDatasetCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getMaximunDatasetCardinalityConstraintKeyword_0());
            		
            this_ENTITY_START_1=(Token)match(input,RULE_ENTITY_START,FOLLOW_28); 

            			newLeafNode(this_ENTITY_START_1, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getENTITY_STARTTerminalRuleCall_1());
            		
            // InternalAnalysisActivityDSL.g:1252:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1253:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1257:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1258:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1258:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1259:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1281:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1282:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1282:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1283:5: ruleEString
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

            this_ENTITY_END_6=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_6, grammarAccess.getMaximunDatasetCardinalityConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1305:1: entryRuleMinimunParameterCardinalityConstraint returns [EObject current=null] : iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF ;
    public final EObject entryRuleMinimunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimunParameterCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1305:78: (iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1306:2: iv_ruleMinimunParameterCardinalityConstraint= ruleMinimunParameterCardinalityConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1312:1: ruleMinimunParameterCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MinimunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) ;
    public final EObject ruleMinimunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ENTITY_END_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1318:2: ( (otherlv_0= 'MinimunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1319:2: (otherlv_0= 'MinimunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1319:2: (otherlv_0= 'MinimunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1320:3: otherlv_0= 'MinimunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getMinimunParameterCardinalityConstraintKeyword_0());
            		
            this_ENTITY_START_1=(Token)match(input,RULE_ENTITY_START,FOLLOW_29); 

            			newLeafNode(this_ENTITY_START_1, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getENTITY_STARTTerminalRuleCall_1());
            		
            // InternalAnalysisActivityDSL.g:1328:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1329:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1333:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1334:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1334:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1335:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMinimunParameterCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1357:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1358:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1358:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1359:5: ruleEString
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

            this_ENTITY_END_6=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_6, grammarAccess.getMinimunParameterCardinalityConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1381:1: entryRuleMaximunParameterCardinalityConstraint returns [EObject current=null] : iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF ;
    public final EObject entryRuleMaximunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximunParameterCardinalityConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1381:78: (iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF )
            // InternalAnalysisActivityDSL.g:1382:2: iv_ruleMaximunParameterCardinalityConstraint= ruleMaximunParameterCardinalityConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1388:1: ruleMaximunParameterCardinalityConstraint returns [EObject current=null] : (otherlv_0= 'MaximunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) ;
    public final EObject ruleMaximunParameterCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ENTITY_END_6=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1394:2: ( (otherlv_0= 'MaximunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1395:2: (otherlv_0= 'MaximunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1395:2: (otherlv_0= 'MaximunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1396:3: otherlv_0= 'MaximunParameterCardinalityConstraint' this_ENTITY_START_1= RULE_ENTITY_START (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )? otherlv_4= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_6= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getMaximunParameterCardinalityConstraintKeyword_0());
            		
            this_ENTITY_START_1=(Token)match(input,RULE_ENTITY_START,FOLLOW_29); 

            			newLeafNode(this_ENTITY_START_1, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getENTITY_STARTTerminalRuleCall_1());
            		
            // InternalAnalysisActivityDSL.g:1404:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1405:4: otherlv_2= 'value' ( (lv_value_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getValueKeyword_2_0());
                    			
                    // InternalAnalysisActivityDSL.g:1409:4: ( (lv_value_3_0= ruleEBigInteger ) )
                    // InternalAnalysisActivityDSL.g:1410:5: (lv_value_3_0= ruleEBigInteger )
                    {
                    // InternalAnalysisActivityDSL.g:1410:5: (lv_value_3_0= ruleEBigInteger )
                    // InternalAnalysisActivityDSL.g:1411:6: lv_value_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getMaximunParameterCardinalityConstraintAccess().getValueEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1433:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1434:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1434:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1435:5: ruleEString
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

            this_ENTITY_END_6=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_6, grammarAccess.getMaximunParameterCardinalityConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1457:1: entryRuleCustomParameterConstraint returns [EObject current=null] : iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF ;
    public final EObject entryRuleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomParameterConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1457:66: (iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF )
            // InternalAnalysisActivityDSL.g:1458:2: iv_ruleCustomParameterConstraint= ruleCustomParameterConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1464:1: ruleCustomParameterConstraint returns [EObject current=null] : (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomParameterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1470:2: ( (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1471:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1471:2: (otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1472:3: otherlv_0= 'CustomParameterConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'parameter' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomParameterConstraintAccess().getCustomParameterConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1476:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1477:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1477:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1478:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_11); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomParameterConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomParameterConstraintAccess().getParameterKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1503:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1504:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1504:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1505:5: ruleEString
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

            this_ENTITY_END_5=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_5, grammarAccess.getCustomParameterConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1527:1: entryRuleCustomDatasetConstraint returns [EObject current=null] : iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF ;
    public final EObject entryRuleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDatasetConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1527:64: (iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF )
            // InternalAnalysisActivityDSL.g:1528:2: iv_ruleCustomDatasetConstraint= ruleCustomDatasetConstraint EOF
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
    // InternalAnalysisActivityDSL.g:1534:1: ruleCustomDatasetConstraint returns [EObject current=null] : (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) ;
    public final EObject ruleCustomDatasetConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token this_ENTITY_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1540:2: ( (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1541:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1541:2: (otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1542:3: otherlv_0= 'CustomDatasetConstraint' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START otherlv_3= 'dataset' ( ( ruleEString ) ) this_ENTITY_END_5= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDatasetConstraintAccess().getCustomDatasetConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1546:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1547:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1547:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1548:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_8); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCustomDatasetConstraintAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDatasetConstraintAccess().getDatasetKeyword_3());
            		
            // InternalAnalysisActivityDSL.g:1573:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1574:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1574:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1575:5: ruleEString
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

            this_ENTITY_END_5=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_5, grammarAccess.getCustomDatasetConstraintAccess().getENTITY_ENDTerminalRuleCall_5());
            		

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
    // InternalAnalysisActivityDSL.g:1597:1: entryRuleCommandLineTool returns [EObject current=null] : iv_ruleCommandLineTool= ruleCommandLineTool EOF ;
    public final EObject entryRuleCommandLineTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineTool = null;


        try {
            // InternalAnalysisActivityDSL.g:1597:56: (iv_ruleCommandLineTool= ruleCommandLineTool EOF )
            // InternalAnalysisActivityDSL.g:1598:2: iv_ruleCommandLineTool= ruleCommandLineTool EOF
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
    // InternalAnalysisActivityDSL.g:1604:1: ruleCommandLineTool returns [EObject current=null] : (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )? otherlv_17= 'commandLineTemplate' this_LIST_START_18= RULE_LIST_START ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )* this_LIST_END_22= RULE_LIST_END (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )? this_ENTITY_END_29= RULE_ENTITY_END ) ;
    public final EObject ruleCommandLineTool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENTITY_START_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_ENTITY_START_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_ENTITY_END_16=null;
        Token otherlv_17=null;
        Token this_LIST_START_18=null;
        Token this_LIST_SEPARATOR_20=null;
        Token this_LIST_END_22=null;
        Token otherlv_23=null;
        Token this_LIST_START_24=null;
        Token this_LIST_SEPARATOR_26=null;
        Token this_LIST_END_28=null;
        Token this_ENTITY_END_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_executablePath_4_0 = null;

        EObject lv_commandLineTemplate_19_0 = null;

        EObject lv_commandLineTemplate_21_0 = null;

        EObject lv_exitCodes_25_0 = null;

        EObject lv_exitCodes_27_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1610:2: ( (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )? otherlv_17= 'commandLineTemplate' this_LIST_START_18= RULE_LIST_START ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )* this_LIST_END_22= RULE_LIST_END (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )? this_ENTITY_END_29= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1611:2: (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )? otherlv_17= 'commandLineTemplate' this_LIST_START_18= RULE_LIST_START ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )* this_LIST_END_22= RULE_LIST_END (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )? this_ENTITY_END_29= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1611:2: (otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )? otherlv_17= 'commandLineTemplate' this_LIST_START_18= RULE_LIST_START ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )* this_LIST_END_22= RULE_LIST_END (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )? this_ENTITY_END_29= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1612:3: otherlv_0= 'CommandLineTool' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )? (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )? otherlv_17= 'commandLineTemplate' this_LIST_START_18= RULE_LIST_START ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )* this_LIST_END_22= RULE_LIST_END (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )? this_ENTITY_END_29= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLineToolAccess().getCommandLineToolKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1616:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1617:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1617:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1618:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_30); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:1639:3: (otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1640:4: otherlv_3= 'executablePath' ( (lv_executablePath_4_0= ruleFilePath ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandLineToolAccess().getExecutablePathKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:1644:4: ( (lv_executablePath_4_0= ruleFilePath ) )
                    // InternalAnalysisActivityDSL.g:1645:5: (lv_executablePath_4_0= ruleFilePath )
                    {
                    // InternalAnalysisActivityDSL.g:1645:5: (lv_executablePath_4_0= ruleFilePath )
                    // InternalAnalysisActivityDSL.g:1646:6: lv_executablePath_4_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExecutablePathFilePathParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            // InternalAnalysisActivityDSL.g:1664:3: (otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1665:4: otherlv_5= 'pipe' this_ENTITY_START_6= RULE_ENTITY_START (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )? (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )? (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )? this_ENTITY_END_16= RULE_ENTITY_END
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandLineToolAccess().getPipeKeyword_4_0());
                    			
                    this_ENTITY_START_6=(Token)match(input,RULE_ENTITY_START,FOLLOW_32); 

                    				newLeafNode(this_ENTITY_START_6, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:1673:4: (otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==43) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1674:5: otherlv_7= 'stdin' otherlv_8= 'from' ( ( ruleEString ) )
                            {
                            otherlv_7=(Token)match(input,43,FOLLOW_33); 

                            					newLeafNode(otherlv_7, grammarAccess.getCommandLineToolAccess().getStdinKeyword_4_2_0());
                            				
                            otherlv_8=(Token)match(input,44,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getCommandLineToolAccess().getFromKeyword_4_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:1682:5: ( ( ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1683:6: ( ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1683:6: ( ruleEString )
                            // InternalAnalysisActivityDSL.g:1684:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineToolRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardInputStreamInputDatasetCrossReference_4_2_2_0());
                            						
                            pushFollow(FOLLOW_34);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:1699:4: (otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==45) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1700:5: otherlv_10= 'stdout' otherlv_11= 'to' ( ( ruleEString ) )
                            {
                            otherlv_10=(Token)match(input,45,FOLLOW_35); 

                            					newLeafNode(otherlv_10, grammarAccess.getCommandLineToolAccess().getStdoutKeyword_4_3_0());
                            				
                            otherlv_11=(Token)match(input,46,FOLLOW_3); 

                            					newLeafNode(otherlv_11, grammarAccess.getCommandLineToolAccess().getToKeyword_4_3_1());
                            				
                            // InternalAnalysisActivityDSL.g:1708:5: ( ( ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1709:6: ( ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1709:6: ( ruleEString )
                            // InternalAnalysisActivityDSL.g:1710:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineToolRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardOutputStreamOutputDatasetCrossReference_4_3_2_0());
                            						
                            pushFollow(FOLLOW_36);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:1725:4: (otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==47) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1726:5: otherlv_13= 'stderr' otherlv_14= 'to' ( ( ruleEString ) )
                            {
                            otherlv_13=(Token)match(input,47,FOLLOW_35); 

                            					newLeafNode(otherlv_13, grammarAccess.getCommandLineToolAccess().getStderrKeyword_4_4_0());
                            				
                            otherlv_14=(Token)match(input,46,FOLLOW_3); 

                            					newLeafNode(otherlv_14, grammarAccess.getCommandLineToolAccess().getToKeyword_4_4_1());
                            				
                            // InternalAnalysisActivityDSL.g:1734:5: ( ( ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1735:6: ( ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1735:6: ( ruleEString )
                            // InternalAnalysisActivityDSL.g:1736:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCommandLineToolRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getCommandLineToolAccess().getStandardErrorStreamOutputDatasetCrossReference_4_4_2_0());
                            						
                            pushFollow(FOLLOW_17);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_ENTITY_END_16=(Token)match(input,RULE_ENTITY_END,FOLLOW_37); 

                    				newLeafNode(this_ENTITY_END_16, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_4_5());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getCommandLineToolAccess().getCommandLineTemplateKeyword_5());
            		
            this_LIST_START_18=(Token)match(input,RULE_LIST_START,FOLLOW_38); 

            			newLeafNode(this_LIST_START_18, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1764:3: ( (lv_commandLineTemplate_19_0= ruleCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:1765:4: (lv_commandLineTemplate_19_0= ruleCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:1765:4: (lv_commandLineTemplate_19_0= ruleCommandLineEntryList )
            // InternalAnalysisActivityDSL.g:1766:5: lv_commandLineTemplate_19_0= ruleCommandLineEntryList
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_commandLineTemplate_19_0=ruleCommandLineEntryList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            					}
            					add(
            						current,
            						"commandLineTemplate",
            						lv_commandLineTemplate_19_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1783:3: (this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_LIST_SEPARATOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1784:4: this_LIST_SEPARATOR_20= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) )
            	    {
            	    this_LIST_SEPARATOR_20=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_38); 

            	    				newLeafNode(this_LIST_SEPARATOR_20, grammarAccess.getCommandLineToolAccess().getLIST_SEPARATORTerminalRuleCall_8_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1788:4: ( (lv_commandLineTemplate_21_0= ruleCommandLineEntryList ) )
            	    // InternalAnalysisActivityDSL.g:1789:5: (lv_commandLineTemplate_21_0= ruleCommandLineEntryList )
            	    {
            	    // InternalAnalysisActivityDSL.g:1789:5: (lv_commandLineTemplate_21_0= ruleCommandLineEntryList )
            	    // InternalAnalysisActivityDSL.g:1790:6: lv_commandLineTemplate_21_0= ruleCommandLineEntryList
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_commandLineTemplate_21_0=ruleCommandLineEntryList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commandLineTemplate",
            	    							lv_commandLineTemplate_21_0,
            	    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.CommandLineEntryList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            this_LIST_END_22=(Token)match(input,RULE_LIST_END,FOLLOW_39); 

            			newLeafNode(this_LIST_END_22, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_9());
            		
            // InternalAnalysisActivityDSL.g:1812:3: (otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1813:4: otherlv_23= 'returns' this_LIST_START_24= RULE_LIST_START ( (lv_exitCodes_25_0= ruleExitCode ) ) (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )* this_LIST_END_28= RULE_LIST_END
                    {
                    otherlv_23=(Token)match(input,49,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getCommandLineToolAccess().getReturnsKeyword_10_0());
                    			
                    this_LIST_START_24=(Token)match(input,RULE_LIST_START,FOLLOW_20); 

                    				newLeafNode(this_LIST_START_24, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_10_1());
                    			
                    // InternalAnalysisActivityDSL.g:1821:4: ( (lv_exitCodes_25_0= ruleExitCode ) )
                    // InternalAnalysisActivityDSL.g:1822:5: (lv_exitCodes_25_0= ruleExitCode )
                    {
                    // InternalAnalysisActivityDSL.g:1822:5: (lv_exitCodes_25_0= ruleExitCode )
                    // InternalAnalysisActivityDSL.g:1823:6: lv_exitCodes_25_0= ruleExitCode
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exitCodes_25_0=ruleExitCode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    						}
                    						add(
                    							current,
                    							"exitCodes",
                    							lv_exitCodes_25_0,
                    							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnalysisActivityDSL.g:1840:4: (this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_LIST_SEPARATOR) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1841:5: this_LIST_SEPARATOR_26= RULE_LIST_SEPARATOR ( (lv_exitCodes_27_0= ruleExitCode ) )
                    	    {
                    	    this_LIST_SEPARATOR_26=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_20); 

                    	    					newLeafNode(this_LIST_SEPARATOR_26, grammarAccess.getCommandLineToolAccess().getLIST_SEPARATORTerminalRuleCall_10_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:1845:5: ( (lv_exitCodes_27_0= ruleExitCode ) )
                    	    // InternalAnalysisActivityDSL.g:1846:6: (lv_exitCodes_27_0= ruleExitCode )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1846:6: (lv_exitCodes_27_0= ruleExitCode )
                    	    // InternalAnalysisActivityDSL.g:1847:7: lv_exitCodes_27_0= ruleExitCode
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_exitCodes_27_0=ruleExitCode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandLineToolRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exitCodes",
                    	    								lv_exitCodes_27_0,
                    	    								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.ExitCode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    this_LIST_END_28=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

                    				newLeafNode(this_LIST_END_28, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_10_4());
                    			

                    }
                    break;

            }

            this_ENTITY_END_29=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_29, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_11());
            		

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
    // InternalAnalysisActivityDSL.g:1878:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalAnalysisActivityDSL.g:1878:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalAnalysisActivityDSL.g:1879:2: iv_ruleFilePath= ruleFilePath EOF
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
    // InternalAnalysisActivityDSL.g:1885:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1891:2: (this_EString_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1892:2: this_EString_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:1905:1: entryRuleExitCode returns [EObject current=null] : iv_ruleExitCode= ruleExitCode EOF ;
    public final EObject entryRuleExitCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitCode = null;


        try {
            // InternalAnalysisActivityDSL.g:1905:49: (iv_ruleExitCode= ruleExitCode EOF )
            // InternalAnalysisActivityDSL.g:1906:2: iv_ruleExitCode= ruleExitCode EOF
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
    // InternalAnalysisActivityDSL.g:1912:1: ruleExitCode returns [EObject current=null] : ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? ) ;
    public final EObject ruleExitCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_code_0_0 = null;

        Enumerator lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_reportMessage_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1918:2: ( ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? ) )
            // InternalAnalysisActivityDSL.g:1919:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? )
            {
            // InternalAnalysisActivityDSL.g:1919:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? )
            // InternalAnalysisActivityDSL.g:1920:3: ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )?
            {
            // InternalAnalysisActivityDSL.g:1920:3: ( (lv_code_0_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1921:4: (lv_code_0_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1921:4: (lv_code_0_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1922:5: lv_code_0_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getCodeEBigIntegerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_1=(Token)match(input,50,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getExitCodeAccess().getIfKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1943:3: ( (lv_status_2_0= ruleTerminationStatus ) )
            // InternalAnalysisActivityDSL.g:1944:4: (lv_status_2_0= ruleTerminationStatus )
            {
            // InternalAnalysisActivityDSL.g:1944:4: (lv_status_2_0= ruleTerminationStatus )
            // InternalAnalysisActivityDSL.g:1945:5: lv_status_2_0= ruleTerminationStatus
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getStatusTerminationStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalAnalysisActivityDSL.g:1962:3: ( (lv_reportMessage_3_0= ruleEString ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_MULTILINE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1963:4: (lv_reportMessage_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1963:4: (lv_reportMessage_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1964:5: lv_reportMessage_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getExitCodeAccess().getReportMessageEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalAnalysisActivityDSL.g:1985:1: entryRuleToolNameCommandLineEntry returns [EObject current=null] : iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF ;
    public final EObject entryRuleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolNameCommandLineEntry = null;


        try {
            // InternalAnalysisActivityDSL.g:1985:65: (iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF )
            // InternalAnalysisActivityDSL.g:1986:2: iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF
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
    // InternalAnalysisActivityDSL.g:1992:1: ruleToolNameCommandLineEntry returns [EObject current=null] : ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1998:2: ( ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:1999:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:1999:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2000:3: () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2000:3: ()
            // InternalAnalysisActivityDSL.g:2001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getToolNameCommandLineEntryAccess().getToolnameKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:2011:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_PIPE_TO) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2012:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_44); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getToolNameCommandLineEntryAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2016:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2017:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2017:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2018:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop34;
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
    // InternalAnalysisActivityDSL.g:2040:1: entryRuleLiteralCommandLineEntryList returns [EObject current=null] : iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF ;
    public final EObject entryRuleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2040:68: (iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2041:2: iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2047:1: ruleLiteralCommandLineEntryList returns [EObject current=null] : ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) ;
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
            // InternalAnalysisActivityDSL.g:2053:2: ( ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2054:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2054:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2055:3: () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:2055:3: ()
            // InternalAnalysisActivityDSL.g:2056:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsKeyword_1());
            		
            this_LIST_START_2=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

            			newLeafNode(this_LIST_START_2, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:2070:3: ( (lv_literals_3_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2071:4: (lv_literals_3_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2071:4: (lv_literals_3_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2072:5: lv_literals_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalAnalysisActivityDSL.g:2089:3: (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_LIST_SEPARATOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2090:4: this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) )
            	    {
            	    this_LIST_SEPARATOR_4=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_3); 

            	    				newLeafNode(this_LIST_SEPARATOR_4, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_SEPARATORTerminalRuleCall_4_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2094:4: ( (lv_literals_5_0= ruleEString ) )
            	    // InternalAnalysisActivityDSL.g:2095:5: (lv_literals_5_0= ruleEString )
            	    {
            	    // InternalAnalysisActivityDSL.g:2095:5: (lv_literals_5_0= ruleEString )
            	    // InternalAnalysisActivityDSL.g:2096:6: lv_literals_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_4_1_0());
            	    					
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


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_LIST_END_6=(Token)match(input,RULE_LIST_END,FOLLOW_43); 

            			newLeafNode(this_LIST_END_6, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_5());
            		
            // InternalAnalysisActivityDSL.g:2118:3: (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_PIPE_TO) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2119:4: this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_7=(Token)match(input,RULE_PIPE_TO,FOLLOW_44); 

            	    				newLeafNode(this_PIPE_TO_7, grammarAccess.getLiteralCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_6_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2123:4: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2124:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2124:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2125:6: lv_manipulators_8_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop36;
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
    // InternalAnalysisActivityDSL.g:2147:1: entryRuleDatasetCommandLineEntryList returns [EObject current=null] : iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF ;
    public final EObject entryRuleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2147:68: (iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2148:2: iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2154:1: ruleDatasetCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2160:2: ( (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2161:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2161:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2162:3: otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2166:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2167:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2167:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2168:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetDatasetCrossReference_1_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2182:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_PIPE_TO) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2183:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_44); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getDatasetCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2187:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2188:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2188:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2189:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop37;
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
    // InternalAnalysisActivityDSL.g:2211:1: entryRuleParameterCommandLineEntryList returns [EObject current=null] : iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF ;
    public final EObject entryRuleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:2211:70: (iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:2212:2: iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:2218:1: ruleParameterCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2224:2: ( (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:2225:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:2225:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:2226:3: otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterCommandLineEntryListAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2230:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:2231:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2231:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:2232:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getParameterParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:2246:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_PIPE_TO) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2247:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_44); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getParameterCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2251:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2252:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2252:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2253:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
            	    break loop38;
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
    // InternalAnalysisActivityDSL.g:2275:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalAnalysisActivityDSL.g:2275:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalAnalysisActivityDSL.g:2276:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalAnalysisActivityDSL.g:2282:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_delimiter_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2288:2: ( (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2289:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2289:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2290:3: otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2294:3: ( (lv_delimiter_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2295:4: (lv_delimiter_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2295:4: (lv_delimiter_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2296:5: lv_delimiter_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2317:1: entryRulePrependEach returns [EObject current=null] : iv_rulePrependEach= rulePrependEach EOF ;
    public final EObject entryRulePrependEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2317:52: (iv_rulePrependEach= rulePrependEach EOF )
            // InternalAnalysisActivityDSL.g:2318:2: iv_rulePrependEach= rulePrependEach EOF
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
    // InternalAnalysisActivityDSL.g:2324:1: rulePrependEach returns [EObject current=null] : (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2330:2: ( (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2331:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2331:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2332:3: otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependEachAccess().getPrependEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2336:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2337:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2337:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2338:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2359:1: entryRuleAppendEach returns [EObject current=null] : iv_ruleAppendEach= ruleAppendEach EOF ;
    public final EObject entryRuleAppendEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2359:51: (iv_ruleAppendEach= ruleAppendEach EOF )
            // InternalAnalysisActivityDSL.g:2360:2: iv_ruleAppendEach= ruleAppendEach EOF
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
    // InternalAnalysisActivityDSL.g:2366:1: ruleAppendEach returns [EObject current=null] : (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2372:2: ( (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2373:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2373:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2374:3: otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendEachAccess().getAppendEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2378:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2379:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2379:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2380:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2401:1: entryRuleAppendListWith returns [EObject current=null] : iv_ruleAppendListWith= ruleAppendListWith EOF ;
    public final EObject entryRuleAppendListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2401:55: (iv_ruleAppendListWith= ruleAppendListWith EOF )
            // InternalAnalysisActivityDSL.g:2402:2: iv_ruleAppendListWith= ruleAppendListWith EOF
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
    // InternalAnalysisActivityDSL.g:2408:1: ruleAppendListWith returns [EObject current=null] : (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2414:2: ( (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2415:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2415:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2416:3: otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendListWithAccess().getAppendListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2420:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2421:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2421:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2422:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2443:1: entryRulePrependListWith returns [EObject current=null] : iv_rulePrependListWith= rulePrependListWith EOF ;
    public final EObject entryRulePrependListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2443:56: (iv_rulePrependListWith= rulePrependListWith EOF )
            // InternalAnalysisActivityDSL.g:2444:2: iv_rulePrependListWith= rulePrependListWith EOF
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
    // InternalAnalysisActivityDSL.g:2450:1: rulePrependListWith returns [EObject current=null] : (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2456:2: ( (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2457:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2457:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2458:3: otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependListWithAccess().getPrependListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2462:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2463:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2463:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2464:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2485:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2491:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalAnalysisActivityDSL.g:2492:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalAnalysisActivityDSL.g:2492:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case 60:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2493:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalAnalysisActivityDSL.g:2493:3: (enumLiteral_0= 'STRING' )
                    // InternalAnalysisActivityDSL.g:2494:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2501:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalAnalysisActivityDSL.g:2501:3: (enumLiteral_1= 'INTEGER' )
                    // InternalAnalysisActivityDSL.g:2502:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:2509:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalAnalysisActivityDSL.g:2509:3: (enumLiteral_2= 'REAL' )
                    // InternalAnalysisActivityDSL.g:2510:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAnalysisActivityDSL.g:2520:1: ruleTerminationStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) ;
    public final Enumerator ruleTerminationStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2526:2: ( ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) )
            // InternalAnalysisActivityDSL.g:2527:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            {
            // InternalAnalysisActivityDSL.g:2527:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            else if ( (LA40_0==62) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2528:3: (enumLiteral_0= 'SUCCEEDED' )
                    {
                    // InternalAnalysisActivityDSL.g:2528:3: (enumLiteral_0= 'SUCCEEDED' )
                    // InternalAnalysisActivityDSL.g:2529:4: enumLiteral_0= 'SUCCEEDED'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2536:3: (enumLiteral_1= 'FAILED' )
                    {
                    // InternalAnalysisActivityDSL.g:2536:3: (enumLiteral_1= 'FAILED' )
                    // InternalAnalysisActivityDSL.g:2537:4: enumLiteral_1= 'FAILED'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000FA00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001060000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000A80000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000A00000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0018000048000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000E02L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x03E0000000000000L});

}