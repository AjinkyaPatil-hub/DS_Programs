package com.practice.arrays;

public class FindFirstOccuranceByBinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,4,5,6,6,6,6,9 };
		int te = 1;

		int start = 0;
		int end = arr.length - 1;
		int fe = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == te) {
				start = mid + 1;
				fe = mid;
			} else if (arr[mid] > te) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println("First occurance at index : " + fe);

	}
}
