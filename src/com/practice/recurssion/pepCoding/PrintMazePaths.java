package com.practice.recurssion.pepCoding;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePaths {

	public static void main(String[] args) {

		List<String> ansList = new ArrayList<>();
		getMazePaths(1, 1, 3, 2, "", ansList);
		System.out.println(ansList);
	}

	// sr : source row
	// sc: source column
	// dr: destination row
	// dc: destination column
	private static void getMazePaths(int sr, int sc, int dr, int dc, String ans, List<String> list) {

		if (sr == dr && sc == dc) {
			// reach at end
			list.add(ans);
//			System.out.println(ans);
			return;
		}

		// horizontal moves
		//(sc < dc) condition is that condition which does not cross the matrix.
		if (sc < dc)
			getMazePaths(sr, sc + 1, dr, dc, ans + "h", list);

		// vertical moves
		if (sr < dr)
			getMazePaths(sr + 1, sc, dr, dc, ans + "v", list);
	}
}
