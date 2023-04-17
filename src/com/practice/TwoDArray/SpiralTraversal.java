package com.practice.TwoDArray;

public class SpiralTraversal {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 4, 5, 6, 55, 66 }, { 1, 2, 3, 55, 33 } };

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
		int tnte = 15;
		int count = 0;
		while (count < tnte) {

			// 1 Left wall (rows are getting changed from minr to maxr and col is fixed
			// i=row and j = col)
			for (int i = minr, j = minc; i <= maxr && count < tnte; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;

			// 2 bottom wall (col changes from minc to maxc and row is fixed at maxr)
			for (int i = maxr, j = minc; j <= maxc && count < tnte; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			// 3 right wall (row changes from maxr to minr and col is fixed with maxc)
			for (int i = maxr, j = maxc; i >= minr && count < tnte; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			// 4 top wall (col changes from maxc to minc and row is fixed with minr)
			for (int i = minr, j = maxc; j >= minc && count < tnte; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
	}

}
