package com.practice.patterns;

import java.util.Scanner;

/*
 *   * 
    * * 
   *   * 
  *     * 
 *       * 
*         * 
*          * 
 *        * 
  *     * 
   *   * 
    * * 
     * 
 * 
 */
public class Pattern9 {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int row = 0; row < n; row++) {
		  //print spaces
			for(int sp=sp=0;sp<n-row-1;sp++) {
				System.out.print(".");
			}
			//print *
			for(int j=0;j<2*row+1;j++) {
				if(j==0 || j==row) {
					System.out.print("*");
				}
				System.out.print("  ");
			}
			System.out.println();
			
		}
	}
}
