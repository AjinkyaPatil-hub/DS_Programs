package com.practice.patterns;

import java.util.Scanner;

/*
 *    1 2 3 4 5
 *    1 2 3 4
 *    1 2 3
 *    1 2
 *    1
 */
public class Pattern6 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n - row; col++) {
				System.out.print(col + 1 + " ");
			}
			System.out.println();

		}
	}
}
