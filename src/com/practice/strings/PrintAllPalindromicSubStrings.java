package com.practice.strings;

public class PrintAllPalindromicSubStrings {

	public static void main(String[] args) {
		String str = "abccbc";
		printAllPalindromSubstring(str);
	}

	private static void printAllPalindromSubstring(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				checkAndPrintIfPalindrom(str.substring(i, j));
			}
		}
	}

	private static void checkAndPrintIfPalindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		if (str.equals(sb.toString())) {
			System.out.println(str);
		}

	}
}
