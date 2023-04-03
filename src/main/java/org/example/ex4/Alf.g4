grammar Alf;

start: expression
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
INT     : ([0-9]+) ;
MUL     : ('*');
DIV     : ('/');
PLUS    : ('+');
MINUS   : ('-');
MOD     : ('%');
VARIABLE_NAME: ('_'?[a-zA-Z][a-zA-Z0-9]+);