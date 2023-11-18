package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GA_NQueenAlgo {
	public static final int POP_SIZE = 100;//Population size
	public static final double MUTATION_RATE = 0.03;
	public static final int MAX_ITERATIONS = 10000000;
	public GA_NQueenAlgo() {
		initPopulation();
	}
	List<Node> population = new ArrayList<Node>();
	Random rd = new Random();
	// initialize the individuals of the population
	public void initPopulation() {
	for (int i = 0; i < POP_SIZE; i++) {
	Node ni = new Node();
	ni.generateBoard();
	population.add(ni);
	}
	}
	public Node execute() {
		Node re = null;
		for (int i = 0; i < MAX_ITERATIONS; i++) {
			ArrayList<Node> newPopular = new ArrayList<Node>();
			for (int j = 0; j < population.size(); j++) {
				Node x = getParentByRandomSelection();
				Node y = getParentByRandomSelection();
				Node child = reproduce(x, y);
				int bingo = rd.nextInt(100);
				if(rd.nextDouble() < MUTATION_RATE) {
					mutate(child);
			}
				if(child.getH() == 0) {
					return child;
				}
				newPopular.add(child);
				
		}
			this.population = new ArrayList<Node>(population);
	}
		Collections.sort(this.population);
		return this.population.get(0);
	}
	// Mutate an individual by selecting a random Queen and
	//move it to a random row.
	public void mutate(Node node) {
		int index = rd.nextInt(Node.N);
		int newRow = rd.nextInt(Node.N);
		node.setRow(index, newRow);
	}
	//Crossover x and y to reproduce a child
	public Node reproduce(Node x, Node y) {
		int c = rd.nextInt(Node.N);
		Node re = new Node();
		re.generateBoard();
		for (int i = 0; i < c; i++) {
			re.setRow(i, x.getRow(i));//hàng của con tại vị trí i
		}
		for (int i = c; i < Node.N; i++) {
			re.setRow(i, y.getRow(i));
		}
		
	return re;
	}
	// Select K individuals from the population at random and
	//select the best out of these to become a parent.
	public Node getParentByTournamentSelection() {
	int k = 5;
	List<Node> parents = new ArrayList<Node>();
		for (int i = 0; i < k; i++) {
			parents.add(getParentByRandomSelection());		}
		Collections.sort(parents);
	return parents.get(0);
	}
	//Select a random parent from the population
	public Node getParentByRandomSelection() {
	int index = rd.nextInt(100);
	return population.get(index);
	}
	}
	

