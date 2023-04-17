package com.practice.recurssion.pepCoding;

import java.util.Scanner;

public class PowerOfX {

	public static void main(String[] args) {
		System.out.println("Enter x: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("Enter n: ");
		int n = scan.nextInt();

//		int res = power(x, n);
		int res = powerWithBetterSol(x,n);
		System.out.println("Power : " + res);

	}

	private static int powerWithBetterSol(int x, int n) {

		//base case
		if(n==0) {
			return 1;
		}
		
		int xpnb2 = power(x, n/2);
		int xp = xpnb2 * xpnb2;
		
		//if n is odd then we have to add one time x
		if(n % 2 == 1) {
			xp = xp*x ;
		}
		return xp;
	}

	private static int power(int x, int n) {
		// base case

		if (n == 0) {
			return 1;
		}
		int power = power(x, n-1);
		int res = x * power;
		return res;
	}
}
