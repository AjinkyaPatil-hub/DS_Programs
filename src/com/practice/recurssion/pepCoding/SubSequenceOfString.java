package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {

	public static void main(String[] args) {

		String str = "abc";

		List<String> list = subSequence(str);
		System.out.println(list);
	}

	private static List<String> subSequence(String str) {

		// base case
		if (str.length() == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		char ch = str.charAt(0);
		String rs = str.substring(1);
		// keep faith and call for remaning string i.e bc
		List<String> subseq = subSequence(rs);

		List<String> l = new ArrayList<>();

		// now add ch on the front of each string and blank on each string
		for (String s : subseq) {
			l.add("" + s);
			l.add(ch + s);
		}
		return l;
	}
}
