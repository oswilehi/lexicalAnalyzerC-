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
booleanConstants = ("true"|"false")
doubleConstants = (({digits}+)"."({digits}*)([eE]("+"|"-")?{digits}+)?)
integerConstants = ({digits}?)*[0-9]({digits}*)
hexConstants = 0[xX]((([a-fA-F]?)*({integerConstants}?)*([a-fA-F]?)*)+)
stringConstants = (('([^'\\]|\\.)*')|(\"([^\"\\]|\\.)*\"))
commentsSymbols=(((\/\/)[^\r\n]*)|(("/*")~("*/")))
commentsMultilineError = (\/\*[^*]*)//)|(("/*")~(\n))
stringError = ((\")~(\n))
whiteSpace=([ \s\t\r] | \r\n | \n | " ")
symbols=("+"|"-"|"*"|"/"|"%"|"<"|"<="|">"|">="|"="|"=="|"!="|"&&"|"||"|"!"|";"|","|"."|"["|"]"|"("|")"|"{"|"}"|"[]"|"()"|"{}")
ID=([a-zA-Z]([a-zA-Z_0-9])*)

%{
public String lexeme="";
%}

%%
{whiteSpace} | {commentsSymbols} {lexeme=yytext(); return WHITESPACE;}
{keywords} {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return KEYWORDS;}
{booleanConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return BOOLCONST;}
{hexConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return HEXCONST;}
{integerConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return INTEGERCONST;}
{doubleConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1);return DOUBLECONST;}
{stringConstants}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return STRINGCONST;}
{symbols}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return SYMBOLS;}
{ID}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return ID;}
{commentsMultilineError}  {lexeme= Integer.toString(yyline + 1) + "," + yytext() + "," + Integer.toString(yylength() + yycolumn) + "," + (yycolumn + 1); return MULTILINEERROR;}
//{intVal}({ID}|{variable}) {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}
. {lexeme = Integer.toString(yyline + 1) + "," + yytext(); return ERROR;}




