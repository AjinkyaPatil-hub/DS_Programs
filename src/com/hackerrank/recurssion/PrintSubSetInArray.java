package com.hackerrank.recurssion;

public class PrintSubSetInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30 };
		int target = 30;
		printSum(arr, 0, target, "", 0);
	}

	private static void printSum(int[] arr, int idx, int target, String set, int sum) {
		if(idx == arr.length) {
			if (sum == target) {
				System.out.println("[" + set + "]");
			}
			return;
		}
		printSum(arr,  idx + 1,target, set + arr[idx]+",", sum + arr[idx]);
		printSum(arr, idx + 1, target, set, sum );

	}
}
