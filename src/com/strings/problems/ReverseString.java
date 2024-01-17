package com.strings.problems;

public class ReverseString {
	
	
	public static char[] reverse(char[] str) {
		
		for(int i = 0; i < str.length/2; i++) {
			char c = str[i];
			str[i] = str[str.length-1-i];
			str[str.length-1-i] = c;
		}
		
		return str;
	}
	
	
	
	public static void main (String[] args) {
			
		System.out.println("yoyo");
		System.out.println(reverse("rajesh1".toCharArray()));
	}

}
