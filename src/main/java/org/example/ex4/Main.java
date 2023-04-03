package org.example.ex4;

// Import generated files
import com.AlfEx4.parser.AlfLexer;
import com.AlfEx4.parser.AlfParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) {
        String input = "(2+5)/3";
        AlfLexer lexer = new AlfLexer(CharStreams.fromString(input));
        AlfParser parser = new AlfParser(new CommonTokenStream(lexer));
        AlfParser.StartContext tree = parser.start();
        System.out.println(tree.children);
    }
}