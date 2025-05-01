package com.array.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

 
    public static int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("starting ...");
    	int[] arr = {0,3,5,4,6,1,1};
    	int result = longestConsecutive(arr);
    	
    	System.out.println("result:"+result);
    }
}