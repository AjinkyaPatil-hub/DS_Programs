package com.practice.recurssion.pepCoding;

import java.util.Scanner;

public class PrintIncrNDecr {

	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		printInNDec(n);
	}

	private static void printInNDec(int n) {
		//base case
		if(n == 0) {
			return;
		}
		//dec -- preorder
		System.out.println(n);
		
		printInNDec(n-1);
		//incr -- post-order
		System.out.println(n);
	}
}
