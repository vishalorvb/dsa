package com.array;

import java.util.Stack;

public class MergeIntervals {
	
	private void sort(int[][] arrays) {
		for(int i=0; i <arrays.length; i++) {
			for(int j=1; j<arrays.length -i; j++) {
				int[] subArray = arrays[j];
				int[] prevSubArray = arrays[j-1];
				if(prevSubArray[0]>subArray[0]) {
					int[] temp = prevSubArray;
					arrays[j-1] = subArray;
					arrays[j] = temp;
					
				}
			}
		}
	}
	
	public int[][] merge(int[][] intervals){
		sort(intervals);
		Stack<int[]> stack = new Stack<int[]>();
		
		for(int i=0; i<intervals.length; i++) {
			if(!stack.isEmpty()) {
				if(stack.peek()[1]>=intervals[i][0]) {
					stack.peek()[1] = Math.max(stack.peek()[1], intervals[i][1]);
				}
				else {
					stack.push(intervals[i]);
				}
			}
			else {
				stack.push(intervals[i]);
			}
		}
		int[][] res = new int [stack.size()][2];
		for(int i=stack.size()-1;i>=0;i--) {
			res[i] = stack.pop();
		}
		return res;
	}

}
