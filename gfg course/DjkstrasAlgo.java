import java.util.*;

public class DjkstrasAlgo {
    public static int [] djkstra(int graph[][],int src){
        int V=graph.length;
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        boolean finalized[]=new boolean[V];
        dist[src]=0;
        for(int count=0;count<V-1;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!finalized[i]&&(u==-1||dist[i]<dist[u])){
                    u=i;
                }
            }
            finalized[u]=true;
            for(int v=0;v<u;v++){
                if(!finalized[v]&& graph[u][v]!=0){
                    dist[v]=Math.min(dist[v],dist[u]+graph[u][v]);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 50, 100, 0}, 
            						{ 50, 0, 30, 200 }, 
            						{ 100, 30, 0, 20 }, 
            						{ 0, 200, 20, 0 },};  

        for(int x: djkstra(graph,0)){
    	    System.out.print(x+" ");
    	}
    }
}
