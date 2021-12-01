package my_Practice;

public class test {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(3, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 4);
        graph.addEdge(3, 1);
        graph.addEdge(2, 0);

        graph.printGraph();
        System.out.println();
        graph.DFS(0);
        System.out.println();
        graph.BFS(0);
    }
}
