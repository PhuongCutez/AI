package lab6;

public class SimulateAnnealingSearch {
	public Node execute(Node initialState) {
			Node current = initialState;
			Node next = null;
			int T = 1000;
			while(current.getH() != 0) {
				if(T == 0) break;
				next = current.selectNextRandomCandidate();
				int deltaE = next.getH() - current.getH();
				if(deltaE < 0) current = next;
				else {
					if(Math.exp(-deltaE/T) > Math.random())
						current = next;
				}
			}
			return current;
		}
	}