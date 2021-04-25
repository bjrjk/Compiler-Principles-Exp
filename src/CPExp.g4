grammar CPExp;

program: 		statement+;
statement: 		Identifier '=' expression 												# Assign
		 |		'if' condition 'then' statement	('else' statement)?						# If
		 |		'while' condition 'do' statement										# While
		 |		'{' program '}'															# Block
		 ;
condition:		expression op = (GT | LT | EQ) expression;
expression:		integer																	# IntExpr
		  |		Identifier																# IDNExpr
		  |		'(' expression ')'														# ParenExpr
		  |		expression op = (MUL | DIV) expression									# HighArithExpr
		  |		expression op = (ADD | SUB) expression									# LowArithExpr
		  ;
integer:		Int10																	# Int10P
	   |		Int8																	# Int8P
       |		Int16																	# Int16P
       ;

Identifier: 	[a-zA-Z] [a-zA-Z0-9]*;
Int10: 			'0' | [1-9] [0-9]*;
Int8: 			'0' ('0' | [1-7] [0-7]*);
Int16: 			'0x' [0-9a-fA-F]+;

ADD:			'+';
SUB:			'-';
MUL:			'*';
DIV:			'/';
GT:				'>';
LT:				'<';
EQ:				'=';

WhiteSpace: 	[ \t\n\r]+ -> skip ;