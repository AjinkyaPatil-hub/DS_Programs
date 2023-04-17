package com.hackerrank;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[] [] arr = new int[4][4];
		arr[0][arr.length-2] = 6;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
