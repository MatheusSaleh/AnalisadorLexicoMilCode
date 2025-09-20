%%
%{
// NOTA: não importar java_cup.runtime.Symbol aqui para evitar conflitos.
// Usaremos nomes totalmente qualificados quando necessário.

// Enum para tipos de token
public enum TokenType {
    PALAVRA_CHAVE, TIPO, IDENTIFICADOR, NUMERO_INT, NUMERO_REAL,
    TEXTO, ATRIBUICAO, OP_LOGICO, OP_MATEMATICO,
    DELIMITADOR, COMENTARIO, ERRO, EOF
}

// Classe Token para debug/log
public static class Token {
    public final TokenType tipo;
    public final String lexema;
    public final int linha;
    public final int coluna;

    public Token(TokenType tipo, String lexema, int linha, int coluna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return String.format("Linha %-3d Coluna %-3d | %-15s | %s",
                             linha, coluna, tipo, lexema);
    }
}

// makeToken usando nome totalmente qualificado
private java_cup.runtime.Symbol makeToken(int cupSym, TokenType tipo) {
    Token t = new Token(tipo, yytext(), yyline+1, yycolumn+1);
    System.out.println(t); // debug
    return new java_cup.runtime.Symbol(cupSym, yyline+1, yycolumn+1, t);
}
%}

%public
%class Lexer
%implements java_cup.runtime.Scanner
%unicode
%function next_token
%type java_cup.runtime.Symbol
%line
%column

DIGITO      = [0-9]
LETRA       = [a-zA-Z]
ID_PREFIX   = (sgt_|cap_|gen_)
ID          = {ID_PREFIX}{LETRA}({LETRA}|{DIGITO}|_)*

%%

// Palavras-chave
"relate"             { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }
"receba"             { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }
"ordem_se"           { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }
"contramarcha"       { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }
"patrulha"           { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }
"missao"             { return makeToken(sym.PALAVRA_CHAVE, TokenType.PALAVRA_CHAVE); }

// Tipos
"inf"|"art"|"ordem"|"comandante"
                     { return makeToken(sym.TIPO, TokenType.TIPO); }

// Identificador
{ID}                 { return makeToken(sym.IDENTIFICADOR, TokenType.IDENTIFICADOR); }

// Números (real antes de inteiro!)
{DIGITO}+"."{DIGITO}+ { return makeToken(sym.NUMERO_REAL, TokenType.NUMERO_REAL); }
{DIGITO}+            { return makeToken(sym.NUMERO_INT, TokenType.NUMERO_INT); }

// Texto (string)
\"[^\n\"]*\"         { return makeToken(sym.TEXTO, TokenType.TEXTO); }

// Operadores
"!!"|"??"|"#="|"##"  { return makeToken(sym.OP_LOGICO, TokenType.OP_LOGICO); }
"++"|"--"|"+"|"-"|"*"|"/"
                     { return makeToken(sym.OP_MATEMATICO, TokenType.OP_MATEMATICO); }
">>"                 { return makeToken(sym.ATRIBUICAO, TokenType.ATRIBUICAO); }

// Delimitadores
"{"                  { return makeToken(sym.LBRACE, TokenType.DELIMITADOR); }
"}"                  { return makeToken(sym.RBRACE, TokenType.DELIMITADOR); }
"("                  { return makeToken(sym.LPAREN, TokenType.DELIMITADOR); }
")"                  { return makeToken(sym.RPAREN, TokenType.DELIMITADOR); }
";"                  { return makeToken(sym.SEMI, TokenType.DELIMITADOR); }
":"                  { return makeToken(sym.DELIMITADOR, TokenType.DELIMITADOR); }

// Espaços e comentários
[ \t\r\n]+           { /* ignora */ }
"//".*               { /* ignora comentários */ }

// Caracteres inválidos
[^\x00-\x7F]         { return makeToken(sym.ERRO, TokenType.ERRO); }

// Qualquer outro caractere não reconhecido
.                    { return makeToken(sym.ERRO, TokenType.ERRO); }

// Fim de arquivo — usar tipo totalmente qualificado
<<EOF>> {
    return new java_cup.runtime.Symbol(
        sym.EOF,
        yyline+1,
        yycolumn+1,
        new Token(TokenType.EOF, "EOF", yyline+1, yycolumn+1)
    );
}
