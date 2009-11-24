// $ANTLR 3.1.2 /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g 2009-06-17 17:46:55
package org.six11.slippy;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SlippySyntaxParser extends Parser {
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


        public SlippySyntaxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SlippySyntaxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SlippySyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:62:1: prog : codesetDecl imports ( statement )* -> ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) ) ;
    public final SlippySyntaxParser.prog_return prog() throws RecognitionException {
        SlippySyntaxParser.prog_return retval = new SlippySyntaxParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.codesetDecl_return codesetDecl1 = null;

        SlippySyntaxParser.imports_return imports2 = null;

        SlippySyntaxParser.statement_return statement3 = null;


        RewriteRuleSubtreeStream stream_imports=new RewriteRuleSubtreeStream(adaptor,"rule imports");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_codesetDecl=new RewriteRuleSubtreeStream(adaptor,"rule codesetDecl");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:62:6: ( codesetDecl imports ( statement )* -> ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:62:8: codesetDecl imports ( statement )*
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
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:62:28: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TRUE && LA1_0<=FALSE)||(LA1_0>=NUM && LA1_0<=CLASS)||(LA1_0>=NEW && LA1_0<=LAMBDA)||(LA1_0>=WHILE && LA1_0<=LOOP)||LA1_0==IF||LA1_0==NOT||LA1_0==LPAR||LA1_0==LSB||LA1_0==LCB||(LA1_0>=PLUS && LA1_0<=MINUS)||LA1_0==ID||LA1_0==STR_LITERAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: statement
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:63:7: ^( PROG codesetDecl imports ^( BLOCK ( statement )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);

                adaptor.addChild(root_1, stream_codesetDecl.nextTree());
                adaptor.addChild(root_1, stream_imports.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:63:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:63:42: ( statement )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:1: imports : ( IMPORT classID )? ( IMPORT classID )* -> ^( STMT_IMPORT ( classID )* ) ;
    public final SlippySyntaxParser.imports_return imports() throws RecognitionException {
        SlippySyntaxParser.imports_return retval = new SlippySyntaxParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPORT4=null;
        Token IMPORT6=null;
        SlippySyntaxParser.classID_return classID5 = null;

        SlippySyntaxParser.classID_return classID7 = null;


        CommonTree IMPORT4_tree=null;
        CommonTree IMPORT6_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:9: ( ( IMPORT classID )? ( IMPORT classID )* -> ^( STMT_IMPORT ( classID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:11: ( IMPORT classID )? ( IMPORT classID )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:11: ( IMPORT classID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IMPORT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (synpred2_SlippySyntaxParser()) ) {
                        alt2=1;
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:12: IMPORT classID
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

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:29: ( IMPORT classID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:30: IMPORT classID
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:68:7: ^( STMT_IMPORT ( classID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_IMPORT, "STMT_IMPORT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:68:21: ( classID )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:71:1: statement : statementType -> ^( STMT statementType ) ;
    public final SlippySyntaxParser.statement_return statement() throws RecognitionException {
        SlippySyntaxParser.statement_return retval = new SlippySyntaxParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.statementType_return statementType8 = null;


        RewriteRuleSubtreeStream stream_statementType=new RewriteRuleSubtreeStream(adaptor,"rule statementType");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:72:2: ( statementType -> ^( STMT statementType ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:72:4: statementType
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:73:7: ^( STMT statementType )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:76:1: statementType : ( defStatement | nondefStatement );
    public final SlippySyntaxParser.statementType_return statementType() throws RecognitionException {
        SlippySyntaxParser.statementType_return retval = new SlippySyntaxParser.statementType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.defStatement_return defStatement9 = null;

        SlippySyntaxParser.nondefStatement_return nondefStatement10 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:77:2: ( defStatement | nondefStatement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CLASS||LA4_0==DEFINE) ) {
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:77:4: defStatement
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:78:4: nondefStatement
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:81:1: defStatement : ( functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) );
    public final SlippySyntaxParser.defStatement_return defStatement() throws RecognitionException {
        SlippySyntaxParser.defStatement_return retval = new SlippySyntaxParser.defStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.functionDefStatement_return functionDefStatement11 = null;

        SlippySyntaxParser.classDefStatement_return classDefStatement12 = null;


        RewriteRuleSubtreeStream stream_functionDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule functionDefStatement");
        RewriteRuleSubtreeStream stream_classDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule classDefStatement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:82:2: ( functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEFINE) ) {
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:82:4: functionDefStatement
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
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:83:7: ^( DEF_FUNCTION functionDefStatement )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:84:4: classDefStatement
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
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:85:7: ^( DEF_CLASS classDefStatement )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:88:1: nondefStatement : ( flowStatement | expression -> ^( EXPR expression ) );
    public final SlippySyntaxParser.nondefStatement_return nondefStatement() throws RecognitionException {
        SlippySyntaxParser.nondefStatement_return retval = new SlippySyntaxParser.nondefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.flowStatement_return flowStatement13 = null;

        SlippySyntaxParser.expression_return expression14 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:89:2: ( flowStatement | expression -> ^( EXPR expression ) )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:89:4: flowStatement
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:90:4: expression
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
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:91:7: ^( EXPR expression )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:94:1: functionDefStatement : DEFINE ID formalParameters ( block )? DONE -> ID formalParameters ( block )? ;
    public final SlippySyntaxParser.functionDefStatement_return functionDefStatement() throws RecognitionException {
        SlippySyntaxParser.functionDefStatement_return retval = new SlippySyntaxParser.functionDefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINE15=null;
        Token ID16=null;
        Token DONE19=null;
        SlippySyntaxParser.formalParameters_return formalParameters17 = null;

        SlippySyntaxParser.block_return block18 = null;


        CommonTree DEFINE15_tree=null;
        CommonTree ID16_tree=null;
        CommonTree DONE19_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:95:2: ( DEFINE ID formalParameters ( block )? DONE -> ID formalParameters ( block )? )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:95:4: DEFINE ID formalParameters ( block )? DONE
            {
            DEFINE15=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_functionDefStatement926); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE15);

            ID16=(Token)match(input,ID,FOLLOW_ID_in_functionDefStatement928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID16);

            pushFollow(FOLLOW_formalParameters_in_functionDefStatement930);
            formalParameters17=formalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters17.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:95:31: ( block )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=TRUE && LA7_0<=FALSE)||(LA7_0>=NUM && LA7_0<=CLASS)||(LA7_0>=NEW && LA7_0<=LAMBDA)||(LA7_0>=WHILE && LA7_0<=LOOP)||LA7_0==IF||LA7_0==NOT||LA7_0==LPAR||LA7_0==LSB||LA7_0==LCB||(LA7_0>=PLUS && LA7_0<=MINUS)||LA7_0==ID||LA7_0==STR_LITERAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_functionDefStatement932);
                    block18=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block18.getTree());

                    }
                    break;

            }

            DONE19=(Token)match(input,DONE,FOLLOW_DONE_in_functionDefStatement935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE19);



            // AST REWRITE
            // elements: block, formalParameters, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:4: -> ID formalParameters ( block )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                adaptor.addChild(root_0, stream_formalParameters.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:96:27: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_0, stream_block.nextTree());

                }
                stream_block.reset();

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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:99:1: classDefStatement : CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE -> ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* ;
    public final SlippySyntaxParser.classDefStatement_return classDefStatement() throws RecognitionException {
        SlippySyntaxParser.classDefStatement_return retval = new SlippySyntaxParser.classDefStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS20=null;
        Token ID21=null;
        Token DONE25=null;
        SlippySyntaxParser.classExtendsExpr_return classExtendsExpr22 = null;

        SlippySyntaxParser.classMixesExpr_return classMixesExpr23 = null;

        SlippySyntaxParser.classMemberDecl_return classMemberDecl24 = null;


        CommonTree CLASS20_tree=null;
        CommonTree ID21_tree=null;
        CommonTree DONE25_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_classMixesExpr=new RewriteRuleSubtreeStream(adaptor,"rule classMixesExpr");
        RewriteRuleSubtreeStream stream_classExtendsExpr=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsExpr");
        RewriteRuleSubtreeStream stream_classMemberDecl=new RewriteRuleSubtreeStream(adaptor,"rule classMemberDecl");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:100:2: ( CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE -> ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:100:4: CLASS ID ( classExtendsExpr )? ( classMixesExpr )? ( classMemberDecl )* DONE
            {
            CLASS20=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefStatement958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS20);

            ID21=(Token)match(input,ID,FOLLOW_ID_in_classDefStatement960); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID21);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:100:13: ( classExtendsExpr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EXTENDS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: classExtendsExpr
                    {
                    pushFollow(FOLLOW_classExtendsExpr_in_classDefStatement962);
                    classExtendsExpr22=classExtendsExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classExtendsExpr.add(classExtendsExpr22.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:100:31: ( classMixesExpr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==MIXES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: classMixesExpr
                    {
                    pushFollow(FOLLOW_classMixesExpr_in_classDefStatement965);
                    classMixesExpr23=classMixesExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMixesExpr.add(classMixesExpr23.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:100:47: ( classMemberDecl )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==CLASS||LA10_0==DEFINE||LA10_0==AT||LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: classMemberDecl
            	    {
            	    pushFollow(FOLLOW_classMemberDecl_in_classDefStatement968);
            	    classMemberDecl24=classMemberDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMemberDecl.add(classMemberDecl24.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            DONE25=(Token)match(input,DONE,FOLLOW_DONE_in_classDefStatement971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE25);



            // AST REWRITE
            // elements: classExtendsExpr, classMemberDecl, classMixesExpr, ID
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:101:10: ( classExtendsExpr )?
                if ( stream_classExtendsExpr.hasNext() ) {
                    adaptor.addChild(root_0, stream_classExtendsExpr.nextTree());

                }
                stream_classExtendsExpr.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:101:28: ( classMixesExpr )?
                if ( stream_classMixesExpr.hasNext() ) {
                    adaptor.addChild(root_0, stream_classMixesExpr.nextTree());

                }
                stream_classMixesExpr.reset();
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:101:44: ( classMemberDecl )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:104:1: classExtendsExpr : EXTENDS classID -> ^( EXPR_CLASS_EXTENDS classID ) ;
    public final SlippySyntaxParser.classExtendsExpr_return classExtendsExpr() throws RecognitionException {
        SlippySyntaxParser.classExtendsExpr_return retval = new SlippySyntaxParser.classExtendsExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXTENDS26=null;
        SlippySyntaxParser.classID_return classID27 = null;


        CommonTree EXTENDS26_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:105:2: ( EXTENDS classID -> ^( EXPR_CLASS_EXTENDS classID ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:105:4: EXTENDS classID
            {
            EXTENDS26=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classExtendsExpr998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS26);

            pushFollow(FOLLOW_classID_in_classExtendsExpr1000);
            classID27=classID();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classID.add(classID27.getTree());


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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:106:7: ^( EXPR_CLASS_EXTENDS classID )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:109:1: classID : codeset ID -> ^( EXPR_FQ_CLASS_NAME codeset ID ) ;
    public final SlippySyntaxParser.classID_return classID() throws RecognitionException {
        SlippySyntaxParser.classID_return retval = new SlippySyntaxParser.classID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID29=null;
        SlippySyntaxParser.codeset_return codeset28 = null;


        CommonTree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_codeset=new RewriteRuleSubtreeStream(adaptor,"rule codeset");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:109:9: ( codeset ID -> ^( EXPR_FQ_CLASS_NAME codeset ID ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:109:11: codeset ID
            {
            pushFollow(FOLLOW_codeset_in_classID1021);
            codeset28=codeset();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_codeset.add(codeset28.getTree());
            ID29=(Token)match(input,ID,FOLLOW_ID_in_classID1023); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID29);



            // AST REWRITE
            // elements: ID, codeset
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:110:7: ^( EXPR_FQ_CLASS_NAME codeset ID )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:113:1: codesetDecl : ( CODESET ( ID DOT )* ID )? -> ^( STMT_CODESET_DECL ( ID )* ) ;
    public final SlippySyntaxParser.codesetDecl_return codesetDecl() throws RecognitionException {
        SlippySyntaxParser.codesetDecl_return retval = new SlippySyntaxParser.codesetDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CODESET30=null;
        Token ID31=null;
        Token DOT32=null;
        Token ID33=null;

        CommonTree CODESET30_tree=null;
        CommonTree ID31_tree=null;
        CommonTree DOT32_tree=null;
        CommonTree ID33_tree=null;
        RewriteRuleTokenStream stream_CODESET=new RewriteRuleTokenStream(adaptor,"token CODESET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:2: ( ( CODESET ( ID DOT )* ID )? -> ^( STMT_CODESET_DECL ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:4: ( CODESET ( ID DOT )* ID )?
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:4: ( CODESET ( ID DOT )* ID )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CODESET) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:5: CODESET ( ID DOT )* ID
                    {
                    CODESET30=(Token)match(input,CODESET,FOLLOW_CODESET_in_codesetDecl1049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CODESET.add(CODESET30);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:13: ( ID DOT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==DOT) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:114:14: ID DOT
                    	    {
                    	    ID31=(Token)match(input,ID,FOLLOW_ID_in_codesetDecl1052); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID31);

                    	    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_codesetDecl1054); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(DOT32);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    ID33=(Token)match(input,ID,FOLLOW_ID_in_codesetDecl1058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID33);


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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:115:7: ^( STMT_CODESET_DECL ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CODESET_DECL, "STMT_CODESET_DECL"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:115:27: ( ID )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:1: codeset : ( ID DOT )? ( ID DOT )* -> ^( STMT_CODESET ( ID )* ) ;
    public final SlippySyntaxParser.codeset_return codeset() throws RecognitionException {
        SlippySyntaxParser.codeset_return retval = new SlippySyntaxParser.codeset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID34=null;
        Token DOT35=null;
        Token ID36=null;
        Token DOT37=null;

        CommonTree ID34_tree=null;
        CommonTree DOT35_tree=null;
        CommonTree ID36_tree=null;
        CommonTree DOT37_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:9: ( ( ID DOT )? ( ID DOT )* -> ^( STMT_CODESET ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:11: ( ID DOT )? ( ID DOT )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:11: ( ID DOT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOT) ) {
                    int LA13_2 = input.LA(3);

                    if ( (synpred13_SlippySyntaxParser()) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:12: ID DOT
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_codeset1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);

                    DOT35=(Token)match(input,DOT,FOLLOW_DOT_in_codeset1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT35);


                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:21: ( ID DOT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==DOT) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:22: ID DOT
            	    {
            	    ID36=(Token)match(input,ID,FOLLOW_ID_in_codeset1091); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID36);

            	    DOT37=(Token)match(input,DOT,FOLLOW_DOT_in_codeset1093); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT37);


            	    }
            	    break;

            	default :
            	    break loop14;
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:119:7: ^( STMT_CODESET ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CODESET, "STMT_CODESET"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:119:22: ( ID )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:122:1: classMixesExpr : MIXES ( classID )? ( COMMA classID )* -> ^( EXPR_CLASS_MIXES ( classID )* ) ;
    public final SlippySyntaxParser.classMixesExpr_return classMixesExpr() throws RecognitionException {
        SlippySyntaxParser.classMixesExpr_return retval = new SlippySyntaxParser.classMixesExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MIXES38=null;
        Token COMMA40=null;
        SlippySyntaxParser.classID_return classID39 = null;

        SlippySyntaxParser.classID_return classID41 = null;


        CommonTree MIXES38_tree=null;
        CommonTree COMMA40_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_MIXES=new RewriteRuleTokenStream(adaptor,"token MIXES");
        RewriteRuleSubtreeStream stream_classID=new RewriteRuleSubtreeStream(adaptor,"rule classID");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:2: ( MIXES ( classID )? ( COMMA classID )* -> ^( EXPR_CLASS_MIXES ( classID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:4: MIXES ( classID )? ( COMMA classID )*
            {
            MIXES38=(Token)match(input,MIXES,FOLLOW_MIXES_in_classMixesExpr1119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MIXES.add(MIXES38);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:10: ( classID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred15_SlippySyntaxParser()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: classID
                    {
                    pushFollow(FOLLOW_classID_in_classMixesExpr1121);
                    classID39=classID();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classID.add(classID39.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:19: ( COMMA classID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:20: COMMA classID
            	    {
            	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_classMixesExpr1125); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA40);

            	    pushFollow(FOLLOW_classID_in_classMixesExpr1127);
            	    classID41=classID();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classID.add(classID41.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:124:7: ^( EXPR_CLASS_MIXES ( classID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_CLASS_MIXES, "EXPR_CLASS_MIXES"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:124:26: ( classID )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:127:1: flowStatement : ( whileStatement | ifStatement | loopStatement );
    public final SlippySyntaxParser.flowStatement_return flowStatement() throws RecognitionException {
        SlippySyntaxParser.flowStatement_return retval = new SlippySyntaxParser.flowStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.whileStatement_return whileStatement42 = null;

        SlippySyntaxParser.ifStatement_return ifStatement43 = null;

        SlippySyntaxParser.loopStatement_return loopStatement44 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:128:2: ( whileStatement | ifStatement | loopStatement )
            int alt17=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt17=1;
                }
                break;
            case IF:
                {
                alt17=2;
                }
                break;
            case LOOP:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:128:4: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_flowStatement1152);
                    whileStatement42=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement42.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:129:4: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_flowStatement1157);
                    ifStatement43=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement43.getTree());

                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:130:4: loopStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loopStatement_in_flowStatement1162);
                    loopStatement44=loopStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopStatement44.getTree());

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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:133:1: formalParameters : LPAR ( ( ID )? ( COMMA ID )* ) RPAR -> ^( DEF_PARAM_LIST ( ID )* ) ;
    public final SlippySyntaxParser.formalParameters_return formalParameters() throws RecognitionException {
        SlippySyntaxParser.formalParameters_return retval = new SlippySyntaxParser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR45=null;
        Token ID46=null;
        Token COMMA47=null;
        Token ID48=null;
        Token RPAR49=null;

        CommonTree LPAR45_tree=null;
        CommonTree ID46_tree=null;
        CommonTree COMMA47_tree=null;
        CommonTree ID48_tree=null;
        CommonTree RPAR49_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:2: ( LPAR ( ( ID )? ( COMMA ID )* ) RPAR -> ^( DEF_PARAM_LIST ( ID )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:4: LPAR ( ( ID )? ( COMMA ID )* ) RPAR
            {
            LPAR45=(Token)match(input,LPAR,FOLLOW_LPAR_in_formalParameters1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR45);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:9: ( ( ID )? ( COMMA ID )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:10: ( ID )? ( COMMA ID )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:10: ( ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: ID
                    {
                    ID46=(Token)match(input,ID,FOLLOW_ID_in_formalParameters1176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID46);


                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:14: ( COMMA ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:134:15: COMMA ID
            	    {
            	    COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameters1180); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA47);

            	    ID48=(Token)match(input,ID,FOLLOW_ID_in_formalParameters1182); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID48);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            RPAR49=(Token)match(input,RPAR,FOLLOW_RPAR_in_formalParameters1187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR49);



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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:135:7: ^( DEF_PARAM_LIST ( ID )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_PARAM_LIST, "DEF_PARAM_LIST"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:135:24: ( ID )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:138:1: block : ( statement )+ -> ^( BLOCK ( statement )+ ) ;
    public final SlippySyntaxParser.block_return block() throws RecognitionException {
        SlippySyntaxParser.block_return retval = new SlippySyntaxParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.statement_return statement50 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:138:7: ( ( statement )+ -> ^( BLOCK ( statement )+ ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:138:9: ( statement )+
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:138:9: ( statement )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=TRUE && LA20_0<=FALSE)||(LA20_0>=NUM && LA20_0<=CLASS)||(LA20_0>=NEW && LA20_0<=LAMBDA)||(LA20_0>=WHILE && LA20_0<=LOOP)||LA20_0==IF||LA20_0==NOT||LA20_0==LPAR||LA20_0==LSB||LA20_0==LCB||(LA20_0>=PLUS && LA20_0<=MINUS)||LA20_0==ID||LA20_0==STR_LITERAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1209);
            	    statement50=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement50.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:139:7: ^( BLOCK ( statement )+ )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:142:1: annotation : AT ID ( expressionList )? -> ^( ANNOTATION ID ( expressionList )? ) ;
    public final SlippySyntaxParser.annotation_return annotation() throws RecognitionException {
        SlippySyntaxParser.annotation_return retval = new SlippySyntaxParser.annotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AT51=null;
        Token ID52=null;
        SlippySyntaxParser.expressionList_return expressionList53 = null;


        CommonTree AT51_tree=null;
        CommonTree ID52_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:143:2: ( AT ID ( expressionList )? -> ^( ANNOTATION ID ( expressionList )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:143:4: AT ID ( expressionList )?
            {
            AT51=(Token)match(input,AT,FOLLOW_AT_in_annotation1233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT51);

            ID52=(Token)match(input,ID,FOLLOW_ID_in_annotation1235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID52);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:143:10: ( expressionList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_annotation1237);
                    expressionList53=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList53.getTree());

                    }
                    break;

            }



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
            // 144:4: -> ^( ANNOTATION ID ( expressionList )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:144:7: ^( ANNOTATION ID ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANNOTATION, "ANNOTATION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:144:23: ( expressionList )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:146:1: classMemberDecl : ( ( annotation )* fieldDeclaration -> ^( DEF_FIELD fieldDeclaration ( annotation )* ) | ( annotation )* functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ( annotation )* ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) );
    public final SlippySyntaxParser.classMemberDecl_return classMemberDecl() throws RecognitionException {
        SlippySyntaxParser.classMemberDecl_return retval = new SlippySyntaxParser.classMemberDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.annotation_return annotation54 = null;

        SlippySyntaxParser.fieldDeclaration_return fieldDeclaration55 = null;

        SlippySyntaxParser.annotation_return annotation56 = null;

        SlippySyntaxParser.functionDefStatement_return functionDefStatement57 = null;

        SlippySyntaxParser.classDefStatement_return classDefStatement58 = null;


        RewriteRuleSubtreeStream stream_functionDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule functionDefStatement");
        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        RewriteRuleSubtreeStream stream_fieldDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule fieldDeclaration");
        RewriteRuleSubtreeStream stream_classDefStatement=new RewriteRuleSubtreeStream(adaptor,"rule classDefStatement");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:2: ( ( annotation )* fieldDeclaration -> ^( DEF_FIELD fieldDeclaration ( annotation )* ) | ( annotation )* functionDefStatement -> ^( DEF_FUNCTION functionDefStatement ( annotation )* ) | classDefStatement -> ^( DEF_CLASS classDefStatement ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                int LA24_1 = input.LA(2);

                if ( (synpred24_SlippySyntaxParser()) ) {
                    alt24=1;
                }
                else if ( (synpred26_SlippySyntaxParser()) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt24=1;
                }
                break;
            case DEFINE:
                {
                alt24=2;
                }
                break;
            case CLASS:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:4: ( annotation )* fieldDeclaration
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:4: ( annotation )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==AT) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_classMemberDecl1262);
                    	    annotation54=annotation();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotation.add(annotation54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    pushFollow(FOLLOW_fieldDeclaration_in_classMemberDecl1265);
                    fieldDeclaration55=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldDeclaration.add(fieldDeclaration55.getTree());


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
                    // 148:4: -> ^( DEF_FIELD fieldDeclaration ( annotation )* )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:148:7: ^( DEF_FIELD fieldDeclaration ( annotation )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_FIELD, "DEF_FIELD"), root_1);

                        adaptor.addChild(root_1, stream_fieldDeclaration.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:148:36: ( annotation )*
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:149:4: ( annotation )* functionDefStatement
                    {
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:149:4: ( annotation )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==AT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_classMemberDecl1284);
                    	    annotation56=annotation();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_annotation.add(annotation56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    pushFollow(FOLLOW_functionDefStatement_in_classMemberDecl1287);
                    functionDefStatement57=functionDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionDefStatement.add(functionDefStatement57.getTree());


                    // AST REWRITE
                    // elements: functionDefStatement, annotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:4: -> ^( DEF_FUNCTION functionDefStatement ( annotation )* )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:150:7: ^( DEF_FUNCTION functionDefStatement ( annotation )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF_FUNCTION, "DEF_FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_functionDefStatement.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:150:43: ( annotation )*
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:151:4: classDefStatement
                    {
                    pushFollow(FOLLOW_classDefStatement_in_classMemberDecl1306);
                    classDefStatement58=classDefStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classDefStatement.add(classDefStatement58.getTree());


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
                    // 152:4: -> ^( DEF_CLASS classDefStatement )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:152:7: ^( DEF_CLASS classDefStatement )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:155:1: fieldDeclaration : ID ( EQ expression )? -> ID ( expression )? ;
    public final SlippySyntaxParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        SlippySyntaxParser.fieldDeclaration_return retval = new SlippySyntaxParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID59=null;
        Token EQ60=null;
        SlippySyntaxParser.expression_return expression61 = null;


        CommonTree ID59_tree=null;
        CommonTree EQ60_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:156:2: ( ID ( EQ expression )? -> ID ( expression )? )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:156:4: ID ( EQ expression )?
            {
            ID59=(Token)match(input,ID,FOLLOW_ID_in_fieldDeclaration1328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID59);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:156:7: ( EQ expression )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EQ) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:156:8: EQ expression
                    {
                    EQ60=(Token)match(input,EQ,FOLLOW_EQ_in_fieldDeclaration1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ60);

                    pushFollow(FOLLOW_expression_in_fieldDeclaration1333);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());

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
            // 157:4: -> ID ( expression )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:157:10: ( expression )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:160:1: whileStatement : WHILE parExpression ( block )? DONE -> ^( STMT_WHILE parExpression ( block )? ) ;
    public final SlippySyntaxParser.whileStatement_return whileStatement() throws RecognitionException {
        SlippySyntaxParser.whileStatement_return retval = new SlippySyntaxParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE62=null;
        Token DONE65=null;
        SlippySyntaxParser.parExpression_return parExpression63 = null;

        SlippySyntaxParser.block_return block64 = null;


        CommonTree WHILE62_tree=null;
        CommonTree DONE65_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:161:2: ( WHILE parExpression ( block )? DONE -> ^( STMT_WHILE parExpression ( block )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:161:4: WHILE parExpression ( block )? DONE
            {
            WHILE62=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE62);

            pushFollow(FOLLOW_parExpression_in_whileStatement1358);
            parExpression63=parExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parExpression.add(parExpression63.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:161:24: ( block )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=TRUE && LA26_0<=FALSE)||(LA26_0>=NUM && LA26_0<=CLASS)||(LA26_0>=NEW && LA26_0<=LAMBDA)||(LA26_0>=WHILE && LA26_0<=LOOP)||LA26_0==IF||LA26_0==NOT||LA26_0==LPAR||LA26_0==LSB||LA26_0==LCB||(LA26_0>=PLUS && LA26_0<=MINUS)||LA26_0==ID||LA26_0==STR_LITERAL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_whileStatement1360);
                    block64=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block64.getTree());

                    }
                    break;

            }

            DONE65=(Token)match(input,DONE,FOLLOW_DONE_in_whileStatement1363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE65);



            // AST REWRITE
            // elements: block, parExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 162:4: -> ^( STMT_WHILE parExpression ( block )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:162:7: ^( STMT_WHILE parExpression ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_WHILE, "STMT_WHILE"), root_1);

                adaptor.addChild(root_1, stream_parExpression.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:162:34: ( block )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:165:1: ifStatement : IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE -> ^( STMT_IF ( conditionalBlock )+ ( block )* ) ;
    public final SlippySyntaxParser.ifStatement_return ifStatement() throws RecognitionException {
        SlippySyntaxParser.ifStatement_return retval = new SlippySyntaxParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF66=null;
        Token ELSE68=null;
        Token IF69=null;
        Token ELSE71=null;
        Token DONE73=null;
        SlippySyntaxParser.conditionalBlock_return conditionalBlock67 = null;

        SlippySyntaxParser.conditionalBlock_return conditionalBlock70 = null;

        SlippySyntaxParser.block_return block72 = null;


        CommonTree IF66_tree=null;
        CommonTree ELSE68_tree=null;
        CommonTree IF69_tree=null;
        CommonTree ELSE71_tree=null;
        CommonTree DONE73_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_conditionalBlock=new RewriteRuleSubtreeStream(adaptor,"rule conditionalBlock");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:166:2: ( IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE -> ^( STMT_IF ( conditionalBlock )+ ( block )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:166:4: IF conditionalBlock ( ELSE IF conditionalBlock )* ( ELSE ( block )? )? DONE
            {
            IF66=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF66);

            pushFollow(FOLLOW_conditionalBlock_in_ifStatement1390);
            conditionalBlock67=conditionalBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock67.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:167:3: ( ELSE IF conditionalBlock )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ELSE) ) {
                    int LA27_1 = input.LA(2);

                    if ( (synpred29_SlippySyntaxParser()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:167:4: ELSE IF conditionalBlock
            	    {
            	    ELSE68=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1395); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELSE.add(ELSE68);

            	    IF69=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1397); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IF.add(IF69);

            	    pushFollow(FOLLOW_conditionalBlock_in_ifStatement1399);
            	    conditionalBlock70=conditionalBlock();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock70.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:168:3: ( ELSE ( block )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELSE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:168:4: ELSE ( block )?
                    {
                    ELSE71=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE71);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:168:9: ( block )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=TRUE && LA28_0<=FALSE)||(LA28_0>=NUM && LA28_0<=CLASS)||(LA28_0>=NEW && LA28_0<=LAMBDA)||(LA28_0>=WHILE && LA28_0<=LOOP)||LA28_0==IF||LA28_0==NOT||LA28_0==LPAR||LA28_0==LSB||LA28_0==LCB||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==ID||LA28_0==STR_LITERAL) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_ifStatement1408);
                            block72=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block72.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            DONE73=(Token)match(input,DONE,FOLLOW_DONE_in_ifStatement1415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DONE.add(DONE73);



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
            // 170:4: -> ^( STMT_IF ( conditionalBlock )+ ( block )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:170:7: ^( STMT_IF ( conditionalBlock )+ ( block )* )
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
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:170:35: ( block )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:173:1: conditionalBlock : parExpression ( block )? -> ^( STMT_CONDITION_BLOCK parExpression ( block )? ) ;
    public final SlippySyntaxParser.conditionalBlock_return conditionalBlock() throws RecognitionException {
        SlippySyntaxParser.conditionalBlock_return retval = new SlippySyntaxParser.conditionalBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.parExpression_return parExpression74 = null;

        SlippySyntaxParser.block_return block75 = null;


        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:174:2: ( parExpression ( block )? -> ^( STMT_CONDITION_BLOCK parExpression ( block )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:174:4: parExpression ( block )?
            {
            pushFollow(FOLLOW_parExpression_in_conditionalBlock1441);
            parExpression74=parExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parExpression.add(parExpression74.getTree());
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:174:18: ( block )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=TRUE && LA30_0<=FALSE)||(LA30_0>=NUM && LA30_0<=CLASS)||(LA30_0>=NEW && LA30_0<=LAMBDA)||(LA30_0>=WHILE && LA30_0<=LOOP)||LA30_0==IF||LA30_0==NOT||LA30_0==LPAR||LA30_0==LSB||LA30_0==LCB||(LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==ID||LA30_0==STR_LITERAL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_conditionalBlock1443);
                    block75=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block75.getTree());

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
            // 175:4: -> ^( STMT_CONDITION_BLOCK parExpression ( block )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:175:7: ^( STMT_CONDITION_BLOCK parExpression ( block )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_CONDITION_BLOCK, "STMT_CONDITION_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_parExpression.nextTree());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:175:44: ( block )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:178:1: parExpression : LPAR expression RPAR -> expression ;
    public final SlippySyntaxParser.parExpression_return parExpression() throws RecognitionException {
        SlippySyntaxParser.parExpression_return retval = new SlippySyntaxParser.parExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR76=null;
        Token RPAR78=null;
        SlippySyntaxParser.expression_return expression77 = null;


        CommonTree LPAR76_tree=null;
        CommonTree RPAR78_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:179:2: ( LPAR expression RPAR -> expression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:179:4: LPAR expression RPAR
            {
            LPAR76=(Token)match(input,LPAR,FOLLOW_LPAR_in_parExpression1469); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR76);

            pushFollow(FOLLOW_expression_in_parExpression1471);
            expression77=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression77.getTree());
            RPAR78=(Token)match(input,RPAR,FOLLOW_RPAR_in_parExpression1473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR78);



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
            // 180:4: -> expression
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:183:1: loopStatement : ( LOOP conditionalBlock DONE -> ^( STMT_LOOP conditionalBlock ) | LOOP LPAR ID COLON expression RPAR ( block )? DONE -> ^( STMT_LOOP ID expression ( block )? ) );
    public final SlippySyntaxParser.loopStatement_return loopStatement() throws RecognitionException {
        SlippySyntaxParser.loopStatement_return retval = new SlippySyntaxParser.loopStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOOP79=null;
        Token DONE81=null;
        Token LOOP82=null;
        Token LPAR83=null;
        Token ID84=null;
        Token COLON85=null;
        Token RPAR87=null;
        Token DONE89=null;
        SlippySyntaxParser.conditionalBlock_return conditionalBlock80 = null;

        SlippySyntaxParser.expression_return expression86 = null;

        SlippySyntaxParser.block_return block88 = null;


        CommonTree LOOP79_tree=null;
        CommonTree DONE81_tree=null;
        CommonTree LOOP82_tree=null;
        CommonTree LPAR83_tree=null;
        CommonTree ID84_tree=null;
        CommonTree COLON85_tree=null;
        CommonTree RPAR87_tree=null;
        CommonTree DONE89_tree=null;
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
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:184:2: ( LOOP conditionalBlock DONE -> ^( STMT_LOOP conditionalBlock ) | LOOP LPAR ID COLON expression RPAR ( block )? DONE -> ^( STMT_LOOP ID expression ( block )? ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LOOP) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAR) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==ID) ) {
                        int LA32_3 = input.LA(4);

                        if ( (LA32_3==COLON) ) {
                            alt32=2;
                        }
                        else if ( ((LA32_3>=OR && LA32_3<=AND)||(LA32_3>=LPAR && LA32_3<=LSB)||(LA32_3>=EQ && LA32_3<=DOT)) ) {
                            alt32=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA32_2>=TRUE && LA32_2<=FALSE)||LA32_2==NUM||LA32_2==NEW||LA32_2==LAMBDA||LA32_2==NOT||LA32_2==LPAR||LA32_2==LSB||LA32_2==LCB||(LA32_2>=PLUS && LA32_2<=MINUS)||LA32_2==STR_LITERAL) ) {
                        alt32=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:184:4: LOOP conditionalBlock DONE
                    {
                    LOOP79=(Token)match(input,LOOP,FOLLOW_LOOP_in_loopStatement1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOOP.add(LOOP79);

                    pushFollow(FOLLOW_conditionalBlock_in_loopStatement1493);
                    conditionalBlock80=conditionalBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalBlock.add(conditionalBlock80.getTree());
                    DONE81=(Token)match(input,DONE,FOLLOW_DONE_in_loopStatement1495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE81);



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
                    // 185:4: -> ^( STMT_LOOP conditionalBlock )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:185:7: ^( STMT_LOOP conditionalBlock )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:186:4: LOOP LPAR ID COLON expression RPAR ( block )? DONE
                    {
                    LOOP82=(Token)match(input,LOOP,FOLLOW_LOOP_in_loopStatement1511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOOP.add(LOOP82);

                    LPAR83=(Token)match(input,LPAR,FOLLOW_LPAR_in_loopStatement1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR83);

                    ID84=(Token)match(input,ID,FOLLOW_ID_in_loopStatement1515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID84);

                    COLON85=(Token)match(input,COLON,FOLLOW_COLON_in_loopStatement1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON85);

                    pushFollow(FOLLOW_expression_in_loopStatement1519);
                    expression86=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());
                    RPAR87=(Token)match(input,RPAR,FOLLOW_RPAR_in_loopStatement1521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR87);

                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:186:39: ( block )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=TRUE && LA31_0<=FALSE)||(LA31_0>=NUM && LA31_0<=CLASS)||(LA31_0>=NEW && LA31_0<=LAMBDA)||(LA31_0>=WHILE && LA31_0<=LOOP)||LA31_0==IF||LA31_0==NOT||LA31_0==LPAR||LA31_0==LSB||LA31_0==LCB||(LA31_0>=PLUS && LA31_0<=MINUS)||LA31_0==ID||LA31_0==STR_LITERAL) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_loopStatement1523);
                            block88=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block88.getTree());

                            }
                            break;

                    }

                    DONE89=(Token)match(input,DONE,FOLLOW_DONE_in_loopStatement1526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE89);



                    // AST REWRITE
                    // elements: ID, block, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:4: -> ^( STMT_LOOP ID expression ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:187:7: ^( STMT_LOOP ID expression ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT_LOOP, "STMT_LOOP"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:187:33: ( block )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:190:1: expressionList : LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_LIST ( expression )* ) ;
    public final SlippySyntaxParser.expressionList_return expressionList() throws RecognitionException {
        SlippySyntaxParser.expressionList_return retval = new SlippySyntaxParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAR90=null;
        Token COMMA92=null;
        Token RPAR94=null;
        SlippySyntaxParser.expression_return expression91 = null;

        SlippySyntaxParser.expression_return expression93 = null;


        CommonTree LPAR90_tree=null;
        CommonTree COMMA92_tree=null;
        CommonTree RPAR94_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:191:2: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_LIST ( expression )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:191:4: LPAR ( expression )? ( COMMA expression )* RPAR
            {
            LPAR90=(Token)match(input,LPAR,FOLLOW_LPAR_in_expressionList1554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR90);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:191:9: ( expression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=TRUE && LA33_0<=FALSE)||LA33_0==NUM||LA33_0==NEW||LA33_0==LAMBDA||LA33_0==NOT||LA33_0==LPAR||LA33_0==LSB||LA33_0==LCB||(LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==ID||LA33_0==STR_LITERAL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionList1556);
                    expression91=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:191:21: ( COMMA expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:191:22: COMMA expression
            	    {
            	    COMMA92=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList1560); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA92);

            	    pushFollow(FOLLOW_expression_in_expressionList1562);
            	    expression93=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            RPAR94=(Token)match(input,RPAR,FOLLOW_RPAR_in_expressionList1566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR94);



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
            // 192:4: -> ^( EXPR_LIST ( expression )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:192:7: ^( EXPR_LIST ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:192:19: ( expression )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:195:1: expression : assignExpression ;
    public final SlippySyntaxParser.expression_return expression() throws RecognitionException {
        SlippySyntaxParser.expression_return retval = new SlippySyntaxParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.assignExpression_return assignExpression95 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:196:2: ( assignExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:196:4: assignExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expression1590);
            assignExpression95=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression95.getTree());

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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:199:1: assignExpression : ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )? ;
    public final SlippySyntaxParser.assignExpression_return assignExpression() throws RecognitionException {
        SlippySyntaxParser.assignExpression_return retval = new SlippySyntaxParser.assignExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ97=null;
        SlippySyntaxParser.conditionalOrExpr_return r = null;

        SlippySyntaxParser.conditionalOrExpr_return conditionalOrExpr96 = null;


        CommonTree EQ97_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_conditionalOrExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionalOrExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:200:2: ( ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )? )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:200:4: ( conditionalOrExpr -> conditionalOrExpr ) ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )?
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:200:4: ( conditionalOrExpr -> conditionalOrExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:200:5: conditionalOrExpr
            {
            pushFollow(FOLLOW_conditionalOrExpr_in_assignExpression1603);
            conditionalOrExpr96=conditionalOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalOrExpr.add(conditionalOrExpr96.getTree());


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
            // 200:23: -> conditionalOrExpr
            {
                adaptor.addChild(root_0, stream_conditionalOrExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:200:45: ( EQ r= conditionalOrExpr -> ^( EXPR_ASSIGN $assignExpression $r) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EQ) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:201:4: EQ r= conditionalOrExpr
                    {
                    EQ97=(Token)match(input,EQ,FOLLOW_EQ_in_assignExpression1615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ97);

                    pushFollow(FOLLOW_conditionalOrExpr_in_assignExpression1619);
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
                    // 202:5: -> ^( EXPR_ASSIGN $assignExpression $r)
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:202:8: ^( EXPR_ASSIGN $assignExpression $r)
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:206:1: conditionalOrExpr : ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )* ;
    public final SlippySyntaxParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        SlippySyntaxParser.conditionalOrExpr_return retval = new SlippySyntaxParser.conditionalOrExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR99=null;
        SlippySyntaxParser.conditionalAndExpr_return r = null;

        SlippySyntaxParser.conditionalAndExpr_return conditionalAndExpr98 = null;


        CommonTree OR99_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_conditionalAndExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionalAndExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:207:2: ( ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:207:4: ( conditionalAndExpr -> conditionalAndExpr ) ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:207:4: ( conditionalAndExpr -> conditionalAndExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:207:5: conditionalAndExpr
            {
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr1654);
            conditionalAndExpr98=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditionalAndExpr.add(conditionalAndExpr98.getTree());


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
            // 207:24: -> conditionalAndExpr
            {
                adaptor.addChild(root_0, stream_conditionalAndExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:207:47: ( OR r= conditionalAndExpr -> ^( EXPR_OR $conditionalOrExpr $r) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==OR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:208:4: OR r= conditionalAndExpr
            	    {
            	    OR99=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpr1666); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OR.add(OR99);

            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr1670);
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
            	    // 209:5: -> ^( EXPR_OR $conditionalOrExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:209:8: ^( EXPR_OR $conditionalOrExpr $r)
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
            	    break loop36;
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:213:1: conditionalAndExpr : ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )* ;
    public final SlippySyntaxParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        SlippySyntaxParser.conditionalAndExpr_return retval = new SlippySyntaxParser.conditionalAndExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND101=null;
        SlippySyntaxParser.equalityExpression_return r = null;

        SlippySyntaxParser.equalityExpression_return equalityExpression100 = null;


        CommonTree AND101_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_equalityExpression=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:214:2: ( ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:214:4: ( equalityExpression -> equalityExpression ) ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:214:4: ( equalityExpression -> equalityExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:214:5: equalityExpression
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpr1703);
            equalityExpression100=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equalityExpression.add(equalityExpression100.getTree());


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
            // 214:24: -> equalityExpression
            {
                adaptor.addChild(root_0, stream_equalityExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:214:47: ( AND r= equalityExpression -> ^( EXPR_AND $conditionalAndExpr $r) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AND) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:215:7: AND r= equalityExpression
            	    {
            	    AND101=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpr1719); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_AND.add(AND101);

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpr1723);
            	    r=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityExpression.add(r.getTree());


            	    // AST REWRITE
            	    // elements: conditionalAndExpr, r
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
            	    // 216:8: -> ^( EXPR_AND $conditionalAndExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:216:11: ^( EXPR_AND $conditionalAndExpr $r)
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
    // $ANTLR end "conditionalAndExpr"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:220:1: equalityExpression : ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )* ;
    public final SlippySyntaxParser.equalityExpression_return equalityExpression() throws RecognitionException {
        SlippySyntaxParser.equalityExpression_return retval = new SlippySyntaxParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQEQ103=null;
        Token NEQ104=null;
        SlippySyntaxParser.gtltExpression_return r = null;

        SlippySyntaxParser.gtltExpression_return gtltExpression102 = null;


        CommonTree EQEQ103_tree=null;
        CommonTree NEQ104_tree=null;
        RewriteRuleTokenStream stream_EQEQ=new RewriteRuleTokenStream(adaptor,"token EQEQ");
        RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
        RewriteRuleSubtreeStream stream_gtltExpression=new RewriteRuleSubtreeStream(adaptor,"rule gtltExpression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:221:2: ( ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:221:4: ( gtltExpression -> gtltExpression ) ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:221:4: ( gtltExpression -> gtltExpression )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:221:5: gtltExpression
            {
            pushFollow(FOLLOW_gtltExpression_in_equalityExpression1759);
            gtltExpression102=gtltExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_gtltExpression.add(gtltExpression102.getTree());


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
            // 221:20: -> gtltExpression
            {
                adaptor.addChild(root_0, stream_gtltExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:221:39: ( EQEQ r= gtltExpression -> ^( EXPR_EQ $equalityExpression $r) | NEQ r= gtltExpression -> ^( EXPR_NEQ $equalityExpression $r) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==EQEQ) ) {
                    alt38=1;
                }
                else if ( (LA38_0==NEQ) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:222:7: EQEQ r= gtltExpression
            	    {
            	    EQEQ103=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_equalityExpression1774); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQEQ.add(EQEQ103);

            	    pushFollow(FOLLOW_gtltExpression_in_equalityExpression1778);
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
            	    // 223:8: -> ^( EXPR_EQ $equalityExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:223:11: ^( EXPR_EQ $equalityExpression $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:224:7: NEQ r= gtltExpression
            	    {
            	    NEQ104=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityExpression1805); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEQ.add(NEQ104);

            	    pushFollow(FOLLOW_gtltExpression_in_equalityExpression1809);
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
            	    // 225:5: -> ^( EXPR_NEQ $equalityExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:225:8: ^( EXPR_NEQ $equalityExpression $r)
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
    // $ANTLR end "equalityExpression"

    public static class gtltExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gtltExpression"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:229:1: gtltExpression : ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )* ;
    public final SlippySyntaxParser.gtltExpression_return gtltExpression() throws RecognitionException {
        SlippySyntaxParser.gtltExpression_return retval = new SlippySyntaxParser.gtltExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LT106=null;
        Token LTEQ107=null;
        Token GT108=null;
        Token GTEQ109=null;
        SlippySyntaxParser.additionExpr_return r = null;

        SlippySyntaxParser.additionExpr_return additionExpr105 = null;


        CommonTree LT106_tree=null;
        CommonTree LTEQ107_tree=null;
        CommonTree GT108_tree=null;
        CommonTree GTEQ109_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
        RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
        RewriteRuleSubtreeStream stream_additionExpr=new RewriteRuleSubtreeStream(adaptor,"rule additionExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:230:2: ( ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:230:4: ( additionExpr -> additionExpr ) ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:230:4: ( additionExpr -> additionExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:230:5: additionExpr
            {
            pushFollow(FOLLOW_additionExpr_in_gtltExpression1842);
            additionExpr105=additionExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additionExpr.add(additionExpr105.getTree());


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
            // 230:18: -> additionExpr
            {
                adaptor.addChild(root_0, stream_additionExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:230:35: ( LT r= additionExpr -> ^( EXPR_LT $gtltExpression $r) | LTEQ r= additionExpr -> ^( EXPR_LTEQ $gtltExpression $r) | GT r= additionExpr -> ^( EXPR_GT $gtltExpression $r) | GTEQ r= additionExpr -> ^( EXPR_GTEQ $gtltExpression $r) )*
            loop39:
            do {
                int alt39=5;
                switch ( input.LA(1) ) {
                case LT:
                    {
                    alt39=1;
                    }
                    break;
                case LTEQ:
                    {
                    alt39=2;
                    }
                    break;
                case GT:
                    {
                    alt39=3;
                    }
                    break;
                case GTEQ:
                    {
                    alt39=4;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:231:7: LT r= additionExpr
            	    {
            	    LT106=(Token)match(input,LT,FOLLOW_LT_in_gtltExpression1857); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT106);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1862);
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
            	    // 232:8: -> ^( EXPR_LT $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:232:11: ^( EXPR_LT $gtltExpression $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:233:7: LTEQ r= additionExpr
            	    {
            	    LTEQ107=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_gtltExpression1889); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LTEQ.add(LTEQ107);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1893);
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
            	    // 234:5: -> ^( EXPR_LTEQ $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:234:8: ^( EXPR_LTEQ $gtltExpression $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:235:7: GT r= additionExpr
            	    {
            	    GT108=(Token)match(input,GT,FOLLOW_GT_in_gtltExpression1917); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_GT.add(GT108);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1922);
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
            	    // 236:5: -> ^( EXPR_GT $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:236:8: ^( EXPR_GT $gtltExpression $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:237:7: GTEQ r= additionExpr
            	    {
            	    GTEQ109=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_gtltExpression1946); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_GTEQ.add(GTEQ109);

            	    pushFollow(FOLLOW_additionExpr_in_gtltExpression1950);
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
            	    // 238:5: -> ^( EXPR_GTEQ $gtltExpression $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:238:8: ^( EXPR_GTEQ $gtltExpression $r)
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
    // $ANTLR end "gtltExpression"

    public static class additionExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additionExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:242:1: additionExpr : ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )* ;
    public final SlippySyntaxParser.additionExpr_return additionExpr() throws RecognitionException {
        SlippySyntaxParser.additionExpr_return retval = new SlippySyntaxParser.additionExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS111=null;
        Token MINUS112=null;
        SlippySyntaxParser.multExpr_return r = null;

        SlippySyntaxParser.multExpr_return multExpr110 = null;


        CommonTree PLUS111_tree=null;
        CommonTree MINUS112_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:243:2: ( ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:243:4: ( multExpr -> multExpr ) ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:243:4: ( multExpr -> multExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:243:5: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_additionExpr1983);
            multExpr110=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multExpr.add(multExpr110.getTree());


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
            // 243:14: -> multExpr
            {
                adaptor.addChild(root_0, stream_multExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:243:27: ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*
            loop40:
            do {
                int alt40=3;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:244:8: PLUS r= multExpr
            	    {
            	    PLUS111=(Token)match(input,PLUS,FOLLOW_PLUS_in_additionExpr1999); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PLUS.add(PLUS111);

            	    pushFollow(FOLLOW_multExpr_in_additionExpr2003);
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
            	    // 245:9: -> ^( EXPR_ADD $additionExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:245:12: ^( EXPR_ADD $additionExpr $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:246:8: MINUS r= multExpr
            	    {
            	    MINUS112=(Token)match(input,MINUS,FOLLOW_MINUS_in_additionExpr2032); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MINUS.add(MINUS112);

            	    pushFollow(FOLLOW_multExpr_in_additionExpr2036);
            	    r=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multExpr.add(r.getTree());


            	    // AST REWRITE
            	    // elements: r, additionExpr
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
            	    // 247:6: -> ^( EXPR_MINUS $additionExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:247:9: ^( EXPR_MINUS $additionExpr $r)
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
    // $ANTLR end "additionExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:251:1: multExpr : ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )* ;
    public final SlippySyntaxParser.multExpr_return multExpr() throws RecognitionException {
        SlippySyntaxParser.multExpr_return retval = new SlippySyntaxParser.multExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASTERISK114=null;
        Token FORWARD_SLASH115=null;
        Token PERCENT116=null;
        SlippySyntaxParser.unaryExpr_return r = null;

        SlippySyntaxParser.unaryExpr_return unaryExpr113 = null;


        CommonTree ASTERISK114_tree=null;
        CommonTree FORWARD_SLASH115_tree=null;
        CommonTree PERCENT116_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_FORWARD_SLASH=new RewriteRuleTokenStream(adaptor,"token FORWARD_SLASH");
        RewriteRuleTokenStream stream_PERCENT=new RewriteRuleTokenStream(adaptor,"token PERCENT");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:252:2: ( ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:252:4: ( unaryExpr -> unaryExpr ) ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:252:4: ( unaryExpr -> unaryExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:252:5: unaryExpr
            {
            pushFollow(FOLLOW_unaryExpr_in_multExpr2070);
            unaryExpr113=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr113.getTree());


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
            // 252:15: -> unaryExpr
            {
                adaptor.addChild(root_0, stream_unaryExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:252:29: ( ASTERISK r= unaryExpr -> ^( EXPR_MULT $multExpr $r) | FORWARD_SLASH r= unaryExpr -> ^( EXPR_DIV $multExpr $r) | PERCENT r= unaryExpr -> ^( EXPR_MODULO $multExpr $r) )*
            loop41:
            do {
                int alt41=4;
                switch ( input.LA(1) ) {
                case ASTERISK:
                    {
                    alt41=1;
                    }
                    break;
                case FORWARD_SLASH:
                    {
                    alt41=2;
                    }
                    break;
                case PERCENT:
                    {
                    alt41=3;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:253:7: ASTERISK r= unaryExpr
            	    {
            	    ASTERISK114=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_multExpr2085); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK114);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2089);
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
            	    // 254:8: -> ^( EXPR_MULT $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:254:11: ^( EXPR_MULT $multExpr $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:255:7: FORWARD_SLASH r= unaryExpr
            	    {
            	    FORWARD_SLASH115=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_multExpr2116); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_FORWARD_SLASH.add(FORWARD_SLASH115);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2120);
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
            	    // 256:5: -> ^( EXPR_DIV $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:256:8: ^( EXPR_DIV $multExpr $r)
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:257:7: PERCENT r= unaryExpr
            	    {
            	    PERCENT116=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2144); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERCENT.add(PERCENT116);

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr2148);
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
            	    // 258:5: -> ^( EXPR_MODULO $multExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:258:8: ^( EXPR_MODULO $multExpr $r)
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
    // $ANTLR end "multExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:262:1: unaryExpr : ( MINUS unaryExpr -> ^( EXPR_UNARY_NEG unaryExpr ) | PLUS unaryExpr -> ^( EXPR_UNARY_POS unaryExpr ) | NOT unaryExpr -> ^( EXPR_UNARY_NOT unaryExpr ) | dotExpr );
    public final SlippySyntaxParser.unaryExpr_return unaryExpr() throws RecognitionException {
        SlippySyntaxParser.unaryExpr_return retval = new SlippySyntaxParser.unaryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS117=null;
        Token PLUS119=null;
        Token NOT121=null;
        SlippySyntaxParser.unaryExpr_return unaryExpr118 = null;

        SlippySyntaxParser.unaryExpr_return unaryExpr120 = null;

        SlippySyntaxParser.unaryExpr_return unaryExpr122 = null;

        SlippySyntaxParser.dotExpr_return dotExpr123 = null;


        CommonTree MINUS117_tree=null;
        CommonTree PLUS119_tree=null;
        CommonTree NOT121_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:263:2: ( MINUS unaryExpr -> ^( EXPR_UNARY_NEG unaryExpr ) | PLUS unaryExpr -> ^( EXPR_UNARY_POS unaryExpr ) | NOT unaryExpr -> ^( EXPR_UNARY_NOT unaryExpr ) | dotExpr )
            int alt42=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt42=1;
                }
                break;
            case PLUS:
                {
                alt42=2;
                }
                break;
            case NOT:
                {
                alt42=3;
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
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:263:4: MINUS unaryExpr
                    {
                    MINUS117=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpr2181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS117);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2183);
                    unaryExpr118=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr118.getTree());


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
                    // 264:4: -> ^( EXPR_UNARY_NEG unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:264:7: ^( EXPR_UNARY_NEG unaryExpr )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:265:4: PLUS unaryExpr
                    {
                    PLUS119=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpr2199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS119);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2201);
                    unaryExpr120=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr120.getTree());


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
                    // 266:4: -> ^( EXPR_UNARY_POS unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:266:7: ^( EXPR_UNARY_POS unaryExpr )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:267:4: NOT unaryExpr
                    {
                    NOT121=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpr2217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT121);

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr2219);
                    unaryExpr122=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr122.getTree());


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
                    // 268:4: -> ^( EXPR_UNARY_NOT unaryExpr )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:268:7: ^( EXPR_UNARY_NOT unaryExpr )
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:269:4: dotExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dotExpr_in_unaryExpr2235);
                    dotExpr123=dotExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotExpr123.getTree());

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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:272:1: dotExpr : ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )* ;
    public final SlippySyntaxParser.dotExpr_return dotExpr() throws RecognitionException {
        SlippySyntaxParser.dotExpr_return retval = new SlippySyntaxParser.dotExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT125=null;
        SlippySyntaxParser.postfixedExpr_return r = null;

        SlippySyntaxParser.primaryExpr_return primaryExpr124 = null;


        CommonTree DOT125_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_primaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpr");
        RewriteRuleSubtreeStream stream_postfixedExpr=new RewriteRuleSubtreeStream(adaptor,"rule postfixedExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:273:2: ( ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:273:4: ( primaryExpr -> primaryExpr ) ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:273:4: ( primaryExpr -> primaryExpr )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:273:5: primaryExpr
            {
            pushFollow(FOLLOW_primaryExpr_in_dotExpr2247);
            primaryExpr124=primaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primaryExpr.add(primaryExpr124.getTree());


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
            // 273:17: -> primaryExpr
            {
                adaptor.addChild(root_0, stream_primaryExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:273:33: ( DOT r= postfixedExpr -> ^( EXPR_MEMBER $dotExpr $r) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==DOT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:274:4: DOT r= postfixedExpr
            	    {
            	    DOT125=(Token)match(input,DOT,FOLLOW_DOT_in_dotExpr2259); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT125);

            	    pushFollow(FOLLOW_postfixedExpr_in_dotExpr2263);
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
            	    // 275:5: -> ^( EXPR_MEMBER $dotExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:275:8: ^( EXPR_MEMBER $dotExpr $r)
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
            	    break loop43;
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:279:1: primaryExpr : ( parExpression | literal | newExpression | postfixedExpr | lambdaExpr | arrayExpr | mapExpr );
    public final SlippySyntaxParser.primaryExpr_return primaryExpr() throws RecognitionException {
        SlippySyntaxParser.primaryExpr_return retval = new SlippySyntaxParser.primaryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SlippySyntaxParser.parExpression_return parExpression126 = null;

        SlippySyntaxParser.literal_return literal127 = null;

        SlippySyntaxParser.newExpression_return newExpression128 = null;

        SlippySyntaxParser.postfixedExpr_return postfixedExpr129 = null;

        SlippySyntaxParser.lambdaExpr_return lambdaExpr130 = null;

        SlippySyntaxParser.arrayExpr_return arrayExpr131 = null;

        SlippySyntaxParser.mapExpr_return mapExpr132 = null;



        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:280:2: ( parExpression | literal | newExpression | postfixedExpr | lambdaExpr | arrayExpr | mapExpr )
            int alt44=7;
            switch ( input.LA(1) ) {
            case LPAR:
                {
                alt44=1;
                }
                break;
            case TRUE:
            case FALSE:
            case NUM:
            case STR_LITERAL:
                {
                alt44=2;
                }
                break;
            case NEW:
                {
                alt44=3;
                }
                break;
            case ID:
                {
                alt44=4;
                }
                break;
            case LAMBDA:
                {
                alt44=5;
                }
                break;
            case LCB:
                {
                int LA44_6 = input.LA(2);

                if ( (synpred59_SlippySyntaxParser()) ) {
                    alt44=5;
                }
                else if ( (true) ) {
                    alt44=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case LSB:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:280:4: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primaryExpr2298);
                    parExpression126=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression126.getTree());

                    }
                    break;
                case 2 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:281:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpr2303);
                    literal127=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal127.getTree());

                    }
                    break;
                case 3 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:282:4: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_primaryExpr2308);
                    newExpression128=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression128.getTree());

                    }
                    break;
                case 4 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:283:4: postfixedExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixedExpr_in_primaryExpr2313);
                    postfixedExpr129=postfixedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixedExpr129.getTree());

                    }
                    break;
                case 5 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:284:4: lambdaExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambdaExpr_in_primaryExpr2318);
                    lambdaExpr130=lambdaExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpr130.getTree());

                    }
                    break;
                case 6 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:285:4: arrayExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayExpr_in_primaryExpr2323);
                    arrayExpr131=arrayExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayExpr131.getTree());

                    }
                    break;
                case 7 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:286:4: mapExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mapExpr_in_primaryExpr2328);
                    mapExpr132=mapExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapExpr132.getTree());

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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:289:1: postfixedExpr : ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )* ;
    public final SlippySyntaxParser.postfixedExpr_return postfixedExpr() throws RecognitionException {
        SlippySyntaxParser.postfixedExpr_return retval = new SlippySyntaxParser.postfixedExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID133=null;
        Token LPAR134=null;
        Token COMMA136=null;
        Token RPAR138=null;
        Token LSB139=null;
        Token RSB140=null;
        SlippySyntaxParser.expression_return r = null;

        SlippySyntaxParser.expression_return expression135 = null;

        SlippySyntaxParser.expression_return expression137 = null;


        CommonTree ID133_tree=null;
        CommonTree LPAR134_tree=null;
        CommonTree COMMA136_tree=null;
        CommonTree RPAR138_tree=null;
        CommonTree LSB139_tree=null;
        CommonTree RSB140_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_RSB=new RewriteRuleTokenStream(adaptor,"token RSB");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_LSB=new RewriteRuleTokenStream(adaptor,"token LSB");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:290:2: ( ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )* )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:290:4: ( ID -> ID ) ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*
            {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:290:4: ( ID -> ID )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:290:5: ID
            {
            ID133=(Token)match(input,ID,FOLLOW_ID_in_postfixedExpr2340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID133);



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
            // 290:8: -> ID
            {
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:290:15: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*
            loop48:
            do {
                int alt48=3;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:4: LPAR ( expression )? ( COMMA expression )* RPAR
            	    {
            	    LPAR134=(Token)match(input,LPAR,FOLLOW_LPAR_in_postfixedExpr2352); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAR.add(LPAR134);

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:9: ( expression )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( ((LA45_0>=TRUE && LA45_0<=FALSE)||LA45_0==NUM||LA45_0==NEW||LA45_0==LAMBDA||LA45_0==NOT||LA45_0==LPAR||LA45_0==LSB||LA45_0==LCB||(LA45_0>=PLUS && LA45_0<=MINUS)||LA45_0==ID||LA45_0==STR_LITERAL) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_postfixedExpr2354);
            	            expression135=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(expression135.getTree());

            	            }
            	            break;

            	    }

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:21: ( COMMA expression )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==COMMA) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:22: COMMA expression
            	    	    {
            	    	    COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfixedExpr2358); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA136);

            	    	    pushFollow(FOLLOW_expression_in_postfixedExpr2360);
            	    	    expression137=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_expression.add(expression137.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    RPAR138=(Token)match(input,RPAR,FOLLOW_RPAR_in_postfixedExpr2364); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAR.add(RPAR138);



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
            	    // 292:5: -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) )
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:292:8: ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_FUNC_CALL, "EXPR_FUNC_CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:292:40: ^( EXPR_LIST ( expression )* )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST"), root_2);

            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:292:52: ( expression )*
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
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:293:5: LSB (r= expression )? RSB
            	    {
            	    LSB139=(Token)match(input,LSB,FOLLOW_LSB_in_postfixedExpr2390); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LSB.add(LSB139);

            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:293:10: (r= expression )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( ((LA47_0>=TRUE && LA47_0<=FALSE)||LA47_0==NUM||LA47_0==NEW||LA47_0==LAMBDA||LA47_0==NOT||LA47_0==LPAR||LA47_0==LSB||LA47_0==LCB||(LA47_0>=PLUS && LA47_0<=MINUS)||LA47_0==ID||LA47_0==STR_LITERAL) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: r= expression
            	            {
            	            pushFollow(FOLLOW_expression_in_postfixedExpr2394);
            	            r=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(r.getTree());

            	            }
            	            break;

            	    }

            	    RSB140=(Token)match(input,RSB,FOLLOW_RSB_in_postfixedExpr2397); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RSB.add(RSB140);



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
            	    // 294:5: -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r)
            	    {
            	        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:294:8: ^( EXPR_ARRAY_INDEX $postfixedExpr $r)
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
            	    break loop48;
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:298:1: lambdaExpr : ( LAMBDA formalParameters ( block )? DONE -> ^( EXPR_LAMBDA formalParameters ( block )? ) | LCB formalParameters ( block )? RCB -> ^( EXPR_LAMBDA formalParameters ( block )? ) );
    public final SlippySyntaxParser.lambdaExpr_return lambdaExpr() throws RecognitionException {
        SlippySyntaxParser.lambdaExpr_return retval = new SlippySyntaxParser.lambdaExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAMBDA141=null;
        Token DONE144=null;
        Token LCB145=null;
        Token RCB148=null;
        SlippySyntaxParser.formalParameters_return formalParameters142 = null;

        SlippySyntaxParser.block_return block143 = null;

        SlippySyntaxParser.formalParameters_return formalParameters146 = null;

        SlippySyntaxParser.block_return block147 = null;


        CommonTree LAMBDA141_tree=null;
        CommonTree DONE144_tree=null;
        CommonTree LCB145_tree=null;
        CommonTree RCB148_tree=null;
        RewriteRuleTokenStream stream_DONE=new RewriteRuleTokenStream(adaptor,"token DONE");
        RewriteRuleTokenStream stream_LCB=new RewriteRuleTokenStream(adaptor,"token LCB");
        RewriteRuleTokenStream stream_RCB=new RewriteRuleTokenStream(adaptor,"token RCB");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:299:2: ( LAMBDA formalParameters ( block )? DONE -> ^( EXPR_LAMBDA formalParameters ( block )? ) | LCB formalParameters ( block )? RCB -> ^( EXPR_LAMBDA formalParameters ( block )? ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==LAMBDA) ) {
                alt51=1;
            }
            else if ( (LA51_0==LCB) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:299:4: LAMBDA formalParameters ( block )? DONE
                    {
                    LAMBDA141=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpr2431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA141);

                    pushFollow(FOLLOW_formalParameters_in_lambdaExpr2433);
                    formalParameters142=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters142.getTree());
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:299:28: ( block )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=TRUE && LA49_0<=FALSE)||(LA49_0>=NUM && LA49_0<=CLASS)||(LA49_0>=NEW && LA49_0<=LAMBDA)||(LA49_0>=WHILE && LA49_0<=LOOP)||LA49_0==IF||LA49_0==NOT||LA49_0==LPAR||LA49_0==LSB||LA49_0==LCB||(LA49_0>=PLUS && LA49_0<=MINUS)||LA49_0==ID||LA49_0==STR_LITERAL) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_lambdaExpr2435);
                            block143=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block143.getTree());

                            }
                            break;

                    }

                    DONE144=(Token)match(input,DONE,FOLLOW_DONE_in_lambdaExpr2438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DONE.add(DONE144);



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
                    // 300:4: -> ^( EXPR_LAMBDA formalParameters ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:300:7: ^( EXPR_LAMBDA formalParameters ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LAMBDA, "EXPR_LAMBDA"), root_1);

                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:300:38: ( block )?
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
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:301:4: LCB formalParameters ( block )? RCB
                    {
                    LCB145=(Token)match(input,LCB,FOLLOW_LCB_in_lambdaExpr2457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LCB.add(LCB145);

                    pushFollow(FOLLOW_formalParameters_in_lambdaExpr2459);
                    formalParameters146=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters146.getTree());
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:301:25: ( block )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=TRUE && LA50_0<=FALSE)||(LA50_0>=NUM && LA50_0<=CLASS)||(LA50_0>=NEW && LA50_0<=LAMBDA)||(LA50_0>=WHILE && LA50_0<=LOOP)||LA50_0==IF||LA50_0==NOT||LA50_0==LPAR||LA50_0==LSB||LA50_0==LCB||(LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==ID||LA50_0==STR_LITERAL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_lambdaExpr2461);
                            block147=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_block.add(block147.getTree());

                            }
                            break;

                    }

                    RCB148=(Token)match(input,RCB,FOLLOW_RCB_in_lambdaExpr2464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RCB.add(RCB148);



                    // AST REWRITE
                    // elements: formalParameters, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 302:4: -> ^( EXPR_LAMBDA formalParameters ( block )? )
                    {
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:302:7: ^( EXPR_LAMBDA formalParameters ( block )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_LAMBDA, "EXPR_LAMBDA"), root_1);

                        adaptor.addChild(root_1, stream_formalParameters.nextTree());
                        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:302:38: ( block )?
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:305:1: arrayExpr : LSB ( expression )? ( COMMA expression )* RSB -> ^( EXPR_ARRAY_INIT ( expression )* ) ;
    public final SlippySyntaxParser.arrayExpr_return arrayExpr() throws RecognitionException {
        SlippySyntaxParser.arrayExpr_return retval = new SlippySyntaxParser.arrayExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LSB149=null;
        Token COMMA151=null;
        Token RSB153=null;
        SlippySyntaxParser.expression_return expression150 = null;

        SlippySyntaxParser.expression_return expression152 = null;


        CommonTree LSB149_tree=null;
        CommonTree COMMA151_tree=null;
        CommonTree RSB153_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RSB=new RewriteRuleTokenStream(adaptor,"token RSB");
        RewriteRuleTokenStream stream_LSB=new RewriteRuleTokenStream(adaptor,"token LSB");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:306:2: ( LSB ( expression )? ( COMMA expression )* RSB -> ^( EXPR_ARRAY_INIT ( expression )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:306:4: LSB ( expression )? ( COMMA expression )* RSB
            {
            LSB149=(Token)match(input,LSB,FOLLOW_LSB_in_arrayExpr2489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSB.add(LSB149);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:306:8: ( expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=TRUE && LA52_0<=FALSE)||LA52_0==NUM||LA52_0==NEW||LA52_0==LAMBDA||LA52_0==NOT||LA52_0==LPAR||LA52_0==LSB||LA52_0==LCB||(LA52_0>=PLUS && LA52_0<=MINUS)||LA52_0==ID||LA52_0==STR_LITERAL) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayExpr2491);
                    expression150=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression150.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:306:20: ( COMMA expression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:306:21: COMMA expression
            	    {
            	    COMMA151=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayExpr2495); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA151);

            	    pushFollow(FOLLOW_expression_in_arrayExpr2497);
            	    expression152=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression152.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            RSB153=(Token)match(input,RSB,FOLLOW_RSB_in_arrayExpr2501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSB.add(RSB153);



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
            // 307:4: -> ^( EXPR_ARRAY_INIT ( expression )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:307:7: ^( EXPR_ARRAY_INIT ( expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_ARRAY_INIT, "EXPR_ARRAY_INIT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:307:25: ( expression )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:1: mapExpr : LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB -> ^( EXPR_MAP_INIT ( mapEntryExpr )* ) ;
    public final SlippySyntaxParser.mapExpr_return mapExpr() throws RecognitionException {
        SlippySyntaxParser.mapExpr_return retval = new SlippySyntaxParser.mapExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LCB154=null;
        Token COMMA156=null;
        Token RCB158=null;
        SlippySyntaxParser.mapEntryExpr_return mapEntryExpr155 = null;

        SlippySyntaxParser.mapEntryExpr_return mapEntryExpr157 = null;


        CommonTree LCB154_tree=null;
        CommonTree COMMA156_tree=null;
        CommonTree RCB158_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LCB=new RewriteRuleTokenStream(adaptor,"token LCB");
        RewriteRuleTokenStream stream_RCB=new RewriteRuleTokenStream(adaptor,"token RCB");
        RewriteRuleSubtreeStream stream_mapEntryExpr=new RewriteRuleSubtreeStream(adaptor,"rule mapEntryExpr");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:9: ( LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB -> ^( EXPR_MAP_INIT ( mapEntryExpr )* ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:11: LCB ( mapEntryExpr )? ( COMMA mapEntryExpr )* RCB
            {
            LCB154=(Token)match(input,LCB,FOLLOW_LCB_in_mapExpr2523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCB.add(LCB154);

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:15: ( mapEntryExpr )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=TRUE && LA54_0<=FALSE)||LA54_0==NUM||LA54_0==NEW||LA54_0==LAMBDA||LA54_0==NOT||LA54_0==LPAR||LA54_0==LSB||LA54_0==LCB||(LA54_0>=PLUS && LA54_0<=MINUS)||LA54_0==ID||LA54_0==STR_LITERAL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: mapEntryExpr
                    {
                    pushFollow(FOLLOW_mapEntryExpr_in_mapExpr2525);
                    mapEntryExpr155=mapEntryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapEntryExpr.add(mapEntryExpr155.getTree());

                    }
                    break;

            }

            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:29: ( COMMA mapEntryExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:310:30: COMMA mapEntryExpr
            	    {
            	    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_mapExpr2529); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA156);

            	    pushFollow(FOLLOW_mapEntryExpr_in_mapExpr2531);
            	    mapEntryExpr157=mapEntryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mapEntryExpr.add(mapEntryExpr157.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            RCB158=(Token)match(input,RCB,FOLLOW_RCB_in_mapExpr2535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCB.add(RCB158);



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
            // 311:4: -> ^( EXPR_MAP_INIT ( mapEntryExpr )* )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:311:7: ^( EXPR_MAP_INIT ( mapEntryExpr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_MAP_INIT, "EXPR_MAP_INIT"), root_1);

                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:311:23: ( mapEntryExpr )*
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:314:1: mapEntryExpr : expression COLON expression -> ^( EXPR_MAP_ELEMENT ( expression )+ ) ;
    public final SlippySyntaxParser.mapEntryExpr_return mapEntryExpr() throws RecognitionException {
        SlippySyntaxParser.mapEntryExpr_return retval = new SlippySyntaxParser.mapEntryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON160=null;
        SlippySyntaxParser.expression_return expression159 = null;

        SlippySyntaxParser.expression_return expression161 = null;


        CommonTree COLON160_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:315:2: ( expression COLON expression -> ^( EXPR_MAP_ELEMENT ( expression )+ ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:315:4: expression COLON expression
            {
            pushFollow(FOLLOW_expression_in_mapEntryExpr2558);
            expression159=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression159.getTree());
            COLON160=(Token)match(input,COLON,FOLLOW_COLON_in_mapEntryExpr2560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON160);

            pushFollow(FOLLOW_expression_in_mapEntryExpr2562);
            expression161=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression161.getTree());


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
            // 316:4: -> ^( EXPR_MAP_ELEMENT ( expression )+ )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:316:7: ^( EXPR_MAP_ELEMENT ( expression )+ )
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:319:1: literal : ( NUM | STR_LITERAL | TRUE | FALSE );
    public final SlippySyntaxParser.literal_return literal() throws RecognitionException {
        SlippySyntaxParser.literal_return retval = new SlippySyntaxParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set162=null;

        CommonTree set162_tree=null;

        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:320:2: ( NUM | STR_LITERAL | TRUE | FALSE )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set162=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE)||input.LA(1)==NUM||input.LA(1)==STR_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set162));
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
    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:326:1: newExpression : NEW ID expressionList -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? ) ;
    public final SlippySyntaxParser.newExpression_return newExpression() throws RecognitionException {
        SlippySyntaxParser.newExpression_return retval = new SlippySyntaxParser.newExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEW163=null;
        Token ID164=null;
        SlippySyntaxParser.expressionList_return expressionList165 = null;


        CommonTree NEW163_tree=null;
        CommonTree ID164_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:327:2: ( NEW ID expressionList -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? ) )
            // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:327:4: NEW ID expressionList
            {
            NEW163=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression2623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW163);

            ID164=(Token)match(input,ID,FOLLOW_ID_in_newExpression2625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID164);

            pushFollow(FOLLOW_expressionList_in_newExpression2627);
            expressionList165=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList165.getTree());


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
            // 328:4: -> ^( EXPR_CONSTRUCTOR ID ( expressionList )? )
            {
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:328:7: ^( EXPR_CONSTRUCTOR ID ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR_CONSTRUCTOR, "EXPR_CONSTRUCTOR"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:328:29: ( expressionList )?
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

    // $ANTLR start synpred2_SlippySyntaxParser
    public final void synpred2_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:12: ( IMPORT classID )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:67:12: IMPORT classID
        {
        match(input,IMPORT,FOLLOW_IMPORT_in_synpred2_SlippySyntaxParser789); if (state.failed) return ;
        pushFollow(FOLLOW_classID_in_synpred2_SlippySyntaxParser791);
        classID();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_SlippySyntaxParser

    // $ANTLR start synpred13_SlippySyntaxParser
    public final void synpred13_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:12: ( ID DOT )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:118:12: ID DOT
        {
        match(input,ID,FOLLOW_ID_in_synpred13_SlippySyntaxParser1084); if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred13_SlippySyntaxParser1086); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_SlippySyntaxParser

    // $ANTLR start synpred15_SlippySyntaxParser
    public final void synpred15_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:10: ( classID )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:123:10: classID
        {
        pushFollow(FOLLOW_classID_in_synpred15_SlippySyntaxParser1121);
        classID();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_SlippySyntaxParser

    // $ANTLR start synpred24_SlippySyntaxParser
    public final void synpred24_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:4: ( ( annotation )* fieldDeclaration )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:4: ( annotation )* fieldDeclaration
        {
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:147:4: ( annotation )*
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AT) ) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred24_SlippySyntaxParser1262);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop57;
            }
        } while (true);

        pushFollow(FOLLOW_fieldDeclaration_in_synpred24_SlippySyntaxParser1265);
        fieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_SlippySyntaxParser

    // $ANTLR start synpred26_SlippySyntaxParser
    public final void synpred26_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:149:4: ( ( annotation )* functionDefStatement )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:149:4: ( annotation )* functionDefStatement
        {
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:149:4: ( annotation )*
        loop58:
        do {
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AT) ) {
                alt58=1;
            }


            switch (alt58) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: annotation
        	    {
        	    pushFollow(FOLLOW_annotation_in_synpred26_SlippySyntaxParser1284);
        	    annotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop58;
            }
        } while (true);

        pushFollow(FOLLOW_functionDefStatement_in_synpred26_SlippySyntaxParser1287);
        functionDefStatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_SlippySyntaxParser

    // $ANTLR start synpred29_SlippySyntaxParser
    public final void synpred29_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:167:4: ( ELSE IF conditionalBlock )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:167:4: ELSE IF conditionalBlock
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred29_SlippySyntaxParser1395); if (state.failed) return ;
        match(input,IF,FOLLOW_IF_in_synpred29_SlippySyntaxParser1397); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalBlock_in_synpred29_SlippySyntaxParser1399);
        conditionalBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_SlippySyntaxParser

    // $ANTLR start synpred46_SlippySyntaxParser
    public final void synpred46_SlippySyntaxParser_fragment() throws RecognitionException {   
        SlippySyntaxParser.multExpr_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:244:8: ( PLUS r= multExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:244:8: PLUS r= multExpr
        {
        match(input,PLUS,FOLLOW_PLUS_in_synpred46_SlippySyntaxParser1999); if (state.failed) return ;
        pushFollow(FOLLOW_multExpr_in_synpred46_SlippySyntaxParser2003);
        r=multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_SlippySyntaxParser

    // $ANTLR start synpred47_SlippySyntaxParser
    public final void synpred47_SlippySyntaxParser_fragment() throws RecognitionException {   
        SlippySyntaxParser.multExpr_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:246:8: ( MINUS r= multExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:246:8: MINUS r= multExpr
        {
        match(input,MINUS,FOLLOW_MINUS_in_synpred47_SlippySyntaxParser2032); if (state.failed) return ;
        pushFollow(FOLLOW_multExpr_in_synpred47_SlippySyntaxParser2036);
        r=multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_SlippySyntaxParser

    // $ANTLR start synpred59_SlippySyntaxParser
    public final void synpred59_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:284:4: ( lambdaExpr )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:284:4: lambdaExpr
        {
        pushFollow(FOLLOW_lambdaExpr_in_synpred59_SlippySyntaxParser2318);
        lambdaExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_SlippySyntaxParser

    // $ANTLR start synpred63_SlippySyntaxParser
    public final void synpred63_SlippySyntaxParser_fragment() throws RecognitionException {   
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:4: ( LPAR ( expression )? ( COMMA expression )* RPAR )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:4: LPAR ( expression )? ( COMMA expression )* RPAR
        {
        match(input,LPAR,FOLLOW_LPAR_in_synpred63_SlippySyntaxParser2352); if (state.failed) return ;
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:9: ( expression )?
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( ((LA60_0>=TRUE && LA60_0<=FALSE)||LA60_0==NUM||LA60_0==NEW||LA60_0==LAMBDA||LA60_0==NOT||LA60_0==LPAR||LA60_0==LSB||LA60_0==LCB||(LA60_0>=PLUS && LA60_0<=MINUS)||LA60_0==ID||LA60_0==STR_LITERAL) ) {
            alt60=1;
        }
        switch (alt60) {
            case 1 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: expression
                {
                pushFollow(FOLLOW_expression_in_synpred63_SlippySyntaxParser2354);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:21: ( COMMA expression )*
        loop61:
        do {
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==COMMA) ) {
                alt61=1;
            }


            switch (alt61) {
        	case 1 :
        	    // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:291:22: COMMA expression
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred63_SlippySyntaxParser2358); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred63_SlippySyntaxParser2360);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop61;
            }
        } while (true);

        match(input,RPAR,FOLLOW_RPAR_in_synpred63_SlippySyntaxParser2364); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_SlippySyntaxParser

    // $ANTLR start synpred65_SlippySyntaxParser
    public final void synpred65_SlippySyntaxParser_fragment() throws RecognitionException {   
        SlippySyntaxParser.expression_return r = null;


        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:293:5: ( LSB (r= expression )? RSB )
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:293:5: LSB (r= expression )? RSB
        {
        match(input,LSB,FOLLOW_LSB_in_synpred65_SlippySyntaxParser2390); if (state.failed) return ;
        // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:293:10: (r= expression )?
        int alt62=2;
        int LA62_0 = input.LA(1);

        if ( ((LA62_0>=TRUE && LA62_0<=FALSE)||LA62_0==NUM||LA62_0==NEW||LA62_0==LAMBDA||LA62_0==NOT||LA62_0==LPAR||LA62_0==LSB||LA62_0==LCB||(LA62_0>=PLUS && LA62_0<=MINUS)||LA62_0==ID||LA62_0==STR_LITERAL) ) {
            alt62=1;
        }
        switch (alt62) {
            case 1 :
                // /Users/johnsogg/Projects/sketching-games/olive/java/org/six11/slippy/SlippySyntaxParser.g:0:0: r= expression
                {
                pushFollow(FOLLOW_expression_in_synpred65_SlippySyntaxParser2394);
                r=expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RSB,FOLLOW_RSB_in_synpred65_SlippySyntaxParser2397); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_SlippySyntaxParser

    // Delegated rules

    public final boolean synpred46_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_SlippySyntaxParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_SlippySyntaxParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA40_eotS =
        "\44\uffff";
    static final String DFA40_eofS =
        "\1\1\43\uffff";
    static final String DFA40_minS =
        "\1\6\17\uffff\2\0\22\uffff";
    static final String DFA40_maxS =
        "\1\62\17\uffff\2\0\22\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\3\40\uffff\1\2\1\1";
    static final String DFA40_specialS =
        "\20\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\1\1\uffff\2\1\2\uffff\14\1\1\uffff\16\1\1\21\1\20\4\uffff"+
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
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 243:27: ( PLUS r= multExpr -> ^( EXPR_ADD $additionExpr $r) | MINUS r= multExpr -> ^( EXPR_MINUS $additionExpr $r) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_16 = input.LA(1);

                         
                        int index40_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_SlippySyntaxParser()) ) {s = 34;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_17 = input.LA(1);

                         
                        int index40_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_SlippySyntaxParser()) ) {s = 35;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\50\uffff";
    static final String DFA48_eofS =
        "\1\1\47\uffff";
    static final String DFA48_minS =
        "\1\6\25\uffff\1\0\5\uffff\1\0\13\uffff";
    static final String DFA48_maxS =
        "\1\62\25\uffff\1\0\5\uffff\1\0\13\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\3\44\uffff\1\1\1\2";
    static final String DFA48_specialS =
        "\26\uffff\1\0\5\uffff\1\1\13\uffff}>";
    static final String[] DFA48_transitionS = {
            "\2\1\1\uffff\2\1\2\uffff\14\1\1\uffff\1\26\1\1\1\34\22\1\1\uffff"+
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
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "()* loopback of 290:15: ( LPAR ( expression )? ( COMMA expression )* RPAR -> ^( EXPR_FUNC_CALL $postfixedExpr ^( EXPR_LIST ( expression )* ) ) | LSB (r= expression )? RSB -> ^( EXPR_ARRAY_INDEX $postfixedExpr $r) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_22 = input.LA(1);

                         
                        int index48_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_SlippySyntaxParser()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_28 = input.LA(1);

                         
                        int index48_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_SlippySyntaxParser()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_codesetDecl_in_prog752 = new BitSet(new long[]{0x000503005496E6E0L});
    public static final BitSet FOLLOW_imports_in_prog754 = new BitSet(new long[]{0x000503005496E6C2L});
    public static final BitSet FOLLOW_statement_in_prog756 = new BitSet(new long[]{0x000503005496E6C2L});
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
    public static final BitSet FOLLOW_DEFINE_in_functionDefStatement926 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_functionDefStatement928 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_functionDefStatement930 = new BitSet(new long[]{0x000503005497E6C0L});
    public static final BitSet FOLLOW_block_in_functionDefStatement932 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_functionDefStatement935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefStatement958 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_classDefStatement960 = new BitSet(new long[]{0x0001000001015C00L});
    public static final BitSet FOLLOW_classExtendsExpr_in_classDefStatement962 = new BitSet(new long[]{0x0001000001015400L});
    public static final BitSet FOLLOW_classMixesExpr_in_classDefStatement965 = new BitSet(new long[]{0x0001000001014400L});
    public static final BitSet FOLLOW_classMemberDecl_in_classDefStatement968 = new BitSet(new long[]{0x0001000001014400L});
    public static final BitSet FOLLOW_DONE_in_classDefStatement971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_classExtendsExpr998 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_classExtendsExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeset_in_classID1021 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_classID1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CODESET_in_codesetDecl1049 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_codesetDecl1052 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codesetDecl1054 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_codesetDecl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_codeset1084 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codeset1086 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_codeset1091 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_codeset1093 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_MIXES_in_classMixesExpr1119 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_classID_in_classMixesExpr1121 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_COMMA_in_classMixesExpr1125 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_classMixesExpr1127 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_whileStatement_in_flowStatement1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_flowStatement1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_flowStatement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_formalParameters1173 = new BitSet(new long[]{0x0001400008000000L});
    public static final BitSet FOLLOW_ID_in_formalParameters1176 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameters1180 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_formalParameters1182 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_formalParameters1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block1209 = new BitSet(new long[]{0x000503005496E6C2L});
    public static final BitSet FOLLOW_AT_in_annotation1233 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_annotation1235 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_expressionList_in_annotation1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_classMemberDecl1262 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_classMemberDecl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_classMemberDecl1284 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_functionDefStatement_in_classMemberDecl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefStatement_in_classMemberDecl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldDeclaration1328 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQ_in_fieldDeclaration1331 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_fieldDeclaration1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parExpression_in_whileStatement1358 = new BitSet(new long[]{0x000503005497E6C0L});
    public static final BitSet FOLLOW_block_in_whileStatement1360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_whileStatement1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1388 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_ifStatement1390 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1395 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_ifStatement1397 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_ifStatement1399 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1406 = new BitSet(new long[]{0x000503005497E6C0L});
    public static final BitSet FOLLOW_block_in_ifStatement1408 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_ifStatement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_conditionalBlock1441 = new BitSet(new long[]{0x000503005496E6C2L});
    public static final BitSet FOLLOW_block_in_conditionalBlock1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_parExpression1469 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_parExpression1471 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAR_in_parExpression1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loopStatement1491 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_loopStatement1493 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_loopStatement1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loopStatement1511 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAR_in_loopStatement1513 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_loopStatement1515 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COLON_in_loopStatement1517 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_loopStatement1519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAR_in_loopStatement1521 = new BitSet(new long[]{0x000503005497E6C0L});
    public static final BitSet FOLLOW_block_in_loopStatement1523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_loopStatement1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_expressionList1554 = new BitSet(new long[]{0x000543005C96E6C0L});
    public static final BitSet FOLLOW_expression_in_expressionList1556 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList1560 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_expressionList1562 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_expressionList1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expression1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_assignExpression1603 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQ_in_assignExpression1615 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_assignExpression1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr1654 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpr1666 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr1670 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpr1703 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpr1719 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpr1723 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1759 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_EQEQ_in_equalityExpression1774 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1778 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_NEQ_in_equalityExpression1805 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_gtltExpression_in_equalityExpression1809 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1842 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_LT_in_gtltExpression1857 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1862 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_LTEQ_in_gtltExpression1889 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1893 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_GT_in_gtltExpression1917 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1922 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_GTEQ_in_gtltExpression1946 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_additionExpr_in_gtltExpression1950 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr1983 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_PLUS_in_additionExpr1999 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr2003 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_MINUS_in_additionExpr2032 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_multExpr_in_additionExpr2036 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2070 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_multExpr2085 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2089 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_multExpr2116 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2120 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2144 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr2148 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpr2181 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpr2199 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpr2217 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_unaryExpr2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_dotExpr2247 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_DOT_in_dotExpr2259 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_postfixedExpr_in_dotExpr2263 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_parExpression_in_primaryExpr2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpr2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixedExpr_in_primaryExpr2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpr_in_primaryExpr2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_primaryExpr2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapExpr_in_primaryExpr2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_postfixedExpr2340 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LPAR_in_postfixedExpr2352 = new BitSet(new long[]{0x000543005C96E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2354 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_postfixedExpr2358 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2360 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_postfixedExpr2364 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LSB_in_postfixedExpr2390 = new BitSet(new long[]{0x000503007496E6C0L});
    public static final BitSet FOLLOW_expression_in_postfixedExpr2394 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RSB_in_postfixedExpr2397 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_LAMBDA_in_lambdaExpr2431 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_lambdaExpr2433 = new BitSet(new long[]{0x000503005497E6C0L});
    public static final BitSet FOLLOW_block_in_lambdaExpr2435 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DONE_in_lambdaExpr2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCB_in_lambdaExpr2457 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_formalParameters_in_lambdaExpr2459 = new BitSet(new long[]{0x00050300D496E6C0L});
    public static final BitSet FOLLOW_block_in_lambdaExpr2461 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RCB_in_lambdaExpr2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_arrayExpr2489 = new BitSet(new long[]{0x000543007496E6C0L});
    public static final BitSet FOLLOW_expression_in_arrayExpr2491 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayExpr2495 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_arrayExpr2497 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_RSB_in_arrayExpr2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCB_in_mapExpr2523 = new BitSet(new long[]{0x00054300D496E6C0L});
    public static final BitSet FOLLOW_mapEntryExpr_in_mapExpr2525 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_COMMA_in_mapExpr2529 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_mapEntryExpr_in_mapExpr2531 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_RCB_in_mapExpr2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_mapEntryExpr2558 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COLON_in_mapEntryExpr2560 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_mapEntryExpr2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression2623 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_newExpression2625 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_expressionList_in_newExpression2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_synpred2_SlippySyntaxParser789 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_classID_in_synpred2_SlippySyntaxParser791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred13_SlippySyntaxParser1084 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_DOT_in_synpred13_SlippySyntaxParser1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classID_in_synpred15_SlippySyntaxParser1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred24_SlippySyntaxParser1262 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred24_SlippySyntaxParser1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_synpred26_SlippySyntaxParser1284 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_functionDefStatement_in_synpred26_SlippySyntaxParser1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred29_SlippySyntaxParser1395 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_synpred29_SlippySyntaxParser1397 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_conditionalBlock_in_synpred29_SlippySyntaxParser1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_synpred46_SlippySyntaxParser1999 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_multExpr_in_synpred46_SlippySyntaxParser2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_synpred47_SlippySyntaxParser2032 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_multExpr_in_synpred47_SlippySyntaxParser2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpr_in_synpred59_SlippySyntaxParser2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_synpred63_SlippySyntaxParser2352 = new BitSet(new long[]{0x000543005C96E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred63_SlippySyntaxParser2354 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred63_SlippySyntaxParser2358 = new BitSet(new long[]{0x000503005496E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred63_SlippySyntaxParser2360 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_RPAR_in_synpred63_SlippySyntaxParser2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_synpred65_SlippySyntaxParser2390 = new BitSet(new long[]{0x000503007496E6C0L});
    public static final BitSet FOLLOW_expression_in_synpred65_SlippySyntaxParser2394 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RSB_in_synpred65_SlippySyntaxParser2397 = new BitSet(new long[]{0x0000000000000002L});

}