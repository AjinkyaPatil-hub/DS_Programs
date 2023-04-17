package com.practice.recurssion;

public class PalindromWithRE {

	public static void main(String[] args) {

		String str = "abbswabcbasdasdasdabc";

		boolean isPalindromic = rec(str, 0, str.length() - 1);
		
		System.out.println(isPalindromic);
	}

	private static boolean rec(String str, int start, int end) {

		if (start == end) {
			return true;
		}

		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return rec(str, start + 1, end - 1);
	}
}
