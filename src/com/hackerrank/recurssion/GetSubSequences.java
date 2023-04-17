package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.List;

public class GetSubSequences {

	public static void main(String[] args) {
		String str = "abc";
		List<String> list = getSubSeq(str);
		System.out.println(list);
	}

	private static List<String> getSubSeq(String str) {
		//base case: at end of char will return [] list, so empty list will get on char and compare with other subsequences
		if(str.length() == 0) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}
		char c = str.charAt(0);
		String res = str.substring(1);
		List<String> rres = getSubSeq(res);
		List<String> frres = new ArrayList<>();
		System.out.println(rres);
		for(String s :rres) {
			frres.add(""+s);
			frres.add(c+s);
		}
		return frres;
	}
}
