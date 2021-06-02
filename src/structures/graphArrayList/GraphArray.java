package structures.graphArrayList;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class GraphArray<E> {

	VertexArray<E> root;
	private int islandsCreated;
	private int[][] adyacencyMatrix;
	private ArrayList<VertexArray<E>> vertexList = new ArrayList<VertexArray<E>>();
	/**
	 * Name: GraphArray
	 * Constructor of class GraphArray . <br>
	 */
	public GraphArray() {
		this.root = null;
		islandsCreated = 0;
		adyacencyMatrix = new int[0][0];
	}
	/**
	 * Name: getRoot
	 * Method to get root of graph. <br>
	 * @return  VertexArray<E>
	 */
	public VertexArray<E> getRoot() {
		return root;
	}
	/**
	 * Name: setRoot
	 * Method to update root of graph. <br>
	 * @param root ertexArray<E>
	 */
	public void setRoot(VertexArray<E> root) {
		this.root = root;
	}
	/**
	 * Name: setRoot
	 * Method to create vertex. <br>
	 * @param island - E island.
	 * @return VertexArray<E>
	 */
	public VertexArray<E> createVertex(E island) {
		islandsCreated++;
		VertexArray<E> vertex = new VertexArray<>(island, islandsCreated);
		getVertexList().add(vertex);
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
	/**
	 * Name: addVertex
	 * Method to add a new vertex. <br>
	 * @param vertex - new vertex - vertex == VertexArray<E>
	 * @param connections - ArrayList<VertexArray<E>>
	 * @param weigths == int[]
	 */
	public void addVertex(VertexArray<E> vertex, ArrayList<VertexArray<E>> connections, int[] weigths) {
		if(root == null) {
			root = vertex;
			adyacencyMatrix = new int[1][1];
			adyacencyMatrix[0][0] = 0;
		} else {
			addVertexHelper(root, connections, weigths, vertex);
		}
	}
	/**
	 * Name: addVertexHelper
	 * Method to add a helper vertex. <br>
	 * @param current VertexArray<E>
	 * @param connections ArrayList<VertexArray<E>>
	 * @param weigths int[]
	 * @param newVertex VertexArray<E>
	 * @return a int 
	 */
	private int addVertexHelper(VertexArray<E> current, ArrayList<VertexArray<E>> connections, int[] weigths, VertexArray<E> newVertex) {
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
	/**
	 * Name: getIslandsCreated
	 * Method to get islands. <br>
	 * @return int 
	 */
	public int getIslandsCreated() {
		return islandsCreated;
	}
	/**
	 * Name: setIslandsCreated
	 * Method to updates islands. <br>
	 * @param islandsCreated
	 */
	public void setIslandsCreated(int islandsCreated) {
		this.islandsCreated = islandsCreated;
	}
	/**
	 * Name: getVertexList
	 * Method to get vertex list. <br>
	 * @return ArrayList<VertexArray<E>>
	 */
	public ArrayList<VertexArray<E>> getVertexList() {
		return vertexList;
	}
	/**
	 * Name: setVertexList
	 * Method to update vertex list. <br>
	 * @param vertexList
	 */
	public void setVertexList(ArrayList<VertexArray<E>> vertexList) {
		this.vertexList = vertexList;
	}
	/**
	 * Name: getAdjacencyMatrix
	 * Method to get adjacency matrix. <br>
	 * @return int[][]
	 */
	public int[][] getAdjacencyMatrix() {
		return adyacencyMatrix;
	}
	/**
	 * Name: floydWarshall
	 * Method floydWarshall. <br>
	 * @return int[][]
	 */
	public int[][] floydWarshall(){
		int[][] matrix = adyacencyMatrix.clone(); 
		int[][] answer = new int[matrix.length][matrix.length];
		
		//pasar los ceros a un numero grande
	    for(int i = 0; i < answer.length;i++) {
			for(int j = 0; j < answer.length;j++) {
				if(i!=j) {
					if(matrix[i][j]==0) {
						answer[i][j] = 500;
					}else {
						answer[i][j] = matrix[i][j];						
					}
				}
			}
		}

	    //Aplicar warshall
		for(int k = 0; k < answer.length;k++) {
			for(int i = 0; i < answer.length;i++) {
				for(int j = 0; j < answer.length;j++) {
					if(answer[i][j] > (answer[i][k] + answer[k][j])) {
						answer[i][j] = answer[i][k] + answer[k][j];
					}
				}
			}
		}
		
		return answer;
	}
	/**
	 * Name: dijkstra
	 * Method dijkstra. <br>
	 * @param source int
	 * @return Integer[]
	 */
	public Integer[] dijkstra(int source) {
		int[] dist = new int[adyacencyMatrix.length];
		Integer[] prev = new Integer[adyacencyMatrix.length];

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for(int i = 0; i < dist.length; i++) {
			if(i!=source) {
				dist[i] = 500;
			}
			prev[i] = null;

			queue.add(i);
		}

		while(!queue.isEmpty()) {
			int u = queue.remove();
			
			for(int i = 0; i < adyacencyMatrix.length; i++) {
				if(adyacencyMatrix[u][i]!=0) {
					int alt = dist[u] + adyacencyMatrix[u][i];
					if(alt < dist[i]) {
						dist[i] = alt;
						prev[i] = u;
						queue.add(i);
					}
				}
			}
		}
		return prev;
	}
	
}
