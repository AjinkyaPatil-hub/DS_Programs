package com.cheatsheat.lovebabbar;

import java.util.HashMap;
import java.util.Map;

public class KadanesAlgorithmforMaximumSumSubarray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, -2, 5 };

		int sum = kadanesAlgo(arr);
		System.out.println("Largest Sum of sub array : "+sum);
	}

	private static int kadanesAlgo(int[] arr) {
		int currentSum = arr[0];
		int overAllSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (currentSum >= 0) {
				// if number is positive then add in same train
				currentSum += arr[i];
			} else {
				// if sum is negative then start new train/sequence.
				currentSum = arr[i];
			}

			if (currentSum > overAllSum) {
				Map<Integer, String> map = new HashMap<>();
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j <= i; j++) {
					sb.append(arr[j] + ",");
				}
				map.put(currentSum, sb.toString());
				System.out.println(map);
				overAllSum = currentSum;
			}
		}

		return overAllSum;

	}
}
