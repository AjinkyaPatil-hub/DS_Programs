package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(769082435);list.add(210437958);list.add(673982045);list.add(375809214);list.add(380564127);
		
		Collections.sort(list);
		
		long sum = 0;
		for(int i=1;i<list.size()-1;i++) {
			sum+=list.get(i);
		}
		long minSum = sum+list.get(0);
		long maxSum = sum+list.get(list.size()-1);
		System.out.println(minSum);
		System.out.println(maxSum);
	}
}
