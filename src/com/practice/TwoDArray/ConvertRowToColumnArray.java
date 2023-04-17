package com.practice.TwoDArray;

public class ConvertRowToColumnArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Array");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		// convert row to column
		// transverse the matrix

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println("After Transverse Array");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		//Now Swap the first element with last element in each row and with inner elements to make array 90degree rotation
		
		for(int i=0;i<arr.length;i++) {
			int li =0;
			int ri =arr[i].length-1;
			while(li<ri) {
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				li++;
				ri--;
			}
		}
		System.out.println("After Rotating Array in 90Degree..");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
}
