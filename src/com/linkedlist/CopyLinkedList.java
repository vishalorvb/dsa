package com.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyLinkedList {
	
	   public NodeRandom copyRandomList(NodeRandom head) {
		   
		   Map<NodeRandom, NodeRandom> map = new HashMap<NodeRandom, NodeRandom>();
		   NodeRandom nxt = head;
		   while(nxt!= null) {
			   NodeRandom temp = new NodeRandom(nxt.val);
			   map.put(nxt, temp);
			   nxt = nxt.next;
		   }
		   
		   NodeRandom i = head;
		   while(i!=null) {
			   NodeRandom n = null;
			   NodeRandom r = null;
			   n = map.get(i.next);
			   r = map.get(i.random);
			   map.get(i).next = n;
			   map.get(i).random = r;
			   
		   }
		   return map.get(head);
	        
	    }

}
 