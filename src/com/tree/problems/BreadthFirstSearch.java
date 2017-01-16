package com.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	
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
	
	public static void bfsOnGenericTree(TreeNode root){
		
		if(root == null) return;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(root); 
		
		while(!q.isEmpty()){
			TreeNode node = q.remove();
			System.out.println("value="+node.getData()); 
			 if(node.getChildren() != null && node.getChildren().length > 0) {
				 TreeNode[] tn = node.getChildren(); 
				 for(int i=0;i<node.getChildren().length;i++){
					 q.add(tn[i]);
				 }
			 }else {
				 System.out.println("No child for "+node.getData());
			 }
		}
		
	}
	
	
	public static void main(String[] args){ 
		
	 	BinaryTree bt = BinaryTree.createBinaryTree(); 
		bfsOnBT(bt);
	
		System.out.println("\n\n"); 
		
		TreeNode tn = TreeNode.createTree();
		bfsOnGenericTree(tn);
		
		
		
		
	}
	 
}
