package com.practice.Algorithms;

import java.util.Arrays;

public class TargetSumPair {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 5;

		// will sort array
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] > target) {
				right--;
			} else if (arr[left] + arr[right] < target) {
				left++;
			}else if(arr[left]+arr[right] == target) {
				System.out.println("Sum = " + arr[left] + " " + arr[right]);
				left++;
				right--;
			}
		}
	}
}
