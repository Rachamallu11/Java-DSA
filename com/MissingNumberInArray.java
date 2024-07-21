package com.demo.com;

public class MissingNumberInArray {
	
	public static void printArray(int[] arr) {   
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public int Missingnum(int[] arr) {
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		
		for(int num :arr) {
			sum = sum-num;
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
