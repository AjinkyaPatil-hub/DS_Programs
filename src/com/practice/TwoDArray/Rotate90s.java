package com.practice.TwoDArray;

public class Rotate90s {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };

		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		// step 1 transvers the array first
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println("Transversed matrix");
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("Now swap the elements to rotate array in 90 degree");

		for (int i = 0; i < arr.length; i++) {
			int minc = 0;
			int maxc = arr[0].length - 1;
			while (minc < maxc) {
				int temp = arr[i][minc];
				arr[i][minc] = arr[i][maxc];
				arr[i][maxc] = temp;
				minc++;
				maxc--;
			}
		}

		System.out.println("After swapping matrix");
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

	}
}
