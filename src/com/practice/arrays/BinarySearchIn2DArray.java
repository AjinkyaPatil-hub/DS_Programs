package com.practice.arrays;

public class BinarySearchIn2DArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 9;
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int col = arr[0].length;
		int start = 0;
		int te = arr.length * arr[0].length;
		int end = te - 1;
		int mid = (start + end) / 2;

		while (start <= end) {

			//Formula to remove the mid (for rowIndex and colIndex)
			int rowIndex = mid / col;
			int colIndex = mid % col;

			int element = arr[rowIndex][colIndex];
			System.out.println("mid is " + element);
			if (element == target) {
				System.out.println("Element found " + element);
				break;
			}
			if (target > element) {
				// search in right
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

	}
}
