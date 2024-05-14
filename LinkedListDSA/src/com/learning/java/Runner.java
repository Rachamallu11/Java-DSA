package com.learning.java;

public class Runner {
	
	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		list.insert(12);   // we are inserting the data here 
		list.insert(34);
		list.insert(44);
		list.insert(33);
		
		list.insertAtStart(55);
		
		list.insertAt(0, 10);  // if we want to add the value at '0' index 
		
		list.deleteAt(2, 12);
		
		
		list.show();
	}
	

}
