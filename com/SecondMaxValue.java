package com.demo.com;

public class SecondMaxValue {
	
	public int findSecondmax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int Secondmax = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				
				Secondmax = max;
				max =arr[i];
			}else if(arr[i]>Secondmax && arr[i]!=max) {
				Secondmax = arr[i];
			}
			
		}
		return Secondmax;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {13,34,2,34,33,1};
		
		SecondMaxValue sc = new SecondMaxValue();
		System.out.println(sc.findSecondmax(arr));
	}

}
