package chapter2.agent_ABCD; 

public class NoOpActionABCD extends ActionABCD {
	public static final NoOpActionABCD NO_OP = new NoOpActionABCD();

	public boolean isNoOp() {
		return true;
	}
}