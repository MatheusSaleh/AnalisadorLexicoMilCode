%%
%public
%class Lexer
%unicode
%function nextToken
%type Token
%line
%column

%{

// enum para os tipos de token
public enum TokenType {
    PALAVRA_CHAVE, TIPO, IDENTIFICADOR, NUMERO_INT, NUMERO_REAL,
    TEXTO, ATRIBUICAO, OP_LOGICO, OP_MATEMATICO,
    DELIMITADOR, COMENTARIO, ERRO, EOF
}

// objeto Token simples
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
        return String.format("Linha %-3d Coluna %-3d | %-15s | %s", linha, coluna, tipo, lexema);
    }
}

%}

DIGITO = [0-9]
LETRA = [a-zA-Z]
ID_PREFIX = (sgt_|cap_|gen_)
ID = {ID_PREFIX}{LETRA}({LETRA}|{DIGITO}|_)*

%%

// Palavras-chave
"relate"             { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }
"receba"             { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }
"ordem_se"           { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }
"contramarcha"       { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }
"patrulha"           { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }
"missao"             { return new Token(TokenType.PALAVRA_CHAVE, yytext(), yyline+1, yycolumn+1); }

// Tipos
"inf"|"art"|"ordem"|"comandante"
                     { return new Token(TokenType.TIPO, yytext(), yyline+1, yycolumn+1); }

// Identificador
{ID}                 { return new Token(TokenType.IDENTIFICADOR, yytext(), yyline+1, yycolumn+1); }

// Números
{DIGITO}+            { return new Token(TokenType.NUMERO_INT, yytext(), yyline+1, yycolumn+1); }
{DIGITO}+"."{DIGITO}+ { return new Token(TokenType.NUMERO_REAL, yytext(), yyline+1, yycolumn+1); }

// Texto (string)
\"[^\n\"]*\"         { return new Token(TokenType.TEXTO, yytext(), yyline+1, yycolumn+1); }

// Operadores
"!!"|"??"|"#="|"##"  { return new Token(TokenType.OP_LOGICO, yytext(), yyline+1, yycolumn+1); }
"++"|"--"|"+"|"-"|"*"|"/"
                     { return new Token(TokenType.OP_MATEMATICO, yytext(), yyline+1, yycolumn+1); }
">>"                 { return new Token(TokenType.ATRIBUICAO, yytext(), yyline+1, yycolumn+1); }

// Delimitadores
[{}();:]             { return new Token(TokenType.DELIMITADOR, yytext(), yyline+1, yycolumn+1); }

// Espaços e comentários
[ \t\r\n]+           { /* ignora */ }
"//".*               { /* ignora comentários */ }

// Caracteres inválidos
[^\x00-\x7F]         { return new Token(TokenType.ERRO, "CARACTERE_INVALIDO: " + yytext(), yyline+1, yycolumn+1); }

// Qualquer outro caractere não reconhecido
.                    { return new Token(TokenType.ERRO, yytext(), yyline+1, yycolumn+1); }

// Fim de arquivo
<<EOF>>              { return new Token(TokenType.EOF, "EOF", yyline+1, yycolumn+1); }
