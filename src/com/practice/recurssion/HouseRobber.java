package com.practice.recurssion;

public class HouseRobber {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 1, 2 };

		int sum = houseRobber(0,arr);
		System.out.println(sum);
	}

	private static int houseRobber(int indx, int[] arr) {

		// base case
		if (indx >= arr.length) {
			return 0;
		}

		
		int sum = 0;

		int sum1 = arr[indx] + houseRobber(indx + 2, arr);// inclusive call
		int sum2 = houseRobber(indx + 1, arr); // exclusive call

		sum = Integer.max(sum1, sum2);
		return sum;
	}
}
