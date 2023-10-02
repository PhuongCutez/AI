package chapter2.agent_ABCD; 

import java.util.HashMap;
import java.util.Map;

import chapter2.agent_ABCD.EnvironmentABCD.LocationState;

public class EnvironmentStateABCD {
	private Map<String, EnvironmentABCD.LocationState> state = new HashMap<String, EnvironmentABCD.LocationState>();
	private String agentLocation = null;//
	private int score;
	public EnvironmentStateABCD(EnvironmentABCD.LocationState locAState, EnvironmentABCD.LocationState locBState, LocationState locCState, LocationState locDState) {
		this.state.put(EnvironmentABCD.LOCATION_A, locAState);
		this.state.put(EnvironmentABCD.LOCATION_B, locBState);
		this.state.put(EnvironmentABCD.LOCATION_C, locCState);
		this.state.put(EnvironmentABCD.LOCATION_D, locDState);
	}
	
	
	public int getScore() {
		return score;
	}


	public void setScore(int points) {
		this.score = score;
	}


	public void setAgentLocation(String location) {
		this.agentLocation = location;
	}

	public String getAgentLocation() {
		return this.agentLocation;
	}

	public LocationState getLocationState(String location) {
		return this.state.get(location);
	}

	public void setLocationState(String location, LocationState locationState) {
		this.state.put(location, locationState);
	}
	public void increase(int points) {
		score += points;
	}
	public void decrease(int points) {
		score -= points;
	}

	public void display() {
		System.out.println("Environment state: \n\t" + this.state);
	}
}