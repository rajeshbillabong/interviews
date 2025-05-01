package com.linkedlist.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.tree.problems.BinaryTree;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/?envType=problem-list-v2&envId=linked-list

public class FlattenBinaryTreeToLL {

	public static void solution(BinaryTree root) {
		List<Integer> res = new ArrayList<>();
		if(root == null) {
			return;
		} 
		
 		Node dummy = new Node(0);
 		Node node = dummy;
		
		Stack<BinaryTree> stack = new Stack();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			BinaryTree curr = stack.pop();
			res.add(curr.getData());
			node.next = new Node(curr.getData());
			
			
			if(curr.getRightNode() != null) {
				stack.push(curr.getRightNode());
			}
			
			if(curr.getLeftNode() != null) {
				stack.push(curr.getLeftNode());
			}
			
		
		}
		
		System.out.println(res.toString());
		
		while(dummy !=null) {
			System.out.println("LL:"+dummy.val);
			dummy = dummy.next;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("starting ...");
		BinaryTree tree = new BinaryTree();
		BinaryTree root = tree.createBinaryTree();
		
		solution(root);
		
	}
}
