package com.pepcoding.DP.level1;

public class FiboWithMemo {

	public static void main(String[] args) {
		int n = 10;
		int fiboNum = fiboMem(n, new int[n + 1]);
		System.out.println(fiboNum);
	}

	private static int fiboMem(int n, int[] qb) {
		if (n == 0 || n == 1) {
			return n;
		}
		// if question bank has the answer return the answer , don't calculate it again
		if (qb[n] != 0) {
			return qb[n];
		}

		System.out.println("Rec called for " + n);
		int fibo1 = fiboMem(n - 1, qb);
		int fibo2 = fiboMem(n - 2, qb);
		int fi = fibo1 + fibo2;

		// store the calculated fibo in array. This technique is called memoziation
		qb[n] = fi;

		return fi;
	}

	private static int fiboWithRec(int n) {
		if (n == 0 || n == 1) {

			return n;
		}

		System.out.println("Hello " + n);
		int fibo1 = fiboWithRec(n - 1);
		int fibo2 = fiboWithRec(n - 2);
		int fi = fibo1 + fibo2;

		return fi;
	}
}
