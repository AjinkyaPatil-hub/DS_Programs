package com.practice.recurssion.pepCoding;

public class PrintZingZag {

	public static void main(String[] args) {
		
		printZingZag(3);
	}

	private static void printZingZag(int i) {
		if(i == 0) {
			return;
		}
		
		System.out.println("pre "+i);
		printZingZag(i-1);
		System.out.println("In "+i);
		printZingZag(i-1);
		System.out.println("Post "+i);
	}
}
