package com.array.problems;

public class MergeKSortedArrays {
//https://www.geeksforgeeks.org/merge-k-sorted-arrays/
	
/*	Input:
		k = 3, n =  4
		arr[][] = { {1, 3, 5, 7},
		            {2, 4, 6, 8},
		            {0, 9, 10, 11}} ;

		Output: 0 1 2 3 4 5 6 7 8 9 10 11 */
	
	public static void main (String[] args) {
	 
		int[][] inpArr = {{1,3,5,7},
						{2,4,6,8},
						{0,9,10,11}};
		
		int k = inpArr.length;
		System.out.println("k="+k);
		

		int l = inpArr[0].length;
		System.out.println("l="+l);
		
		
		
	}
}
