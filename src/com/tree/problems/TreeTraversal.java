package com.tree.problems;

import java.util.Stack;

public class TreeTraversal {


	public static void inOrderTraversal(BinaryTree node) {

		if(node == null) {
			return;
		}

		inOrderTraversal(node.leftNode);

		System.out.println(node.data);

		inOrderTraversal(node.rightNode);
	}


	public static void preOrderTraversal(BinaryTree node) {

		if(node == null) {
			return;
		}

		System.out.println(node.data);

		preOrderTraversal(node.leftNode);


		preOrderTraversal(node.rightNode);
	}



/*
 * 
 * 
 *                 __8__
 * 				  /	    \ 
 * 				38	     83	
 * 			   /  \     /  \
 * 			 84   85   86  87
 *                  \ 
 * 					88
 * 				   /  \
 * 				 89   810
 * 
 */

	public static void inOrderTraversalUsingStack(BinaryTree node) {

		Stack<BinaryTree> stack = new Stack();
		BinaryTree current = node;
 
		while(!stack.isEmpty() || current != null) {
			
			if(current != null) {
				stack.push(current);
				current = current.leftNode;
			}else {
				BinaryTree pop = stack.pop();
				System.out.print(pop.data+",");
				current = pop.rightNode;
			}
		}
	}
	
	
	public static void preOrderTraversalUsingStack(BinaryTree node) {

		Stack<BinaryTree> stack = new Stack();
		BinaryTree current = node;
 
		while(!stack.isEmpty() || current != null) {
			
			if(current != null) {
				System.out.print(current.data+",");
				stack.push(current);
				current = current.leftNode;
			}else {
				BinaryTree popNode = stack.pop();
 				current = popNode.rightNode;
			}
		}
	}


	public static void main(String [] args) {

		BinaryTree root =   BinaryTree.createBinaryTree();

		//System.out.println("hoho"+root.toString());

		preOrderTraversalUsingStack(root);
	}





}
