package com.recurssion;

public class Sudoku {
	boolean done = false;
	public void solve(char[][] board, int i, int j) {
		
		if (i == board.length ) {
			done = true;
			return;
		}

		int inext = j < board.length - 1?i:i+1;
		int jnext = j < board.length - 1?j+1:0;
		
		if (board[i][j] == '.') {
			for (int k = 1; k <= 9; k++) {
				if (isValid(board, i, j, Integer.toString(k).charAt(0))) {
					board[i][j] = Integer.toString(k).charAt(0);
					solve(board, inext, jnext);
				}
			}
			if(done == false) {
				board[i][j] = '.';
			}
			
		}else {
			solve(board, inext, jnext);
		}
		

	}

	
	
	
	
	
	
	
	private boolean isValid(char[][] board, int i, int j, char num) {
		for (int a = 0; a < 9; a++) {
			if (board[i][a] == num || board[a][j] == num) {
				return false;
			}
			int originI = (i / 3) * 3;
			int originJ = (j / 3) * 3;
			for (int x = originI; x < originI + 3; x++) {
				for (int y = originJ; y < originJ + 3; y++) {
					if (board[x][y] == num) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
