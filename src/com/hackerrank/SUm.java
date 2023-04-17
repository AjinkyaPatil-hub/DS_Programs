package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SUm {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(17);
		a.add(18);
		a.add(20);
		List<Integer> b = new ArrayList<>();
		b.add(99);
		b.add(16);
		b.add(8);
		System.out.println(compareTriplets(a, b));

	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int[] arr = new int[2];

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				// Alice gets point
				int value = arr[0];
				arr[0] = value + 1;
			} else if (a.get(i) < b.get(i)) {
				// Bob gets point
				int value = arr[1];
				arr[1] = value + 1;
			}
		}

		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return collect;
	}
}
