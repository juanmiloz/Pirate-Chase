package structures.graphArrayList;

import java.util.ArrayList;

import model.Island;

public class Graph<E> {

	Vertex<E> root;
	private int islandsCreated;
	private int[][] adyacencyMatrix;
	
	public Graph() {
		this.root = null;
		islandsCreated = 0;
		adyacencyMatrix = new int[0][0];
	}

	public Vertex<E> getRoot() {
		return root;
	}

	public void setRoot(Vertex<E> root) {
		this.root = root;
	}
	
	public Vertex<E> createVertex(E island) {
		islandsCreated++;
		Vertex<E> vertex = new Vertex<>(island, islandsCreated);
		int[][] newMatrix = new int[islandsCreated][islandsCreated];
		for(int c = 0; c < islandsCreated; c++) {
			for(int v = 0; v < islandsCreated; v++) {
				if(c == islandsCreated - 1 || v == islandsCreated - 1) {
					newMatrix[c][v] = 0;
				} else {
					//System.out.println(adyacencyMatrix.length + " " + c + " " + newMatrix.length);
					//System.out.println(adyacencyMatrix[0].length + " " + v + " " + newMatrix[0].length);
					newMatrix[c][v] = adyacencyMatrix[c][v];
				}
			}
		}
		adyacencyMatrix = newMatrix;
		return vertex;
	}
	
	public void addVertex(Vertex<E> vertex, ArrayList<Vertex<E>> connections, int[] weigths) {
		if(root == null) {
			root = vertex;
			adyacencyMatrix = new int[1][1];
			adyacencyMatrix[0][0] = 0;
		} else {
			addVertexHelper(root, connections, weigths, vertex);
		}
	}
	
	private int addVertexHelper(Vertex<E> current, ArrayList<Vertex<E>> connections, int[] weigths, Vertex<E> newVertex) {
		ArrayList<Partner<E>> connections_vertex = current.getVertexes();
		if(connections.size() == 0 || current.isVisited()) {
			return 0;
		}
		int position_ocurrence = connections.indexOf(current);
		if(position_ocurrence != -1) {
			current.addVertex(weigths[position_ocurrence], newVertex);
			adyacencyMatrix[current.getDni()-1][newVertex.getDni()-1] = weigths[position_ocurrence];
			connections.remove(position_ocurrence);
			int[] newWeigths = new int[weigths.length-1];
			for(int x = 0; x < newWeigths.length; x++) {
				newWeigths[x] = weigths[x+1];
			}
			weigths = newWeigths;
			for(int c = 0; c < connections_vertex.size() - 1; c++) {
				current.setVisited(true);
				addVertexHelper(connections_vertex.get(c).getVertex(), connections, weigths, newVertex);
				current.setVisited(false);
			}
		} else {
			for(int c = 0; c < connections_vertex.size(); c++) {
				current.setVisited(true);
				addVertexHelper(connections_vertex.get(c).getVertex(), connections, weigths, newVertex);
				current.setVisited(false);
			}
		}
		
		/*for(int c = 0; c < connections_vertex.size(); c++) {
			if(connections.get(c).equals(current)) {
				current.addVertex(weigths[c], connections.get(c));
				connections.remove(c);
			}
		}*/
		return 0;
	}
	
	/*public int addVertex(Vertex<E> current, Vertex<E> newVertex, int weigth, ArrayList<Vertex<E>> origins) {
		if(current == null || current.isVisited()) {
			//System.out.println("Visitado: " + current);
			return 0;
		}
		ArrayList<Partner<E>> vertexes = current.getVertexes();
		boolean founded = false;
		for(int c = 0; c < vertexes.size(); c++) {
			for(int v = 0; v < origins.size(); v++) {
				if(vertexes.get(c).getVertex().equals(origins.get(v))) {
					vertexes.get(c).getVertex().addVertex(weigth, newVertex);
					adyacencyMatrix[current.getDni()][newVertex.getDni() - 1] = weigth;
					founded = true;
				}
			}
		}
		if(!founded) {
			current.setVisited(true);
			for(int c = 0; c < vertexes.size(); c++) {
				addVertex(vertexes.get(c).getVertex(), newVertex, weigth, origins);
				
			}
			current.setVisited(false);
		}
		return 0;
	}*/

	public int getIslandsCreated() {
		return islandsCreated;
	}

	public void setIslandsCreated(int islandsCreated) {
		this.islandsCreated = islandsCreated;
	}
	
}
