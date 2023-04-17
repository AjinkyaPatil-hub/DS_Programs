package com.practice.arrays;

public class ClaculateQuotientByBinarySearch {

	public static void main(String[] args) {

		int div = 22;
		int divs = 7;
		// ans will be 3 (7*3)
		// we will follow binary search approach , check ans and store ans

		int start = 0;
		int end = div;
		int mid = (start + end) / 2;
		int ans = 0;
		while (start <= end) {

			if (mid * divs == div) {
				System.out.println("ans " + mid);
				break;
			}

			if (mid * div > div) {
				// search in left
				end = mid - 1;
			} else {
				ans = mid;
				// search in right
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		System.out.println(ans);
	}
}
