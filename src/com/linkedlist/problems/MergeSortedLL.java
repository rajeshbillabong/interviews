package com.linkedlist.problems;

public class MergeSortedLL {

	public static void main (String[] args) {
		System.out.println("starting ...");
		Node l1 = new Node(1);
		l1.next= new Node(2);
		l1.next.next = new Node(4);
		l1.next.next.next = new Node(10);
		
		Node l2 = new Node(7);
		l2.next= new Node(8);
		l2.next.next = new Node(9);
		
		Node result =	solution(l1,l2);
		
	
		while(result != null) {
			System.out.println("val="+result.val);
			result = result.next;
		}
		
	}
	
	public static Node solution(Node l1, Node l2) {
		Node dummy = new Node(0);
		Node node = dummy;
		
		while(l1 != null && l2 != null) {
			
			if(l1.val < l2.val) {
				node.next = l1;
				l1 = l1.next;
			}else {
				node.next = l2;
				l2 = l2.next; 
			}
			
			node = node.next;
		}
		
		if(l1 != null) {
			node.next = l1;
		}else {
			node.next = l2;
		}
		
		return dummy.next;
		
	}
}
