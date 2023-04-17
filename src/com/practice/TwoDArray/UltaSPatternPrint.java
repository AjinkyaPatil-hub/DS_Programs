package com.practice.TwoDArray;

import java.util.Scanner;

public class UltaSPatternPrint {

	public static void main(String[] args) {
		 int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } ,
		 { 1, 2, 3 }, { 4, 5, 6 }};
		 
		//print array
		for(int i=0 ; i<arr.length;i++) {
			//col iterator
			for(int j=0;j<arr[i].length;j++) {
				 System.out.print(" "+arr[i][j]); 
			}
			System.out.println();
		}
		
		//print ulta S pattern
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {//for even rows
				for(int j=0;j<arr[0].length;j++) {
					System.out.println(arr[i][j]);
				}
			}else {// for odd rows
				for(int k=arr[0].length-1;k>=0;k--) {
					System.out.println(arr[i][k]);
				}
			}
		}
	}
}
