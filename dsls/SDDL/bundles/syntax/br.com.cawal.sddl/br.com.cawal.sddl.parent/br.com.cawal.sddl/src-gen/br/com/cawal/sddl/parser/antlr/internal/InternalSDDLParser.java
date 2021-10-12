package br.com.cawal.sddl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.com.cawal.sddl.services.SDDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'deployment'", "'{'", "'of'", "'into'", "'}'", "'container'", "'base-url'", "'description'", "'service'", "'api-version'", "'contact'", "'email'", "'url'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSDDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSDDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSDDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSDDL.g"; }



     	private SDDLGrammarAccess grammarAccess;

        public InternalSDDLParser(TokenStream input, SDDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Deployment";
       	}

       	@Override
       	protected SDDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDeployment"
    // InternalSDDL.g:64:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalSDDL.g:64:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalSDDL.g:65:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalSDDL.g:71:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'of' ( (lv_service_3_0= ruleService ) ) otherlv_4= 'into' ( (lv_container_5_0= ruleServiceContainer ) ) ( (lv_contactInformation_6_0= ruleContact ) )? otherlv_7= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_service_3_0 = null;

        EObject lv_container_5_0 = null;

        EObject lv_contactInformation_6_0 = null;



        	enterRule();

        try {
            // InternalSDDL.g:77:2: ( (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'of' ( (lv_service_3_0= ruleService ) ) otherlv_4= 'into' ( (lv_container_5_0= ruleServiceContainer ) ) ( (lv_contactInformation_6_0= ruleContact ) )? otherlv_7= '}' ) )
            // InternalSDDL.g:78:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'of' ( (lv_service_3_0= ruleService ) ) otherlv_4= 'into' ( (lv_container_5_0= ruleServiceContainer ) ) ( (lv_contactInformation_6_0= ruleContact ) )? otherlv_7= '}' )
            {
            // InternalSDDL.g:78:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'of' ( (lv_service_3_0= ruleService ) ) otherlv_4= 'into' ( (lv_container_5_0= ruleServiceContainer ) ) ( (lv_contactInformation_6_0= ruleContact ) )? otherlv_7= '}' )
            // InternalSDDL.g:79:3: otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'of' ( (lv_service_3_0= ruleService ) ) otherlv_4= 'into' ( (lv_container_5_0= ruleServiceContainer ) ) ( (lv_contactInformation_6_0= ruleContact ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getOfKeyword_2());
            		
            // InternalSDDL.g:91:3: ( (lv_service_3_0= ruleService ) )
            // InternalSDDL.g:92:4: (lv_service_3_0= ruleService )
            {
            // InternalSDDL.g:92:4: (lv_service_3_0= ruleService )
            // InternalSDDL.g:93:5: lv_service_3_0= ruleService
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getServiceServiceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_service_3_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            					}
            					set(
            						current,
            						"service",
            						lv_service_3_0,
            						"br.com.cawal.sddl.SDDL.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getIntoKeyword_4());
            		
            // InternalSDDL.g:114:3: ( (lv_container_5_0= ruleServiceContainer ) )
            // InternalSDDL.g:115:4: (lv_container_5_0= ruleServiceContainer )
            {
            // InternalSDDL.g:115:4: (lv_container_5_0= ruleServiceContainer )
            // InternalSDDL.g:116:5: lv_container_5_0= ruleServiceContainer
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getContainerServiceContainerParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_container_5_0=ruleServiceContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            					}
            					set(
            						current,
            						"container",
            						lv_container_5_0,
            						"br.com.cawal.sddl.SDDL.ServiceContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDDL.g:133:3: ( (lv_contactInformation_6_0= ruleContact ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSDDL.g:134:4: (lv_contactInformation_6_0= ruleContact )
                    {
                    // InternalSDDL.g:134:4: (lv_contactInformation_6_0= ruleContact )
                    // InternalSDDL.g:135:5: lv_contactInformation_6_0= ruleContact
                    {

                    					newCompositeNode(grammarAccess.getDeploymentAccess().getContactInformationContactParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_contactInformation_6_0=ruleContact();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeploymentRule());
                    					}
                    					set(
                    						current,
                    						"contactInformation",
                    						lv_contactInformation_6_0,
                    						"br.com.cawal.sddl.SDDL.Contact");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleServiceContainer"
    // InternalSDDL.g:160:1: entryRuleServiceContainer returns [EObject current=null] : iv_ruleServiceContainer= ruleServiceContainer EOF ;
    public final EObject entryRuleServiceContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceContainer = null;


        try {
            // InternalSDDL.g:160:57: (iv_ruleServiceContainer= ruleServiceContainer EOF )
            // InternalSDDL.g:161:2: iv_ruleServiceContainer= ruleServiceContainer EOF
            {
             newCompositeNode(grammarAccess.getServiceContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceContainer=ruleServiceContainer();

            state._fsp--;

             current =iv_ruleServiceContainer; 
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
    // $ANTLR end "entryRuleServiceContainer"


    // $ANTLR start "ruleServiceContainer"
    // InternalSDDL.g:167:1: ruleServiceContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'base-url' ( (lv_baseUrl_4_0= ruleURL ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleServiceContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_baseUrl_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalSDDL.g:173:2: ( (otherlv_0= 'container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'base-url' ( (lv_baseUrl_4_0= ruleURL ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalSDDL.g:174:2: (otherlv_0= 'container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'base-url' ( (lv_baseUrl_4_0= ruleURL ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalSDDL.g:174:2: (otherlv_0= 'container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'base-url' ( (lv_baseUrl_4_0= ruleURL ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalSDDL.g:175:3: otherlv_0= 'container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'base-url' ( (lv_baseUrl_4_0= ruleURL ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceContainerAccess().getContainerKeyword_0());
            		
            // InternalSDDL.g:179:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSDDL.g:180:4: (lv_name_1_0= ruleEString )
            {
            // InternalSDDL.g:180:4: (lv_name_1_0= ruleEString )
            // InternalSDDL.g:181:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceContainerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.com.cawal.sddl.SDDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceContainerAccess().getBaseUrlKeyword_3());
            		
            // InternalSDDL.g:206:3: ( (lv_baseUrl_4_0= ruleURL ) )
            // InternalSDDL.g:207:4: (lv_baseUrl_4_0= ruleURL )
            {
            // InternalSDDL.g:207:4: (lv_baseUrl_4_0= ruleURL )
            // InternalSDDL.g:208:5: lv_baseUrl_4_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getServiceContainerAccess().getBaseUrlURLParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_baseUrl_4_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceContainerRule());
            					}
            					set(
            						current,
            						"baseUrl",
            						lv_baseUrl_4_0,
            						"br.com.cawal.sddl.SDDL.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDDL.g:225:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSDDL.g:226:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceContainerAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalSDDL.g:230:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalSDDL.g:231:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalSDDL.g:231:5: (lv_description_6_0= ruleEString )
                    // InternalSDDL.g:232:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceContainerAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceContainerRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"br.com.cawal.sddl.SDDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceContainerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServiceContainer"


    // $ANTLR start "entryRuleService"
    // InternalSDDL.g:258:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSDDL.g:258:48: (iv_ruleService= ruleService EOF )
            // InternalSDDL.g:259:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalSDDL.g:265:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'api-version' ( (lv_apiVersion_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_apiVersion_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalSDDL.g:271:2: ( (otherlv_0= 'service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'api-version' ( (lv_apiVersion_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalSDDL.g:272:2: (otherlv_0= 'service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'api-version' ( (lv_apiVersion_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalSDDL.g:272:2: (otherlv_0= 'service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'api-version' ( (lv_apiVersion_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalSDDL.g:273:3: otherlv_0= 'service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'api-version' ( (lv_apiVersion_4_0= ruleEString ) ) (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalSDDL.g:277:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSDDL.g:278:4: (lv_name_1_0= ruleEString )
            {
            // InternalSDDL.g:278:4: (lv_name_1_0= ruleEString )
            // InternalSDDL.g:279:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.com.cawal.sddl.SDDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getApiVersionKeyword_3());
            		
            // InternalSDDL.g:304:3: ( (lv_apiVersion_4_0= ruleEString ) )
            // InternalSDDL.g:305:4: (lv_apiVersion_4_0= ruleEString )
            {
            // InternalSDDL.g:305:4: (lv_apiVersion_4_0= ruleEString )
            // InternalSDDL.g:306:5: lv_apiVersion_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getApiVersionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_apiVersion_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"apiVersion",
            						lv_apiVersion_4_0,
            						"br.com.cawal.sddl.SDDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDDL.g:323:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSDDL.g:324:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalSDDL.g:328:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalSDDL.g:329:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalSDDL.g:329:5: (lv_description_6_0= ruleEString )
                    // InternalSDDL.g:330:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"br.com.cawal.sddl.SDDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleContact"
    // InternalSDDL.g:356:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalSDDL.g:356:48: (iv_ruleContact= ruleContact EOF )
            // InternalSDDL.g:357:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
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
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalSDDL.g:363:1: ruleContact returns [EObject current=null] : (otherlv_0= 'contact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= ruleEString ) ) (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_email_4_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;



        	enterRule();

        try {
            // InternalSDDL.g:369:2: ( (otherlv_0= 'contact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= ruleEString ) ) (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )? otherlv_7= '}' ) )
            // InternalSDDL.g:370:2: (otherlv_0= 'contact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= ruleEString ) ) (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )? otherlv_7= '}' )
            {
            // InternalSDDL.g:370:2: (otherlv_0= 'contact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= ruleEString ) ) (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )? otherlv_7= '}' )
            // InternalSDDL.g:371:3: otherlv_0= 'contact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= ruleEString ) ) (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getContactAccess().getContactKeyword_0());
            		
            // InternalSDDL.g:375:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSDDL.g:376:4: (lv_name_1_0= ruleEString )
            {
            // InternalSDDL.g:376:4: (lv_name_1_0= ruleEString )
            // InternalSDDL.g:377:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContactAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.com.cawal.sddl.SDDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getContactAccess().getEmailKeyword_3());
            		
            // InternalSDDL.g:402:3: ( (lv_email_4_0= ruleEString ) )
            // InternalSDDL.g:403:4: (lv_email_4_0= ruleEString )
            {
            // InternalSDDL.g:403:4: (lv_email_4_0= ruleEString )
            // InternalSDDL.g:404:5: lv_email_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_email_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_4_0,
            						"br.com.cawal.sddl.SDDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDDL.g:421:3: (otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSDDL.g:422:4: otherlv_5= 'url' ( (lv_url_6_0= ruleURL ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getContactAccess().getUrlKeyword_5_0());
                    			
                    // InternalSDDL.g:426:4: ( (lv_url_6_0= ruleURL ) )
                    // InternalSDDL.g:427:5: (lv_url_6_0= ruleURL )
                    {
                    // InternalSDDL.g:427:5: (lv_url_6_0= ruleURL )
                    // InternalSDDL.g:428:6: lv_url_6_0= ruleURL
                    {

                    						newCompositeNode(grammarAccess.getContactAccess().getUrlURLParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_url_6_0=ruleURL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContactRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_6_0,
                    							"br.com.cawal.sddl.SDDL.URL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleEString"
    // InternalSDDL.g:454:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSDDL.g:454:47: (iv_ruleEString= ruleEString EOF )
            // InternalSDDL.g:455:2: iv_ruleEString= ruleEString EOF
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
    // InternalSDDL.g:461:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSDDL.g:467:2: (this_STRING_0= RULE_STRING )
            // InternalSDDL.g:468:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleURL"
    // InternalSDDL.g:478:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalSDDL.g:478:43: (iv_ruleURL= ruleURL EOF )
            // InternalSDDL.g:479:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL.getText(); 
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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalSDDL.g:485:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSDDL.g:491:2: (this_STRING_0= RULE_STRING )
            // InternalSDDL.g:492:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getURLAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleURL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000808000L});

}