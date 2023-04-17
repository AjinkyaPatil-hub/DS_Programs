package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class GetKeyPadCombinations {

	public static void main(String[] args) {

		String str = "19";

		List<String> res = getKeyPadCombinations(str);
		System.out.println(res);
		
	}

	static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vux", "yz" };

	private static List<String> getKeyPadCombinations(String str) {

		// base case
		if (str.length() == 0) {
			List<String> list = new ArrayList<>();
			list.add("");
			return list;
		}

		char ch = str.charAt(0); // 5
		String rs = str.substring(1); // 73
		// keep faith
		List<String> rc = getKeyPadCombinations(rs);

		List<String> res = new ArrayList<>();

		String code = codes[Integer.parseInt(ch + "")];

		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			for (String r : rc) {
				res.add(c + r);
			}

		}

		return res;
	}
}
