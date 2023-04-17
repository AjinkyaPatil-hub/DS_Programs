package com.practice.recurssion.pepCoding;

import java.util.List;

public class PrintKeyPadSol {

	public static void main(String[] args) {
		String str = "19";

		getKeyPadCombinations(str,"");
		
	}

	static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vux", "yz" };
	private static void getKeyPadCombinations(String str,String ans) {
		
		//base case
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0); // 1
		String rs = str.substring(1); //9
		
		String code = codes[Integer.parseInt(ch + "")];
		
		for(int i=0;i<code.length();i++) {
			getKeyPadCombinations(rs, ans + code.charAt(i));
		}
	}
}
