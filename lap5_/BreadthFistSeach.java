package lap5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFistSeach implements IPuzzleAlgo {

	@Override
	public Node execute(Puzzle model) {
		Queue<Node> frontier = new LinkedList<>();
		List<Node> explore = new ArrayList<>();
		int dem = 0;

		frontier.add(model.getInitialState());
		while(!frontier.isEmpty()) {
			dem++;
			Node curr = frontier.poll();
			if(curr.equals(model.getGoalState())) {
//				System.out.println(dem);
				return curr;
			}
			else {
				explore.add(curr);
				List<Node> children = model.getSuccessors(curr);
				for (Node child : children) {
					if(!frontier.contains(child) && !explore.contains(child)) {
						frontier.add(child);
					}
				}
			}
		}
		return null;
	}

}
