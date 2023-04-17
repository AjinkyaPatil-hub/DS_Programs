package com.practice.Algorithms;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 10, 4, 3, 20, 15 };

		System.out.println(KthSmallestElement(arr, 0, arr.length - 1, 3));
	}

	private static int KthSmallestElement(int[] arr, int lo, int hi, int k) {

		// 2: Will consider pivot as last index
		int pivot = arr[hi];

		// 3: will do partition by passing pivot , low and high (i.e i,j).
		int pi = partitionByPivot(arr, lo, hi, pivot);

		// 4:
		if (k > pi) {
			// search in right
			return KthSmallestElement(arr, pi + 1, hi, k);
		} else if (k < pi) {
			// search in left
			return KthSmallestElement(arr, lo, pi - 1, k);
		} else {
			return arr[pi];
		}
	}

	private static int partitionByPivot(int[] arr, int lo, int hi, int pivot) {
		int i = lo;
		int j = lo;

		while (i <= hi) {
			if (arr[i] <= pivot) {
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j - 1;
	}
}