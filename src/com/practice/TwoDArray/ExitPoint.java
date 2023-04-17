package com.practice.TwoDArray;

public class ExitPoint {

	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 } };

		// print array
		for (int i = 0; i < arr.length; i++) {
			// col iterator
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		int dir=0; // direction indicates east,west, north, south
		int i=0,j=0; //start point
		
		while(true) {
			//to remove direction actual value
			dir = dir+arr[i][j]%4;
			
			if(dir == 0) { //east
				j++;
			}else if(dir == 1) { //south
				i++;
			}else if(dir == 2) {//west
				j--;
			}else if(dir == 3) { //north
				i--;
			}
			
			//If the direction is out of the array then exit the and print i ,j
			if(i<0) {
				i++;
				break;
			}else if(j<0) {
				j++;
				break;
			}else if(i==arr.length) {
				i--;
				break;
			}else if(j==arr[0].length) {
				j--;
				break;
			}
		}
		System.out.println(i+","+j);
		
	}
}
