package my_Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<ArrayList<Integer>> graph; // Main graph in which all the nodes will be stored.
    int V; //number of nodes

    Graph(int num_of_nodes) {
        V = num_of_nodes;
        graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination_node) {
        graph.get(source).add(destination_node);
        graph.get(destination_node).add(source);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Node_" + i);
            for (int x : graph.get(i)) {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        System.out.print("\nBFS Traversal: ");
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int x : graph.get(node)) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }

    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int x : graph.get(node)) {
            if (!visited[x]) {
                dfsUtil(x, visited);
            }
        }
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        dfsUtil(start, visited);
    }
}
