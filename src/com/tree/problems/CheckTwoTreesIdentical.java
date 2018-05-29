package com.tree.problems;


///http://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/

public class CheckTwoTreesIdentical {

	public static boolean checkIdentical(BinaryTree bt1, BinaryTree bt2) {
		
		if(bt1==null & bt2 == null) return true;
		else  if((bt1==null & bt2 != null) || (bt1!=null & bt2 == null)) return false;
		else {
			return bt1.data == bt2.data && checkIdentical(bt1.leftNode,bt2.leftNode) &&
					checkIdentical(bt1.rightNode,bt2.rightNode);
		}
		 
	}
	
	public static void main(String[] args) {
		BinaryTree bt1 = BinaryTree.createBinaryTree(); 
		
		BinaryTree bt2 = BinaryTree.createBinaryTree(); 
		 
		System.out.println(checkIdentical(bt1,bt2)); 
		
	}
}
