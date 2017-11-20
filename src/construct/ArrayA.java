package construct;

import MicroC_language.parsing.MicroCParser.AexprContext;

public abstract class ArrayA implements a {
	private String variableName;
	private a index;
	
	public ArrayA(String variableName, a a) {
		this.index = a;
		this.variableName = variableName;
	}
}

