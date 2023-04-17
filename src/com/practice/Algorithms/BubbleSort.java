package com.practice.Algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 7, 9, 1 };

		System.out.println("Before Arrays Sort: :"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					System.out.println("After Arrays Sort irt: :"+Arrays.toString(arr));
				}
			}
		}
		System.out.println("After Arrays Sort: :"+Arrays.toString(arr));
	}
}
