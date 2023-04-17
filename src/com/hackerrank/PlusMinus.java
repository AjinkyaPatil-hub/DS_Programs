package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);arr.add(1);arr.add(0);
		arr.add(-1);arr.add(-1);
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for(int i=0;i<arr.size();i++) {
			
			if(arr.get(i) == 0) {
				zero++;
			}else if(arr.get(i) < 0) {
				neg++;
			}else {
				pos++;
			}
		}
		float n  = arr.size();
		System.out.printf("%.6f" , pos/n);
		System.out.printf("%.6f" , neg/n);
		System.out.printf("%.6f" , zero/n);
		}
}
