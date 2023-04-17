package com.practice.patterns;

import java.util.Scanner;

/*
 *   1
 *   1 2
 *   1 2 3
 *   1 2 3 4
 */
public class Pattern5 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col < row+1; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
