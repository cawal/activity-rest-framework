/*
 * generated by Xtext 2.25.0
 */
package br.com.cawal.sddl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SDDLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.Deployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploymentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cServiceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cServiceServiceParserRuleCall_3_0 = (RuleCall)cServiceAssignment_3.eContents().get(0);
		private final Keyword cIntoKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cContainerAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContainerServiceContainerParserRuleCall_5_0 = (RuleCall)cContainerAssignment_5.eContents().get(0);
		private final Assignment cContactInformationAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cContactInformationContactParserRuleCall_6_0 = (RuleCall)cContactInformationAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Deployment returns Deployment:
		//    'deployment'
		//    '{'
		//        'of' service=Service
		//        'into' container=ServiceContainer
		//        (contactInformation=Contact)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'deployment'
		//'{'
		//    'of' service=Service
		//    'into' container=ServiceContainer
		//    (contactInformation=Contact)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'deployment'
		public Keyword getDeploymentKeyword_0() { return cDeploymentKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'of'
		public Keyword getOfKeyword_2() { return cOfKeyword_2; }
		
		//service=Service
		public Assignment getServiceAssignment_3() { return cServiceAssignment_3; }
		
		//Service
		public RuleCall getServiceServiceParserRuleCall_3_0() { return cServiceServiceParserRuleCall_3_0; }
		
		//'into'
		public Keyword getIntoKeyword_4() { return cIntoKeyword_4; }
		
		//container=ServiceContainer
		public Assignment getContainerAssignment_5() { return cContainerAssignment_5; }
		
		//ServiceContainer
		public RuleCall getContainerServiceContainerParserRuleCall_5_0() { return cContainerServiceContainerParserRuleCall_5_0; }
		
		//(contactInformation=Contact)?
		public Assignment getContactInformationAssignment_6() { return cContactInformationAssignment_6; }
		
		//Contact
		public RuleCall getContactInformationContactParserRuleCall_6_0() { return cContactInformationContactParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ServiceContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.ServiceContainer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cBaseUrlKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBaseUrlAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBaseUrlURLParserRuleCall_4_0 = (RuleCall)cBaseUrlAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDescriptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_5_1_0 = (RuleCall)cDescriptionAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ServiceContainer returns ServiceContainer:
		//    'container'
		//    name=EString
		//    '{'
		//        'base-url' baseUrl=URL
		//        ('description' description=EString)?
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'container'
		//name=EString
		//'{'
		//    'base-url' baseUrl=URL
		//    ('description' description=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'container'
		public Keyword getContainerKeyword_0() { return cContainerKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'base-url'
		public Keyword getBaseUrlKeyword_3() { return cBaseUrlKeyword_3; }
		
		//baseUrl=URL
		public Assignment getBaseUrlAssignment_4() { return cBaseUrlAssignment_4; }
		
		//URL
		public RuleCall getBaseUrlURLParserRuleCall_4_0() { return cBaseUrlURLParserRuleCall_4_0; }
		
		//('description' description=EString)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'description'
		public Keyword getDescriptionKeyword_5_0() { return cDescriptionKeyword_5_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_5_1() { return cDescriptionAssignment_5_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_5_1_0() { return cDescriptionEStringParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.Service");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cApiVersionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cApiVersionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cApiVersionEStringParserRuleCall_4_0 = (RuleCall)cApiVersionAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDescriptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_5_1_0 = (RuleCall)cDescriptionAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Service returns Service:
		//    'service'
		//    name=EString
		//    '{'
		//        'api-version' apiVersion=EString
		//        ('description' description=EString)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'service'
		//name=EString
		//'{'
		//    'api-version' apiVersion=EString
		//    ('description' description=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'service'
		public Keyword getServiceKeyword_0() { return cServiceKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'api-version'
		public Keyword getApiVersionKeyword_3() { return cApiVersionKeyword_3; }
		
		//apiVersion=EString
		public Assignment getApiVersionAssignment_4() { return cApiVersionAssignment_4; }
		
		//EString
		public RuleCall getApiVersionEStringParserRuleCall_4_0() { return cApiVersionEStringParserRuleCall_4_0; }
		
		//('description' description=EString)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'description'
		public Keyword getDescriptionKeyword_5_0() { return cDescriptionKeyword_5_0; }
		
		//description=EString
		public Assignment getDescriptionAssignment_5_1() { return cDescriptionAssignment_5_1; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_5_1_0() { return cDescriptionEStringParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ContactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.Contact");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContactKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEmailKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEmailAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEmailEStringParserRuleCall_4_0 = (RuleCall)cEmailAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cUrlKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cUrlAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cUrlURLParserRuleCall_5_1_0 = (RuleCall)cUrlAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Contact returns Contact:
		//    'contact' name=EString
		//    '{'
		//        'email' email=EString
		//        ('url' url=URL)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'contact' name=EString
		//'{'
		//    'email' email=EString
		//    ('url' url=URL)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'contact'
		public Keyword getContactKeyword_0() { return cContactKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'email'
		public Keyword getEmailKeyword_3() { return cEmailKeyword_3; }
		
		//email=EString
		public Assignment getEmailAssignment_4() { return cEmailAssignment_4; }
		
		//EString
		public RuleCall getEmailEStringParserRuleCall_4_0() { return cEmailEStringParserRuleCall_4_0; }
		
		//('url' url=URL)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'url'
		public Keyword getUrlKeyword_5_0() { return cUrlKeyword_5_0; }
		
		//url=URL
		public Assignment getUrlAssignment_5_1() { return cUrlAssignment_5_1; }
		
		//URL
		public RuleCall getUrlURLParserRuleCall_5_1_0() { return cUrlURLParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class URLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "br.com.cawal.sddl.SDDL.URL");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//URL returns URL: /* Implemented in the ValueConverterService class */
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		///* Implemented in the ValueConverterService class */
		//   STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final DeploymentElements pDeployment;
	private final ServiceContainerElements pServiceContainer;
	private final ServiceElements pService;
	private final ContactElements pContact;
	private final EStringElements pEString;
	private final URLElements pURL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SDDLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDeployment = new DeploymentElements();
		this.pServiceContainer = new ServiceContainerElements();
		this.pService = new ServiceElements();
		this.pContact = new ContactElements();
		this.pEString = new EStringElements();
		this.pURL = new URLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("br.com.cawal.sddl.SDDL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Deployment returns Deployment:
	//    'deployment'
	//    '{'
	//        'of' service=Service
	//        'into' container=ServiceContainer
	//        (contactInformation=Contact)?
	//    '}';
	public DeploymentElements getDeploymentAccess() {
		return pDeployment;
	}
	
	public ParserRule getDeploymentRule() {
		return getDeploymentAccess().getRule();
	}
	
	//ServiceContainer returns ServiceContainer:
	//    'container'
	//    name=EString
	//    '{'
	//        'base-url' baseUrl=URL
	//        ('description' description=EString)?
	//    '}'
	//;
	public ServiceContainerElements getServiceContainerAccess() {
		return pServiceContainer;
	}
	
	public ParserRule getServiceContainerRule() {
		return getServiceContainerAccess().getRule();
	}
	
	//Service returns Service:
	//    'service'
	//    name=EString
	//    '{'
	//        'api-version' apiVersion=EString
	//        ('description' description=EString)?
	//    '}';
	public ServiceElements getServiceAccess() {
		return pService;
	}
	
	public ParserRule getServiceRule() {
		return getServiceAccess().getRule();
	}
	
	//Contact returns Contact:
	//    'contact' name=EString
	//    '{'
	//        'email' email=EString
	//        ('url' url=URL)?
	//    '}';
	public ContactElements getContactAccess() {
		return pContact;
	}
	
	public ParserRule getContactRule() {
		return getContactAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//URL returns URL: /* Implemented in the ValueConverterService class */
	//    STRING;
	public URLElements getURLAccess() {
		return pURL;
	}
	
	public ParserRule getURLRule() {
		return getURLAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
