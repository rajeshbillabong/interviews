package com.tree.problems;



import java.net.*;
import java.io.*;


public class ATT {

	 //"input":[ "1", "4", "5" ]
	    public static void main(String[] args) throws Exception {
	    	
	    	if(args== null || args.length!=1) return;
	    	
	    	System.out.println(args[0]);
	        URL oracle = new URL(args[0]);
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));
 
	        String inputLine;
	        while ((inputLine = in.readLine()) != null)
	            if(inputLine !=null && inputLine.contains("[") && inputLine.contains("]")) {
		        	
		        	 String str2 = inputLine.substring(inputLine.indexOf("[")+1, inputLine.indexOf("]"));
		         
		        	 String [] strArr = str2.split(", ");
		        	 int sum = 0;
		        	 int count =0;
		        	 
		        	 for(int i=0;i<strArr.length;i++) {
		        
		        		String temp = strArr[i].substring(strArr[i].indexOf("\"")+1, strArr[i].lastIndexOf("\""));
		        		sum =sum+Integer.parseInt(temp);
		        		count++;
		        		 
		        	 }
		        	
		        	 System.out.println("sum:"+sum+", count:"+count) ;
		        	 
		        }
	        in.close();
	    } 
	    
	     
	 }
