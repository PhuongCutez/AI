package game_alphabeta_student;

public class Test {
	public static void main(String[] args) {
		MiniMaxSearchAlgo m = new MiniMaxSearchAlgo();
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeI = new Node("I");
		Node nodeJ = new Node("J");
		Node nodeK = new Node("K");
		Node nodeL = new Node("L");
		Node nodeM = new Node("M");
		nodeA.addChild(nodeB);
		nodeA.addChild(nodeC);
		nodeA.addChild(nodeD);
		nodeB.addChild(nodeE);
		nodeB.addChild(nodeF);
		nodeB.addChild(nodeG);
		nodeC.addChild(nodeH);
		nodeC.addChild(nodeI);
		nodeC.addChild(nodeJ);
		nodeD.addChild(nodeK);
		nodeD.addChild(nodeL);
		nodeD.addChild(nodeM);
		nodeE.setValue(3);
		nodeF.setValue(12);
		nodeG.setValue(8);
		nodeH.setValue(2);
		nodeI.setValue(4);
		nodeJ.setValue(6);
		nodeK.setValue(14);
		nodeL.setValue(5);
		nodeM.setValue(2);
		
//		System.out.println(m.minValue(nodeA));
//		System.out.println(m.maxValue(nodeA));
//		m.execute(nodeA);
//		System.out.println(nodeA.getValue());
		
		AlphaBetaSearchAlgo a = new AlphaBetaSearchAlgo();
//		
		a.execute(nodeA);
		System.out.println(nodeA.getValue());

		AlphaBetaRightToLeftSearchAlgo ar = new AlphaBetaRightToLeftSearchAlgo();
		ar.execute(nodeC);
		System.out.println(nodeC.getValue());


	}
}
