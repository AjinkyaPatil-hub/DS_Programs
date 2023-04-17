package com.practice.recurssion.pepCoding;

public class PrintEncoding {

	public static void main(String[] args) {

		String str = "123";
		printEncoding(str, "");
	}

	static String[] codes = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "u", "v", "w", "x", "y", "z" };

	private static void printEncoding(String str, String ans) {
		// base case
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		String rs = str.substring(0, 2);
	}
}
