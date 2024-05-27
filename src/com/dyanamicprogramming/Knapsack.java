package com.dyanamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
	
	public static int maxProfit	(List<Integer> values, List<Integer> weight, int w) {
		int dpArrray[][] = new int[values.size()+1][w+1];	
		for(int i=1; i<dpArrray.length; i++) {
			for(int j=1; j<dpArrray[0].length; j++) {
				int index = j-weight.get(i-1);
				if(index<0) {
					dpArrray[i][j] = dpArrray[i-1][j];
					continue;
				}
				int lastVal  = dpArrray[i-1][index];
				dpArrray[i][j] = Math.max(lastVal+values.get(i-1),dpArrray[i-1][j]);
			}
		}
		return dpArrray[values.size()][w];
	}

}
