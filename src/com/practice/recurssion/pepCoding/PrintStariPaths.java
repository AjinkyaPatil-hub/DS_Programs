package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class PrintStariPaths {

	public static void main(String[] args) {

		int target = 4;
		List<String> list = new ArrayList<>();
		// We can send list and store answer in list because list is an object , i.e
		// pass by refrenece
		printStairPaths(target, "", list);

		System.out.println(list);
	}

	private static void printStairPaths(int target, String ans, List<String> list) {
		// base case
		if (target == 0) {
			list.add(ans);
			//System.out.println(ans);
			return;
		} else if (target < 0) {
			// false answer // gone to basement
			return;
		}

		printStairPaths(target - 1, ans + 1, list);
		printStairPaths(target - 2, ans + 2, list);
		printStairPaths(target - 3, ans + 3, list);
	}
}
