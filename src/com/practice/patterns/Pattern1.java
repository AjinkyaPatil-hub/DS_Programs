package com.practice.patterns;

import java.util.Scanner;

//Question to print 
/*
 *     * * * * 
 *     * * * *
 *     * * * *
 *     * * * *
 */
public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter n :");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
