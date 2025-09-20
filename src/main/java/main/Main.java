package main;

import java_cup.runtime.Symbol;
import lex.Lexer;
import lex.Token;
import parser.Parser;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Lexer lexer = new Lexer(new FileReader("src/main/java/milcode-example.mc"));
        Symbol tok;

        System.out.println("=== Tokens do Lexer ===");
        while((tok = lexer.next_token()).sym != 0) {
            if (tok.value != null)
                System.out.println("Token: " + ((Token)tok.value).lexema);
            else
                System.out.println("Token: " + tok.sym);
        }

        Parser parser = new Parser(lexer);
        parser.parse();
        System.out.println("Análise concluída!");

    }
}
