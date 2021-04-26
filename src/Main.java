import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.err.println("No filename specified.");
			System.exit(1);
		}
		TreeVisitor HLLvisitor = new TreeVisitor();
		FileInputStream f = new FileInputStream(args[0]);
		ANTLRInputStream HLLInput = new ANTLRInputStream(f);
		CPExpLexer HLLLexer = new CPExpLexer(HLLInput);
		CommonTokenStream HLLTokens = new CommonTokenStream(HLLLexer);
		CPExpParser HLLParser = new CPExpParser(HLLTokens);
		if (HLLParser.getNumberOfSyntaxErrors() > 0) {
			System.err.println("Code Syntax Error! Please check!");
			System.exit(1);
		}
		ParseTree HLLTree = HLLParser.program();
		String result = HLLvisitor.visit(HLLTree);		
		System.out.println(result);
	}
}
