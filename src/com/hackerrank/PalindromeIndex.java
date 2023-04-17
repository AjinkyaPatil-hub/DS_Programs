package com.hackerrank;
/*
 * Palindrome Index
Given a string, , of lowercase letters, determine the index of the character whose removal will make a
palindrome. If is already a palindrome or no such character exists, then print . There will always be a
valid solution, and any correct answer is acceptable. For example, if "bcbc", we can either remove 'b'
at index or 'c' at index .
Input Format
The first line contains an integer, , denoting the number of test cases.
Each line of the subsequent lines (where ) describes a test case in the form of a single string,
.
Constraints
All characters are lowercase English letters.
Output Format
Print an integer denoting the zero-indexed position of the character that makes not a palindrome; if is
already a palindrome or no such character exists, print .
Sample Input
3
aaab
baa
aaa
Sample Output
3
0
-1
Explanation
Test Case 1: "aaab"
Removing 'b' at index results in a palindrome, so we print on a new line.
Test Case 2: "baa"
Removing 'b' at index results in a palindrome, so we print on a new line.
Test Case 3: "aaa"
This string is already a palindrome, so we print ; however, , , and are also all acceptable answers, as
the string will still be a palindrome if any one of the characters at those indices are removed.
Note: The custom checker logic for this challenge is available here.
 */
public class PalindromeIndex {

	public static void main(String[] args) {
		String str = "aaabcccaaa";

		System.out.println(palindromeIndex(str));
		// System.out.println( palindromeIndexWithTwoPointers(str));
	}

	static int palindromeIndex(String s) {
		int palindromeIndex = -1;
		int len = s.length();

		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {

				if (i + 1 < len) {
					boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
					if (isRightStringValidPalindrome)
						return i;
					return len - i - 1;
				}

			}
		}

		return palindromeIndex;

	}

	public static boolean isValidPalindrome(String str) {
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;

	}

	public static int palindromeIndex2(String s) {

		if (s.length() == 1) {
			return 0;
		}
		StringBuilder ss = new StringBuilder(s);
		ss.reverse();
		if (s.equals(ss + "")) {
			return -1;
		}
		for (int i = 0; i < s.length(); i++) {

			String s1 = s.substring(0, i);
			String s2 = s.substring(i + 1);
			String s3 = s1 + s2;
			System.out.println("s3: " + s3);
			StringBuilder sb = new StringBuilder(s3);
			sb.reverse();
			if (s3.equals(sb + "")) {
				return i;
			}
		}
		return -1;
	}
}
