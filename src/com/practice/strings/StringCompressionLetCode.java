package com.practice.strings;

public class StringCompressionLetCode {

	public static void main(String[] args) {
		String str = "aaabbccffeaadd"; // a3b2c2f2ea2d

		String us = uniqueString(str);
		System.out.println(":: " + compression1(str));
		System.out.println("::: "+compression2(str));
		//System.out.println(us);
	}

	public static String compression1(String str) {
		// write your code here
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		char ch = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ch) {
				sb.append(str.charAt(i));
				ch = str.charAt(i);
			}
		}

		return sb.toString();
	}

	public static String compression2(String str) {
		StringBuilder res = new StringBuilder();

		char ch = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ch) {
				if (count != 1) {
					res.append(str.charAt(i - 1) + "" + count);
				}else {
					res.append(str.charAt(i-1));
				}
				ch = str.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 1) {
			res.append(str.charAt(str.length() - 1) + "" + count);
		} else {
			res.append(str.charAt(str.length() - 1) + "");
		}
		return res.toString();
	}

	private static String uniqueString(String str) {
		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();

		sb.append(str.charAt(0));
		char ch = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ch) {
				if (count != 1) {
					res.append(str.charAt(i - 1) + "" + count);
				}
				sb.append(str.charAt(i));
				ch = str.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 1) {
			res.append(str.charAt(str.length() - 1) + "" + count);
		} else {
			res.append(str.charAt(str.length() - 1) + "");
		}
		System.out.println(res);
		return sb.toString();
	}
}
