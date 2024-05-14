package com.learning.stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		
		s.push(22);
		s.push(44);   // here we are printing the last value is 44 then it is printing
		
		s.push(33);
		s.push(34);
		s.push(35);
		s.push(36);
		
	
		System.out.println("size is " +  " : "  + s.size());
		System.out.println("array is empty" +  " : "  + s.isEmpty());
		
		s.show();
	

	}

}
