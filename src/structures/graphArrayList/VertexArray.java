package structures.graphArrayList;

import java.util.ArrayList;

public class VertexArray<E>{

	private E element;
	private ArrayList<Partner<E>> vertexes;
	private int dni;
	private boolean visited;
	
	public VertexArray(E element, int dni) {
		this.setElement(element);
		this.vertexes = new ArrayList<Partner<E>>();
		visited = false;
		setDni(dni);
	}
	
	public ArrayList<Partner<E>> getVertexes() {
		return vertexes;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public VertexArray(E element, ArrayList<Partner<E>> vertexes) {
		this.setElement(element);
		this.vertexes = vertexes;
	}
	
	public void addVertex(int weight, E element, int dni) {
		VertexArray<E> newVertex = new VertexArray<>(element, dni);
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	
	public void addVertex(int weight, VertexArray<E> newVertex) {
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	
	public int getWeight(VertexArray<E> toConect) {
		for(int i = 0; i < vertexes.size(); i++) {
			if(vertexes.get(i).getVertex().equals(toConect)) {
				return vertexes.get(i).getWeight();
			}
		}
		return 0;
	}
	
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
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
	
}
