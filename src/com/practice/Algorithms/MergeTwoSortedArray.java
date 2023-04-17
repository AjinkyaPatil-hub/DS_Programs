package com.practice.Algorithms;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 9 };
		int[] arr2 = new int[] { 2, 5, 7, 8, 20, 98 };

		int[] res = new int[arr.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr.length && j < arr2.length) {
			if (arr[i] < arr2[j]) {
				res[k] = arr[i];
				i++;
				k++;
			} else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}

		while (i < arr.length) {
			res[k] = arr[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(res));
		// Arrays.parallelSort(res);

	}
}
