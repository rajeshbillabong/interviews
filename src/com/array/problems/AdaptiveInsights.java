package com.array.problems;

import com.tree.problems.BinaryTree;
import com.tree.problems.TreeNode;

public class AdaptiveInsights {

	public static int closestInt(int int1, int int2){

		if(int1 == int2) return int1;

		int absoluteDiff1 = Math.abs(1000 - int1  );
		int absoluteDiff2 = Math.abs(1000 -  int2 );
		if(absoluteDiff1 < absoluteDiff2)
			return int1;
		else 
			return int2; 

	}


	public static String doubleEachCharInString(String inputStr){

		if(inputStr == null || inputStr.equals("")) return inputStr;

		StringBuffer inputBuf = new StringBuffer();

		for(int i=0;i<inputStr.length();i++){
			Character c = inputStr.charAt(i);
			inputBuf.append(c);
			inputBuf.append(c);
		}

		return inputBuf.toString();
	}


	static boolean hasPathSumBert(final BinaryTree node, final int sum) {
	    // return true if we run out of tree and sum==0
	    if (node == null) {                                   // empty tree
	        // choose one:
	        return (sum == 0);
	        //return false;
	    } else if (node.getLeftNode() == null && node.getRightNode() == null) { 
	    	
	    	System.out.println("sum = "+sum);
	        return (sum == node.getData());
	    } else if (sum <= node.getData()) {                        // sum used up	
	        return false;
	    } else {                                              // try children
	        return (node.getLeftNode() != null  && hasPathSumBert(node.getLeftNode(), sum - node.getData())) ||
	               (node.getRightNode() != null && hasPathSumBert(node.getRightNode(), sum - node.getData()));
	    }
	}
	public static void main(String args[]){
		//System.out.println( closestInt(1000,-1000));
		//	System.out.println(doubleEachCharInString("hello"));

		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		System.out.println( hasPathSumBert(bt.createBinaryTree(), 130));

	}
}
