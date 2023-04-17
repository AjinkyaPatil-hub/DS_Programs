package com.practice.TwoDArray;

import java.util.Arrays;

public class FindMedia {

	public static void main(String[] args) {
		int arr[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };

		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int[] res = new int[9];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				res[k] = arr[i][j];
				k++;
			}
		}
		System.out.println(Arrays.toString(res));
		Arrays.parallelSort(res);
		System.out.println("After sorting arrary" + Arrays.toString(res));
		// finding mid
		int mid = res[res.length / 2];
		System.out.println("mid element " + mid);
	}
}
