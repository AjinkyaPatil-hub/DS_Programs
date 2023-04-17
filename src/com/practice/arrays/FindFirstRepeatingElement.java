package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingElement {

	public static void main(String[] args) {
		int[] arr = new int[] {1,5,3,3,6,6};
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i]) == null) {
				map.put(arr[i], i);
			}else {
				System.out.println("First repeated element: " +arr[ map.get(arr[i])]);
				break;
			}
			
		}
		
	}
}
