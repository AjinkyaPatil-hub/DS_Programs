package com.practice.recurssion;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Ajinkja";

		String ans = reverseAString(str, 0, str.length() - 1, "");
		System.out.println(ans);

		int idx = lastOccuranceOfString(str, str.length() - 1, 'j');
		System.out.println(idx);

	}

	private static int lastOccuranceOfString(String str, int i, char c) {
		if (i < 0) {
			// char not found
			return -1;
		}

		if (str.charAt(i) == c) {
			return i;
		}

		return lastOccuranceOfString(str, i - 1, c);
	}

	private static String reverseAString(String str, int start, int end, String ans) {

		// base case
		if (start > end) {
			return ans;
		}

		String a = reverseAString(str, start, end - 1, ans + str.charAt(end));
		return a;
	}
}
