package com.practice.Algorithms;

import java.util.Arrays;

public class MoveAllNegToRight {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,-3,-4,8};
		int low = 0 ;
		int high = arr.length-1;
		System.out.println(Arrays.toString(arr));
		while(low<=high) {
			if(arr[low]<=0) {
				low++;
			}else {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
