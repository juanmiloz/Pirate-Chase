package structures.graphArrayList;

public class Partner <E>{

	private int weight;
	private VertexArray<E> vertex;
	
	public Partner(int weight, VertexArray<E> vertex) {
		this.weight = weight; 
		this.vertex = vertex;
	}
	/**
	 * Name: getWeight
	 * Method to get weight. <br>
	 * @return int representing weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * Name: setWeight
	 * Method to update weight. <br>
	 * @param weight int
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * Name: getVertex
	 * Method to get vertex. <br>
	 * @return VertexArray<E>
	 */
	public VertexArray<E> getVertex() {
		return vertex;
	}
	/**
	 * Name: setVertex
	 * Method to update vertex. <br>
	 * @param vertex VertexArray<E>
	 */
	public void setVertex(VertexArray<E> vertex) {
		this.vertex = vertex;
	}
}
