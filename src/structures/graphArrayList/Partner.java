package structures.graphArrayList;

public class Partner <E>{

	private int weight;
	private Vertex<E> vertex;
	
	public Partner(int weight, Vertex<E> vertex) {
		this.weight = weight; 
		this.vertex = vertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex<E> getVertex() {
		return vertex;
	}

	public void setVertex(Vertex<E> vertex) {
		this.vertex = vertex;
	}
}
