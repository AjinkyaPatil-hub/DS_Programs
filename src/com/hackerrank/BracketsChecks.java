package com.hackerrank;

import java.util.Stack;

public class BracketsChecks {

	public static void main(String[] args) {
		String str = "({}}";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '}') {
				int indexOf = stack.indexOf('{');
				if (indexOf == -1) {
					System.out.println("Invalid String");
					return;
				}
				stack.remove(indexOf);
			} else if (ch == ')') {
				int indexOf = stack.indexOf('(');
				if (indexOf == -1) {
					System.out.println("Invalid String");
					return;
				}
				stack.remove(indexOf);

			} else if (ch == ']') {
				int indexOf = stack.indexOf('[');
				if (indexOf == -1) {
					System.out.println("Invalid String");
					return;
				}
				stack.remove(indexOf);
			} else {
				stack.add(ch);
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Valid String....");
		}else {
			System.out.println("Invalid string..");
		}
	}
}
