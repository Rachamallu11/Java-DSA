package com.demo.com;

public class ReversetheArray {
	
	public static void printArray(int[] arr) {  // it will jsut print the elements in the array 
		int n =arr.length;
		for(int i =0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void reverse(int num[], int start, int end) {
		
		while(start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end]=temp;
			start++;
			end--;
		}
	
	}

	public static void main(String[] args) {
		int[] num = {2,11,5,10,7,8};

		printArray(num);
		
		 reverse(num, 0, num.length-1);  //this will print within this range 
		 
		 printArray(num);
		
	}

}
