package game_alphabeta_student;

import java.util.Collections;

public class AlphaBetaRightToLeftSearchAlgo implements ISearchAlgo {

	 @Override
	    public void execute(Node node) {
	        int v = maxValue(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	        node.setValue(v);
	    }

	    public int maxValue(Node node, int alpha, int beta) {
	        if (node.isTerminal()) {
	            return node.getValue();
	        }

	        int v = Integer.MIN_VALUE;

	        // Reverse the order of children
	        Collections.reverse(node.getChildren());

	        for (Node child : node.getChildren()) {
	            int minVal = minValue(child, alpha, beta);
	            v = Math.max(v, minVal);

	            alpha = Math.max(alpha, v);

	            if (beta <= alpha) {
	                break; // Beta cut-off
	            }
	        }

	        // Restore the original order of children
	        Collections.reverse(node.getChildren());

	        return v;
	    }

	    public int minValue(Node node, int alpha, int beta) {
	        if (node.isTerminal()) {
	            return node.getValue();
	        }

	        int v = Integer.MAX_VALUE;

	        // Reverse the order of children
	        Collections.reverse(node.getChildren());

	        for (Node child : node.getChildren()) {
	            int maxVal = maxValue(child, alpha, beta);
	            v = Math.min(v, maxVal);

	            beta = Math.min(beta, v);

	            if (beta <= alpha) {
	                break; // Alpha cut-off
	            }
	        }

	        // Restore the original order of children
	        Collections.reverse(node.getChildren());

	        return v;
	    }

}
