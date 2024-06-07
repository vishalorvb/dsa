package com.heap;

import java.util.PriorityQueue;

public class KthLarget {
	
public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	if(i<k) {
        		q.add(nums[i]);
        	}else {
        		if(q.peek()<nums[i]) {
        			q.remove();
        			q.add(nums[i]);
        		}
        	}
        }
     return q.peek();
    }

}
