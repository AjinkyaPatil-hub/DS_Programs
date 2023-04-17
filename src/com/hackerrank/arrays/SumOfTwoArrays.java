package com.hackerrank.arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] arr = new int[] { 9,9,8 };
		int[] arr2 = new int[] { 2,8 };
		int maxSize = Math.max(arr.length, arr2.length);
		int[] res = new int[maxSize];
		int i = 0;
		int p = arr.length - 1;
		int p2 = arr2.length - 1;
		int rem = 0;
		while (maxSize > i) {

			int a1 = 0;
			int a2 = 0;
			if (p >= 0) {
				a1 = arr[p];
				p--;
			}
			if (p2 >= 0) {
				a2 = arr2[p2];
				p2--;
			}
			int sum = 0;
			if (rem != 0) {
				sum = a1 + a2 + rem;
			} else {
				sum = a1 + a2;
			}

			// check if number addition is grater than 100 then
			if (sum > 9) {
				String s = sum + "";
				sum = Integer.parseInt(s.substring(s.length() - 1));
				rem = Integer.parseInt(s.substring(0, s.length() - 1));

			} else {
				rem = 0;
			}
			System.out.println(sum);
			i++;
		}
		System.out.println(rem);
	}
}
