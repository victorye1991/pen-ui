// NOTE: this file isn't kept up to date since I wrote it early on but then
// decided to not use it.

tree grammar SlippyWalker;

options { 
	tokenVocab=SlippyParser;
	ASTLabelType=CommonTree; 
}

@header{package org.six11.slippy;}

prog	:	^(PROG statement*)
	;

statement
	:	definition
	|	nonDefStatement
	;

definition
	:	^(FUNCTION_DEF_SIGNATURE ID paramList? block?)
	|	classDefinition
	;

classDefinition
	:	^(CLASS_DEF ID member*) { System.out.println("Class defined: " + $ID.text + " with members: " + $member.text); }
	;

objectInstantiation
	:	^(OBJECT_INSTANTIATION ID expressionList)
	;
	
member	:	assignExpression { System.out.println("member found. it's an assignExpression: " + $assignExpression.text);}
	|	definition { System.out.println("member found. it's a definition: " + $definition.text); }
	|	ID { System.out.println("member found. it's an ID: " + $ID.text);}
	;

block
    :   ^(BLOCK nonDefStatement+)
    ;

nonDefStatement
    :   whileStatement
    |   ifStatement
    |	forEachStatement
    |   ^(STATEMENT statementExpression)
    ;

whileStatement
	: ^(WHILE_STATEMENT assignExpression block?)
	;
	
ifStatement
	:	^(IF_STATEMENT ifStatementStart elseifStatement* elseStatement?)
	;

forEachStatement
	:	^(FOR_EACH_STATEMENT ID assignExpression block?)
	;

statementExpression
	:	^(EXPR assignExpression)
	;
	
ifStatementStart
	:	^(IF_ALT parExpression block?)
	;

elseStatement
	:	^(ELSE_ALT block?)
	;

elseifStatement
	:	^(IF_ALT parExpression block?)
	;

parExpression
	:	assignExpression
	;

assignExpression
	:	conditionalOrExpr
	|	^(ASSIGN_EXPR assignExpression conditionalOrExpr)
	;
	
conditionalOrExpr
	:	conditionalAndExpr
	|	^(OR_EXPR conditionalOrExpr conditionalAndExpr)
	;

conditionalAndExpr
	:	equalityExpression
	|	^(AND_EXPR conditionalAndExpr equalityExpression)
	;

equalityExpression
	:	gtltExpression
	|	^(EQ_EXPR equalityExpression gtltExpression)
	|	^(NEQ_EXPR equalityExpression gtltExpression)
	;

gtltExpression
	:	additionExpr
	|	^(LT_EXPR gtltExpression additionExpr)
	|	^(LTEQ_EXPR gtltExpression additionExpr)
	|	^(GT_EXPR gtltExpression additionExpr)
	|	^(GTEQ_EXPR gtltExpression additionExpr)
	;

additionExpr
	:	multExpr
	|	^(ADD_EXPR additionExpr multExpr)
	|	^(MINUS_EXPR additionExpr multExpr)
	;

multExpr
	:	unaryExpr
	| 	^(MULT_EXPR multExpr unaryExpr)
	|	^(DIV_EXPR multExpr unaryExpr)
	|	^(MODULO_EXPR multExpr unaryExpr)
	;

unaryExpr
	:	^(UNARY_NEG_EXPR primary) 
	|	^(UNARY_POS_EXPR primary)
	;

primary
	:	primaryNoDot
	|	^(MEMBER_EXPR primary primaryNoDot)
	;

primaryNoDot
	:	literal
	|	indexExpr
	|	parExpression
	|	objectInstantiation
	;

indexExpr // this ^(variable) might just be variable, without the caret syntax
	:	variable
	|	^(INDEX_EXPR indexExpr assignExpression+)
	;

variable // maybe just ID, not ^(ID)
	:	ID
	|	^(FUNCTION_CALL variable expressionList?)
	;
	
expressionList
	:	^(EXPR_LIST assignExpression*)
	;

paramList
	:	^(PARAM_LIST ID*)
	;

literal
	:	NUM { System.out.println("literal number: " + $NUM.text); }
    	|	STR_LITERAL { System.out.println("literal string: " + $STR_LITERAL.text); }
    	|	TRUE { System.out.println("literal boolean true: " + $TRUE.text); }
    	|	FALSE { System.out.println("literal boolean false: " + $FALSE.text); }
	;
