package com.tree.problems;

import java.lang.reflect.Array;

public class TreeNode {

	int data;

	TreeNode[] children;
	 
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode[] getChildren() {
		return children;
	}
	public void setChildren(TreeNode[] children) {
		this.children = children;
	}


/*
 * 
 * 
 *                  8---------------	
 * 				  /	  \ 	 \		\
 * 				38	     83	   91	92
 * 			  /    \    /   \
 * 			84     85  86    87
 *                  \ 
 * 					88 ------
 * 				  /	   \     \
 * 				89     810    99
 * 
 */

public static TreeNode createTree(){
	TreeNode node = new TreeNode(); 
	node.data= 8;
	
	
	TreeNode node2 = new TreeNode(); 
	node2.data= 38;
	TreeNode node3 = new TreeNode(); 
	node3.data= 83;

	TreeNode node91 = new TreeNode(); 
	node91.data= 91;
	TreeNode node92 = new TreeNode(); 
	node92.data= 92;
	
	TreeNode [] tn = new TreeNode[4];
	tn[0] = node2;
	tn[1] = node3;
	tn[2] = node91;
	tn[3] = node92;
	
	node.setChildren(tn);
	
	 
	TreeNode node99 = new TreeNode(); 
	node99.data= 99;
	
	TreeNode node4 = new TreeNode(); 
	node4.data= 84;
	TreeNode node5 = new TreeNode(); 
	node5.data= 85;
	TreeNode node6 = new TreeNode(); 
	node6.data= 86;
	TreeNode node7 = new TreeNode(); 
	node7.data= 87;
	TreeNode node8 = new TreeNode(); 
	node8.data= 88;
	TreeNode node9 = new TreeNode(); 
	node9.data= 89;
	TreeNode node10 = new TreeNode(); 
	node10.data= 810;
	 
	

	TreeNode [] tn2 = new TreeNode[2];
	tn2[0] = node4;
	tn2[1] = node5;
	
	node2.setChildren(tn2);
	
	TreeNode [] tn3 = new TreeNode[2];
	tn3[0] = node6;
	tn3[1] = node7;
	node3.setChildren(tn3);
	
	TreeNode [] tn4 = new TreeNode[1];
	tn4[0] = node8; 
	node5.setChildren(tn4);
	
	TreeNode [] tn5 = new TreeNode[3];
	tn5[0] = node99;
	tn5[1] = node9;
	tn5[2] = node10;
	
	node8.setChildren(tn5);
	 

	
	return node;
	
	
	
}


}
