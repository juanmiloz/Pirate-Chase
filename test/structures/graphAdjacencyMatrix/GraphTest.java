package structures.graphAdjacencyMatrix;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exception.AmountOfDataException;
import exception.ConnectioDoesNotExistException;
import exception.EdgeInvalidException;
import model.Island;

public class GraphTest {

	public int[][] setupScenary1(){
		int[][] matrix = new int [3][3]; 
		return matrix;
	}
	
	public ArrayList<Vertex<Island>> setupScenary2() {
		ArrayList<Vertex<Island>> vertexes = new ArrayList<>();
		
		vertexes.add(new Vertex<Island>(new Island(0, 0, 0)));
		vertexes.add(new Vertex<Island>(new Island(0, 0, 1)));
		vertexes.add(new Vertex<Island>(new Island(0, 0, 2)));
		
		return vertexes;
	}
	
	public int[][] setupScenary3(){
		int[][] matrix = {
				{0,3,4},
				{3,0,1},
				{4,1,0}
		};
		return matrix;
	}
	
	public int[][] setupScenary4(){
		int[][] matrix = {
				{0,3,7},
				{3,0,2},
				{4,8,0}
		};
		return matrix;
	}
	
	public int[][] setupScenary5(){
		int[][] matrix = {
			{0, 4, 3, 7, 0, 0, 0, 0, 0, 0},
			{4, 0, 0, 0, 1, 0, 0, 0, 0, 0},
			{3, 0, 0, 3, 0, 0, 0, 0, 0, 0},
			{7, 0, 3, 0, 3, 5, 3, 4, 0, 0},
			{0, 1, 0, 3, 0, 0, 0, 5, 0, 0},
			{0, 0, 0, 5, 0, 0, 0, 0, 5, 0},
			{0, 0, 0, 3, 0, 0, 0, 0, 5, 4},
			{0, 0, 0, 4, 5, 0, 0, 0, 0, 6},
			{0, 0, 0, 0, 0, 5, 5, 0, 0, 3},
			{0, 0, 0, 0, 0, 0, 4, 6, 3, 0}
		};
		return matrix;
	}
	
	@Test
	public void testGraph() {
		Graph<Integer> graph = new Graph<>();
		
		assertNotNull(graph);
	}
	
	@Test 
	public void testConstructor2() {
		int[][] matrix = setupScenary1();
		ArrayList<Vertex<Island>> vertexes = setupScenary2();
		
		Graph<Island> graph = new Graph<>(matrix,vertexes);
		
		assertNotNull(graph);
	}
	
	@Test
	public void testAddVertexes() throws EdgeInvalidException, AmountOfDataException {
		int[][] matrix = setupScenary1();
		ArrayList<Vertex<Island>> vertexes = setupScenary2();
		
		Graph<Island> graph = new Graph<>(matrix,vertexes);
		
		int[] edges = {0,1};
		int[] weights = {2,3}; 
		
		Island island = new Island(0,0,3);
		
		graph.addVertex(island, edges, weights);
		
		int [][] expected = {
				{0,0,0,2},
				{0,0,0,3},
				{0,0,0,0},
				{2,3,0,0}
		};
		
		assertArrayEquals(expected, graph.getAdjacencyMatrix());
	}
	
	@Test
	public void testEnlargeMatrix() {
		int[][] matrix = setupScenary1();
		ArrayList<Vertex<Island>> vertexes = setupScenary2();
		
		Graph<Island> graph = new Graph<>(matrix,vertexes);
		
		graph.enlargeMatrix();
		
		assertEquals(4, graph.getAdjacencyMatrix().length);
	}
	
	@Test
	public void getWeight() {
		int[][] matrix = setupScenary3();
		ArrayList<Vertex<Island>> vertexes = setupScenary2();
		
		Graph<Island> graph = new Graph<>(matrix,vertexes);
		
		assertEquals(0, graph.getWeight(0, 0));
		assertEquals(3, graph.getWeight(0, 1));
		assertEquals(4, graph.getWeight(0, 2));
		assertEquals(1, graph.getWeight(1, 2));
	}
	
	@Test
	public void getConection() throws ConnectioDoesNotExistException {
		int[][] matrix = setupScenary3();
		ArrayList<Vertex<Island>> vertexes = setupScenary2();
		
		Graph<Island> graph = new Graph<>(matrix,vertexes);
		
		assertEquals(graph.getVertexes().get(2), graph.getConection(0,2));
	}
	
	@Test
	public void floydWarshall() {
		int[][] matrix = setupScenary4();
		Graph graph = new Graph(matrix, null);
		
		int[][]expected = {
				{0,3,5},
				{3,0,2},
				{4,7,0}
		};
		
		assertArrayEquals(expected, graph.floydWarshall());
	}
	
	@Test
	public void dijkstra() {
		int[][] matrix = setupScenary5();
		Graph graph = new Graph(matrix, null);
		
		Integer[] expected = {null,0,0,2,1,3,3,3,6,6};
		
		assertArrayEquals(expected, graph.dijkstra(0));
	}
}
