package com.practice.recurssion.pepCoding;

public class KnightTour {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int s = 1;
		
		knightTour(arr,1,0,1);
	}

	private static void knightTour(int[][] arr, int r, int c, int move) {

		//negative base case
		if(r < 0 || c < 0 || r >= arr.length || c >= arr.length || arr[r][c] > 0) {
			return ;
		}
		else if(move == arr.length*arr.length) {
			arr[r][c] = move;
			displayBoard(arr);
			return;
		}
		
		arr[r][c] = move;
		
		knightTour(arr, r-2, c+1, move+1);
		knightTour(arr, r-1, c+2, move+1);
		knightTour(arr, r+1, c+2, move+1);
		knightTour(arr, r+2, c-1, move+1);
		
		knightTour(arr, r+2, c-1, move+1);
		knightTour(arr, r+1, c-2, move+1);
		knightTour(arr, r-1, c-2, move+1);
		knightTour(arr, r-2, c-1, move+1);
		
		arr[r][c] = 0;
	}

	private static void displayBoard(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
