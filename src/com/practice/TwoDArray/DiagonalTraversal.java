package com.practice.TwoDArray;

public class DiagonalTraversal {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		for (int g = 0; g < arr.length; g++) {
			for (int i = 0, j = g; j < arr.length; i++, j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
