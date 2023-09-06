package com.example.astpractice;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import com.example.astpractice.gen.*;

public class AstPracticeApplication {

    public static void main(String[] args) {
        String input = "{1, 2} u {3, 1}";

        // Create a CharStream from the input string
        CharStream charStream = CharStreams.fromString(input);

        // Create a lexer that feeds off of the input CharStream
        SetCalcLexer lexer = new SetCalcLexer(charStream);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        System.out.println("tokenStream: " + tokenStream.getText() + "\n");

        // Create a parser that feeds off the tokens buffer
        SetCalcParser parser = new SetCalcParser(tokenStream);

        // Parse the input and get the parse tree
        ParseTree tree = parser.expr();
        System.out.println("tree: " + tree.toStringTree(parser) + "\n");

        // Create a visitor and visit the parse tree to evaluate the expression
        SetCalcVisitor<MathSet<Integer>> visitor = new EvalVisitor();
        MathSet result = visitor.visit(tree);

        // Output the result
        System.out.println("Result: " + result);
    }

}
