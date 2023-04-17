package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GameOfThrones {

	public static void main(String[] args) {
		String str = "aabbccdd";
		
		System.out.println(gameOfThrones(str));
	}

	public static String gameOfThrones(String s) {
		List<String> list = Arrays.asList(s.split(""));
		HashMap<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(ss -> ss, HashMap::new, Collectors.counting()));
		String oddString = null;
		for (Entry<String, Long> m : map.entrySet()) {
			if(m.getValue() % 2 != 0) {
				if(oddString == null) {
					oddString = m.getKey();
				}else {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
