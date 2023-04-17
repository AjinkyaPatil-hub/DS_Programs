package com.practice.recurssion;

public class RemoveAllOccuranceOfSubString {

	public static void main(String[] args) {
		// remove all abc in str2
		String str = "abc";
		String str2 = "daabcbaabcbc";

		String ans = rec(str, str2);
		if (ans.equalsIgnoreCase(str2)) {
			System.out.println(str + " String not found in " + str2);
		} else
			System.out.println(ans);
	}

	private static String rec(String str, String str2) {

		// find the string
		int indexOf = str2.indexOf(str);

		// base case
		if (indexOf == -1) {
			return str2;
		}
		String s1 = str2.substring(0, indexOf);
		indexOf = indexOf+str.length();
		String s2 = str2.substring(indexOf);
		str2 = s1 + s2;

		return rec(str, str2);
	}

}
