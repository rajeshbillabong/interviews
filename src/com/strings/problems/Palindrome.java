package com.strings.problems;

public class Palindrome {

	
	
	
	public static boolean isPalindrome(String inputStr){
		int len = inputStr.length();
		
		for(int i=0;i<len/2;i++) {
			if(inputStr.charAt(i) != inputStr.charAt(len-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		System.out.println("value = "+isPalindrome("aakaa"));
	}
}
