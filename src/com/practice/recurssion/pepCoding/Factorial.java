package com.practice.recurssion.pepCoding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int res = factorial(n);
		System.out.println("Factorial is :"+res);
	}

	private static int factorial(int n) {
		// base case
		if (n == 1) {
			return 1;
		}
		//return n * factorial(n - 1);
		int fact1 = factorial(n-1);
		int res = n * fact1;
		return res;
	}
}
