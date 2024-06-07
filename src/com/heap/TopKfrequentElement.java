package com.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfrequentElement {
	public int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		List<Integer> num = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			else {
				num.add(nums[i]) ;
				map.put(nums[i], 1);
			}
		}
		Collections.sort(num,(n1,n2)->map.get(n2)-map.get(n1));
		int arr[] = new int[k];
		for(int i=0;i<k; i++) {
			arr[i] = num.get(i);
		}
		return arr;
	}

}
