package com.practice.TwoDarrays;

public class FindSumOfEachRow {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 2, 4, 5 }, { 6, 6, 7 } };

		System.out.println("Init Array");
		// print arrray
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("Print each row sum");

		for (int row = 0; row < arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
				sum += arr[row][col];
			}
			System.out.print("sum --> " + sum);
			System.out.println();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
				}
				if (arr[row][col] < min) {
					min = arr[row][col];
				}
			}
		}
		System.out.println("max: " + max + " min: " + min);
	}
}
