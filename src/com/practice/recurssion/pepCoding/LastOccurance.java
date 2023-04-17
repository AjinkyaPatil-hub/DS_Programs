package com.practice.recurssion.pepCoding;

public class LastOccurance {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 5, 4, 5, 4, 6, 7, 8, 9, 3 };
		int target = 3;
		// int idx = lastOccurance(arr, arr.length-1, target);
		int idx = lastOccuranceCase(arr, 0, target);
		System.out.println(idx);
	}

	private static int lastOccuranceCase(int[] arr, int idx, int target) {

		// base case
		if (idx == arr.length) {
			return -1;
		}
		// faith it will calculate and return the index if found or will return -1 if
		// not found
		int loinsa = lastOccuranceCase(arr, idx + 1, target);
		if (loinsa == -1) {
			// means element not found so will compare with idx
			if (arr[idx] == target) {
				// found at idx pos..
				return idx;
			} else {
				// not found by you also
				return -1;
			}
		} else {
			// else means element found at last occurance so return
			return loinsa;
		}

	}

	private static int lastOccurance(int[] arr, int i, int target) {
		// base case
		if (arr[i] == target) {
			return i;
		} else {
			return lastOccurance(arr, i - 1, target);
		}
	}
}
