package com.lab.ds.dcp;

public class IntegerPalindrome{
	public static void main(String[] args) {
		IntegerPalindrome ip = new IntegerPalindrome();
		long num = 10101;
		System.out.println(ip.checkPalindrome(num));
	}
	public boolean checkPalindrome(long num){
		long cpy = num;
		//reverse the digits and compare with the original. if it's same return true. 
		boolean isPalindrome = false; 
		long reversed = 0;
		while(num != 0){
			reversed = reversed * 10 + num % 10;
			num = num/10;
		}
		//System.out.println("reversed "+reversed);
		if(reversed==cpy) {
			isPalindrome =  true;
		}
		return isPalindrome;
	}
} 