package com.practice.Algorithms;

import java.util.Arrays;

public class PartioningOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] {7,9,4,8,3,6,2,1};

		int i = 0;
		int j = 0;
		int piviot = 7;

		while (i < arr.length ) {
			if (arr[i] > piviot) {
				// swap
				i++;
			} else  {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
