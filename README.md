# Calculator

This folder contains the Calculator project using JLex and CUP. 
All the files needed to run the program are included in the package.

Steps to run the Calculator program from the command line:
  1. To compile the codes 
    - javac -target 1.8 JLex/Main.java /* replace 1.8 above with correct java -version */
    - java JLex.Main Calculator.lex
    - mv -f Calculator.lex.java Yylex.java
    - java -cp JavaCup java_cup.Main Calculator.cup
    - javac -cp .:JavaCup -d . parser.java sym.java Yylex.java
  2. To execute the program
    - java -cp .:JavaCup Calculator.parser

Try inputs such as:
 1+2;
 1+2*5;
 5*1+2;
 5*(1+2);

-- Victor Domingo dela Cruz <a0120578@u.nus.edu>, 05-Feb-2016
