package chapter2.agent_ABCD;

public class AgentABCD {
	private AgentProgramABCD program;

	public AgentABCD() {
	}

	public AgentABCD(AgentProgramABCD aProgram) {
		program = aProgram;
	}

	public ActionABCD execute(PerceptABCD p) {
		if (program != null) {
			return program.execute(p);
		}
		return NoOpActionABCD.NO_OP;
	}
}
