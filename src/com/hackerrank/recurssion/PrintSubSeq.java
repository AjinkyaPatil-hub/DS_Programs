package com.hackerrank.recurssion;

public class PrintSubSeq {

	public static void main(String[] args) {
		String str = "abc";
		getSubSeq(str,"");
	}

	private static void getSubSeq(String ans, String que) {
		if(ans.length()==0) {
			System.out.println(que);
			return;
		}
		
		char ch = ans.charAt(0);
		String rsubs = ans.substring(1);
		getSubSeq(rsubs, que+"");
		getSubSeq(rsubs, que+ch);
	}
}
