package com.linkedlist.problems;


//http://www.geeksforgeeks.org/check-if-a-linked-list-is-circular-linked-list/
public class CheckLLIsCircular {

	public static void main(String[] args) {
		
		System.out.println("starting ...");
		Node node = new Node(1);
		node.next= new Node(1);
		node.next.next = new Node(1);
		Node slow = node;
		Node fast = node;
		
		while( fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow.val == fast.val) {
				return true;
			}
		}
		
		return false;
	}
}
