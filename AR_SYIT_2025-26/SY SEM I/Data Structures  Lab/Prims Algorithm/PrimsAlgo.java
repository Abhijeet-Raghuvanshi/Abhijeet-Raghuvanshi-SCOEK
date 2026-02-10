/**
 * @file : PrimsAlgo.java
 * @brief : This program shows how's Prim's Algorithm works in a Graph, by using priority queue.         
 * @author : Abhijeet Raghuvanshi(raghuvanshiabhijeet6@gmail.com)
 * @Copyright : -
 * @date : 1 Sept 2025
 */

//import java.util.Scanner;

import java.util.*;

class Edge {
    int dest;
    int weight;
    Edge(int d, int w) {
        dest = d;
        weight = w;
    }
}

public class PrimsAlgo {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter number of vertics:");
        int v = input.nextInt();
        System.out.println("Enter number of edges:");
        int e = input.nextInt();
            */
        int v = 5;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Edge>());
        }

        addEdge(graph,0,1,2);
        addEdge(graph,0,3,6);
        addEdge(graph,1,2,3);
        addEdge(graph,1,3,8);
        addEdge(graph,1,4,5);
        addEdge(graph,2,4,7);
        addEdge(graph,3,4,9);
        primsMST(graph,v);
    }
    static void addEdge(List<List<Edge>> graph, int src, int dest, int weight) {
        graph.get(src).add(new Edge(dest, weight));
        graph.get(dest).add(new Edge(src, weight));
    }

    static void primsMST(List<List<Edge>> graph, int v) {
        boolean[] inMST = new boolean[v];
        int[] key = new int[v];
        int[] parent = new int[v];
        PriorityQueue<Edge> pq = new PriorityQueue<>(v, Comparator.comparingInt(e -> e.weight));

        for (int i = 0; i < v; i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        key[0] = 0;
        pq.add(new Edge(0, key[0]));

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.dest;

            if (inMST[u]) continue;
            inMST[u] = true;

            for (Edge neighbor : graph.get(u)) {
                int dest = neighbor.dest;
                int weight = neighbor.weight;

                if (!inMST[dest] && weight < key[dest]) {
                    key[dest] = weight;
                    pq.add(new Edge(dest, key[dest]));
                    parent[dest] = u;
                }
            }
        }

        printMST(parent, key, v);
    }
    static void printMST(int[] parent, int[] key, int v) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < v; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + key[i]);
        }
    }
    
}