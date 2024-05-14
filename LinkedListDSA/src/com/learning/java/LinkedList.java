package com.learning.java;

public class LinkedList {

	Node head;
	
	// here we have to create one method for inserting the elements
	
	public void insert(int data) {
		
		//here we have to create one node
		
		Node node = new Node();
		node.data = data;    //here we are passing the data into Node
		node.next = null;
		
		if(head == null) {  // by default first node head it is null
			
			head = node;
			
		}
		else {
			// we have to create the new node for the other elements
			
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = node;  // it will goes to new node at the end 
		}
	}
	
	// this is for the creation of new node at first
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next=null;
		node.next = head;
		
		head = node;
	}
	// below method is the adding the method in between the list 
	
	public void insertAt(int index, int data) {
		
		Node node = new Node();
		node.data =data;
		node.next = null;
		
		Node n = head;
		
		if(index==0) {
			
			insertAtStart(data);
			
		}
		else {
         for(int i=0; i< index ; i++) {
			
			n = n.next;
		}
		node.next = n.next;
		n.next= node;
	}
	}
	
	// we have to create the method for delete the element in the list 
	
	public void deleteAt(int index, int data) {
		
		Node n =head;
		Node n1 = null;
		for(int i = 0; i<index-1; i++) {
			n = n.next;
			
		}
		n1=n.next;
		n.next=n1.next;
	}
	
	
	// we have to create one method to print the data in the node
	
	public void show() {
		
		Node node = head;
		
		while(node.next!= null) {
			
			System.out.println(node.data);
			
			node = node.next;
		}
		
		System.out.println(node.data);
		
		
	}

}
