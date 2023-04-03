package org.example.ex6;

// Import generated files
import com.AlfEx6.parser.AlfLexer;
import com.AlfEx6.parser.AlfParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) {
        String input = "int _var1 = 2 + 3 * 5;";
        AlfLexer lexer = new AlfLexer(CharStreams.fromString(input));
        AlfParser parser = new AlfParser(new CommonTokenStream(lexer));
        AlfParser.StartContext tree = parser.start();
        System.out.println(tree.children);
    }
}