package com.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MaximumSumCombination {
	 public int[] solve(int[] A, int[] B, int C) {
		 List<Integer> list = new ArrayList<>();
		 for(int i=0;i<A.length;i++) {
			 for(int j=0; j<B.length; j++) {
					 list.add(A[i]+B[j]);
			 }
		 }
		 int res[] = new int[C];
		 list.sort(Comparator.reverseOrder());
		 for(int i=0;i<C;i++) {
			 res[i] = list.get(i);
		 }
		 return res;
	    }
}


