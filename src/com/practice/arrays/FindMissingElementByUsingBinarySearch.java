package com.practice.arrays;

public class FindMissingElementByUsingBinarySearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };

		int start = 0;
		int end = arr.length - 1;

		int mid = (start + end) / 2;
		while (start < end) {

			if (start == mid)
				break;
			if (end == mid)
				break;
			if (mid + 1 == arr[mid]) {
				// element missing in right side
				start = mid;
			} else {
				end = mid;
			}
			mid = (start + end) / 2;
		}
		System.out.println(mid + 2 + " missing element ");
	}
}
