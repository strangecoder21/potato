import java.util.*;

public class DFS {
    static ArrayList<Integer> DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,ArrayList<Integer> al){
        visited[s]=true;
        al.add(s);
        for(int u:adj.get(s)){
            if(visited[u]==false){
                DFSRec(adj, u, visited, al);
            }
        }
        return al;
    }
    static ArrayList<Integer> DFSofGraph(ArrayList<ArrayList<Integer>> adj,int V){
        boolean visited[]=new boolean[V+1];
        ArrayList<Integer> al = new ArrayList<Integer>();
        int s=0;
        return DFSRec(adj, s, visited, al);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();

    }
}
