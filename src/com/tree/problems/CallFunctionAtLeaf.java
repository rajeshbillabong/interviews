package com.tree.problems;
//http://careercup.com/question?id=2997

public class CallFunctionAtLeaf {

	
	public static void callFunctionAtLeafFullTree(TreeNode node){
		
		if(node == null) return;
		else {
			  
		}
		
	}
	
	
public static void callFunctionAtLeafBinaryTree(BinaryTree node){
		
		if(node == null) return;
		else {
			callFunctionAtLeafBinaryTree(node.getLeftNode());
			callFunctionAtLeafBinaryTree(node.getRightNode());
			  
			if(node.getLeftNode() == null && node.getRightNode() == null){
				//call the function at leaf
			}
		}
		
		int[] A = {1} ;int temp =A.length;
	}
	
	
	public static void main(String[] args){
		
	}
	
	 
	
}
