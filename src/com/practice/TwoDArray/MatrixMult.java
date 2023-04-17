package com.practice.TwoDArray;

import java.util.Scanner;

public class MatrixMult {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// first array
		System.out.println("Enter rows");
		int rows = scan.nextInt();
		System.out.println("Enter col");
		int col = scan.nextInt();
		int[][] arr = new int[rows][col];

		// row iterator
		for (int i = 0; i < rows; i++) {
			// col iterator
			for (int j = 0; j < col; j++) {
				arr[i][j] = scan.nextInt();
			}
		}


		// Second array
		System.out.println("Enter  rows");
		int rows2 = scan.nextInt();
		System.out.println("Enter col");
		int col2 = scan.nextInt();
		int[][] arr2 = new int[rows2][col2];

		// row iterator
		for (int i = 0; i < rows2; i++) {
			// col iterator
			for (int j = 0; j < col2; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}


		// print array1
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		// print array2
		for (int i = 0; i < arr2.length; i++) {
			// col iterator
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(" " + arr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("o/p");
		//matrix multiplication
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr2[i].length;j++) {
				int a = arr[i][i];
				//System.out.println("f "+a);
				//System.out.println("s "+arr[j][i]);
				int sum = a*arr[j][i];
				System.out.print(sum +" ");
			}
			System.out.println();
		}
		
	}
}
