package com.practice.Algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 5, 6, 4, 9, 8, 7 };

		int[] sa = mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(sa));
	}

	private static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}

		int mid = (lo + hi) / 2;
		int[] fa = mergeSort(arr, lo, mid);
		int[] sa = mergeSort(arr, mid + 1, hi);
		int[] fsa = mergeTwoSrotedArray(fa, sa);
		return fsa;
	}

	public static int[] mergeTwoSrotedArray(int[] arr, int[] arr2) {
		int[] res = new int[arr.length + arr2.length];
		int i = 0;
		int j = 0;
		int z = 0;

		while (i < arr.length && j < arr2.length) {
			if (arr[i] < arr2[j]) {
				res[z] = arr[i];
				i++;
				z++;
			} else {
				res[z] = arr2[j];
				j++;
				z++;
			}
		}
		while (i < arr.length) {
			res[z] = arr[i];
			i++;
			z++;
		}
		while (j < arr2.length) {
			res[z] = arr2[j];
			j++;
			z++;
		}
		return res;
	}

}
