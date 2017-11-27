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
		private String names;
		
		public x(String names) {
			this.names = names;
		}
		
		public String evaluate(Environment Env) {
			return names;
		}
	}
	
	public abstract class IntConst implements a{
		private int i;
		
		public IntConst(int i) {
			this.i = i;
		}
		
	}

	
	
	
}
