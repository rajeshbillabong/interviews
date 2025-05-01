package com.linkedlist.problems;

public class ReverseLL {

	public static void main (String[] arg) {
		Node root = new Node(1);

		root.next=new Node(2);
		root.next.next=new Node(3);
		root.next.next.next=new Node(4);
		root.next.next.next.next=new Node(5);
		
		solution2(root);
		
	}

	public static void solution (Node node){
		Node prev = null;
		Node curr = node;
		
		while (curr != null) {
            Node temp = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
 
		while(prev!=null) {
			System.out.println(prev.val);
			prev = prev.next;
		}
	}
	
	public static void solution2 (Node node) {
		
		Node prev = null;
		Node curr = node;
		
		while(curr!=null) {
			Node temp = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = temp;
			
		}
	 
		
	}
}
