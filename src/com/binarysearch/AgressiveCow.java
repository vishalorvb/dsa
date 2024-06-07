package com.binarysearch;

import java.util.HashMap;
import java.util.Map;

public class AgressiveCow {
	  public  int aggressiveCows(int []stalls, int k) {
	        
		  int min = 0;
		  int max = Integer.MIN_VALUE;
		  
		  int res = 0;
		  
		  Map<Integer,Integer> map = new HashMap<>();
		  for(int i=0;i<stalls.length;i++) {
			  map.put(stalls[i],1);
			  if(stalls[i]>max) {
				  max = stalls[i];
			  }
		  }
		  int totalStall  = max;
		  while(min<=max) {
			  int mid = (max+min)/2;
			  int cow = k;
			  int i=0;
			  while(i<=totalStall && cow != 0) {
				 if(map.containsKey(i)) {
					 cow--;
					 i = i+mid;
				 }
				 else {
					 i++;
				 }
			  }
			  if(cow ==0 && mid>res) {
				  res = mid;
			  }
			  if(min == max) {
				 
				  break;
			  }
			  if(cow == 0) {
				  min = mid+1;
			  }else {
				  max = mid-1;
			  }
		  }
		  return res;
	    }
}
