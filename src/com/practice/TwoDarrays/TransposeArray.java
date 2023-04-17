package com.practice.TwoDarrays;

public class TransposeArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 8, 4, 5 }, { 7, 6, 55 } };

		System.out.println("Init Array");
		// print arrray
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("Init Array");
		// print arrray
		for (int row = 0; row < arr.length; row++) {
			for (int col = row; col < arr[row].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
		
		System.out.println("After Transpose Array");
		// print arrray
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	
}
