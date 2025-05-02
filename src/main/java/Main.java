import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader leitor = new FileReader("src/main/java/milcode-example.mc");
            Lexer lexer = new Lexer(leitor);
            Lexer.Token token;
            do {
                token = lexer.nextToken();
                System.out.println(token);
            } while (token.tipo != Lexer.TokenType.EOF);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

