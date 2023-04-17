package com.practice.arrays;

public class SprialMatrixPrint {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 8, 6, 7 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		int count = arr.length * arr[0].length;
		int c = 0;
		while (c < count) {

			// left wall (minc fix and minr++)
			for (int i = minr, j = minc; i <= maxr && c < count; i++) {
				System.out.println(arr[i][j]);
				c++;
			}
			minc++;

			// bottom wall (maxc fix and minc++)
			for (int i = maxr, j = minc; j <= maxc && c < count; j++) {
				System.out.println(arr[i][j]);
				c++;
			}
			maxr--;

			for (int i = maxr, j = maxc; i >= minr && c < count; i--) {
				System.out.println(arr[i][j]);
				c++;
			}
			maxc--;
			for (int i = minr, j = maxc; j >= minc && c < count; j--) {
				System.out.println(arr[i][j]);
				c++;
			}
			minr++;
			
			// break;
		}

	}
}
