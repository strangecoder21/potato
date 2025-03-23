import java.util.ArrayList;

public class DetectcycleinDirectedGraph {
    public boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],boolean recSt[]){
        visited[s]=true;
        recSt[s]=true;
        for(Integer u:adj.get(s)){
            if(visited[u]==false && DFSRec(adj,u,visited,recSt)){
                return true;
            }
            else if(recSt[u]==true){
                return true;
            }
        }
        recSt[s]=false;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]= new boolean[V];
        boolean recSt[]= new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(DFSRec(adj,i,visited,recSt)){
                    return true;
                }
            }
        }
        return false;
    }
}
