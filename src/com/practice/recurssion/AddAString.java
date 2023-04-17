package com.practice.recurssion;

public class AddAString {

	public static void main(String[] args) {

		String num1 = "1";
		String num2 = "77";

		String ans = getAddition(num1, num1.length() - 1, num2, num2.length() - 1, "",0);
		System.out.println(ans);
	}

	private static String getAddition(String num1, int p1, String num2, int p2, String ans,int carry) {
		// base case
		if(p1 < 0 && p2 < 0) {
			return ans;
		}
		
		// extract var.
		int n1 = (p1 >= 0 ? num1.charAt(p1)  : '0') - '0';
		int n2 = (p2 >= 0 ? num2.charAt(p2)  : '0') - '0';
		int csum = n1+n2+carry;
		int digit = csum%10;
		carry = csum/10;
		ans = digit +"";
		
		ans = ans+getAddition(num1, p1-1, num2, p2-1, ans, carry);
		
		return ans;
	}
}
