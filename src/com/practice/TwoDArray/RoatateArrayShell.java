package com.practice.TwoDArray;

public class RoatateArrayShell {

	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };
		int rot = -4;
		int s = 2;

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		rotateShell(arr, rot, s);

		System.out.println("-----------After rotation---------------");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void rotateShell(int[][] arr, int rot, int s) {
		int[] oned = fillOnedFromShell(arr, s);
		rotate(oned, rot);
		fillShellFromOneD(arr, s, oned);
	}

	private static void fillShellFromOneD(int[][] arr, int s, int[] oned) {

		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;

		int idx = 0;
		// left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			arr[i][j] = oned[idx];
			idx++;
		}

		// bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			arr[i][j] = oned[idx];
			idx++;
		}

		// right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			arr[i][j] = oned[idx];
			idx++;
		}

		// top wall
		for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			arr[i][j] = oned[idx];
			idx++;
		}

	}

	private static void rotate(int[] arr, int rot) {
		// 1: Calculate how many rotation is required Formaula is %
		rot = rot % arr.length;
		// Handle negative rotation i.e If rot value is -2 and oned array lenth is 5
		// then we will rotate it 3 time it will give the rotated array
		if (rot < 0) {
			rot = rot + arr.length;
		}
		System.out.println("How many times to rotate " + rot);
		// First half
		reverse(arr, 0, arr.length - rot - 1);
		// second half reverse
		reverse(arr, arr.length - rot, arr.length - 1);
		// reverse both array
		reverse(arr, 0, arr.length - 1);
	}

	private static void reverse(int[] arr, int li, int ri) {
		while (li < ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			li++;
			ri--;
		}
	}

	private static int[] fillOnedFromShell(int[][] arr, int s) {
		int minr = s - 1;
		int minc = s - 1;
		int maxr = arr.length - s;
		int maxc = arr[0].length - s;
		int sz = 2 * (maxr - minr + maxc - minc);
		int[] oned = new int[sz];
		int idx = 0;

		// left wall
		for (int i = minr, j = minc; i <= maxr; i++) {
			oned[idx] = arr[i][j];
			idx++;
		}

		// bottom wall
		for (int i = maxr, j = minc + 1; j <= maxc; j++) {
			oned[idx] = arr[i][j];
			idx++;
		}

		// right wall
		for (int i = maxr - 1, j = maxc; i >= minr; i--) {
			oned[idx] = arr[i][j];
			idx++;
		}

		// top wall
		for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
			oned[idx] = arr[i][j];
			idx++;
		}
		return oned;
	}

}
