package com.practice.Algorithms;

import java.util.Arrays;

public class ContiguousSumSubArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 5;

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == target) {
					System.out.println("Index  " + i);
					break;
				}
				sum = sum + arr[j];
				if (sum == target) {
					System.out.println("Index from " + i + " to " + j);
					break;
				} else if (sum > target) {
					break;
				}
			}
		}
	}
}
