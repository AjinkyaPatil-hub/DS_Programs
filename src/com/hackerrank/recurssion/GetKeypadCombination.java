package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GetKeypadCombination {

	public static void main(String[] args) {
		String str = "78";
		List<String> list = getCom(str);
		System.out.println(list);
		System.out.println(list.size());
	}

	static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vux", "yz" };

	private static List<String> getCom(String str) {
		if (str.length() == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}
		// 5 73
		char ch = str.charAt(0);
		String ros = str.substring(1);
		List<String> rres = getCom(ros); // 73 -> combinations 6 words
		List<String> mres = new ArrayList<>();
		int parseInt = Integer.parseInt(ch + "");
		String firstCode = codes[parseInt];
		for (int i = 0; i < firstCode.length(); i++) {
			char c = firstCode.charAt(i);
			for (String r : rres) {
				mres.add(c + r);
			}
		}

		return mres;
	}
}
