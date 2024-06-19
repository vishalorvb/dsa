package com.graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
	
	private ArrayList<Integer> getDfs(ArrayList<ArrayList<Integer>> graph,int indx, boolean[] visited,ArrayList<Integer> path){
		visited[indx] = true;
		path.add(indx);
		System.out.println(indx);
		List<Integer> temp = graph.get(indx);
		for (Integer i : temp) {
			if(visited[i] == false) {
				getDfs( graph, i, visited, path);
			}
		}
		
		return path;
	}
	
	
	  public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		  	boolean[] visited = new boolean[V];
		  	ArrayList<Integer> res = new ArrayList<Integer>();
	        return getDfs(adj,0,visited,res);
	    }

}
