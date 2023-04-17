package com.practice.strings;

public class PrintPermutation {

	public static void main(String[] args) {
		String str="abc";
		printPermutationByRec(str,"");
	}

	private static void printPermutationByRec(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String leftString = str.substring(0, i);
			String rightString = str.substring(i+1);
			printPermutationByRec(leftString+rightString, ans+ch);
		}
		
		
	}
}
