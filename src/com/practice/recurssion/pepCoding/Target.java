package com.practice.recurssion.pepCoding;

public class Target {

	public static void main(String[] args) {

		int sr = 1;
		int sc = 1;
		int tr = 3;
		int tc = 2;

		paths(sr, sc, tr, tc, "");
	}

	private static void paths(int sr, int sc, int tr, int tc, String paths) {
		// base case
		if (sr == tr && sc == tc) {
			//path is right so will print the paths
			System.out.println(paths);
			return;
		}

		// go vertical
		if (sr < tr) {
			paths(sr + 1, sc, tr, tc, paths + "v");
		}
		// go horizontal
		if (sc < tc) {
			paths(sr, sc + 1, tr, tc, paths + "h");
		}

	}
}
