package com.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

///https://www.geeksforgeeks.org/reverse-level-order-traversal/
public class BottomUpTreeLevel {

	
	public static int treeHeight(BinaryTree bt) {
		if(bt==null) return 0;
		
		return 1+ Math.max(treeHeight(bt.leftNode), treeHeight(bt.rightNode));
		 
	}
	
	public static void reversePrint(BinaryTree bt, int lvl) {
		int heightOfSub = treeHeight(bt);
		
		if(heightOfSub == lvl) {
			System.out.println( bt.data );
		}else {
		
		}
	
	}
	
	public static void bottomUp(BinaryTree bt) {
		  int ht = treeHeight(bt);
		  
		  reversePrint(bt,ht);
		
	}

	public static void main(String[] args){ 
		
	 	BinaryTree bt = BinaryTree.createBinaryTree(); 
		bottomUp(bt);
		 
	
	 
		
	}
	 
}
