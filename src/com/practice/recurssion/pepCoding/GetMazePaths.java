package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class GetMazePaths {

	public static void main(String[] args) {

		List<String> res = getMazePaths(1, 1, 3, 3);
		System.out.println(res);
	}

	// sr : source row
	// sc: source column
	// dr: destination row
	// dc: destination column
	private static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
		// base case
		if (sr == dr && sc == dc) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		List<String> hpaths = new ArrayList<>();
		List<String> vpaths = new ArrayList<>();

		// Horizontal moves
		if (sc < dc)
			hpaths = getMazePaths(sr, sc + 1, dr, dc);
		// Vertical moves
		if (sr < dr)
			vpaths = getMazePaths(sr + 1, sc, dr, dc);

		List<String> mres = new ArrayList<>();

		for (String hp : hpaths) {
			mres.add("h" + hp);
		}
		for (String vp : vpaths) {
			mres.add("v" + vp);
		}
		return mres;
	}
}
