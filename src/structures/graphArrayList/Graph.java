package structures.graphArrayList;

import java.util.ArrayList;

public class Graph<E> {

	Vertex<E> root;
	private int islandsCreated;
	
	public Graph() {
		this.root = null;
	}
	
	public Graph(Vertex<E> root){
		this.root = root;
	}

	public Vertex<E> getRoot() {
		return root;
	}

	public void setRoot(Vertex<E> root) {
		this.root = root;
	}
	
	public void generateMatrix() {
		
	}
	
	public int addVertex(Vertex<E> current, Vertex<E> newVertex, int weigth, Vertex<E> origin) {
		if(current == null || current.isVisited() == true) {
			return 0;
		}
		if(current.equals(origin)) {
			current.addVertex(weigth, newVertex);
			return 0;
		}
		ArrayList<Partner<E>> vertexes = current.getVertexes();
		boolean founded = false;
		for(int c = 0; c < vertexes.size(); c++) {
			if(vertexes.get(c).getVertex().equals(origin)) {
				//System.out.println(vertexes.get(c).getVertex() + " is equals to " + origin);
				//System.out.println("Added in: " + vertexes.get(c).getVertex());
				vertexes.get(c).getVertex().addVertex(weigth, newVertex);
				founded = true;
			}
		}
		current.setVisited(true);
		if(!founded) {
			for(int c = 0; c < vertexes.size(); c++) {
				addVertex(vertexes.get(c).getVertex(), newVertex, weigth, origin);
				current.setVisited(false);
			}
		}
		return 0;
	}

	public int getIslandsCreated() {
		return islandsCreated;
	}

	public void setIslandsCreated(int islandsCreated) {
		this.islandsCreated = islandsCreated;
	}
	
}
