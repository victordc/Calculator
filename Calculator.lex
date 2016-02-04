package Calculator;

import java_cup.runtime.Symbol;
%%
%cup
%notunix
%%
";" { return new Symbol(sym.SEMI); }
"+" { return new Symbol(sym.PLUS); }
"-" { return new Symbol(sym.MINUS); }
"~" { return new Symbol(sym.NOT); }
"*" { return new Symbol(sym.TIMES); }
"/" { return new Symbol(sym.DIVIDE); }
"%" { return new Symbol(sym.MOD); }
"<<" { return new Symbol(sym.LSHIFT); }
">>" { return new Symbol(sym.RSHIFT); }
"&" { return new Symbol(sym.AND); }
"^" { return new Symbol(sym.XOR); }
"|" { return new Symbol(sym.OR); }
"^^" { return new Symbol(sym.POW); }
sqrt { return new Symbol(sym.SQRT); }
log { return new Symbol(sym.LOG); }
sin { return new Symbol(sym.SIN); }
cos { return new Symbol(sym.COS); }
tan { return new Symbol(sym.TAN); }
cot { return new Symbol(sym.COT); }
sec { return new Symbol(sym.SEC); }
csc { return new Symbol(sym.CSC); }
"(" { return new Symbol(sym.LPAREN); }
")" { return new Symbol(sym.RPAREN); }
[0-9]+ { return new Symbol(sym.LONG, new Long(Long.decode(yytext()))); }
[0-9]*\.?[0-9]+([eE][\+\-]?[0-9]+)? { return new Symbol(sym.DOUBLE, new Double(yytext())); }
0[xX][0-9a-fA-F]+ { return new Symbol(sym.LONG, new Long(Long.decode(yytext()))); }
[ \t\r\n\f] { /* ignore white space. */ }
. { System.err.println("Illegal character: "+yytext()); }
