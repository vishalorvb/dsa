package com.dyanamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
	
	
	public void printSubsequence(List<Integer> chotaList,int[] arr, int indx) {
		if(indx == arr.length) {
			System.out.println(chotaList);
			return;
		} 
		printSubsequence(new ArrayList<>(chotaList),arr,indx+1);
		chotaList.add(arr[indx]);
		printSubsequence(new ArrayList<>(chotaList),arr,indx+1);
		
	}
	
	

}
