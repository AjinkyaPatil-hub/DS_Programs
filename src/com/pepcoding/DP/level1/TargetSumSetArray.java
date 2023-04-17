package com.pepcoding.DP.level1;

//return true if target sum is possible in given array
public class TargetSumSetArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 7, 1, 3 };
		int target = 10;

		// will create 2-D boolean array for x-axis as array elements , and y-axis as
		// 0-to-target and store if , sum can be done till array current element
		boolean[][] dp = new boolean[arr.length + 1][target + 1];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				// case 1: cell 0,0 when i==0 and j==0 it will always true
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false; // all values will be false
				} else if (j == 0) {
					dp[i][j] = true; // all values will be true
				} else {
					// step 1: check above then row-1(i-1) and if true return true
					if (dp[i - 1][j] == true) {
						dp[i][j] = true;
					} else {
						// we have to go back with minusing the value of i with j index , first we have
						// to check if the value is greater than the jth index if the value is smaller
						// then it will throw index out of memeory
						int value = arr[i - 1];
						if (j >= value) {
							dp[i][j] = dp[i - 1][j - value];
						}
					}
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			// col iterator
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" | " + dp[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println(dp[arr.length - 1][dp[0].length - 1]);

	}
}
