package main;

import lex.Lexer;
import parser.Parser;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Parser parser = new Parser(new Lexer(new FileReader("src/main/java/milcode-example.mc")));

        try {
            parser.parse();
            System.out.println("Análise concluída com sucesso!");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro durante a análise.");
            e.printStackTrace();
        }
    }
}
