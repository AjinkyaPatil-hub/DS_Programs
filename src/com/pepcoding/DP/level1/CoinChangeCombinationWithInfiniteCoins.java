package com.pepcoding.DP.level1;

import java.util.Arrays;

public class CoinChangeCombinationWithInfiniteCoins {

	public static void main(String[] args) {
		// You have infinite coins and you have to tell the total combination of the
		// coins to make the target coin
		int[] arr = new int[] { 2, 3, 5 , 6 };
		int target = 10;

		// will make dp with target + 1
		int[] dp = new int[target + 1];
		dp[0] = 1; // o coins has one combination always..

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < dp.length; j++) {
				dp[j] = dp[j] + dp[j - arr[i]];
			}
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[target]);
	}
}
