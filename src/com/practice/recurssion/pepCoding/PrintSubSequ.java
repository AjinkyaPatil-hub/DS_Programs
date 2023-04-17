package com.practice.recurssion.pepCoding;

public class PrintSubSequ {

	public static void main(String[] args) {
		String str = "abc";
		
		subSeq(str,"");
	}

	private static void subSeq(String str, String ans) {
		//base case
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String rs = str.substring(1);
		subSeq(rs, ans+"");
		subSeq(rs, ans+ch);
		
	}
}
