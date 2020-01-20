package com.lab.ds.dcp;

/**

This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome. For example, 121 is a palindrome, as well as 888. 678 is not a palindrome. 
Do not convert the integer into a string.

**/

public class IntegerPalindrome{
	public static void main(String[] args) {
		IntegerPalindrome ri = new IntegerPalindrome();
		int num = Integer.MIN_VALUE;
		//System.out.println("Number :"+num);
		System.out.println("Is Palindrome :"+ri.isPalindrom(num));
	}
	public boolean isPalindrom(int num){
		long cpy = num;
		long reversedInt = 0;
		while(num!=0){
			reversedInt = reversedInt *10 + num % 10;	
			num=num/10;
		}
		if(reversedInt == cpy) return true;
		return false;
	}
}
