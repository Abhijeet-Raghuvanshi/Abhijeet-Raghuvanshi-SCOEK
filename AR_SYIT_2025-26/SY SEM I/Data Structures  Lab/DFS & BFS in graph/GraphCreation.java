import java.util.*;

public class GraphCreation {
    static class Graph {
            int vertics;
            List<List<Integer>> adjList;

            Graph(int vertics) {
                this.vertics = vertics;
                adjList = new ArrayList<>();
                for (int a = 0; a < vertics; a++) {
                    adjList.add(new ArrayList<>());
                }
            }

            public void edge(int i, int j) {
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }

            public void print() {
                System.out.println("Adjacency List:");
                for (int i = 0; i < vertics; i++) {
                    System.out.print(i + " -> ");
                    for (int node : adjList.get(i)) {
                        System.out.print(node + " ");
                    }
                    System.out.println();
                }
            }

            public void bfs(List<List<Integer>> adjList,int start,int vertics){
                boolean[] visited = new boolean[vertics];
                Queue<Integer> q = new LinkedList<>();
                visited[start] = true;
                q.add(start);
                System.out.println("BFS Traversal:");
                while(!q.isEmpty()){
                    int node = q.poll();
                    System.out.print(node+" ");
                    for(int n:adjList.get(node)){
                        if(!visited[n]){
                            visited[n]=true;
                            q.add(n);
                        }
                    }
                }
            }

      

        public void dfs(int start) {
            boolean[] visited = new boolean[this.vertics];
            System.out.println("\nDFS Traversal :");
            dfs2(start, visited);
        }

        private void dfs2(int start, boolean[] visited) {
            LinkedList<Integer> stack = new LinkedList<>();
            stack.push(start);

            while (!stack.isEmpty()) {
                int node = stack.pop();
                if (!visited[node]) {
                    System.out.print(node + " ");
                    visited[node] = true;
            
                List<Integer> neighbors = this.adjList.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
    }
        

     

    public static void main(String[] args) {
        int numberOfVertics = 5; 
        Graph graph = new Graph(numberOfVertics);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertex : ");

        int vertices = nextInt();

        graph.edge(0, 1);
        graph.edge(0, 4);
        graph.edge(1, 2);
        graph.edge(1, 3);
        graph.edge(1, 4);
        graph.edge(2, 3);
        graph.edge(3, 4);

        graph.print();
        graph.bfs(graph.adjList, 0, numberOfVertics);
        graph.dfs(0);
    }
}