package construct;

public class VariableNames implements a {
	
	private String name;

	public VariableNames(String name) {
		this.name = name;
	}
	
	public String evaluate(Environment Env) {
		return name;
	}

}
