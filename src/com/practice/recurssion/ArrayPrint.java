package com.practice.recurssion;

public class ArrayPrint {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 2, 33, 4, 5, 6 };

		//printArray(arr, arr.length - 1);
		System.out.println( findMax(arr, arr.length-1));
	}

	private static void printArray(int[] arr, int n) {
		// base case
		if (n < 0) {
			return;
		}

		System.out.println(arr[n]);
		printArray(arr, n - 1);

	}
	
	public static int findMax(int[] a, int index){
	    if (index > 0) {
	        return Math.min(a[index], findMax(a, index-1));
	    }
	    else {
	        return a[0];
	    }
	}
}
