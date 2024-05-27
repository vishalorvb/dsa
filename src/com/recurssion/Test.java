package com.recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {

		char[][] board = {
			    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
			};
		Sudoku s = new Sudoku();
		s.solve(board, 0, 0);

		for (int a = 0; a < board.length; a++) {
			for (int b = 0; b < board[0].length; b++) {
				System.out.print(board[a][b]);
				System.out.print(',');
			}
			System.out.println();
		}
		

}}
