package com.practice.recurssion.pepCoding;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 220, 30, 40, 50, 60 };

		int max = max(arr, 0);
		System.out.println(max);
	}

	private static int max(int[] arr, int idx) {
		if (idx < arr.length) {
			int e = max(arr, idx + 1);
			int m = Math.max(arr[idx], e);
			return m;
		} else {
			return arr[0];
		}
	}
}
