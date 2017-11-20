package construct;
public class BoolVariable extends BoolExp {

	private boolean value;
	
	public BoolVariable(boolean value) {
		this.value = value;
	}

	@Override
	public boolean evaluate(Environment Env) {
		return value;
	}
	
}
