package chapter2.agent_ABCD;

public class DynamicActionABCD extends ActionABCD {
	private String name;

	public DynamicActionABCD(String name) {
		this.name = name;
	}

	@Override
	public boolean isNoOp() {
		return false;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
