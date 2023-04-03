package org.example.ex1;

// Import generated files
import com.AlfEx1.parser.AlfLexer;
import com.AlfEx1.parser.AlfParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) {
        String input = "int _var1 = 2;\n" +
                "float _var2 = 5.55;\n" +
                "string _var3 = \"alf\"; ";
        AlfLexer lexer = new AlfLexer(CharStreams.fromString(input));
        AlfParser parser = new AlfParser(new CommonTokenStream(lexer));
        AlfParser.DeclarationContext tree = parser.declaration();
    }
}