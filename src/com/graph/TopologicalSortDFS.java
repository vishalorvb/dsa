package com.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortDFS {

	static void getDfs(boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int indx) {

		visited[indx] = true;
		ArrayList<Integer> temp = adj.get(indx);
		for (int i = 0; i < temp.size(); i++) {
			if (visited[temp.get(i)] == false) {
				getDfs(visited, st, adj, temp.get(i));
			}
		}
		st.push(indx);
	}

	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean visited[] = new boolean[adj.size()];
		
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < adj.size(); i++) {
			if (visited[i] == false) {
				getDfs(visited, st, adj, i);
			}
		}
		int res[] = new int[st.size()];
		int i = 0;
		while (!st.isEmpty()) {
			res[i] = st.peek();
			st.pop();
			i++;
		}

		return res;
	}

}
