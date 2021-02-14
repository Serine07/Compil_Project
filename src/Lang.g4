grammar Lang;

//mots clés du langage
tokens {
	COMPIL : 'compil';
	START : 'start';
	IF : 'if';
	THEN : 'then';
	ELSE : 'else' ;
	DO : 'do';
	WHILE : 'while';
	SCAN :  'scanCompil';
	PRINT :  'printCompil';
	}

//Grammaire syntaxique:

body :  COMPIL PROGRAME '('')'
        '{'
        declaration
        START
        instructions
        '}';

declaration : type variable ';'| ;

type : 'intcompil' | 'floatcompil' | 'stringcompil' ;

variable : ID | ID ',' variable ;

instructions : instruction instructions | instruction |  ;

instruction : assignmant | read | write | ifstat | dowhilestat ;

assignmant : ID '=' values ';' | ID '=' expretions ';' ;

expretions : expretion expretions | expretion ;

expretion : operation | operation operator expretion ;

operation : values operator values ;

values : ID | value ;

value : int | float ;

operator : plus | minus | mul | div ;

read : SCAN '(' variable ')' ';' ;

write : PRINT '(' '"' (str|display )'"' ')' ';' | PRINT '(' ID ')' ';' ;

ifstat : IF '(' condition ')' THEN '{'
            instructions
            '}' ELSE '{'
            instructions
            '}' |
            IF '(' condition ')' THEN '{'
             instructions
             '}';

dowhilestat : DO '{'
               instructions
               '}' WHILE '(' condition ')' ;

condition : values compare values ;

compare : BIGER | LOWER | EQUAL | NOTEQUAL ;


// Règles lexicales:

PROGRAME : [A-Z]+[a-zA-Z0-9_]* ;
ID : [a-zA-Z]+[a-zA-Z0-9_]* ;
INT :  '0'|[+-]?[1-9][0-9]* ;
FLOAT : '0'|[+-]?[1-9][0-9]*('.'[0-9]*) ;
PLUS : '+' ;
MINUS : '-' ;
MUL : '*';
DIV : '/';
BIGER : '>';
LOWER : '<' ;
EQUAL : '==' ;
NOTEQUAL : '!=' ;
DISPLAY : [a-zA-Z0-9_]* ;
STR : '"'(~["]|'\\"')*'"' ;
COMMENTS : '/*' .*? '*/' -> channel(HIDDEN) ;
COMMENT : '//' .*?  -> channel(HIDDEN) ;
WS : [ \t\n\r] -> skip;