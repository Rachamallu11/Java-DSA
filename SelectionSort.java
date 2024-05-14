package com.learning.DSA;

//Selection sorting means we have check or select first minimum value and 
//maximum value based on that we have to swap them.
//And based on that we have to make two sections for the sorting them 
// we have to create the one variable which is for minimum index value 
// and we have to create temp variable to store

public class SelectionSort {

	public static void main(String[] args) {
 
		int num1[] = {8,9,3,5,7,1};
		int size = num1.length;
		int minIndex = 0;
		int temp = 0;
		
		System.out.println("Before Sorting");
		for(int num : num1) {
			
			System.out.println(num + " ");
		}
		
		// here we are writing the two loops inner and outer 
		
		for(int i=0; i<size; i++) {
			
			for(int j = i; j<size; j++) {    // we have to write the logic here 
				
				if(num1[minIndex] > num1[j])
					minIndex = j;
				
			}
			
			temp = num1[minIndex];
			num1[minIndex] = num1[i];
			num1[i] = temp;
			
			
			for(int num : num1) {
				System.out.println(num + " ");
			}
			
			
		}
		
		
		
		System.out.println("After Sorting");
		for(int num : num1) {
			System.out.println(num + " ");
		}
		
	}

}
