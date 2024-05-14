package com.learning.DSA;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = {4,2,3,7,5,1};
		
		// here i'm creating one function 
		
		quicksort(arr, 0, arr.length-1);    // this is low, high values 
		
		for (int n : arr) {
			System.out.println(n + " ");
		}
	}

	public static void quicksort(int[] arr, int low, int high) {
		
		if(low<high) {
			
			int pi = partition(arr, low, high);
			
// here we have to create the two array because the we have divide & conquer them
// in this array we don't have pi value because pi is same for the array it will not change			
			
			quicksort(arr, low,pi-1);    
			quicksort(arr,pi+1 ,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j =low; j<high; j++ ) {
			
			if(arr[j]<pivot) {
				
				i++;
			    int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			
		}
		}
		int temp = arr[i+1];
	    arr[i+1] = arr[high];
	    arr[high] = temp;

		
		return i+1;
	}

}
