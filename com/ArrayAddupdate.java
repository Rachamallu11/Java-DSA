package com.demo.com;

public class ArrayAddupdate {
	
	public void printArray(int[] arr) {   //this method is used to print the elements in array
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
	public void arrdemo() {
		int[] myArray = new int[5];
		myArray[0] = 4;
		myArray[1] = 7;
		myArray[2] = 9;
		myArray[3] = 2;
		myArray[4] = 10;
		printArray(myArray);
		System.out.println("the las value in the array is: " + myArray[myArray.length-1]);
		
	}

	public static void main(String[] args) {
		
		ArrayAddupdate up = new ArrayAddupdate();
		up.arrdemo();

	}

	

}
