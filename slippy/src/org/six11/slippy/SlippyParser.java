// $ANTLR 3.1.2 /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g 2009-06-22 12:53:08
package org.six11.slippy;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SlippyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CODESET", "IMPORT", "TRUE", "FALSE", "INT", "NUM", "CLASS", "EXTENDS", "MIXES", "NEW", "DEFINE", "LAMBDA", "DONE", "WHILE", "LOOP", "ELSE", "IF", "OR", "AND", "NOT", "AT", "HASH", "LPAR", "RPAR", "LSB", "RSB", "LCB", "RCB", "COLON", "EQ", "EQEQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", "ASTERISK", "FORWARD_SLASH", "PERCENT", "DOT", "COMMA", "LETTER", "ID", "ESC_SEQ", "STR_LITERAL", "UNI_ESC", "OCT_ESC", "HEX_DIGIT", "LINE_COMMENT", "WS", "ANNOTATION", "BLOCK", "DEF_FIELD", "DEF_FUNCTION", "DEF_CLASS", "DEF_PARAM_LIST", "EXPR", "EXPR_ADD", "EXPR_AND", "EXPR_ARRAY_INIT", "EXPR_ARRAY_INDEX", "EXPR_ASSIGN", "EXPR_CONSTRUCTOR", "EXPR_DIV", "EXPR_EQ", "EXPR_CLASS_EXTENDS", "EXPR_FQ_CLASS_NAME", "EXPR_FUNC_CALL", "EXPR_GT", "EXPR_GTEQ", "EXPR_LAMBDA", "EXPR_LIST", "EXPR_LT", "EXPR_LTEQ", "EXPR_MEMBER", "EXPR_CLASS_MIXES", "EXPR_MAP_INIT", "EXPR_MAP_ELEMENT", "EXPR_MINUS", "EXPR_MODULO", "EXPR_MULT", "EXPR_NEQ", "EXPR_OR", "EXPR_UNARY_NEG", "EXPR_UNARY_NOT", "EXPR_UNARY_POS", "PROG", "STMT", "STMT_CODESET", "STMT_CODESET_DECL", "STMT_CONDITION_BLOCK", "STMT_ELSE", "STMT_IF", "STMT_IMPORT", "STMT_LOOP", "STMT_WHILE"
    };
    public static final int COMMA=46;
    public static final int EXPR_LIST=77;
    public static final int STMT=93;
    public static final int MINUS=41;
    public static final int HASH=25;
    public static final int EXPR=62;
    public static final int LPAR=26;
    public static final int OCT_ESC=52;
    public static final int MIXES=12;
    public static final int FALSE=7;
    public static final int EXPR_CLASS_EXTENDS=71;
    public static final int DONE=16;
    public static final int IMPORT=5;
    public static final int STMT_CODESET_DECL=95;
    public static final int PROG=92;
    public static final int EXPR_UNARY_NEG=89;
    public static final int DOT=45;
    public static final int EXPR_LT=78;
    public static final int AND=22;
    public static final int STMT_ELSE=97;
    public static final int EXPR_MINUS=84;
    public static final int EXPR_FUNC_CALL=73;
    public static final int PLUS=40;
    public static final int EXPR_ARRAY_INDEX=66;
    public static final int EXPR_MAP_INIT=82;
    public static final int EXPR_EQ=70;
    public static final int EXTENDS=11;
    public static final int AT=24;
    public static final int EXPR_GT=74;
    public static final int EXPR_AND=64;
    public static final int EXPR_UNARY_POS=91;
    public static final int WS=55;
    public static final int LSB=28;
    public static final int EQ=33;
    public static final int NEW=13;
    public static final int LOOP=18;
    public static final int LT=36;
    public static final int EXPR_MODULO=85;
    public static final int LINE_COMMENT=54;
    public static final int EQEQ=34;
    public static final int LAMBDA=15;
    public static final int UNI_ESC=51;
    public static final int STMT_LOOP=100;
    public static final int ELSE=19;
    public static final int LTEQ=37;
    public static final int CODESET=4;
    public static final int EXPR_ARRAY_INIT=65;
    public static final int STMT_CONDITION_BLOCK=96;
    public static final int ASTERISK=42;
    public static final int EXPR_LTEQ=79;
    public static final int COLON=32;
    public static final int ANNOTATION=56;
    public static final int RSB=29;
    public static final int TRUE=6;
    public static final int EXPR_FQ_CLASS_NAME=72;
    public static final int DEF_FIELD=58;
    public static final int PERCENT=44;
    public static final int STMT_WHILE=101;
    public static final int STMT_IMPORT=99;
    public static final int EXPR_MAP_ELEMENT=83;
    public static final int DEF_CLASS=60;
    public static final int EXPR_OR=88;
    public static final int OR=21;
    public static final int BLOCK=57;
    public static final int EXPR_DIV=69;
    public static final int INT=8;
    public static final int DEF_FUNCTION=59;
    public static final int EXPR_UNARY_NOT=90;
    public static final int EXPR_MEMBER=80;
    public static final int HEX_DIGIT=53;
    public static final int STR_LITERAL=50;
    public static final int NEQ=35;
    public static final int ID=48;
    public static final int STMT_IF=98;
    public static final int EXPR_ASSIGN=67;
    public static final int LETTER=47;
    public static final int LCB=30;
    public static final int RCB=31;
    public static final int RPAR=27;
    public static final int EXPR_CLASS_MIXES=81;
    public static final int WHILE=17;
    public static final int GT=38;
    public static final int EXPR_ADD=63;
    public static final int EXPR_MULT=86;
    public static final int GTEQ=39;
    public static final int EXPR_GTEQ=75;
    public static final int ESC_SEQ=49;
    public static final int FORWARD_SLASH=43;
    public static final int CLASS=10;
    public static final int DEFINE=14;
    public static final int EXPR_CONSTRUCTOR=68;
    public static final int IF=20;
    public static final int EXPR_LAMBDA=76;
    public static final int EOF=-1;
    public static final int STMT_CODESET=94;
    public static final int NUM=9;
    public static final int EXPR_NEQ=87;
    public static final int NOT=23;
    public static final int DEF_PARAM_LIST=61;

    // delegates
    // delegators


        public SlippyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SlippyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SlippyParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:62:1: prog : codesetDecl imports ( statement )* -> ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) ) ;
    public final SlippyParser.prog_return prog() throws RecognitionException {
        SlippyParser.prog_return retval = new SlippyParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.codesetDecl_return codesetDecl1 = null;

        SlippyParser.imports_return imports2 = null;

        SlippyParser.statement_return statement3 = null;


        RewriteRuleSubtreeStream stream_imports=new RewriteRuleSubtreeStream(adaptor,"rule imports");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_codesetDecl=new RewriteRuleSubtreeStream(adaptor,"rule codesetDecl");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:62:6: ( codesetDecl imports ( statement )* -> ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:62:8: codesetDecl imports ( statement )*
            {
            pushFollow(FOLLOW_codesetDecl_in_prog752);
            codesetDecl1=codesetDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codesetDecl.add(codesetDecl1.getTree());
            pushFollow(FOLLOW_imports_in_prog754);
            imports2=imports();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_imports.add(imports2.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:62:28: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TRUE && LA1_0<=FALSE)||(LA1_0>=NUM && LA1_0<=CLASS)||(LA1_0>=NEW && LA1_0<=LAMBDA)||(LA1_0>=WHILE && LA1_0<=LOOP)||LA1_0==IF||(LA1_0>=NOT && LA1_0<=AT)||LA1_0==LPAR||LA1_0==LSB||LA1_0==LCB||(LA1_0>=PLUS && LA1_0<=MINUS)||LA1_0==ID||LA1_0==STR_LITERAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog756);
            	    statement3=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: statement, codesetDecl, imports
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:4: -> ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:63:7: ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);

                adaptor.addChild(root_1, stream_codesetDecl.nextTree());
                adaptor.addChild(root_1, stream_imports.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:63:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:63:42: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class imports_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imports"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:1: imports : ( IMPORT classID )? ( IMPORT classID )* -> ^( STMT_IMPORT ( classID )* ) ;
    public final SlippyParser.imports_return imports() throws RecognitionException {
        SlippyParser.imports_return retval = new SlippyParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPORT4=null;
        Token IMPORT6=null;
        SlippyParser.classID_return classID5 = null;

        SlippyParser.classID_return classID7 = null;


        CommonTree IMPORT4_tree=null;
        CommonTree IMPORT6_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:9: ( ( IMPORT classID )? ( IMPORT classID )* -> ^( STMT_IMPORT ( classID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:11: ( IMPORT classID )? ( IMPORT classID )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:11: ( IMPORT classID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IMPORT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (synpred2_SlippyParser()) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:12: IMPORT classID
                    {
                    IMPORT4=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT4);

                    pushFollow(FOLLOW_classID_in_imports791);
                    classID5=classID();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classID.add(classID5.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:29: ( IMPORT classID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:30: IMPORT classID
            	    {
            	    IMPORT6=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports796); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT6);

            	    pushFollow(FOLLOW_classID_in_imports798);
            	    classID7=classID();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classID.add(classID7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: classID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:4: -> ^( STMT_IMPORT ( classID )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:68:7: ^( STMT_IMPORT ( classID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_IMPORT, "STMT_IMPORT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:68:21: ( classID )*
                while ( stream_classID.hasNext() ) {
                    adaptor.addChild(root_1, stream_classID.nextTree());

                }
                stream_classID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "imports"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:71:1: statement : statementType -> ^( STMT statementType ) ;
    public final SlippyParser.statement_return statement() throws RecognitionException {
        SlippyParser.statement_return retval = new SlippyParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.statementType_return statementType8 = null;


        RewriteRuleSubtreeStream stream_statementType=new RewriteRuleSubtreeStream(adaptor,"rule statementType");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:72:2: ( statementType -> ^( STMT statementType ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:72:4: statementType
            {
            pushFollow(FOLLOW_statementType_in_statement823);
            statementType8=statementType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementType.add(statementType8.getTree());


            // AST REWRITE
            // elements: statementType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:4: -> ^( STMT statementType )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:73:7: ^( STMT statementType )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);

                adaptor.addChild(root_1, stream_statementType.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementType"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:76:1: statementType : ( defStatement | nondefStatement );
    public final SlippyParser.statementType_return statementType() throws RecognitionException {
        SlippyParser.statementType_return retval = new SlippyParser.statementType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.defStatement_return defStatement9 = null;

        SlippyParser.nondefStatement_return nondefStatement10 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:77:2: ( defStatement | nondefStatement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CLASS||LA4_0==DEFINE||LA4_0==AT) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=TRUE && LA4_0<=FALSE)||LA4_0==NUM||LA4_0==NEW||LA4_0==LAMBDA||(LA4_0>=WHILE && LA4_0<=LOOP)||LA4_0==IF||LA4_0==NOT||LA4_0==LPAR||LA4_0==LSB||LA4_0==LCB||(LA4_0>=PLUS && LA4_0<=MINUS)||LA4_0==ID||LA4_0==STR_LITERAL) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:77:4: defStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defStatement_in_statementType845);
                    defStatement9=defStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defStatement9.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:78:4: nondefStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nondefStatement_in_statementType850);
                    nondefStatement10=nondefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nondefStatement10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementType"

    public static class defStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:81:1: defStatement : ( functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) );
    public final SlippyParser.defStatement_return defStatement() throws RecognitionException {
        SlippyParser.defStatement_return retval = new SlippyParser.defStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.functionDefStatement_return functionDefStatement11 = null;

        SlippyParser.classDefStatement_return classDefStatement12 = null;


        RewriteRuleSubtreeStream stream_functionDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule functionDefStatement");
        RewriteRuleSubtreeStream stream_classDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule classDefStatement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:82:2: ( functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEFINE||LA5_0==AT) ) {
                alt5=1;
            }
            else if ( (LA5_0==CLASS) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:82:4: functionDefStatement
                    {
                    pushFollow(FOLLOW_functionDefStatement_in_defStatement861);
                    functionDefStatement11=functionDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionDefStatement.add(functionDefStatement11.getTree());


                    // AST REWRITE
                    // elements: functionDefStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:4: -> ^( DEF_FUNCTION functionDefStatement )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:83:7: ^( DEF_FUNCTION functionDefStatement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_FUNCTION, "DEF_FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_functionDefStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:84:4: classDefStatement
                    {
                    pushFollow(FOLLOW_classDefStatement_in_defStatement877);
                    classDefStatement12=classDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classDefStatement.add(classDefStatement12.getTree());


                    // AST REWRITE
                    // elements: classDefStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:4: -> ^( DEF_CLASS classDefStatement )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:85:7: ^( DEF_CLASS classDefStatement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_CLASS, "DEF_CLASS"), root_1);

                        adaptor.addChild(root_1, stream_classDefStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defStatement"

    public static class nondefStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nondefStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:88:1: nondefStatement : ( flowStatement | expression -> ^( EXPR expression ) );
    public final SlippyParser.nondefStatement_return nondefStatement() throws RecognitionException {
        SlippyParser.nondefStatement_return retval = new SlippyParser.nondefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.flowStatement_return flowStatement13 = null;

        SlippyParser.expression_return expression14 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:89:2: ( flowStatement | expression -> ^( EXPR expression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=WHILE && LA6_0<=LOOP)||LA6_0==IF) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=TRUE && LA6_0<=FALSE)||LA6_0==NUM||LA6_0==NEW||LA6_0==LAMBDA||LA6_0==NOT||LA6_0==LPAR||LA6_0==LSB||LA6_0==LCB||(LA6_0>=PLUS && LA6_0<=MINUS)||LA6_0==ID||LA6_0==STR_LITERAL) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:89:4: flowStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flowStatement_in_nondefStatement899);
                    flowStatement13=flowStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, flowStatement13.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:90:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_nondefStatement904);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression14.getTree());


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:4: -> ^( EXPR expression )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:91:7: ^( EXPR expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nondefStatement"

    public static class functionDefStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:94:1: functionDefStatement : ( annotation )* DEFINE ID formalParameters ( block )? DONE -> ID formalParameters ( block )? ( annotation )* ;
    public final SlippyParser.functionDefStatement_return functionDefStatement() throws RecognitionException {
        SlippyParser.functionDefStatement_return retval = new SlippyParser.functionDefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINE16=null;
        Token ID17=null;
        Token DONE20=null;
        SlippyParser.annotation_return annotation15 = null;

        SlippyParser.formalParameters_return formalParameters18 = null;

        SlippyParser.block_return block19 = null;


        CommonTree DEFINE16_tree=null;
        CommonTree ID17_tree=null;
        CommonTree DONE20_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:95:2: ( ( annotation )* DEFINE ID formalParameters ( block )? DONE -> ID formalParameters ( block )? ( annotation )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:95:4: ( annotation )* DEFINE ID formalParameters ( block )? DONE
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:95:4: ( annotation )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_functionDefStatement926);
            	    annotation15=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation15.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            DEFINE16=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_functionDefStatement929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE16);

            ID17=(Token)match(input,ID,FOLLOW_ID_in_functionDefStatement931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID17);

            pushFollow(FOLLOW_formalParameters_in_functionDefStatement933);
            formalParameters18=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters18.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:95:43: ( block )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=TRUE && LA8_0<=FALSE)||(LA8_0>=NUM && LA8_0<=CLASS)||(LA8_0>=NEW && LA8_0<=LAMBDA)||(LA8_0>=WHILE && LA8_0<=LOOP)||LA8_0==IF||(LA8_0>=NOT && LA8_0<=AT)||LA8_0==LPAR||LA8_0==LSB||LA8_0==LCB||(LA8_0>=PLUS && LA8_0<=MINUS)||LA8_0==ID||LA8_0==STR_LITERAL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_functionDefStatement935);
                    block19=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block19.getTree());

                    }
                    break;

            }

            DONE20=(Token)match(input,DONE,FOLLOW_DONE_in_functionDefStatement938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE20);



            // AST REWRITE
            // elements: ID, formalParameters, annotation, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:4: -> ID formalParameters ( block )? ( annotation )*
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                adaptor.addChild(root_0, stream_formalParameters.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:96:27: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_0, stream_block.nextTree());

                }
                stream_block.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:96:34: ( annotation )*
                while ( stream_annotation.hasNext() ) {
                    adaptor.addChild(root_0, stream_annotation.nextTree());

                }
                stream_annotation.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDefStatement"

    public static class classDefStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:99:1: classDefStatement : CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE -> ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* ;
    public final SlippyParser.classDefStatement_return classDefStatement() throws RecognitionException {
        SlippyParser.classDefStatement_return retval = new SlippyParser.classDefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS21=null;
        Token ID22=null;
        Token DONE26=null;
        SlippyParser.classExtendsExpr_return classExtendsExpr23 = null;

        SlippyParser.classMixesExpr_return classMixesExpr24 = null;

        SlippyParser.classMemberDecl_return classMemberDecl25 = null;


        CommonTree CLASS21_tree=null;
        CommonTree ID22_tree=null;
        CommonTree DONE26_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_classMixesExpr=new RewriteRuleSubtreeStream(adaptor,"rule classMixesExpr");
        RewriteRuleSubtreeStream stream_classExtendsExpr=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsExpr");
        RewriteRuleSubtreeStream stream_classMemberDecl=new RewriteRuleSubtreeStream(adaptor,"rule classMemberDecl");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:100:2: ( CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE -> ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:100:4: CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE
            {
            CLASS21=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefStatement964); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS21);

            ID22=(Token)match(input,ID,FOLLOW_ID_in_classDefStatement966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID22);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:100:13: ( classExtendsExpr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EXTENDS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: classExtendsExpr
                    {
                    pushFollow(FOLLOW_classExtendsExpr_in_classDefStatement968);
                    classExtendsExpr23=classExtendsExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classExtendsExpr.add(classExtendsExpr23.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:100:31: ( classMixesExpr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==MIXES) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: classMixesExpr
                    {
                    pushFollow(FOLLOW_classMixesExpr_in_classDefStatement971);
                    classMixesExpr24=classMixesExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMixesExpr.add(classMixesExpr24.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:100:47: ( classMemberDecl )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CLASS||LA11_0==DEFINE||LA11_0==AT||LA11_0==ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: classMemberDecl
            	    {
            	    pushFollow(FOLLOW_classMemberDecl_in_classDefStatement974);
            	    classMemberDecl25=classMemberDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMemberDecl.add(classMemberDecl25.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            DONE26=(Token)match(input,DONE,FOLLOW_DONE_in_classDefStatement977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE26);



            // AST REWRITE
            // elements: classExtendsExpr, classMixesExpr, ID, classMemberDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:4: -> ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )*
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:101:10: ( classExtendsExpr )?
                if ( stream_classExtendsExpr.hasNext() ) {
                    adaptor.addChild(root_0, stream_classExtendsExpr.nextTree());

                }
                stream_classExtendsExpr.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:101:28: ( classMixesExpr )?
                if ( stream_classMixesExpr.hasNext() ) {
                    adaptor.addChild(root_0, stream_classMixesExpr.nextTree());

                }
                stream_classMixesExpr.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:101:44: ( classMemberDecl )*
                while ( stream_classMemberDecl.hasNext() ) {
                    adaptor.addChild(root_0, stream_classMemberDecl.nextTree());

                }
                stream_classMemberDecl.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDefStatement"

    public static class classExtendsExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classExtendsExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:104:1: classExtendsExpr : EXTENDS classID -> ^( EXPR_CLASS_EXTENDS classID ) ;
    public final SlippyParser.classExtendsExpr_return classExtendsExpr() throws RecognitionException {
        SlippyParser.classExtendsExpr_return retval = new SlippyParser.classExtendsExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXTENDS27=null;
        SlippyParser.classID_return classID28 = null;


        CommonTree EXTENDS27_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:105:2: ( EXTENDS classID -> ^( EXPR_CLASS_EXTENDS classID ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:105:4: EXTENDS classID
            {
            EXTENDS27=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classExtendsExpr1004); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS27);

            pushFollow(FOLLOW_classID_in_classExtendsExpr1006);
            classID28=classID();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classID.add(classID28.getTree());


            // AST REWRITE
            // elements: classID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:4: -> ^( EXPR_CLASS_EXTENDS classID )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:106:7: ^( EXPR_CLASS_EXTENDS classID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_CLASS_EXTENDS, "EXPR_CLASS_EXTENDS"), root_1);

                adaptor.addChild(root_1, stream_classID.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classExtendsExpr"

    public static class classID_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classID"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:109:1: classID : codeset ID -> ^( EXPR_FQ_CLASS_NAME codeset ID ) ;
    public final SlippyParser.classID_return classID() throws RecognitionException {
        SlippyParser.classID_return retval = new SlippyParser.classID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID30=null;
        SlippyParser.codeset_return codeset29 = null;


        CommonTree ID30_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_codeset=new RewriteRuleSubtreeStream(adaptor,"rule codeset");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:109:9: ( codeset ID -> ^( EXPR_FQ_CLASS_NAME codeset ID ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:109:11: codeset ID
            {
            pushFollow(FOLLOW_codeset_in_classID1027);
            codeset29=codeset();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeset.add(codeset29.getTree());
            ID30=(Token)match(input,ID,FOLLOW_ID_in_classID1029); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID30);



            // AST REWRITE
            // elements: codeset, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:4: -> ^( EXPR_FQ_CLASS_NAME codeset ID )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:110:7: ^( EXPR_FQ_CLASS_NAME codeset ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_FQ_CLASS_NAME, "EXPR_FQ_CLASS_NAME"), root_1);

                adaptor.addChild(root_1, stream_codeset.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classID"

    public static class codesetDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codesetDecl"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:113:1: codesetDecl : ( CODESET ( ID DOT )* ID )? -> ^( STMT_CODESET_DECL ( ID )* ) ;
    public final SlippyParser.codesetDecl_return codesetDecl() throws RecognitionException {
        SlippyParser.codesetDecl_return retval = new SlippyParser.codesetDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CODESET31=null;
        Token ID32=null;
        Token DOT33=null;
        Token ID34=null;

        CommonTree CODESET31_tree=null;
        CommonTree ID32_tree=null;
        CommonTree DOT33_tree=null;
        CommonTree ID34_tree=null;
        RewriteRuleTokenStream stream_CODESET=new RewriteRuleTokenStream(adaptor,"token CODESET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:2: ( ( CODESET ( ID DOT )* ID )? -> ^( STMT_CODESET_DECL ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:4: ( CODESET ( ID DOT )* ID )?
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:4: ( CODESET ( ID DOT )* ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CODESET) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:5: CODESET ( ID DOT )* ID
                    {
                    CODESET31=(Token)match(input,CODESET,FOLLOW_CODESET_in_codesetDecl1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CODESET.add(CODESET31);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:13: ( ID DOT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==ID) ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1==DOT) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:114:14: ID DOT
                    	    {
                    	    ID32=(Token)match(input,ID,FOLLOW_ID_in_codesetDecl1058); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID32);

                    	    DOT33=(Token)match(input,DOT,FOLLOW_DOT_in_codesetDecl1060); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(DOT33);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    ID34=(Token)match(input,ID,FOLLOW_ID_in_codesetDecl1064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:4: -> ^( STMT_CODESET_DECL ( ID )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:115:7: ^( STMT_CODESET_DECL ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CODESET_DECL, "STMT_CODESET_DECL"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:115:27: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "codesetDecl"

    public static class codeset_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codeset"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:1: codeset : ( ID DOT )? ( ID DOT )* -> ^( STMT_CODESET ( ID )* ) ;
    public final SlippyParser.codeset_return codeset() throws RecognitionException {
        SlippyParser.codeset_return retval = new SlippyParser.codeset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID35=null;
        Token DOT36=null;
        Token ID37=null;
        Token DOT38=null;

        CommonTree ID35_tree=null;
        CommonTree DOT36_tree=null;
        CommonTree ID37_tree=null;
        CommonTree DOT38_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:9: ( ( ID DOT )? ( ID DOT )* -> ^( STMT_CODESET ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:11: ( ID DOT )? ( ID DOT )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:11: ( ID DOT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOT) ) {
                    int LA14_2 = input.LA(3);

                    if ( (synpred14_SlippyParser()) ) {
                        alt14=1;
                    }
                }
            }
            switch (alt14) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:12: ID DOT
                    {
                    ID35=(Token)match(input,ID,FOLLOW_ID_in_codeset1090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID35);

                    DOT36=(Token)match(input,DOT,FOLLOW_DOT_in_codeset1092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT36);


                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:21: ( ID DOT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==DOT) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:22: ID DOT
            	    {
            	    ID37=(Token)match(input,ID,FOLLOW_ID_in_codeset1097); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID37);

            	    DOT38=(Token)match(input,DOT,FOLLOW_DOT_in_codeset1099); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT38);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:4: -> ^( STMT_CODESET ( ID )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:119:7: ^( STMT_CODESET ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CODESET, "STMT_CODESET"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:119:22: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "codeset"

    public static class classMixesExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMixesExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:122:1: classMixesExpr : MIXES ( classID )? ( COMMA classID )* -> ^( EXPR_CLASS_MIXES ( classID )* ) ;
    public final SlippyParser.classMixesExpr_return classMixesExpr() throws RecognitionException {
        SlippyParser.classMixesExpr_return retval = new SlippyParser.classMixesExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MIXES39=null;
        Token COMMA41=null;
        SlippyParser.classID_return classID40 = null;

        SlippyParser.classID_return classID42 = null;


        CommonTree MIXES39_tree=null;
        CommonTree COMMA41_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_MIXES=new RewriteRuleTokenStream(adaptor,"token MIXES");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:2: ( MIXES ( classID )? ( COMMA classID )* -> ^( EXPR_CLASS_MIXES ( classID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:4: MIXES ( classID )? ( COMMA classID )*
            {
            MIXES39=(Token)match(input,MIXES,FOLLOW_MIXES_in_classMixesExpr1125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MIXES.add(MIXES39);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:10: ( classID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred16_SlippyParser()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: classID
                    {
                    pushFollow(FOLLOW_classID_in_classMixesExpr1127);
                    classID40=classID();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classID.add(classID40.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:19: ( COMMA classID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:20: COMMA classID
            	    {
            	    COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_classMixesExpr1131); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA41);

            	    pushFollow(FOLLOW_classID_in_classMixesExpr1133);
            	    classID42=classID();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classID.add(classID42.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: classID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:4: -> ^( EXPR_CLASS_MIXES ( classID )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:124:7: ^( EXPR_CLASS_MIXES ( classID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_CLASS_MIXES, "EXPR_CLASS_MIXES"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:124:26: ( classID )*
                while ( stream_classID.hasNext() ) {
                    adaptor.addChild(root_1, stream_classID.nextTree());

                }
                stream_classID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMixesExpr"

    public static class flowStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flowStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:127:1: flowStatement : ( whileStatement | ifStatement | loopStatement );
    public final SlippyParser.flowStatement_return flowStatement() throws RecognitionException {
        SlippyParser.flowStatement_return retval = new SlippyParser.flowStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.whileStatement_return whileStatement43 = null;

        SlippyParser.ifStatement_return ifStatement44 = null;

        SlippyParser.loopStatement_return loopStatement45 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:128:2: ( whileStatement | ifStatement | loopStatement )
            int alt18=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt18=1;
                }
                break;
            case IF:
                {
                alt18=2;
                }
                break;
            case LOOP:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:128:4: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_flowStatement1158);
                    whileStatement43=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement43.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:129:4: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_flowStatement1163);
                    ifStatement44=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement44.getTree());

                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:130:4: loopStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopStatement_in_flowStatement1168);
                    loopStatement45=loopStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopStatement45.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flowStatement"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:133:1: formalParameters : LPAR ( ( ID )? ( COMMA ID )* ) RPAR -> ^( DEF_PARAM_LIST ( ID )* ) ;
    public final SlippyParser.formalParameters_return formalParameters() throws RecognitionException {
        SlippyParser.formalParameters_return retval = new SlippyParser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR46=null;
        Token ID47=null;
        Token COMMA48=null;
        Token ID49=null;
        Token RPAR50=null;

        CommonTree LPAR46_tree=null;
        CommonTree ID47_tree=null;
        CommonTree COMMA48_tree=null;
        CommonTree ID49_tree=null;
        CommonTree RPAR50_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:2: ( LPAR ( ( ID )? ( COMMA ID )* ) RPAR -> ^( DEF_PARAM_LIST ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:4: LPAR ( ( ID )? ( COMMA ID )* ) RPAR
            {
            LPAR46=(Token)match(input,LPAR,FOLLOW_LPAR_in_formalParameters1179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR46);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:9: ( ( ID )? ( COMMA ID )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:10: ( ID )? ( COMMA ID )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:10: ( ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: ID
                    {
                    ID47=(Token)match(input,ID,FOLLOW_ID_in_formalParameters1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID47);


                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:14: ( COMMA ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:134:15: COMMA ID
            	    {
            	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameters1186); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);

            	    ID49=(Token)match(input,ID,FOLLOW_ID_in_formalParameters1188); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID49);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            RPAR50=(Token)match(input,RPAR,FOLLOW_RPAR_in_formalParameters1193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR50);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:4: -> ^( DEF_PARAM_LIST ( ID )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:135:7: ^( DEF_PARAM_LIST ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_PARAM_LIST, "DEF_PARAM_LIST"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:135:24: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:138:1: block : ( statement )+ -> ^( BLOCK ( statement )+ ) ;
    public final SlippyParser.block_return block() throws RecognitionException {
        SlippyParser.block_return retval = new SlippyParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.statement_return statement51 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:138:7: ( ( statement )+ -> ^( BLOCK ( statement )+ ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:138:9: ( statement )+
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:138:9: ( statement )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=TRUE && LA21_0<=FALSE)||(LA21_0>=NUM && LA21_0<=CLASS)||(LA21_0>=NEW && LA21_0<=LAMBDA)||(LA21_0>=WHILE && LA21_0<=LOOP)||LA21_0==IF||(LA21_0>=NOT && LA21_0<=AT)||LA21_0==LPAR||LA21_0==LSB||LA21_0==LCB||(LA21_0>=PLUS && LA21_0<=MINUS)||LA21_0==ID||LA21_0==STR_LITERAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1215);
            	    statement51=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement51.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 139:4: -> ^( BLOCK ( statement )+ )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:139:7: ^( BLOCK ( statement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class annotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:142:1: annotation : AT ID ( expressionList )? -> ^( ANNOTATION ID ( expressionList )? ) ;
    public final SlippyParser.annotation_return annotation() throws RecognitionException {
        SlippyParser.annotation_return retval = new SlippyParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AT52=null;
        Token ID53=null;
        SlippyParser.expressionList_return expressionList54 = null;


        CommonTree AT52_tree=null;
        CommonTree ID53_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:143:2: ( AT ID ( expressionList )? -> ^( ANNOTATION ID ( expressionList )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:143:4: AT ID ( expressionList )?
            {
            AT52=(Token)match(input,AT,FOLLOW_AT_in_annotation1239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT52);

            ID53=(Token)match(input,ID,FOLLOW_ID_in_annotation1241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID53);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:143:10: ( expressionList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LPAR) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_annotation1243);
                    expressionList54=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList54.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:4: -> ^( ANNOTATION ID ( expressionList )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:144:7: ^( ANNOTATION ID ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:144:23: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class classMemberDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMemberDecl"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:147:1: classMemberDecl : ( ( annotation )* fieldDeclaration -> ^( DEF_FIELD fieldDeclaration ( annotation )* ) | ( annotation )* functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ( annotation )* ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) );
    public final SlippyParser.classMemberDecl_return classMemberDecl() throws RecognitionException {
        SlippyParser.classMemberDecl_return retval = new SlippyParser.classMemberDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.annotation_return annotation55 = null;

        SlippyParser.fieldDeclaration_return fieldDeclaration56 = null;

        SlippyParser.annotation_return annotation57 = null;

        SlippyParser.functionDefStatement_return functionDefStatement58 = null;

        SlippyParser.classDefStatement_return classDefStatement59 = null;


        RewriteRuleSubtreeStream stream_functionDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule functionDefStatement");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_classDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule classDefStatement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:2: ( ( annotation )* fieldDeclaration -> ^( DEF_FIELD fieldDeclaration ( annotation )* ) | ( annotation )* functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ( annotation )* ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred25_SlippyParser()) ) {
                    alt25=1;
                }
                else if ( (synpred27_SlippyParser()) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt25=1;
                }
                break;
            case DEFINE:
                {
                alt25=2;
                }
                break;
            case CLASS:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:4: ( annotation )* fieldDeclaration
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:4: ( annotation )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==AT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_classMemberDecl1269);
                    	    annotation55=annotation();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotation.add(annotation55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    pushFollow(FOLLOW_fieldDeclaration_in_classMemberDecl1272);
                    fieldDeclaration56=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration56.getTree());


                    // AST REWRITE
                    // elements: fieldDeclaration, annotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 149:4: -> ^( DEF_FIELD fieldDeclaration ( annotation )* )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:149:7: ^( DEF_FIELD fieldDeclaration ( annotation )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_FIELD, "DEF_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_fieldDeclaration.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:149:36: ( annotation )*
                        while ( stream_annotation.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotation.nextTree());

                        }
                        stream_annotation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( annotation )* functionDefStatement
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( annotation )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==AT) ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==ID) ) {
                                int LA24_3 = input.LA(3);

                                if ( (synpred26_SlippyParser()) ) {
                                    alt24=1;
                                }


                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_classMemberDecl1291);
                    	    annotation57=annotation();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotation.add(annotation57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    pushFollow(FOLLOW_functionDefStatement_in_classMemberDecl1294);
                    functionDefStatement58=functionDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionDefStatement.add(functionDefStatement58.getTree());


                    // AST REWRITE
                    // elements: annotation, functionDefStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 151:4: -> ^( DEF_FUNCTION functionDefStatement ( annotation )* )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:151:7: ^( DEF_FUNCTION functionDefStatement ( annotation )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_FUNCTION, "DEF_FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_functionDefStatement.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:151:43: ( annotation )*
                        while ( stream_annotation.hasNext() ) {
                            adaptor.addChild(root_1, stream_annotation.nextTree());

                        }
                        stream_annotation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:152:4: classDefStatement
                    {
                    pushFollow(FOLLOW_classDefStatement_in_classMemberDecl1313);
                    classDefStatement59=classDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classDefStatement.add(classDefStatement59.getTree());


                    // AST REWRITE
                    // elements: classDefStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:4: -> ^( DEF_CLASS classDefStatement )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:153:7: ^( DEF_CLASS classDefStatement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_CLASS, "DEF_CLASS"), root_1);

                        adaptor.addChild(root_1, stream_classDefStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMemberDecl"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:156:1: fieldDeclaration : ID ( EQ expression )? -> ID ( expression )? ;
    public final SlippyParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        SlippyParser.fieldDeclaration_return retval = new SlippyParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID60=null;
        Token EQ61=null;
        SlippyParser.expression_return expression62 = null;


        CommonTree ID60_tree=null;
        CommonTree EQ61_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:157:2: ( ID ( EQ expression )? -> ID ( expression )? )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:157:4: ID ( EQ expression )?
            {
            ID60=(Token)match(input,ID,FOLLOW_ID_in_fieldDeclaration1335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID60);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:157:7: ( EQ expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:157:8: EQ expression
                    {
                    EQ61=(Token)match(input,EQ,FOLLOW_EQ_in_fieldDeclaration1338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ61);

                    pushFollow(FOLLOW_expression_in_fieldDeclaration1340);
                    expression62=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression62.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 158:4: -> ID ( expression )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:158:10: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:161:1: whileStatement : WHILE parExpression ( block )? DONE -> ^( STMT_WHILE parExpression ( block )? ) ;
    public final SlippyParser.whileStatement_return whileStatement() throws RecognitionException {
        SlippyParser.whileStatement_return retval = new SlippyParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE63=null;
        Token DONE66=null;
        SlippyParser.parExpression_return parExpression64 = null;

        SlippyParser.block_return block65 = null;


        CommonTree WHILE63_tree=null;
        CommonTree DONE66_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:162:2: ( WHILE parExpression ( block )? DONE -> ^( STMT_WHILE parExpression ( block )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:162:4: WHILE parExpression ( block )? DONE
            {
            WHILE63=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE63);

            pushFollow(FOLLOW_parExpression_in_whileStatement1365);
            parExpression64=parExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parExpression.add(parExpression64.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:162:24: ( block )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=TRUE && LA27_0<=FALSE)||(LA27_0>=NUM && LA27_0<=CLASS)||(LA27_0>=NEW && LA27_0<=LAMBDA)||(LA27_0>=WHILE && LA27_0<=LOOP)||LA27_0==IF||(LA27_0>=NOT && LA27_0<=AT)||LA27_0==LPAR||LA27_0==LSB||LA27_0==LCB||(LA27_0>=PLUS && LA27_0<=MINUS)||LA27_0==ID||LA27_0==STR_LITERAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_whileStatement1367);
                    block65=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block65.getTree());

                    }
                    break;

            }

            DONE66=(Token)match(input,DONE,FOLLOW_DONE_in_whileStatement1370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE66);



            // AST REWRITE
            // elements: parExpression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 163:4: -> ^( STMT_WHILE parExpression ( block )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:163:7: ^( STMT_WHILE parExpression ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_WHILE, "STMT_WHILE"), root_1);

                adaptor.addChild(root_1, stream_parExpression.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:163:34: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:166:1: ifStatement : IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE -> ^( STMT_IF ( conditionalBlock )+ ( block )* ) ;
    public final SlippyParser.ifStatement_return ifStatement() throws RecognitionException {
        SlippyParser.ifStatement_return retval = new SlippyParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF67=null;
        Token ELSE69=null;
        Token IF70=null;
        Token ELSE72=null;
        Token DONE74=null;
        SlippyParser.conditionalBlock_return conditionalBlock68 = null;

        SlippyParser.conditionalBlock_return conditionalBlock71 = null;

        SlippyParser.block_return block73 = null;


        CommonTree IF67_tree=null;
        CommonTree ELSE69_tree=null;
        CommonTree IF70_tree=null;
        CommonTree ELSE72_tree=null;
        CommonTree DONE74_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_conditionalBlock=new RewriteRuleSubtreeStream(adaptor,"rule conditionalBlock");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:167:2: ( IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE -> ^( STMT_IF ( conditionalBlock )+ ( block )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:167:4: IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE
            {
            IF67=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF67);

            pushFollow(FOLLOW_conditionalBlock_in_ifStatement1397);
            conditionalBlock68=conditionalBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock68.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:168:3: ( ELSE IF conditionalBlock )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ELSE) ) {
                    int LA28_1 = input.LA(2);

                    if ( (synpred30_SlippyParser()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:168:4: ELSE IF conditionalBlock
            	    {
            	    ELSE69=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1402); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELSE.add(ELSE69);

            	    IF70=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IF.add(IF70);

            	    pushFollow(FOLLOW_conditionalBlock_in_ifStatement1406);
            	    conditionalBlock71=conditionalBlock();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock71.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:169:3: ( ELSE ( block )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELSE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:169:4: ELSE ( block )?
                    {
                    ELSE72=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE72);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:169:9: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=TRUE && LA29_0<=FALSE)||(LA29_0>=NUM && LA29_0<=CLASS)||(LA29_0>=NEW && LA29_0<=LAMBDA)||(LA29_0>=WHILE && LA29_0<=LOOP)||LA29_0==IF||(LA29_0>=NOT && LA29_0<=AT)||LA29_0==LPAR||LA29_0==LSB||LA29_0==LCB||(LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==ID||LA29_0==STR_LITERAL) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_ifStatement1415);
                            block73=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block73.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            DONE74=(Token)match(input,DONE,FOLLOW_DONE_in_ifStatement1422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE74);



            // AST REWRITE
            // elements: block, conditionalBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:4: -> ^( STMT_IF ( conditionalBlock )+ ( block )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:171:7: ^( STMT_IF ( conditionalBlock )+ ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_IF, "STMT_IF"), root_1);

                if ( !(stream_conditionalBlock.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_conditionalBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_conditionalBlock.nextTree());

                }
                stream_conditionalBlock.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:171:35: ( block )*
                while ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class conditionalBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalBlock"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:174:1: conditionalBlock : parExpression ( block )? -> ^( STMT_CONDITION_BLOCK parExpression ( block )? ) ;
    public final SlippyParser.conditionalBlock_return conditionalBlock() throws RecognitionException {
        SlippyParser.conditionalBlock_return retval = new SlippyParser.conditionalBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.parExpression_return parExpression75 = null;

        SlippyParser.block_return block76 = null;


        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:175:2: ( parExpression ( block )? -> ^( STMT_CONDITION_BLOCK parExpression ( block )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:175:4: parExpression ( block )?
            {
            pushFollow(FOLLOW_parExpression_in_conditionalBlock1448);
            parExpression75=parExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parExpression.add(parExpression75.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:175:18: ( block )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=TRUE && LA31_0<=FALSE)||(LA31_0>=NUM && LA31_0<=CLASS)||(LA31_0>=NEW && LA31_0<=LAMBDA)||(LA31_0>=WHILE && LA31_0<=LOOP)||LA31_0==IF||(LA31_0>=NOT && LA31_0<=AT)||LA31_0==LPAR||LA31_0==LSB||LA31_0==LCB||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==ID||LA31_0==STR_LITERAL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_conditionalBlock1450);
                    block76=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block76.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: parExpression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:4: -> ^( STMT_CONDITION_BLOCK parExpression ( block )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:176:7: ^( STMT_CONDITION_BLOCK parExpression ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CONDITION_BLOCK, "STMT_CONDITION_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_parExpression.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:176:44: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalBlock"

    public static class parExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:179:1: parExpression : LPAR expression RPAR -> expression ;
    public final SlippyParser.parExpression_return parExpression() throws RecognitionException {
        SlippyParser.parExpression_return retval = new SlippyParser.parExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR77=null;
        Token RPAR79=null;
        SlippyParser.expression_return expression78 = null;


        CommonTree LPAR77_tree=null;
        CommonTree RPAR79_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:180:2: ( LPAR expression RPAR -> expression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:180:4: LPAR expression RPAR
            {
            LPAR77=(Token)match(input,LPAR,FOLLOW_LPAR_in_parExpression1476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR77);

            pushFollow(FOLLOW_expression_in_parExpression1478);
            expression78=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());
            RPAR79=(Token)match(input,RPAR,FOLLOW_RPAR_in_parExpression1480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR79);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:4: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class loopStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopStatement"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:184:1: loopStatement : ( LOOP conditionalBlock DONE -> ^( STMT_LOOP conditionalBlock ) | LOOP LPAR ID COLON expression RPAR ( block )? DONE -> ^( STMT_LOOP ID expression ( block )? ) );
    public final SlippyParser.loopStatement_return loopStatement() throws RecognitionException {
        SlippyParser.loopStatement_return retval = new SlippyParser.loopStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOOP80=null;
        Token DONE82=null;
        Token LOOP83=null;
        Token LPAR84=null;
        Token ID85=null;
        Token COLON86=null;
        Token RPAR88=null;
        Token DONE90=null;
        SlippyParser.conditionalBlock_return conditionalBlock81 = null;

        SlippyParser.expression_return expression87 = null;

        SlippyParser.block_return block89 = null;


        CommonTree LOOP80_tree=null;
        CommonTree DONE82_tree=null;
        CommonTree LOOP83_tree=null;
        CommonTree LPAR84_tree=null;
        CommonTree ID85_tree=null;
        CommonTree COLON86_tree=null;
        CommonTree RPAR88_tree=null;
        CommonTree DONE90_tree=null;
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_conditionalBlock=new RewriteRuleSubtreeStream(adaptor,"rule conditionalBlock");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:185:2: ( LOOP conditionalBlock DONE -> ^( STMT_LOOP conditionalBlock ) | LOOP LPAR ID COLON expression RPAR ( block )? DONE -> ^( STMT_LOOP ID expression ( block )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LOOP) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LPAR) ) {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==ID) ) {
                        int LA33_3 = input.LA(4);

                        if ( (LA33_3==COLON) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_3>=OR && LA33_3<=AND)||(LA33_3>=LPAR && LA33_3<=LSB)||(LA33_3>=EQ && LA33_3<=DOT)) ) {
                            alt33=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA33_2>=TRUE && LA33_2<=FALSE)||LA33_2==NUM||LA33_2==NEW||LA33_2==LAMBDA||LA33_2==NOT||LA33_2==LPAR||LA33_2==LSB||LA33_2==LCB||(LA33_2>=PLUS && LA33_2<=MINUS)||LA33_2==STR_LITERAL) ) {
                        alt33=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:185:4: LOOP conditionalBlock DONE
                    {
                    LOOP80=(Token)match(input,LOOP,FOLLOW_LOOP_in_loopStatement1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOOP.add(LOOP80);

                    pushFollow(FOLLOW_conditionalBlock_in_loopStatement1500);
                    conditionalBlock81=conditionalBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock81.getTree());
                    DONE82=(Token)match(input,DONE,FOLLOW_DONE_in_loopStatement1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE82);



                    // AST REWRITE
                    // elements: conditionalBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:4: -> ^( STMT_LOOP conditionalBlock )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:186:7: ^( STMT_LOOP conditionalBlock )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_LOOP, "STMT_LOOP"), root_1);

                        adaptor.addChild(root_1, stream_conditionalBlock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:187:4: LOOP LPAR ID COLON expression RPAR ( block )? DONE
                    {
                    LOOP83=(Token)match(input,LOOP,FOLLOW_LOOP_in_loopStatement1518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOOP.add(LOOP83);

                    LPAR84=(Token)match(input,LPAR,FOLLOW_LPAR_in_loopStatement1520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR84);

                    ID85=(Token)match(input,ID,FOLLOW_ID_in_loopStatement1522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID85);

                    COLON86=(Token)match(input,COLON,FOLLOW_COLON_in_loopStatement1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON86);

                    pushFollow(FOLLOW_expression_in_loopStatement1526);
                    expression87=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression87.getTree());
                    RPAR88=(Token)match(input,RPAR,FOLLOW_RPAR_in_loopStatement1528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR88);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:187:39: ( block )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=TRUE && LA32_0<=FALSE)||(LA32_0>=NUM && LA32_0<=CLASS)||(LA32_0>=NEW && LA32_0<=LAMBDA)||(LA32_0>=WHILE && LA32_0<=LOOP)||LA32_0==IF||(LA32_0>=NOT && LA32_0<=AT)||LA32_0==LPAR||LA32_0==LSB||LA32_0==LCB||(LA32_0>=PLUS && LA32_0<=MINUS)||LA32_0==ID||LA32_0==STR_LITERAL) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_loopStatement1530);
                            block89=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block89.getTree());

                            }
                            break;

                    }

                    DONE90=(Token)match(input,DONE,FOLLOW_DONE_in_loopStatement1533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE90);



                    // AST REWRITE
                    // elements: expression, ID, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:4: -> ^( STMT_LOOP ID expression ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:188:7: ^( STMT_LOOP ID expression ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_LOOP, "STMT_LOOP"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:188:33: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loopStatement"

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:191:1: expressionList : LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_LIST ( expression )* ) ;
    public final SlippyParser.expressionList_return expressionList() throws RecognitionException {
        SlippyParser.expressionList_return retval = new SlippyParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR91=null;
        Token COMMA93=null;
        Token RPAR95=null;
        SlippyParser.expression_return expression92 = null;

        SlippyParser.expression_return expression94 = null;


        CommonTree LPAR91_tree=null;
        CommonTree COMMA93_tree=null;
        CommonTree RPAR95_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:192:2: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_LIST ( expression )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:192:4: LPAR ( expression )? ( COMMA expression )* RPAR
            {
            LPAR91=(Token)match(input,LPAR,FOLLOW_LPAR_in_expressionList1561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR91);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:192:9: ( expression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=TRUE && LA34_0<=FALSE)||LA34_0==NUM||LA34_0==NEW||LA34_0==LAMBDA||LA34_0==NOT||LA34_0==LPAR||LA34_0==LSB||LA34_0==LCB||(LA34_0>=PLUS && LA34_0<=MINUS)||LA34_0==ID||LA34_0==STR_LITERAL) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionList1563);
                    expression92=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:192:21: ( COMMA expression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:192:22: COMMA expression
            	    {
            	    COMMA93=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList1567); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA93);

            	    pushFollow(FOLLOW_expression_in_expressionList1569);
            	    expression94=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression94.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            RPAR95=(Token)match(input,RPAR,FOLLOW_RPAR_in_expressionList1573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR95);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 193:4: -> ^( EXPR_LIST ( expression )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:193:7: ^( EXPR_LIST ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:193:19: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:196:1: expression : assignExpression ;
    public final SlippyParser.expression_return expression() throws RecognitionException {
        SlippyParser.expression_return retval = new SlippyParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.assignExpression_return assignExpression96 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:197:2: ( assignExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:197:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expression1597);
            assignExpression96=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression96.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:200:1: assignExpression : ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )? ;
    public final SlippyParser.assignExpression_return assignExpression() throws RecognitionException {
        SlippyParser.assignExpression_return retval = new SlippyParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ98=null;
        SlippyParser.conditionalOrExpr_return r = null;

        SlippyParser.conditionalOrExpr_return conditionalOrExpr97 = null;


        CommonTree EQ98_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_conditionalOrExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionalOrExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:201:2: ( ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )? )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:201:4: ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )?
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:201:4: ( conditionalOrExpr -> conditionalOrExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:201:5: conditionalOrExpr
            {
            pushFollow(FOLLOW_conditionalOrExpr_in_assignExpression1610);
            conditionalOrExpr97=conditionalOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalOrExpr.add(conditionalOrExpr97.getTree());


            // AST REWRITE
            // elements: conditionalOrExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:23: -> conditionalOrExpr
            {
                adaptor.addChild(root_0, stream_conditionalOrExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:201:45: ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:202:4: EQ r= conditionalOrExpr
                    {
                    EQ98=(Token)match(input,EQ,FOLLOW_EQ_in_assignExpression1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ98);

                    pushFollow(FOLLOW_conditionalOrExpr_in_assignExpression1626);
                    r=conditionalOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalOrExpr.add(r.getTree());


                    // AST REWRITE
                    // elements: assignExpression, r
                    // token labels: 
                    // rule labels: r, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:5: -> ^( EXPR_ASSIGN $assignExpression $r)
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:203:8: ^( EXPR_ASSIGN $assignExpression $r)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_ASSIGN, "EXPR_ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_r.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignExpression"

    public static class conditionalOrExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:207:1: conditionalOrExpr : ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )* ;
    public final SlippyParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        SlippyParser.conditionalOrExpr_return retval = new SlippyParser.conditionalOrExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR100=null;
        SlippyParser.conditionalAndExpr_return r = null;

        SlippyParser.conditionalAndExpr_return conditionalAndExpr99 = null;


        CommonTree OR100_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_conditionalAndExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionalAndExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:208:2: ( ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:208:4: ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:208:4: ( conditionalAndExpr -> conditionalAndExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:208:5: conditionalAndExpr
            {
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr1661);
            conditionalAndExpr99=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalAndExpr.add(conditionalAndExpr99.getTree());


            // AST REWRITE
            // elements: conditionalAndExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:24: -> conditionalAndExpr
            {
                adaptor.addChild(root_0, stream_conditionalAndExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:208:47: ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==OR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:209:4: OR r= conditionalAndExpr
            	    {
            	    OR100=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpr1673); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OR.add(OR100);

            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr1677);
            	    r=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_conditionalAndExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, conditionalOrExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 210:5: -> ^( EXPR_OR $conditionalOrExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:210:8: ^( EXPR_OR $conditionalOrExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_OR, "EXPR_OR"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpr"

    public static class conditionalAndExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:214:1: conditionalAndExpr : ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )* ;
    public final SlippyParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        SlippyParser.conditionalAndExpr_return retval = new SlippyParser.conditionalAndExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND102=null;
        SlippyParser.equalityExpression_return r = null;

        SlippyParser.equalityExpression_return equalityExpression101 = null;


        CommonTree AND102_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_equalityExpression=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:215:2: ( ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:215:4: ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:215:4: ( equalityExpression -> equalityExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:215:5: equalityExpression
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpr1710);
            equalityExpression101=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equalityExpression.add(equalityExpression101.getTree());


            // AST REWRITE
            // elements: equalityExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 215:24: -> equalityExpression
            {
                adaptor.addChild(root_0, stream_equalityExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:215:47: ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==AND) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:216:7: AND r= equalityExpression
            	    {
            	    AND102=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpr1726); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND102);

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpr1730);
            	    r=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityExpression.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, conditionalAndExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 217:8: -> ^( EXPR_AND $conditionalAndExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:217:11: ^( EXPR_AND $conditionalAndExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_AND, "EXPR_AND"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpr"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:221:1: equalityExpression : ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )* ;
    public final SlippyParser.equalityExpression_return equalityExpression() throws RecognitionException {
        SlippyParser.equalityExpression_return retval = new SlippyParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQEQ104=null;
        Token NEQ105=null;
        SlippyParser.gtltExpression_return r = null;

        SlippyParser.gtltExpression_return gtltExpression103 = null;


        CommonTree EQEQ104_tree=null;
        CommonTree NEQ105_tree=null;
        RewriteRuleTokenStream stream_EQEQ=new RewriteRuleTokenStream(adaptor,"token EQEQ");
        RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
        RewriteRuleSubtreeStream stream_gtltExpression=new RewriteRuleSubtreeStream(adaptor,"rule gtltExpression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:222:2: ( ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:222:4: ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:222:4: ( gtltExpression -> gtltExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:222:5: gtltExpression
            {
            pushFollow(FOLLOW_gtltExpression_in_equalityExpression1766);
            gtltExpression103=gtltExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_gtltExpression.add(gtltExpression103.getTree());


            // AST REWRITE
            // elements: gtltExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:20: -> gtltExpression
            {
                adaptor.addChild(root_0, stream_gtltExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:222:39: ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==EQEQ) ) {
                    alt39=1;
                }
                else if ( (LA39_0==NEQ) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:223:7: EQEQ r= gtltExpression
            	    {
            	    EQEQ104=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_equalityExpression1781); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQEQ.add(EQEQ104);

            	    pushFollow(FOLLOW_gtltExpression_in_equalityExpression1785);
            	    r=gtltExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_gtltExpression.add(r.getTree());


            	    // AST REWRITE
            	    // elements: equalityExpression, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 224:8: -> ^( EXPR_EQ $equalityExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:224:11: ^( EXPR_EQ $equalityExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_EQ, "EXPR_EQ"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:225:7: NEQ r= gtltExpression
            	    {
            	    NEQ105=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityExpression1812); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEQ.add(NEQ105);

            	    pushFollow(FOLLOW_gtltExpression_in_equalityExpression1816);
            	    r=gtltExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_gtltExpression.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, equalityExpression
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 226:5: -> ^( EXPR_NEQ $equalityExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:226:8: ^( EXPR_NEQ $equalityExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_NEQ, "EXPR_NEQ"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class gtltExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gtltExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:230:1: gtltExpression : ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )* ;
    public final SlippyParser.gtltExpression_return gtltExpression() throws RecognitionException {
        SlippyParser.gtltExpression_return retval = new SlippyParser.gtltExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LT107=null;
        Token LTEQ108=null;
        Token GT109=null;
        Token GTEQ110=null;
        SlippyParser.additionExpr_return r = null;

        SlippyParser.additionExpr_return additionExpr106 = null;


        CommonTree LT107_tree=null;
        CommonTree LTEQ108_tree=null;
        CommonTree GT109_tree=null;
        CommonTree GTEQ110_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
        RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
        RewriteRuleSubtreeStream stream_additionExpr=new RewriteRuleSubtreeStream(adaptor,"rule additionExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:231:2: ( ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:231:4: ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:231:4: ( additionExpr -> additionExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:231:5: additionExpr
            {
            pushFollow(FOLLOW_additionExpr_in_gtltExpression1849);
            additionExpr106=additionExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additionExpr.add(additionExpr106.getTree());


            // AST REWRITE
            // elements: additionExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 231:18: -> additionExpr
            {
                adaptor.addChild(root_0, stream_additionExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:231:35: ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )*
            loop40:
            do {
                int alt40=5;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt40=1;
                    }
                    break;
                case LTEQ:
                    {
                    alt40=2;
                    }
                    break;
                case GT:
                    {
                    alt40=3;
                    }
                    break;
                case GTEQ:
                    {
                    alt40=4;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:232:7: LT r= additionExpr
            	    {
            	    LT107=(Token)match(input,LT,FOLLOW_LT_in_gtltExpression1864); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT107);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1869);
            	    r=additionExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additionExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: gtltExpression, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 233:8: -> ^( EXPR_LT $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:233:11: ^( EXPR_LT $gtltExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LT, "EXPR_LT"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:234:7: LTEQ r= additionExpr
            	    {
            	    LTEQ108=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_gtltExpression1896); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LTEQ.add(LTEQ108);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1900);
            	    r=additionExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additionExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, gtltExpression
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 235:5: -> ^( EXPR_LTEQ $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:235:8: ^( EXPR_LTEQ $gtltExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LTEQ, "EXPR_LTEQ"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:236:7: GT r= additionExpr
            	    {
            	    GT109=(Token)match(input,GT,FOLLOW_GT_in_gtltExpression1924); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_GT.add(GT109);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1929);
            	    r=additionExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additionExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: gtltExpression, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 237:5: -> ^( EXPR_GT $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:237:8: ^( EXPR_GT $gtltExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_GT, "EXPR_GT"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 4 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:238:7: GTEQ r= additionExpr
            	    {
            	    GTEQ110=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_gtltExpression1953); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_GTEQ.add(GTEQ110);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1957);
            	    r=additionExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additionExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: gtltExpression, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 239:5: -> ^( EXPR_GTEQ $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:239:8: ^( EXPR_GTEQ $gtltExpression $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_GTEQ, "EXPR_GTEQ"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "gtltExpression"

    public static class additionExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additionExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:243:1: additionExpr : ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )* ;
    public final SlippyParser.additionExpr_return additionExpr() throws RecognitionException {
        SlippyParser.additionExpr_return retval = new SlippyParser.additionExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS112=null;
        Token MINUS113=null;
        SlippyParser.multExpr_return r = null;

        SlippyParser.multExpr_return multExpr111 = null;


        CommonTree PLUS112_tree=null;
        CommonTree MINUS113_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:244:2: ( ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:244:4: ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:244:4: ( multExpr -> multExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:244:5: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_additionExpr1990);
            multExpr111=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpr.add(multExpr111.getTree());


            // AST REWRITE
            // elements: multExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:14: -> multExpr
            {
                adaptor.addChild(root_0, stream_multExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:244:27: ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:245:8: PLUS r= multExpr
            	    {
            	    PLUS112=(Token)match(input,PLUS,FOLLOW_PLUS_in_additionExpr2006); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PLUS.add(PLUS112);

            	    pushFollow(FOLLOW_multExpr_in_additionExpr2010);
            	    r=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: additionExpr, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 246:9: -> ^( EXPR_ADD $additionExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:246:12: ^( EXPR_ADD $additionExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_ADD, "EXPR_ADD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:247:8: MINUS r= multExpr
            	    {
            	    MINUS113=(Token)match(input,MINUS,FOLLOW_MINUS_in_additionExpr2039); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MINUS.add(MINUS113);

            	    pushFollow(FOLLOW_multExpr_in_additionExpr2043);
            	    r=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: additionExpr, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 248:6: -> ^( EXPR_MINUS $additionExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:248:9: ^( EXPR_MINUS $additionExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MINUS, "EXPR_MINUS"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additionExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:252:1: multExpr : ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )* ;
    public final SlippyParser.multExpr_return multExpr() throws RecognitionException {
        SlippyParser.multExpr_return retval = new SlippyParser.multExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK115=null;
        Token FORWARD_SLASH116=null;
        Token PERCENT117=null;
        SlippyParser.unaryExpr_return r = null;

        SlippyParser.unaryExpr_return unaryExpr114 = null;


        CommonTree ASTERISK115_tree=null;
        CommonTree FORWARD_SLASH116_tree=null;
        CommonTree PERCENT117_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_FORWARD_SLASH=new RewriteRuleTokenStream(adaptor,"token FORWARD_SLASH");
        RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:253:2: ( ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:253:4: ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:253:4: ( unaryExpr -> unaryExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:253:5: unaryExpr
            {
            pushFollow(FOLLOW_unaryExpr_in_multExpr2077);
            unaryExpr114=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr114.getTree());


            // AST REWRITE
            // elements: unaryExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 253:15: -> unaryExpr
            {
                adaptor.addChild(root_0, stream_unaryExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:253:29: ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )*
            loop42:
            do {
                int alt42=4;
                switch ( input.LA(1) ) {
                case ASTERISK:
                    {
                    alt42=1;
                    }
                    break;
                case FORWARD_SLASH:
                    {
                    alt42=2;
                    }
                    break;
                case PERCENT:
                    {
                    alt42=3;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:254:7: ASTERISK r= unaryExpr
            	    {
            	    ASTERISK115=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_multExpr2092); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK115);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2096);
            	    r=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unaryExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, multExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 255:8: -> ^( EXPR_MULT $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:255:11: ^( EXPR_MULT $multExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MULT, "EXPR_MULT"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:256:7: FORWARD_SLASH r= unaryExpr
            	    {
            	    FORWARD_SLASH116=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_multExpr2123); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_FORWARD_SLASH.add(FORWARD_SLASH116);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2127);
            	    r=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unaryExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, multExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 257:5: -> ^( EXPR_DIV $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:257:8: ^( EXPR_DIV $multExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_DIV, "EXPR_DIV"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:258:7: PERCENT r= unaryExpr
            	    {
            	    PERCENT117=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2151); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERCENT.add(PERCENT117);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2155);
            	    r=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unaryExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: multExpr, r
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 259:5: -> ^( EXPR_MODULO $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:259:8: ^( EXPR_MODULO $multExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MODULO, "EXPR_MODULO"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:263:1: unaryExpr : ( MINUS unaryExpr -> ^( EXPR_UNARY_NEG unaryExpr ) | PLUS unaryExpr -> ^( EXPR_UNARY_POS unaryExpr ) | NOT unaryExpr -> ^( EXPR_UNARY_NOT unaryExpr ) | dotExpr );
    public final SlippyParser.unaryExpr_return unaryExpr() throws RecognitionException {
        SlippyParser.unaryExpr_return retval = new SlippyParser.unaryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS118=null;
        Token PLUS120=null;
        Token NOT122=null;
        SlippyParser.unaryExpr_return unaryExpr119 = null;

        SlippyParser.unaryExpr_return unaryExpr121 = null;

        SlippyParser.unaryExpr_return unaryExpr123 = null;

        SlippyParser.dotExpr_return dotExpr124 = null;


        CommonTree MINUS118_tree=null;
        CommonTree PLUS120_tree=null;
        CommonTree NOT122_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:264:2: ( MINUS unaryExpr -> ^( EXPR_UNARY_NEG unaryExpr ) | PLUS unaryExpr -> ^( EXPR_UNARY_POS unaryExpr ) | NOT unaryExpr -> ^( EXPR_UNARY_NOT unaryExpr ) | dotExpr )
            int alt43=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt43=1;
                }
                break;
            case PLUS:
                {
                alt43=2;
                }
                break;
            case NOT:
                {
                alt43=3;
                }
                break;
            case TRUE:
            case FALSE:
            case NUM:
            case NEW:
            case LAMBDA:
            case LPAR:
            case LSB:
            case LCB:
            case ID:
            case STR_LITERAL:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:264:4: MINUS unaryExpr
                    {
                    MINUS118=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpr2188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS118);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2190);
                    unaryExpr119=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr119.getTree());


                    // AST REWRITE
                    // elements: unaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 265:4: -> ^( EXPR_UNARY_NEG unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:265:7: ^( EXPR_UNARY_NEG unaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_UNARY_NEG, "EXPR_UNARY_NEG"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:266:4: PLUS unaryExpr
                    {
                    PLUS120=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpr2206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS120);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2208);
                    unaryExpr121=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr121.getTree());


                    // AST REWRITE
                    // elements: unaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:4: -> ^( EXPR_UNARY_POS unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:267:7: ^( EXPR_UNARY_POS unaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_UNARY_POS, "EXPR_UNARY_POS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:268:4: NOT unaryExpr
                    {
                    NOT122=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpr2224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT122);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2226);
                    unaryExpr123=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr123.getTree());


                    // AST REWRITE
                    // elements: unaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 269:4: -> ^( EXPR_UNARY_NOT unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:269:7: ^( EXPR_UNARY_NOT unaryExpr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_UNARY_NOT, "EXPR_UNARY_NOT"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:270:4: dotExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dotExpr_in_unaryExpr2242);
                    dotExpr124=dotExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotExpr124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class dotExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:273:1: dotExpr : ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )* ;
    public final SlippyParser.dotExpr_return dotExpr() throws RecognitionException {
        SlippyParser.dotExpr_return retval = new SlippyParser.dotExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT126=null;
        SlippyParser.postfixedExpr_return r = null;

        SlippyParser.primaryExpr_return primaryExpr125 = null;


        CommonTree DOT126_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_primaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpr");
        RewriteRuleSubtreeStream stream_postfixedExpr=new RewriteRuleSubtreeStream(adaptor,"rule postfixedExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:274:2: ( ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:274:4: ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:274:4: ( primaryExpr -> primaryExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:274:5: primaryExpr
            {
            pushFollow(FOLLOW_primaryExpr_in_dotExpr2254);
            primaryExpr125=primaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primaryExpr.add(primaryExpr125.getTree());


            // AST REWRITE
            // elements: primaryExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 274:17: -> primaryExpr
            {
                adaptor.addChild(root_0, stream_primaryExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:274:33: ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==DOT) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:275:4: DOT r= postfixedExpr
            	    {
            	    DOT126=(Token)match(input,DOT,FOLLOW_DOT_in_dotExpr2266); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT126);

            	    pushFollow(FOLLOW_postfixedExpr_in_dotExpr2270);
            	    r=postfixedExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_postfixedExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, dotExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 276:5: -> ^( EXPR_MEMBER $dotExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:276:8: ^( EXPR_MEMBER $dotExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MEMBER, "EXPR_MEMBER"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dotExpr"

    public static class primaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:280:1: primaryExpr : ( parExpression | literal | newExpression | postfixedExpr | lambdaExpr | arrayExpr | mapExpr );
    public final SlippyParser.primaryExpr_return primaryExpr() throws RecognitionException {
        SlippyParser.primaryExpr_return retval = new SlippyParser.primaryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippyParser.parExpression_return parExpression127 = null;

        SlippyParser.literal_return literal128 = null;

        SlippyParser.newExpression_return newExpression129 = null;

        SlippyParser.postfixedExpr_return postfixedExpr130 = null;

        SlippyParser.lambdaExpr_return lambdaExpr131 = null;

        SlippyParser.arrayExpr_return arrayExpr132 = null;

        SlippyParser.mapExpr_return mapExpr133 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:281:2: ( parExpression | literal | newExpression | postfixedExpr | lambdaExpr | arrayExpr | mapExpr )
            int alt45=7;
            switch ( input.LA(1) ) {
            case LPAR:
                {
                alt45=1;
                }
                break;
            case TRUE:
            case FALSE:
            case NUM:
            case STR_LITERAL:
                {
                alt45=2;
                }
                break;
            case NEW:
                {
                alt45=3;
                }
                break;
            case ID:
                {
                alt45=4;
                }
                break;
            case LAMBDA:
                {
                alt45=5;
                }
                break;
            case LCB:
                {
                int LA45_6 = input.LA(2);

                if ( (synpred60_SlippyParser()) ) {
                    alt45=5;
                }
                else if ( (true) ) {
                    alt45=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 6, input);

                    throw nvae;
                }
                }
                break;
            case LSB:
                {
                alt45=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:281:4: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primaryExpr2305);
                    parExpression127=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression127.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:282:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpr2310);
                    literal128=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal128.getTree());

                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:283:4: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_primaryExpr2315);
                    newExpression129=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression129.getTree());

                    }
                    break;
                case 4 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:284:4: postfixedExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixedExpr_in_primaryExpr2320);
                    postfixedExpr130=postfixedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixedExpr130.getTree());

                    }
                    break;
                case 5 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:285:4: lambdaExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambdaExpr_in_primaryExpr2325);
                    lambdaExpr131=lambdaExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpr131.getTree());

                    }
                    break;
                case 6 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:286:4: arrayExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayExpr_in_primaryExpr2330);
                    arrayExpr132=arrayExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayExpr132.getTree());

                    }
                    break;
                case 7 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:287:4: mapExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mapExpr_in_primaryExpr2335);
                    mapExpr133=mapExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapExpr133.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpr"

    public static class postfixedExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixedExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:290:1: postfixedExpr : ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )* ;
    public final SlippyParser.postfixedExpr_return postfixedExpr() throws RecognitionException {
        SlippyParser.postfixedExpr_return retval = new SlippyParser.postfixedExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID134=null;
        Token LPAR135=null;
        Token COMMA137=null;
        Token RPAR139=null;
        Token LSB140=null;
        Token RSB141=null;
        SlippyParser.expression_return r = null;

        SlippyParser.expression_return expression136 = null;

        SlippyParser.expression_return expression138 = null;


        CommonTree ID134_tree=null;
        CommonTree LPAR135_tree=null;
        CommonTree COMMA137_tree=null;
        CommonTree RPAR139_tree=null;
        CommonTree LSB140_tree=null;
        CommonTree RSB141_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_RSB=new RewriteRuleTokenStream(adaptor,"token RSB");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_LSB=new RewriteRuleTokenStream(adaptor,"token LSB");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:291:2: ( ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:291:4: ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:291:4: ( ID -> ID )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:291:5: ID
            {
            ID134=(Token)match(input,ID,FOLLOW_ID_in_postfixedExpr2347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID134);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 291:8: -> ID
            {
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:291:15: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*
            loop49:
            do {
                int alt49=3;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:4: LPAR ( expression )? ( COMMA expression )* RPAR
            	    {
            	    LPAR135=(Token)match(input,LPAR,FOLLOW_LPAR_in_postfixedExpr2359); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAR.add(LPAR135);

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:9: ( expression )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( ((LA46_0>=TRUE && LA46_0<=FALSE)||LA46_0==NUM||LA46_0==NEW||LA46_0==LAMBDA||LA46_0==NOT||LA46_0==LPAR||LA46_0==LSB||LA46_0==LCB||(LA46_0>=PLUS && LA46_0<=MINUS)||LA46_0==ID||LA46_0==STR_LITERAL) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_postfixedExpr2361);
            	            expression136=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(expression136.getTree());

            	            }
            	            break;

            	    }

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:21: ( COMMA expression )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==COMMA) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:22: COMMA expression
            	    	    {
            	    	    COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfixedExpr2365); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA137);

            	    	    pushFollow(FOLLOW_expression_in_postfixedExpr2367);
            	    	    expression138=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_expression.add(expression138.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    RPAR139=(Token)match(input,RPAR,FOLLOW_RPAR_in_postfixedExpr2371); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAR.add(RPAR139);



            	    // AST REWRITE
            	    // elements: postfixedExpr, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 293:5: -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) )
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:293:8: ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_FUNC_CALL, "EXPR_FUNC_CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:293:40: ^( EXPR_LIST ( expression )* )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST"), root_2);

            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:293:52: ( expression )*
            	        while ( stream_expression.hasNext() ) {
            	            adaptor.addChild(root_2, stream_expression.nextTree());

            	        }
            	        stream_expression.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:294:5: LSB (r= expression )? RSB
            	    {
            	    LSB140=(Token)match(input,LSB,FOLLOW_LSB_in_postfixedExpr2397); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LSB.add(LSB140);

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:294:10: (r= expression )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=TRUE && LA48_0<=FALSE)||LA48_0==NUM||LA48_0==NEW||LA48_0==LAMBDA||LA48_0==NOT||LA48_0==LPAR||LA48_0==LSB||LA48_0==LCB||(LA48_0>=PLUS && LA48_0<=MINUS)||LA48_0==ID||LA48_0==STR_LITERAL) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: r= expression
            	            {
            	            pushFollow(FOLLOW_expression_in_postfixedExpr2401);
            	            r=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(r.getTree());

            	            }
            	            break;

            	    }

            	    RSB141=(Token)match(input,RSB,FOLLOW_RSB_in_postfixedExpr2404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RSB.add(RSB141);



            	    // AST REWRITE
            	    // elements: r, postfixedExpr
            	    // token labels: 
            	    // rule labels: r, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 295:5: -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:295:8: ^( EXPR_ARRAY_INDEX $postfixedExpr $r)
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_ARRAY_INDEX, "EXPR_ARRAY_INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_r.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixedExpr"

    public static class lambdaExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambdaExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:299:1: lambdaExpr : ( LAMBDA formalParameters ( block )? DONE -> ^( EXPR_LAMBDA formalParameters ( block )? ) | LCB formalParameters ( block )? RCB -> ^( EXPR_LAMBDA formalParameters ( block )? ) );
    public final SlippyParser.lambdaExpr_return lambdaExpr() throws RecognitionException {
        SlippyParser.lambdaExpr_return retval = new SlippyParser.lambdaExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAMBDA142=null;
        Token DONE145=null;
        Token LCB146=null;
        Token RCB149=null;
        SlippyParser.formalParameters_return formalParameters143 = null;

        SlippyParser.block_return block144 = null;

        SlippyParser.formalParameters_return formalParameters147 = null;

        SlippyParser.block_return block148 = null;


        CommonTree LAMBDA142_tree=null;
        CommonTree DONE145_tree=null;
        CommonTree LCB146_tree=null;
        CommonTree RCB149_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_LCB=new RewriteRuleTokenStream(adaptor,"token LCB");
        RewriteRuleTokenStream stream_RCB=new RewriteRuleTokenStream(adaptor,"token RCB");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:300:2: ( LAMBDA formalParameters ( block )? DONE -> ^( EXPR_LAMBDA formalParameters ( block )? ) | LCB formalParameters ( block )? RCB -> ^( EXPR_LAMBDA formalParameters ( block )? ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LAMBDA) ) {
                alt52=1;
            }
            else if ( (LA52_0==LCB) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:300:4: LAMBDA formalParameters ( block )? DONE
                    {
                    LAMBDA142=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpr2438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA142);

                    pushFollow(FOLLOW_formalParameters_in_lambdaExpr2440);
                    formalParameters143=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters143.getTree());
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:300:28: ( block )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=TRUE && LA50_0<=FALSE)||(LA50_0>=NUM && LA50_0<=CLASS)||(LA50_0>=NEW && LA50_0<=LAMBDA)||(LA50_0>=WHILE && LA50_0<=LOOP)||LA50_0==IF||(LA50_0>=NOT && LA50_0<=AT)||LA50_0==LPAR||LA50_0==LSB||LA50_0==LCB||(LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==ID||LA50_0==STR_LITERAL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_lambdaExpr2442);
                            block144=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block144.getTree());

                            }
                            break;

                    }

                    DONE145=(Token)match(input,DONE,FOLLOW_DONE_in_lambdaExpr2445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE145);



                    // AST REWRITE
                    // elements: block, formalParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 301:4: -> ^( EXPR_LAMBDA formalParameters ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:301:7: ^( EXPR_LAMBDA formalParameters ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LAMBDA, "EXPR_LAMBDA"), root_1);

                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:301:38: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:302:4: LCB formalParameters ( block )? RCB
                    {
                    LCB146=(Token)match(input,LCB,FOLLOW_LCB_in_lambdaExpr2464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCB.add(LCB146);

                    pushFollow(FOLLOW_formalParameters_in_lambdaExpr2466);
                    formalParameters147=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters147.getTree());
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:302:25: ( block )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=TRUE && LA51_0<=FALSE)||(LA51_0>=NUM && LA51_0<=CLASS)||(LA51_0>=NEW && LA51_0<=LAMBDA)||(LA51_0>=WHILE && LA51_0<=LOOP)||LA51_0==IF||(LA51_0>=NOT && LA51_0<=AT)||LA51_0==LPAR||LA51_0==LSB||LA51_0==LCB||(LA51_0>=PLUS && LA51_0<=MINUS)||LA51_0==ID||LA51_0==STR_LITERAL) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_lambdaExpr2468);
                            block148=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block148.getTree());

                            }
                            break;

                    }

                    RCB149=(Token)match(input,RCB,FOLLOW_RCB_in_lambdaExpr2471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCB.add(RCB149);



                    // AST REWRITE
                    // elements: block, formalParameters
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 303:4: -> ^( EXPR_LAMBDA formalParameters ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:303:7: ^( EXPR_LAMBDA formalParameters ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LAMBDA, "EXPR_LAMBDA"), root_1);

                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:303:38: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lambdaExpr"

    public static class arrayExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:306:1: arrayExpr : LSB ( expression )? ( COMMA expression )* RSB -> ^( EXPR_ARRAY_INIT ( expression )* ) ;
    public final SlippyParser.arrayExpr_return arrayExpr() throws RecognitionException {
        SlippyParser.arrayExpr_return retval = new SlippyParser.arrayExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSB150=null;
        Token COMMA152=null;
        Token RSB154=null;
        SlippyParser.expression_return expression151 = null;

        SlippyParser.expression_return expression153 = null;


        CommonTree LSB150_tree=null;
        CommonTree COMMA152_tree=null;
        CommonTree RSB154_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RSB=new RewriteRuleTokenStream(adaptor,"token RSB");
        RewriteRuleTokenStream stream_LSB=new RewriteRuleTokenStream(adaptor,"token LSB");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:307:2: ( LSB ( expression )? ( COMMA expression )* RSB -> ^( EXPR_ARRAY_INIT ( expression )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:307:4: LSB ( expression )? ( COMMA expression )* RSB
            {
            LSB150=(Token)match(input,LSB,FOLLOW_LSB_in_arrayExpr2496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSB.add(LSB150);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:307:8: ( expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=TRUE && LA53_0<=FALSE)||LA53_0==NUM||LA53_0==NEW||LA53_0==LAMBDA||LA53_0==NOT||LA53_0==LPAR||LA53_0==LSB||LA53_0==LCB||(LA53_0>=PLUS && LA53_0<=MINUS)||LA53_0==ID||LA53_0==STR_LITERAL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayExpr2498);
                    expression151=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression151.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:307:20: ( COMMA expression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:307:21: COMMA expression
            	    {
            	    COMMA152=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayExpr2502); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA152);

            	    pushFollow(FOLLOW_expression_in_arrayExpr2504);
            	    expression153=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression153.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            RSB154=(Token)match(input,RSB,FOLLOW_RSB_in_arrayExpr2508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSB.add(RSB154);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:4: -> ^( EXPR_ARRAY_INIT ( expression )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:308:7: ^( EXPR_ARRAY_INIT ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_ARRAY_INIT, "EXPR_ARRAY_INIT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:308:25: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayExpr"

    public static class mapExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:1: mapExpr : LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB -> ^( EXPR_MAP_INIT ( mapEntryExpr )* ) ;
    public final SlippyParser.mapExpr_return mapExpr() throws RecognitionException {
        SlippyParser.mapExpr_return retval = new SlippyParser.mapExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCB155=null;
        Token COMMA157=null;
        Token RCB159=null;
        SlippyParser.mapEntryExpr_return mapEntryExpr156 = null;

        SlippyParser.mapEntryExpr_return mapEntryExpr158 = null;


        CommonTree LCB155_tree=null;
        CommonTree COMMA157_tree=null;
        CommonTree RCB159_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LCB=new RewriteRuleTokenStream(adaptor,"token LCB");
        RewriteRuleTokenStream stream_RCB=new RewriteRuleTokenStream(adaptor,"token RCB");
        RewriteRuleSubtreeStream stream_mapEntryExpr=new RewriteRuleSubtreeStream(adaptor,"rule mapEntryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:9: ( LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB -> ^( EXPR_MAP_INIT ( mapEntryExpr )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:11: LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB
            {
            LCB155=(Token)match(input,LCB,FOLLOW_LCB_in_mapExpr2530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCB.add(LCB155);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:15: ( mapEntryExpr )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=TRUE && LA55_0<=FALSE)||LA55_0==NUM||LA55_0==NEW||LA55_0==LAMBDA||LA55_0==NOT||LA55_0==LPAR||LA55_0==LSB||LA55_0==LCB||(LA55_0>=PLUS && LA55_0<=MINUS)||LA55_0==ID||LA55_0==STR_LITERAL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: mapEntryExpr
                    {
                    pushFollow(FOLLOW_mapEntryExpr_in_mapExpr2532);
                    mapEntryExpr156=mapEntryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapEntryExpr.add(mapEntryExpr156.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:29: ( COMMA mapEntryExpr )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:311:30: COMMA mapEntryExpr
            	    {
            	    COMMA157=(Token)match(input,COMMA,FOLLOW_COMMA_in_mapExpr2536); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA157);

            	    pushFollow(FOLLOW_mapEntryExpr_in_mapExpr2538);
            	    mapEntryExpr158=mapEntryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mapEntryExpr.add(mapEntryExpr158.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            RCB159=(Token)match(input,RCB,FOLLOW_RCB_in_mapExpr2542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCB.add(RCB159);



            // AST REWRITE
            // elements: mapEntryExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 312:4: -> ^( EXPR_MAP_INIT ( mapEntryExpr )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:312:7: ^( EXPR_MAP_INIT ( mapEntryExpr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MAP_INIT, "EXPR_MAP_INIT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:312:23: ( mapEntryExpr )*
                while ( stream_mapEntryExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_mapEntryExpr.nextTree());

                }
                stream_mapEntryExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mapExpr"

    public static class mapEntryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapEntryExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:315:1: mapEntryExpr : expression COLON expression -> ^( EXPR_MAP_ELEMENT ( expression )+ ) ;
    public final SlippyParser.mapEntryExpr_return mapEntryExpr() throws RecognitionException {
        SlippyParser.mapEntryExpr_return retval = new SlippyParser.mapEntryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON161=null;
        SlippyParser.expression_return expression160 = null;

        SlippyParser.expression_return expression162 = null;


        CommonTree COLON161_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:316:2: ( expression COLON expression -> ^( EXPR_MAP_ELEMENT ( expression )+ ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:316:4: expression COLON expression
            {
            pushFollow(FOLLOW_expression_in_mapEntryExpr2565);
            expression160=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression160.getTree());
            COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_mapEntryExpr2567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON161);

            pushFollow(FOLLOW_expression_in_mapEntryExpr2569);
            expression162=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression162.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 317:4: -> ^( EXPR_MAP_ELEMENT ( expression )+ )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:317:7: ^( EXPR_MAP_ELEMENT ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MAP_ELEMENT, "EXPR_MAP_ELEMENT"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mapEntryExpr"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:320:1: literal : ( NUM | STR_LITERAL | TRUE | FALSE );
    public final SlippyParser.literal_return literal() throws RecognitionException {
        SlippyParser.literal_return retval = new SlippyParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set163=null;

        CommonTree set163_tree=null;

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:321:2: ( NUM | STR_LITERAL | TRUE | FALSE )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE)||input.LA(1)==NUM||input.LA(1)==STR_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set163));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class newExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:327:1: newExpression : NEW ID expressionList -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? ) ;
    public final SlippyParser.newExpression_return newExpression() throws RecognitionException {
        SlippyParser.newExpression_return retval = new SlippyParser.newExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEW164=null;
        Token ID165=null;
        SlippyParser.expressionList_return expressionList166 = null;


        CommonTree NEW164_tree=null;
        CommonTree ID165_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:328:2: ( NEW ID expressionList -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:328:4: NEW ID expressionList
            {
            NEW164=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression2630); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW164);

            ID165=(Token)match(input,ID,FOLLOW_ID_in_newExpression2632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID165);

            pushFollow(FOLLOW_expressionList_in_newExpression2634);
            expressionList166=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList166.getTree());


            // AST REWRITE
            // elements: expressionList, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:4: -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:329:7: ^( EXPR_CONSTRUCTOR ID ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_CONSTRUCTOR, "EXPR_CONSTRUCTOR"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:329:29: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    // $ANTLR start synpred2_SlippyParser
    public final void synpred2_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:12: ( IMPORT classID )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:67:12: IMPORT classID
        {
        match(input,IMPORT,FOLLOW_IMPORT_in_synpred2_SlippyParser789); if (state.failed) return ;
        pushFollow(FOLLOW_classID_in_synpred2_SlippyParser791);
        classID();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SlippyParser

    // $ANTLR start synpred14_SlippyParser
    public final void synpred14_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:12: ( ID DOT )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:118:12: ID DOT
        {
        match(input,ID,FOLLOW_ID_in_synpred14_SlippyParser1090); if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred14_SlippyParser1092); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_SlippyParser

    // $ANTLR start synpred16_SlippyParser
    public final void synpred16_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:10: ( classID )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:123:10: classID
        {
        pushFollow(FOLLOW_classID_in_synpred16_SlippyParser1127);
        classID();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_SlippyParser

    // $ANTLR start synpred25_SlippyParser
    public final void synpred25_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:4: ( ( annotation )* fieldDeclaration )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:4: ( annotation )* fieldDeclaration
        {
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:148:4: ( annotation )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AT) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred25_SlippyParser1269);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);

        pushFollow(FOLLOW_fieldDeclaration_in_synpred25_SlippyParser1272);
        fieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_SlippyParser

    // $ANTLR start synpred26_SlippyParser
    public final void synpred26_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( annotation )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: annotation
        {
        pushFollow(FOLLOW_annotation_in_synpred26_SlippyParser1291);
        annotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_SlippyParser

    // $ANTLR start synpred27_SlippyParser
    public final void synpred27_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( ( annotation )* functionDefStatement )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( annotation )* functionDefStatement
        {
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:150:4: ( annotation )*
        loop59:
        do {
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==AT) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==ID) ) {
                    int LA59_3 = input.LA(3);

                    if ( (synpred26_SlippyParser()) ) {
                        alt59=1;
                    }


                }


            }


            switch (alt59) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred27_SlippyParser1291);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop59;
            }
        } while (true);

        pushFollow(FOLLOW_functionDefStatement_in_synpred27_SlippyParser1294);
        functionDefStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_SlippyParser

    // $ANTLR start synpred30_SlippyParser
    public final void synpred30_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:168:4: ( ELSE IF conditionalBlock )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:168:4: ELSE IF conditionalBlock
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred30_SlippyParser1402); if (state.failed) return ;
        match(input,IF,FOLLOW_IF_in_synpred30_SlippyParser1404); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalBlock_in_synpred30_SlippyParser1406);
        conditionalBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_SlippyParser

    // $ANTLR start synpred47_SlippyParser
    public final void synpred47_SlippyParser_fragment() throws RecognitionException {   
        SlippyParser.multExpr_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:245:8: ( PLUS r= multExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:245:8: PLUS r= multExpr
        {
        match(input,PLUS,FOLLOW_PLUS_in_synpred47_SlippyParser2006); if (state.failed) return ;
        pushFollow(FOLLOW_multExpr_in_synpred47_SlippyParser2010);
        r=multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_SlippyParser

    // $ANTLR start synpred48_SlippyParser
    public final void synpred48_SlippyParser_fragment() throws RecognitionException {   
        SlippyParser.multExpr_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:247:8: ( MINUS r= multExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:247:8: MINUS r= multExpr
        {
        match(input,MINUS,FOLLOW_MINUS_in_synpred48_SlippyParser2039); if (state.failed) return ;
        pushFollow(FOLLOW_multExpr_in_synpred48_SlippyParser2043);
        r=multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_SlippyParser

    // $ANTLR start synpred60_SlippyParser
    public final void synpred60_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:285:4: ( lambdaExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:285:4: lambdaExpr
        {
        pushFollow(FOLLOW_lambdaExpr_in_synpred60_SlippyParser2325);
        lambdaExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_SlippyParser

    // $ANTLR start synpred64_SlippyParser
    public final void synpred64_SlippyParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:4: ( LPAR ( expression )? ( COMMA expression )* RPAR )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:4: LPAR ( expression )? ( COMMA expression )* RPAR
        {
        match(input,LPAR,FOLLOW_LPAR_in_synpred64_SlippyParser2359); if (state.failed) return ;
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:9: ( expression )?
        int alt61=2;
        int LA61_0 = input.LA(1);

        if ( ((LA61_0>=TRUE && LA61_0<=FALSE)||LA61_0==NUM||LA61_0==NEW||LA61_0==LAMBDA||LA61_0==NOT||LA61_0==LPAR||LA61_0==LSB||LA61_0==LCB||(LA61_0>=PLUS && LA61_0<=MINUS)||LA61_0==ID||LA61_0==STR_LITERAL) ) {
            alt61=1;
        }
        switch (alt61) {
            case 1 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: expression
                {
                pushFollow(FOLLOW_expression_in_synpred64_SlippyParser2361);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:21: ( COMMA expression )*
        loop62:
        do {
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COMMA) ) {
                alt62=1;
            }


            switch (alt62) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:292:22: COMMA expression
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred64_SlippyParser2365); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred64_SlippyParser2367);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop62;
            }
        } while (true);

        match(input,RPAR,FOLLOW_RPAR_in_synpred64_SlippyParser2371); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_SlippyParser

    // $ANTLR start synpred66_SlippyParser
    public final void synpred66_SlippyParser_fragment() throws RecognitionException {   
        SlippyParser.expression_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:294:5: ( LSB (r= expression )? RSB )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:294:5: LSB (r= expression )? RSB
        {
        match(input,LSB,FOLLOW_LSB_in_synpred66_SlippyParser2397); if (state.failed) return ;
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:294:10: (r= expression )?
        int alt63=2;
        int LA63_0 = input.LA(1);

        if ( ((LA63_0>=TRUE && LA63_0<=FALSE)||LA63_0==NUM||LA63_0==NEW||LA63_0==LAMBDA||LA63_0==NOT||LA63_0==LPAR||LA63_0==LSB||LA63_0==LCB||(LA63_0>=PLUS && LA63_0<=MINUS)||LA63_0==ID||LA63_0==STR_LITERAL) ) {
            alt63=1;
        }
        switch (alt63) {
            case 1 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippyParser.g:0:0: r= expression
                {
                pushFollow(FOLLOW_expression_in_synpred66_SlippyParser2401);
                r=expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RSB,FOLLOW_RSB_in_synpred66_SlippyParser2404); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_SlippyParser

    // Delegated rules

    public final boolean synpred64_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_SlippyParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_SlippyParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA41_eotS =
        "\44\uffff";
    static final String DFA41_eofS =
        "\1\1\43\uffff";
    static final String DFA41_minS =
        "\1\6\20\uffff\2\0\21\uffff";
    static final String DFA41_maxS =
        "\1\62\20\uffff\2\0\21\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\3\40\uffff\1\2\1\1";
    static final String DFA41_specialS =
        "\21\uffff\1\0\1\1\21\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\1\uffff\2\1\2\uffff\14\1\1\uffff\16\1\1\22\1\21\4\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 244:27: ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_17 = input.LA(1);

                         
                        int index41_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_SlippyParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_18 = input.LA(1);

                         
                        int index41_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_SlippyParser()) ) {s = 35;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\50\uffff";
    static final String DFA49_eofS =
        "\1\1\47\uffff";
    static final String DFA49_minS =
        "\1\6\26\uffff\1\0\5\uffff\1\0\12\uffff";
    static final String DFA49_maxS =
        "\1\62\26\uffff\1\0\5\uffff\1\0\12\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\3\44\uffff\1\1\1\2";
    static final String DFA49_specialS =
        "\27\uffff\1\0\5\uffff\1\1\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\1\1\uffff\2\1\2\uffff\14\1\1\uffff\1\27\1\1\1\35\22\1\1\uffff"+
            "\1\1\1\uffff\1\1",
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
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 291:15: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_23 = input.LA(1);

                         
                        int index49_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_SlippyParser()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_29 = input.LA(1);

                         
                        int index49_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_SlippyParser()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_codesetDecl_in_prog752 = new BitSet(new long[]{0x000503005596E6E0L});
    public static final BitSet FOLLOW_imports_in_prog754 = new BitSet(new long[]{0x000503005596E6C2L});
    public static final BitSet FOLLOW_statement_in_prog756 = new BitSet(new long[]{0x000503005596E6C2L});
    public static final BitSet FOLLOW_IMPORT_in_imports789 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_imports791 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IMPORT_in_imports796 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_imports798 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_statementType_in_statement823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defStatement_in_statementType845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nondefStatement_in_statementType850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefStatement_in_defStatement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefStatement_in_defStatement877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flowStatement_in_nondefStatement899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_nondefStatement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_functionDefStatement926 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_DEFINE_in_functionDefStatement929 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefStatement931 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_functionDefStatement933 = new BitSet(new long[]{0x000503005597E6C0L});
    public static final BitSet FOLLOW_block_in_functionDefStatement935 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_functionDefStatement938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefStatement964 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_classDefStatement966 = new BitSet(new long[]{0x0001000001015C00L});
    public static final BitSet FOLLOW_classExtendsExpr_in_classDefStatement968 = new BitSet(new long[]{0x0001000001015400L});
    public static final BitSet FOLLOW_classMixesExpr_in_classDefStatement971 = new BitSet(new long[]{0x0001000001014400L});
    public static final BitSet FOLLOW_classMemberDecl_in_classDefStatement974 = new BitSet(new long[]{0x0001000001014400L});
    public static final BitSet FOLLOW_DONE_in_classDefStatement977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_classExtendsExpr1004 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_classExtendsExpr1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeset_in_classID1027 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_classID1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CODESET_in_codesetDecl1055 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_codesetDecl1058 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codesetDecl1060 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_codesetDecl1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_codeset1090 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codeset1092 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_codeset1097 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codeset1099 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_MIXES_in_classMixesExpr1125 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_classID_in_classMixesExpr1127 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_COMMA_in_classMixesExpr1131 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_classMixesExpr1133 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_whileStatement_in_flowStatement1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_flowStatement1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_flowStatement1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_formalParameters1179 = new BitSet(new long[]{0x0001400008000000L});
    public static final BitSet FOLLOW_ID_in_formalParameters1182 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameters1186 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_formalParameters1188 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_formalParameters1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block1215 = new BitSet(new long[]{0x000503005596E6C2L});
    public static final BitSet FOLLOW_AT_in_annotation1239 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_annotation1241 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expressionList_in_annotation1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_classMemberDecl1269 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_classMemberDecl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_classMemberDecl1291 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_functionDefStatement_in_classMemberDecl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefStatement_in_classMemberDecl1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldDeclaration1335 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQ_in_fieldDeclaration1338 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_fieldDeclaration1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1363 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parExpression_in_whileStatement1365 = new BitSet(new long[]{0x000503005597E6C0L});
    public static final BitSet FOLLOW_block_in_whileStatement1367 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_whileStatement1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1395 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_ifStatement1397 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_ifStatement1404 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_ifStatement1406 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1413 = new BitSet(new long[]{0x000503005597E6C0L});
    public static final BitSet FOLLOW_block_in_ifStatement1415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_ifStatement1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_conditionalBlock1448 = new BitSet(new long[]{0x000503005596E6C2L});
    public static final BitSet FOLLOW_block_in_conditionalBlock1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_parExpression1476 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_parExpression1478 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAR_in_parExpression1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loopStatement1498 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_loopStatement1500 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_loopStatement1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loopStatement1518 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAR_in_loopStatement1520 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_loopStatement1522 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COLON_in_loopStatement1524 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_loopStatement1526 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAR_in_loopStatement1528 = new BitSet(new long[]{0x000503005597E6C0L});
    public static final BitSet FOLLOW_block_in_loopStatement1530 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_loopStatement1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_expressionList1561 = new BitSet(new long[]{0x000543005D96E6C0L});
    public static final BitSet FOLLOW_expression_in_expressionList1563 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList1567 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_expressionList1569 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_expressionList1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expression1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_assignExpression1610 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQ_in_assignExpression1622 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_assignExpression1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr1661 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpr1673 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr1677 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpr1710 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpr1726 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpr1730 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1766 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_EQEQ_in_equalityExpression1781 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1785 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_NEQ_in_equalityExpression1812 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1816 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1849 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_LT_in_gtltExpression1864 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1869 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_LTEQ_in_gtltExpression1896 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1900 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_GT_in_gtltExpression1924 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1929 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_GTEQ_in_gtltExpression1953 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1957 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr1990 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_PLUS_in_additionExpr2006 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr2010 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_MINUS_in_additionExpr2039 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr2043 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2077 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_multExpr2092 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2096 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_multExpr2123 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2127 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2151 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2155 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpr2188 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpr2206 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpr2224 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_unaryExpr2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_dotExpr2254 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_DOT_in_dotExpr2266 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_postfixedExpr_in_dotExpr2270 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_parExpression_in_primaryExpr2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpr2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixedExpr_in_primaryExpr2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpr_in_primaryExpr2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_primaryExpr2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapExpr_in_primaryExpr2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_postfixedExpr2347 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LPAR_in_postfixedExpr2359 = new BitSet(new long[]{0x000543005D96E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2361 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_postfixedExpr2365 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2367 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_postfixedExpr2371 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LSB_in_postfixedExpr2397 = new BitSet(new long[]{0x000503007596E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2401 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RSB_in_postfixedExpr2404 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambdaExpr2438 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_lambdaExpr2440 = new BitSet(new long[]{0x000503005597E6C0L});
    public static final BitSet FOLLOW_block_in_lambdaExpr2442 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_lambdaExpr2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCB_in_lambdaExpr2464 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_lambdaExpr2466 = new BitSet(new long[]{0x00050300D596E6C0L});
    public static final BitSet FOLLOW_block_in_lambdaExpr2468 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RCB_in_lambdaExpr2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_arrayExpr2496 = new BitSet(new long[]{0x000543007596E6C0L});
    public static final BitSet FOLLOW_expression_in_arrayExpr2498 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayExpr2502 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_arrayExpr2504 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_RSB_in_arrayExpr2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCB_in_mapExpr2530 = new BitSet(new long[]{0x00054300D596E6C0L});
    public static final BitSet FOLLOW_mapEntryExpr_in_mapExpr2532 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_COMMA_in_mapExpr2536 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_mapEntryExpr_in_mapExpr2538 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_RCB_in_mapExpr2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_mapEntryExpr2565 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COLON_in_mapEntryExpr2567 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_mapEntryExpr2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression2630 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_newExpression2632 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_expressionList_in_newExpression2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_synpred2_SlippyParser789 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_synpred2_SlippyParser791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred14_SlippyParser1090 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_synpred14_SlippyParser1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classID_in_synpred16_SlippyParser1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred25_SlippyParser1269 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred25_SlippyParser1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred26_SlippyParser1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred27_SlippyParser1291 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_functionDefStatement_in_synpred27_SlippyParser1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred30_SlippyParser1402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_synpred30_SlippyParser1404 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_synpred30_SlippyParser1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_synpred47_SlippyParser2006 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_multExpr_in_synpred47_SlippyParser2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_synpred48_SlippyParser2039 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_multExpr_in_synpred48_SlippyParser2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpr_in_synpred60_SlippyParser2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_synpred64_SlippyParser2359 = new BitSet(new long[]{0x000543005D96E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred64_SlippyParser2361 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred64_SlippyParser2365 = new BitSet(new long[]{0x000503005596E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred64_SlippyParser2367 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_synpred64_SlippyParser2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_synpred66_SlippyParser2397 = new BitSet(new long[]{0x000503007596E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred66_SlippyParser2401 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RSB_in_synpred66_SlippyParser2404 = new BitSet(new long[]{0x0000000000000002L});

}