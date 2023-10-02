package chapter2.agent_ABCD;

import java.nio.file.attribute.AclEntryFlag;
import java.util.Random;

import chapter2.agent_ABCD.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
	
		if(p.getLocationState() == LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
			
		}else {
			if(p.getAgentLocation() == Environment.LOCATION_A) {
				return Environment.getRandom();
			}else if(p.getAgentLocation() == Environment.LOCATION_B) {
				return Environment.getRandom();
			}else if(p.getAgentLocation() == Environment.LOCATION_C) {
				return Environment.getRandom();
			}else if(p.getAgentLocation() == Environment.LOCATION_D){
				return Environment.getRandom();
			}
		}
		return NoOpAction.NO_OP;
	}
}