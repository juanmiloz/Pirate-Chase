package model;

import java.util.ArrayList;

import processing.core.PApplet;
import structures.graphAdjacencyMatrix.Graph;
import structures.graphAdjacencyMatrix.Vertex;
import structures.graphArrayList.GraphArray;
import structures.graphArrayList.VertexArray;

public class PirateChase {


	private Graph<Island> graph;
	private GraphArray<Island> graphArray;
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
	
	private int[][] mapHard = {
			//     0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15
			/*0 */{0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			/*1 */{3, 0, 0, 8, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			/*2 */{3, 0, 0, 0, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			/*3 */{0, 8, 0, 0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0},
			/*4 */{0, 7, 5, 0, 0, 0, 0, 8, 3, 0, 0, 0, 0, 0, 0, 0},
			/*5 */{0, 0, 8, 5, 0, 0, 0, 0, 5, 9, 0, 0, 0, 0, 0, 0},
			/*6 */{0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0},
			/*7 */{0, 0, 0, 6, 8, 0, 2, 0, 0, 0, 0, 0, 0, 7, 0, 0},
			/*8 */{0, 0, 0, 0, 3, 5, 0, 0, 0, 6, 0, 6, 0, 0, 0, 0},
			/*9 */{0, 0, 0, 0, 0, 9, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0},
			/*10*/{0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 9, 0, 0},
			/*11*/{0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 7, 10, 0},
			/*12*/{0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 2, 0},
			/*13*/{0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 9, 7, 0, 0, 0, 9},
			/*14*/{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 2, 0, 0, 6},
			/*15*/{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 6, 0}
	};
	private ArrayList<Vertex<Island>> islands = new ArrayList<>();
	private ArrayList<VertexArray<Island>> islandsArray = new ArrayList<>();


	public PirateChase(PApplet app) {
		this.app=app;
		setGraph(null);
		user = new Pirate();
		morgan = new Pirate();
		graphArray = new GraphArray<Island>();
	}


	public void generateMediumMap() {
		islandsArray.clear();
		user.setEnergy(15);
		morgan.setEnergy(12);
		VertexArray<Island> vt1 = graphArray.createVertex(new Island(0,0,true,false,0,app));
		graphArray.addVertex(vt1, null, null);
		
		VertexArray<Island> vt2 = graphArray.createVertex(new Island(20,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections2 = new ArrayList<VertexArray<Island>>();
		connections2.add(vt1);
		int[] weigths2 = {2};
		graphArray.addVertex(vt2, connections2, weigths2);
		
		VertexArray<Island> vt3 = graphArray.createVertex(new Island(40,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections3 = new ArrayList<VertexArray<Island>>();
		connections3.add(vt2);
		int[] weigths3 = {3};
		graphArray.addVertex(vt3, connections3, weigths3);
		
		VertexArray<Island> vt4 = graphArray.createVertex(new Island(60,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections4 = new ArrayList<VertexArray<Island>>();
		connections4.add(vt3);
		int[] weigths4 = {2};
		graphArray.addVertex(vt4, connections4, weigths4);
		
		VertexArray<Island> vt5 = graphArray.createVertex(new Island(80,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections5 = new ArrayList<VertexArray<Island>>();
		connections5.add(vt4);
		int[] weigths5 = {4};
		graphArray.addVertex(vt5, connections5, weigths5);
		
		VertexArray<Island> vt6 = graphArray.createVertex(new Island(100,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections6 = new ArrayList<VertexArray<Island>>();
		connections6.add(vt5);
		int[] weigths6 = {1};
		graphArray.addVertex(vt6, connections6, weigths6);
		
		VertexArray<Island> vt7 = graphArray.createVertex(new Island(120,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections7 = new ArrayList<VertexArray<Island>>();
		connections7.add(vt2);
		int[] weigths7 = {4};
		graphArray.addVertex(vt7, connections7, weigths7);
		
		VertexArray<Island> vt8 = graphArray.createVertex(new Island(140,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections8 = new ArrayList<VertexArray<Island>>();
		connections8.add(vt2);
		connections8.add(vt7);
		int[] weigths8 = {3, 5};
		graphArray.addVertex(vt8, connections8, weigths8);
		
		VertexArray<Island> vt9 = graphArray.createVertex(new Island(160,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections9 = new ArrayList<VertexArray<Island>>();
		connections9.add(vt3);
		int[] weigths9 = {3};
		graphArray.addVertex(vt9, connections9, weigths9);
		
		VertexArray<Island> vt10 = graphArray.createVertex(new Island(180,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections10 = new ArrayList<VertexArray<Island>>();
		connections10.add(vt8);
		connections10.add(vt9);
		int[] weigths10 = {7, 4};
		graphArray.addVertex(vt10, connections10, weigths10);
		
		VertexArray<Island> vt11 = graphArray.createVertex(new Island(200,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections11 = new ArrayList<VertexArray<Island>>();
		connections11.add(vt10);
		connections11.add(vt5);
		int[] weigths11 = {3, 5	};
		graphArray.addVertex(vt11, connections11, weigths11);
		
		VertexArray<Island> vt12 = graphArray.createVertex(new Island(220,0,true,false,0,app));
		ArrayList<VertexArray<Island>> connections12 = new ArrayList<VertexArray<Island>>();
		connections12.add(vt10);
		connections12.add(vt11);
		int[] weigths12 = {6, 2};
		graphArray.addVertex(vt12, connections12, weigths12);
		islandsArray.addAll(graphArray.getVertexList());
	}

	public void makeMapHard() {
		islands.clear();
		user.setEnergy(15);
		morgan.setEnergy(12);
		
		islands.add(new Vertex<Island>(new Island(0,0,0,app)));
		islands.add(new Vertex<Island>(new Island(20,0,1,app)));
		islands.add(new Vertex<Island>(new Island(40,0,2,app)));
		islands.add(new Vertex<Island>(new Island(60,0,3,app)));
		islands.add(new Vertex<Island>(new Island(80,0,4,app)));
		islands.add(new Vertex<Island>(new Island(100,0,5,app)));
		islands.add(new Vertex<Island>(new Island(120,0,6,app)));
		islands.add(new Vertex<Island>(new Island(140,0,7,app)));
		islands.add(new Vertex<Island>(new Island(160,0,8,app)));
		islands.add(new Vertex<Island>(new Island(180,0,9,app)));
		islands.add(new Vertex<Island>(new Island(200,0,10,app)));
		islands.add(new Vertex<Island>(new Island(220,0,11,app)));
		islands.add(new Vertex<Island>(new Island(240,0,12,app)));
		islands.add(new Vertex<Island>(new Island(260,0,13,app)));
		islands.add(new Vertex<Island>(new Island(280,0,14,app)));
		islands.add(new Vertex<Island>(new Island(300,0,15,app)));
		setGraph(new Graph<>(mapHard,islands));
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


		setGraph(new Graph<>(mapEasy,islands));
	}


	public void drawEasyMap() {	
		for (int i = 0; i < islands.size(); i++) {
			graph.getVertexes().get(i).getElement().drawIsland();
			//islands.get(i).getElement().drawIsland();
		}
	}
	
	public void drawHardMap() {	
		for (int i = 0; i < islands.size(); i++) {
			islands.get(i).getElement().drawIsland();
		}
	}
	
	public void drawMediumMap() {
		for (int i = 0; i < islandsArray.size(); i++) {
			islandsArray.get(i).getElement().drawIsland();
		}
	}
	
	
	public int clickOnIsland(int mouseX,int mouseY) {
	
		for (int i = 0; i < islands.size(); i++) {
			if(mouseX>islands.get(i).getElement().getPosX() 
			&& mouseX<islands.get(i).getElement().getPosX()+islands.get(i).getElement().getWidth()
			&& mouseY>islands.get(i).getElement().getPosY()
			&& mouseY<islands.get(i).getElement().getPosY()+islands.get(i).getElement().getHeight()) {
				System.out.println(islands.get(i).getElement().getIslandNumber());
				int numIsland = graph.getVertexes().get(i).getElement().getIslandNumber();	
				
				if(graph.getAdjacencyMatrix()[user.getCurrentIsland()][numIsland] != 0) {
					graph.getVertexes().get(numIsland).getElement().setOccupied(true);
					for(int j = 0; j < graph.getVertexes().size();j++) {
						if(graph.getAdjacencyMatrix()[user.getCurrentIsland()][j] != 0 && graph.getAdjacencyMatrix()[j][numIsland] == 0) {
							graph.getVertexes().get(j).getElement().setAdyacent(false);
						}
					}
					for(int j = 0; j < graph.getVertexes().size();j++) {
						if(graph.getAdjacencyMatrix()[numIsland][j] != 0) {
							graph.getVertexes().get(j).getElement().setAdyacent(true);
						}
					}
					graph.getVertexes().get(user.getCurrentIsland()).getElement().setOccupied(false);
					graph.getVertexes().get(user.getCurrentIsland()).getElement().setAdyacent(true);
					user.setEnergy(user.getEnergy()-graph.getAdjacencyMatrix()[user.getCurrentIsland()][numIsland]);
					user.setCurrentIsland(numIsland);
				}else {
					System.err.println("No es adyacente	");
				}
			}
		}
		if(user.getEnergy()<=0) {
			return 7;
		}
		if(user.getCurrentIsland()==(graph.getVertexes().size()-1)) {
			return 8;
		}
		return 4;
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


	public Graph<Island> getGraph() {
		return graph;
	}


	public void setGraph(Graph<Island> graph) {
		this.graph = graph;
	}


	public ArrayList<VertexArray<Island>> getIslandsArray() {
		return islandsArray;
	}


	public void setIslandsArray(ArrayList<VertexArray<Island>> islandsArray) {
		this.islandsArray = islandsArray;
	}

}
