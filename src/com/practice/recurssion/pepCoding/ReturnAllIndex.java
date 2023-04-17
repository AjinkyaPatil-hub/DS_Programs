package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class ReturnAllIndex {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 5, 4, 3, 4, 3, 7, 3, 9, 3};
		int target = 3;
		List<Integer> l = new ArrayList<>();
		List<Integer> list = allIndex(arr,0,target,l);
		System.out.println(list);
	}

	private static List<Integer> allIndex(int[] arr, int i, int target, List<Integer> l) {
		
		//base case
		if(i == arr.length) {
			return new ArrayList<>();
		}
		
		//keep faith this call will return all indexes of the given target
		List<Integer> allInx = allIndex(arr, i+1, target, l);
		if(arr[i] == target) {
			allInx.add(i);
			return allInx;
		}else {
			return allInx;
		}
	}
}
