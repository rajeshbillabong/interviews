package com.strings.problems;

public class CheckAnagram {

	public static boolean checker(String s1, String s2) {
		

		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i=0;i<s1.length();i++) {
			
		}
		
		return true;
	}
	
	public static boolean check(String s1, String s2) {
		
		boolean isAnagram = false;
		
		//size check
		if(s1.length() != s2.length()) {
			isAnagram = false;
		}
		
		return isAnagram;
	}
	
	public static void main(String[] args) {
		
		 System.out.println(checker("listen","silent")); 
		
	}
}
