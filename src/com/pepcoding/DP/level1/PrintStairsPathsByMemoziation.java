package com.pepcoding.DP.level1;

public class PrintStairsPathsByMemoziation {

	public static void main(String[] args) {
		int stairs = 4;
		int count = countPaths(stairs, new int[stairs + 1]);
		System.out.println(count);
	}

	private static int countPaths(int n, int[] qb) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}

		// check if question is sloved then dont slove it again just remove from
		// question bank and give
		if (qb[n] > 0) {
			return qb[n];
		}
		int n1 = countPaths(n - 1, qb);
		int n2 = countPaths(n - 2, qb);
		int n3 = countPaths(n - 3, qb);
		int tp = n1 + n2 + n3;

		// store answer in question bank
		qb[n] = tp;

		return tp;
	}
}
