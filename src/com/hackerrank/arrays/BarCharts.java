package com.hackerrank.arrays;

import java.util.Arrays;

public class BarCharts {

	public static void main(String[] args) {

		int[] arr = new int[] {3,1,0,7,5};
		printBar(arr);	
	}

	private static void printBar(int[] arr) {
		
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		int max = arr2[arr.length-1];
		System.out.println(max);
		
		for(int floor=max;floor>0;floor--) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j] >= floor) {
					System.out.print("\t*");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
