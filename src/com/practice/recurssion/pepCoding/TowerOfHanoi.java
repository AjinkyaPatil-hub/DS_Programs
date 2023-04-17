package com.practice.recurssion.pepCoding;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;

		towerOfHanoi(n, 10, 11, 12);
	}

	private static void towerOfHanoi(int n, int t1id, int t2id, int t3id) {

		// base case
		if (n == 0) {
			return;
		}

		// keep faith that 2 disk will move and place at t3id
		towerOfHanoi(n - 1, t1id, t3id, t2id);

		System.out.println(n + "[" + t1id + "->" + t2id + "]");

		towerOfHanoi(n - 1, t3id, t2id, t1id);

	}
}
