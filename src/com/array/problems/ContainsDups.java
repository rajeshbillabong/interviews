package com.array.problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDups {

	public static boolean solution(int[] arr) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("val="+arr[i]);
			int temp = arr[i];
			
			if(map.containsKey(temp)) {
				 return true;
			}else {
				map.put(temp, temp);
			}
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4};
		
 		
		System.out.println(solution(arr));
	}
}
