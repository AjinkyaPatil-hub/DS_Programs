package com.practice.Algorithms;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToRight {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

//		printnge(arr);
		int[] res = printNGEByStack(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] printNGEByStack(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		// res last element will be -1, bcoz it does not have any right element
		res[arr.length - 1] = -1;
		// push the last element i stack
		st.push(arr[arr.length - 1]);

		for (int i = arr.length - 2; i >= 0; i--) {

			// pop the elements till stack is empty or any greater than or equal to element
			// is not found
			while (st.size() > 0 && arr[i] >= st.peek()) {
				st.pop();
			}

			// after while loop , 2 condition can be done,
			// 1: stack is empty or greater elemetm is fond , if stack is empty then print
			// -1
			// or if greater element is found print that element

			if (st.size() == 0) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}
			// add the element in stack
			st.push(arr[i]);
		}
		return res;

	}

	private static void printnge(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					System.out.print(arr[j] + " ");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.print(-1 + " ");
			}
		}
	}
}
