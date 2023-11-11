package lab6;

public class HillClimbing {
	int stepClimbed = 0;
	int stepClimbedAfterRandomRestart = 0;
	int randomRestarts = 0;
	public Node execute(Node initialState) {
		Node current = initialState;
		Node neighbor = null;
		while (true) {
			neighbor = current.getBestNode();
			if(neighbor.getH() < current.getH()) {
				stepClimbed++;
				stepClimbedAfterRandomRestart++;
				current = neighbor;
			}else {
				return current;
			}
		}
				}
		public Node executeHillClimbingWithRandomRestart(Node initialState) {
			Node current = execute(initialState);
			while(current.getH() !=0) {
				current.generateBoard();
				current = execute(current);
				randomRestarts++;
			}
		return current;
		}
	
}
