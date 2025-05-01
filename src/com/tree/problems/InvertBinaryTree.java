package com.tree.problems;



// this is invert and not mirror image. Please note that.
public class InvertBinaryTree {
	
	
	public static BinaryTree invert(BinaryTree bt) {
		
		if(bt == null  ) return null;
		
		BinaryTree node = new BinaryTree( );
		node.data = bt.data;
		
		node.leftNode = invert(bt.rightNode);
		node.rightNode =  invert(bt.leftNode);
		
 
		return node;
	}

	
	public static void main(String[] args) {
		System.out.println("starting ...");
		System.out.println();

		
		BinaryTree bt = new BinaryTree();
		bt = bt.createBinaryTree();
		
		bt.levelOrder(bt);
		bt= invert(bt);
		
		System.out.println();		
		System.out.println();
		System.out.println("Final:");
		System.out.println();

		bt.levelOrder(bt);

	}
}
