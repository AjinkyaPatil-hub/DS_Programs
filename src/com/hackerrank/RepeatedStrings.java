package com.hackerrank;

/*
 * Repeated String
Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
Given an integer, , find and print the number of letter a 's in the first letters of Lilah's infinite string.
Input Format
The first line contains a single string, .
The second line contains an integer, .
Constraints
For of the test cases, .
Output Format
Print a single integer denoting the number of letter a 's in the first letters of the infinite string created by
repeating infinitely many times.
Sample Input 0
aba
10
Sample Output 0
7
Explanation 0
The first letters of the infinite string are abaabaabaa . Because there are a 's, we print on a
new line.
Sample Input 1
a
1000000000000
Sample Output 1
1000000000000
Explanation 1
Because all of the first letters of the infinite string are a , we print
on a new line.
 */
public class RepeatedStrings {
	public static void main(String[] args) {
		String str = "ababa";
		long n = 3;
		System.out.println(repeatedStringCount(str, n));

	}

	private static long repeatedStringCount(String s, long n) {
		long count = s.chars().filter(ch -> ch == 'a').count();

		if (s.length() == 0 || count == 0)
			return 0;
		if (s.length() == 1) {
			if (s.charAt(0) == 'a')
				return s.length() * n;
			else
				return 0;
		}
		int strLength = s.length();
		long q = 0, r = 0;
		q = n / strLength;
		r = n % strLength;
		long partialStrLen = (r == 0) ? 0 : r;
		long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
		return aCount;
	}

	public static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		return count;
	}
}
