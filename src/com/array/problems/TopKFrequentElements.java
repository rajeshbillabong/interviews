package com.array.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {


	public static String solution(int[] arr, int k) {
		int len = arr.length;
		Map<Integer, Integer> tempMap = new HashMap();
		Map<Integer, List<Integer>> map = new HashMap<>();

		for(int i=0;i<len;i++) {

			if(tempMap.containsKey(arr[i])) {
				tempMap.put(arr[i],tempMap.get(arr[i]) + 1);
			}else{
				tempMap.put(arr[i],1);
			}
		}
		System.out.println("tempMap="+tempMap);

		for(Map.Entry<Integer, Integer> set : tempMap.entrySet()) {
			System.out.println("set key="+set.getKey()+" set val="+set.getValue());

			if(map.containsKey(set.getValue())) {

				List<Integer> tempList = map.get(set.getValue());
				tempList.add(set.getKey());
				
			}else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(set.getKey());
				map.put(set.getValue(), list);
			}
		}
		
		System.out.println("## finally map:"+map);
		List<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		
		System.out.println("keys="+keys);

		

		return null;
	}

	public static void main(String[] args) {
		System.out.println("starting ...");

		int[]  arr = {1,2,1,3,4,3,2,3,4,4,4,2,2,6,6,6,6,4,4,4,7,7,7,7,7,9,9,9,9,3,2};

		solution(arr, 3);
	}
}
