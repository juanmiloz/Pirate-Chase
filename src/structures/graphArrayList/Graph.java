package structures.graphArrayList;

public class Graph <E>{

	Vertex<E> root;
	
	public Graph(Vertex<E> root){
		this.root = root;
	}

	public Vertex<E> getRoot() {
		return root;
	}

	public void setRoot(Vertex<E> root) {
		this.root = root;
	}
}
