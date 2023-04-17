package com.practice.arrays;

import java.util.Arrays;

public class FindDuplicateInContArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 4, 2, 2 };
		boolean[] res = new boolean[arr.length];
		System.out.println(arr.length + " " + Arrays.toString(res));

		for (int i = 0; i < arr.length; i++) {
			int ind = arr[i];
			if (res[ind] == true) {
				System.out.println("Found " + arr[i] + " as duplicate element");
				break;
			}

			res[ind] = true;
		}
		System.out.println(Arrays.toString(res));

		// Another solution without taking extra space , by getting indexing...

		int i = 0;
		while (true) {
			int ind = arr[i];
			if (arr[i] == arr[ind]) {
				System.out.println("Found " + arr[i] + " as duplicate element");
				break;
			}

			int temp = arr[i];
			arr[i] = arr[ind];
			arr[ind] = temp;

		}
	}

}
