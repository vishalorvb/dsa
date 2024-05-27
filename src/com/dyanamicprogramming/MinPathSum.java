package com.dyanamicprogramming;

public class MinPathSum {
	
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int [][] sum = new int[row][col];
 				
		for(int i=row-1; i>=0; i--) {
			for(int j=col-1; j>=0; j--) {
				
				int right = Integer.MAX_VALUE;
				int down = Integer.MAX_VALUE;
				if(j<col-1) {
					right = sum[i][j+1];
				}
				if(i<row-1) {
					down = sum[i+1][j];
				}
				if(right == Integer.MAX_VALUE && down == Integer.MAX_VALUE) {
					sum[i][j]= grid[i][j];
				}
				else {
					int temp = grid[i][j] + Math.min(right, down);
					sum[i][j] = temp;
				}
			}
			
		}
		return sum[0][0]; 
	}

}
