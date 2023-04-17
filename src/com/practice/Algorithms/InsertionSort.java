package com.practice.Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 19, 5, 1, 3 , 0 };
		System.out.println("Before sorting: :"+Arrays.toString(arr));
		for(int i = 1 ;i < arr.length ; i++) {
			for(int j = i ; j>0 ; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
		System.out.println("After sorting: :"+ Arrays.toString(arr));
	}
}
