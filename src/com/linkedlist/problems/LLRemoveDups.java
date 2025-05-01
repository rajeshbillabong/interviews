package com.linkedlist.problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=problem-list-v2&envId=linked-list

public class LLRemoveDups {

	public static void main(String[] args) {
		System.out.println("starting ...");
		Node node = new Node(1);
		node.next= new Node(1);
		node.next.next = new Node(1);
	 
		
		Map<Integer, Integer> map = new HashMap<>();
		Node prev = null;
		Node holder = node;
		while(node!=null) {
			System.out.println(""+node.val);
			Integer temp = map.get(node.val);
			if(temp != null) {
				System.out.println("dup found for "+node.val);
				prev.next = node.next;
				
			}else {
				map.put(node.val, node.val);
				prev = node;
			}
			
			node = node.next;
			
		}
		
		
		System.out.println("final list:");
		while(holder!=null) {
			System.out.println(""+holder.val);
			holder = holder.next;
		}
	}
}
