package com.hackerrank.DP;

import java.util.Arrays;

public class FiboByDP {

	public static void main(String[] args) {
		int n = 10;
		//System.err.println("fibo of 10 by rec "+ fibByRec(n));
		
		System.out.println("fibo of 10 by db "+fiboMemorization(n,new int[n+1]));
	}

	
	private static int fibByRec(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		System.out.println("Fibo "+n);
		int fib1 = fibByRec(n-1);
		int fib2 = fibByRec(n-2);
		return fib1+fib2;
	}


	private static int fiboMemorization(int n, int[] dp) {
		if(n==0 || n== 1) {
			return n;
		}
		//Actual db, we will check if fibo is allready is calculated , if yes will return that 
		// and not calculate again 
		System.out.println("Fibo "+n);
		if(dp[n] != 0) {
			return dp[n];
		}
		int fib1 = fiboMemorization(n-1, dp);
		int fib2 = fiboMemorization(n-2, dp);
		int fib = fib1+fib2;
		// we will store each calculated value of fib.
		dp[n] = fib;
		System.out.println(Arrays.toString(dp));
		return fib;
	}
}
