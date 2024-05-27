package com.recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueen {

	private List<String> getResponse(int[][] row) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < row.length; i++) {
			int col[] = row[i];
			String temp = "";
			for (int j = 0; j < col.length; j++) {
				if (col[j] == 1) {
					temp = temp + "Q";
				} else {
					temp = temp + ".";
				}
			}
			res.add(temp);
		}
		return res;
	}

	private void solve(int[][] board, int row, List<List<String>> res, int[] Ndaigonal, int[] Rdaigonal, int[] column) {
		if (row == board.length) {
			res.add(getResponse(board));
			System.out.println("=========");
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (column[col] == 0 && Ndaigonal[row + col] == 0 && Rdaigonal[row - col + board.length - 1] == 0) {
				column[col] = 1;
				board[row][col] = 1;
				System.out.println(Arrays.toString(board[row]));
				Ndaigonal[row + col] = 1;
				Rdaigonal[row - col + board.length - 1] = 1;
				solve(board, row + 1, res, Ndaigonal, Rdaigonal, column);
				column[col] = 0;
				board[row][col] = 0;
				Ndaigonal[row + col] = 0;
				Rdaigonal[row - col + board.length - 1] = 0;

			}
		}
	}

	public List<List<String>> solveNQueens(int n) {
		int board[][] = new int[n][n];
		int Ndaigonal[] = new int[2 * n + 1];
		int Rdaigonal[] = new int[2 * n + 1];
		int column[] = new int[n];
		int row = 0;
		List<List<String>> res = new ArrayList<>();
		solve(board, row, res, Ndaigonal, Rdaigonal, column);
		return res;
	}

//	int boardSize;
//	int board[][];
//	int rightdaigonal[];
//	int leftdaigonal[];
//
//	Nqueen(int size) {
//		this.boardSize = size;
//		this.board = new int[size][size];
//		this.rightdaigonal = new int[(2 * size) + 1];
//		this.leftdaigonal = new int[(2 * size) + 1];
//	}

}
