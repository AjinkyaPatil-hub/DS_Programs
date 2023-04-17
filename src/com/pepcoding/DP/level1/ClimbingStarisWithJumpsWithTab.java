package com.pepcoding.DP.level1;

import java.util.Arrays;

public class ClimbingStarisWithJumpsWithTab {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 8};
		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[n] = 1;
		System.out.println(Arrays.toString(dp));
		System.out.println("Actual Jumps :" + Arrays.toString(arr));
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
				dp[i] = dp[i] + dp[i + j];
			}
			System.out.println(Arrays.toString(dp));
		}
		System.out.println("DP stores each jumps " + Arrays.toString(dp));
		System.out.println(dp[0]);
	}
}
