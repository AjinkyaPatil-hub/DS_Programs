package com.hackerrank.recurssion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RecursiveDigitSumHR {

	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(digitSum(str, 3));

	}

	private static int digitSum2(String n, int k) {

		if (n.length() == 1) {
			return Integer.parseInt(n);
		} else {
			StringBuilder sb = new StringBuilder(n);
			for (int i = 1; i < k; i++) {
				sb.append(n);
			}
			n = sb.toString();
			String[] arr = n.split("");
			int sum = 0;
			for(int i=0;i<arr.length;i++) {
				String c = arr[i];
				sum = sum + Integer.parseInt(c);
			}
			n = sum+"";
			return digitSum(n, 1);
		}
	}
	
	private static int digitSum(String n, int k) {
		
		n = n.chars().mapToLong(Character::getNumericValue).sum() * k +"";
		return (n.length() > 1 ) ? digitSum(n, 1) : 
			Character.getNumericValue(n.charAt(0));
	}
}
