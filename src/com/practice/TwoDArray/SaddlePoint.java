package com.practice.TwoDArray;

public class SaddlePoint {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		// loop in all rows to din the min for that row....
		// and get the column idex

		// outer loop for each rows
		for (int i = 0; i < arr.length; i++) {
			int svj = 0;
			// for each value col
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j] < arr[i][svj]) {
					svj = j;
				}
			}
			System.out.println("find min of the row "+arr[i][svj]);

			// now check if that value is greater than its column
			// If yes print and break if no continue. for other rows

			boolean flag = true;
			for (int z = 0; z < arr.length; z++) {
				if (arr[z][svj] > arr[i][svj]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("saddle point " + arr[i][svj]);
			return;
			}
			
		}
		System.out.println("No Saddle point found...");

	}

}
