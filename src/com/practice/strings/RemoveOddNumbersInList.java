package com.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumbersInList {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(7);list.add(21);list.add(6);list.add(4);
		
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i) % 2 != 0) 
				list.remove(i);
		}
		System.out.println(list);
	}
}
