package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val, ArrayList<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}

public class CloneGraph {
	
		private void clone(Node node,Map<Node,Node> map) {
			
			Node n = new Node(node.val);
			map.put(node, n);
			for(int i=0;i<node.neighbors.size();i++) {
				if(!map.containsKey(node.neighbors.get(i))) {
					clone(node.neighbors.get(i),map);
				}
			}
		}
	
	   public Node cloneGraph(Node node) {
		   if(node == null) {
				return node;
			}
		   Map<Node,Node> map= new HashMap<>();
		   clone(node,map);
		   map.forEach((key,val)->{
			   ArrayList<Node> temp = new ArrayList<Node>();
			   key.neighbors.forEach(n->{
				   temp.add(map.get(n));
				   val.neighbors = temp;
			   });
		   });
		   
		   return map.get(node);
	    }
	

}
