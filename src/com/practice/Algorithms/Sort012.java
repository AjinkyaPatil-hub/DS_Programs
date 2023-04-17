package com.practice.Algorithms;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 2, 1, 2, 0, 0 };

		int[] res = swap012(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] swap012(int[] arr) {
		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		while (i <= k) {

			if (arr[i] == 0) {
				// swap i j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else if (arr[i] == 2) {
				// swap i , k
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				//i++;
				k--;
			} else {
				i++;
			}
		}
		return arr;
	}
}
