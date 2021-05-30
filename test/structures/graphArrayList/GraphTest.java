package structures.graphArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import model.Island;

public class GraphTest {
	
	private Graph<Island> setupScenary1() {
		Graph<Island> graph = new Graph<Island>();
		return graph;
	}
	
	@Test
	void addVertexTest() {
		Graph<Island> graph = setupScenary1();
		Island is1 = new Island(50,50,0);
		Vertex<Island> vt1 = graph.createVertex(is1);
		graph.addVertex(vt1, null, null);
		assertNotNull(graph.getRoot());
		Island is2 = new Island(50,50,1);
		Vertex<Island> vt2 = graph.createVertex(is2);
		ArrayList<Vertex<Island>> connections1 = new ArrayList<Vertex<Island>>();
		connections1.add(vt1);
		int[] weigths1 = {1};
		graph.addVertex(vt2, connections1, weigths1);
		Island is3 = new Island(50,50,2);
		Vertex<Island> vt3 = graph.createVertex(is3);
		ArrayList<Vertex<Island>> connections2 = new ArrayList<Vertex<Island>>();
		connections2.add(vt1);
		connections2.add(vt2);
		int[] weigths2 = {3,7};
		graph.addVertex(vt3, connections2, weigths2);
		Island is4 = new Island(50,50,3);
	}

}
