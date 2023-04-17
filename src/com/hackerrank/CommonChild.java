package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Common Child
A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from
the other string. Given two strings of equal length, what's the longest string that can be constructed such
that it is a child of both?
For example, ABCD and ABDC have two children with maximum length 3, ABC and ABD . They can be
formed by eliminating either the D or C from both strings. Note that we will not consider ABCD as a
common child because we can't rearrange characters and ABCD ABDC.
Function Description
Complete the commonChild function in the editor below. It should return the longest string which is a
common child of the input strings.
commonChild has the following parameter(s):
s1, s2: two equal length strings
Input Format
There is one line with two space-separated strings, and .
Constraints
All characters are upper case in the range ascii[A-Z].
Output Format
Print the length of the longest string , such that is a child of both and .
Sample Input
HARRY
SALLY
Sample Output
2
Explanation
The longest string that can be formed by deleting zero or more characters from and is
, whose length is 2.
Sample Input 1
AA
BB
Sample Output 1
0
Explanation 1
and have no characters in common and hence the output is 0.
Sample Input 2
SHINCHAN
NOHARAAA
Sample Output 2
3
Explanation 2
The longest string that can be formed between and while maintaining
the order is .
Sample Input 3
ABCDEF
FBDAMN
Sample Output 3
2
Explanation 3
is the longest child of the given strings.
 */
public class CommonChild {
	public static void main(String[] args) {
		String s1 = "HARRY";
		String s2 = "SALLY";

		int len = commonChild(s1, s2);
		System.out.println(len);
	}

	private static int commonChild(String s1, String s2) {
		int[][] arr = new int[s1.length()+1][s2.length()+1];
		
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=arr[0].length-2;j>=0;j--) {
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(j);
				if(c1==c2) {
					//go in diagonal wise
					arr[i][j] = 1+arr[i+1][j+1];
				}else {
					arr[i][j] = Math.max(arr[i+1][j], arr[i][j+1]);
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		return 1;
		
	}
}
