package com.practice.recurssion.pepCoding;

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

		for (int col = 0; col < chess[0].length; col++) {
			if (isQueenSafeToPlace(chess, row, col) == true) {
				chess[row][col] = 1;
				printNQueens(chess, qsf + row + "-" + col + ",", row + 1);
				chess[row][col] = 0;
			}
		}
	}

	private static boolean isQueenSafeToPlace(int[][] chess, int row, int col) {

		// check upwards row gets changed
		for (int i = row - 1, j = col; i >= 0; i--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		// check diagonal left side (col gets minus and row )
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (chess[i][j] == 1) {
				return false;
			}
		}

		// check diagonal right(col gets plus and row gets minus)
		for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++) {
			if (chess[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

}
