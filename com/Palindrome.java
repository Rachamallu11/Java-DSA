package com.demo.com;

public class Palindrome {
	
	public boolean isPalindrome(String word) {
		char[] arr = word.toCharArray();
		
		int start = 0;
		int end = word.length()-1;
		
		while(start<end) {
			if(arr[start]!= arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome pp = new Palindrome();

		if(pp.isPalindrome("that")) {
			System.out.println("this is palindrome.....");
		}else {
			System.out.println("this is not palindrome....");
		}
	}

}
