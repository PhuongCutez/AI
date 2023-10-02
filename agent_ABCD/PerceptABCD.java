package chapter2.agent_ABCD; 

public class PerceptABCD {
	private String agentLocation;
	private EnvironmentABCD.LocationState state;

	public PerceptABCD(String agentLocation, EnvironmentABCD.LocationState state) {
		this.agentLocation = agentLocation;
		this.state = state;
	}

	public EnvironmentABCD.LocationState getLocationState() {
		return this.state;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}
}