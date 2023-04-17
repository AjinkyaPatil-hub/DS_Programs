package com.practice.numbers;

/*
 *   ip: 2,3,4,6
 *   op: 2346
 */
public class GivenNumberCombineNumber {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 5 };

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans*10+arr[i];
		}
		System.out.println("number:  "+ans);
	}
}
