package com.practice.arrays;

import java.util.Arrays;

public class Sort012ByPepeCoding {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 2, 1, 0, 2, 0, 1 };

		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		System.out.println("Brfore Sorting " + Arrays.toString(arr));
		while (i <= k) {
			if (arr[i] == 1) {
				i++;
			} else if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			} else {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			//	i++;
				k--;
			}
			System.out.println("ith  " +i +  Arrays.toString(arr));
		}
		System.out.println("After Sorting " + Arrays.toString(arr));
	}
}
