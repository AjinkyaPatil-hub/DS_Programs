package com.hackerrank.recurssion;

public class PrintStairPaths {

	public static void main(String[] args) {
		int n = 4;
		String path ="";
		printStariPaths(n,path);
	}

	private static void printStariPaths(int n, String path) {
		if(n==0) {
			System.out.println(path);
			return;
		}else if(n<0) {
			return;
		}
		
		printStariPaths(n-1, path+1);
		printStariPaths(n-2, path+2);
		printStariPaths(n-3, path+3);
		
	}
}
