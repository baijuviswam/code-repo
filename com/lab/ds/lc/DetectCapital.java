package com.lab.ds.lc;


/**

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False

**/


public class DetectCapital {
	public static void main(String[] args) {
		DetectCapital dc = new DetectCapital();
		String word = "FlaG";
		System.out.println(dc.detectCapitalUse(word));
	}
	 public boolean detectCapitalUse(String word) {
	 	if(word.toUpperCase().equals(word)) return true;
	 	if(word.toLowerCase().equals(word)) return true;
	 	String first = String.valueOf(word.charAt(0));
	 	String last = word.substring(1,word.length());
	 	String newWord = first.toUpperCase()+last.toLowerCase();
	 	if(newWord.equals(word)) 
	 			return true;
	 		else 
	 			return false;
	 }
}