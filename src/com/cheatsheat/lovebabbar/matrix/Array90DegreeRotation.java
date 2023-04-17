package com.cheatsheat.lovebabbar.matrix;

public class Array90DegreeRotation {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		// transverse swap of elements
		//convert row into column
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println("After traverse");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		//swap first index with last and same for all inner elements
		for(int i=0;i<arr.length;i++) {
			int li = 0;
			int ri = arr[i].length-1;
			while(li<ri) {
				int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				li++;
				ri--;
			}
		}
		System.out.println("After swaps");
		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
