package lap5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class GreedyBestFirstSearch implements IPuzzleAlgo {

	@Override
	public Node execute(Puzzle model) {
		PriorityQueue<Node> fronter = new PriorityQueue<Node>(PuzzleUtils.HeuristicComparatorByH);
		ArrayList<Node> explore = new ArrayList<Node>();
		fronter.add(model.getInitialState());
		while(!fronter.isEmpty()) {
			Node curr = fronter.poll();
			if(curr.getH() == 0) {
				return curr;
			}else {
				explore.add(curr);
				List<Node> child = model.getSuccessors(curr);
				for (Node node : child) {
					if(!fronter.contains(node) && !explore.contains(node)) {
						node.setG(curr.getG() + 1);
						fronter.add(node);
		
					}
				}
			}
			
		}
		return null;
	}

}
