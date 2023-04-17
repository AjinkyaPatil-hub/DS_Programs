package com.hackerrank.recurssion;

public class PrintSubSequence {

	public static void main(String[] args) {
		String str = "abc";
		String que="";
		printSub(str,que);
	}

	private static void printSub(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char c = str.charAt(0);
		String ss = str.substring(1);
		printSub(ss, ans+""); // this is when char says yes
		printSub(ss, ans+c);   // this is when char says no
		
	}
}
