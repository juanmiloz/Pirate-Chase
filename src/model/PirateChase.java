package model;

import java.util.ArrayList;

import processing.core.PApplet;
import structures.graphAdjacencyMatrix.Graph;
import structures.graphAdjacencyMatrix.Vertex;

public class PirateChase {


	private Graph<Island> graph;
	private Pirate user;
	private Pirate morgan;
	private PApplet app;


	//Map number 1 (Easy)
	private int[][] mapEasy = {
			//    0	 1  2  3  4  5  6  7  8  9
			/*0*/{0, 4, 3, 7, 0, 0, 0, 0, 0, 0},
			/*1*/{4, 0, 0, 0, 1, 0, 0, 0, 0, 0},
			/*2*/{3, 0, 0, 3, 0, 0, 0, 0, 0, 0},
			/*3*/{7, 0, 3, 0, 3, 5, 3, 4, 0, 0},
			/*4*/{0, 1, 0, 3, 0, 0, 0, 5, 0, 0},
			/*5*/{0, 0, 0, 5, 0, 0, 0, 0, 5, 0},
			/*6*/{0, 0, 0, 3, 0, 0, 0, 0, 5, 4},
			/*7*/{0, 0, 0, 4, 5, 0, 0, 0, 0, 6},
			/*8*/{0, 0, 0, 0, 0, 5, 5, 0, 0, 3},
			/*9*/{0, 0, 0, 0, 0, 0, 4, 6, 3, 0}
	};
	private ArrayList<Vertex<Island>> islands = new ArrayList<>();


	public PirateChase(PApplet app) {
		this.app=app;
		graph = null;
		user = new Pirate();
		morgan = new Pirate();
	}





	public void makeMapEasy() {
		user.setEnergy(15);
		morgan.setEnergy(12);

		//Vertex 0
		Vertex<Island> initial = new Vertex<Island>(new Island(90,420,true,false,0,app));
		islands.add(initial);

		//Vertex 1
		islands.add(new Vertex<Island>(new Island(117,241,false,true,1,app)));


		//Vertex 2
		islands.add(new Vertex<Island>(new Island(288,459,false,true,2,app)));

		//Vertex 3
		islands.add(new Vertex<Island>(new Island(294,263,false,true,3,app)));

		//Vertex 4
		islands.add(new Vertex<Island>(new Island(233,124,4,app)));


		//Vertex 5
		islands.add(new Vertex<Island>(new Island(489,415,5,app)));

		//Vertex 6
		islands.add(new Vertex<Island>(new Island(489,244,6,app)));

		//Vertex 7
		islands.add(new Vertex<Island>(new Island(449,94,7,app)));


		//Vertex 8
		islands.add(new Vertex<Island>(new Island(657,257,8,app)));

		//Vertex 9



		islands.add(new Vertex<Island>(new Island(604,109,9,app)));
		//islands.add(new Vertex<Island>(new Island()));


		graph = new Graph<>(mapEasy,islands);
	}


	public void drawEasyMap() {	
		for (int i = 0; i < islands.size(); i++) {
			islands.get(i).getElement().drawIsland();
		}

	}
	
	
	public int clickOnIsland(int mouseX,int mouseY) {
	
		for (int i = 0; i < islands.size(); i++) {
			if(mouseX>islands.get(i).getElement().getPosX() 
			&& mouseX<islands.get(i).getElement().getPosX()+islands.get(i).getElement().getWidth()
			&& mouseY>islands.get(i).getElement().getPosY()
			&& mouseY<islands.get(i).getElement().getPosY()+islands.get(i).getElement().getHeight()) {
				System.out.println(islands.get(i).getElement().getIslandNumber());
			}
			
		}
		return 0;
	}
	
	public int getUserEnergy() {
		return user.getEnergy();
	}
	
	public int getMorganEnergy() {
		return morgan.getEnergy();
	}

	public void selectdificult(int dificult) {
		switch (dificult) {
		case 1:
			makeMapEasy();
			break;

		case 2:

			break; 

		case 3:

			break;
		}
	}

}
