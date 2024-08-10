package com.SingleLinkedlist;

public class PrintSinglyLinkedlist {
	
   private static ListNode head;  //it is a instance variable 
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {       //this is used to print the values
		ListNode current = head;
		while(current!= null) {
			System.out.println(current.data + " -->");
			current= current.next;
		}
		System.out.println("null");
		
	}
	
	//it will print the length of the singlylinkedlist
	
	public int lenght() {
		
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current =head;
		
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	//it will create node and we can insert the values 
	public void insertfirst(int value) {
		
		ListNode newnode = new ListNode(value);
		newnode.next = head;
		head = newnode;
	}
	
	
	//this method will insert a node in a singly linked list at a given position
	
	public void insertpostion(int position, int value) {
		
		ListNode node = new ListNode(value);
		if(position ==1) {    //if we want to insert the node at the position 1 
			node.next=head;
			head = node;
		}
		else {                //this loop is for the if we want to insert at middle of the linked list
			ListNode previous= head;
			int count =1;
			while(count < position-1) {
				previous = previous.next;
				count++;
			}
			
			ListNode Current = previous.next;
			node.next = Current;
			previous.next = node;
			
		}
	}
	
	//thi will be delete the first node of the linked listif we call in main method again it will delete the next one also 
	public ListNode deletefirst() {
		if(head == null) {
			return null;
		}
		
		ListNode temp = head;
		head = head.next;
		temp.next =null;
		return temp;	
	}
	
	//this method will delete from the last node 
	
	public ListNode deletelast() {
		if(head == null || head.next == null) {
			return head; 
		}
		
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next =null;
		return current;
		
	}
	
	//this method will delete the element at any position
	
	public void deleteatany(int position) {
		
		if(position == 1 ) {
			
			head = head.next;
		}else {
			ListNode previous = head;
			int count =1;
			while(count<position-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	//this method will search the element in the linkedlist
	
	public boolean Search(ListNode head, int searchkey) {
		if(head==null) {
			return false;
		}
		
		ListNode current = head;
		while(current != null) {
			if(current.data == searchkey) {
				return true;
			}
			current= current.next;
		}
		
		return false;
		
	}
	
	//this method will reverse the linkedlist
	
	public ListNode reverse(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current =next;
		}
		
		return previous;
		
		
	}
	
	//this method will print the nth node value from the las
	
	public ListNode findnthnode(int n) {
		
		if(head == null) {
			return null;
		}
		
		if(n<=0) {
			throw new IllegalArgumentException("Invalid value n = :" + n);
		}
		
		ListNode mainptr = head;
		ListNode refptr = head;
		
		int count = 0;
		
		while(count<n) {
			refptr = refptr.next;
			count++;
		}
		
		while(refptr != null) {
			refptr = refptr.next;
			mainptr = mainptr.next;
			
		}
		return mainptr;
		
	}
	
	
	//this will remove the duplicates in the linledlist

	public void removeDuplicate() {
		
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
				
			}else{
				current = current.next;
			}
		}
	}
	
	//this method will insert the new node in the sorted linkedlist
	
	public ListNode insertnewNode(int value) {
		
		ListNode newNode  = new ListNode(value);
		
		ListNode current =head;
		ListNode temp =null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		return head;
		
	}
	
//this method will remove the value which we want to remove any value from the linked list
	
	public void deleteNodeKey(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
		}
		
		temp.next = current.next;
		
	}
	
	//this method will check wheather the linked list is having the loop or not
	
	public boolean containsloop() {
		
		ListNode firstptr = head;
		ListNode secptr = head;
		
		while(firstptr != null && firstptr.next != null) {
			firstptr = firstptr.next.next;
			secptr = secptr.next;
			
			if(secptr==firstptr) {
				return true;  
				
			}
		}
		
		return false;
		
	}
	
	//this is same as the above one but this will find the starting point of the loop
      public ListNode startingNodeloop() {
		
		ListNode firstptr = head;
		ListNode secptr = head;
		
		while(firstptr != null && firstptr.next != null) {
			firstptr = firstptr.next.next;
			secptr = secptr.next;
			
			if(secptr==firstptr) {
				return getStartingNode(secptr);  
				
			}
		}
		
		return null;
		
	}
	
	
	private ListNode getStartingNode(ListNode secptr) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		while(secptr != temp) {
			temp = temp.next;
			secptr = secptr.next;
		}
		return temp;
	}

	public void createlinkedlistloop() {


		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fivth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		
		first.next = second;
		second.next= third;
		third.next = fourth;
		fourth.next = fivth;
		fivth.next =third;
		
	}

	public static void main(String[] args) {
		PrintSinglyLinkedlist sl = new PrintSinglyLinkedlist();
		
//		ListNode head = new ListNode(10);   //here we are giving the values from head to null 
//		ListNode second = new ListNode(1);
//		ListNode third = new ListNode(11);
//		ListNode fourth = new ListNode(8);
//		
//		//below is for to connect the numbers it will form the line
//		
//		head.next =second;
//		second.next = third;
//		third.next = fourth;
//		
//		sl.insertfirst(91);
//		sl.insertfirst(8);
//		sl.insertfirst(5);
		
//		sl.insertpostion(1, 5);   //it will look like this   5 --> null
//
//		sl.insertpostion(2, 9);   // 5 -->9 --> null
//	
//		sl.insertpostion(3, 10);  // 3 -->5 --> 9 --> null
//		
//		sl.insertpostion(4, 22);   // 3 --> 5 --> 8 --> 9 --> null
//		
//		sl.insertpostion(5, 27);
//		
//	sl.display();
//		
//		
//		System.out.println(sl.deletefirst(). data);
//		System.out.println(sl.deletefirst(). data);
//		System.out.println(sl.deletefirst(). data);
//		------------------
		
//	System.out.println(sl.deletelast().data);
//	System.out.println(sl.deletelast().data);
// ----------------------
		
//	   sl.deleteatany(1);
//	   sl.deleteatany(2);
		
		//------------------------
		
//	if(sl.Search(head, 99)) {
//		System.out.println("Search key is found...");
//		
//	}else {
//		System.out.println("Searchkey is not found.....");
//	}
	
	
		//System.out.println("The length is  - " + sl.lenght());
  
//		ListNode rev = sl.reverse(head);
//		sl.display(head);
	
	
//		------------------------
//		ListNode nthNodeFromEnd = sl.findnthnode(3);
//		System.out.println("The nth node from end :"+ nthNodeFromEnd.data );
	
	//----------------
//	sl.removeDuplicate();
//	sl.display();
	
	//----------------------
//	sl.insertnewNode(6);
//	sl.display();
	//----------
	
//	sl.deleteNodeKey(10);
//	sl.display();

		sl.createlinkedlistloop();
		System.out.println(sl.containsloop());
		System.out.println(sl.startingNodeloop().data);
	}

}
