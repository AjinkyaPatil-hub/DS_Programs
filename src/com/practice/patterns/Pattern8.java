package com.practice.patterns;

import java.util.Scanner;

/*
 *   * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

 */
public class Pattern8 {

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
		
		for (int i = 0; i < n; i++) {
			// logic for space
			for (int sp = 0; sp < i; sp++) {
				System.out.print(" ");
			}

			// logic for *
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
