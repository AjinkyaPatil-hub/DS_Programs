package com.practice.TwoDArray;

import java.util.Arrays;
import java.util.Comparator;

public class SortedMatrix {

	public static void main(String[] args) {
		int N = 4;
		int[][] arr = { { 23, 34, 35, 36 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 11, 12, 13, 14 } };

		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		// int[][] r = sortedMatrix(N, arr);

		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] sortedMatrix(int N, int arr[][]) {

		int row = arr.length;
		int col = arr[0].length;
		int[] res = new int[row * col];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				res[k] = arr[i][j];
				k++;
			}
		}
		// sort the array
		Arrays.parallelSort(res);
		System.out.println(Arrays.toString(res));

		// insert into array
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = res[z];
				z++;
			}
		}

		return arr;
	}
}
