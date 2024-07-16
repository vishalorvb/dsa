package com.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
	
	public ArrayList<Integer> getPath(Map<Integer,List<Integer>> graph,ArrayList<Integer> result){
		
		
		return result;
	}

	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);
		boolean[] visited = new boolean[V];
		while (!q.isEmpty()) {
			int top = q.poll();
			result.add(top);
			visited[0] =true;
			List<Integer> temp = adj.get(top);
			for (int i = 0; i < temp.size(); i++) {
				if (visited[temp.get(i)] == false) {
					visited[temp.get(i)] = true;
					q.add(temp.get(i));
				}
			}
		}

		return result;
	}

}
