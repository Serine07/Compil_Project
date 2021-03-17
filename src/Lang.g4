grammar Lang;

body :  COMPIL PROGRAME '('')'
        '{'
        declaration
        START
        inst
        '}';

declaration : type variable ';' | ;

type : INTC | FLOATC | STRINGC ;

variable : ID | ID ',' variable ;

inst : instructions | ;

instructions : instruction instructions | instruction ;

instruction : assignmant | read | write | ifstat | dowhilestat ;

assignmant : ID '=' values ';' | ID '=' expretions ';' ;

expretions : expretion expretions | expretion ;

expretion : operation
            | operation DIV expretion
            | operation MUL expretion
            | operation PLUS expretion
            | operation MINUS expretion ;

operation : values DIV values
            | values MUL values
            | values PLUS values
            | values MINUS values ;

values : ID | value ;

value : INT | FLOAT ;

read : SCAN '(' variable ')' ';' ;

write : PRINT '(' DISPLAY ')' ';' | PRINT '(' ID ')' ';' ;

ifstat : IF '(' condition ')' THEN '{'
            inst
            '}' ELSE '{'
            inst
            '}' |
            IF '(' condition ')' THEN '{'
             inst
             '}';

dowhilestat : DO '{'
               inst
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
DISPLAY : '"'(~["]|'\\"')*'"' ;
COMMENTS : '/*' .*? '*/' -> skip ;
COMMENT : '//' .*? '\n' -> skip ;
WS : [ \t\n\r] -> skip;
