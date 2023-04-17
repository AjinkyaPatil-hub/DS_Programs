package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

	public static void main(String[] args) {
		String str = "abc";

		List<String> ls = new ArrayList<>();
		printPermutation(str, "",ls);
		System.out.println(ls);
	}

	// abc --> abc , acb , bca ,bac , cba , cab
	private static void printPermutation(String str, String ans,List<String> list) {
		// base case
		if (str.length() == 0) {
			list.add(ans);
//			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ls = str.substring(0, i);
			String rs = str.substring(i + 1);
			printPermutation(ls + rs, ans + ch,list);
		}
	}
}
