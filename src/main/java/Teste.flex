/* Teste.flex - Lexer mínimo funcionando no JFlex 1.8.2 */

%class Teste
%public
%unicode
%function yylex
%type void

%%

[a] { System.out.println("Viu a letra A"); }
.   { /* Ignora qualquer outro caractere */ }
