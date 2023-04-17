package com.practice.recurssion;

public class BinarySearchByRecurssion {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 22;
		int start = 0;
		int end = arr.length - 1;
		int index = binarySearch(arr, target, start, end);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {

		// base case
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (arr[mid] == target) {
			return mid;
		} else if (target > arr[mid]) {
			// search in right
			start = mid + 1;
			return binarySearch(arr, target, start, end);
		} else {
			// search in left
			end = mid - 1;
			return binarySearch(arr, target, start, end);
		}
	}
}
