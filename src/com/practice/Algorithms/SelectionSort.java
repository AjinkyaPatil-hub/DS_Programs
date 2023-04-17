package com.practice.Algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 9, 7, 3, 5, 1 };
		System.out.println("Before sorting array : :" + Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			// find the min
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// min found
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
				System.out.println(" sorting array : :" + Arrays.toString(arr));

		}
		System.out.println("After sorting array : :" + Arrays.toString(arr));
	}
}
