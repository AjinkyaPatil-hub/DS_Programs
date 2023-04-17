package com.practice.recurssion.pepCoding;

public class Output {

	public static void main(String[] args) {
		
		int n = 2;
		predict(n);
	}

	private static void predict(int n) {
		if(n == 0 ) {
			return;
		}
		System.out.println("Pre: "+n);
		predict(n-1);
		System.out.println("In: "+n);
		predict(n-1);
		System.out.println("Post: "+n);
		
	}
}
