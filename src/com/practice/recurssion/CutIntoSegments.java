package com.practice.recurssion;

public class CutIntoSegments {

	public static void main(String[] args) {

		int segment = 7;
		int x = 5;
		int y = 2;
		int z = 2;

		cutIntoSegments(segment, x, y, z, "");
		System.out.println("Return max number of cuts in one rod for given x,y,z");
		int r = maxCutRod(segment, x, y, z);
		if(r == Integer.MIN_VALUE){
			//handle invalid conditions
			r=0;
		}
		System.out.println(r);
	}

	private static int maxCutRod(int segment, int x, int y, int z) {
		// base case
		if (segment == 0) {
			return 0;
		}
		if (segment < 0) {
			return Integer.MIN_VALUE;
		}
		int a = 0;
		// then only we will call
		a = maxCutRod(segment - x, x, y, z) + 1;
		int b = 0;
		b = maxCutRod(segment - y, x, y, z) + 1;
		int c = 0;
		c = maxCutRod(segment - z, x, y, z) + 1;

		return Integer.max(a, Integer.max(b, c));
	}

	private static void cutIntoSegments(int segment, int x, int y, int z, String ans) {

		// base case
		if (segment == 0) {
			System.out.println(ans);
			return;
		}
		// will call only if value is positive....
		if (segment - x >= 0) {
			cutIntoSegments(segment - x, x, y, z, ans + x);
		}
		if (segment - y >= 0) {
			cutIntoSegments(segment - y, x, y, z, ans + y);
		}
		if (segment - z >= 0) {
			cutIntoSegments(segment - z, x, y, z, ans + z);
		}
	}
}
