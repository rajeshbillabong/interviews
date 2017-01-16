package com.array.problems;

import java.util.ArrayList;

import com.tree.problems.BinaryTree;

public class PathProblem {
	 
static ArrayList<String> pathList = new ArrayList<String>();
	
	static void pathSum( BinaryTree node, int sum,int[] path,int pathLen) {
	    // return true if we run out of tree and sum==0
	    if (node == null) {                                   // empty tree
	        // choose one:
	         return;
	        //return false;
	    } 
	    
	    path[pathLen] = node.getData();
        pathLen++;
	    
	    if (node.getLeftNode() == null && node.getRightNode() == null) { 
	    	 
	        if (sum == node.getData()){ // meaning this is the sum
	        	 pathList.add(getPathString(path,pathLen));	
	        	//printPath(path,pathLen);
	        }
	    }  else {                                              // try children
	         if (node.getLeftNode() != null) {
	        	 
	        	 pathSum(node.getLeftNode(), sum - node.getData(),path,pathLen);
	         }
			if( node.getRightNode() != null) {
				pathSum(node.getRightNode(), sum - node.getData(),path,pathLen);
			}
	    }
	}
	
	
	static String getPathString(int[]path,int pathLen){
		
		StringBuffer stb = new StringBuffer();
		
		for(int i=0;i<pathLen;i++){
			stb.append(path[i]+",");
		}
		  
		return stb.toString().substring(0, stb.length()-1);
		
	}
	
	
	 
	 
	public static void main(String args[]){
		//System.out.println( closestInt(1000,-1000));
		//	System.out.println(doubleEachCharInString("hello"));

		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		int path[] = new int[1000];
		 pathSum(bt.createBinaryTree(), 1029,path,0);

		 System.out.println(pathList);
	}
	
	
	
}
