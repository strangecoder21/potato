import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Mollegraph {
    static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printgraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
        }
    }
    void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s){
        Queue<Integer> q= new LinkedList<Integer>();
        boolean visited[]=new boolean[v+1];
        visited[s]=true;
        q.add(s);
        while (q.isEmpty()==false) {
            int u=q.poll();
            System.out.print(u+" ");
            for(int i:adj.get(u)){
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[]){
        visited[s]=true;
        System.out.print(s+" ");
        for(int u:adj.get(s)){
            if(visited[u]==false){
                DFSrec(adj, u, visited);      
            }
        }
    }
    static void DFS(ArrayList<ArrayList<Integer>> adj,int v,int s){
        boolean visited[]=new boolean[v];
        for(int i=0;i<v+1;i++){
            visited[i]=false;
        }
        DFSrec(adj, s, visited);
    }
    static void shortestpathinanUnweightedGraph(ArrayList<ArrayList<Integer>> adj,int V,int s,int[] dist){
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while (q.isEmpty()==false) {
            int u=q.poll();
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    dist[v]=dist[u]+1;
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addedge(adj, 0, 1);
        addedge(adj, 0, 2);
        addedge(adj, 1, 2);
        addedge(adj, 1, 3);
        printgraph(adj);
    }
}
