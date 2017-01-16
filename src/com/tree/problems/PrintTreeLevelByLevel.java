package com.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelByLevel {    

	   static  Queue<BinaryTree> qe = new LinkedList<BinaryTree>();

	    public static void printLevelOrder(BinaryTree root)     
	    { 
	        if(root == null) return;

	        qe.add(root);
	        int count = qe.size();

	        while(count!=0)
	        {   
	            System.out.print(qe.peek().data);
	            System.out.print("  ");
	            if(qe.peek().getLeftNode()!=null) qe.add(qe.peek().getLeftNode());
	            if(qe.peek().getRightNode()!=null) qe.add(qe.peek().getRightNode());
	            qe.remove(); count = count -1;
	            if(count == 0 )
	            {
	                System.out.println("  ");
	                count = qe.size();
	            }
	        }           
	    }

	    public static void main(String[] args){ 

			BinaryTree bt = BinaryTree.createBinaryTree(); 
			
			printLevelOrder(bt);
			
			 
			System.out.println("\n\n");  



		}
	    
	}
