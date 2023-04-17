package com.practice.numbers;

import java.util.Scanner;

/*
 *    ip: 234 
 *      op: 4 3 2
 */
public class SplitTheNumberAndPrint {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n != 0) {
			int rem = n % 10;
			System.out.println(rem );
			n = n / 10;
		}

	}
}
