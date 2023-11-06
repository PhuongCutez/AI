package lap5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HillClimbing implements IPuzzleAlgo{

	@Override
	public Node execute(Puzzle model) {
			PriorityQueue<Node> frontier = new PriorityQueue<>(PuzzleUtils.HeuristicComparatorByH);
			List<Node> explore = new ArrayList<>();
			int dem = 0;

			Node temp = model.getInitialState();
			temp.setH(model.computeH2(temp));
			frontier.add(temp);
			while (!frontier.isEmpty()) {
				Node curr = frontier.poll();
				dem++;
//				System.out.println("H=" + current.getH() + "\n" + current);
				if(curr.equals(model.getGoalState())) {
//					System.out.println(dem);
					return curr;
				}
				else {
					explore.add(curr);
					List<Node> children = model.getSuccessors(curr);
					int min = Integer.MAX_VALUE;
					for (Node child : children) {
						if (!frontier.contains(child) && !explore.contains(child) && child.getH() <= curr.getH()) {
							frontier.add(child);
						}
					}
					if (frontier.isEmpty() ) {
						frontier.addAll(children);

					}
				}

			}
			System.out.println("Khong tim thay ");
			return null;
	}

}
