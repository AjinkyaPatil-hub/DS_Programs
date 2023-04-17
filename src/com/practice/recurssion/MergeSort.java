package com.practice.recurssion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 5, 6, 4, 9, 8, 7 };

		int[] sa = mergeSort(arr, 0, arr.length - 1);
		System.out.println("Before sorting array by Merge Sort: " + Arrays.toString(arr));
		System.out.println("After Sorting : " + Arrays.toString(sa));
	}

	private static int[] mergeSort(int[] arr, int lo, int hi) {

		// base case
		if (lo == hi) {
			int[] res = new int[1];
			res[0] = arr[lo];
			return res;
		}
		
		

		// 1:find mid
		int mid = (lo + hi) / 2;
		// 2: pass array from start to mid and get it sorted
		int[] arr1 = mergeSort(arr, lo, mid);

		// 3: pass another half array i.e from mid+1 to end and get it sorted
		int[] arr2 = mergeSort(arr, mid + 1, hi);

		// 4: Get two array merge by calling merge two sorted array
		return mergeTwoArray(arr1, arr2);
	}

	private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		// will create a result array
		int[] res = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
			} else {
				res[k] = arr2[j];
				j++;
			}
			k++;
		}

		// Merge remaning arrays
		while (i < arr1.length) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		return res;

	}
}
