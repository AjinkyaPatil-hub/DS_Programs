package com.practice.arrays;

import java.util.Arrays;

public class Sort01ByijPepCoding {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 1, 0, 0, 1, 0 };

		int i = 0;
		int j = 0;
		System.out.println("Brfore Sorting " + Arrays.toString(arr));
		while (i < arr.length) {
			if (arr[i] == 1) {
				// If we found 1 then only increment i
				i++;
			} else {
				// if we found 0 then will swap i and j and increment i and j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		System.out.println("After Sorting time com O(n) " + Arrays.toString(arr));
	}
}
