package com.linkedlist.problems;


//https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/6663226/easy-to-understand-solution-beats-100/?envType=problem-list-v2&envId=linked-list

public class LLIntersection {

	public static void main(String[] args) {
		System.out.println("starting ...");
		
		Node l1 = new Node(1);
		l1.next= new Node(2);
		l1.next.next = new Node(4);
		l1.next.next.next = new Node(10);
		l1.next.next.next.next = new Node(11);
		
		Node l2 = new Node(7);
 
		l2.next = new Node(4);
		l2.next.next = new Node(10);
		l2.next.next.next = new Node(11);
		
		
	}
}
