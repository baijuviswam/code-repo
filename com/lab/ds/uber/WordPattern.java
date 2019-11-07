package com.lab.ds.uber;
import java.util.Map;
import java.util.HashMap;

/**

LeetCode# 290. Word Pattern.


Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false

**/


public class WordPattern {
	
	public static void main(String[] args) {
		WordPattern wp = new WordPattern();
		System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
		System.out.println(wp.wordPattern("abba", "dog cat cat fish"));
		System.out.println(wp.wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(wp.wordPattern("abba", "dog dog dog dog"));

	}

	public boolean wordPattern(String pattern, String str) {
       	String[] splitValues = str.split("\\s");
        char [] cArr = pattern.toCharArray();

        if(splitValues.length != cArr.length) return false;
        
        HashMap<Character,String> map = new HashMap<Character,String>();

        int i = 0; 
        
        for(char c : cArr){
        	String tempval = splitValues[i];
            if(map.containsKey(c)){
            	if(!tempval.equals(map.get(c))){
            		return false;
            	}
            }else{
            	if(map.containsValue(tempval)){
            		return false;
            	}else{
            		map.put(c, tempval);
            	}
            }
            ++i;
        }
        return true;
    }

}