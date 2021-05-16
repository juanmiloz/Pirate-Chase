package structures.graphAdjacencyMatrix;

public class Vertex<E> {

	E element;
	
	public Vertex(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
}
