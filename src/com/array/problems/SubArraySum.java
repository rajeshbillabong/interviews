package com.array.problems;

public class SubArraySum {

	public static void main(String[] args){
		 

		int[] inputArr = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int len = inputArr.length;
		
		for(int i=0;i<inputArr.length;i++) {
			for(int k=i;k<inputArr.length;k++) {
				System.out.println("i="+i+ "k="+k+" SUM="+findSum(i,k,inputArr));
			}
		}
		
		
	}
	
	public static int findSum(int start,int end, int[] input) {
		
		int sum = 0;
		for(int i=start;i<=end;i++) {
			sum = sum + input[i];
			
		}
		return sum;
	}
	
}
