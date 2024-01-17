package com.array.problems;

public class RotateString {
	
	public static boolean isRotatedString(String s1, String s2) {
		
		
		return true;
	}

	
public static boolean isRotatedStringUsingConcat(String s1, String s2) {
		
	String combined = s2+s2;
 	
	System.out.println("concat="+combined);
		
	int len = s1.length();
	
	System.out.println("len="+len);
	
	
	for(int i=0;i<combined.length();i++) {
		
		System.out.println("i="+i+", combined.charAt(i)="+combined.charAt(i)+", s1.charAt(count)="+s1.charAt(0));
		
		
		if(combined.charAt(i) == s1.charAt(0)) {
			
			System.out.println("combined.charAt(i) == s1.charAt(i) is TRUE");
		for(int j=i-1;j<i+s1.length();j++) {
			int temp = i-1;
			System.out.println("j="+j);
			System.out.println( "combined.charAt(temp++)="+combined.charAt(temp)+", s1.charAt(j)"+s1.charAt(j));

			if(combined.charAt(temp++) != s1.charAt(j)) {
				System.out.println("CONTINUE");
				continue;
			}
		}
			
		} 
	} 
		return true;
	}

	
	public static void main(String args[]) {
		
		System.out.println("result="+isRotatedStringUsingConcat("abcde", "cdeab"));
	}
}
