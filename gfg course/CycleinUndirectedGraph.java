import java.util.ArrayList;

public class CycleinUndirectedGraph {
        // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]= new boolean[V];
        visited[0]=true;
        for(int i=0;i<V;i++){
            if(visited[i]!=true){
                if(DFSREC(i,adj,-1,visited)){
                    return true;
                }}
        }
        return false;
    }
    public boolean DFSREC(int s,ArrayList<ArrayList<Integer>> adj,int parent,boolean visited[]){
        visited[s] = true;
        for(Integer u : adj.get(s)){
            if(visited[u]==false){
            if(DFSREC(u,adj,s,visited)){
                return true;
            }}
            else if(u!=parent){
                return true;
            }
            
        }
        return false;
    }
}
