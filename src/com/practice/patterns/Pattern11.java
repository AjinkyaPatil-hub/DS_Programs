package com.practice.patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 5;
		a= (++a)*(++a);
		System.out.println(a);
		for (int row = 0; row < n; row++) {
			// spaces
			for (int sp = 0; sp < n - row - 1; sp++) {
				System.out.print(" ");
			}
			// numbers
			for (int col = 0; col < 2 * row + 1; col++) {

				// first
				if (col == 0 || col == 2 * row + 1 - 1) {
					System.out.print(col + 1 + " ");
				}
				System.out.print(" ");

				// last
				if (col == 2 * row - 1) {
					System.out.print(row + 1 + " ");
				}

			}

			System.out.println();
		}
	}
}
