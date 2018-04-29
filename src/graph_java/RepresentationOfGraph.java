package graph_java;

import java.util.ArrayList;
import java.util.List;

public class RepresentationOfGraph {

    public static void main(String[] args) {

        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        printGraph(graph);
    }

    private static class Graph {
        int V;
        List<Integer> adjacencyListArray[];

        Graph(int V) {
            this.V = V;
            adjacencyListArray = new List[V];

            for(int i=0; i<V; i++) {
                adjacencyListArray[i] = new ArrayList<>();
            }
        }
    }

    private static void addEdge(Graph g, int src, int dest) {
        g.adjacencyListArray[src].add(dest);
        g.adjacencyListArray[dest].add(src);
    }

    private static void printGraph(Graph g) {
        for(int v=0; v<g.V; v++) {
            System.out.println("Adjacency list of vertex " + v);
            System.out.print("head");
            for(Integer i : g.adjacencyListArray[v]) {
                System.out.print(" -> " + i);
            }
            System.out.println();
        }
    }
}
