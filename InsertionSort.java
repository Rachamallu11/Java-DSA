package com.learning.DSA;


//insertion sort means it is not the swaping in the array here we have to shifting the values
//in the array first we have to take the 2nd index in an array and assume 1st index ia already sorted.

public class InsertionSort {

	public static void main(String[] args) {

		int num2[] = {3,8,1,5,6};
		
		
		// we are using two loops not for and for using for and while because based on condition so 
		
		for(int i = 1; i<num2.length; i++) {
			
			int key = num2[i];
			int j = i-1;
			
			while(j>=0 && num2[j]>key) {
				
				num2[j+1] = num2[j];
				j--;          // we have to reduce the vakue of j
			}
			
			num2[j+1] = key;
		}
		
		for(int n : num2) {
			
			System.out.println(n + " ");
		}
	}

}
