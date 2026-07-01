package com.arrays;

public class StockProfit {

	public static void main(String[] args) {
		int[] arr = { 1, 13, 2, 7, 17, 22, 1 };
		System.out.println("Main method started ");
		int max = 0;
		int sellDay = 0;
		int buyDay = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int profit = 0;
				if (arr[j] > arr[i]) {
					profit = arr[j] - arr[i];
				} else {
					profit = arr[i] - arr[j];
				}

				if (max < profit) {
					max = profit;
					sellDay = i;
					buyDay = j;
				}

			}

		}
		System.out.println("Maximum Profit :" + max);
		System.out.println("Buy day :" + buyDay);
		System.out.println("Sell Day :" + sellDay);

	}

}
