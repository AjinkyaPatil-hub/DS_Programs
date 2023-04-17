package com.practice.TwoDArray;

public class ReverseSpiralTraverse {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		int count = 0;
		while (count < 16) {

			// top side
			for (int i = minr, j = minc; j <= maxc && count < 16; j++) {
				System.out.println(arr[i][j] + " ");
				count++;
			}
			minr++;
			// right side
			for (int i = minr, j = maxc; i <= maxr && count < 16; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			for (int i = maxr, j = maxc; j >= minc && count < 16; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			for (int i = maxr, j = minc; i >= minr && count < 16; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
		}

	}
}
