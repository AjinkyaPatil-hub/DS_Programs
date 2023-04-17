package com.practice.arrays;

import java.util.HashSet;
import java.util.Set;

/*
 *  arr1 = {1,2,2,3,4,5,5},
 *  arr2 = {2,3,7,8,9}
 *  op: = {2,3}
 * ,
 */
public class FindIntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr = new int[] { -1, 2, 2, 3, 4, 5, 5 };
		int[] arr2 = new int[] { -1, -1, 2, 3, 7, 8, 9 };

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			for (int j = 0; j < arr2.length; j++) {
				if (element == arr2[j]) {
					// To remove duplicate element we will mark element as -1 so, it will indicate
					// that the element is repeated
					arr2[j] = Integer.MIN_VALUE;
					set.add(arr[i]);
				}
			}
		}
		System.out.println(set);
	}
}
