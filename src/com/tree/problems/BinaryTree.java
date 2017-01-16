package com.tree.problems;

public class BinaryTree {
int data;

BinaryTree leftNode;
BinaryTree rightNode;
 


public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public BinaryTree getLeftNode() {
	return leftNode;
}
public void setLeftNode(BinaryTree leftNode) {
	this.leftNode = leftNode;
}
public BinaryTree getRightNode() {
	return rightNode;
}
public void setRightNode(BinaryTree rightnode) {
	this.rightNode = rightnode;
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

public static BinaryTree createBinaryTree(){
	BinaryTree node = new BinaryTree(); 
	node.data= 8;
	
	BinaryTree node2 = new BinaryTree(); 
	node2.data= 38;
	BinaryTree node3 = new BinaryTree(); 
	node3.data= 83;
	BinaryTree node4 = new BinaryTree(); 
	node4.data= 84;
	BinaryTree node5 = new BinaryTree(); 
	node5.data= 85;
	BinaryTree node6 = new BinaryTree(); 
	node6.data= 86;
	BinaryTree node7 = new BinaryTree(); 
	node7.data= 87;
	BinaryTree node8 = new BinaryTree(); 
	node8.data= 88;
	BinaryTree node9 = new BinaryTree(); 
	node9.data= 89;
	BinaryTree node10 = new BinaryTree(); 
	node10.data= 810;
	
	node.setLeftNode(node2);
	node.setRightNode(node3);
	
	node2.setLeftNode(node4);
	node2.setRightNode(node5);
	
	node5.setRightNode(node8);
	
	node3.setLeftNode(node6);
	node3.setRightNode(node7);
	
	node8.setLeftNode(node9);
	node8.setRightNode(node10);
	

	return node;
	
	
	
}

}
