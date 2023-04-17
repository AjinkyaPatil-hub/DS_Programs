package com.hackerrank.recurssion;

public class PrintKeyPadCombinations {

	public static void main(String[] args) {
		String str = "78";
		getCom(str,"");
	}

	static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vux", "yz" };

	private static void getCom(String que,String ans) {
		if(que.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = que.charAt(0);
		String roq = que.substring(1);
		String code = codes[Integer.parseInt(ch + "")];
		for(int i=0;i<code.length();i++) {
			getCom(roq,ans+code.charAt(i));
		}
	}
}
