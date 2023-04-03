grammar Alf;

declaration: (type VARIABLE (EQUALS value)? ';')*
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
           ;
WS      : ([' \n']+) -> skip;   /* Skip whitespaces */
VARIABLE: ('_'?[a-zA-Z][a-zA-Z0-9]+);
EQUALS: '=';
BOOLEAN_VALUE: 'true' | 'false';
INT_VALUE: ([0-9]+);
FLOAT_VALUE: ([0-9]+'.'[0-9]+);
STRING_VALUE: ('"'[a-zA-Z0-9]+'"');