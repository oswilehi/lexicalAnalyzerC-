package lexicalanalyzerc;
import static lexicalanalyzerc.Token.*;

%%

%class lexicalRules
%type Token
%char
%line
%column


doubleConstants = (({digits}+)\.{integerConstants}([Ee]("+"|"-"))?({digits}+)?)
keywords=("void"|"int"|"double"|"bool"|"string"|"class"|"interface"|"null"|"this"|"extends"|"implements"|"for"|"while"|"if"|"else"|"return"|"break"|"New"|"NewArray")
digits=[0-9]
ID=([a-zA-Z]([a-zA-Z_0-9])*)

symbols=("+"|"-"|"*"|"/"|"%"|"<"|"<="|">"|">="|"="|"=="|"!="|"&&"|"||"|"!"|";"|","|"."|"["|"]"|"("|")"|"{"|"}"|"[]"|"()"|"{}")
booleanConstants = ("true"|"false")
integerConstants = ({digits}?)[1-9]({digits}*)
hexConstants = 0[xX]({integerConstants}[a-fA-F])+ 
stringConstants = (('([^'\\]|\\.)*')|(\"([^\"\\]|\\.)*\"))
commentsSymbols=(((\/\/)[^\r\n]*)|(("/*")~("*/")))
commentsMultilineError = (\/\*[^*]*)//)|(("/*")~(\n))
stringError = ((\")~(\n))
whiteSpace=([ \s\t\r] | \r\n | \n | " ")

%{
public String lexeme="";
%}

%%
{whiteSpace} | {commentsSymbols} {lexeme=yytext(); return WHITESPACE;}
{keywords} {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return KEYWORDS;}
{ID}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return ID;}
{symbols}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return SYMBOLS;}
{booleanConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return BOOLCONST;}
{integerConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return INTEGERCONST;}
{hexConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return HEXCONST;}
{doubleConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1);return DOUBLECONST;}
{stringConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return STRINGCONST;}
{commentsMultilineError}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return MULTILINEERROR;}
//{intVal}({ID}|{variable}) {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}
. {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}




