package com.practice.arrays;

import java.util.Arrays;

public class MoveAllNegativeToLeftNPosToRight {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, -5, -7, 2, -55 };
		int i = 0;
		int j = 0;

		System.out.println("Before srot " + Arrays.toString(arr));
		while (i < arr.length) {
			if (arr[i] >= 1) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
}
