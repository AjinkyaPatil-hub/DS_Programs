package com.hackerrank;

import java.util.Arrays;
import java.util.List;

/*
 * Jumping on the Clouds
 * Search on HackerRank
 */
public class Jumping_cloud {

	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(0, 0, 0, 1, 0, 0);
		int jumps = numberOfJumps(c);
		System.out.println(jumps);
	}

	private static int numberOfJumps(List<Integer> c) {
		int jump = 0;
		System.out.println(c.size());
		for (int i = 0; i < c.size()-1;) {
			jump++;
			if (i+1 != c.size()-1 && c.get(i + 2) == 0) {
				i = i + 2;
			} else {
				i = i + 1;
			}
		}
		return jump;
	}
}
