package lex;

import java_cup.runtime.Symbol;
import parser.sym;
%%

%class Lexer
%unicode
%cup
%function next_token
%type Symbol
%public
%line
%column

%%

// Espaços e comentários
\s+            { /* ignora espaços */ }
"//".*         { /* ignora comentários de linha */ }

// Palavras-chave
"missao"       { return new Symbol(sym.PALAVRA_CHAVE, new Token(yytext())); }
"int"          { return new Symbol(sym.TIPO, new Token(yytext())); }
"float"        { return new Symbol(sym.TIPO, new Token(yytext())); }
"relate"       { return new Symbol(sym.PALAVRA_CHAVE, new Token(yytext())); }


// Identificadores
[a-zA-Z_][a-zA-Z0-9_]* { return new Symbol(sym.IDENTIFICADOR, new Token(yytext())); }

// Números
[0-9]+"."[0-9]+ { return new Symbol(sym.NUMERO_REAL, new Token(yytext())); }
[0-9]+          { return new Symbol(sym.NUMERO_INT, new Token(yytext())); }

// Operadores
"+"|"-"|"*"|"/" { return new Symbol(sym.OP_MATEMATICO, new Token(yytext())); }

// Delimitadores
"{"            { return new Symbol(sym.LBRACE); }
"}"            { return new Symbol(sym.RBRACE); }
"("            { return new Symbol(sym.LPAREN); }
")"            { return new Symbol(sym.RPAREN); }
";"            { return new Symbol(sym.SEMI); }
":"            { return new Symbol(sym.COLON); }
"="            { return new Symbol(sym.ATRIBUICAO); }

// TEXTO (entre aspas)
\"[^\"]*\"      { return new Symbol(sym.TEXTO, new Token(yytext())); }
