package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>();
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
				list.add('*');
			}
			System.out.print(" ");
			list.add(' ');
		}
		System.out.println(list);
	}
}
