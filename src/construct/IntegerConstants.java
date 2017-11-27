package construct;

public class IntegerConstants implements a {
	
	private int value;

	public IntegerConstants(int value) {
		this.value = value;
	}
	
	public int evaluate(Environment Env) {
		return value;
	}

}
