package com.strings.problems;

public class Palindrome {

	
	
	
	public static boolean isPalindrome(String inputStr){
		if(inputStr == null || "".equalsIgnoreCase(inputStr)) return false;
		
	for(int i=0;i<inputStr.length()/2;i++){
		
		if(inputStr.charAt(i) != (inputStr.charAt(inputStr.length()-i-1))){
			return false;
		}
	}
		
		return true;
	}
	
	public static void main(String[] args){
		
		System.out.println("value = "+isPalindrome("aaaaaa"));
	}
}
