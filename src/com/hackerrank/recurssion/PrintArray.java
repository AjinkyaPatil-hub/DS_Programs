package com.hackerrank.recurssion;

public class PrintArray {

	public static void main(String[] args) {
		int idx = 5;
		int[] arr = new int[] {3,1,0,7,5};
		printArr(arr,idx-1);
	}

	private static void printArr(int[] arr, int idx) {
		if(idx == -1) {
			return;
		}
		
		printArr(arr,idx-1);
		System.out.println(arr[idx]);
	}
}
