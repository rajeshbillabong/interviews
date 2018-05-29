package com.tree.problems;

import java.util.Stack;

public class DepthFirstTree {
	
	
	

	public static void main(String[] args){ 
		
	 	BinaryTree bt = BinaryTree.createBinaryTree(); 
		dfsOnBT(bt);
	
		System.out.println("\n\n"); 
		
		TreeNode tn = TreeNode.createTree();
	//	bfsOnGenericTree(tn);
		
		
		
		
	}
	 
	public static void dfsOnBT(BinaryTree bt) {
		System.out.println("Preorder");
		preorderTravesal(bt);
		
		System.out.println("Inorder");
		inorderTravesal(bt);
		
		System.out.println("Postorder");
		postorderTravesal(bt);
		
		
		System.out.println("Stack Preorder");
		preorderUsingStack(bt);
	}

	
 public static void	preorderTravesal(BinaryTree bt){
		if(bt==null) return;
	
		System.out.println(bt.data);
		preorderTravesal(bt.leftNode);
		preorderTravesal(bt.rightNode);
	}
 
 public static void	inorderTravesal(BinaryTree bt){
	 if(bt==null) return;
		
		inorderTravesal(bt.leftNode);
		System.out.println(bt.data); 
		inorderTravesal(bt.rightNode);
	}
 
 public static void	postorderTravesal(BinaryTree bt){
	 if(bt==null) return;
		
		postorderTravesal(bt.leftNode);
		postorderTravesal(bt.rightNode);
	
		System.out.println(bt.data); 
	}
 

 
 public static void preorderUsingStack(BinaryTree bt) {
	 Stack<BinaryTree> s = new Stack<BinaryTree>();
	 
	 s.push(bt);
	 
	 while(!s.isEmpty()) {
		 		 
		 BinaryTree btTemp = s.pop();
		 if(btTemp == null) continue;

		 System.out.println(btTemp.data);
		 s.push(btTemp.rightNode);
		 s.push(btTemp.leftNode); 
	 }
 }
/*
 * 
 * 
 *                  8
 * 				  /	  \ 
 * 				38	     83	
 * 			  /    \    /   \
 * 			84     85  86    87
 *                  \ 
 * 					88
 * 				  /	   \
 * 				89     810
 * 
 */
}
