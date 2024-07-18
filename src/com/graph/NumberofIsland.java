package com.graph;

public class NumberofIsland {
	
	private void mark(char[][] grid, boolean[][] visited,int i, int j) {
		
		if(j<grid[0].length-1 &&  grid[i][j+1] == '1' ) {
			visited[i][j+1] = true;
			mark(grid, visited, i, j+1);
		}
		if(i<grid.length-1 && grid[i+1][j]=='1') {
			visited[i+1][j] = true;
			mark(grid, visited, i+1, j);
		}
	}
	
	
    public int numIslands(char[][] grid) {
        int count =0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
        	for(int j=0; j<grid[0].length;j++) {
        		if(grid[i][j] == '1' && visited[i][j] == false) {
        			count++;
        			mark(grid, visited, i, j);
        		}
        	}
        }
        return count;
    }

}
