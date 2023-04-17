package com.hackerrank.recurssion;

import java.util.List;

public class PrintMazePathsJumps {
	public static void main(String[] args) {

		int dr = 3;
		int dc = 3;
		getMazePaths(1, 1, dr, dc, "");
	}

// sr source row
// sc source col
// dr dest row
// dc dest col
	private static void getMazePaths(int sr, int sc, int dr, int dc, String paths) {
		if (sr == dr && sc == dc) {
			System.out.println(paths);
			return;
		}

		// horizontal moves
		for (int mj = 1; mj <= dc - sc; mj++) {
			getMazePaths(sr, sc + mj, dr, dc, "h" + mj + paths);
		}
		// vertical jumps
		for (int mj = 1; mj <= dr - sr; mj++) {
			getMazePaths(sr + mj, sc, dr, dc, "v" + mj + paths);
		}
		for (int mj = 1; mj <= dc - sc && mj <= dr - sr; mj++) {
			getMazePaths(sr + mj, sc + mj, dr, dc, "d" + mj + paths);
		}
	}

}
