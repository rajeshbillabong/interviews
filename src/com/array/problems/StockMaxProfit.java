package com.array.problems;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/1735493/java-c-best-ever-explanation-could-possible/

public class StockMaxProfit {

	/*
	 * public static int maxProfit(int[] prices) { int leastSoFar =
	 * Integer.MAX_VALUE; int overAllProfit = 0; int profitIfSoldToday = 0;
	 * 
	 * for(int i = 0; i < prices.length; i++){ if(prices[i] < leastSoFar){
	 * leastSoFar = prices[i]; } profitIfSoldToday = prices[i] - leastSoFar;
	 * if(overAllProfit < profitIfSoldToday){ overAllProfit = profitIfSoldToday; } }
	 * return overAllProfit; }
	 */
	
	public static int maxProfit(int[] prices) {
		
		int leastSoFar = Integer.MAX_VALUE;
		int profitIfSoldToday =0;
		int overAllProfit = 0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < leastSoFar) {
				leastSoFar = prices[i];
			}
			
			profitIfSoldToday =  prices[i] - leastSoFar;
			if(profitIfSoldToday > overAllProfit) {
				overAllProfit = profitIfSoldToday;
			}
		}
		
		return overAllProfit;
	}
	
	public static void main(String[] args) {
	 
		int[] prices = {7,1,5,3,6,9};
		
		System.out.println("result="+maxProfit(prices));
	}
}
