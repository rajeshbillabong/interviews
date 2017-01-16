package com.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

//http://www.geeksforgeeks.org/find-level-maximum-sum-binary-tree/
public class MaxSumAtLevel { 

	public static void main(String[] args){ 

		BinaryTree bt = BinaryTree.createBinaryTree(); 
		bfsOnBT(bt);  
	}


	public static void bfsOnBT(BinaryTree root){

		if(root == null) return; 
		Queue<BinaryTree> q = new LinkedList<BinaryTree>(); 
		q.add(root);  
		while(!q.isEmpty()){
			BinaryTree node = q.remove();
			System.out.println("value="+node.getData()); 
			if(node.getLeftNode() != null) q.add(node.getLeftNode()); 
			if(node.getRightNode() != null) q.add(node.getRightNode());
		}
	}

}
