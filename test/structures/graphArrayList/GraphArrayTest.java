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
	
	
	void addVertexTest() {
		GraphArray<Island> graph = setupScenary1();
		Island is1 = new Island(50,50,0);
		VertexArray<Island> vt1 = graph.createVertex(is1);
		graph.addVertex(vt1, null, null);
		assertNotNull(graph.getRoot());
		Island is2 = new Island(50,50,1);
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
		int[] weigths2 = {3,7};
		graph.addVertex(vt3, connections2, weigths2);
	}
	
	@Test
	void listOfVertexTest() {
		GraphArray<Island> graphList = setupScenary1();
		Island is1 = new Island(50,50,0);
		VertexArray<Island> vt1 = graphList.createVertex(is1);
		graphList.addVertex(vt1, null, null);
		Island is2 = new Island(50,50,0);
		VertexArray<Island> vt2 = graphList.createVertex(is2);
		ArrayList<VertexArray<Island>> connections1 = new ArrayList<VertexArray<Island>>();
		connections1.add(vt1);
		int[] weigths1 = {1};
		graphList.addVertex(vt2, connections1, weigths1);
		Island is3 = new Island(50,50,2);
		VertexArray<Island> vt3 = graphList.createVertex(is3);
		ArrayList<VertexArray<Island>> connections2 = new ArrayList<VertexArray<Island>>();
		connections2.add(vt1);
		connections2.add(vt2);
		int[] weigths2 = {2,3};
		graphList.addVertex(vt3, connections2, weigths2);
	}

}
