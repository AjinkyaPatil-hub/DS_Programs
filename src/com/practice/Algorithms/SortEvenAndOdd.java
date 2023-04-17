package com.practice.Algorithms;

import java.util.Arrays;

public class SortEvenAndOdd {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 7, 6, 5, 3 };
		// put even on left and odd on right
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
