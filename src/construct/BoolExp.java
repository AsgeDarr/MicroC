package construct;
public abstract class BoolExp {
	public abstract boolean evaluate(Environment Env) throws VariableNotDefinedException;
}
