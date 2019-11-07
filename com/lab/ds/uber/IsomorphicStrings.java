package com.lab.ds.uber;
import java.util.Map;
import java.util.HashMap;


/**

Leetcode #205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

Example 3:

Input: s = "paper", t = "title"
Output: true

Note:
You may assume both s and t have the same length.

**/

public class IsomorphicStrings {
	public static void main(String[] args) {
		IsomorphicStrings is = new IsomorphicStrings();
		System.out.println(is.isIsomorphic("egg", "add"));
		System.out.println(is.isIsomorphic("foo", "bar"));
		System.out.println(is.isIsomorphic("paper", "title"));
	}
	public boolean isIsomorphic(String s, String t) {
       HashMap<Character, Character> table = new HashMap<Character, Character>();
    	for(int i = 0; i < s.length(); i++){
        	if (!table.containsKey(s.charAt(i))){
            		if(table.containsValue(t.charAt(i))){
                		return false;
            		}
            		table.put(s.charAt(i), t.charAt(i));
        	} else {
            		if (t.charAt(i) != table.get(s.charAt(i))){
                		return false;
            		}
    		}        
   	}
   	return true; 
	}
}
