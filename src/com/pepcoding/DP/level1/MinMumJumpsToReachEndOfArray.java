package com.pepcoding.DP.level1;

import java.util.Arrays;

public class MinMumJumpsToReachEndOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 0, 2, 2, 2, 3, 1 };
		int n = arr.length;

		// Array will create will null values
		Integer[] dp = new Integer[n + 1];
		dp[n] = 0;

		for (int i = n - 1; i >= 0; i--) {

			// skip 0 values bcoz it does not contains any paths
			if (arr[i] > 0) {
				int min = Integer.MAX_VALUE;
				for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
					if (dp[i + j] != null) {
						min = Math.min(min, dp[i + j]);
					}

				}
				if (min != Integer.MAX_VALUE) {
					dp[i] = min + 1;
				}
			}

		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[0]);
		System.out.println("min jumps to reach at end of array : "+minJumps(arr));
	}

	static int minJumps(int[] arr) {
		// your code here
		int count = 0, current = 0, max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			max = Math.max(max, i + arr[i]);
			
			 if (i == current) {
				current = max;
				count++;
			}
		}
		return count;
	}
}
