package structures.graphArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.Island;

public class GraphTest {
	
	private Graph<Island> setupScenary1() {
		Island is = new Island(false, false, false);
		Vertex<Island> vertex = new Vertex<Island>(is);
		Graph<Island> graph = new Graph<Island>(vertex);
		return graph;
	}
	
	@Test
	void addVertexTest() {
		Graph<Island> graphTest = setupScenary1();
		assertNotNull(graphTest.getRoot());
		Island is = new Island(true, false, false);
		Vertex<Island> vertex = new Vertex<Island>(is);
		graphTest.addVertex(graphTest.getRoot(), vertex, 1, graphTest.getRoot());

		graphTest.addVertex(graphTest.getRoot(), new Vertex<Island>(new Island(false,false,false)), 2, vertex);

		System.out.println(graphTest.getRoot());
		System.out.println(vertex);
	}

}
