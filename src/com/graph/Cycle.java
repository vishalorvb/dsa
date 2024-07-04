package com.graph;

import java.util.List;
import java.util.Map;

public class Cycle {
	
	private boolean isCycle(Map<Integer,List<Integer>> graph, Integer point, Map<Integer,Integer> psf,boolean[] visited) {
		
		visited[point] = true;
		if(graph.get(point) == null) {
			return false;
		}
		psf.put(point,1);
		List<Integer> nodes = graph.get(point);
		for(int i=0; i<nodes.size();i++) {
			if(isCycle(graph, nodes.get(i), psf,visited)) {
				return true;
			}
		}
		
		return false;
	}

}
