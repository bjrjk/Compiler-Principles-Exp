import java.util.HashMap;
import org.antlr.runtime.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class TreeVisitor extends CPExpBaseVisitor<String> {
	
	private Counter VariableCounter = new Counter();
	private Counter LabelCounter = new Counter();
	private HashMap<ParserRuleContext, String> StorageMgr = new HashMap<ParserRuleContext, String>();
	
	@Override
	public String visitProgram(CPExpParser.ProgramContext ctx) {
		String code = "";
		for(CPExpParser.StatementContext statement: ctx.statement()) {
			code += visit(statement) + "\n";
		}
		return code;
	}

	@Override
	public String visitAssign(CPExpParser.AssignContext ctx) {
		//TODO
		return visitChildren(ctx);
	}


	@Override
	public String visitIf(CPExpParser.IfContext ctx) {
		String conditionCode = visit(ctx.condition());
		String statementCode = visit(ctx.statement(0));
		String elseCode = "";
		if(ctx.statement().size() != 1) {
			elseCode = visit(ctx.statement(1));
		}
		String jmpLbl = LabelCounter.getNewLabelID();
		String finishLbl = LabelCounter.getNewLabelID();
		String jmpCode = String.format("if %s = 0 goto %s\n", 
				StorageMgr.get(ctx.condition()), jmpLbl);
		String thenJmpCode = String.format("goto %s\n", 
				finishLbl);
		return conditionCode + jmpCode + statementCode + thenJmpCode + 
				String.format("%s:\n", jmpLbl) + elseCode +
				String.format("%s:\n", finishLbl);
	}


	@Override
	public String visitWhile(CPExpParser.WhileContext ctx) {
		//TODO
		return visitChildren(ctx);
	}

	
	@Override
	public String visitBlock(CPExpParser.BlockContext ctx) {
		//TODO
		return visitChildren(ctx);
	}


	@Override
	public String visitCondition(CPExpParser.ConditionContext ctx) {
		String tmpVarName = VariableCounter.getNewVarID();
		StorageMgr.put(ctx, tmpVarName);
		ParserRuleContext E1 = ctx.expression().get(0), E2 = ctx.expression().get(1);
		String E1Code = visit(E1);
		String E2Code = visit(E2);
		String LocalCode = String.format("%s := %s %c %s\n", 
				tmpVarName, StorageMgr.get(E1), ctx.op.getText(), StorageMgr.get(E2)
				);
		return E1Code + E2Code + LocalCode;
	}


	@Override
	public String visitIDNExpr(CPExpParser.IDNExprContext ctx) {
		//TODO
		return visitChildren(ctx);
	}


	@Override
	public String visitLowArithExpr(CPExpParser.LowArithExprContext ctx) {
		//TODO
		return visitChildren(ctx);
	}


	@Override
	public String visitIntExpr(CPExpParser.IntExprContext ctx) {
		String intLiteral = visit(ctx.integer());
		StorageMgr.put(ctx, intLiteral);
		return "";
	}


	@Override
	public String visitParenExpr(CPExpParser.ParenExprContext ctx) {
		String code = visit(ctx.expression());
		StorageMgr.put(ctx, StorageMgr.get(ctx.expression()));
		return code;
	}

	@Override
	public String visitHighArithExpr(CPExpParser.HighArithExprContext ctx) {
		String tmpVarName = VariableCounter.getNewVarID();
		StorageMgr.put(ctx, tmpVarName);
		ParserRuleContext E1 = ctx.expression().get(0), E2 = ctx.expression().get(1);
		String E1Code = visit(E1);
		String E2Code = visit(E2);
		String LocalCode = String.format("%s := %s %c %s\n", 
				tmpVarName, StorageMgr.get(E1), ctx.op.getText(), StorageMgr.get(E2)
				);
		return E1Code + E2Code + LocalCode;
	}

	@Override
	public String visitInt10P(CPExpParser.Int10PContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitInt8P(CPExpParser.Int8PContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitInt16P(CPExpParser.Int16PContext ctx) {
		return ctx.getText();
	}
}
