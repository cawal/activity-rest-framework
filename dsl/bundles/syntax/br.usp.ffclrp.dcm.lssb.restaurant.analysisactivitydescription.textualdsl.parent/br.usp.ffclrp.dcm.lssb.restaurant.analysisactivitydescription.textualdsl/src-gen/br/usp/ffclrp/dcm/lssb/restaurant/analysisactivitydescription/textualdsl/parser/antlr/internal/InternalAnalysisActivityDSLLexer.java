package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnalysisActivityDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_LIST_END=12;
    public static final int T__19=19;
    public static final int T__55=55;
    public static final int RULE_ENTITY_START=4;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

    public InternalAnalysisActivityDSLLexer() {;} 
    public InternalAnalysisActivityDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnalysisActivityDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAnalysisActivityDSL.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:11:7: ( 'activity' )
            // InternalAnalysisActivityDSL.g:11:9: 'activity'
            {
            match("activity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:12:7: ( 'remark' )
            // InternalAnalysisActivityDSL.g:12:9: 'remark'
            {
            match("remark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:13:7: ( 'on' )
            // InternalAnalysisActivityDSL.g:13:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:14:7: ( 'with' )
            // InternalAnalysisActivityDSL.g:14:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:15:7: ( 'produces' )
            // InternalAnalysisActivityDSL.g:15:9: 'produces'
            {
            match("produces"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:16:7: ( 'using' )
            // InternalAnalysisActivityDSL.g:16:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:17:7: ( 'parameter' )
            // InternalAnalysisActivityDSL.g:17:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:18:7: ( ':' )
            // InternalAnalysisActivityDSL.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:19:7: ( '=' )
            // InternalAnalysisActivityDSL.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:20:7: ( 'constraints' )
            // InternalAnalysisActivityDSL.g:20:9: 'constraints'
            {
            match("constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:21:7: ( 'dataset' )
            // InternalAnalysisActivityDSL.g:21:9: 'dataset'
            {
            match("dataset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:22:7: ( '-' )
            // InternalAnalysisActivityDSL.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:23:7: ( 'constraint' )
            // InternalAnalysisActivityDSL.g:23:9: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:24:7: ( 'executable' )
            // InternalAnalysisActivityDSL.g:24:9: 'executable'
            {
            match("executable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:25:7: ( 'redirecting' )
            // InternalAnalysisActivityDSL.g:25:9: 'redirecting'
            {
            match("redirecting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:26:7: ( 'stdin' )
            // InternalAnalysisActivityDSL.g:26:9: 'stdin'
            {
            match("stdin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:27:7: ( 'from' )
            // InternalAnalysisActivityDSL.g:27:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:28:7: ( 'stdout' )
            // InternalAnalysisActivityDSL.g:28:9: 'stdout'
            {
            match("stdout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:29:7: ( 'to' )
            // InternalAnalysisActivityDSL.g:29:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:30:7: ( 'stderr' )
            // InternalAnalysisActivityDSL.g:30:9: 'stderr'
            {
            match("stderr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:31:7: ( 'commandLineTemplate' )
            // InternalAnalysisActivityDSL.g:31:9: 'commandLineTemplate'
            {
            match("commandLineTemplate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:32:7: ( 'returns' )
            // InternalAnalysisActivityDSL.g:32:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:33:7: ( 'if' )
            // InternalAnalysisActivityDSL.g:33:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:34:7: ( 'toolname' )
            // InternalAnalysisActivityDSL.g:34:9: 'toolname'
            {
            match("toolname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:35:7: ( 'literals' )
            // InternalAnalysisActivityDSL.g:35:9: 'literals'
            {
            match("literals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:36:7: ( 'Join' )
            // InternalAnalysisActivityDSL.g:36:9: 'Join'
            {
            match("Join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:37:7: ( 'PrependEach' )
            // InternalAnalysisActivityDSL.g:37:9: 'PrependEach'
            {
            match("PrependEach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:38:7: ( 'AppendEach' )
            // InternalAnalysisActivityDSL.g:38:9: 'AppendEach'
            {
            match("AppendEach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:39:7: ( 'AppendListWith' )
            // InternalAnalysisActivityDSL.g:39:9: 'AppendListWith'
            {
            match("AppendListWith"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:40:7: ( 'PrependListWith' )
            // InternalAnalysisActivityDSL.g:40:9: 'PrependListWith'
            {
            match("PrependListWith"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:41:7: ( 'ToFlag' )
            // InternalAnalysisActivityDSL.g:41:9: 'ToFlag'
            {
            match("ToFlag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:42:7: ( 'true:' )
            // InternalAnalysisActivityDSL.g:42:9: 'true:'
            {
            match("true:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:43:7: ( 'false:' )
            // InternalAnalysisActivityDSL.g:43:9: 'false:'
            {
            match("false:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:44:7: ( 'STRING' )
            // InternalAnalysisActivityDSL.g:44:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:45:7: ( 'INTEGER' )
            // InternalAnalysisActivityDSL.g:45:9: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:46:7: ( 'REAL' )
            // InternalAnalysisActivityDSL.g:46:9: 'REAL'
            {
            match("REAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:47:7: ( 'BOOLEAN' )
            // InternalAnalysisActivityDSL.g:47:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:48:7: ( 'SUCCEEDED' )
            // InternalAnalysisActivityDSL.g:48:9: 'SUCCEEDED'
            {
            match("SUCCEEDED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:49:7: ( 'FAILED' )
            // InternalAnalysisActivityDSL.g:49:9: 'FAILED'
            {
            match("FAILED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_ENTITY_START"
    public final void mRULE_ENTITY_START() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2434:19: ( '{' )
            // InternalAnalysisActivityDSL.g:2434:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_START"

    // $ANTLR start "RULE_ENTITY_END"
    public final void mRULE_ENTITY_END() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2436:17: ( '}' )
            // InternalAnalysisActivityDSL.g:2436:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_END"

    // $ANTLR start "RULE_STATEMENT_END"
    public final void mRULE_STATEMENT_END() throws RecognitionException {
        try {
            int _type = RULE_STATEMENT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2438:20: ( ';' )
            // InternalAnalysisActivityDSL.g:2438:22: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMENT_END"

    // $ANTLR start "RULE_LIST_START"
    public final void mRULE_LIST_START() throws RecognitionException {
        try {
            int _type = RULE_LIST_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2440:17: ( '[' )
            // InternalAnalysisActivityDSL.g:2440:19: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST_START"

    // $ANTLR start "RULE_LIST_END"
    public final void mRULE_LIST_END() throws RecognitionException {
        try {
            int _type = RULE_LIST_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2442:15: ( ']' )
            // InternalAnalysisActivityDSL.g:2442:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST_END"

    // $ANTLR start "RULE_LIST_SEPARATOR"
    public final void mRULE_LIST_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_LIST_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2444:21: ( ',' )
            // InternalAnalysisActivityDSL.g:2444:23: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST_SEPARATOR"

    // $ANTLR start "RULE_PIPE_TO"
    public final void mRULE_PIPE_TO() throws RecognitionException {
        try {
            int _type = RULE_PIPE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2446:14: ( '|' )
            // InternalAnalysisActivityDSL.g:2446:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_TO"

    // $ANTLR start "RULE_MULTILINE_STRING"
    public final void mRULE_MULTILINE_STRING() throws RecognitionException {
        try {
            int _type = RULE_MULTILINE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2448:23: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' )
            // InternalAnalysisActivityDSL.g:2448:25: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
            {
            match("'''"); 

            // InternalAnalysisActivityDSL.g:2448:34: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3=='\'') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_3>='\u0000' && LA1_3<='&')||(LA1_3>='(' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2448:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTILINE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2450:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )* )
            // InternalAnalysisActivityDSL.g:2450:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )*
            {
            // InternalAnalysisActivityDSL.g:2450:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2450:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAnalysisActivityDSL.g:2450:40: ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2450:41: ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )
            	    {
            	    // InternalAnalysisActivityDSL.g:2450:41: ( '-' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='-') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalAnalysisActivityDSL.g:2450:41: '-'
            	            {
            	            match('-'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2452:10: ( ( '0' .. '9' )+ )
            // InternalAnalysisActivityDSL.g:2452:12: ( '0' .. '9' )+
            {
            // InternalAnalysisActivityDSL.g:2452:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2452:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2454:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAnalysisActivityDSL.g:2454:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAnalysisActivityDSL.g:2454:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2454:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAnalysisActivityDSL.g:2454:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2454:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:2454:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAnalysisActivityDSL.g:2454:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAnalysisActivityDSL.g:2454:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAnalysisActivityDSL.g:2454:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAnalysisActivityDSL.g:2454:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2456:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAnalysisActivityDSL.g:2456:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAnalysisActivityDSL.g:2456:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2456:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2458:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAnalysisActivityDSL.g:2458:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAnalysisActivityDSL.g:2458:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:2458:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalAnalysisActivityDSL.g:2458:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnalysisActivityDSL.g:2458:41: ( '\\r' )? '\\n'
                    {
                    // InternalAnalysisActivityDSL.g:2458:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAnalysisActivityDSL.g:2458:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2460:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAnalysisActivityDSL.g:2460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAnalysisActivityDSL.g:2460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAnalysisActivityDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAnalysisActivityDSL.g:2462:16: ( . )
            // InternalAnalysisActivityDSL.g:2462:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAnalysisActivityDSL.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_ENTITY_START | RULE_ENTITY_END | RULE_STATEMENT_END | RULE_LIST_START | RULE_LIST_END | RULE_LIST_SEPARATOR | RULE_PIPE_TO | RULE_MULTILINE_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=54;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalAnalysisActivityDSL.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalAnalysisActivityDSL.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalAnalysisActivityDSL.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalAnalysisActivityDSL.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalAnalysisActivityDSL.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalAnalysisActivityDSL.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalAnalysisActivityDSL.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalAnalysisActivityDSL.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalAnalysisActivityDSL.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalAnalysisActivityDSL.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalAnalysisActivityDSL.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalAnalysisActivityDSL.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalAnalysisActivityDSL.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalAnalysisActivityDSL.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalAnalysisActivityDSL.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalAnalysisActivityDSL.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalAnalysisActivityDSL.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalAnalysisActivityDSL.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalAnalysisActivityDSL.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalAnalysisActivityDSL.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalAnalysisActivityDSL.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalAnalysisActivityDSL.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalAnalysisActivityDSL.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalAnalysisActivityDSL.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalAnalysisActivityDSL.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalAnalysisActivityDSL.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalAnalysisActivityDSL.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalAnalysisActivityDSL.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalAnalysisActivityDSL.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalAnalysisActivityDSL.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalAnalysisActivityDSL.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalAnalysisActivityDSL.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalAnalysisActivityDSL.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalAnalysisActivityDSL.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalAnalysisActivityDSL.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalAnalysisActivityDSL.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalAnalysisActivityDSL.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalAnalysisActivityDSL.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // InternalAnalysisActivityDSL.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // InternalAnalysisActivityDSL.g:1:244: RULE_ENTITY_START
                {
                mRULE_ENTITY_START(); 

                }
                break;
            case 41 :
                // InternalAnalysisActivityDSL.g:1:262: RULE_ENTITY_END
                {
                mRULE_ENTITY_END(); 

                }
                break;
            case 42 :
                // InternalAnalysisActivityDSL.g:1:278: RULE_STATEMENT_END
                {
                mRULE_STATEMENT_END(); 

                }
                break;
            case 43 :
                // InternalAnalysisActivityDSL.g:1:297: RULE_LIST_START
                {
                mRULE_LIST_START(); 

                }
                break;
            case 44 :
                // InternalAnalysisActivityDSL.g:1:313: RULE_LIST_END
                {
                mRULE_LIST_END(); 

                }
                break;
            case 45 :
                // InternalAnalysisActivityDSL.g:1:327: RULE_LIST_SEPARATOR
                {
                mRULE_LIST_SEPARATOR(); 

                }
                break;
            case 46 :
                // InternalAnalysisActivityDSL.g:1:347: RULE_PIPE_TO
                {
                mRULE_PIPE_TO(); 

                }
                break;
            case 47 :
                // InternalAnalysisActivityDSL.g:1:360: RULE_MULTILINE_STRING
                {
                mRULE_MULTILINE_STRING(); 

                }
                break;
            case 48 :
                // InternalAnalysisActivityDSL.g:1:382: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // InternalAnalysisActivityDSL.g:1:390: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // InternalAnalysisActivityDSL.g:1:399: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // InternalAnalysisActivityDSL.g:1:411: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // InternalAnalysisActivityDSL.g:1:427: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // InternalAnalysisActivityDSL.g:1:443: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // InternalAnalysisActivityDSL.g:1:451: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\6\53\2\uffff\2\53\1\uffff\17\53\7\uffff\2\51\2\uffff\2\51\2\uffff\1\53\1\uffff\1\53\1\132\4\53\2\uffff\2\53\1\uffff\4\53\1\147\1\53\1\151\13\53\7\uffff\1\121\5\uffff\4\53\1\uffff\14\53\1\uffff\1\53\1\uffff\13\53\1\uffff\4\53\1\u0098\12\53\1\u00a3\4\53\1\u00a8\6\53\1\u00af\6\53\1\uffff\2\53\1\u00b8\4\53\1\u00bd\2\53\1\uffff\2\53\1\uffff\1\53\1\uffff\6\53\1\uffff\3\53\1\u00cc\4\53\1\uffff\4\53\1\uffff\1\u00d5\1\u00d6\1\uffff\4\53\1\u00dc\1\u00dd\3\53\1\u00e1\1\53\1\uffff\1\53\1\u00e4\4\53\1\u00e9\1\53\2\uffff\5\53\2\uffff\1\53\1\u00f2\1\u00f3\1\uffff\1\u00f4\1\53\1\uffff\1\u00f6\3\53\1\uffff\1\53\1\u00fb\1\u00fc\5\53\3\uffff\1\53\1\uffff\1\u0103\3\53\2\uffff\4\53\1\u010b\1\53\1\uffff\1\u010e\1\53\1\u0110\2\53\1\u0113\1\53\1\uffff\1\u0115\1\u0116\1\uffff\1\53\1\uffff\1\u0118\1\53\1\uffff\1\53\2\uffff\1\53\1\uffff\7\53\1\u0123\1\53\1\u0125\1\uffff\1\53\1\uffff\2\53\1\u0129\1\uffff";
    static final String DFA14_eofS =
        "\u012a\uffff";
    static final String DFA14_minS =
        "\1\0\1\143\1\145\1\156\1\151\1\141\1\163\2\uffff\1\157\1\141\1\uffff\1\170\1\164\1\141\1\157\1\146\1\151\1\157\1\162\1\160\1\157\1\124\1\116\1\105\1\117\1\101\7\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\164\1\uffff\1\144\1\55\1\164\1\157\1\162\1\151\2\uffff\1\155\1\164\1\uffff\1\145\1\144\1\157\1\154\1\55\1\165\1\55\1\164\1\151\1\145\1\160\1\106\1\122\1\103\1\124\1\101\1\117\1\111\7\uffff\1\47\5\uffff\1\151\1\141\1\151\1\165\1\uffff\1\150\1\144\1\141\1\156\1\163\1\155\1\141\1\143\1\145\1\155\1\163\1\154\1\uffff\1\145\1\uffff\1\145\1\156\1\160\1\145\1\154\1\111\1\103\1\105\3\114\1\uffff\1\166\3\162\1\55\1\165\1\155\1\147\1\164\1\141\1\163\1\165\1\156\1\165\1\162\1\55\1\145\1\156\1\72\1\162\1\55\1\145\1\156\1\141\1\116\1\105\1\107\1\55\2\105\1\151\1\153\1\145\1\156\1\uffff\1\143\1\145\1\55\1\162\1\156\1\145\1\164\1\55\1\164\1\162\1\uffff\1\72\1\141\1\uffff\1\141\1\uffff\1\156\1\144\1\147\1\107\2\105\1\uffff\1\101\1\104\1\164\1\55\1\143\1\163\1\145\1\164\1\uffff\1\141\1\144\1\164\1\141\1\uffff\2\55\1\uffff\1\155\1\154\1\144\1\105\2\55\1\104\1\122\1\116\1\55\1\171\1\uffff\1\164\1\55\1\163\1\145\1\151\1\114\1\55\1\142\2\uffff\1\145\1\163\1\105\1\141\1\151\2\uffff\1\105\2\55\1\uffff\1\55\1\151\1\uffff\1\55\1\162\1\156\1\151\1\uffff\1\154\2\55\1\141\1\151\1\143\1\163\1\104\3\uffff\1\156\1\uffff\1\55\1\164\1\156\1\145\2\uffff\1\143\1\163\1\150\1\164\1\55\1\147\1\uffff\1\55\1\145\1\55\1\150\1\164\1\55\1\127\1\uffff\2\55\1\uffff\1\124\1\uffff\1\55\1\127\1\uffff\1\151\2\uffff\1\145\1\uffff\1\151\1\164\1\155\1\164\1\150\1\160\1\150\1\55\1\154\1\55\1\uffff\1\141\1\uffff\1\164\1\145\1\55\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\143\1\145\1\156\1\151\1\162\1\163\2\uffff\1\157\1\141\1\uffff\1\170\1\164\2\162\1\146\1\151\1\157\1\162\1\160\1\157\1\125\1\116\1\105\1\117\1\101\7\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\164\1\uffff\1\164\1\172\1\164\1\157\1\162\1\151\2\uffff\1\156\1\164\1\uffff\1\145\1\144\1\157\1\154\1\172\1\165\1\172\1\164\1\151\1\145\1\160\1\106\1\122\1\103\1\124\1\101\1\117\1\111\7\uffff\1\47\5\uffff\1\151\1\141\1\151\1\165\1\uffff\1\150\1\144\1\141\1\156\1\163\1\155\1\141\1\143\1\157\1\155\1\163\1\154\1\uffff\1\145\1\uffff\1\145\1\156\1\160\1\145\1\154\1\111\1\103\1\105\3\114\1\uffff\1\166\3\162\1\172\1\165\1\155\1\147\1\164\1\141\1\163\1\165\1\156\1\165\1\162\1\172\1\145\1\156\1\72\1\162\1\172\1\145\1\156\1\141\1\116\1\105\1\107\1\172\2\105\1\151\1\153\1\145\1\156\1\uffff\1\143\1\145\1\172\1\162\1\156\1\145\1\164\1\172\1\164\1\162\1\uffff\1\72\1\141\1\uffff\1\141\1\uffff\1\156\1\144\1\147\1\107\2\105\1\uffff\1\101\1\104\1\164\1\172\1\143\1\163\1\145\1\164\1\uffff\1\141\1\144\1\164\1\141\1\uffff\2\172\1\uffff\1\155\1\154\1\144\1\114\2\172\1\104\1\122\1\116\1\172\1\171\1\uffff\1\164\1\172\1\163\1\145\1\151\1\114\1\172\1\142\2\uffff\1\145\1\163\1\114\1\141\1\151\2\uffff\1\105\2\172\1\uffff\1\172\1\151\1\uffff\1\172\1\162\1\156\1\151\1\uffff\1\154\2\172\1\141\1\151\1\143\1\163\1\104\3\uffff\1\156\1\uffff\1\172\1\164\1\156\1\145\2\uffff\1\143\1\163\1\150\1\164\1\172\1\147\1\uffff\1\172\1\145\1\172\1\150\1\164\1\172\1\127\1\uffff\2\172\1\uffff\1\124\1\uffff\1\172\1\127\1\uffff\1\151\2\uffff\1\145\1\uffff\1\151\1\164\1\155\1\164\1\150\1\160\1\150\1\172\1\154\1\172\1\uffff\1\141\1\uffff\1\164\1\145\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\10\1\11\2\uffff\1\14\17\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\2\uffff\1\60\1\61\2\uffff\1\65\1\66\1\uffff\1\60\6\uffff\1\10\1\11\2\uffff\1\14\22\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\uffff\1\62\1\61\1\63\1\64\1\65\4\uffff\1\3\14\uffff\1\23\1\uffff\1\27\13\uffff\1\57\42\uffff\1\4\12\uffff\1\21\2\uffff\1\40\1\uffff\1\32\6\uffff\1\44\10\uffff\1\6\4\uffff\1\20\2\uffff\1\41\13\uffff\1\2\10\uffff\1\22\1\24\5\uffff\1\37\1\42\3\uffff\1\47\2\uffff\1\26\4\uffff\1\13\10\uffff\1\43\1\45\1\1\1\uffff\1\5\4\uffff\1\30\1\31\6\uffff\1\7\7\uffff\1\46\2\uffff\1\15\1\uffff\1\16\2\uffff\1\34\1\uffff\1\17\1\12\1\uffff\1\33\12\uffff\1\35\1\uffff\1\36\3\uffff\1\25";
    static final String DFA14_specialS =
        "\1\2\41\uffff\1\1\3\uffff\1\0\u0103\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\46\4\51\1\42\4\51\1\40\1\13\1\51\1\47\12\45\1\7\1\35\1\51\1\10\3\51\1\24\1\31\3\44\1\32\2\44\1\27\1\22\5\44\1\23\1\44\1\30\1\26\1\25\6\44\1\36\1\51\1\37\1\43\1\44\1\51\1\1\1\44\1\11\1\12\1\14\1\16\2\44\1\20\2\44\1\21\2\44\1\3\1\5\1\44\1\2\1\15\1\17\1\6\1\44\1\4\3\44\1\33\1\41\1\34\uff82\51",
            "\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\60\20\uffff\1\57",
            "\1\61",
            "",
            "",
            "\1\64",
            "\1\65",
            "",
            "\1\67",
            "\1\70",
            "\1\72\20\uffff\1\71",
            "\1\73\2\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\121\1\120\uffd8\121",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\0\121",
            "\1\123\4\uffff\1\124",
            "",
            "",
            "\1\126",
            "",
            "\1\130\10\uffff\1\127\6\uffff\1\131",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\1\140\1\137",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\146\13\53",
            "\1\150",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0084\3\uffff\1\u0082\5\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\6\uffff\1\u00db",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed\6\uffff\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "\1\u00f1",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f5",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "",
            "",
            "\1\u0102",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u010c",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u010d\7\53",
            "\1\u010f",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0111",
            "\1\u0112",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0114",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0117",
            "",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0119",
            "",
            "\1\u011a",
            "",
            "",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0124",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\53\2\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_ENTITY_START | RULE_ENTITY_END | RULE_STATEMENT_END | RULE_LIST_START | RULE_LIST_END | RULE_LIST_SEPARATOR | RULE_PIPE_TO | RULE_MULTILINE_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_38 = input.LA(1);

                        s = -1;
                        if ( ((LA14_38>='\u0000' && LA14_38<='\uFFFF')) ) {s = 81;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( (LA14_34=='\'') ) {s = 80;}

                        else if ( ((LA14_34>='\u0000' && LA14_34<='&')||(LA14_34>='(' && LA14_34<='\uFFFF')) ) {s = 81;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='a') ) {s = 1;}

                        else if ( (LA14_0=='r') ) {s = 2;}

                        else if ( (LA14_0=='o') ) {s = 3;}

                        else if ( (LA14_0=='w') ) {s = 4;}

                        else if ( (LA14_0=='p') ) {s = 5;}

                        else if ( (LA14_0=='u') ) {s = 6;}

                        else if ( (LA14_0==':') ) {s = 7;}

                        else if ( (LA14_0=='=') ) {s = 8;}

                        else if ( (LA14_0=='c') ) {s = 9;}

                        else if ( (LA14_0=='d') ) {s = 10;}

                        else if ( (LA14_0=='-') ) {s = 11;}

                        else if ( (LA14_0=='e') ) {s = 12;}

                        else if ( (LA14_0=='s') ) {s = 13;}

                        else if ( (LA14_0=='f') ) {s = 14;}

                        else if ( (LA14_0=='t') ) {s = 15;}

                        else if ( (LA14_0=='i') ) {s = 16;}

                        else if ( (LA14_0=='l') ) {s = 17;}

                        else if ( (LA14_0=='J') ) {s = 18;}

                        else if ( (LA14_0=='P') ) {s = 19;}

                        else if ( (LA14_0=='A') ) {s = 20;}

                        else if ( (LA14_0=='T') ) {s = 21;}

                        else if ( (LA14_0=='S') ) {s = 22;}

                        else if ( (LA14_0=='I') ) {s = 23;}

                        else if ( (LA14_0=='R') ) {s = 24;}

                        else if ( (LA14_0=='B') ) {s = 25;}

                        else if ( (LA14_0=='F') ) {s = 26;}

                        else if ( (LA14_0=='{') ) {s = 27;}

                        else if ( (LA14_0=='}') ) {s = 28;}

                        else if ( (LA14_0==';') ) {s = 29;}

                        else if ( (LA14_0=='[') ) {s = 30;}

                        else if ( (LA14_0==']') ) {s = 31;}

                        else if ( (LA14_0==',') ) {s = 32;}

                        else if ( (LA14_0=='|') ) {s = 33;}

                        else if ( (LA14_0=='\'') ) {s = 34;}

                        else if ( (LA14_0=='^') ) {s = 35;}

                        else if ( ((LA14_0>='C' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='K' && LA14_0<='O')||LA14_0=='Q'||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||LA14_0=='q'||LA14_0=='v'||(LA14_0>='x' && LA14_0<='z')) ) {s = 36;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 37;}

                        else if ( (LA14_0=='\"') ) {s = 38;}

                        else if ( (LA14_0=='/') ) {s = 39;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 40;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='.'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}