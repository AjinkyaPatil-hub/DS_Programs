package com.pepcoding.DP.level1;

public class PathWithMaxGold2DArray {

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
		// Travle from right top to left and solve the problem with finding max

		for (int j = dp[0].length - 1; j >= 0; j--) {
			for (int i = dp.length - 1; i >= 0; i--) {
				// right wall
				if (j == dp[0].length - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == 0) {
					dp[i][j] = Math.max(dp[i + 1][j + 1], dp[i][j + 1]) + arr[i][j];
				} else if (i == dp.length - 1) {
					dp[i][j] = Math.max(dp[i - 1][j + 1], dp[i][j + 1]) + arr[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j + 1], Math.max(dp[i][j + 1], dp[i + 1][j + 1]));
				}

			}
		}

		for (int i = 0; i < dp.length; i++) {
			// col iterator
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// find max in first col
		int max = Integer.MIN_VALUE;
		for (int i = 0, j = 0; i < dp.length; i++) {
			if (dp[i][j] > max) {
				max = dp[i][j];
			}
		}
		System.out.println(max);

	}
}




// write your code here


