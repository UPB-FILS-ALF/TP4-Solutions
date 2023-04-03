package org.example.ex2;

// Import generated files
import com.Alf.parser.AlfLexer;
import com.Alf.parser.AlfParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) {
        String input = "2+5/10-7";
        AlfLexer lexer = new AlfLexer(CharStreams.fromString(input));
        AlfParser parser = new AlfParser(new CommonTokenStream(lexer));
        AlfParser.StartContext tree = parser.start();
        System.out.println(tree.children);
    }
}