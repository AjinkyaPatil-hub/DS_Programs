package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathsWithJumps {

	public static void main(String[] args) {
		List<String> res = getMazePathsWithJumps(1, 1, 2, 2);
		System.out.println(res);
	}

	// sr : source row
	// sc: source column
	// dr: destination row
	// dc: destination column
	private static List<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {

		// base case
		if (sr == dr && sc == dc) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		List<String> mres = new ArrayList<>();
		List<String> hpaths;
		// horizontal moves
//		if (sc < dc) {
			for (int hm = 1; hm <= dc-sc; hm++) {
				hpaths = getMazePathsWithJumps(sr, sc + hm, dr, dc);
				for (String hpath : hpaths) {
					mres.add("h" + hm + hpath);
				}
			}
//		}

		// vertical moves
//		if (sr < dr) {
			List<String> vpaths;
			for (int vm = 1; vm <= dr-sr; vm++) {
				vpaths = getMazePathsWithJumps(sr + vm, sc, dr, dc);
				for (String vpath : vpaths) {
					mres.add("v" + vm + vpath);
				}
			}
//		}

		// diagonal paths
//		if (sc < dc || sr < dr) {
			List<String> dpaths;
			for (int dp = 1; dp <= dr-sr || dp <= dc-sc; dp++) {
				dpaths = getMazePathsWithJumps(sr + dp, sc + dp, dr, dc);
				for (String dpaht : dpaths) {
					mres.add("d" + dp + dpaht);
				}
			}
//		}

		return mres;
	}
}
