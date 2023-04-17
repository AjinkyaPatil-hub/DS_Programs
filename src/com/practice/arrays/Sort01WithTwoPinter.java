package com.practice.arrays;

import java.util.Arrays;

public class Sort01WithTwoPinter {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1 };
		twoPointers(arr);
		int li = 0;
		int ri = arr.length - 1;
		while (li < ri) {
			if (arr[li] == 0) {
				li++;
			}
			if (arr[ri] == 1) {
				ri--;
			} else if (arr[ri] == 0 && arr[li] == 1) {
				int temp = arr[li];
				arr[li] = arr[ri];
				arr[ri] = temp;
				li++;
				ri--;
			}
		}
		System.out.println(":: "+Arrays.toString(arr));
	}

	private static void twoPointers(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int i = 0;
		while (start < end) {
			if (arr[i] == 0) {
				// swap arr[i] with arr[start] i.e move all 0 in left
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				i++;
				start++;
			} else {
				// swap arr[end] with arr[i] i.e move all 1 to right
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
		System.out.println(":: " + Arrays.toString(arr));

	}
}
