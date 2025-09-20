import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) {
        try {
            Lexer lexer = new Lexer(new FileReader("src/main/java/milcode-example.mc"));
            Parser p = new Parser(lexer);

            System.out.println("Iniciando analise sintatica...");
            Symbol resultado = p.parse(); // retorna um Symbol
            System.out.println("Analise sintatica concluida sem erros: " + resultado);

        } catch (IOException e) {
            System.err.println("Erro de I/O: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro sintatico: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
