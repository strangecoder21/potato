import java.util.*;
public class shortestpathinanUnweightedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void shortestdist(ArrayList<ArrayList<Integer>> adj,int V,int s,int dist[]){
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false){
            int u = q.poll();
            for(int i:adj.get(u)){
                if(visited[i]==false){
                    dist[i]=dist[u]+1;
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(V);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);//do 4 more vertices
        int dist[]= new int[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        shortestdist(adj,V,0,dist);
        for (int i = 0; i < V; i++) {
            System.out.println(dist[i]+" ");
        }
    }
}