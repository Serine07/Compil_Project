grammar Lang;

body :  COMPIL PROGRAME '('')'
        '{'
        declaration
        START
        instructions
        '}';

declaration : type variable ';';

type : INTC | FLOATC | STRINGC ;

variable : ID | ID ',' variable ;

instructions : instruction instructions | instruction |  ;

instruction : assignmant | read | write | ifstat | dowhilestat ;

assignmant : ID '=' values ';' | ID '=' expretions ';' ;

expretions : expretion expretions | expretion ;

expretion : operation | operation operator expretion ;

operation : values operator values ;

values : ID | value ;

value : INT | FLOAT ;

operator : PLUS | MINUS | MUL | DIV ;

read : SCAN '(' variable ')' ';' ;

write : PRINT '(' '"' (STR|DISPLAY )'"' ')' ';' | PRINT '(' ID ')' ';' ;

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
//mots clés du langage
COMPIL : 'compil';
START : 'start';
IF : 'if';
THEN : 'then';
ELSE : 'else' ;
DO : 'do';
WHILE : 'while';
SCAN :  'scanCompil';
PRINT :  'printCompil';
INTC : 'intCompil' ;
FLOATC : 'floatCompil' ;
STRINGC : 'stringCompil' ;
PROGRAME : [A-Z]+[a-zA-Z0-9_]* ;
ID : [a-zA-Z]+[a-zA-Z0-9_]* ;
INT : [0-9]+ ;
FLOAT : [+-]?[0-9]+('.'[0-9]+) ;
PLUS : '+' ;
MINUS : '-' ;
MUL : '*';
DIV : '/';
BIGER : '>';
LOWER : '<' ;
EQUAL : '==' ;
NOTEQUAL : '!=' ;
DISPLAY : [a-zA-Z0-9_]+ ;
STR : '"'(~["]|'\\"')*'"' ;
COMMENTS : '/*' .*? '*/' -> channel(HIDDEN) ;
COMMENT : '//' .*?  -> channel(HIDDEN) ;
WS : [ \t\n\r] -> skip;
