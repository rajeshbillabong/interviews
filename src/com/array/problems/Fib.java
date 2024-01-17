package com.array.problems;

public class Fib { 
	  
	  public static void main(String[] args){
	    
	    System.out.println("args="+args[0]);
	    int input= Integer.parseInt(args[0]);
	    System.out.println(fibbo(input));
	    
	  }
	  
	  public static int fibbo(int n){
	    
	    if(n<=1) return 1; 
	    
	    return fibbo(n-1) + fibbo(n-2);
	    
	  }
	  
	 }