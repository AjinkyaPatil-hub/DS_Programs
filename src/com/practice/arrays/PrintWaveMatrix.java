package com.practice.arrays;

public class PrintWaveMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {88,66,77}};

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		// print in wave form

		for (int col = 0; col < arr[0].length; col++) {
			//last row./,
			int lastrow = arr.length-1;
			for (int row = 0; row < arr.length; row++) {
				if(col % 2 ==0) {
					//even row
					System.out.println(arr[row][col]);
				}else {
					System.out.println(arr[lastrow--][col]);
				}
			}
		}

	}
}
