package game_nim_student;

import java.util.Arrays;
import java.util.List;

public class TestNode {
	public static void main(String[] args) {
		Node node = new Node();
		Integer[] data = { 3,3,1 };
		node.addAll(Arrays.asList(data));
//
//		MinimaxAlgo algo = new MinimaxAlgo();
//		algo.execute(node);
//		node.addAll(Arrays.asList(data));
		System.out.println(node.getSuccessors());
//		Integer[] data1 = { 6, 1 };
//		node.addAll(Arrays.asList(data1));
		MinimaxAlgo algo = new MinimaxAlgo();
		algo.execute(node);
	}
}