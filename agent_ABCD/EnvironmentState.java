package chapter2.agent_ABCD; 

import java.util.HashMap;
import java.util.Map;

import chapter2.agent_ABCD.Environment.LocationState;

public class EnvironmentState {
	private Map<String, Environment.LocationState> state = new HashMap<String, Environment.LocationState>();
	private String agentLocation = null;//
	private int score;
	public EnvironmentState(Environment.LocationState locAState, Environment.LocationState locBState, LocationState locCState, LocationState locDState) {
		this.state.put(Environment.LOCATION_A, locAState);
		this.state.put(Environment.LOCATION_B, locBState);
		this.state.put(Environment.LOCATION_C, locCState);
		this.state.put(Environment.LOCATION_D, locDState);
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