package com.pepcoding.DP.level1;

import java.util.Arrays;

public class CoinChangePermutationWithInfiniteCoins {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 5 };
		int target = 7;

		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] <= i) {
					dp[i] = dp[i] + dp[i - arr[j]];
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[dp.length - 1]);
	}
}
