package com.array.problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/

class Solution {
	
	public static void main(String args[]) {
		 
		int[] arr = {1,2,4,3,7,11,45};
		
		System.out.println("result="+twoSum(arr,11));
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
    	System.out.println("hoho momo");
 
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       
        for(int i=0;i<nums.length;i++){
        	 int complement = target-nums[i];
        	 System.out.println("#="+nums[i]+" complement="+complement);
        	 
        	 if(map.get(complement) !=null) {
        		 System.out.println("comes in if true");
        		 int [] resArr = {1,2};
        		 System.out.println("start="+map.get(complement)+" end="+i);
        		 return resArr;
        	 }else {
        		 System.out.println("comes in else ");

        		 map.put(nums[i], i);
        	 }
        	 
        	 System.out.println(map);
        	 
        }
        
        return null;
    }
}