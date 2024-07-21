package com.demo.com;

public class ResizeArray {
	
	public static void printArray(int[] arr) {   
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public int[] resize(int [] arr, int capacity) {  //arr means which we want to resize, capacity which we want to resize
		
		int temp[] = new int[capacity];
		for(int i =0; i<arr.length; i++) {
			
			temp[i] =arr[i];
			
		}
		arr =temp;   // the arr[] is to pointed to the temp[] 
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeArray a = new ResizeArray();
		int[] org = new int[] {5,1,2,9,10};
		System.out.println("The size of the original array is : " + org.length);
		org = a.resize(org, 10);
		System.out.println("The resize array is : "  + org.length);
	

	}

}
