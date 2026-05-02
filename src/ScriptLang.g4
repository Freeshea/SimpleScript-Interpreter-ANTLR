grammar ScriptLang;
// java -jar .\antlr-4.11.1-complete.jar  .\src\ScriptLang.g4 -visitor -no-listener

options {
	language = Java;
}

// A program utasítások sorozata
program: statement* EOF;

// Blokk kapcsos zárójelek között
block: '{' statement* '}';

// Utasítások
statement:
	type ID ('=' expr)? ';'										# VarDeclarationStatement
	| 'del' ID ';'												# VarDeletionStatement
	| 'print' '(' expr (',' expr)* ')' ';'						# PrintStatement
	| 'scan' '(' ID (',' ID)* ')' ';'							# ScanStatement
	| 'if' '(' expr ')' statement ('else' statement)?			# IfStatement
	| 'while' '(' expr ')' statement							# WhileStatement
	| 'for' '(' statement expr ';' expr ')' statement			# ForStatement
	| 'switch' '(' expr ')' '{' caseBlock* defaultBlock? '}'	# SwitchStatement
	| block														# BlockStatement
	| expr ';'													# ExprStatement
	| 'break' ';'												# BreakStatement
	| ';'														# EmptyStatement
    ;

// Switch-case segédszabályok
caseBlock: 'case' expr ':' statement*;
defaultBlock: 'default' ':' statement*;

// Típusok deklarációhoz
type: 'int' | 'double';

// Kifejezések (Precedencia szerint sorrendben)
expr:
	'TIME'										# TimeExpr
	| 'ABS' '(' expr ')'						# AbsExpr
	| '(' expr ')'								# ParenthesesExpr
	| NUMBER									# NumberExpr
	| ID										# IdExpr
	| expr op = ('*' | '/') expr				# MulDivExpr
	| expr op = ('+' | '-') expr				# AddSubExpr
	| expr op = ('<' | '>' | '==' | '!=') expr	# RelationalExpr
	| <assoc = right> expr '?' expr ':' expr	# TernaryExpr
	| <assoc = right> ID '=' expr				# AssignExpr
    ;

// --- LEXER SZABÁLYOK ---

// Számok (egész és float)
NUMBER: [0-9]+ ('.' [0-9]+)?;

// Változónevek (betű vagy _, utána betű vagy szám)
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

// Kommentek - de ezt a lexer eldobja -> skip
LINE_COMMENT: ('//' | '#') ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace eldobás
WS: [ \t\r\n]+ -> skip;