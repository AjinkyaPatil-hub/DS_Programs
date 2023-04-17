package com.practice.recurssion;

public class PrintSubArrayByRE {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 };

		pritnSubArray(arr, 0, 0);
	}

	private static void pritnSubArray(int[] arr, int start, int end) {

		// base case
		if (start == arr.length-1) {
			return;
		} else if (end == arr.length) {
			// increment start and make end = start
			start = start + 1;
			end = start;
		}

		for (int i = start; i <= end; i++)
			System.out.print(arr[i]);
		System.out.println();
		pritnSubArray(arr, start, end + 1);
	}
}
