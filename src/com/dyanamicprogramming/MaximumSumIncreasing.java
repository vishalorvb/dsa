package com.dyanamicprogramming;

public class MaximumSumIncreasing {
	
	public int getmaxSum(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		Integer dpArray[] = new Integer[arr.length];
		dpArray[0] = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			int temp = 0;
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && dpArray[j]>temp) {
					temp = dpArray[j];
				}
			}
			dpArray[i] = temp+arr[i];
		}
		for(int k=0; k<dpArray.length;k++) { 
			if(dpArray[k] > max) {
				max = dpArray[k];
			}
		} 
		return max;
	}

}
