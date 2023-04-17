package com.practice.patterns;

import java.util.Scanner;

/*
 *         *
 *       *   *
 *     *   *    *
 */
public class Pattern7 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int row = 0; row < n; row++) {
			// print spaces logic
			for (int space = 0; space < n - row - 1; space++) {
				System.out.print(" ");
			}

			// print * logic
			for (int j = 0; j < row + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
