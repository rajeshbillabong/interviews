package com.array.problems;

import java.util.*;
public class SumArrays {

	public static String sum(int[] arr1,int[] arr2){
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		
		int min = 0;
		int carryOver = 0;
		
		if(arr1.length < arr2.length) min = arr1.length;
		else
			min = arr2.length;
		
		for(int i = min-1;i >= 0;i--){
			int sum = arr1[i]+arr2[i]+carryOver;
			
			if(sum > 9) {
			carryOver = 1;
			returnList.add(sum - 10);
			}else {
			 returnList.add(sum);
			}
		}
		
		Collections.reverse(returnList);
		
		return returnList.toString();
	}
	
	
	
	public static void main(String[] args){
		int[] arr1 = {9,9,9,9};
		int[] arr2 = {9,9,9,9};
		
		
		
		
		System.out.println(  sum(arr1,arr2));
	}
}
