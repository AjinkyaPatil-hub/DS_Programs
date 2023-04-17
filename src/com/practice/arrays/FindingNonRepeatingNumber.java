package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 *   ip:  1,1,5,5,4,7,3,4,3
 *   op: non-repeated number is 7
 *   
 */
public class FindingNonRepeatingNumber {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 5, 5, 4, 7, 3, 4, 3 };
		List<Integer> list = new ArrayList<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
			System.out.println(ans);
//			if (list.contains(arr[i])) {
//				int indexOf = list.indexOf(arr[i]);
//				list.remove(indexOf);
//			} else {
//				list.add(arr[i]);
//			}
		}
		System.out.println("ans " + ans);
		System.out.println("non-repeated number is with O(n) complexicity : " + list.get(0));

	}

}
