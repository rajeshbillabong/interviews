package com.array.problems;

//https://neetcode.io/problems/two-integer-sum-ii

public class AddUpToSumSorted {


	public static int[] twoSum(int[] numbers, int target) {

		int leftCounter=0;
		int rightCounter=numbers.length-1;
		
		for(int i=0;i<numbers.length;i++){
			
			System.out.println("1stcounter="+leftCounter);
			System.out.println("rightCounter="+rightCounter);
			System.out.println("sum="+(Integer)(numbers[leftCounter] + numbers[rightCounter]));
			if(numbers[leftCounter] + numbers[rightCounter] == target) {
				System.out.println("found it"+leftCounter+", "+rightCounter);
			}else if(numbers[leftCounter] + numbers[rightCounter] > target) {
				rightCounter--;
			}else {
				leftCounter++;
			}
		}
		return null;

	}

	public static void main(String args[]) {

		System.out.println("popo");
		int[] numbers = {1,3,4,5,7,11};
		
		twoSum(numbers,9);

	}
}
