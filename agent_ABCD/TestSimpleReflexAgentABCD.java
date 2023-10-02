package chapter2.agent_ABCD; 

public class TestSimpleReflexAgentABCD {
	public static void main(String[] args) {
			EnvironmentABCD env = new EnvironmentABCD(EnvironmentABCD.LocationState.CLEAN, EnvironmentABCD.LocationState.DIRTY,
					EnvironmentABCD.LocationState.CLEAN, EnvironmentABCD.LocationState.DIRTY);
			AgentABCD agent = new AgentABCD(new AgentProgramABCD());
			env.addAgent(agent, EnvironmentABCD.LOCATION_A);


			env.step(20);
		}
}
