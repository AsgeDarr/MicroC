package construct;
public class BoolVariable  {

	private boolean value;
	
	public BoolVariable(boolean value) {
		this.value = value;
	}

	public boolean evaluate(Environment Env) {
		return value;
	}
	
}
