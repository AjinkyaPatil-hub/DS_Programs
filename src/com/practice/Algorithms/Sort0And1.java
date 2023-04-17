package com.practice.Algorithms;

import java.util.Arrays;

public class Sort0And1 {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0, 1, 0, 1, 0, 1, 1, 1 };

		int[] res = partitioning(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] partitioning(int[] arr) {

		int i = 0;
		int j = 0;

		while (i < arr.length) {
			if (arr[i] <= 0) {
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				i++;
			}
		}

		return arr;
	}
}
