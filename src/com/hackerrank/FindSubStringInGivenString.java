package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindSubStringInGivenString {

	public static void main(String[] args) {
		String str = "greeksorgreekseefsrkgo";
		String find = "for";
		System.out.println("Total strings made are : "+findSubString(str,find));
	}

	private static int findSubString(String str, String find) {
		String[] split = str.split("");
		List<String> list = Arrays.asList(split);
		HashMap<String, Long> map = list.stream().collect(Collectors.groupingBy(s -> s , HashMap::new,Collectors.counting()));
		System.out.println(map);
		boolean flag = true;
		int total_String = 0;
		while(flag) {
			for (int i = 0; i < find.length();i++) {
				Long count = map.get(find.charAt(i)+"");
				if(count == 0) {
					flag = false;
					break;
				}
				count = count-1;
				map.put(find.charAt(i)+"", count);
			}
			total_String++;
		}
		return total_String-1;
	}
}
