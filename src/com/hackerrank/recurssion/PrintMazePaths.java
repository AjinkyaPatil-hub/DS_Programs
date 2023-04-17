package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintMazePaths {

	public static void main(String[] args) {
		int sh =1;
		int sv=1;
		 getMazePaths(sh,sv,3,3,"");
	}

	private static void getMazePaths(int sh, int sv, int dh, int dv,String ques) {
		if(sh==dh && sv==dv) {
			System.out.println(ques);
			return;
		}
		if(sh<dh)
		getMazePaths(sh+1, sv, dh, dv, ques+"h");
		if(sv<dv)
		getMazePaths(sh, sv+1, dh, dv, ques+"v");
		
	}
}
