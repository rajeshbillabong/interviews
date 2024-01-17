package com.array.problems;

//https://leetcode.com/problems/maximum-subarray/solutions/1595097/java-kadane-s-algorithm-explanation-using-image/
public class MaxSumSubArray {

	
	public static void findMaxSubArr(int[] arr) {
		
		int MAXSUM = Integer.MIN_VALUE;
		int currentSum = 0;
		
		int start =0;
		int end = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			currentSum = currentSum+arr[i];
			if(currentSum > MAXSUM) {
				MAXSUM = currentSum;
				end++;
			}
			
			if(currentSum<0) {
				currentSum = 0;
				start =i+1;
				end=i+1;
			}
			
		}
		
		System.out.println("result="+ MAXSUM);
		System.out.println("start="+ start+", end="+end);

	}
	
	public static void main(String [] args) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		findMaxSubArr(arr);
		
		
	}
}
