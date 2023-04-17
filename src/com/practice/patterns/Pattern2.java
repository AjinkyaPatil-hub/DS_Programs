package com.practice.patterns;

import java.util.Scanner;

//Question to print hallow rectangle
/*
 *   * * * * 
 *   *     *
 *   *     *
 *   * * * *
 */
public class Pattern2 {

	public static void main(String[] args) {

		System.out.println("Enter n:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				// print first and last row as it is
				if (row == 0 || row == n - 1) {
					System.out.print("* ");
				} else {
					if (col == 0 || col == n - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

//		for (int row = 0; row < n; row++) {
//			if (row == 0 || row == n - 1) {
//				for (int i = 0; i < n; i++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			} else {
//				
//				System.out.print("* ");
//				for (int i = 0; i < n ; i++) {
//					System.out.print(" ");
//				}
//				System.out.println("* ");
//			}
//
//		}

	}
}
