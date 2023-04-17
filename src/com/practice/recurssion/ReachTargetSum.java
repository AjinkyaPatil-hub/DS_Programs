package com.practice.recurssion;

import java.util.ArrayList;
import java.util.List;

public class ReachTargetSum {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		int target = 5;

		List<String> l = targetMinSum(arr, target);

		System.out.println(l);
		printAllSum(arr, target, "");
		System.out.println();
		int res = getMinSum(arr,target);
		System.out.println("minimum no. to make sum is: "+res);
		}

	private static int getMinSum(int[] arr, int target) {
		//base case
		if(target == 0) {
			return 0;
		}else if(target < 0) {
			//invalid case
			return Integer.MAX_VALUE;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int ans =  getMinSum(arr, target - arr[i]);
			if(ans != Integer.MAX_VALUE) {
				min = Integer.min(min, ans+1);
			}
		}
		
		return min;
	}

	private static void printAllSum(int[] arr, int target, String res) {
		// base case
		if (target == 0) {
			System.out.print(" " + res + ",");
			return;
		} else if (target < 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			printAllSum(arr, target - arr[i], res + arr[i]);
		}
	}

	private static List<String> targetMinSum(int[] arr, int target) {

		// base case
		if (target == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		} else if (target < 0) {
			return new ArrayList<>();
		}

		List<String> mres = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			// keep faith this will return the expected result
			List<String> rres = targetMinSum(arr, target - arr[i]);
			// if we get path from 2 to 5 then we will add 1 to it then 11111 path will be
			// added.
			for (String r : rres) {
				mres.add(arr[i] + r);
			}
		}
		return mres;
	}
}
