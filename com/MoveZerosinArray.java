package com.demo.com;

public class MoveZerosinArray {
	
	public static void printArray(int[] arr) {   //this method is used to print the elements in array
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void Zero(int arr[], int n) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {8,1,0,2,1,0,3};
		printArray(arr);

		Zero(arr, arr.length);
		printArray(arr);
		
	}

}
