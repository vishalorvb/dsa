package com.dyanamicprogramming;

public class Rod {
	
	public int getCost(int rodStart, int rodEnd, int cutStart, int cutEnd,int[] cuts) {
		
		if(cutStart == cutEnd || cutStart < 0 || cutEnd>=cuts.length || cutEnd<0) {
			return rodEnd - rodStart;
		}
		int min = Integer.MAX_VALUE;
		for(int i=cutStart;i<=cutEnd;i++) {
			int leftCost = getCost(rodStart,cuts[i],cutStart,i-1,cuts);
			int rightCost = getCost(cuts[i], rodEnd, cutStart+1, cutEnd, cuts);
			int sum = leftCost + rightCost + (rodEnd-rodStart);
			min = Math.min(min, sum);
		}
		return min;
	}
	 public int minCost(int n, int[] cuts) {
		 return getCost(0,cuts.length-1,0,n,cuts);
	        
	    }

}
