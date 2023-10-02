package chapter2.agent_ABCD;

import java.nio.file.attribute.AclEntryFlag;
import java.util.Random;

import chapter2.agent_ABCD.EnvironmentABCD.LocationState;

public class AgentProgramABCD {

	public ActionABCD execute(PerceptABCD p) {// location, status
	
		if(p.getLocationState() == LocationState.DIRTY) {
			return EnvironmentABCD.SUCK_DIRT;
			
		}else {
			if(p.getAgentLocation() == EnvironmentABCD.LOCATION_A) {
				return EnvironmentABCD.getRandom();
			}else if(p.getAgentLocation() == EnvironmentABCD.LOCATION_B) {
				return EnvironmentABCD.getRandom();
			}else if(p.getAgentLocation() == EnvironmentABCD.LOCATION_C) {
				return EnvironmentABCD.getRandom();
			}else if(p.getAgentLocation() == EnvironmentABCD.LOCATION_D){
				return EnvironmentABCD.getRandom();
			}
		}
		return NoOpActionABCD.NO_OP;
	}
}