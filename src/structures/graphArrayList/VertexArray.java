package structures.graphArrayList;

import java.util.ArrayList;

public class VertexArray<E>{

	private E element;
	private ArrayList<Partner<E>> vertexes;
	private int dni;
	private boolean visited;
	/**
	 * Name: VertexArray
	 * Method constructor. <br>
	 * @param element E 
	 * @param dni int
	 */
	public VertexArray(E element, int dni) {
		this.setElement(element);
		this.vertexes = new ArrayList<Partner<E>>();
		visited = false;
		setDni(dni);
	}
	/**
	 * Name: getVertexes
	 * Method to get vertex. <br>
	 * @return ArrayList<Partner<E>>
	 */
	public ArrayList<Partner<E>> getVertexes() {
		return vertexes;
	}
	/**
	 * Name: isVisited
	 * Method to get if stay visited. <br>
	 * @return boolean
	 */
	public boolean isVisited() {
		return visited;
	}
	/**
	 * Name: VertexArray
	 * Method vertex array. <br>
	 * @param element - element vertex - element == E
	 * @param vertexes ArrayList<Partner<E>>
	 */
	public VertexArray(E element, ArrayList<Partner<E>> vertexes) {
		this.setElement(element);
		this.vertexes = vertexes;
	}
	/**
	 * Name: addVertex
	 * Method to add vertex array. <br>
	 * @param weight int
	 * @param element E
	 * @param dni int
	 */
	public void addVertex(int weight, E element, int dni) {
		VertexArray<E> newVertex = new VertexArray<>(element, dni);
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	/**
	 * Name: addVertex
	 * Method to add vertex array. <br>
	 * @param weight int
	 * @param newVertex VertexArray<E>
	 */
	public void addVertex(int weight, VertexArray<E> newVertex) {
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	/**
	 * Name: getWeight
	 * Method to get weight. <br>
	 * @param toConect VertexArray<E> 
	 * @return int
	 */
	public int getWeight(VertexArray<E> toConect) {
		for(int i = 0; i < vertexes.size(); i++) {
			if(vertexes.get(i).getVertex().equals(toConect)) {
				return vertexes.get(i).getWeight();
			}
		}
		return 0;
	}
	/**
	 * Name: message
	 * Method to get message. <br>
	 * @return String
	 */
	public String message() {
		String response = "";
		for(int c = 0; c < vertexes.size(); c++) {
			response += "Connection number: " + c + ", Peso: " + vertexes.get(c).getWeight() + "\n";
		}
		if(vertexes.size() == 0) {
			response += "Don't have any connection";
		}
		return response;
	}
	/**
	 * Name: setVisited
	 * Method to update visited. <br>
	 * @param visited boolean
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	/**
	 * Name: getDni
	 * Method to get dni. <br>
	 * @return int
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * Name: set dni
	 * Method to update dni. <br>
	 * @param dni int
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * Name: getElement
	 * Method to get element. <br>
	 * @return
	 */
	public E getElement() {
		return element;
	}
	/**
	 * Name: setElement
	 * Method to update element. <br>
	 * @param element
	 */
	public void setElement(E element) {
		this.element = element;
	}
	
}
