package Calculator;

import java_cup.runtime.Symbol;
%%
%cup
%%
";" { return new Symbol(sym.SEMI); }
"+" { return new Symbol(sym.PLUS); }
"-" { return new Symbol(sym.MINUS); }
"*" { return new Symbol(sym.TIMES); }
"/" { return new Symbol(sym.DIVIDE); }
"%" { return new Symbol(sym.MOD); }
"<<" { return new Symbol(sym.LSHIFT); }
">>" { return new Symbol(sym.RSHIFT); }
"^" { return new Symbol(sym.POW); }
"(" { return new Symbol(sym.LPAREN); }
")" { return new Symbol(sym.RPAREN); }
")" { return new Symbol(sym.RPAREN); }
[0-9]+ { return new Symbol(sym.NUMBER, new Integer(Integer.decode(yytext()))); }
0[xX][0-9a-fA-F]+ { return new Symbol(sym.NUMBER, new Integer(Integer.decode(yytext()))); }
\-?[0-9]+ { return new Symbol(sym.NUMBER, new Integer(yytext())); }
[ \t\r\n\f] { /* ignore white space. */ }
. { System.err.println("Illegal character: "+yytext()); }
