package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.services.DSLSyntaxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLSyntaxParser extends AbstractInternalContentAssistParser {
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


        public InternalDSLSyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLSyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLSyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSLSyntax.g"; }


    	private DSLSyntaxGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLSyntaxGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDeployment"
    // InternalDSLSyntax.g:53:1: entryRuleDeployment : ruleDeployment EOF ;
    public final void entryRuleDeployment() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:54:1: ( ruleDeployment EOF )
            // InternalDSLSyntax.g:55:1: ruleDeployment EOF
            {
             before(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getDeploymentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalDSLSyntax.g:62:1: ruleDeployment : ( ( rule__Deployment__Group__0 ) ) ;
    public final void ruleDeployment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:66:2: ( ( ( rule__Deployment__Group__0 ) ) )
            // InternalDSLSyntax.g:67:2: ( ( rule__Deployment__Group__0 ) )
            {
            // InternalDSLSyntax.g:67:2: ( ( rule__Deployment__Group__0 ) )
            // InternalDSLSyntax.g:68:3: ( rule__Deployment__Group__0 )
            {
             before(grammarAccess.getDeploymentAccess().getGroup()); 
            // InternalDSLSyntax.g:69:3: ( rule__Deployment__Group__0 )
            // InternalDSLSyntax.g:69:4: rule__Deployment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleServiceContainer"
    // InternalDSLSyntax.g:78:1: entryRuleServiceContainer : ruleServiceContainer EOF ;
    public final void entryRuleServiceContainer() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:79:1: ( ruleServiceContainer EOF )
            // InternalDSLSyntax.g:80:1: ruleServiceContainer EOF
            {
             before(grammarAccess.getServiceContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceContainer();

            state._fsp--;

             after(grammarAccess.getServiceContainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceContainer"


    // $ANTLR start "ruleServiceContainer"
    // InternalDSLSyntax.g:87:1: ruleServiceContainer : ( ( rule__ServiceContainer__Group__0 ) ) ;
    public final void ruleServiceContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:91:2: ( ( ( rule__ServiceContainer__Group__0 ) ) )
            // InternalDSLSyntax.g:92:2: ( ( rule__ServiceContainer__Group__0 ) )
            {
            // InternalDSLSyntax.g:92:2: ( ( rule__ServiceContainer__Group__0 ) )
            // InternalDSLSyntax.g:93:3: ( rule__ServiceContainer__Group__0 )
            {
             before(grammarAccess.getServiceContainerAccess().getGroup()); 
            // InternalDSLSyntax.g:94:3: ( rule__ServiceContainer__Group__0 )
            // InternalDSLSyntax.g:94:4: rule__ServiceContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceContainer"


    // $ANTLR start "entryRuleService"
    // InternalDSLSyntax.g:103:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:104:1: ( ruleService EOF )
            // InternalDSLSyntax.g:105:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDSLSyntax.g:112:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:116:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalDSLSyntax.g:117:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalDSLSyntax.g:117:2: ( ( rule__Service__Group__0 ) )
            // InternalDSLSyntax.g:118:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalDSLSyntax.g:119:3: ( rule__Service__Group__0 )
            // InternalDSLSyntax.g:119:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleContact"
    // InternalDSLSyntax.g:128:1: entryRuleContact : ruleContact EOF ;
    public final void entryRuleContact() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:129:1: ( ruleContact EOF )
            // InternalDSLSyntax.g:130:1: ruleContact EOF
            {
             before(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getContactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalDSLSyntax.g:137:1: ruleContact : ( ( rule__Contact__Group__0 ) ) ;
    public final void ruleContact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:141:2: ( ( ( rule__Contact__Group__0 ) ) )
            // InternalDSLSyntax.g:142:2: ( ( rule__Contact__Group__0 ) )
            {
            // InternalDSLSyntax.g:142:2: ( ( rule__Contact__Group__0 ) )
            // InternalDSLSyntax.g:143:3: ( rule__Contact__Group__0 )
            {
             before(grammarAccess.getContactAccess().getGroup()); 
            // InternalDSLSyntax.g:144:3: ( rule__Contact__Group__0 )
            // InternalDSLSyntax.g:144:4: rule__Contact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleEString"
    // InternalDSLSyntax.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:154:1: ( ruleEString EOF )
            // InternalDSLSyntax.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSLSyntax.g:162:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:166:2: ( ( RULE_STRING ) )
            // InternalDSLSyntax.g:167:2: ( RULE_STRING )
            {
            // InternalDSLSyntax.g:167:2: ( RULE_STRING )
            // InternalDSLSyntax.g:168:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleURL"
    // InternalDSLSyntax.g:178:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalDSLSyntax.g:179:1: ( ruleURL EOF )
            // InternalDSLSyntax.g:180:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getURLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalDSLSyntax.g:187:1: ruleURL : ( RULE_STRING ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:191:2: ( ( RULE_STRING ) )
            // InternalDSLSyntax.g:192:2: ( RULE_STRING )
            {
            // InternalDSLSyntax.g:192:2: ( RULE_STRING )
            // InternalDSLSyntax.g:193:3: RULE_STRING
            {
             before(grammarAccess.getURLAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "rule__Deployment__Group__0"
    // InternalDSLSyntax.g:202:1: rule__Deployment__Group__0 : rule__Deployment__Group__0__Impl rule__Deployment__Group__1 ;
    public final void rule__Deployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:206:1: ( rule__Deployment__Group__0__Impl rule__Deployment__Group__1 )
            // InternalDSLSyntax.g:207:2: rule__Deployment__Group__0__Impl rule__Deployment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Deployment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0"


    // $ANTLR start "rule__Deployment__Group__0__Impl"
    // InternalDSLSyntax.g:214:1: rule__Deployment__Group__0__Impl : ( 'deployment' ) ;
    public final void rule__Deployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:218:1: ( ( 'deployment' ) )
            // InternalDSLSyntax.g:219:1: ( 'deployment' )
            {
            // InternalDSLSyntax.g:219:1: ( 'deployment' )
            // InternalDSLSyntax.g:220:2: 'deployment'
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0__Impl"


    // $ANTLR start "rule__Deployment__Group__1"
    // InternalDSLSyntax.g:229:1: rule__Deployment__Group__1 : rule__Deployment__Group__1__Impl rule__Deployment__Group__2 ;
    public final void rule__Deployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:233:1: ( rule__Deployment__Group__1__Impl rule__Deployment__Group__2 )
            // InternalDSLSyntax.g:234:2: rule__Deployment__Group__1__Impl rule__Deployment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Deployment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1"


    // $ANTLR start "rule__Deployment__Group__1__Impl"
    // InternalDSLSyntax.g:241:1: rule__Deployment__Group__1__Impl : ( '{' ) ;
    public final void rule__Deployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:245:1: ( ( '{' ) )
            // InternalDSLSyntax.g:246:1: ( '{' )
            {
            // InternalDSLSyntax.g:246:1: ( '{' )
            // InternalDSLSyntax.g:247:2: '{'
            {
             before(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1__Impl"


    // $ANTLR start "rule__Deployment__Group__2"
    // InternalDSLSyntax.g:256:1: rule__Deployment__Group__2 : rule__Deployment__Group__2__Impl rule__Deployment__Group__3 ;
    public final void rule__Deployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:260:1: ( rule__Deployment__Group__2__Impl rule__Deployment__Group__3 )
            // InternalDSLSyntax.g:261:2: rule__Deployment__Group__2__Impl rule__Deployment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Deployment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2"


    // $ANTLR start "rule__Deployment__Group__2__Impl"
    // InternalDSLSyntax.g:268:1: rule__Deployment__Group__2__Impl : ( 'of' ) ;
    public final void rule__Deployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:272:1: ( ( 'of' ) )
            // InternalDSLSyntax.g:273:1: ( 'of' )
            {
            // InternalDSLSyntax.g:273:1: ( 'of' )
            // InternalDSLSyntax.g:274:2: 'of'
            {
             before(grammarAccess.getDeploymentAccess().getOfKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2__Impl"


    // $ANTLR start "rule__Deployment__Group__3"
    // InternalDSLSyntax.g:283:1: rule__Deployment__Group__3 : rule__Deployment__Group__3__Impl rule__Deployment__Group__4 ;
    public final void rule__Deployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:287:1: ( rule__Deployment__Group__3__Impl rule__Deployment__Group__4 )
            // InternalDSLSyntax.g:288:2: rule__Deployment__Group__3__Impl rule__Deployment__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Deployment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3"


    // $ANTLR start "rule__Deployment__Group__3__Impl"
    // InternalDSLSyntax.g:295:1: rule__Deployment__Group__3__Impl : ( ( rule__Deployment__ServiceAssignment_3 ) ) ;
    public final void rule__Deployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:299:1: ( ( ( rule__Deployment__ServiceAssignment_3 ) ) )
            // InternalDSLSyntax.g:300:1: ( ( rule__Deployment__ServiceAssignment_3 ) )
            {
            // InternalDSLSyntax.g:300:1: ( ( rule__Deployment__ServiceAssignment_3 ) )
            // InternalDSLSyntax.g:301:2: ( rule__Deployment__ServiceAssignment_3 )
            {
             before(grammarAccess.getDeploymentAccess().getServiceAssignment_3()); 
            // InternalDSLSyntax.g:302:2: ( rule__Deployment__ServiceAssignment_3 )
            // InternalDSLSyntax.g:302:3: rule__Deployment__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3__Impl"


    // $ANTLR start "rule__Deployment__Group__4"
    // InternalDSLSyntax.g:310:1: rule__Deployment__Group__4 : rule__Deployment__Group__4__Impl rule__Deployment__Group__5 ;
    public final void rule__Deployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:314:1: ( rule__Deployment__Group__4__Impl rule__Deployment__Group__5 )
            // InternalDSLSyntax.g:315:2: rule__Deployment__Group__4__Impl rule__Deployment__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Deployment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4"


    // $ANTLR start "rule__Deployment__Group__4__Impl"
    // InternalDSLSyntax.g:322:1: rule__Deployment__Group__4__Impl : ( 'into' ) ;
    public final void rule__Deployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:326:1: ( ( 'into' ) )
            // InternalDSLSyntax.g:327:1: ( 'into' )
            {
            // InternalDSLSyntax.g:327:1: ( 'into' )
            // InternalDSLSyntax.g:328:2: 'into'
            {
             before(grammarAccess.getDeploymentAccess().getIntoKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getIntoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4__Impl"


    // $ANTLR start "rule__Deployment__Group__5"
    // InternalDSLSyntax.g:337:1: rule__Deployment__Group__5 : rule__Deployment__Group__5__Impl rule__Deployment__Group__6 ;
    public final void rule__Deployment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:341:1: ( rule__Deployment__Group__5__Impl rule__Deployment__Group__6 )
            // InternalDSLSyntax.g:342:2: rule__Deployment__Group__5__Impl rule__Deployment__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Deployment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5"


    // $ANTLR start "rule__Deployment__Group__5__Impl"
    // InternalDSLSyntax.g:349:1: rule__Deployment__Group__5__Impl : ( ( rule__Deployment__ContainerAssignment_5 ) ) ;
    public final void rule__Deployment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:353:1: ( ( ( rule__Deployment__ContainerAssignment_5 ) ) )
            // InternalDSLSyntax.g:354:1: ( ( rule__Deployment__ContainerAssignment_5 ) )
            {
            // InternalDSLSyntax.g:354:1: ( ( rule__Deployment__ContainerAssignment_5 ) )
            // InternalDSLSyntax.g:355:2: ( rule__Deployment__ContainerAssignment_5 )
            {
             before(grammarAccess.getDeploymentAccess().getContainerAssignment_5()); 
            // InternalDSLSyntax.g:356:2: ( rule__Deployment__ContainerAssignment_5 )
            // InternalDSLSyntax.g:356:3: rule__Deployment__ContainerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__ContainerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getContainerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5__Impl"


    // $ANTLR start "rule__Deployment__Group__6"
    // InternalDSLSyntax.g:364:1: rule__Deployment__Group__6 : rule__Deployment__Group__6__Impl rule__Deployment__Group__7 ;
    public final void rule__Deployment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:368:1: ( rule__Deployment__Group__6__Impl rule__Deployment__Group__7 )
            // InternalDSLSyntax.g:369:2: rule__Deployment__Group__6__Impl rule__Deployment__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Deployment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6"


    // $ANTLR start "rule__Deployment__Group__6__Impl"
    // InternalDSLSyntax.g:376:1: rule__Deployment__Group__6__Impl : ( ( rule__Deployment__ContactInformationAssignment_6 )? ) ;
    public final void rule__Deployment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:380:1: ( ( ( rule__Deployment__ContactInformationAssignment_6 )? ) )
            // InternalDSLSyntax.g:381:1: ( ( rule__Deployment__ContactInformationAssignment_6 )? )
            {
            // InternalDSLSyntax.g:381:1: ( ( rule__Deployment__ContactInformationAssignment_6 )? )
            // InternalDSLSyntax.g:382:2: ( rule__Deployment__ContactInformationAssignment_6 )?
            {
             before(grammarAccess.getDeploymentAccess().getContactInformationAssignment_6()); 
            // InternalDSLSyntax.g:383:2: ( rule__Deployment__ContactInformationAssignment_6 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSLSyntax.g:383:3: rule__Deployment__ContactInformationAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Deployment__ContactInformationAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeploymentAccess().getContactInformationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6__Impl"


    // $ANTLR start "rule__Deployment__Group__7"
    // InternalDSLSyntax.g:391:1: rule__Deployment__Group__7 : rule__Deployment__Group__7__Impl ;
    public final void rule__Deployment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:395:1: ( rule__Deployment__Group__7__Impl )
            // InternalDSLSyntax.g:396:2: rule__Deployment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__7"


    // $ANTLR start "rule__Deployment__Group__7__Impl"
    // InternalDSLSyntax.g:402:1: rule__Deployment__Group__7__Impl : ( '}' ) ;
    public final void rule__Deployment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:406:1: ( ( '}' ) )
            // InternalDSLSyntax.g:407:1: ( '}' )
            {
            // InternalDSLSyntax.g:407:1: ( '}' )
            // InternalDSLSyntax.g:408:2: '}'
            {
             before(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__7__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__0"
    // InternalDSLSyntax.g:418:1: rule__ServiceContainer__Group__0 : rule__ServiceContainer__Group__0__Impl rule__ServiceContainer__Group__1 ;
    public final void rule__ServiceContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:422:1: ( rule__ServiceContainer__Group__0__Impl rule__ServiceContainer__Group__1 )
            // InternalDSLSyntax.g:423:2: rule__ServiceContainer__Group__0__Impl rule__ServiceContainer__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ServiceContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__0"


    // $ANTLR start "rule__ServiceContainer__Group__0__Impl"
    // InternalDSLSyntax.g:430:1: rule__ServiceContainer__Group__0__Impl : ( 'container' ) ;
    public final void rule__ServiceContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:434:1: ( ( 'container' ) )
            // InternalDSLSyntax.g:435:1: ( 'container' )
            {
            // InternalDSLSyntax.g:435:1: ( 'container' )
            // InternalDSLSyntax.g:436:2: 'container'
            {
             before(grammarAccess.getServiceContainerAccess().getContainerKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__0__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__1"
    // InternalDSLSyntax.g:445:1: rule__ServiceContainer__Group__1 : rule__ServiceContainer__Group__1__Impl rule__ServiceContainer__Group__2 ;
    public final void rule__ServiceContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:449:1: ( rule__ServiceContainer__Group__1__Impl rule__ServiceContainer__Group__2 )
            // InternalDSLSyntax.g:450:2: rule__ServiceContainer__Group__1__Impl rule__ServiceContainer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__1"


    // $ANTLR start "rule__ServiceContainer__Group__1__Impl"
    // InternalDSLSyntax.g:457:1: rule__ServiceContainer__Group__1__Impl : ( ( rule__ServiceContainer__NameAssignment_1 ) ) ;
    public final void rule__ServiceContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:461:1: ( ( ( rule__ServiceContainer__NameAssignment_1 ) ) )
            // InternalDSLSyntax.g:462:1: ( ( rule__ServiceContainer__NameAssignment_1 ) )
            {
            // InternalDSLSyntax.g:462:1: ( ( rule__ServiceContainer__NameAssignment_1 ) )
            // InternalDSLSyntax.g:463:2: ( rule__ServiceContainer__NameAssignment_1 )
            {
             before(grammarAccess.getServiceContainerAccess().getNameAssignment_1()); 
            // InternalDSLSyntax.g:464:2: ( rule__ServiceContainer__NameAssignment_1 )
            // InternalDSLSyntax.g:464:3: rule__ServiceContainer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceContainerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__1__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__2"
    // InternalDSLSyntax.g:472:1: rule__ServiceContainer__Group__2 : rule__ServiceContainer__Group__2__Impl rule__ServiceContainer__Group__3 ;
    public final void rule__ServiceContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:476:1: ( rule__ServiceContainer__Group__2__Impl rule__ServiceContainer__Group__3 )
            // InternalDSLSyntax.g:477:2: rule__ServiceContainer__Group__2__Impl rule__ServiceContainer__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ServiceContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__2"


    // $ANTLR start "rule__ServiceContainer__Group__2__Impl"
    // InternalDSLSyntax.g:484:1: rule__ServiceContainer__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:488:1: ( ( '{' ) )
            // InternalDSLSyntax.g:489:1: ( '{' )
            {
            // InternalDSLSyntax.g:489:1: ( '{' )
            // InternalDSLSyntax.g:490:2: '{'
            {
             before(grammarAccess.getServiceContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceContainerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__2__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__3"
    // InternalDSLSyntax.g:499:1: rule__ServiceContainer__Group__3 : rule__ServiceContainer__Group__3__Impl rule__ServiceContainer__Group__4 ;
    public final void rule__ServiceContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:503:1: ( rule__ServiceContainer__Group__3__Impl rule__ServiceContainer__Group__4 )
            // InternalDSLSyntax.g:504:2: rule__ServiceContainer__Group__3__Impl rule__ServiceContainer__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ServiceContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__3"


    // $ANTLR start "rule__ServiceContainer__Group__3__Impl"
    // InternalDSLSyntax.g:511:1: rule__ServiceContainer__Group__3__Impl : ( 'base-url' ) ;
    public final void rule__ServiceContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:515:1: ( ( 'base-url' ) )
            // InternalDSLSyntax.g:516:1: ( 'base-url' )
            {
            // InternalDSLSyntax.g:516:1: ( 'base-url' )
            // InternalDSLSyntax.g:517:2: 'base-url'
            {
             before(grammarAccess.getServiceContainerAccess().getBaseUrlKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceContainerAccess().getBaseUrlKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__3__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__4"
    // InternalDSLSyntax.g:526:1: rule__ServiceContainer__Group__4 : rule__ServiceContainer__Group__4__Impl rule__ServiceContainer__Group__5 ;
    public final void rule__ServiceContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:530:1: ( rule__ServiceContainer__Group__4__Impl rule__ServiceContainer__Group__5 )
            // InternalDSLSyntax.g:531:2: rule__ServiceContainer__Group__4__Impl rule__ServiceContainer__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ServiceContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__4"


    // $ANTLR start "rule__ServiceContainer__Group__4__Impl"
    // InternalDSLSyntax.g:538:1: rule__ServiceContainer__Group__4__Impl : ( ( rule__ServiceContainer__BaseUrlAssignment_4 ) ) ;
    public final void rule__ServiceContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:542:1: ( ( ( rule__ServiceContainer__BaseUrlAssignment_4 ) ) )
            // InternalDSLSyntax.g:543:1: ( ( rule__ServiceContainer__BaseUrlAssignment_4 ) )
            {
            // InternalDSLSyntax.g:543:1: ( ( rule__ServiceContainer__BaseUrlAssignment_4 ) )
            // InternalDSLSyntax.g:544:2: ( rule__ServiceContainer__BaseUrlAssignment_4 )
            {
             before(grammarAccess.getServiceContainerAccess().getBaseUrlAssignment_4()); 
            // InternalDSLSyntax.g:545:2: ( rule__ServiceContainer__BaseUrlAssignment_4 )
            // InternalDSLSyntax.g:545:3: rule__ServiceContainer__BaseUrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__BaseUrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceContainerAccess().getBaseUrlAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__4__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__5"
    // InternalDSLSyntax.g:553:1: rule__ServiceContainer__Group__5 : rule__ServiceContainer__Group__5__Impl rule__ServiceContainer__Group__6 ;
    public final void rule__ServiceContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:557:1: ( rule__ServiceContainer__Group__5__Impl rule__ServiceContainer__Group__6 )
            // InternalDSLSyntax.g:558:2: rule__ServiceContainer__Group__5__Impl rule__ServiceContainer__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ServiceContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__5"


    // $ANTLR start "rule__ServiceContainer__Group__5__Impl"
    // InternalDSLSyntax.g:565:1: rule__ServiceContainer__Group__5__Impl : ( ( rule__ServiceContainer__Group_5__0 )? ) ;
    public final void rule__ServiceContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:569:1: ( ( ( rule__ServiceContainer__Group_5__0 )? ) )
            // InternalDSLSyntax.g:570:1: ( ( rule__ServiceContainer__Group_5__0 )? )
            {
            // InternalDSLSyntax.g:570:1: ( ( rule__ServiceContainer__Group_5__0 )? )
            // InternalDSLSyntax.g:571:2: ( rule__ServiceContainer__Group_5__0 )?
            {
             before(grammarAccess.getServiceContainerAccess().getGroup_5()); 
            // InternalDSLSyntax.g:572:2: ( rule__ServiceContainer__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSLSyntax.g:572:3: rule__ServiceContainer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceContainer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceContainerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__5__Impl"


    // $ANTLR start "rule__ServiceContainer__Group__6"
    // InternalDSLSyntax.g:580:1: rule__ServiceContainer__Group__6 : rule__ServiceContainer__Group__6__Impl ;
    public final void rule__ServiceContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:584:1: ( rule__ServiceContainer__Group__6__Impl )
            // InternalDSLSyntax.g:585:2: rule__ServiceContainer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__6"


    // $ANTLR start "rule__ServiceContainer__Group__6__Impl"
    // InternalDSLSyntax.g:591:1: rule__ServiceContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:595:1: ( ( '}' ) )
            // InternalDSLSyntax.g:596:1: ( '}' )
            {
            // InternalDSLSyntax.g:596:1: ( '}' )
            // InternalDSLSyntax.g:597:2: '}'
            {
             before(grammarAccess.getServiceContainerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceContainerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group__6__Impl"


    // $ANTLR start "rule__ServiceContainer__Group_5__0"
    // InternalDSLSyntax.g:607:1: rule__ServiceContainer__Group_5__0 : rule__ServiceContainer__Group_5__0__Impl rule__ServiceContainer__Group_5__1 ;
    public final void rule__ServiceContainer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:611:1: ( rule__ServiceContainer__Group_5__0__Impl rule__ServiceContainer__Group_5__1 )
            // InternalDSLSyntax.g:612:2: rule__ServiceContainer__Group_5__0__Impl rule__ServiceContainer__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ServiceContainer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group_5__0"


    // $ANTLR start "rule__ServiceContainer__Group_5__0__Impl"
    // InternalDSLSyntax.g:619:1: rule__ServiceContainer__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__ServiceContainer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:623:1: ( ( 'description' ) )
            // InternalDSLSyntax.g:624:1: ( 'description' )
            {
            // InternalDSLSyntax.g:624:1: ( 'description' )
            // InternalDSLSyntax.g:625:2: 'description'
            {
             before(grammarAccess.getServiceContainerAccess().getDescriptionKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceContainerAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceContainer__Group_5__1"
    // InternalDSLSyntax.g:634:1: rule__ServiceContainer__Group_5__1 : rule__ServiceContainer__Group_5__1__Impl ;
    public final void rule__ServiceContainer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:638:1: ( rule__ServiceContainer__Group_5__1__Impl )
            // InternalDSLSyntax.g:639:2: rule__ServiceContainer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group_5__1"


    // $ANTLR start "rule__ServiceContainer__Group_5__1__Impl"
    // InternalDSLSyntax.g:645:1: rule__ServiceContainer__Group_5__1__Impl : ( ( rule__ServiceContainer__DescriptionAssignment_5_1 ) ) ;
    public final void rule__ServiceContainer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:649:1: ( ( ( rule__ServiceContainer__DescriptionAssignment_5_1 ) ) )
            // InternalDSLSyntax.g:650:1: ( ( rule__ServiceContainer__DescriptionAssignment_5_1 ) )
            {
            // InternalDSLSyntax.g:650:1: ( ( rule__ServiceContainer__DescriptionAssignment_5_1 ) )
            // InternalDSLSyntax.g:651:2: ( rule__ServiceContainer__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getServiceContainerAccess().getDescriptionAssignment_5_1()); 
            // InternalDSLSyntax.g:652:2: ( rule__ServiceContainer__DescriptionAssignment_5_1 )
            // InternalDSLSyntax.g:652:3: rule__ServiceContainer__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceContainer__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceContainerAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__Group_5__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalDSLSyntax.g:661:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:665:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalDSLSyntax.g:666:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalDSLSyntax.g:673:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:677:1: ( ( 'service' ) )
            // InternalDSLSyntax.g:678:1: ( 'service' )
            {
            // InternalDSLSyntax.g:678:1: ( 'service' )
            // InternalDSLSyntax.g:679:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalDSLSyntax.g:688:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:692:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalDSLSyntax.g:693:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalDSLSyntax.g:700:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:704:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalDSLSyntax.g:705:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalDSLSyntax.g:705:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalDSLSyntax.g:706:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalDSLSyntax.g:707:2: ( rule__Service__NameAssignment_1 )
            // InternalDSLSyntax.g:707:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalDSLSyntax.g:715:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:719:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalDSLSyntax.g:720:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalDSLSyntax.g:727:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:731:1: ( ( '{' ) )
            // InternalDSLSyntax.g:732:1: ( '{' )
            {
            // InternalDSLSyntax.g:732:1: ( '{' )
            // InternalDSLSyntax.g:733:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalDSLSyntax.g:742:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:746:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalDSLSyntax.g:747:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalDSLSyntax.g:754:1: rule__Service__Group__3__Impl : ( 'api-version' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:758:1: ( ( 'api-version' ) )
            // InternalDSLSyntax.g:759:1: ( 'api-version' )
            {
            // InternalDSLSyntax.g:759:1: ( 'api-version' )
            // InternalDSLSyntax.g:760:2: 'api-version'
            {
             before(grammarAccess.getServiceAccess().getApiVersionKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getApiVersionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalDSLSyntax.g:769:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:773:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalDSLSyntax.g:774:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalDSLSyntax.g:781:1: rule__Service__Group__4__Impl : ( ( rule__Service__ApiVersionAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:785:1: ( ( ( rule__Service__ApiVersionAssignment_4 ) ) )
            // InternalDSLSyntax.g:786:1: ( ( rule__Service__ApiVersionAssignment_4 ) )
            {
            // InternalDSLSyntax.g:786:1: ( ( rule__Service__ApiVersionAssignment_4 ) )
            // InternalDSLSyntax.g:787:2: ( rule__Service__ApiVersionAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getApiVersionAssignment_4()); 
            // InternalDSLSyntax.g:788:2: ( rule__Service__ApiVersionAssignment_4 )
            // InternalDSLSyntax.g:788:3: rule__Service__ApiVersionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__ApiVersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getApiVersionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalDSLSyntax.g:796:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:800:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalDSLSyntax.g:801:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalDSLSyntax.g:808:1: rule__Service__Group__5__Impl : ( ( rule__Service__Group_5__0 )? ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:812:1: ( ( ( rule__Service__Group_5__0 )? ) )
            // InternalDSLSyntax.g:813:1: ( ( rule__Service__Group_5__0 )? )
            {
            // InternalDSLSyntax.g:813:1: ( ( rule__Service__Group_5__0 )? )
            // InternalDSLSyntax.g:814:2: ( rule__Service__Group_5__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_5()); 
            // InternalDSLSyntax.g:815:2: ( rule__Service__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSLSyntax.g:815:3: rule__Service__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalDSLSyntax.g:823:1: rule__Service__Group__6 : rule__Service__Group__6__Impl ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:827:1: ( rule__Service__Group__6__Impl )
            // InternalDSLSyntax.g:828:2: rule__Service__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalDSLSyntax.g:834:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:838:1: ( ( '}' ) )
            // InternalDSLSyntax.g:839:1: ( '}' )
            {
            // InternalDSLSyntax.g:839:1: ( '}' )
            // InternalDSLSyntax.g:840:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group_5__0"
    // InternalDSLSyntax.g:850:1: rule__Service__Group_5__0 : rule__Service__Group_5__0__Impl rule__Service__Group_5__1 ;
    public final void rule__Service__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:854:1: ( rule__Service__Group_5__0__Impl rule__Service__Group_5__1 )
            // InternalDSLSyntax.g:855:2: rule__Service__Group_5__0__Impl rule__Service__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0"


    // $ANTLR start "rule__Service__Group_5__0__Impl"
    // InternalDSLSyntax.g:862:1: rule__Service__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Service__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:866:1: ( ( 'description' ) )
            // InternalDSLSyntax.g:867:1: ( 'description' )
            {
            // InternalDSLSyntax.g:867:1: ( 'description' )
            // InternalDSLSyntax.g:868:2: 'description'
            {
             before(grammarAccess.getServiceAccess().getDescriptionKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__0__Impl"


    // $ANTLR start "rule__Service__Group_5__1"
    // InternalDSLSyntax.g:877:1: rule__Service__Group_5__1 : rule__Service__Group_5__1__Impl ;
    public final void rule__Service__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:881:1: ( rule__Service__Group_5__1__Impl )
            // InternalDSLSyntax.g:882:2: rule__Service__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1"


    // $ANTLR start "rule__Service__Group_5__1__Impl"
    // InternalDSLSyntax.g:888:1: rule__Service__Group_5__1__Impl : ( ( rule__Service__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Service__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:892:1: ( ( ( rule__Service__DescriptionAssignment_5_1 ) ) )
            // InternalDSLSyntax.g:893:1: ( ( rule__Service__DescriptionAssignment_5_1 ) )
            {
            // InternalDSLSyntax.g:893:1: ( ( rule__Service__DescriptionAssignment_5_1 ) )
            // InternalDSLSyntax.g:894:2: ( rule__Service__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getServiceAccess().getDescriptionAssignment_5_1()); 
            // InternalDSLSyntax.g:895:2: ( rule__Service__DescriptionAssignment_5_1 )
            // InternalDSLSyntax.g:895:3: rule__Service__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_5__1__Impl"


    // $ANTLR start "rule__Contact__Group__0"
    // InternalDSLSyntax.g:904:1: rule__Contact__Group__0 : rule__Contact__Group__0__Impl rule__Contact__Group__1 ;
    public final void rule__Contact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:908:1: ( rule__Contact__Group__0__Impl rule__Contact__Group__1 )
            // InternalDSLSyntax.g:909:2: rule__Contact__Group__0__Impl rule__Contact__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Contact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0"


    // $ANTLR start "rule__Contact__Group__0__Impl"
    // InternalDSLSyntax.g:916:1: rule__Contact__Group__0__Impl : ( 'contact' ) ;
    public final void rule__Contact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:920:1: ( ( 'contact' ) )
            // InternalDSLSyntax.g:921:1: ( 'contact' )
            {
            // InternalDSLSyntax.g:921:1: ( 'contact' )
            // InternalDSLSyntax.g:922:2: 'contact'
            {
             before(grammarAccess.getContactAccess().getContactKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getContactKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0__Impl"


    // $ANTLR start "rule__Contact__Group__1"
    // InternalDSLSyntax.g:931:1: rule__Contact__Group__1 : rule__Contact__Group__1__Impl rule__Contact__Group__2 ;
    public final void rule__Contact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:935:1: ( rule__Contact__Group__1__Impl rule__Contact__Group__2 )
            // InternalDSLSyntax.g:936:2: rule__Contact__Group__1__Impl rule__Contact__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Contact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1"


    // $ANTLR start "rule__Contact__Group__1__Impl"
    // InternalDSLSyntax.g:943:1: rule__Contact__Group__1__Impl : ( ( rule__Contact__NameAssignment_1 ) ) ;
    public final void rule__Contact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:947:1: ( ( ( rule__Contact__NameAssignment_1 ) ) )
            // InternalDSLSyntax.g:948:1: ( ( rule__Contact__NameAssignment_1 ) )
            {
            // InternalDSLSyntax.g:948:1: ( ( rule__Contact__NameAssignment_1 ) )
            // InternalDSLSyntax.g:949:2: ( rule__Contact__NameAssignment_1 )
            {
             before(grammarAccess.getContactAccess().getNameAssignment_1()); 
            // InternalDSLSyntax.g:950:2: ( rule__Contact__NameAssignment_1 )
            // InternalDSLSyntax.g:950:3: rule__Contact__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1__Impl"


    // $ANTLR start "rule__Contact__Group__2"
    // InternalDSLSyntax.g:958:1: rule__Contact__Group__2 : rule__Contact__Group__2__Impl rule__Contact__Group__3 ;
    public final void rule__Contact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:962:1: ( rule__Contact__Group__2__Impl rule__Contact__Group__3 )
            // InternalDSLSyntax.g:963:2: rule__Contact__Group__2__Impl rule__Contact__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Contact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2"


    // $ANTLR start "rule__Contact__Group__2__Impl"
    // InternalDSLSyntax.g:970:1: rule__Contact__Group__2__Impl : ( '{' ) ;
    public final void rule__Contact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:974:1: ( ( '{' ) )
            // InternalDSLSyntax.g:975:1: ( '{' )
            {
            // InternalDSLSyntax.g:975:1: ( '{' )
            // InternalDSLSyntax.g:976:2: '{'
            {
             before(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2__Impl"


    // $ANTLR start "rule__Contact__Group__3"
    // InternalDSLSyntax.g:985:1: rule__Contact__Group__3 : rule__Contact__Group__3__Impl rule__Contact__Group__4 ;
    public final void rule__Contact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:989:1: ( rule__Contact__Group__3__Impl rule__Contact__Group__4 )
            // InternalDSLSyntax.g:990:2: rule__Contact__Group__3__Impl rule__Contact__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Contact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3"


    // $ANTLR start "rule__Contact__Group__3__Impl"
    // InternalDSLSyntax.g:997:1: rule__Contact__Group__3__Impl : ( 'email' ) ;
    public final void rule__Contact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1001:1: ( ( 'email' ) )
            // InternalDSLSyntax.g:1002:1: ( 'email' )
            {
            // InternalDSLSyntax.g:1002:1: ( 'email' )
            // InternalDSLSyntax.g:1003:2: 'email'
            {
             before(grammarAccess.getContactAccess().getEmailKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getEmailKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3__Impl"


    // $ANTLR start "rule__Contact__Group__4"
    // InternalDSLSyntax.g:1012:1: rule__Contact__Group__4 : rule__Contact__Group__4__Impl rule__Contact__Group__5 ;
    public final void rule__Contact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1016:1: ( rule__Contact__Group__4__Impl rule__Contact__Group__5 )
            // InternalDSLSyntax.g:1017:2: rule__Contact__Group__4__Impl rule__Contact__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Contact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__4"


    // $ANTLR start "rule__Contact__Group__4__Impl"
    // InternalDSLSyntax.g:1024:1: rule__Contact__Group__4__Impl : ( ( rule__Contact__EmailAssignment_4 ) ) ;
    public final void rule__Contact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1028:1: ( ( ( rule__Contact__EmailAssignment_4 ) ) )
            // InternalDSLSyntax.g:1029:1: ( ( rule__Contact__EmailAssignment_4 ) )
            {
            // InternalDSLSyntax.g:1029:1: ( ( rule__Contact__EmailAssignment_4 ) )
            // InternalDSLSyntax.g:1030:2: ( rule__Contact__EmailAssignment_4 )
            {
             before(grammarAccess.getContactAccess().getEmailAssignment_4()); 
            // InternalDSLSyntax.g:1031:2: ( rule__Contact__EmailAssignment_4 )
            // InternalDSLSyntax.g:1031:3: rule__Contact__EmailAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Contact__EmailAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getEmailAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__4__Impl"


    // $ANTLR start "rule__Contact__Group__5"
    // InternalDSLSyntax.g:1039:1: rule__Contact__Group__5 : rule__Contact__Group__5__Impl rule__Contact__Group__6 ;
    public final void rule__Contact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1043:1: ( rule__Contact__Group__5__Impl rule__Contact__Group__6 )
            // InternalDSLSyntax.g:1044:2: rule__Contact__Group__5__Impl rule__Contact__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Contact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__5"


    // $ANTLR start "rule__Contact__Group__5__Impl"
    // InternalDSLSyntax.g:1051:1: rule__Contact__Group__5__Impl : ( ( rule__Contact__Group_5__0 )? ) ;
    public final void rule__Contact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1055:1: ( ( ( rule__Contact__Group_5__0 )? ) )
            // InternalDSLSyntax.g:1056:1: ( ( rule__Contact__Group_5__0 )? )
            {
            // InternalDSLSyntax.g:1056:1: ( ( rule__Contact__Group_5__0 )? )
            // InternalDSLSyntax.g:1057:2: ( rule__Contact__Group_5__0 )?
            {
             before(grammarAccess.getContactAccess().getGroup_5()); 
            // InternalDSLSyntax.g:1058:2: ( rule__Contact__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSLSyntax.g:1058:3: rule__Contact__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contact__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContactAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__5__Impl"


    // $ANTLR start "rule__Contact__Group__6"
    // InternalDSLSyntax.g:1066:1: rule__Contact__Group__6 : rule__Contact__Group__6__Impl ;
    public final void rule__Contact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1070:1: ( rule__Contact__Group__6__Impl )
            // InternalDSLSyntax.g:1071:2: rule__Contact__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contact__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__6"


    // $ANTLR start "rule__Contact__Group__6__Impl"
    // InternalDSLSyntax.g:1077:1: rule__Contact__Group__6__Impl : ( '}' ) ;
    public final void rule__Contact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1081:1: ( ( '}' ) )
            // InternalDSLSyntax.g:1082:1: ( '}' )
            {
            // InternalDSLSyntax.g:1082:1: ( '}' )
            // InternalDSLSyntax.g:1083:2: '}'
            {
             before(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__6__Impl"


    // $ANTLR start "rule__Contact__Group_5__0"
    // InternalDSLSyntax.g:1093:1: rule__Contact__Group_5__0 : rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 ;
    public final void rule__Contact__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1097:1: ( rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1 )
            // InternalDSLSyntax.g:1098:2: rule__Contact__Group_5__0__Impl rule__Contact__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Contact__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contact__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__0"


    // $ANTLR start "rule__Contact__Group_5__0__Impl"
    // InternalDSLSyntax.g:1105:1: rule__Contact__Group_5__0__Impl : ( 'url' ) ;
    public final void rule__Contact__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1109:1: ( ( 'url' ) )
            // InternalDSLSyntax.g:1110:1: ( 'url' )
            {
            // InternalDSLSyntax.g:1110:1: ( 'url' )
            // InternalDSLSyntax.g:1111:2: 'url'
            {
             before(grammarAccess.getContactAccess().getUrlKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContactAccess().getUrlKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__0__Impl"


    // $ANTLR start "rule__Contact__Group_5__1"
    // InternalDSLSyntax.g:1120:1: rule__Contact__Group_5__1 : rule__Contact__Group_5__1__Impl ;
    public final void rule__Contact__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1124:1: ( rule__Contact__Group_5__1__Impl )
            // InternalDSLSyntax.g:1125:2: rule__Contact__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contact__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__1"


    // $ANTLR start "rule__Contact__Group_5__1__Impl"
    // InternalDSLSyntax.g:1131:1: rule__Contact__Group_5__1__Impl : ( ( rule__Contact__UrlAssignment_5_1 ) ) ;
    public final void rule__Contact__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1135:1: ( ( ( rule__Contact__UrlAssignment_5_1 ) ) )
            // InternalDSLSyntax.g:1136:1: ( ( rule__Contact__UrlAssignment_5_1 ) )
            {
            // InternalDSLSyntax.g:1136:1: ( ( rule__Contact__UrlAssignment_5_1 ) )
            // InternalDSLSyntax.g:1137:2: ( rule__Contact__UrlAssignment_5_1 )
            {
             before(grammarAccess.getContactAccess().getUrlAssignment_5_1()); 
            // InternalDSLSyntax.g:1138:2: ( rule__Contact__UrlAssignment_5_1 )
            // InternalDSLSyntax.g:1138:3: rule__Contact__UrlAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Contact__UrlAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getUrlAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group_5__1__Impl"


    // $ANTLR start "rule__Deployment__ServiceAssignment_3"
    // InternalDSLSyntax.g:1147:1: rule__Deployment__ServiceAssignment_3 : ( ruleService ) ;
    public final void rule__Deployment__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1151:1: ( ( ruleService ) )
            // InternalDSLSyntax.g:1152:2: ( ruleService )
            {
            // InternalDSLSyntax.g:1152:2: ( ruleService )
            // InternalDSLSyntax.g:1153:3: ruleService
            {
             before(grammarAccess.getDeploymentAccess().getServiceServiceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getServiceServiceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ServiceAssignment_3"


    // $ANTLR start "rule__Deployment__ContainerAssignment_5"
    // InternalDSLSyntax.g:1162:1: rule__Deployment__ContainerAssignment_5 : ( ruleServiceContainer ) ;
    public final void rule__Deployment__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1166:1: ( ( ruleServiceContainer ) )
            // InternalDSLSyntax.g:1167:2: ( ruleServiceContainer )
            {
            // InternalDSLSyntax.g:1167:2: ( ruleServiceContainer )
            // InternalDSLSyntax.g:1168:3: ruleServiceContainer
            {
             before(grammarAccess.getDeploymentAccess().getContainerServiceContainerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceContainer();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getContainerServiceContainerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ContainerAssignment_5"


    // $ANTLR start "rule__Deployment__ContactInformationAssignment_6"
    // InternalDSLSyntax.g:1177:1: rule__Deployment__ContactInformationAssignment_6 : ( ruleContact ) ;
    public final void rule__Deployment__ContactInformationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1181:1: ( ( ruleContact ) )
            // InternalDSLSyntax.g:1182:2: ( ruleContact )
            {
            // InternalDSLSyntax.g:1182:2: ( ruleContact )
            // InternalDSLSyntax.g:1183:3: ruleContact
            {
             before(grammarAccess.getDeploymentAccess().getContactInformationContactParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getContactInformationContactParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ContactInformationAssignment_6"


    // $ANTLR start "rule__ServiceContainer__NameAssignment_1"
    // InternalDSLSyntax.g:1192:1: rule__ServiceContainer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServiceContainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1196:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1197:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1197:2: ( ruleEString )
            // InternalDSLSyntax.g:1198:3: ruleEString
            {
             before(grammarAccess.getServiceContainerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceContainerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__NameAssignment_1"


    // $ANTLR start "rule__ServiceContainer__BaseUrlAssignment_4"
    // InternalDSLSyntax.g:1207:1: rule__ServiceContainer__BaseUrlAssignment_4 : ( ruleURL ) ;
    public final void rule__ServiceContainer__BaseUrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1211:1: ( ( ruleURL ) )
            // InternalDSLSyntax.g:1212:2: ( ruleURL )
            {
            // InternalDSLSyntax.g:1212:2: ( ruleURL )
            // InternalDSLSyntax.g:1213:3: ruleURL
            {
             before(grammarAccess.getServiceContainerAccess().getBaseUrlURLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getServiceContainerAccess().getBaseUrlURLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__BaseUrlAssignment_4"


    // $ANTLR start "rule__ServiceContainer__DescriptionAssignment_5_1"
    // InternalDSLSyntax.g:1222:1: rule__ServiceContainer__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServiceContainer__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1226:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1227:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1227:2: ( ruleEString )
            // InternalDSLSyntax.g:1228:3: ruleEString
            {
             before(grammarAccess.getServiceContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceContainerAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceContainer__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalDSLSyntax.g:1237:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1241:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1242:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1242:2: ( ruleEString )
            // InternalDSLSyntax.g:1243:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__ApiVersionAssignment_4"
    // InternalDSLSyntax.g:1252:1: rule__Service__ApiVersionAssignment_4 : ( ruleEString ) ;
    public final void rule__Service__ApiVersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1256:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1257:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1257:2: ( ruleEString )
            // InternalDSLSyntax.g:1258:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getApiVersionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getApiVersionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ApiVersionAssignment_4"


    // $ANTLR start "rule__Service__DescriptionAssignment_5_1"
    // InternalDSLSyntax.g:1267:1: rule__Service__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Service__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1271:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1272:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1272:2: ( ruleEString )
            // InternalDSLSyntax.g:1273:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Contact__NameAssignment_1"
    // InternalDSLSyntax.g:1282:1: rule__Contact__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Contact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1286:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1287:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1287:2: ( ruleEString )
            // InternalDSLSyntax.g:1288:3: ruleEString
            {
             before(grammarAccess.getContactAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__NameAssignment_1"


    // $ANTLR start "rule__Contact__EmailAssignment_4"
    // InternalDSLSyntax.g:1297:1: rule__Contact__EmailAssignment_4 : ( ruleEString ) ;
    public final void rule__Contact__EmailAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1301:1: ( ( ruleEString ) )
            // InternalDSLSyntax.g:1302:2: ( ruleEString )
            {
            // InternalDSLSyntax.g:1302:2: ( ruleEString )
            // InternalDSLSyntax.g:1303:3: ruleEString
            {
             before(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContactAccess().getEmailEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__EmailAssignment_4"


    // $ANTLR start "rule__Contact__UrlAssignment_5_1"
    // InternalDSLSyntax.g:1312:1: rule__Contact__UrlAssignment_5_1 : ( ruleURL ) ;
    public final void rule__Contact__UrlAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSLSyntax.g:1316:1: ( ( ruleURL ) )
            // InternalDSLSyntax.g:1317:2: ( ruleURL )
            {
            // InternalDSLSyntax.g:1317:2: ( ruleURL )
            // InternalDSLSyntax.g:1318:3: ruleURL
            {
             before(grammarAccess.getContactAccess().getUrlURLParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getContactAccess().getUrlURLParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__UrlAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000808000L});

}