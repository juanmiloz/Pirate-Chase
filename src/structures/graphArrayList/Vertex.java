package structures.graphArrayList;

import java.util.ArrayList;

public class Vertex<E>{

	E element;
	ArrayList<Partner<E>> vertexes;
	
	public Vertex(E element) {
		this.element = element;
		this.vertexes = null;
	}
	
	public Vertex(E element, ArrayList<Partner<E>> vertexes) {
		this.element = element;
		this.vertexes = vertexes;
	}
	
	public void addVertex(int weight, E element) {
		Vertex<E> newVertex = new Vertex<>(element);
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	
	public void addVertex(int weight, Vertex<E> newVertex) {
		Partner<E> newPartner = new Partner<>(weight, newVertex);
		vertexes.add(newPartner);
	}
	
	public int getWeight(Vertex<E> toConect) {
		for(int i = 0; i < vertexes.size(); i++) {
			if(vertexes.get(i).getVertex().equals(toConect)) {
				return vertexes.get(i).getWeight();
			}
		}
		return 0;
	}
}
