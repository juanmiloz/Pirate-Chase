package structures.graphArrayList;

public class Partner <E>{

	private int weight;
	private VertexArray<E> vertex;
	
	public Partner(int weight, VertexArray<E> vertex) {
		this.weight = weight; 
		this.vertex = vertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public VertexArray<E> getVertex() {
		return vertex;
	}

	public void setVertex(VertexArray<E> vertex) {
		this.vertex = vertex;
	}
}
