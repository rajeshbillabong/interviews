package com.strings.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringNoDuplicate {

	public static void solution(String input) {
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			System.out.println("char="+c);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("start ...");
		System.out.println("... ...");
		
		
		solution("abcabcxyzmko");
	}
}
