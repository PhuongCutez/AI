package lab7;

public class Test {
	public static void main(String[] args) {
		GA_NQueenAlgo ga = new GA_NQueenAlgo();
		Node node = ga.execute();
		System.out.println(node.getH());
		node.displayBoard();
	}

}
