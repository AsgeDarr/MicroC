package MicroC_language.parsing;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import MicroC_language.parsing.MicroCParser.*;
import construct.IntConst;
import construct.a;

public class MicroCBuilder extends MicroCBaseVisitor<a> {
	
	public a visitInteger(MicroCParser.IntegerContext ctx) {
		IntConst a = new IntConst(Integer.parseInt(ctx.INTEGER().toString())) {};
		return a;
	}

}
