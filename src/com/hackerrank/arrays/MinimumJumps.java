package com.hackerrank.arrays;

public class MinimumJumps {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 0, 1, 1, 4 };
		int jumps = minJumps(arr);
		System.out.println(jumps);
	}

	private static int minJumps(int[] arr) {
		int jump = 0, pos = 0, dest = 0;
		for(int i=0;i<arr.length;i++) {
			dest = Math.max(dest, arr[i]+1);
			if(pos == i) {
				pos = dest;
				jump++;
			}
		}
		return jump;
	}
}
