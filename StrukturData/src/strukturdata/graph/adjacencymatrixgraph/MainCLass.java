package strukturdata.graph.adjacencymatrixgraph;

/**
 *
 * @author riskipradana
 */
public class MainCLass {

    /*
Visualisasi pada gambar 11.1
     */
    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 5);
        graph.addEdge(3, 7);
        graph.addEdge(4, 2);
        graph.addEdge(4, 6);
        graph.addEdge(6, 4);
        graph.addEdge(6, 7);
        graph.addEdge(7, 5);
        System.out.println("Hasil penelusuran BFS mulai node 0 : ");
        graph.BreadthFirstSearch(7);
    }
}
