package MicroC_language.parsing;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import MicroC_language.parsing.MicroCParser.*;
import construct.*;

public class MicroCBuilder_a extends MicroCBaseVisitor<a>{

	
	
	
	@Override
	public a visitAexpr3(Aexpr3Context ctx) {
		if (ctx.IDENTIFIER() != null) {
			String identifier = ctx.IDENTIFIER().toString();
			if (ctx.aexpr() != null) {
                return new ArrayA(identifier, visit(ctx.aexpr())) {};
            }
			return new VariableNames(ctx.INTEGER().toString()) {};
		} else if (ctx.INTEGER() != null) {
			return new IntConst(Integer.parseInt(ctx.INTEGER().toString())) {};
		}

		return visit(ctx.aexpr());
	}


	@Override
	public a visitIdentifier(IdentifierContext ctx) {
		VariableNames x = new VariableNames(ctx.toString()) {	
		};


		return x;
	}

	@Override
	public a visitInteger(IntegerContext ctx) {
		IntConst aInt = new IntConst(Integer.parseInt(ctx.INTEGER().toString())) {
		};
		return aInt;
	}
}
