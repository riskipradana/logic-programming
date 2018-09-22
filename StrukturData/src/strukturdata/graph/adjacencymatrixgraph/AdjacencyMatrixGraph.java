package strukturdata.graph.adjacencymatrixgraph;;

import queue.Queue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riskipradana
 */
public class AdjacencyMatrixGraph {

    private int size;
    private boolean[][] adj;

    AdjacencyMatrixGraph(int size) {
        this.size = size;
        this.adj = new boolean[size][size];
    }

    void addEdge(int i, int j) {
        this.adj[i][j] = true;
    }

    void removeEdge(int i, int j) {
        this.adj[i][j] = false;
    }

    boolean hasEdge(int i, int j) {
        return this.adj[i][j];
    }

    List<Integer> outEdges(int i) {
        List<Integer> edges = new ArrayList<Integer>();
        for (int j = 0; j < size; j++) {
            if (this.adj[i][j]) {
                edges.add(j);
            }
        }
        return edges;
    }

    List<Integer> inEdges(int i) {
        List<Integer> edges = new ArrayList<Integer>();
        for (int j = 0; j < size; j++) {
            if (this.adj[j][i]) {
                edges.add(j);
            }
        }
        return edges;
    }
//BFS menggunakan antrian

    public void BreadthFirstSearch(int nodeAwal) {
        boolean[] terkunjungi = new boolean[size];
        Queue q = new Queue();
        q.enqueue(nodeAwal);
        terkunjungi[nodeAwal] = true;
        System.out.printf("%d ", nodeAwal);
        while (!q.isEmpty()) {
            int i = q.dequeue();
            for (int j : this.outEdges(i)) {
                if (!terkunjungi[j]) {
                    q.enqueue(j);
                    terkunjungi[j] = true;
                    System.out.printf("%d ", j);
                }
            }
        }
        System.out.println("");
    }
}
