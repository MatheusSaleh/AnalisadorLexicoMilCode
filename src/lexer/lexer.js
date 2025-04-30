
import { createToken, Lexer } from "chevrotain";


const PalavraChave = createToken({
  name: "PalavraChave",
  pattern: /ordem_se|contramarcha|patrulha|missao|relate|receba/
});

const Tipo = createToken({
  name: "Tipo",
  pattern: /inf|art|comandante|ordem/
});

const Atribuicao = createToken({
  name: "Atribuicao",
  pattern: />>/
});

const OperadorLogico = createToken({
  name: "OperadorLogico",
  pattern: /!!|\?\?|#=|##/
});

const OperadorMatematico = createToken({
  name: "OperadorMatematico",
  pattern: /\+|\-|\*|\//
});

const Delimitador = createToken({
  name: "Delimitador",
  pattern: /[{}();:]/
});

const NumeroReal = createToken({
  name: "NumeroReal",
  pattern: /\b\d+\.\d+\b/
});

const NumeroInteiro = createToken({
  name: "NumeroInteiro",
  pattern: /\b\d+\b/
});

const Texto = createToken({
  name: "Texto",
  pattern: /"[^"\n]*"/
});

const Identificador = createToken({
  name: "Identificador",
  pattern: /\b(sgt_|cap_|gen_)[a-zA-Z_][a-zA-Z0-9_]*\b/
});

const Comentario = createToken({
  name: "Comentario",
  pattern: /\/\/.*/,
  group: Lexer.SKIPPED
});

const Espaco = createToken({
  name: "Espaco",
  pattern: /[ \t\r\n]+/,
  group: Lexer.SKIPPED
});

const allTokens = [
  Comentario,
  Espaco,
  PalavraChave,
  Tipo,
  Atribuicao,
  OperadorLogico,
  OperadorMatematico,
  Delimitador,
  NumeroReal,
  NumeroInteiro,
  Texto,
  Identificador
];

const MilcodeLexer = new Lexer(allTokens);

function analisar(codigo) {
  const resultado = MilcodeLexer.tokenize(codigo);

  if (resultado.errors.length > 0) {
    console.error("Erros léxicos encontrados:");
    resultado.errors.forEach(e => console.error(e.message));
  } else {
    console.log("TOKENS ENCONTRADOS:");
    resultado.tokens.forEach(tok => {
      console.log(`${tok.image.padEnd(30)} | ${tok.tokenType.name}`);
    });
  }
}

export { analisar };	
