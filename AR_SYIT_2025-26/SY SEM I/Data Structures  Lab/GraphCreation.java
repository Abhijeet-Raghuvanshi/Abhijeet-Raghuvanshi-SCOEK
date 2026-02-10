/**
 * @file : GraphCreation.java
 * @brief : Implementation of graph by using Array in Java.
 * @author : Abhijeet Raghuvanshi (raghuvanshiabhijeet6@gmail.com)
 * @date : 11 Aug 2025
 */

import java.util.*;

//Creating graph 
public class GraphCreation
{
	static class Graph
	{
		int vertices;
		List<List<Integer>>adjList;

		Graph(int vertices)
		{
			this.vertices = vertices;
			adjList = new ArrayList<>();

			for(int le = 1; le < vertices; le++)
			{
				adjList.add(new ArrayList<>());
			}
		}

		//method to add edges (undirected)
		void addEdge(int src, int dest)
		{
			adjList.get(src).add (dest);
			adjList.get(dest).add(src);
		}

		//Display the graph
		public void printGraph()
		{
			System.out.println("Graph Adjecency List : ");
			for(int le = 0; le < vertices; le++)
			{
				System.out.println(le + " ->");

				for(int node : adjList.get(le))
				{
					System.out.println(node + " ");
				}

				System.out.println();
			}
		}

		//BFS Function
		public void bfs(List<List<Integer>> adjList, int start, int vertices)
		{
			boolean[] visited = new boolean[vertices];
			Queue<Integer> queue = new Linkedlist<>();

			visited[start] = true;

			queue.add(start);

			System.out.println("BFS Traversal : ");

			while(!queue.isEmpty())
			{
				int node = queue.poll();
				System.out.println(node + " ");

				for(int neighbor : adjList.get(node))
				{
					if(!visited[neighbor])
					{
						visited[neighbor] = true;
						queue.add(neighbor);
					}
				}
			}

			//System.out.println();
		}
	}

	//Main method
	public static void main(String[] args)
	{
		int numberOfVertices = 5;
		Graph graph = new Graph(numberOfVertices);

		//Add edges (exmaple taken)
		graph.addEdge(0 , 1);
		graph.addEdge(1 , 4);
		graph.addEdge(1 , 3);
		graph.addEdge(1 , 2);
		graph.addEdge(2 , 3);
		graph.addEdge(3 , 4);

		//Diplaying graph
		graph.printGraph();
		graph.bfs(graph.adjList, 0, 5);
	}

}