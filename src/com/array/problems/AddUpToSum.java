package com.array.problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/

//https://leetcode.com/problems/two-sum/solutions/2671539/java-100-runtime-easy-to-understand/
public class AddUpToSum {
	
	public static int[] solution(int[] arr,int target) {
		
		Map< Integer, Integer> map = new HashMap();
		int[] result = new int[2];
		
		for(int i = 0;i < arr.length;i++) {
			
			if(map.containsKey(target-arr[i])) {
				result[0]=i;
				result[1]=map.get(target-arr[i]);
				return result;
			}
			
			map.put(arr[i], i);
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		System.out.println("HOHO");
		
		int[] arr = {2,11,7,15};
		System.out.println(solution(arr,9)[0]+","+solution(arr,9)[1]);
	}
	
}
