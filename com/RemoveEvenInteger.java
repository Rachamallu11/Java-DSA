package com.demo.com;

public class RemoveEvenInteger {
	
	public static void array(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	
	public static int[] removeEven(int[] arr) {
		
		int oddcount =0; // we count the odd numbers in the array so take variable as "oddcount"
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddcount++;
			}
		}
		
		int[] result = new int[oddcount]; //create the array of the oddcount and we have to store the odd values in this array 
		
		int idx = 0 ;            // this is index variable 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,2,4,7,10,6,5};
		//array(arr);
		int[] result =  removeEven(arr);
		array(result);
	}

}
