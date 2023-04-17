package com.practice.TwoDArray;

public class RotateArrayAntiClockWise {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };
		System.out.println("Array");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int minr = 0, minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		int r = 1;
		int t = 1;
		while (t <= r) {
			int temp = arr[0][0];
			// left wall
			for (int i = minr, j = minc; i <= maxr - 1; i++) {
				arr[i][j] = arr[i + 1][j];
			}
			// bottom rotate
			for (int i = maxr, j = minc; j <= maxc - 1; j++) {
				arr[i][j] = arr[i][j + 1];
			}
			// right rotate
			for (int i = maxr, j = maxc; i >= minr + 1; i--) {
				arr[i][j] = arr[i - 1][j];
			}
			// top rotation
			for (int i = minr, j = maxc; j >= minc + 1; j--) {
				arr[i][j] = arr[i][j - 1];
			}

			arr[0][1] = temp;
			System.out.println("After " + t + " rotation");
			System.out.println(" ---");
			for (int i = 0; i < arr.length; i++) {
				// col iterator
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(" " + arr[i][j]);
				}

				System.out.println();
			}

			t++;
		}
	}
}
