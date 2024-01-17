package com.array.problems;

public class Add2BinaryNumbers {

	
	
	public static String doAddition() {
		
		String a = "1111"; 
		String b = "11";
		
		StringBuilder sb = new StringBuilder();
	    int carry = 0;
	    int i = a.length() - 1;
	    int j = b.length() - 1;

	    while (i >= 0 || j >= 0 || carry == 1) 
	    {
	      if(i >= 0)
	        carry += a.charAt(i--) - '0';
	      if(j >= 0)
	        carry += b.charAt(j--) - '0';
	      sb.append(carry % 2);
	      carry /= 2;
	    }
	    return sb.reverse().toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("result="+doAddition());
	}
}
