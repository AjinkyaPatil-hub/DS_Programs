package com.practice.patterns;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2 };
		int a = 5;
		incre(a);
		System.out.println(a);
		inc(arr);
		System.out.println(Arrays.toString(arr));
	}

	//Pass By value
	private static void incre(int a) {
		a=a+1;
		System.out.println(a);
		
	}

	//Pass by refrence
	private static void inc(int[] arr) {
		arr[0] = arr[0] + 10;
		System.out.println(Arrays.toString(arr));
	}
}
