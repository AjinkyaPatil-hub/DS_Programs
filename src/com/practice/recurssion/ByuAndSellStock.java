package com.practice.recurssion;

public class ByuAndSellStock {

	public static void main(String[] args) {
		int[] prices = new int[] { 2, 4, 1 };

		int max_profit = buyAndSellItr(prices);
		System.out.println(max_profit);

		int ans = buyNSellByRec(prices, 0, prices[0], 0);
		System.out.println(ans);
	}

	private static int buyNSellByRec(int[] prices, int i, int buy, int max_profit) {
		// base case
		if (i == prices.length) {
			return max_profit;
		}

		if (buy > prices[i]) {
			buy = prices[i];
		} else if (prices[i] - buy > max_profit) {
			max_profit = prices[i] - buy;
		}

		return buyNSellByRec(prices, i + 1, buy, max_profit);
	}

	private static int buyAndSellItr(int[] prices) {

		int buy = prices[0], max_profit = 0;
		for (int i = 1; i < prices.length; i++) {

			// Checking for lower buy value
			if (buy > prices[i])
				buy = prices[i];

			// Checking for higher profit
			else if (prices[i] - buy > max_profit)
				max_profit = prices[i] - buy;
		}

		return max_profit;
	}
}
