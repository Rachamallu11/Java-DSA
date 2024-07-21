package com.demo.com;

public class MinimumValueinArray {
	
	
	
	public  int MinimumValue(int[] arr) {
		
		//edge case
		if(arr == null || arr.length ==0) {
			throw new IllegalArgumentException("invalid array");
		}
		
		int min = arr[0];
		for(int i =1; i<arr.length; i++ ) //we have to start this from index "1" bcoz we already initialise to "min" variable
			
			if(arr[i]<min) {
				min = arr[i];
			}
		return min;
	}
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,9,3,15,1,2};
		
		 MinimumValueinArray min = new  MinimumValueinArray();
		System.out.println(min.MinimumValue(arr));
	}

}
