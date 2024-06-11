package com.dyanamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Egg {

	public Integer eggDrop(int n, int k) {

		if (k == 1) {
			return 1;
		}
		if (n == 1) { 
			return k;
		}

		Integer[][] table = new Integer[n + 1][k + 1];

		for (int i = 1; i < table.length; i++) {
			table[i][0] = 0;
			table[i][1] = 1;
		}
		for(int i=0; i<table[1].length;i++) {
			table[1][i] = i;
		}
	
		for(int i=2;i<table.length;i++) { 
			for(int j=2;j<table[i].length;j++) {
				int u = 0;
				int l = j-1;
				int min = Integer.MAX_VALUE;
				while(u<j && l>=0) {
					int val1 = table[i-1][u];
					int val2 = table[i][l];
					int max = Math.max(val1, val2);
					min = Math.min(max, min);
					u++;
					l--;
				}
				table[i][j] = min+1;
				
			}
		}
		return table[n][k];
	}

}
