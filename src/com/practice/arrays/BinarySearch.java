package com.practice.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int fe = 7;

		// binary serach
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// find mid
			int mid = (start + end) / 2;

			// check if we found the element
			if (arr[mid] == fe) {
				System.out.println("Element found at index : " + mid);
				break;
			}

			if (arr[mid] > fe) {
				// search in left
				end = mid - 1;
			} else {
				// search in right array
				start = mid + 1;
			}
		}

	}
}
