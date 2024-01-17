package com.array.problems;

public class RemoveDuplicates {

	public static void main (String args[]) {
		
		int[] str = {1,1,2,2,3,4,4,4,5,6,6,7};
		
		int counter = 1;
		
		for(int i=1;i<str.length;i++) {
			
			if(str[i] != str[i-1]) {
				str[counter] = str[i];
				counter++;
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);

		}
	}
}
