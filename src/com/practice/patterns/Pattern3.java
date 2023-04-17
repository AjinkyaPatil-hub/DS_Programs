package com.practice.patterns;

import java.util.Scanner;

/*
 *     *
 *     * *
 *     * * *
 *     * * * *
 */
  
public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int col = 0; col < i+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
