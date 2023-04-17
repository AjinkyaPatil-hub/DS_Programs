package com.practice.recurssion.pepCoding;

public class FirstOccurance {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 5, 4, 5, 4, 6, 7, 8, 9, 3 };
		int target = 9;
		int idx = firstOccurance(arr, 0, target);
//		lastOccurance(arr,0,target);
		System.out.println(idx);
		
		int r = firstOccuranceSlowCase(arr,0,target);
		System.out.println("first occurance: "+r);
	}

	private static int firstOccuranceSlowCase(int[] arr, int i, int target) {
		
		//base case
		if(i == arr.length-1) {
			return arr[i];
		}
		
		int keepingFaithItWillReturnFirstOccuarnaceOfTarget = firstOccuranceSlowCase(arr, i+1, target);
		//now will compare with arr[i] if value is same as target so it first occurance else will return faith answer
		if(arr[i] == target) {
			return i;
		}else {
			return keepingFaithItWillReturnFirstOccuarnaceOfTarget;
		}
	}

	private static int firstOccurance(int[] arr, int i, int target) {
		// base case
		if (i == arr.length) {
			// means element not found
			return -1;
		}
		if (arr[i] == target) {
			// if target found return index
			return i;
		} else {
			// else keep incrementing index
			System.out.println("calling rec "+i);
			return firstOccurance(arr, i + 1, target);
		}
	}
}
