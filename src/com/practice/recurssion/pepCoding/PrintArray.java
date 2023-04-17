package com.practice.recurssion.pepCoding;

public class PrintArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		displayArr(arr, 0);
		System.out.println("---");
		displayArrInReverse(arr, 0);
	}

	private static void displayArrInReverse(int[] arr, int i) {
		// base case
		if (i == arr.length) {
			return;
		}

		displayArrInReverse(arr, i + 1);
		System.out.println(arr[i]);
	}

	private static void displayArr(int[] arr, int idx) {
		// base case
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		displayArr(arr, idx + 1);
	}
}
