package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathsWithJumps {

	public static void main(String[] args) {
		int dr = 3;
		int dc = 3;
		List<String> list = getMazePaths(1, 1, dr, dc);
		System.out.println(list);
	}

	// sr source row
	// sc source col
	// dr dest row
	// dc dest col
	private static List<String> getMazePaths(int sr, int sc, int dr, int dc) {

		// base case
		if (sr == dr && sc == dc) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		List<String> rres = new ArrayList<>();
		// horizontal moves
		for (int ms = 1; ms <= dc - sc; ms++) {
			// this will give me all paths from jump 1 to dest same from 2 to dest and so on
			List<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
			// I will get all paths from 1 , 2 , 3 and so on so to make path from source to
			// des I have to add h1+paths and so on
			for (String p : hpaths) {
				rres.add("h" + ms + p);
			}
		}
		// vertical moves
		for (int ms = 1; ms <= dr - sr; ms++) {
			List<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
			for (String p : vpaths) {
				rres.add("v" + ms + p);
			}
		}
		// diagonal moves
		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
			List<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
			for (String p : dpaths) {
				rres.add("d" + ms + p);
			}
		}

		return rres;
	}
}
