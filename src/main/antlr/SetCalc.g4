grammar SetCalc;

// GPT v1
//expr      : orExpr | andExpr;
//orExpr    : andExpr (OR andExpr)*;
//andExpr   : primary (AND primary)*;
//primary   : ID | '(' expr ')' | '{' elements '}';
//elements  : ID (',' ID)*;
//ID        : [A-Za-z][A-Za-z0-9]*; // Updated to allow identifiers like A1, A2, B3, B1, etc.
//OR        : 'OR';
//AND       : 'AND';

// GPT v2
// Parser rules
//expr      : orExpr;
//orExpr    : andExpr (OR andExpr)*;
//andExpr   : primary (AND primary)*;
//primary   : ID | setLiteral | '(' expr ')';
//setLiteral: '{' elements '}';
//elements  : ID (',' ID)*;
//ID        : [A-Za-z][A-Za-z0-9]*;
//OR        : 'OR';
//AND       : 'AND';
//WS        : [ \t\r\n]+ -> skip;

// GPT v3

// Parser rules
//expr      : orExpr;
//orExpr    : andExpr (OR andExpr)*;
//andExpr   : primary (AND primary)*;
//primary   : setLiteral | ID | '(' expr ')';
//setLiteral: '{' elements '}';
//elements  : ID (',' ID)*;
//
//// Lexer rules
//ID        : [A-Za-z][A-Za-z0-9]*;
//OR        : 'OR';
//AND       : 'AND';
//WS        : [ \t\r\n]+ -> skip;

// GPT v4

// Parser rules
expr: expr OP_ADD term | term;
term: term OP_MUL factor | factor;
factor: set | '(' expr ')';
OP_ADD: 'u' | '/';
OP_MUL: 'n';
set: '{' ints '}' | '{' '}';
ints: INT ',' ints | INT;
INT: [0-9]+ ;
WS        : [ \t\r\n]+ -> skip;
