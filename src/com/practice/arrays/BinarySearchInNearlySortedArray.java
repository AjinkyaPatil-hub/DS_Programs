package com.practice.arrays;

public class BinarySearchInNearlySortedArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 3, 40, 20, 50, 80, 70 };
		// Nearly sorted array rule. Each element will be appear exact position on i-1
		// ,i , i+1 , some of this 3 posotions
		int target = 70;
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (start <= end) {

			// Case 1(exact position)
			if (arr[mid] == target) {
				System.out.println("Element found at position : " + mid);
				break;
			}
			// Case 2 (i-1)
			if (mid-1 >= 0 && arr[mid - 1] == target) {
				System.out.println("Element found at position : " + (mid - 1));
				break;
			}
			// Case 3 (i+1)
			if (mid+1 < arr.length && arr[mid + 1] == target) {
				System.out.println("Element found at position : " + (mid + 1));
				break;
			}
			if (target > arr[mid]) {
				// search in right
				start = mid + 2; // as we have all ready has search on i+1 index
			} else {
				end = mid - 2;
			}
			mid = (start + end) / 2;
		}

	}
}
