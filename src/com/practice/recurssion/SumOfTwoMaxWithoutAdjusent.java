package com.practice.recurssion;

public class SumOfTwoMaxWithoutAdjusent {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 4, 9, 2, 2 };

		int max = getMaxOfTwoWithoutAdjusent(arr, 0, 0);
		System.out.println(max);
	}

	private static int getMaxOfTwoWithoutAdjusent(int[] arr, int i, int sum) {

		// base case
		if (i >= arr.length) {
			return 0;
		}

		// inclusive call (include current element and make call with i=i+2)
		int rres = getMaxOfTwoWithoutAdjusent(arr, i + 2, sum) + arr[i];

		// exclude call(normal call with i+1)
		int rrec = getMaxOfTwoWithoutAdjusent(arr, i + 1, sum);

		return Math.max(rres, rrec);

//		return Math.max(arr[i] + getMaxOfTwoWithoutAdjusent(arr, i + 2, sum),
//				getMaxOfTwoWithoutAdjusent(arr, i + 1, sum));
	}
}
