package com.hackerrank.recurssion;

public class PrintPermutation {

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "");
	}

	private static void printPermutation(String str, String ans) {
		// base case
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		// for loop for all char in string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String leftStr = str.substring(0, i);
			String rigthStr = str.substring(i + 1);
			printPermutation(leftStr + rigthStr,  ans+ch);
		}
	}
}
