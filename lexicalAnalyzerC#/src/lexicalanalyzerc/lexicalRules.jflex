package lexicalanalyzerc;
import static lexicalanalyzerc.Token.*;

%%

%class lexicalRules
%type Token
%char
%line
%column

keywords=("void"|"int"|"double"|"bool"|"string"|"class"|"interface"|"null"|"this"|"extends"|"implements"|"for"|"while"|"if"|"else"|"return"|"break"|"New"|"NewArray")
digits=[0-9]
ID=([a-zA-Z]([a-zA-Z_0-9])*){1,31}
symbols=("+"|"-"|"*"|"/"|"%"|"<"|"<="|">"|">="|"="|"=="|"!="|"&&"|"||"|"!"|";"|","|"."|"["|"]"|"("|")"|"{"|"}"|"[]"|"()"|"{}")
booleanConstants = ("true"|"false")
integerConstants = [1-9]({digits}*)
hexConstants = 0[xX]({integerConstants}[a-fA-F])+ 
doubleConstants = {integerConstants}\.{integerConstants}([Ee]("+"|"-"))?({digits}+)
stringConstants = (('([^'\\]|\\.)*')|(\"([^\"\\]|\\.)*\"))
commentsSymbols=(((\/\/)[^\r\n]*)|(("/*")~("*/")))
commentsMultilineError = (("/*")~(\n))
whiteSpace=([ \s\t\r] | \r\n | \n | " ")

%{
public String lexeme="";
%}

%%
{whiteSpace} | {commentsSymbols} {lexeme=yytext(); return WHITESPACE;}
{keywords} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return KEYWORDS;}
{ID} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1)+ "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return ID;}
{symbols} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return SYMBOLS;}
{booleanConstants} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return BOOLCONST;}
{integerConstants} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return INTEGERCONST;}
{hexConstants} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return HEXCONST;}
{doubleConstants} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return DOUBLECONST;}
{stringConstants} {lexeme= Integer.toString(yyline + 1) + "," + (yycolumn + 1) + "," + Integer.toString(yylength() + yycolumn) + "," + yytext(); return STRINGCONST;}
//{intVal}({ID}|{variable}) {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}
{commentsMultilineError} |. {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}




