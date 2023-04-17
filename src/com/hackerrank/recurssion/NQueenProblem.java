package com.hackerrank.recurssion;

public class NQueenProblem {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		printNQueens(arr, "", 0);
	}

	private static void printNQueens(int[][] chess, String qsf, int row) {
		if (row == chess.length) {
			System.out.println(qsf);
			return;
		}
		for (int col = 0; col < chess.length; col++) {
			if (isQueenSafeToPlace(chess, row, col) == true) {
				chess[row][col] = 1;
				printNQueens(chess, qsf + row + "-" + col + ",", row + 1);
				// remove while comming back
				chess[row][col] = 0;
			}
		}
	}

	private static boolean isQueenSafeToPlace(int[][] chess, int row, int col) {

		// check for upward vertical (col does not change only row gets row-1)
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		// check for left diagonal (row and col both gets -1 )
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		// check for right diagonal (row is getting -1 and col is getting plus+1)
		for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
}
