package com.learning.stack;

public class Stack {
	
	// first we have to create an array for the data 
	
	int stack[] = new int[5];
	int top = 0;  // this for adding the elements in the array
	
	//below method is for adding the elements 
	
	public void push(int data) {
		
		if(top == 5) {
			System.out.println("it is full");
		}
		else {
			stack[top] = data; 
			top++;    // it will increament 
		}
		
		
	}
	
	//how to delete the element
	
	public int pop() {
		
		
		int data=0;
           if(isEmpty()) {
			
			System.out.println("it is empty..");
		}
		else {
		top--;
		data = stack[top];
		stack[top] = 0;   // beacuse after deleting the top value it should be 0.
		
		}
           return data;
		
		
	}

	// for peek to find the value 
	//it is same as pop
	
	public int peek() {
		
		int data;
		
		data = stack[top-1];
	
		return data;
	}
	//it defines the size of an array 
	
	public int size() {
		
		return top;
	}
	
	//it check if the array isempty or not
	
	public boolean isEmpty() {
		
		return top<=0;
		
		
	}
	
	
	
	// This is for printing 
	
	public void show() {
		
		for(int n : stack) {
			System.out.println(n + " ");
		}
	}

}
