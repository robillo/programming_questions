package graph_java;

import queue_java.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreadthFirstTraversalGraph {

    public static void main(String[] args) {
        int vertices = 5;
        Graph g = new Graph(vertices);
        addEdge(g, 0, 2);
        addEdge(g, 0, 4);
        addEdge(g, 1, 2);
        addEdge(g, 3, 1);
        addEdge(g, 3, 2);
        addEdge(g, 3, 4);
        addEdge(g, 2, 4);

        /* The following is the required graph:
           0
          / \
         /   \
        4-----2----1
         \    |   /
           \  |  /
             \| /
              3
         Required traversal (starting from 0) -> 0 -> 2 -> 4 -> 1 -> 3
         */


//        printGraph(g, vertices);

        printBreadthFirstTraversal(g, vertices);
    }

    private static void printGraph(Graph g, int V) {
        for(int v=0; v<g.V; v++) {
            System.out.println("Adjacency list of vertex " + v);
            System.out.print("head");
            for(Integer i : g.adjacencyListArray[v]) {
                System.out.print(" -> " + i);
            }
            System.out.println();
        }
    }

    private static void printBreadthFirstTraversal(Graph g, int v) {
        Queue q = new Queue(v);
        boolean[] visitedNode = new boolean[] {false, false, false, false, false};
        int src = 0;
        q.enqueue(src);
        visitedNode[src] = true;
        System.out.print(src);

        while (!q.isEmpty()) {

            //dequeue last node and store it to enqueue its children
            int nodeBeingDequeued = q.getRearNode();
            q.dequeue();
//            System.out.println(nodeBeingDequeued + " " + Arrays.toString(q.getArrayValues()) + " " + q.getQueueSize() + " " + q.getTop());

            //enqueue all the children of nodeBeingDequeued that are not visited in their adjacency list
            for(int i=0; i<g.adjacencyListArray[nodeBeingDequeued].size(); i++) {
                int nodeBeingEnqueued = g.adjacencyListArray[nodeBeingDequeued].get(i);
                if(!visitedNode[nodeBeingEnqueued]) {
                    q.enqueue(nodeBeingEnqueued);
                    visitedNode[nodeBeingEnqueued] = true;
                    System.out.print(" -> " + nodeBeingEnqueued);
                }
            }
        }
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
}
