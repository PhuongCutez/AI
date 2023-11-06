package lap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeathFistSearch implements IPuzzleAlgo {

	@Override
	public Node execute(Puzzle model) {
		Stack<Node> frontier = new Stack();
		List<Node> explore = new ArrayList<>();
		int dem = 0;
		int lever = 0;// Nếu lever lớn hơn 5 không tiếp tục xét node con

		frontier.add(model.getInitialState());

		first: while(!frontier.isEmpty()) {
			dem++;
			Node curr = frontier.pop();
			if(curr.equals(model.getGoalState())) {
//				System.out.println(dem);
				return curr;
			}
			else if(lever<=5){
				explore.add(curr);
				List<Node> children = model.getSuccessors(curr);
				for (int i = children.size()-1; i >= 0; i--) {
					if(!frontier.contains(children.get(i)) && !explore.contains(children.get(i))) {
						frontier.add(children.get(i));
					}
				}
			}else {
				lever=0;
				continue first;
			}
			lever++;
		}
		return null;
	}

}
