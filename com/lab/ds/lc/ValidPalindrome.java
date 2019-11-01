package com.lab.ds.lc;
/**

Leetcode #125

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

**/

public class ValidPalindrome{

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome(s));
	}
	public boolean isPalindrome(String s) {
		boolean isPalindrome = true;
     	s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
     	int i =0; int j=s.length()-1;
     	char [] cArr = s.toCharArray();
     	while(i<j){
     		if(cArr[i]!=cArr[j]){
     			isPalindrome =  false;
     		}
     		++i; --j;
     	}
     	return isPalindrome;
    }
}