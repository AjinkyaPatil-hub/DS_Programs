package com.practice.arrays;

public class FindElementInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 6, 7, 1, 2 };
		int findEl = 7;

		// Step 1 first we will find pivot.
		int pivot = findPivot(arr);
		System.out.println("Pivot element " + arr[pivot]);

		// check findEl is greater than pivot
		if (findEl >= arr[0] && findEl <= arr[pivot]) {
			// search in array A
			System.out.println("Element at index: " + binarySearch(arr, 0, pivot, findEl));
		} else {
			// search in array B
			System.out.println("Element at index: " + binarySearch(arr, pivot + 1, arr.length - 1, findEl));
		}
		// then from pivot left side array will be 1 array and right side array will be
		// 2nd array
		// then we compare findEl with pivot and check if element is present in rigt
		// side or left side and apply binary search on it

	}

	private static int binarySearch(int[] arr, int start, int end, int target) {
		int mid = (start + end) / 2;
		while (start <= end) {

			if (arr[mid] == target) {
				return mid;
			}
			if (target > arr[mid]) {
				// search right
				start = mid + 1;
			} else {
				// search left
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		return -1;

	}

	private static int findPivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		while (start < end) {
			// check 1
			if (arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (arr[mid - 1] > arr[mid]) {
				return mid - 1;
			}
			if (arr[start] > arr[mid]) {
				end = mid;
			} else {
				start = mid;
			}
			mid = (start + end) / 2;
		}

		return 0;
	}
}
