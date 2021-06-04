package structures.graphAdjacencyMatrix;

import exception.AmountOfDataException;
import exception.ConnectioDoesNotExistException;
import exception.EdgeInvalidException;

public interface GraphInterface<E> {
	public void addVertex(E element, int[] edges, int[] weights) throws EdgeInvalidException, AmountOfDataException;
	public void enlargeMatrix();
	public void addEdge(int numVertex1, int numVertex2, int weight);
	public int getWeight(int vertex1 , int vertex2);
	public Vertex<E> getConection(int vertex1, int vertex2) throws ConnectioDoesNotExistException;
	public int[][] floydWarshall();
	public Integer[] dijkstra(int source);
}
