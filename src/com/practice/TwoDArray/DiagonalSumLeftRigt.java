package com.practice.TwoDArray;

public class DiagonalSumLeftRigt {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		// Digonal print
		int leftSum = 0;
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			leftSum += arr[i][j];
		}

		int rightSum = 0;
		for (int i = 0, j = arr[0].length - 1; i < arr.length; i++, j--) {
			rightSum += arr[i][j];
		}
		System.out.println(leftSum);
		System.out.println(rightSum);
		int differnece = leftSum-rightSum;
		System.out.println(differnece);
	}

}
