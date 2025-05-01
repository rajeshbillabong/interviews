package com.array.problems;

public class MaxWaterContainer {
	
	public static void solution(int[] heights) {
		int lftCounter =0 ;
		int rtCounter = heights.length-1;
		int mxArea = 0;
		
		while(lftCounter < rtCounter) {
			int length = rtCounter - lftCounter;
			System.out.println("Length ="+length);
			System.out.println("lft Height="+heights[lftCounter]+"Rt Height="+heights[rtCounter]);
			
			int area = length * Math.min(heights[lftCounter], heights[rtCounter]);
			System.out.println("area ="+area);
			
			mxArea = Math.max(mxArea, area);
			System.out.println("MxArea ="+mxArea);
			
			if(heights[lftCounter] < heights[rtCounter]) {
				lftCounter++;
			}else {
				rtCounter--;
			}
			
			System.out.println("----------");
		}
		
	}
	
	
	public static void main(String args[]) {
		System.out.println("popopop ");
		int[] heights = { 1,7,2,5,4,7,3,6 };
		
		solution(heights);
		
	}

}
