package com.cheatsheat.lovebabbar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//program link  https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
public class UnionOfTwoArray {

	public static void main(String[] args) {
		
		
		
		int[] arr = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3};
		//convert array to list
		List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		
		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		System.out.println(set);
	}
}
