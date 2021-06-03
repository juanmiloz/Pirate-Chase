package structures.graphArrayList;

import java.util.ArrayList;

public interface GraphArrayInterface<E> {

	public VertexArray<E> createVertex(E island);
	public void addVertex(VertexArray<E> vertex, ArrayList<VertexArray<E>> connections, int[] weigths);
	public int[][] floydWarshall();
	public Integer[] dijkstra(int source);
	
}
