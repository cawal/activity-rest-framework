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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTITY_START", "RULE_STATEMENT_END", "RULE_ENTITY_END", "RULE_MULTILINE_STRING", "RULE_STRING", "RULE_ID", "RULE_LIST_START", "RULE_LIST_SEPARATOR", "RULE_LIST_END", "RULE_INT", "RULE_PIPE_TO", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'remark'", "'on'", "'with'", "'produces'", "'using'", "'parameter'", "':'", "'='", "'constraints'", "'dataset'", "'-'", "'constraint'", "'executable'", "'redirecting'", "'stdin'", "'from'", "'stdout'", "'to'", "'stderr'", "'commandLineTemplate'", "'returns'", "'if'", "'toolname'", "'literals'", "'Join'", "'PrependEach'", "'AppendEach'", "'AppendListWith'", "'PrependListWith'", "'STRING'", "'INTEGER'", "'REAL'", "'SUCCEEDED'", "'FAILED'"
    };
    public static final int T__50=50;
    public static final int RULE_LIST_END=12;
    public static final int T__19=19;
    public static final int RULE_ENTITY_START=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=9;
    public static final int RULE_ENTITY_END=6;
    public static final int RULE_LIST_SEPARATOR=11;
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
    public static final int RULE_LIST_START=10;
    public static final int RULE_STRING=8;
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
    public static final int RULE_MULTILINE_STRING=7;
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
    // InternalAnalysisActivityDSL.g:72:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'using' ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) ) this_ENTITY_END_23= RULE_ENTITY_END ) ;
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
        Token this_ENTITY_END_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_remark_4_0 = null;

        EObject lv_inputDatasets_8_0 = null;

        EObject lv_inputDatasets_9_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_outputDatasets_18_0 = null;

        EObject lv_outputDatasets_19_0 = null;

        EObject lv_functionalEntity_22_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:78:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'using' ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) ) this_ENTITY_END_23= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'using' ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) ) this_ENTITY_END_23= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:79:2: (otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'using' ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) ) this_ENTITY_END_23= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:80:3: otherlv_0= 'activity' ( (lv_name_1_0= ruleIdentifier ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'on' this_ENTITY_START_7= RULE_ENTITY_START ( (lv_inputDatasets_8_0= ruleInputDataset ) ) ( (lv_inputDatasets_9_0= ruleInputDataset ) )* this_ENTITY_END_10= RULE_ENTITY_END )? (otherlv_11= 'with' this_ENTITY_START_12= RULE_ENTITY_START ( (lv_parameters_13_0= ruleParameter ) ) ( (lv_parameters_14_0= ruleParameter ) )* this_ENTITY_END_15= RULE_ENTITY_END )? (otherlv_16= 'produces' this_ENTITY_START_17= RULE_ENTITY_START ( (lv_outputDatasets_18_0= ruleOutputDataset ) ) ( (lv_outputDatasets_19_0= ruleOutputDataset ) )* this_ENTITY_END_20= RULE_ENTITY_END )? otherlv_21= 'using' ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) ) this_ENTITY_END_23= RULE_ENTITY_END
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

                        if ( (LA2_0==29) ) {
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

                        if ( (LA4_0==25) ) {
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

                        if ( (LA6_0==29) ) {
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

            otherlv_21=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_21, grammarAccess.getActivityAccess().getUsingKeyword_7());
            		
            // InternalAnalysisActivityDSL.g:296:3: ( (lv_functionalEntity_22_0= ruleFunctionalEntity ) )
            // InternalAnalysisActivityDSL.g:297:4: (lv_functionalEntity_22_0= ruleFunctionalEntity )
            {
            // InternalAnalysisActivityDSL.g:297:4: (lv_functionalEntity_22_0= ruleFunctionalEntity )
            // InternalAnalysisActivityDSL.g:298:5: lv_functionalEntity_22_0= ruleFunctionalEntity
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getFunctionalEntityFunctionalEntityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_functionalEntity_22_0=ruleFunctionalEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"functionalEntity",
            						lv_functionalEntity_22_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.FunctionalEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENTITY_END_23=(Token)match(input,RULE_ENTITY_END,FOLLOW_2); 

            			newLeafNode(this_ENTITY_END_23, grammarAccess.getActivityAccess().getENTITY_ENDTerminalRuleCall_9());
            		

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


    // $ANTLR start "entryRuleFunctionalEntity"
    // InternalAnalysisActivityDSL.g:323:1: entryRuleFunctionalEntity returns [EObject current=null] : iv_ruleFunctionalEntity= ruleFunctionalEntity EOF ;
    public final EObject entryRuleFunctionalEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalEntity = null;


        try {
            // InternalAnalysisActivityDSL.g:323:57: (iv_ruleFunctionalEntity= ruleFunctionalEntity EOF )
            // InternalAnalysisActivityDSL.g:324:2: iv_ruleFunctionalEntity= ruleFunctionalEntity EOF
            {
             newCompositeNode(grammarAccess.getFunctionalEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalEntity=ruleFunctionalEntity();

            state._fsp--;

             current =iv_ruleFunctionalEntity; 
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
    // $ANTLR end "entryRuleFunctionalEntity"


    // $ANTLR start "ruleFunctionalEntity"
    // InternalAnalysisActivityDSL.g:330:1: ruleFunctionalEntity returns [EObject current=null] : this_CommandLineTool_0= ruleCommandLineTool ;
    public final EObject ruleFunctionalEntity() throws RecognitionException {
        EObject current = null;

        EObject this_CommandLineTool_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:336:2: (this_CommandLineTool_0= ruleCommandLineTool )
            // InternalAnalysisActivityDSL.g:337:2: this_CommandLineTool_0= ruleCommandLineTool
            {

            		newCompositeNode(grammarAccess.getFunctionalEntityAccess().getCommandLineToolParserRuleCall());
            	
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
    // $ANTLR end "ruleFunctionalEntity"


    // $ANTLR start "entryRuleCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:348:1: entryRuleCommandLineEntryList returns [EObject current=null] : iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF ;
    public final EObject entryRuleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:348:61: (iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:349:2: iv_ruleCommandLineEntryList= ruleCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:355:1: ruleCommandLineEntryList returns [EObject current=null] : (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) ;
    public final EObject ruleCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject this_ToolNameCommandLineEntry_0 = null;

        EObject this_LiteralCommandLineEntryList_1 = null;

        EObject this_DatasetCommandLineEntryList_2 = null;

        EObject this_ParameterCommandLineEntryList_3 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:361:2: ( (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:362:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:362:2: (this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry | this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList | this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList | this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:363:3: this_ToolNameCommandLineEntry_0= ruleToolNameCommandLineEntry
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
                    // InternalAnalysisActivityDSL.g:372:3: this_LiteralCommandLineEntryList_1= ruleLiteralCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:381:3: this_DatasetCommandLineEntryList_2= ruleDatasetCommandLineEntryList
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
                    // InternalAnalysisActivityDSL.g:390:3: this_ParameterCommandLineEntryList_3= ruleParameterCommandLineEntryList
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
    // InternalAnalysisActivityDSL.g:402:1: entryRuleStringListManipulator returns [EObject current=null] : iv_ruleStringListManipulator= ruleStringListManipulator EOF ;
    public final EObject entryRuleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringListManipulator = null;


        try {
            // InternalAnalysisActivityDSL.g:402:62: (iv_ruleStringListManipulator= ruleStringListManipulator EOF )
            // InternalAnalysisActivityDSL.g:403:2: iv_ruleStringListManipulator= ruleStringListManipulator EOF
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
    // InternalAnalysisActivityDSL.g:409:1: ruleStringListManipulator returns [EObject current=null] : (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) ;
    public final EObject ruleStringListManipulator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_PrependEach_1 = null;

        EObject this_AppendEach_2 = null;

        EObject this_AppendListWith_3 = null;

        EObject this_PrependListWith_4 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:415:2: ( (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith ) )
            // InternalAnalysisActivityDSL.g:416:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            {
            // InternalAnalysisActivityDSL.g:416:2: (this_Join_0= ruleJoin | this_PrependEach_1= rulePrependEach | this_AppendEach_2= ruleAppendEach | this_AppendListWith_3= ruleAppendListWith | this_PrependListWith_4= rulePrependListWith )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case 46:
                {
                alt9=3;
                }
                break;
            case 47:
                {
                alt9=4;
                }
                break;
            case 48:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:417:3: this_Join_0= ruleJoin
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
                    // InternalAnalysisActivityDSL.g:426:3: this_PrependEach_1= rulePrependEach
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
                    // InternalAnalysisActivityDSL.g:435:3: this_AppendEach_2= ruleAppendEach
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
                    // InternalAnalysisActivityDSL.g:444:3: this_AppendListWith_3= ruleAppendListWith
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
                    // InternalAnalysisActivityDSL.g:453:3: this_PrependListWith_4= rulePrependListWith
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
    // InternalAnalysisActivityDSL.g:465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAnalysisActivityDSL.g:465:47: (iv_ruleEString= ruleEString EOF )
            // InternalAnalysisActivityDSL.g:466:2: iv_ruleEString= ruleEString EOF
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
    // InternalAnalysisActivityDSL.g:472:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTILINE_STRING_0=null;
        Token this_STRING_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:478:2: ( (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID ) )
            // InternalAnalysisActivityDSL.g:479:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            {
            // InternalAnalysisActivityDSL.g:479:2: (this_MULTILINE_STRING_0= RULE_MULTILINE_STRING | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_MULTILINE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:480:3: this_MULTILINE_STRING_0= RULE_MULTILINE_STRING
                    {
                    this_MULTILINE_STRING_0=(Token)match(input,RULE_MULTILINE_STRING,FOLLOW_2); 

                    			current.merge(this_MULTILINE_STRING_0);
                    		

                    			newLeafNode(this_MULTILINE_STRING_0, grammarAccess.getEStringAccess().getMULTILINE_STRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:488:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:496:3: this_ID_2= RULE_ID
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
    // InternalAnalysisActivityDSL.g:507:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalAnalysisActivityDSL.g:507:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalAnalysisActivityDSL.g:508:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalAnalysisActivityDSL.g:514:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:520:2: (this_ID_0= RULE_ID )
            // InternalAnalysisActivityDSL.g:521:2: this_ID_0= RULE_ID
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
    // InternalAnalysisActivityDSL.g:531:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAnalysisActivityDSL.g:531:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAnalysisActivityDSL.g:532:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAnalysisActivityDSL.g:538:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) ;
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
            // InternalAnalysisActivityDSL.g:544:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:545:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:545:2: (otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:546:3: otherlv_0= 'parameter' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_parameterType_3_0= ruleParameterType ) ) this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )? (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )? this_STATEMENT_END_26= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:550:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:551:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:551:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:552:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:573:3: ( (lv_parameterType_3_0= ruleParameterType ) )
            // InternalAnalysisActivityDSL.g:574:4: (lv_parameterType_3_0= ruleParameterType )
            {
            // InternalAnalysisActivityDSL.g:574:4: (lv_parameterType_3_0= ruleParameterType )
            // InternalAnalysisActivityDSL.g:575:5: lv_parameterType_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeParameterTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_21); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:596:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:597:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:597:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:598:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_21); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:619:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:620:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:620:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:621:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_24); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:642:3: (otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:643:4: otherlv_9= '=' this_LIST_START_10= RULE_LIST_START ( (lv_defaultValue_11_0= ruleEString ) ) (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )* this_LIST_END_14= RULE_LIST_END
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getEqualsSignKeyword_9_0());
                    			
                    this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_6); 

                    				newLeafNode(this_LIST_START_10, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_9_1());
                    			
                    // InternalAnalysisActivityDSL.g:651:4: ( (lv_defaultValue_11_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:652:5: (lv_defaultValue_11_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:652:5: (lv_defaultValue_11_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:653:6: lv_defaultValue_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalAnalysisActivityDSL.g:670:4: (this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_LIST_SEPARATOR) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:671:5: this_LIST_SEPARATOR_12= RULE_LIST_SEPARATOR ( (lv_defaultValue_13_0= ruleEString ) )
                    	    {
                    	    this_LIST_SEPARATOR_12=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_6); 

                    	    					newLeafNode(this_LIST_SEPARATOR_12, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_9_3_0());
                    	    				
                    	    // InternalAnalysisActivityDSL.g:675:5: ( (lv_defaultValue_13_0= ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:676:6: (lv_defaultValue_13_0= ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:676:6: (lv_defaultValue_13_0= ruleEString )
                    	    // InternalAnalysisActivityDSL.g:677:7: lv_defaultValue_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getDefaultValueEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop11;
                        }
                    } while (true);

                    this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_26); 

                    				newLeafNode(this_LIST_END_14, grammarAccess.getParameterAccess().getLIST_ENDTerminalRuleCall_9_4());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:700:3: (this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ENTITY_START) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:701:4: this_ENTITY_START_15= RULE_ENTITY_START (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )? (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )? this_ENTITY_END_25= RULE_ENTITY_END
                    {
                    this_ENTITY_START_15=(Token)match(input,RULE_ENTITY_START,FOLLOW_27); 

                    				newLeafNode(this_ENTITY_START_15, grammarAccess.getParameterAccess().getENTITY_STARTTerminalRuleCall_10_0());
                    			
                    // InternalAnalysisActivityDSL.g:705:4: (otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==20) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:706:5: otherlv_16= 'remark' ( (lv_remark_17_0= ruleEString ) ) this_STATEMENT_END_18= RULE_STATEMENT_END
                            {
                            otherlv_16=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getRemarkKeyword_10_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:710:5: ( (lv_remark_17_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:711:6: (lv_remark_17_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:711:6: (lv_remark_17_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:712:7: lv_remark_17_0= ruleEString
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

                            this_STATEMENT_END_18=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            					newLeafNode(this_STATEMENT_END_18, grammarAccess.getParameterAccess().getSTATEMENT_ENDTerminalRuleCall_10_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:734:4: (otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:735:5: otherlv_19= 'constraints' this_LIST_START_20= RULE_LIST_START ( (lv_constraints_21_0= ruleConstraint ) ) (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )* this_LIST_END_24= RULE_LIST_END
                            {
                            otherlv_19=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_19, grammarAccess.getParameterAccess().getConstraintsKeyword_10_2_0());
                            				
                            this_LIST_START_20=(Token)match(input,RULE_LIST_START,FOLLOW_29); 

                            					newLeafNode(this_LIST_START_20, grammarAccess.getParameterAccess().getLIST_STARTTerminalRuleCall_10_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:743:5: ( (lv_constraints_21_0= ruleConstraint ) )
                            // InternalAnalysisActivityDSL.g:744:6: (lv_constraints_21_0= ruleConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:744:6: (lv_constraints_21_0= ruleConstraint )
                            // InternalAnalysisActivityDSL.g:745:7: lv_constraints_21_0= ruleConstraint
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_10_2_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_constraints_21_0=ruleConstraint();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterRule());
                            							}
                            							add(
                            								current,
                            								"constraints",
                            								lv_constraints_21_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAnalysisActivityDSL.g:762:5: (this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_LIST_SEPARATOR) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:763:6: this_LIST_SEPARATOR_22= RULE_LIST_SEPARATOR ( (lv_constraints_23_0= ruleConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_22=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_29); 

                            	    						newLeafNode(this_LIST_SEPARATOR_22, grammarAccess.getParameterAccess().getLIST_SEPARATORTerminalRuleCall_10_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:767:6: ( (lv_constraints_23_0= ruleConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:768:7: (lv_constraints_23_0= ruleConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:768:7: (lv_constraints_23_0= ruleConstraint )
                            	    // InternalAnalysisActivityDSL.g:769:8: lv_constraints_23_0= ruleConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterAccess().getConstraintsConstraintParserRuleCall_10_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_constraints_23_0=ruleConstraint();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getParameterRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"constraints",
                            	    									lv_constraints_23_0,
                            	    									"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            this_LIST_END_24=(Token)match(input,RULE_LIST_END,FOLLOW_17); 

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
    // InternalAnalysisActivityDSL.g:805:1: entryRuleInputDataset returns [EObject current=null] : iv_ruleInputDataset= ruleInputDataset EOF ;
    public final EObject entryRuleInputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:805:53: (iv_ruleInputDataset= ruleInputDataset EOF )
            // InternalAnalysisActivityDSL.g:806:2: iv_ruleInputDataset= ruleInputDataset EOF
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
    // InternalAnalysisActivityDSL.g:812:1: ruleInputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
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
            // InternalAnalysisActivityDSL.g:818:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:819:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:819:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:820:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:824:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:825:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:825:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:826:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:847:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_MULTILINE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:848:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:848:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:849:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getInputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_21); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:870:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:871:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:871:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:872:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_21); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:893:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:894:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:894:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:895:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getInputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_26); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:916:3: (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ENTITY_START) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:917:4: this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_27); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getInputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:921:4: (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==20) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:922:5: otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getInputDatasetAccess().getRemarkKeyword_9_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:926:5: ( (lv_remark_11_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:927:6: (lv_remark_11_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:927:6: (lv_remark_11_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:928:7: lv_remark_11_0= ruleEString
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

                            this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            					newLeafNode(this_STATEMENT_END_12, grammarAccess.getInputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:950:4: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:951:5: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            {
                            otherlv_13=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_13, grammarAccess.getInputDatasetAccess().getConstraintsKeyword_9_2_0());
                            				
                            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_29); 

                            					newLeafNode(this_LIST_START_14, grammarAccess.getInputDatasetAccess().getLIST_STARTTerminalRuleCall_9_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:959:5: ( (lv_constraints_15_0= ruleConstraint ) )
                            // InternalAnalysisActivityDSL.g:960:6: (lv_constraints_15_0= ruleConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:960:6: (lv_constraints_15_0= ruleConstraint )
                            // InternalAnalysisActivityDSL.g:961:7: lv_constraints_15_0= ruleConstraint
                            {

                            							newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsConstraintParserRuleCall_9_2_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_constraints_15_0=ruleConstraint();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                            							}
                            							add(
                            								current,
                            								"constraints",
                            								lv_constraints_15_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAnalysisActivityDSL.g:978:5: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_LIST_SEPARATOR) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:979:6: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_29); 

                            	    						newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getInputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:983:6: ( (lv_constraints_17_0= ruleConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:984:7: (lv_constraints_17_0= ruleConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:984:7: (lv_constraints_17_0= ruleConstraint )
                            	    // InternalAnalysisActivityDSL.g:985:8: lv_constraints_17_0= ruleConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getInputDatasetAccess().getConstraintsConstraintParserRuleCall_9_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_constraints_17_0=ruleConstraint();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getInputDatasetRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"constraints",
                            	    									lv_constraints_17_0,
                            	    									"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_7); 

                            					newLeafNode(this_LIST_END_18, grammarAccess.getInputDatasetAccess().getLIST_ENDTerminalRuleCall_9_2_4());
                            				
                            this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_17); 

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
    // InternalAnalysisActivityDSL.g:1025:1: entryRuleOutputDataset returns [EObject current=null] : iv_ruleOutputDataset= ruleOutputDataset EOF ;
    public final EObject entryRuleOutputDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDataset = null;


        try {
            // InternalAnalysisActivityDSL.g:1025:54: (iv_ruleOutputDataset= ruleOutputDataset EOF )
            // InternalAnalysisActivityDSL.g:1026:2: iv_ruleOutputDataset= ruleOutputDataset EOF
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
    // InternalAnalysisActivityDSL.g:1032:1: ruleOutputDataset returns [EObject current=null] : (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) ;
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
            // InternalAnalysisActivityDSL.g:1038:2: ( (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:1039:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:1039:2: (otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:1040:3: otherlv_0= 'dataset' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_mimetype_3_0= ruleEString ) )? this_LIST_START_4= RULE_LIST_START ( (lv_minimumCardinality_5_0= ruleEBigInteger ) ) this_LIST_SEPARATOR_6= RULE_LIST_SEPARATOR ( (lv_maximumCardinality_7_0= ruleEBigInteger ) ) this_LIST_END_8= RULE_LIST_END (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )? this_STATEMENT_END_21= RULE_STATEMENT_END
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDatasetAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1044:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1045:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1045:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1046:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDatasetAccess().getColonKeyword_2());
            		
            // InternalAnalysisActivityDSL.g:1067:3: ( (lv_mimetype_3_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_MULTILINE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1068:4: (lv_mimetype_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1068:4: (lv_mimetype_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1069:5: lv_mimetype_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMimetypeEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
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

            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_21); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalAnalysisActivityDSL.g:1090:3: ( (lv_minimumCardinality_5_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1091:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1091:4: (lv_minimumCardinality_5_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1092:5: lv_minimumCardinality_5_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMinimumCardinalityEBigIntegerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            this_LIST_SEPARATOR_6=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_21); 

            			newLeafNode(this_LIST_SEPARATOR_6, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1113:3: ( (lv_maximumCardinality_7_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1114:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1114:4: (lv_maximumCardinality_7_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1115:5: lv_maximumCardinality_7_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getOutputDatasetAccess().getMaximumCardinalityEBigIntegerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
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

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_26); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_8());
            		
            // InternalAnalysisActivityDSL.g:1136:3: (this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ENTITY_START) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1137:4: this_ENTITY_START_9= RULE_ENTITY_START (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )? (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )? this_ENTITY_END_20= RULE_ENTITY_END
                    {
                    this_ENTITY_START_9=(Token)match(input,RULE_ENTITY_START,FOLLOW_27); 

                    				newLeafNode(this_ENTITY_START_9, grammarAccess.getOutputDatasetAccess().getENTITY_STARTTerminalRuleCall_9_0());
                    			
                    // InternalAnalysisActivityDSL.g:1141:4: (otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==20) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1142:5: otherlv_10= 'remark' ( (lv_remark_11_0= ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getOutputDatasetAccess().getRemarkKeyword_9_1_0());
                            				
                            // InternalAnalysisActivityDSL.g:1146:5: ( (lv_remark_11_0= ruleEString ) )
                            // InternalAnalysisActivityDSL.g:1147:6: (lv_remark_11_0= ruleEString )
                            {
                            // InternalAnalysisActivityDSL.g:1147:6: (lv_remark_11_0= ruleEString )
                            // InternalAnalysisActivityDSL.g:1148:7: lv_remark_11_0= ruleEString
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

                            this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_28); 

                            					newLeafNode(this_STATEMENT_END_12, grammarAccess.getOutputDatasetAccess().getSTATEMENT_ENDTerminalRuleCall_9_1_2());
                            				

                            }
                            break;

                    }

                    // InternalAnalysisActivityDSL.g:1170:4: (otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:1171:5: otherlv_13= 'constraints' this_LIST_START_14= RULE_LIST_START ( (lv_constraints_15_0= ruleConstraint ) ) (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )* this_LIST_END_18= RULE_LIST_END this_STATEMENT_END_19= RULE_STATEMENT_END
                            {
                            otherlv_13=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_13, grammarAccess.getOutputDatasetAccess().getConstraintsKeyword_9_2_0());
                            				
                            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_29); 

                            					newLeafNode(this_LIST_START_14, grammarAccess.getOutputDatasetAccess().getLIST_STARTTerminalRuleCall_9_2_1());
                            				
                            // InternalAnalysisActivityDSL.g:1179:5: ( (lv_constraints_15_0= ruleConstraint ) )
                            // InternalAnalysisActivityDSL.g:1180:6: (lv_constraints_15_0= ruleConstraint )
                            {
                            // InternalAnalysisActivityDSL.g:1180:6: (lv_constraints_15_0= ruleConstraint )
                            // InternalAnalysisActivityDSL.g:1181:7: lv_constraints_15_0= ruleConstraint
                            {

                            							newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsConstraintParserRuleCall_9_2_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_constraints_15_0=ruleConstraint();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                            							}
                            							add(
                            								current,
                            								"constraints",
                            								lv_constraints_15_0,
                            								"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAnalysisActivityDSL.g:1198:5: (this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_LIST_SEPARATOR) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalAnalysisActivityDSL.g:1199:6: this_LIST_SEPARATOR_16= RULE_LIST_SEPARATOR ( (lv_constraints_17_0= ruleConstraint ) )
                            	    {
                            	    this_LIST_SEPARATOR_16=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_29); 

                            	    						newLeafNode(this_LIST_SEPARATOR_16, grammarAccess.getOutputDatasetAccess().getLIST_SEPARATORTerminalRuleCall_9_2_3_0());
                            	    					
                            	    // InternalAnalysisActivityDSL.g:1203:6: ( (lv_constraints_17_0= ruleConstraint ) )
                            	    // InternalAnalysisActivityDSL.g:1204:7: (lv_constraints_17_0= ruleConstraint )
                            	    {
                            	    // InternalAnalysisActivityDSL.g:1204:7: (lv_constraints_17_0= ruleConstraint )
                            	    // InternalAnalysisActivityDSL.g:1205:8: lv_constraints_17_0= ruleConstraint
                            	    {

                            	    								newCompositeNode(grammarAccess.getOutputDatasetAccess().getConstraintsConstraintParserRuleCall_9_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_constraints_17_0=ruleConstraint();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOutputDatasetRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"constraints",
                            	    									lv_constraints_17_0,
                            	    									"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Constraint");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);

                            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_7); 

                            					newLeafNode(this_LIST_END_18, grammarAccess.getOutputDatasetAccess().getLIST_ENDTerminalRuleCall_9_2_4());
                            				
                            this_STATEMENT_END_19=(Token)match(input,RULE_STATEMENT_END,FOLLOW_17); 

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
    // InternalAnalysisActivityDSL.g:1245:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalAnalysisActivityDSL.g:1245:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalAnalysisActivityDSL.g:1246:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalAnalysisActivityDSL.g:1252:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1258:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAnalysisActivityDSL.g:1259:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAnalysisActivityDSL.g:1259:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAnalysisActivityDSL.g:1260:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAnalysisActivityDSL.g:1260:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1261:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_31); 

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


    // $ANTLR start "entryRuleConstraint"
    // InternalAnalysisActivityDSL.g:1278:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalAnalysisActivityDSL.g:1278:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalAnalysisActivityDSL.g:1279:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalAnalysisActivityDSL.g:1285:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1291:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalAnalysisActivityDSL.g:1292:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalAnalysisActivityDSL.g:1292:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalAnalysisActivityDSL.g:1293:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1297:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalAnalysisActivityDSL.g:1298:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalAnalysisActivityDSL.g:1298:4: (lv_name_1_0= ruleIdentifier )
            // InternalAnalysisActivityDSL.g:1299:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSL.Identifier");
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCommandLineTool"
    // InternalAnalysisActivityDSL.g:1320:1: entryRuleCommandLineTool returns [EObject current=null] : iv_ruleCommandLineTool= ruleCommandLineTool EOF ;
    public final EObject entryRuleCommandLineTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandLineTool = null;


        try {
            // InternalAnalysisActivityDSL.g:1320:56: (iv_ruleCommandLineTool= ruleCommandLineTool EOF )
            // InternalAnalysisActivityDSL.g:1321:2: iv_ruleCommandLineTool= ruleCommandLineTool EOF
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
    // InternalAnalysisActivityDSL.g:1327:1: ruleCommandLineTool returns [EObject current=null] : (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END ) ;
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
            // InternalAnalysisActivityDSL.g:1333:2: ( (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END ) )
            // InternalAnalysisActivityDSL.g:1334:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END )
            {
            // InternalAnalysisActivityDSL.g:1334:2: (otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END )
            // InternalAnalysisActivityDSL.g:1335:3: otherlv_0= 'executable' ( (lv_name_1_0= ruleEString ) ) this_ENTITY_START_2= RULE_ENTITY_START (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )? (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )? otherlv_22= 'commandLineTemplate' this_LIST_START_23= RULE_LIST_START ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) ) (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )* this_LIST_END_27= RULE_LIST_END (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )? this_ENTITY_END_33= RULE_ENTITY_END
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandLineToolAccess().getExecutableKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1339:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1340:4: (lv_name_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1340:4: (lv_name_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1341:5: lv_name_1_0= ruleEString
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

            this_ENTITY_START_2=(Token)match(input,RULE_ENTITY_START,FOLLOW_32); 

            			newLeafNode(this_ENTITY_START_2, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:1362:3: (otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1363:4: otherlv_3= 'remark' ( (lv_remark_4_0= ruleEString ) ) this_STATEMENT_END_5= RULE_STATEMENT_END
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommandLineToolAccess().getRemarkKeyword_3_0());
                    			
                    // InternalAnalysisActivityDSL.g:1367:4: ( (lv_remark_4_0= ruleEString ) )
                    // InternalAnalysisActivityDSL.g:1368:5: (lv_remark_4_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1368:5: (lv_remark_4_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1369:6: lv_remark_4_0= ruleEString
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

                    this_STATEMENT_END_5=(Token)match(input,RULE_STATEMENT_END,FOLLOW_33); 

                    				newLeafNode(this_STATEMENT_END_5, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }

            // InternalAnalysisActivityDSL.g:1391:3: (otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1392:4: otherlv_6= 'redirecting' this_ENTITY_START_7= RULE_ENTITY_START ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) ) this_ENTITY_END_21= RULE_ENTITY_END
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandLineToolAccess().getRedirectingKeyword_4_0());
                    			
                    this_ENTITY_START_7=(Token)match(input,RULE_ENTITY_START,FOLLOW_34); 

                    				newLeafNode(this_ENTITY_START_7, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_4_1());
                    			
                    // InternalAnalysisActivityDSL.g:1400:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) ) )
                    // InternalAnalysisActivityDSL.g:1401:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) )
                    {
                    // InternalAnalysisActivityDSL.g:1401:5: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* ) )
                    // InternalAnalysisActivityDSL.g:1402:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					
                    // InternalAnalysisActivityDSL.g:1405:6: ( ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )* )
                    // InternalAnalysisActivityDSL.g:1406:7: ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )*
                    {
                    // InternalAnalysisActivityDSL.g:1406:7: ( ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) ) )*
                    loop29:
                    do {
                        int alt29=4;
                        int LA29_0 = input.LA(1);

                        if ( LA29_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                            alt29=1;
                        }
                        else if ( LA29_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                            alt29=2;
                        }
                        else if ( LA29_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                            alt29=3;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1407:5: ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1407:5: ({...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1408:6: {...}? => ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1408:115: ( ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1409:7: ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 0);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1412:10: ({...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1412:11: {...}? => (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1412:20: (otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1412:21: otherlv_9= 'stdin' otherlv_10= 'from' ( ( ruleEString ) ) this_STATEMENT_END_12= RULE_STATEMENT_END
                    	    {
                    	    otherlv_9=(Token)match(input,34,FOLLOW_35); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getCommandLineToolAccess().getStdinKeyword_4_2_0_0());
                    	    									
                    	    otherlv_10=(Token)match(input,35,FOLLOW_6); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getCommandLineToolAccess().getFromKeyword_4_2_0_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1420:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1421:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1421:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1422:12: ruleEString
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

                    	    this_STATEMENT_END_12=(Token)match(input,RULE_STATEMENT_END,FOLLOW_34); 

                    	    										newLeafNode(this_STATEMENT_END_12, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_0_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:1446:5: ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1446:5: ({...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1447:6: {...}? => ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1447:115: ( ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1448:7: ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 1);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1451:10: ({...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1451:11: {...}? => (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1451:20: (otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1451:21: otherlv_13= 'stdout' otherlv_14= 'to' ( ( ruleEString ) ) this_STATEMENT_END_16= RULE_STATEMENT_END
                    	    {
                    	    otherlv_13=(Token)match(input,36,FOLLOW_36); 

                    	    										newLeafNode(otherlv_13, grammarAccess.getCommandLineToolAccess().getStdoutKeyword_4_2_1_0());
                    	    									
                    	    otherlv_14=(Token)match(input,37,FOLLOW_6); 

                    	    										newLeafNode(otherlv_14, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_1_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1459:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1460:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1460:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1461:12: ruleEString
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

                    	    this_STATEMENT_END_16=(Token)match(input,RULE_STATEMENT_END,FOLLOW_34); 

                    	    										newLeafNode(this_STATEMENT_END_16, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_1_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalAnalysisActivityDSL.g:1485:5: ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1485:5: ({...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) ) )
                    	    // InternalAnalysisActivityDSL.g:1486:6: {...}? => ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "getUnorderedGroupHelper().canSelect(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2)");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1486:115: ( ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) ) )
                    	    // InternalAnalysisActivityDSL.g:1487:7: ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2(), 2);
                    	    						
                    	    // InternalAnalysisActivityDSL.g:1490:10: ({...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END ) )
                    	    // InternalAnalysisActivityDSL.g:1490:11: {...}? => (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleCommandLineTool", "true");
                    	    }
                    	    // InternalAnalysisActivityDSL.g:1490:20: (otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END )
                    	    // InternalAnalysisActivityDSL.g:1490:21: otherlv_17= 'stderr' otherlv_18= 'to' ( ( ruleEString ) ) this_STATEMENT_END_20= RULE_STATEMENT_END
                    	    {
                    	    otherlv_17=(Token)match(input,38,FOLLOW_36); 

                    	    										newLeafNode(otherlv_17, grammarAccess.getCommandLineToolAccess().getStderrKeyword_4_2_2_0());
                    	    									
                    	    otherlv_18=(Token)match(input,37,FOLLOW_6); 

                    	    										newLeafNode(otherlv_18, grammarAccess.getCommandLineToolAccess().getToKeyword_4_2_2_1());
                    	    									
                    	    // InternalAnalysisActivityDSL.g:1498:10: ( ( ruleEString ) )
                    	    // InternalAnalysisActivityDSL.g:1499:11: ( ruleEString )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1499:11: ( ruleEString )
                    	    // InternalAnalysisActivityDSL.g:1500:12: ruleEString
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

                    	    this_STATEMENT_END_20=(Token)match(input,RULE_STATEMENT_END,FOLLOW_34); 

                    	    										newLeafNode(this_STATEMENT_END_20, grammarAccess.getCommandLineToolAccess().getSTATEMENT_ENDTerminalRuleCall_4_2_2_3());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getCommandLineToolAccess().getUnorderedGroup_4_2());
                    					

                    }

                    this_ENTITY_END_21=(Token)match(input,RULE_ENTITY_END,FOLLOW_37); 

                    				newLeafNode(this_ENTITY_END_21, grammarAccess.getCommandLineToolAccess().getENTITY_ENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_22, grammarAccess.getCommandLineToolAccess().getCommandLineTemplateKeyword_5());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_38); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getCommandLineToolAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalAnalysisActivityDSL.g:1544:3: ( (lv_commandLineTemplate_24_0= ruleCommandLineEntryList ) )
            // InternalAnalysisActivityDSL.g:1545:4: (lv_commandLineTemplate_24_0= ruleCommandLineEntryList )
            {
            // InternalAnalysisActivityDSL.g:1545:4: (lv_commandLineTemplate_24_0= ruleCommandLineEntryList )
            // InternalAnalysisActivityDSL.g:1546:5: lv_commandLineTemplate_24_0= ruleCommandLineEntryList
            {

            					newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalAnalysisActivityDSL.g:1563:3: (this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_LIST_SEPARATOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1564:4: this_LIST_SEPARATOR_25= RULE_LIST_SEPARATOR ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) )
            	    {
            	    this_LIST_SEPARATOR_25=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_38); 

            	    				newLeafNode(this_LIST_SEPARATOR_25, grammarAccess.getCommandLineToolAccess().getLIST_SEPARATORTerminalRuleCall_8_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1568:4: ( (lv_commandLineTemplate_26_0= ruleCommandLineEntryList ) )
            	    // InternalAnalysisActivityDSL.g:1569:5: (lv_commandLineTemplate_26_0= ruleCommandLineEntryList )
            	    {
            	    // InternalAnalysisActivityDSL.g:1569:5: (lv_commandLineTemplate_26_0= ruleCommandLineEntryList )
            	    // InternalAnalysisActivityDSL.g:1570:6: lv_commandLineTemplate_26_0= ruleCommandLineEntryList
            	    {

            	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getCommandLineTemplateCommandLineEntryListParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop31;
                }
            } while (true);

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_39); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getCommandLineToolAccess().getLIST_ENDTerminalRuleCall_9());
            		
            // InternalAnalysisActivityDSL.g:1592:3: (otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1593:4: otherlv_28= 'returns' this_ENTITY_START_29= RULE_ENTITY_START ( (lv_exitCodes_30_0= ruleExitCode ) ) ( (lv_exitCodes_31_0= ruleExitCode ) )* this_ENTITY_END_32= RULE_ENTITY_END
                    {
                    otherlv_28=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getCommandLineToolAccess().getReturnsKeyword_10_0());
                    			
                    this_ENTITY_START_29=(Token)match(input,RULE_ENTITY_START,FOLLOW_21); 

                    				newLeafNode(this_ENTITY_START_29, grammarAccess.getCommandLineToolAccess().getENTITY_STARTTerminalRuleCall_10_1());
                    			
                    // InternalAnalysisActivityDSL.g:1601:4: ( (lv_exitCodes_30_0= ruleExitCode ) )
                    // InternalAnalysisActivityDSL.g:1602:5: (lv_exitCodes_30_0= ruleExitCode )
                    {
                    // InternalAnalysisActivityDSL.g:1602:5: (lv_exitCodes_30_0= ruleExitCode )
                    // InternalAnalysisActivityDSL.g:1603:6: lv_exitCodes_30_0= ruleExitCode
                    {

                    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalAnalysisActivityDSL.g:1620:4: ( (lv_exitCodes_31_0= ruleExitCode ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_INT||LA32_0==30) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:1621:5: (lv_exitCodes_31_0= ruleExitCode )
                    	    {
                    	    // InternalAnalysisActivityDSL.g:1621:5: (lv_exitCodes_31_0= ruleExitCode )
                    	    // InternalAnalysisActivityDSL.g:1622:6: lv_exitCodes_31_0= ruleExitCode
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandLineToolAccess().getExitCodesExitCodeParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop32;
                        }
                    } while (true);

                    this_ENTITY_END_32=(Token)match(input,RULE_ENTITY_END,FOLLOW_17); 

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
    // InternalAnalysisActivityDSL.g:1652:1: entryRuleExitCode returns [EObject current=null] : iv_ruleExitCode= ruleExitCode EOF ;
    public final EObject entryRuleExitCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitCode = null;


        try {
            // InternalAnalysisActivityDSL.g:1652:49: (iv_ruleExitCode= ruleExitCode EOF )
            // InternalAnalysisActivityDSL.g:1653:2: iv_ruleExitCode= ruleExitCode EOF
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
    // InternalAnalysisActivityDSL.g:1659:1: ruleExitCode returns [EObject current=null] : ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) ;
    public final EObject ruleExitCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STATEMENT_END_4=null;
        AntlrDatatypeRuleToken lv_code_0_0 = null;

        Enumerator lv_status_2_0 = null;

        AntlrDatatypeRuleToken lv_reportMessage_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1665:2: ( ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END ) )
            // InternalAnalysisActivityDSL.g:1666:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            {
            // InternalAnalysisActivityDSL.g:1666:2: ( ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END )
            // InternalAnalysisActivityDSL.g:1667:3: ( (lv_code_0_0= ruleEBigInteger ) ) otherlv_1= 'if' ( (lv_status_2_0= ruleTerminationStatus ) ) ( (lv_reportMessage_3_0= ruleEString ) )? this_STATEMENT_END_4= RULE_STATEMENT_END
            {
            // InternalAnalysisActivityDSL.g:1667:3: ( (lv_code_0_0= ruleEBigInteger ) )
            // InternalAnalysisActivityDSL.g:1668:4: (lv_code_0_0= ruleEBigInteger )
            {
            // InternalAnalysisActivityDSL.g:1668:4: (lv_code_0_0= ruleEBigInteger )
            // InternalAnalysisActivityDSL.g:1669:5: lv_code_0_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getCodeEBigIntegerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_1=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getExitCodeAccess().getIfKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1690:3: ( (lv_status_2_0= ruleTerminationStatus ) )
            // InternalAnalysisActivityDSL.g:1691:4: (lv_status_2_0= ruleTerminationStatus )
            {
            // InternalAnalysisActivityDSL.g:1691:4: (lv_status_2_0= ruleTerminationStatus )
            // InternalAnalysisActivityDSL.g:1692:5: lv_status_2_0= ruleTerminationStatus
            {

            					newCompositeNode(grammarAccess.getExitCodeAccess().getStatusTerminationStatusEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAnalysisActivityDSL.g:1709:3: ( (lv_reportMessage_3_0= ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_MULTILINE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:1710:4: (lv_reportMessage_3_0= ruleEString )
                    {
                    // InternalAnalysisActivityDSL.g:1710:4: (lv_reportMessage_3_0= ruleEString )
                    // InternalAnalysisActivityDSL.g:1711:5: lv_reportMessage_3_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:1736:1: entryRuleToolNameCommandLineEntry returns [EObject current=null] : iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF ;
    public final EObject entryRuleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToolNameCommandLineEntry = null;


        try {
            // InternalAnalysisActivityDSL.g:1736:65: (iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF )
            // InternalAnalysisActivityDSL.g:1737:2: iv_ruleToolNameCommandLineEntry= ruleToolNameCommandLineEntry EOF
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
    // InternalAnalysisActivityDSL.g:1743:1: ruleToolNameCommandLineEntry returns [EObject current=null] : ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleToolNameCommandLineEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1749:2: ( ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:1750:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:1750:2: ( () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:1751:3: () otherlv_1= 'toolname' (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:1751:3: ()
            // InternalAnalysisActivityDSL.g:1752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getToolNameCommandLineEntryAccess().getToolNameCommandLineEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getToolNameCommandLineEntryAccess().getToolnameKeyword_1());
            		
            // InternalAnalysisActivityDSL.g:1762:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_PIPE_TO) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1763:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_45); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getToolNameCommandLineEntryAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1767:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:1768:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:1768:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:1769:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getToolNameCommandLineEntryAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop35;
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
    // InternalAnalysisActivityDSL.g:1791:1: entryRuleLiteralCommandLineEntryList returns [EObject current=null] : iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF ;
    public final EObject entryRuleLiteralCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:1791:68: (iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:1792:2: iv_ruleLiteralCommandLineEntryList= ruleLiteralCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:1798:1: ruleLiteralCommandLineEntryList returns [EObject current=null] : ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) ;
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
            // InternalAnalysisActivityDSL.g:1804:2: ( ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:1805:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:1805:2: ( () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:1806:3: () otherlv_1= 'literals' this_LIST_START_2= RULE_LIST_START ( (lv_literals_3_0= ruleEString ) ) (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )* this_LIST_END_6= RULE_LIST_END (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            {
            // InternalAnalysisActivityDSL.g:1806:3: ()
            // InternalAnalysisActivityDSL.g:1807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralCommandLineEntryListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsKeyword_1());
            		
            this_LIST_START_2=(Token)match(input,RULE_LIST_START,FOLLOW_6); 

            			newLeafNode(this_LIST_START_2, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_STARTTerminalRuleCall_2());
            		
            // InternalAnalysisActivityDSL.g:1821:3: ( (lv_literals_3_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:1822:4: (lv_literals_3_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1822:4: (lv_literals_3_0= ruleEString )
            // InternalAnalysisActivityDSL.g:1823:5: lv_literals_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalAnalysisActivityDSL.g:1840:3: (this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_LIST_SEPARATOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1841:4: this_LIST_SEPARATOR_4= RULE_LIST_SEPARATOR ( (lv_literals_5_0= ruleEString ) )
            	    {
            	    this_LIST_SEPARATOR_4=(Token)match(input,RULE_LIST_SEPARATOR,FOLLOW_6); 

            	    				newLeafNode(this_LIST_SEPARATOR_4, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_SEPARATORTerminalRuleCall_4_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1845:4: ( (lv_literals_5_0= ruleEString ) )
            	    // InternalAnalysisActivityDSL.g:1846:5: (lv_literals_5_0= ruleEString )
            	    {
            	    // InternalAnalysisActivityDSL.g:1846:5: (lv_literals_5_0= ruleEString )
            	    // InternalAnalysisActivityDSL.g:1847:6: lv_literals_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getLiteralsEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop36;
                }
            } while (true);

            this_LIST_END_6=(Token)match(input,RULE_LIST_END,FOLLOW_44); 

            			newLeafNode(this_LIST_END_6, grammarAccess.getLiteralCommandLineEntryListAccess().getLIST_ENDTerminalRuleCall_5());
            		
            // InternalAnalysisActivityDSL.g:1869:3: (this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_PIPE_TO) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1870:4: this_PIPE_TO_7= RULE_PIPE_TO ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_7=(Token)match(input,RULE_PIPE_TO,FOLLOW_45); 

            	    				newLeafNode(this_PIPE_TO_7, grammarAccess.getLiteralCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_6_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1874:4: ( (lv_manipulators_8_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:1875:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:1875:5: (lv_manipulators_8_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:1876:6: lv_manipulators_8_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getLiteralCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleLiteralCommandLineEntryList"


    // $ANTLR start "entryRuleDatasetCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:1898:1: entryRuleDatasetCommandLineEntryList returns [EObject current=null] : iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF ;
    public final EObject entryRuleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:1898:68: (iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:1899:2: iv_ruleDatasetCommandLineEntryList= ruleDatasetCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:1905:1: ruleDatasetCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleDatasetCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1911:2: ( (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:1912:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:1912:2: (otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:1913:3: otherlv_0= 'dataset' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1917:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1918:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1918:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1919:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getDatasetDatasetCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1933:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_PIPE_TO) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1934:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_45); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getDatasetCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:1938:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:1939:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:1939:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:1940:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getDatasetCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleDatasetCommandLineEntryList"


    // $ANTLR start "entryRuleParameterCommandLineEntryList"
    // InternalAnalysisActivityDSL.g:1962:1: entryRuleParameterCommandLineEntryList returns [EObject current=null] : iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF ;
    public final EObject entryRuleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCommandLineEntryList = null;


        try {
            // InternalAnalysisActivityDSL.g:1962:70: (iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF )
            // InternalAnalysisActivityDSL.g:1963:2: iv_ruleParameterCommandLineEntryList= ruleParameterCommandLineEntryList EOF
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
    // InternalAnalysisActivityDSL.g:1969:1: ruleParameterCommandLineEntryList returns [EObject current=null] : (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) ;
    public final EObject ruleParameterCommandLineEntryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PIPE_TO_2=null;
        EObject lv_manipulators_3_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:1975:2: ( (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* ) )
            // InternalAnalysisActivityDSL.g:1976:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            {
            // InternalAnalysisActivityDSL.g:1976:2: (otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )* )
            // InternalAnalysisActivityDSL.g:1977:3: otherlv_0= 'parameter' ( ( ruleEString ) ) (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterCommandLineEntryListAccess().getParameterKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:1981:3: ( ( ruleEString ) )
            // InternalAnalysisActivityDSL.g:1982:4: ( ruleEString )
            {
            // InternalAnalysisActivityDSL.g:1982:4: ( ruleEString )
            // InternalAnalysisActivityDSL.g:1983:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterCommandLineEntryListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getParameterParameterCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnalysisActivityDSL.g:1997:3: (this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_PIPE_TO) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:1998:4: this_PIPE_TO_2= RULE_PIPE_TO ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    {
            	    this_PIPE_TO_2=(Token)match(input,RULE_PIPE_TO,FOLLOW_45); 

            	    				newLeafNode(this_PIPE_TO_2, grammarAccess.getParameterCommandLineEntryListAccess().getPIPE_TOTerminalRuleCall_2_0());
            	    			
            	    // InternalAnalysisActivityDSL.g:2002:4: ( (lv_manipulators_3_0= ruleStringListManipulator ) )
            	    // InternalAnalysisActivityDSL.g:2003:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    {
            	    // InternalAnalysisActivityDSL.g:2003:5: (lv_manipulators_3_0= ruleStringListManipulator )
            	    // InternalAnalysisActivityDSL.g:2004:6: lv_manipulators_3_0= ruleStringListManipulator
            	    {

            	    						newCompositeNode(grammarAccess.getParameterCommandLineEntryListAccess().getManipulatorsStringListManipulatorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleParameterCommandLineEntryList"


    // $ANTLR start "entryRuleJoin"
    // InternalAnalysisActivityDSL.g:2026:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalAnalysisActivityDSL.g:2026:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalAnalysisActivityDSL.g:2027:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalAnalysisActivityDSL.g:2033:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_delimiter_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2039:2: ( (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2040:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2040:2: (otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2041:3: otherlv_0= 'Join' ( (lv_delimiter_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2045:3: ( (lv_delimiter_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2046:4: (lv_delimiter_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2046:4: (lv_delimiter_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2047:5: lv_delimiter_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2068:1: entryRulePrependEach returns [EObject current=null] : iv_rulePrependEach= rulePrependEach EOF ;
    public final EObject entryRulePrependEach() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2068:52: (iv_rulePrependEach= rulePrependEach EOF )
            // InternalAnalysisActivityDSL.g:2069:2: iv_rulePrependEach= rulePrependEach EOF
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
    // InternalAnalysisActivityDSL.g:2075:1: rulePrependEach returns [EObject current=null] : (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2081:2: ( (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2082:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2082:2: (otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2083:3: otherlv_0= 'PrependEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependEachAccess().getPrependEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2087:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2088:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2088:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2089:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2110:1: entryRuleAppendEach returns [EObject current=null] : iv_ruleAppendEach= ruleAppendEach EOF ;
    public final EObject entryRuleAppendEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendEach = null;


        try {
            // InternalAnalysisActivityDSL.g:2110:51: (iv_ruleAppendEach= ruleAppendEach EOF )
            // InternalAnalysisActivityDSL.g:2111:2: iv_ruleAppendEach= ruleAppendEach EOF
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
    // InternalAnalysisActivityDSL.g:2117:1: ruleAppendEach returns [EObject current=null] : (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2123:2: ( (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2124:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2124:2: (otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2125:3: otherlv_0= 'AppendEach' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendEachAccess().getAppendEachKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2129:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2130:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2130:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2131:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2152:1: entryRuleAppendListWith returns [EObject current=null] : iv_ruleAppendListWith= ruleAppendListWith EOF ;
    public final EObject entryRuleAppendListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2152:55: (iv_ruleAppendListWith= ruleAppendListWith EOF )
            // InternalAnalysisActivityDSL.g:2153:2: iv_ruleAppendListWith= ruleAppendListWith EOF
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
    // InternalAnalysisActivityDSL.g:2159:1: ruleAppendListWith returns [EObject current=null] : (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleAppendListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2165:2: ( (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2166:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2166:2: (otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2167:3: otherlv_0= 'AppendListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendListWithAccess().getAppendListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2171:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2172:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2172:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2173:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2194:1: entryRulePrependListWith returns [EObject current=null] : iv_rulePrependListWith= rulePrependListWith EOF ;
    public final EObject entryRulePrependListWith() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrependListWith = null;


        try {
            // InternalAnalysisActivityDSL.g:2194:56: (iv_rulePrependListWith= rulePrependListWith EOF )
            // InternalAnalysisActivityDSL.g:2195:2: iv_rulePrependListWith= rulePrependListWith EOF
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
    // InternalAnalysisActivityDSL.g:2201:1: rulePrependListWith returns [EObject current=null] : (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject rulePrependListWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2207:2: ( (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalAnalysisActivityDSL.g:2208:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalAnalysisActivityDSL.g:2208:2: (otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) ) )
            // InternalAnalysisActivityDSL.g:2209:3: otherlv_0= 'PrependListWith' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrependListWithAccess().getPrependListWithKeyword_0());
            		
            // InternalAnalysisActivityDSL.g:2213:3: ( (lv_value_1_0= ruleEString ) )
            // InternalAnalysisActivityDSL.g:2214:4: (lv_value_1_0= ruleEString )
            {
            // InternalAnalysisActivityDSL.g:2214:4: (lv_value_1_0= ruleEString )
            // InternalAnalysisActivityDSL.g:2215:5: lv_value_1_0= ruleEString
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
    // InternalAnalysisActivityDSL.g:2236:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2242:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalAnalysisActivityDSL.g:2243:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalAnalysisActivityDSL.g:2243:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt40=1;
                }
                break;
            case 50:
                {
                alt40=2;
                }
                break;
            case 51:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2244:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalAnalysisActivityDSL.g:2244:3: (enumLiteral_0= 'STRING' )
                    // InternalAnalysisActivityDSL.g:2245:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2252:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalAnalysisActivityDSL.g:2252:3: (enumLiteral_1= 'INTEGER' )
                    // InternalAnalysisActivityDSL.g:2253:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAnalysisActivityDSL.g:2260:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalAnalysisActivityDSL.g:2260:3: (enumLiteral_2= 'REAL' )
                    // InternalAnalysisActivityDSL.g:2261:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAnalysisActivityDSL.g:2271:1: ruleTerminationStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) ;
    public final Enumerator ruleTerminationStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAnalysisActivityDSL.g:2277:2: ( ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) ) )
            // InternalAnalysisActivityDSL.g:2278:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            {
            // InternalAnalysisActivityDSL.g:2278:2: ( (enumLiteral_0= 'SUCCEEDED' ) | (enumLiteral_1= 'FAILED' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                alt41=1;
            }
            else if ( (LA41_0==53) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2279:3: (enumLiteral_0= 'SUCCEEDED' )
                    {
                    // InternalAnalysisActivityDSL.g:2279:3: (enumLiteral_0= 'SUCCEEDED' )
                    // InternalAnalysisActivityDSL.g:2280:4: enumLiteral_0= 'SUCCEEDED'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTerminationStatusAccess().getSUCCEEDEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2287:3: (enumLiteral_1= 'FAILED' )
                    {
                    // InternalAnalysisActivityDSL.g:2287:3: (enumLiteral_1= 'FAILED' )
                    // InternalAnalysisActivityDSL.g:2288:4: enumLiteral_1= 'FAILED'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010100040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000780L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008200100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000005400000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0022000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040002040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000003A0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001F00000000000L});

}
