package com.hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeft {

	public static void main(String[] args) {
		int rotate = 5;
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		List<Integer> l = rotateList(list,rotate);
	}

	private static List<Integer> rotateList(List<Integer> list, int rotate) {
		int r = 0; 
		while(rotate > r) {
			Integer element = list.get(0);
			list.remove(element);
			list.add(element);
			System.out.println(list);
			r++;
		}
		return null;
	}
}
