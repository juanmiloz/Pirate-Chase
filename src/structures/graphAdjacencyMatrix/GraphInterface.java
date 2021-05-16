package structures.graphAdjacencyMatrix;

import exception.AmountOfDataException;
import exception.EdgeInvalidException;

public interface GraphInterface<E> {
	public void addVertex(E element, int[] edges, int[] weights) throws EdgeInvalidException, AmountOfDataException;
	public void enlargeMatrix();
}
