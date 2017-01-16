package com.tree.problems;


//http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
public class CountLeafInBinaryTree {
	
	 static  int getLeafCount(BinaryTree node) 
	    {
	        if (node == null)
	            return 0;
	        if (node.leftNode  == null && node.rightNode  == null)
	            return 1;
	        else
	            return getLeafCount(node.leftNode) + getLeafCount(node.rightNode);
	    }
	
	
	
	public static void main(String[] args){ 
		
	 	BinaryTree bt = BinaryTree.createBinaryTree(); 
	 System.out.println( "Count ="+ 	getLeafCount(bt));  
	}

}
