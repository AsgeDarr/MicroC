public class VariableNames implements a{
	private String names;
	
	public VariableNames(String names) {
		this.names = names;
	}
	
	public String evaluate(Environment Env) {
		return names;
	}
}
