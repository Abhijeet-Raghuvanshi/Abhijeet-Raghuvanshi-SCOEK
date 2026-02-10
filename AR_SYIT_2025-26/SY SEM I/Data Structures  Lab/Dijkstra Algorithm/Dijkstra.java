public class Dijkstra {
    static final int v=6;
    public static void dijkstra(int[][] graph,int src){
        int[] dist = new int[v];
        boolean[] visited = new boolean[v];

        for(int i=0;i<v;i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;

        for(int count=0;count<v-1;count++){
            int u = minDist(dist,visited);
            visited[u] = true;

            for(int j=0;j<v;j++){
                if(!visited[j] && graph[u][j]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][j]<dist[j]){
                    dist[j] = dist[u]+graph[u][j];
                }
            }
        }
        printSolution(dist);
    }
    public static int minDist(int[] dist,boolean[] visited){
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for(int v=0;v<dist.length;v++){
            if(!visited[v] && dist[v]<=min){
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
    public static void printSolution(int[] dist){
        System.out.println("Vertex \t Distance from Source");
        for(int i=0;i<dist.length;i++){
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
    public static void main(String[] args){
        
        int[][] graph = new int[][]{
        //   0 1 2 3 4 5
            {0,2,4,0,0,0},//0
            {0,0,1,7,0,0},//1
            {0,0,0,0,3,0},//2
            {0,0,0,0,0,1},//3
            {0,0,0,2,0,5},//4
            {0,0,0,0,0,0},//5
        };
        dijkstra(graph,0);
	}
}
