package com.tree.problems;

public class HeightOfTree {



	public static int heightOfBinaryTree(BinaryTree n){

		if(n == null){
			return 0;
		}
		else {
			return 1+ Math.max(heightOfBinaryTree(n.leftNode), heightOfBinaryTree(n.rightNode));
		}

	}


	public static int heightOfNTree(TreeNode root) {
		if (root == null) return 0;
		if(root.children == null) return 1;

		int maxHeight = 0;

		for(TreeNode n : root.children) {
			maxHeight = Math.max(heightOfNTree(n), maxHeight);
		}

		return maxHeight + 1;
	} 

	public static void main(String[] args){ 

		BinaryTree bt = BinaryTree.createBinaryTree(); 
		
		PrintTreeLevelByLevel p = new PrintTreeLevelByLevel();
		p.printLevelOrder(bt);
		
		System.out.println( "BT height="+ heightOfBinaryTree(bt));

		System.out.println("\n\n"); 

		TreeNode tn = TreeNode.createTree();
		System.out.println( "NTree height="+ heightOfNTree(tn));




	}
}
