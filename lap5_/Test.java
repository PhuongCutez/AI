package lap5;

import lap23.k21.DepthFirstSearchTask12;

public class Test {
		public static void main(String[] args) {
			Puzzle p = new Puzzle();
			p.readInput("D:\\AI\\txt\\PuzzleMap.txt","D:\\AI\\txt\\PuzzleGoalState.txt");
			System.out.println(p);
			Node initialState = p.getInitialState();
			Node tmp = new Node(initialState);
		
//			System.out.println(initialState.equals(tmp));
//			Node goalState = p.getGoalState();
//			System.out.println(p.getInitialState());
//			System.out.println("H: "+initialState.getH());
//			System.out.println(Arrays.toString(initialState.getWhiteTilePosition()));
//			System.out.println(p.getGoalState());
//			Node re = p.moveWhiteTile(initialState, 'r');
	//
//			System.out.println(re);
//			System.out.println(re.getH());
//			System.out.println(initialState);
//			System.out.println(Arrays.toString(re.getWhiteTilePosition()));
//			System.out.println(p.computeH(init, goal));

			// System.out.println(p.getInitialState());
			// System.out.println(p.getGoalState());
			//
			// List<Node> children = p.getSuccessors(initialState);
			// System.out.println("Size: "+children.size());
			// for (Node child : children) {
			// System.out.println(child.getH()+" "+p.computeH(child) );
			// }
			// Task2
			GreedyBestFirstSearch greedy = new GreedyBestFirstSearch();
			long startTimeGreedy = System.currentTimeMillis();
			Node greedyResult = greedy.execute(p);
			long endTimeGreedy = System.currentTimeMillis();
			System.out.println("Thời gian chạy Greedy: "+(endTimeGreedy-startTimeGreedy)+"ms");
			System.out.println(greedyResult);

			AStarSearchAlgo aS = new AStarSearchAlgo();
			long sS = System.currentTimeMillis();
			Node aR = aS.execute(p);
			long eS = System.currentTimeMillis();
			System.out.println("Thời gian chạy A*: "+(eS-sS)+"ms");
			System.out.println(aR);

			
			BreadthFistSeach bfs = new BreadthFistSeach();
			long stB = System.currentTimeMillis();
			Node bR = bfs.execute(p);
			long endB = System.currentTimeMillis();
			System.out.println("Thời gian chạy bfs: "+(endB-stB)+"ms");
			System.out.println(bR);

			DeathFistSearch dfs = new DeathFistSearch();
			long stD = System.currentTimeMillis();
			Node dfsR = dfs.execute(p);
			long endTimeDFS = System.currentTimeMillis();
			System.out.println("Thời gian chạy dfs: "+(endTimeDFS-stD)+"ms");
			System.out.println(dfsR);

			HillClimbing h = new HillClimbing();
			long sH = System.currentTimeMillis();
			Node re = h.execute(p);
			long eH = System.currentTimeMillis();
			System.out.println("Thời gian chạy Hill Climbing: "+(eH-sH)+"ms");
			System.out.println(re);

			
		}
		

}

