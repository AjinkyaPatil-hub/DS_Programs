package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePathsWithJumps {

	public static void main(String[] args) {

		List<String> ansList = new ArrayList<>();
		getMazePathsWithJumps(1, 1, 2, 2, "", ansList);
		System.out.println(ansList);
	}

	// sr : source row
	// sc: source column
	// dr: destination row
	// dc: destination column
	private static void getMazePathsWithJumps(int sr, int sc, int dr, int dc, String ans, List<String> list) {

		if (sr == dr && sc == dc) {
			list.add(ans);
			System.out.println(ans);
			return;
		}
		// horizontal moves
		if (sc < dc) {
			for (int i = 1; i < dc; i++) {
				getMazePathsWithJumps(sr, sc + i, dr, dc, ans + "h" + i, list);
			}
		}

		// vertical moves
		if (sr < dr) {
			for (int i = 1; i < dr; i++) {
				getMazePathsWithJumps(sr + i, sc, dr, dc, ans + "v" + i, list);
			}
		}

		// diagonal moves
		if (sc < dc && sr < dr) {
			for (int i = 1; i < dr && i < dc; i++) {
				getMazePathsWithJumps(sr + i, sc + i, dr, dc, ans + "d" + i, list);
			}
		}
	}

}
