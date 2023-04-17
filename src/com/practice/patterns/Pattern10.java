package com.practice.patterns;

import java.util.Scanner;

/*
 *     1
 *    232
 *   34543
 *  4567654
 *    
 */
public class Pattern10 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int row = 0; row < n; row++) {
			// spaces
			for (int s = 0; s < n - row - 1; s++) {
				System.out.print(" ");
			}

			// numbers
			int start = row + 1;
			for (int j = 0; j < row + 1; j++) {
				System.out.print(start);
				start = start + 1;
			}
			// reverse counting
			int s = 2 * row;
			for (int col = 0; col < row; col++) {
				System.out.print(s);
				s = s - 1;
			}

			System.out.println();
		}

	}
}
