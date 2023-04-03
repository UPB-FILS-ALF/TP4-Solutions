grammar Alf;

start: ((expression | declaration) SEMICOLON NEWLINE?)+
     ;

declaration: type VARIABLE_NAME (EQUALS value)?
           ;
type       : 'String '
           | 'boolean '
           | 'int'
           | 'float'
           ;
value      : STRING_VALUE
           | INT_VALUE
           | FLOAT_VALUE
           | BOOLEAN_VALUE
           | expression
           ;

expression: L_PARENTHESIS expression R_PARENTHESIS
          |  left=expression op=MUL right=expression        {if(!$left.text.isEmpty() && !$op.text.isEmpty() && !$right.text.isEmpty()) System.out.println($left.text + " " + $op.text + " " + $right.text + " ");}
          | left=expression op=DIV right=expression        {if(!$left.text.isEmpty() && !$op.text.isEmpty() && !$right.text.isEmpty()) System.out.println($left.text + " " + $op.text + " " + $right.text + " ");}
          | left=expression op=PLUS right=expression       {if(!$left.text.isEmpty() && !$op.text.isEmpty() && !$right.text.isEmpty()) System.out.println($left.text + " " + $op.text + " " + $right.text + " ");}
          | left=expression op=MINUS right=expression      {if(!$left.text.isEmpty() && !$op.text.isEmpty() && !$right.text.isEmpty()) System.out.println($left.text + " " + $op.text + " " + $right.text + " ");}
          | left=expression op=MINUS right=expression      {if(!$left.text.isEmpty() && !$op.text.isEmpty() && !$right.text.isEmpty()) System.out.println($left.text + " " + $op.text + " " + $right.text + " ");}
          | VARIABLE_NAME
          | INT
          ;

WS      : ([' ']+) -> skip;   /* Skip whitespaces */
NEWLINE : ([\r\n]+);
SEMICOLON : (';');
L_PARENTHESIS : ('(');
R_PARENTHESIS : (')');
EQUALS: '=';
INT     : ([0-9]+) ;
MUL     : ('*');
DIV     : ('/');
PLUS    : ('+');
MINUS   : ('-');
MOD     : ('%');
BOOLEAN_VALUE: 'true' | 'false';
INT_VALUE: ([0-9]+);
FLOAT_VALUE: ([0-9]+'.'[0-9]+);
STRING_VALUE: ('"'[a-zA-Z0-9]+'"');
VARIABLE_NAME: ('_'?[a-zA-Z][a-zA-Z0-9]+);