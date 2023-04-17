package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MakingAnagrams {

	public static void main(String[] args) {
		String s1="cdec";
		String s2 ="abcc";
		System.out.println(makingAnagrams(s1, s2));
	}
	
	public static int makingAnagrams(String s1, String s2) {
		 int values[] = new int[26];
	        for (int i = 0; i < s1.length(); i++) {
	            values[s1.charAt(i) - 'a']++;
	        }
	        System.out.println(Arrays.toString(values));
	        for (int i = 0; i < s2.length(); i++) {
	            values[s2.charAt(i) -'a']--;
	        }
	        System.out.println(Arrays.toString(values));
	        int removeChars = 0;
	        for (int i = 0; i < values.length; i++) {
	            removeChars += Math.abs(values[i]);
	        }
	        
	        return removeChars;
	}

}
