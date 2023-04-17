package com.practice.recurssion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {

	public static void main(String[] args) {

		String str = "abc";

		List<String> list = subSequence(str);
		subSequence(str, "");
		System.out.println(list);
	}

	private static void subSequence(String str, String res) {

		// base case
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char ch = str.charAt(0);
		String rres = str.substring(1);
		subSequence(rres, res+ch);
		subSequence(rres,  res+"");
	}

	private static List<String> subSequence(String str) {
		// base case
		if (str.length() == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		char ch = str.charAt(0);
		String res = str.substring(1);
		List<String> rs = subSequence(res);

		List<String> mres = new ArrayList<>();

		for (String r : rs) {
			mres.add("" + r);
			mres.add(ch + r);
		}
		return mres;
	}
}
