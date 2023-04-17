package com.practice.recurssion;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,30,5,6};
		
		boolean b = isSorted(arr,0);
		System.out.println(b);
	}

	private static boolean isSorted(int[] arr, int n) {
		
		if(n == arr.length-1) {
			return true;
		}
		
		if(arr[n+1] < arr[n]) {
			return false;
		}
		
		return isSorted(arr, n+1);
	}
}
