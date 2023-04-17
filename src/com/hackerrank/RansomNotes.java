package com.hackerrank;

public class RansomNotes {

	public static void main(String[] args) {
		String str = "amuamu";
		boolean isPal =checkStrPalindrom(str);
		if(isPal) 
			System.out.println("Given String is Palindrom");
		else
			System.out.println("Given String is not Palindrom");
		boolean isSys = checkStrSymentric(str);
		if(isSys) 
			System.out.println("Given String is Symentric");
		else
			System.out.println("Given String is not Symentric");
		
	}

	private static boolean checkStrSymentric(String str) {
		if(str.length() <= 0 || str.length()%2 != 0)
			return false;
		
		int mid = str.length()/2;
		String half = str.substring(0, mid);
		String secondHalf = str.substring(mid);
		
		if(half.equals(secondHalf))
			return true;
		else
			return false;
		
	}

	private static boolean checkStrPalindrom(String str) {
		if(str.length() <= 0) {
			return false;
		}
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}
	
}
