package structures.graphAdjacencyMatrix;

public class Vertex<E> {

	E element;
	/**
	 * Name: Vertex
	 * Constructor of class . <br>
	 * @param element
	 */
	public Vertex(E element) {
		this.element = element;
	}
	/**
	 * Name: getElement
	 * Method to get element of vertex. <br>
	 * @return
	 */
	public E getElement() {
		return element;
	}
	/**
	 * Name: setElement
	 * Method to update element of vertex. <br>
	 * @param element
	 */
	public void setElement(E element) {
		this.element = element;
	}	
}
