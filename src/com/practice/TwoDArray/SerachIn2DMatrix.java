package com.practice.TwoDArray;

public class SerachIn2DMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int target = 15;
		boolean isFound = searchMatrix(arr, target);
		System.out.println(isFound);
	}

	private static boolean searchMatrix(int[][] arr, int target) {
		int count = 0;
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[minr][minc] <= target && arr[minr][maxc] >= target) {
				// element may or may not be present in bwt.. will search
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] == target) {
						return true;
					}
				}
				return false;
			}
			minr++;
		}
		return false;
	}
}
