import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeVisitor HLLvisitor = new TreeVisitor();
		//FileInputStream f = new FileInputStream("test.txt");
		String f="while x<9 do {if b=1+4 then A=9/2 else c=9*n}";
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
		//HLLvisitor.visit(HLLTree);	
		System.out.println(result);
		
	}

}
