import java.util.*;

public class BFSCon {
    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u ,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS_connected(ArrayList<ArrayList<Integer>>adj,int v ,int s){
        boolean visited[]=new boolean[v+1];
        Queue<Integer> q= new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false){
            int u = q.poll();
            System.out.println(u+" ");
            for(int j:adj.get(u)){
                if(visited[j]==false){
                    visited[j]=true;
                    q.add(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);
        BFS_connected(adj,5,0);
    }
}
