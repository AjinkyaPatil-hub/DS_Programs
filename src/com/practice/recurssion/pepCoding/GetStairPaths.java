package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetStairPaths {

	public static void main(String[] args) {

		int n = 3;
		List<String> list = getStairPaths(n);
		System.out.println(list);
	}

	private static List<String> getStairPaths(int n) {
		// base case
		if (n == 0) {
			List<String> list = new ArrayList<>();
			list.add("");
			return list;
		} else if (n < 0) {
			return new ArrayList<>();
		}

		List<String> paths1 = getStairPaths(n - 1);
		List<String> paths2 = getStairPaths(n - 2);
		List<String> paths3 = getStairPaths(n - 3);

		List<String> mres = new ArrayList<>();

		for (String s : paths1) {
			mres.add("1" + s);
		}
		for (String s : paths2) {
			mres.add("2" + s);
		}
		for (String s : paths3) {
			mres.add("3" + s);
		}
		return mres;
	}
}
