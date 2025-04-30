import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";
import { analisar } from "./lexer/lexer.js";

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const caminho = path.join(__dirname, "../milcode-example.mc");

fs.readFile(caminho, "utf-8", (err, codigo) => {
  if (err) {
    console.error("Erro ao ler o arquivo:", err);
    return;
  }

  console.log("\nAnalisando o código MILCODE...\n");
  analisar(codigo);
});