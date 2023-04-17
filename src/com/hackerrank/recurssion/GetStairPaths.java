package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.List;

public class GetStairPaths {
	//one can take jump 1 , 2 , 3 steps to reach at end how many ways does we can go and print that ways
	public static void main(String[] args) {
		int steps = 5;
		List<String> totalPaths = getStairsPaths(steps);
		System.out.println(totalPaths);
	}

	private static List<String> getStairsPaths(int n) {
		
		//base case 
		if(n == 0) {
			List<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}else if(n < 0) {
			List<String> bres = new ArrayList<>();
			return bres;
		}
		
		
		List<String> paths1 = getStairsPaths(n-1);
		List<String> paths2 = getStairsPaths(n-2);
		List<String> paths3 = getStairsPaths(n-3);
		List<String> paths = new ArrayList<>();
		
		for(String path :paths1) {
			paths.add(1 + path);
		}
		for(String path :paths2) {
			paths.add(2 + path);
		}
		for(String path :paths3) {
			paths.add(3 + path);
		}
		
		return paths;
	}
}
