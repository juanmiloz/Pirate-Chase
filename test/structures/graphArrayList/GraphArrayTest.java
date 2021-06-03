package structures.graphArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import model.Island;

public class GraphArrayTest {
	
	private GraphArray<Island> setupScenary1() {
		GraphArray<Island> graph = new GraphArray<Island>();
		return graph;
	}
	
	private GraphArray<Island> setupScenary2() {
		GraphArray<Island> graph = new GraphArray<Island>();
		Island is1 = new Island(50,50,0);
		VertexArray<Island> vt1 = graph.createVertex(is1);
		graph.addVertex(vt1, null, null);
		Island is2 = new Island(50,50,0);
		VertexArray<Island> vt2 = graph.createVertex(is2);
		ArrayList<VertexArray<Island>> connections1 = new ArrayList<VertexArray<Island>>();
		connections1.add(vt1);
		int[] weigths1 = {1};
		graph.addVertex(vt2, connections1, weigths1);
		Island is3 = new Island(50,50,2);
		VertexArray<Island> vt3 = graph.createVertex(is3);
		ArrayList<VertexArray<Island>> connections2 = new ArrayList<VertexArray<Island>>();
		connections2.add(vt1);
		connections2.add(vt2);
		int[] weigths2 = {2,3};
		graph.addVertex(vt3, connections2, weigths2);
		return graph;
	}
	
	@Test
	void addVertexTest() {
		GraphArray<Island> graph = setupScenary1();
		assertNull(graph.getRoot());
		Island is1 = new Island(50,50,0);
		VertexArray<Island> vt1 = graph.createVertex(is1);
		graph.addVertex(vt1, null, null);
		assertNotNull(graph.getRoot());
	}
	
	@Test
	void listOfVertexTest() {
		GraphArray<Island> graphList = setupScenary2();
		ArrayList<VertexArray<Island>> islands = graphList.getVertexList();
		assertEquals(3, islands.size());
	}
	
	@Test
	void adyacencyMatrixTest() {
		GraphArray<Island> graphList = setupScenary2();
		int[][] matrix = graphList.getAdjacencyMatrix();
		assertEquals(2, matrix[0][2]);
		assertEquals(3, matrix[1][2]);
		assertEquals(0, matrix[2][2]);
		assertEquals(1, matrix[0][1]);
	}

}
