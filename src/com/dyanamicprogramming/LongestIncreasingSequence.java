package com.dyanamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSequence {

	int max = Integer.MIN_VALUE;

	public void getmaxSubsequence(List<Integer> chotaList, int[] arr, int indx) {

		if((chotaList.size() + (arr.length - indx)) <= max) {
			return ;
		}
		if (indx >= arr.length) {
			if (chotaList.size() >= max) {
				System.out.println(chotaList);
				max = chotaList.size(); 
			}
			return;
		}
		
		int lastIndex = chotaList.size() - 1;
		if (chotaList.size() == 0 || arr[indx] > chotaList.get(lastIndex)) {
			chotaList.add(arr[indx]);
			getmaxSubsequence(new ArrayList<>(chotaList), arr, indx + 1);
			chotaList.remove(lastIndex + 1);
		}
		getmaxSubsequence(new ArrayList<>(chotaList), arr, indx + 1);

	}
	
	public int getmaxSubsequence2(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		Integer dpArray[] = new Integer[arr.length];
		dpArray[0] = 1;
		
		for(int i=1; i<arr.length; i++) {
			int temp = 0;
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && dpArray[j]>temp) {
					temp = dpArray[j];
				}
			}
			dpArray[i] = temp+1;
		}
		for(int k=0; k<dpArray.length;k++) {
			if(dpArray[k] > max) {
				max = dpArray[k];
			}
		}
		return max;
	}
	
}
