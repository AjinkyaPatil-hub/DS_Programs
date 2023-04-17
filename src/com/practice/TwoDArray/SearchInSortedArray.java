package com.practice.TwoDArray;

public class SearchInSortedArray {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };
		int num = 25;
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			// col iterator
//			for (int j = 0; j < arr[i].length; j++) {
//				if(arr[i][j] == num)
//				System.out.print("Index of number " +num + "is "+ i+ ","+ j);
//			}
//			System.out.println();
//		}

		int i = 0;
		int j = arr[0].length - 1;
		while (i < arr[0].length && j >= 0) {
			if(arr[i][j] == num) {
				System.out.println(i);
				System.out.println(j);
				return;
			}else if(num < arr[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("Not found");
	}

}
