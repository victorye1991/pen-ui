// $ANTLR 3.1.2 /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g 2009-06-17 17:46:47
package org.six11.slippy;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SlippySyntaxLexer extends Lexer {
    public static final int COMMA=46;
    public static final int MINUS=41;
    public static final int PERCENT=44;
    public static final int HASH=25;
    public static final int LPAR=26;
    public static final int OCT_ESC=52;
    public static final int MIXES=12;
    public static final int FALSE=7;
    public static final int DONE=16;
    public static final int IMPORT=5;
    public static final int OR=21;
    public static final int DOT=45;
    public static final int AND=22;
    public static final int INT=8;
    public static final int HEX_DIGIT=53;
    public static final int STR_LITERAL=50;
    public static final int PLUS=40;
    public static final int EXTENDS=11;
    public static final int NEQ=35;
    public static final int AT=24;
    public static final int ID=48;
    public static final int LETTER=47;
    public static final int LCB=30;
    public static final int RPAR=27;
    public static final int RCB=31;
    public static final int WHILE=17;
    public static final int WS=55;
    public static final int LSB=28;
    public static final int NEW=13;
    public static final int EQ=33;
    public static final int LOOP=18;
    public static final int LT=36;
    public static final int GT=38;
    public static final int LINE_COMMENT=54;
    public static final int GTEQ=39;
    public static final int EQEQ=34;
    public static final int ESC_SEQ=49;
    public static final int LAMBDA=15;
    public static final int UNI_ESC=51;
    public static final int FORWARD_SLASH=43;
    public static final int CLASS=10;
    public static final int DEFINE=14;
    public static final int ELSE=19;
    public static final int IF=20;
    public static final int LTEQ=37;
    public static final int EOF=-1;
    public static final int CODESET=4;
    public static final int NUM=9;
    public static final int ASTERISK=42;
    public static final int COLON=32;
    public static final int RSB=29;
    public static final int NOT=23;
    public static final int TRUE=6;

    // delegates
    // delegators

    public SlippySyntaxLexer() {;} 
    public SlippySyntaxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SlippySyntaxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g"; }

    // $ANTLR start "CODESET"
    public final void mCODESET() throws RecognitionException {
        try {
            int _type = CODESET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:5:9: ( 'codeset' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:5:11: 'codeset'
            {
            match("codeset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CODESET"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:8:8: ( 'import' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:8:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:11:6: ( 'true' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:11:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:14:7: ( 'false' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:17:5: ( ( INT )+ | ( INT )* '.' ( INT )+ )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:17:7: ( INT )+
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:17:7: ( INT )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:17:7: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:18:4: ( INT )* '.' ( INT )+
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:18:4: ( INT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:18:4: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('.'); 
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:18:13: ( INT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:18:13: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:21:7: ( 'class' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:21:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:24:9: ( 'extends' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:24:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "MIXES"
    public final void mMIXES() throws RecognitionException {
        try {
            int _type = MIXES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:27:7: ( 'mixes' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:27:9: 'mixes'
            {
            match("mixes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIXES"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:30:5: ( 'new' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:30:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:33:8: ( 'define' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:33:10: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "LAMBDA"
    public final void mLAMBDA() throws RecognitionException {
        try {
            int _type = LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:36:8: ( 'lambda' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:36:10: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDA"

    // $ANTLR start "DONE"
    public final void mDONE() throws RecognitionException {
        try {
            int _type = DONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:39:6: ( 'done' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:39:8: 'done'
            {
            match("done"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DONE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:42:7: ( 'while' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:42:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:45:6: ( 'loop' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:45:8: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:48:6: ( 'else' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:48:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:54:4: ( 'if' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:54:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:57:4: ( 'or' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:57:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:60:5: ( 'and' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:60:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:63:5: ( 'not' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:63:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:66:4: ( '@' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:66:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:69:6: ( '#' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:69:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:72:6: ( '(' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:72:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:75:6: ( ')' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:75:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LSB"
    public final void mLSB() throws RecognitionException {
        try {
            int _type = LSB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:78:5: ( '[' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:78:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSB"

    // $ANTLR start "RSB"
    public final void mRSB() throws RecognitionException {
        try {
            int _type = RSB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:81:5: ( ']' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:81:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSB"

    // $ANTLR start "LCB"
    public final void mLCB() throws RecognitionException {
        try {
            int _type = LCB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:84:5: ( '{' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:84:7: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCB"

    // $ANTLR start "RCB"
    public final void mRCB() throws RecognitionException {
        try {
            int _type = RCB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:87:5: ( '}' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:87:7: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCB"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:90:7: ( ':' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:90:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:93:4: ( '=' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:93:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:96:6: ( '==' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:96:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:99:5: ( '!=' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:99:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:102:4: ( '<' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:102:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:105:6: ( '<=' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:105:8: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:108:4: ( '>' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:108:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:111:6: ( '>=' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:111:8: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:114:6: ( '+' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:114:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:117:7: ( '-' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:117:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:120:9: ( '*' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:120:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:124:2: ( '/' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:124:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORWARD_SLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:127:9: ( '%' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:127:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:130:5: ( '.' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:130:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:133:7: ( ',' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:133:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:4: ( ( LETTER | '_' ) ( LETTER | '_' | INT )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:6: ( LETTER | '_' ) ( LETTER | '_' | INT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:21: ( LETTER | '_' | INT )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt5=1;
                    }
                    break;
                case '_':
                    {
                    alt5=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:22: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:31: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:136:37: INT
            	    {
            	    mINT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:140:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:140:10: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:144:5: ( ( '0' .. '9' )+ )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:144:7: ( '0' .. '9' )+
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:144:7: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:144:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STR_LITERAL"
    public final void mSTR_LITERAL() throws RecognitionException {
        try {
            int _type = STR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:148:6: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:148:10: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:148:14: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:148:16: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:148:26: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR_LITERAL"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:153:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNI_ESC | OCT_ESC )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:153:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:154:9: UNI_ESC
                    {
                    mUNI_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:155:9: OCT_ESC
                    {
                    mOCT_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCT_ESC"
    public final void mOCT_ESC() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:9: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>='0' && LA9_5<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:11: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:16: ( '0' .. '3' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:17: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:27: ( '0' .. '7' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:28: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:38: ( '0' .. '7' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:159:39: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:160:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:160:9: ( '0' .. '7' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:160:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:160:20: ( '0' .. '7' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:160:21: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:161:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:161:9: ( '0' .. '7' )
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:161:10: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCT_ESC"

    // $ANTLR start "UNI_ESC"
    public final void mUNI_ESC() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:165:9: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:165:11: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNI_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:170:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:170:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:2: ( ( ';' ( . )* '\\n' ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:4: ( ';' ( . )* '\\n' )
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:4: ( ';' ( . )* '\\n' )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:5: ';' ( . )* '\\n'
            {
            match(';'); 
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:9: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:174:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\n'); 

            }

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:177:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:177:6: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:8: ( CODESET | IMPORT | TRUE | FALSE | NUM | CLASS | EXTENDS | MIXES | NEW | DEFINE | LAMBDA | DONE | WHILE | LOOP | ELSE | IF | OR | AND | NOT | AT | HASH | LPAR | RPAR | LSB | RSB | LCB | RCB | COLON | EQ | EQEQ | NEQ | LT | LTEQ | GT | GTEQ | PLUS | MINUS | ASTERISK | FORWARD_SLASH | PERCENT | DOT | COMMA | ID | STR_LITERAL | LINE_COMMENT | WS )
        int alt11=46;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:10: CODESET
                {
                mCODESET(); 

                }
                break;
            case 2 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:18: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 3 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:25: TRUE
                {
                mTRUE(); 

                }
                break;
            case 4 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:30: FALSE
                {
                mFALSE(); 

                }
                break;
            case 5 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:36: NUM
                {
                mNUM(); 

                }
                break;
            case 6 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:40: CLASS
                {
                mCLASS(); 

                }
                break;
            case 7 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:46: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 8 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:54: MIXES
                {
                mMIXES(); 

                }
                break;
            case 9 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:60: NEW
                {
                mNEW(); 

                }
                break;
            case 10 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:64: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 11 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:71: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 12 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:78: DONE
                {
                mDONE(); 

                }
                break;
            case 13 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:83: WHILE
                {
                mWHILE(); 

                }
                break;
            case 14 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:89: LOOP
                {
                mLOOP(); 

                }
                break;
            case 15 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:94: ELSE
                {
                mELSE(); 

                }
                break;
            case 16 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:99: IF
                {
                mIF(); 

                }
                break;
            case 17 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:102: OR
                {
                mOR(); 

                }
                break;
            case 18 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:105: AND
                {
                mAND(); 

                }
                break;
            case 19 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:109: NOT
                {
                mNOT(); 

                }
                break;
            case 20 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:113: AT
                {
                mAT(); 

                }
                break;
            case 21 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:116: HASH
                {
                mHASH(); 

                }
                break;
            case 22 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:121: LPAR
                {
                mLPAR(); 

                }
                break;
            case 23 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:126: RPAR
                {
                mRPAR(); 

                }
                break;
            case 24 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:131: LSB
                {
                mLSB(); 

                }
                break;
            case 25 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:135: RSB
                {
                mRSB(); 

                }
                break;
            case 26 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:139: LCB
                {
                mLCB(); 

                }
                break;
            case 27 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:143: RCB
                {
                mRCB(); 

                }
                break;
            case 28 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:147: COLON
                {
                mCOLON(); 

                }
                break;
            case 29 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:153: EQ
                {
                mEQ(); 

                }
                break;
            case 30 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:156: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 31 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:161: NEQ
                {
                mNEQ(); 

                }
                break;
            case 32 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:165: LT
                {
                mLT(); 

                }
                break;
            case 33 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:168: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 34 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:173: GT
                {
                mGT(); 

                }
                break;
            case 35 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:176: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 36 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:181: PLUS
                {
                mPLUS(); 

                }
                break;
            case 37 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:186: MINUS
                {
                mMINUS(); 

                }
                break;
            case 38 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:192: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 39 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:201: FORWARD_SLASH
                {
                mFORWARD_SLASH(); 

                }
                break;
            case 40 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:215: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 41 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:223: DOT
                {
                mDOT(); 

                }
                break;
            case 42 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:227: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 43 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:233: ID
                {
                mID(); 

                }
                break;
            case 44 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:236: STR_LITERAL
                {
                mSTR_LITERAL(); 

                }
                break;
            case 45 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:248: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 46 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxLexer.g:1:261: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA4_eotS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\2\56\2\uffff";
    static final String DFA4_maxS =
        "\2\71\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "17:1: NUM : ( ( INT )+ | ( INT )* '.' ( INT )+ );";
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\4\42\1\uffff\1\54\10\42\11\uffff\1\72\1\uffff\1\74\1\76"+
        "\12\uffff\3\42\1\102\2\42\1\uffff\12\42\1\117\1\42\6\uffff\3\42"+
        "\1\uffff\5\42\1\131\1\132\5\42\1\uffff\1\140\3\42\1\144\2\42\1\147"+
        "\1\42\2\uffff\1\42\1\152\1\42\1\154\1\42\1\uffff\1\42\1\157\1\42"+
        "\1\uffff\1\161\1\42\1\uffff\1\163\1\42\1\uffff\1\42\1\uffff\1\166"+
        "\1\42\1\uffff\1\170\1\uffff\1\42\1\uffff\1\172\1\173\1\uffff\1\174"+
        "\1\uffff\1\175\4\uffff";
    static final String DFA11_eofS =
        "\176\uffff";
    static final String DFA11_minS =
        "\1\11\1\154\1\146\1\162\1\141\1\uffff\1\60\1\154\1\151\2\145\1\141"+
        "\1\150\1\162\1\156\11\uffff\1\75\1\uffff\2\75\12\uffff\1\144\1\141"+
        "\1\160\1\60\1\165\1\154\1\uffff\1\164\1\163\1\170\1\167\1\164\1"+
        "\146\1\156\1\155\1\157\1\151\1\60\1\144\6\uffff\1\145\1\163\1\157"+
        "\1\uffff\1\145\1\163\3\145\2\60\1\151\1\145\1\142\1\160\1\154\1"+
        "\uffff\1\60\2\163\1\162\1\60\1\145\1\156\1\60\1\163\2\uffff\1\156"+
        "\1\60\1\144\1\60\1\145\1\uffff\1\145\1\60\1\164\1\uffff\1\60\1\144"+
        "\1\uffff\1\60\1\145\1\uffff\1\141\1\uffff\1\60\1\164\1\uffff\1\60"+
        "\1\uffff\1\163\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA11_maxS =
        "\1\175\1\157\1\155\1\162\1\141\1\uffff\1\71\1\170\1\151\3\157\1"+
        "\150\1\162\1\156\11\uffff\1\75\1\uffff\2\75\12\uffff\1\144\1\141"+
        "\1\160\1\172\1\165\1\154\1\uffff\1\164\1\163\1\170\1\167\1\164\1"+
        "\146\1\156\1\155\1\157\1\151\1\172\1\144\6\uffff\1\145\1\163\1\157"+
        "\1\uffff\1\145\1\163\3\145\2\172\1\151\1\145\1\142\1\160\1\154\1"+
        "\uffff\1\172\2\163\1\162\1\172\1\145\1\156\1\172\1\163\2\uffff\1"+
        "\156\1\172\1\144\1\172\1\145\1\uffff\1\145\1\172\1\164\1\uffff\1"+
        "\172\1\144\1\uffff\1\172\1\145\1\uffff\1\141\1\uffff\1\172\1\164"+
        "\1\uffff\1\172\1\uffff\1\163\1\uffff\2\172\1\uffff\1\172\1\uffff"+
        "\1\172\4\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\5\11\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
        "\34\1\uffff\1\37\2\uffff\1\44\1\45\1\46\1\47\1\50\1\52\1\53\1\54"+
        "\1\55\1\56\6\uffff\1\51\14\uffff\1\36\1\35\1\41\1\40\1\43\1\42\3"+
        "\uffff\1\20\14\uffff\1\21\11\uffff\1\11\1\23\5\uffff\1\22\3\uffff"+
        "\1\3\2\uffff\1\17\2\uffff\1\14\1\uffff\1\16\2\uffff\1\6\1\uffff"+
        "\1\4\1\uffff\1\10\2\uffff\1\15\1\uffff\1\2\1\uffff\1\12\1\13\1\1"+
        "\1\7";
    static final String DFA11_specialS =
        "\176\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\31\1\43\1\20\1\uffff\1\40"+
            "\2\uffff\1\21\1\22\1\36\1\34\1\41\1\35\1\6\1\37\12\5\1\27\1"+
            "\44\1\32\1\30\1\33\1\uffff\1\17\32\42\1\23\1\uffff\1\24\1\uffff"+
            "\1\42\1\uffff\1\16\1\42\1\1\1\12\1\7\1\4\2\42\1\2\2\42\1\13"+
            "\1\10\1\11\1\15\4\42\1\3\2\42\1\14\3\42\1\25\1\uffff\1\26",
            "\1\47\2\uffff\1\46",
            "\1\51\6\uffff\1\50",
            "\1\52",
            "\1\53",
            "",
            "\12\5",
            "\1\56\13\uffff\1\55",
            "\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62\11\uffff\1\63",
            "\1\64\15\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "\1\73",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\145",
            "\1\146",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\150",
            "",
            "",
            "\1\151",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\155",
            "",
            "\1\156",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\160",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\162",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\164",
            "",
            "\1\165",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\167",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\171",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CODESET | IMPORT | TRUE | FALSE | NUM | CLASS | EXTENDS | MIXES | NEW | DEFINE | LAMBDA | DONE | WHILE | LOOP | ELSE | IF | OR | AND | NOT | AT | HASH | LPAR | RPAR | LSB | RSB | LCB | RCB | COLON | EQ | EQEQ | NEQ | LT | LTEQ | GT | GTEQ | PLUS | MINUS | ASTERISK | FORWARD_SLASH | PERCENT | DOT | COMMA | ID | STR_LITERAL | LINE_COMMENT | WS );";
        }
    }
 

}