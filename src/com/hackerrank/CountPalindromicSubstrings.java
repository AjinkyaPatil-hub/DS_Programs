package com.hackerrank;

public class CountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "abccbc";
		boolean[][] arr = new boolean[str.length()][str.length()];
		int count = 0;
		for (int g = 0; g < arr.length; g++) {
			for (int row = 0, column = g; column < arr.length; row++, column++) {
				if (g == 0) {
					// o diagonal all are palindrom eq: a ,b,c
					arr[row][column] = true;
				} else if (g == 1) {
					// digonal 1 check eg. aa,bb,cc
					if (str.charAt(row) == str.charAt(column)) {
						arr[row][column] = true;
					} else {
						arr[row][column] = false;
					}
				} else {
					if (str.charAt(row) == str.charAt(column) && arr[row + 1][column - 1] == true) {
						arr[row][column] = true;
					} else {
						arr[row][column] = false;
					}
				}
				if (arr[row][column] == true) {
					count++;
					printPalindrom(str, row, column);
				}
			}

		}
		System.out.println("Total palindromic substring are  " + count);
	}

	public static void printPalindrom(String str, int start, int end) {
		System.out.println(str.substring(start, end + 1));
	}
}
