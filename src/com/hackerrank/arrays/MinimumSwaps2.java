package com.hackerrank.arrays;

import java.util.Arrays;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		int[] arr = new int[] {4,3,2,1};
		int count = minimumSwaps(arr);
		System.out.println(count);
	}

	private static int minimumSwaps(int[] arr) {
	    int count = 0; int index = 0; int temp = 0;
	    while(index < arr.length){
	        if(arr[index] != index+1){
	            temp = arr[index];
	            arr[index] = arr[arr[index]-1];
	            arr[temp-1] = temp;
	            count++;
	        }else{
	            index++;
	        }
	    }
	    return count;}
}
