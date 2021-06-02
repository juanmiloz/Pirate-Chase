package structures.graphAdjacencyMatrix;

import java.util.ArrayList;
import java.util.PriorityQueue;

import exception.AmountOfDataException;
import exception.ConnectioDoesNotExistException;
import exception.EdgeInvalidException;

public class Graph<E> implements GraphInterface<E>{

	private int [][] adjacencyMatrix;
	private ArrayList<Vertex<E>> vertexes;
	/**
	 * Name: Graph
	 * Constructor of Graph . <br>
	 */
	public Graph() {
		adjacencyMatrix = new int[0][0];
		vertexes = new ArrayList<>();
	}
	/**
	 * Name: Graph
	 * Constructor of Graph . <br>
	 * @param adjacencyMatrix - Matrix adjacency - adjacencyMatrix == int[][]
	 * @param vertexes - ArrayList<Vertex<E>>
	 */
	public Graph(int[][] adjacencyMatrix, ArrayList<Vertex<E>> vertexes) {
		this.adjacencyMatrix = adjacencyMatrix;
		this.vertexes = vertexes;
	}
	/**
	 * Name: addVertex
	 * Method to add a new vertex. <br>
	 */
	@Override
	public void addVertex(E element, int[]edges, int[]weights) throws EdgeInvalidException, AmountOfDataException{
		if(edges.length == weights.length) {
			Vertex<E> newVertex = new Vertex<E>(element);
			vertexes.add(newVertex);
			enlargeMatrix();
			for(int i = 0; i < edges.length; i++) {
				if(edges[i]<adjacencyMatrix.length-1) {
					addEdge(adjacencyMatrix.length-1,edges[i],weights[i]);
				}else {
					throw new EdgeInvalidException();
				}
			}
		}else {
			throw new AmountOfDataException();
		}
	}
	/*
	 * Name: enlargeMatrix
	 * Method to large matrix. <br>
	 */
	@Override
	public void enlargeMatrix() {
		int n = adjacencyMatrix.length;
		int [][] temp = adjacencyMatrix.clone();
		adjacencyMatrix = new int [n+1][n+1];
		
		for(int i = 0; i<n+1;i++) {
			for(int j = 0; j<n+1;j++) {
				adjacencyMatrix[i][j]=(i<n && j<n)?temp[i][j]:0;
			}
		}
	}
	/**
	 * Name: addEdge
	 * Method to add a new edge. <br>
	 * @param numVertex1 - numVertex1 vertex number 1 - numVertex1 = int
	 * @param numVertex2 - numVertex2 vertex number 2 - numVertex2 = int
	 * @param weight - weight of edge - weight == int
	 */
	public void addEdge(int numVertex1, int numVertex2, int weight) {
		adjacencyMatrix[numVertex1][numVertex2]=weight;
		adjacencyMatrix[numVertex2][numVertex1]=weight;
	}
	/**
	 * Name: getWeight
	 * Method to get weight of graph. <br>
	 * @param numVertex1 - numVertex1 vertex number 1 - numVertex1 = int
	 * @param numVertex2 - numVertex2 vertex number 2 - numVertex2 = int
	 * @return a int representing weight of the graph
	 */
	public int getWeight(int vertex1, int vertex2) {
		return adjacencyMatrix[vertex1][vertex2];
	}
	/**
	 * Name: getConection
	 * Method to get connection of graph. <br>
	 * @param numVertex1 - numVertex1 vertex number 1 - numVertex1 = int
	 * @param numVertex2 - numVertex2 vertex number 2 - numVertex2 = int
	 * @return Vertex<E>
	 * @throws ConnectioDoesNotExistException
	 */
	public Vertex<E> getConection(int vertex1, int vertex2) throws ConnectioDoesNotExistException{
		Vertex<E> answer = null;
		if(adjacencyMatrix[vertex1][vertex2]!= 0) {
			answer = vertexes.get(vertex2);
		}else {
			throw new ConnectioDoesNotExistException();
		}
		return answer;
	}
	/**
	 * Name: floydWarshall
	 * Method to floyd warshall. <br>
	 * @return a int[][] representing matrix floyd warshall
	 */
	public int[][] floydWarshall(){
		int[][] matrix = adjacencyMatrix.clone(); 
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
	 * Method to dijkstra. <br>
	 * @param source == int.
	 * @return Integer[]
	 */
	public Integer[] dijkstra(int source) {
		int[] dist = new int[adjacencyMatrix.length];
		Integer[] prev = new Integer[adjacencyMatrix.length];

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
			
			for(int i = 0; i < adjacencyMatrix.length; i++) {
				if(adjacencyMatrix[u][i]!=0) {
					int alt = dist[u] + adjacencyMatrix[u][i];
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
	/**
	 * Name: getAdjacencyMatrix
	 * Method to get adjacency matrix. <br>
	 * @return a int[][] matrix representing adjacency
	 */
	public int[][] getAdjacencyMatrix(){
		return adjacencyMatrix;
	}
	/**
	 * Name: getVertexes
	 * Method to get vertexes. <br>
	 * @return ArrayList<Vertex<E>>
	 */
	public ArrayList<Vertex<E>> getVertexes() {
		return vertexes;
	}
	/**
	 * Name: setVertexes
	 * Method to update vertexes. <br>
	 * @param vertexes == ArrayList<Vertex<E>>
	 */
	public void setVertexes(ArrayList<Vertex<E>> vertexes) {
		this.vertexes = vertexes;
	}
	/**
	 * Name: setAdjacencyMatrix
	 * Method to update adjacency matrix. <br>
	 * @param adjacencyMatrix == int[][]
	 */
	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
	}
}