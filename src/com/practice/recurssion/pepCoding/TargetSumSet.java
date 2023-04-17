package com.practice.recurssion.pepCoding;

public class TargetSumSet {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60 };
		rec(arr, 0, 0, "");
	}

	private static void rec(int[] arr, int idx, int ans, String set) {
		// base case
		if (idx == arr.length) {
			return;
		}
		if (ans == 60) {
			System.out.println(set);
			return;
		}

		rec(arr, idx + 1, ans + arr[idx], set + arr[idx]); // include
		rec(arr, idx + 1, ans, set); // exclude
	}
}
