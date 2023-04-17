package com.practice.TwoDArray;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scan.nextInt();
		System.out.println("Enter col");
		int col = scan.nextInt();
		int[][] arr = new int[rows][col];
		
		//row iterator
		for(int i=0 ; i<rows;i++) {
			//col iterator
			for(int j=0;j<col;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		//print array
		for(int i=0 ; i<arr.length;i++) {
			//col iterator
			for(int j=0;j<arr[i].length;j++) {
				 System.out.print(" "+arr[i][j]); 
			}
			System.out.println();
		}
		System.out.println("Total Rows: "+arr.length);
		System.out.println("Total Columns: "+arr[0].length);
	}
}
