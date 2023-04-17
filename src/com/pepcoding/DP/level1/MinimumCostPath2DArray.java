package com.pepcoding.DP.level1;

public class MinimumCostPath2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 1, 8 }, { 1, 0, 1, 2 }, { 3, 4, 2, 5 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		int[][] dp = new int[arr.length][arr[0].length];

		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp[0].length - 1; j >= 0; j--) {
				// check for last cell value , ad add as it is
				if (i == dp.length - 1 && j == dp[0].length - 1) {
					dp[i][j] = arr[i][j];
				}
				// last row
				else if (i == dp.length - 1) {
					dp[i][j] = dp[i][j + 1] + arr[i][j];
				}
				// last column
				else if (j == dp[0].length - 1) {
					dp[i][j] = dp[i + 1][j] + arr[i][j];
				}
				// middle part
				else {
					dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
				}
			}
		}
		System.out.println(dp[0][0]);
	}
}
