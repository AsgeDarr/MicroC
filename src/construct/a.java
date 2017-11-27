package construct;
public abstract interface a {
	
	public abstract class ArrayA implements a {
		private String variableName;
		private a index;
		
		public ArrayA(String variableName, a a) {
			this.index = a;
			this.variableName = variableName;
		}
	}

	public abstract class x implements a{
		private VariableNames names;
		
		public x(VariableNames names) {
			this.names = names;
		}
	}
	
	public abstract class IntConst implements a{
		private IntegerConstants i;
		
		public IntConst(IntegerConstants i) {
			this.i = i;
		}
		
	}
	
	public abstract class ArithmeticOpr implements a	{
		
		private a a1;
		private a a2;
		private opB opr;

		public ArithmeticOpr(a a1, a a2, opB opr)	{
			this.a1 = a1;
			this.a2 = a2;
			this.opr = opr;
		}
	}

	
	
	
}
