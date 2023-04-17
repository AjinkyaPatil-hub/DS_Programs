package com.practice.recurssion.pepCoding;

public class FloodFill {

	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

		int n = 0;
		int m = 0;
		String paths = "";
		boolean[][] visited = new boolean[arr.length][arr[0].length];

		floodFill(arr, n, m, paths, visited);

	}

	private static void floodFill(int[][] arr, int row, int col, String paths, boolean[][] visited) {

		// stop case , base case
		if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 1
				|| visited[row][col] == true) {
			return;
		}
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(paths);
			return;
		}

		// to mark path is visited we must mark visited as true
		visited[row][col] = true;

		// upward direction
		floodFill(arr, row - 1, col, paths + "t", visited);
		// left ward direction
		floodFill(arr, row, col - 1, paths + "l", visited);
		// right ward direction
		floodFill(arr, row, col + 1, paths + "r", visited);
		// down ward direction
		floodFill(arr, row + 1, col, paths + "d", visited);

		// to search another direction is present we must again remove visted mark while
		// coming down(stack is wiping)
		visited[row][col] = false;
	}
}
