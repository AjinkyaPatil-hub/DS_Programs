package com.practice.Algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 9, 4, 6, 1 };

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int lo, int hi) {

		// 1 base case: if their is 1 element or no element return,
		if (lo >= hi) {
			return;
		}

		// 2: Will consider pivot as last index
		int pivot = arr[hi];

		// 3: will do partition by passing pivot , low and high (i.e i,j).
		int pi = partitionByPivot(arr, lo, hi, pivot);

		// 4: we will get pivot index we will do again regression call excluding pivot
		// index
		quickSort(arr, lo, pi - 1);
		quickSort(arr, pi + 1, hi);
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
