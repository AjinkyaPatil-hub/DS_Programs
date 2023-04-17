package com.pepcoding.DP.level1;

import java.util.Arrays;

public class PrintPathsByTabulation {

	public static void main(String[] args) {
		int n = 4;
		int count = printPathByTab(n);
		System.out.println(count);
	}

	private static int printPathByTab(int n) {
		int[] dp = new int[n + 1];

		dp[0] = 1;

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = dp[i - 1];
			} else if (i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}
}
