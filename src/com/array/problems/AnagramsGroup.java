package com.array.problems;


//https://neetcode.io/problems/anagram-groups
public class AnagramsGroup {
	
	public static void solution(String[] input) {
		
		for(String in : input) {
			System.out.println("val="+in);
		}
		
	}
	
	public static void main(String [] args) {
		String[] strs = {"act","pots","tops","cat","stop","hat"};
		
		solution(strs);
	}
	

}
