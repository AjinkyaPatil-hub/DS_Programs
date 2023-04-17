package com.practice.arrays;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 3, 3, 3 };

		// This loop will traverse to each element and mark the element as negative (it
		// indicates that the element is allready visited)
		for (int i = 0; i < arr.length; i++) {

			int ind = Math.abs(arr[i]);
			if (arr[ind - 1] > 0) {
				int element = arr[ind - 1];
				arr[ind - 1] = -element;
			}
		}
		System.out.println(Arrays.toString(arr));

		// The non-negative number indicates that number is missing

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println(i + 1 + " is Missing number");
			}
		}
	}
}
