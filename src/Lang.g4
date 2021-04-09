grammar Lang;

body :  COMPIL PROGRAME '('')'
        '{'
        dec
        START
        inst
        '}';

dec : declarations | ;

declarations : declaration declarations | declaration ;

declaration : type variable ';';

type : INTC | FLOATC | STRINGC ;

identifier : ID ;

variable : ID | ID ',' variable ;

inst : instructions | ;

instructions : instruction instructions | instruction ;

instruction : assignmant ';' | read ';' | write ';' | ifstat | dowhilestat ;

/*assignmant : ID '=' value ';' | ID '=' expretions ';' ;

expretions : expretion expretions | expretion ;

expretion : operation
            | operation DIV expretion
            | operation MUL expretion
            | operation PLUS expretion
            | operation MINUS expretion ;

operation : value DIV value
            | value MUL value
            | value PLUS value
            | value MINUS value ;

value : ID | INT | FLOAT ;*/

assignmant:    identifier '=' expression;


expression : expression pm expression1 | expression1;

expression1 : expression1 md expression2 | expression2;

pm : (PLUS|MINUS) ;
md : (MUL|DIV) ;

expression2 : identifier | '(' expression ')' | value ;


value :     INT
      |     FLOAT
      ;


read : SCAN '(' variable ')'  ;

write : PRINT '(' DISPLAY ')'  | PRINT '(' identifier ')'  ;

/*ifstat : IF '(' condition ')' THEN '{'
            inst
            '}' ELSE '{'
            inst
            '}' |
            IF '(' condition ')' THEN '{'
             inst
             '}';
*/
ifstat : IF '(' condition ')' THEN '{' inst '}' el '{' inst '}'
       | IF '(' condition ')' THEN '{' inst '}'
       ;

el : ELSE ;
dowhilestat : DO '{'
               inst
               '}' WHILE '(' condition ')' ;

condition : expression compare expression ;

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
