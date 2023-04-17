package com.hackerrank.recurssion;

import java.util.ArrayList;
import java.util.List;

public class GetMazeRunner {

	public static void main(String[] args) {
		List<String> list = getMazeRunner(1, 1, 3, 3);
		System.out.println(list);
	}

	private static List<String> getMazeRunner(int sourceRow, int sourceColumn, int destRow, int destColumn) {

		if (sourceRow == destRow && sourceColumn == destColumn) {
			List<String> l = new ArrayList<>();
			l.add("");
			return l;
		}

		List<String> hpaths = new ArrayList<>();
		List<String> vpaths = new ArrayList<>();

		if (sourceColumn < destColumn) {
			hpaths = getMazeRunner(sourceRow, sourceColumn + 1, destRow, destColumn);

		}
		if (sourceRow < destRow) {
			vpaths = getMazeRunner(sourceRow + 1, sourceColumn, destRow, destColumn);

		}

		List<String> list = new ArrayList<>();
		for (String r : hpaths) {
			list.add("h" + r);
		}
		for (String r : vpaths) {
			list.add("v" + r);
		}
		return list;
	}

}
