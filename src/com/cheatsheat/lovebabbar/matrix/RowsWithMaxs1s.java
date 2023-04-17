package com.cheatsheat.lovebabbar.matrix;

public class RowsWithMaxs1s {

	public static void main(String[] args) {
		int N = 4, M = 4;
		int arr[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Max 1's in row is : "+rowWithMax1s(arr, N, M));
	}

	public static int rowWithMax1s(int arr[][], int n, int m) {
		// code here
		int maxOnesOfRows = 0;
		int rowMax = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}
			if (count > maxOnesOfRows) {
				maxOnesOfRows = count;
				rowMax = i;
			}
		}
		if (rowMax < 0) {
			return -1;
		}
		return rowMax;
	}
}
