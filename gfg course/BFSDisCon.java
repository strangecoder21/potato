import java.util.*;

public class BFSDisCon {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
		Queue<Integer> q= new LinkedList<Integer>();
		visited[s]=true;
		q.add(s);
		while(q.isEmpty()==false){
			int u =q.poll();
			System.out.print(u+" ");
			for(int v:adj.get(u)){
				if(visited[v]==false){
					visited[v]=true;
					q.add(v);
				}
			}
		}
	}
	static void BFSDis(ArrayList<ArrayList<Integer>> adj,int v){
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++){
			if(visited[i]==false){
				BFS(adj, i, visited);
			}
		}
	}

	public static void main(String[] args) 
	{  
		int V = 7; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(); 
		
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<Integer>()); 
		}
			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,2,3); 
        	addEdge(adj,1,3); 
        	addEdge(adj,4,5);
        	addEdge(adj,5,6);
        	addEdge(adj,4,6);
	    BFSDis(adj,V);
	}
}
