package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.List;

public class GetStringSubSequence {

	public static void main(String[] args) {
		String str = "tuvwx";
		List<String> list = getSubseqeunce(str);
		System.out.println(list);
	}

	private static List<String> getSubseqeunce(String str) {
		if (str.length() == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		char f = str.charAt(0);
		String res = str.substring(1);
		List<String> ros = getSubseqeunce(res);
		List<String> resList = new ArrayList<>();
		for (String r : ros) {
			resList.add("" + r);
			resList.add(f + r);
		}

		return resList;
	}
}
