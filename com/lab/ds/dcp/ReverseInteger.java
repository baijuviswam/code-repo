package com.lab.ds.dcp;

/**

Daily Coding Problem: Problem #202 [Easy]


This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome. For example, 121 is a palindrome, as well as 888. 678 is not a palindrome. Do not convert the integer into a string.

**/

public class ReverseInteger{
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int num = Integer.MIN_VALUE;
		System.out.println("Number :"+num);
		System.out.println("Reversed :"+ri.reverseInt(num));
	}
	public long reverseInt(int num){
		long reversedInt = 0;
		while(num!=0){
			reversedInt = reversedInt *10 + num%10;	
			num=num/10;
		}
		return reversedInt;
	}
}