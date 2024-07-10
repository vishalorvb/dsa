package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cycle {
	
	private boolean isCycleBFS(Map<Integer,List<Integer>> graph, Integer point, Map<Integer,Integer> psf,boolean[] visited) {
		
		visited[point] = true;
		if(graph.get(point) == null) {
			return false;
		}
		psf.put(point,1);
		List<Integer> nodes = graph.get(point);
		for(int i=0; i<nodes.size();i++) {
			if(psf.get(nodes.get(i))!=null) {
				return true;
			}
			if(visited[nodes.get(i)] == false && isCycleBFS(graph, nodes.get(i), psf,visited)) {
				return true;
			}
		}
		psf.remove(point);
		return false;
	}
	
	   public boolean canFinish(int numCourses, int[][] prerequisites) {
		   
		   Map<Integer,List<Integer>> graph = new HashMap<Integer, List<Integer>>();
		   boolean visited[] = new boolean[numCourses];
		   
		   for(int i=0;i<prerequisites.length;i++) {
			   int[] temp = prerequisites[i];
			   if(graph.containsKey(temp[0])) {
				   graph.get(temp[0]).add(temp[1]);
			   }
			   else {
				   graph.put(temp[0], new ArrayList<Integer>(Arrays.asList(temp[1])));
			   }
		   }
	        for(int i=0;i<numCourses;i++) {
	        	if(visited[i] == false && isCycleBFS(graph, i, new HashMap<Integer, Integer>(), visited)) {
	        		return false;
	        	}
	        }
	        return true;
	    }

}
