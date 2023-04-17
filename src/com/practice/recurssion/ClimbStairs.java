package com.practice.recurssion;

public class ClimbStairs {

	public static void main(String[] args) {
		int target = 5;
		int cnt = 0;
		System.out.println( climbStairs(target));
	}

	public static int climbStairs(int n) {
		// base case
		if (n == 0 || n==1) {
			return 1;
		}
		
		int ans = climbStairs(n-1)+climbStairs(n-2);
		return ans;
	}
}
