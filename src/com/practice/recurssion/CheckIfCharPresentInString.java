package com.practice.recurssion;

public class CheckIfCharPresentInString {

	public static void main(String[] args) {
		
		String str = "Ajinkya";
		char key = 'Z';
		
		boolean b = checkKey(str,0,key);
		System.out.println(b);
	}

	private static boolean checkKey(String str, int i, char key) {
		//base case
		if(i >= str.length()) {
			return false;
		}
		
		//1 st case slove karo , baki recurssion karega
		if(str.charAt(i) == key) {
			return true;
		}
		
		return checkKey(str, i+1 , key);
	}
}
