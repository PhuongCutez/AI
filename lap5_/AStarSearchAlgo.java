package lap5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AStarSearchAlgo implements IPuzzleAlgo{

	@Override
	public Node execute(Puzzle model) {
			PriorityQueue<Node> frontier = new PriorityQueue<>(PuzzleUtils.HeuristicComparatorByF);
			List<Node> explore = new ArrayList<Node>();
			int dem = 0;
			frontier.add(model.getInitialState());
			while (!frontier.isEmpty()) {
				dem++;
				Node curr = frontier.poll();
				if (curr.equals(model.getGoalState())) {
//					System.out.println(dem);
					return curr;
				}else {
					explore.add(curr);
					List<Node> children = model.getSuccessors(curr);
					for (Node child : children) {
						int newPath = curr.getG() + 1;
						if (!frontier.contains(child) && !explore.contains(child)) {
							child.setG(newPath);
							frontier.add(child);
						} else if (frontier.contains(child) && child.getG() > newPath) {
							frontier.remove(child);
							child.setG(newPath);
							frontier.add(child);
						}
					}
				}
			}

			return null;
	}

}
