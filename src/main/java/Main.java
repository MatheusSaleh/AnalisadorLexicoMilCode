import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Analisador Léxico - MilCode");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setVisible(true);

            try {
                FileReader leitor = new FileReader("src/main/java/milcode-example.mc");
                Lexer lexer = new Lexer(leitor);
                Lexer.Token token;
                do {
                    token = lexer.nextToken();
                    textArea.append(token.toString() + "\n");
                } while (token.tipo != Lexer.TokenType.EOF);
            } catch (IOException e) {
                textArea.append("Erro: " + e.getMessage());
            }
        });
    }
}

