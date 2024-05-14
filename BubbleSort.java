package com.learning.DSA;

public class BubbleSort {

	public static void main(String[] args) {

 
		int nums[] = {6,2,3,1,9,5};
		int size = nums.length;
		int temp = 0; // here we are taking temp variable for swap 
		
		System.out.println("before Sorting");
		for(int num: nums) {
			
			System.out.println(num + "    ");
		}
		
		
		for (int i =0 ; i<size; i++) {  // this outer loop is responsible for no of iterations
			
			for(int j=0; j<size-i-1; j++) {  // this is for j is a index which will swap the elements in the array
			// why we are using -1 in j loop means j will end before the j+1 in an array 
			//why we are using -i in the j loop means everytime while iteration the last values are already sorted in the array
			// the above one will not effect the o/p but will change the speed 	
				if(nums[j] > nums[j+1]) {
					
					temp = nums[j];
					nums[j] =nums[j+1];   // these are swap for doing the iteration for everytime
					nums[j+1] = temp;
					
				}
			}
			for(int num: nums) {
				System.out.println(num +" " );
			}
			
		}

		
		System.out.println("After Sorting");
		for(int num: nums) {
			System.out.println(num );
		}
		
	}

}
