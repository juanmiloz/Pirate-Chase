package model;

import java.util.ArrayList;

import structures.graphAdjacencyMatrix.Graph;
import structures.graphAdjacencyMatrix.Vertex;

public class PirateChase {

	
	private Graph<Island> graph;
	private Pirate user;
	private Pirate morgan;
	
	//Map number 1 (Easy)
	private int[][] mapEasy = {
		//   0	1  2  3  4  5  6  7  8
	   /*0*/{0, 4, 3, 0, 1, 0, 0, 0, 0},
	   /*1*/{4, 0, 0, 1, 0, 0, 0, 0, 0},
	   /*2*/{3, 0, 0, 0, 4, 0, 0, 0, 0},
	   /*3*/{0, 1, 0, 0, 3, 0, 1, 0, 0},
	   /*4*/{1, 0, 4, 3, 0, 5, 1, 0, 3},
	   /*5*/{0, 0, 0, 0, 5, 0, 0, 0, 5},
	   /*6*/{0, 0, 0, 1, 1, 0, 0, 2, 4},
	   /*7*/{0, 0, 0, 0, 0, 0, 2, 0, 3},
	   /*8*/{0, 0, 0, 0, 3, 5, 4, 3, 0},
	};
	private ArrayList<Vertex<Island>> islands = new ArrayList<>();
	
	
	public PirateChase() {
		this.graph = null;
		this.user = null;
		this.morgan = new Pirate();
	}
	
	public void makeMapEasy(String name) {
		user.setName(name);
		user.setEnergy(12);
		
		Vertex<Island> initial = new Vertex<Island>(new Island(false,false, false));
		initial.getElement().setGoodPirate(user);
	
		islands.add(initial);
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, true)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		islands.add(new Vertex<Island>(new Island(false,false, false)));
		
		graph = new Graph<>(mapEasy,islands);
	}

	public void selectdificult(int dificult, String name) {
		switch (dificult) {
			case 1:
				makeMapEasy(name);
			break;
			
			case 2:
				
			break; 
				
			case 3:
				
			break;
		}
	}
	
}
