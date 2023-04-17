package com.practice.arrays;

public class ClaculateSqrRootByBinarySearch {

	public static void main(String[] args) {
		int sqr = 10;

		int ans = sqrt(sqr);
		System.out.println("Square root of 25 is : "+ans);
	}

	private static int sqrt(int sqr) {
		int target = sqr;
		int start = 0;
		int end = target;
		int mid = (start + end) / 2;
		int ans = -1;
		while (start <= end) {

			if (mid * mid == target) {
				return mid;
			}
			if (mid * mid > target) {
				// search in left
				end = mid - 1;
			} else {
				// store the result in ans
				ans = mid;
				// search in right
				start = mid + 1;
			}
			mid = (start + end) / 2;

		}

		return ans;
	}
}
