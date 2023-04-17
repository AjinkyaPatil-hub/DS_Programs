package com.practice.recurssion;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 5, 9 };
		int[] arr2 = new int[] { 2, 7, 8, 10, 11 };

		int[] res = mergeTwoSortedArray(arr, arr2);
		System.out.println(Arrays.toString(res));
	}

	private static int[] mergeTwoSortedArray(int[] arr, int[] arr2) {
		int[] res = new int[arr.length + arr2.length];

		int i = 0;
		int j = 0;
		int p = 0;
		while (i < arr.length && j < arr2.length) {
			if (arr[i] < arr2[j]) {
				res[p] = arr[i];
				i++;
			} else {
				res[p] = arr2[j];
				j++;
			}
			p++;
		}
		while (i < arr.length) {
			res[p] = arr[i];
			i++;
			p++;
		}
		while (j < arr2.length) {
			res[p] = arr2[j];
			j++;
			p++;
		}
		return res;
	}
}
