package com.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	
		DFS d =  new DFS();
		 ArrayList<ArrayList<Integer>> graph = new ArrayList<>(Arrays.asList(
		            new ArrayList<>(Arrays.asList(2, 3, 1)),
		            new ArrayList<>(Arrays.asList(0)),
		            new ArrayList<>(Arrays.asList(0, 4)),
		            new ArrayList<>(Arrays.asList(0)),
		            new ArrayList<>(Arrays.asList(2))
				 ));
		 
		 d.dfsOfGraph(5, graph);
	}

}
