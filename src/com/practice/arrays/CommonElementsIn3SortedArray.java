package com.practice.arrays;

public class CommonElementsIn3SortedArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 ,6,7};
		int[] arr2 = new int[] { 3, 4, 55 };
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {

			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println("Common Element is  " + arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

	}
}
