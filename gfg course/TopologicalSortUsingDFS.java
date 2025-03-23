import java.util.*;
public class TopologicalSortUsingDFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u ,int v){
        adj.get(u).add(v);
    }
    static void DFS(ArrayList<ArrayList<Integer>> adj,int u , Stack<Integer> st,boolean visited[]){
        visited[u]=true;
        for(int i:adj.get(u)){
            if(visited[i]==false){
                DFS(adj, i, st, visited);
            }
        }
        st.push(new Integer(u));
    }
    static void topographicalSort(ArrayList<ArrayList<Integer>> adj,int V){
        boolean visited[]= new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                DFS(adj, i, st, visited);
            }
        }
        while(st.isEmpty()==false){
            System.out.println(st.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);
        topographicalSort(adj, V);
    }
}
