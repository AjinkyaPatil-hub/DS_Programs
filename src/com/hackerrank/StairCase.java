package com.hackerrank;

public class StairCase {

	public static void main(String[] args) {
		int n = 6;
		printStairCase(n);
	}

	private static void printStairCase(int n) {

		for (int i = 0; i < n; i++) {
			// print space
			for (int j = i; j < n ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}
